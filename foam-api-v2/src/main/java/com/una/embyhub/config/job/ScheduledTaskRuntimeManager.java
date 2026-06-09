/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.aop.support.AopUtils
 *  org.springframework.boot.context.event.ApplicationReadyEvent
 *  org.springframework.context.event.EventListener
 *  org.springframework.core.annotation.AnnotatedElementUtils
 *  org.springframework.data.redis.core.StringRedisTemplate
 *  org.springframework.scheduling.TaskScheduler
 *  org.springframework.scheduling.Trigger
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.scheduling.config.CronTask
 *  org.springframework.scheduling.config.ScheduledTask
 *  org.springframework.scheduling.config.ScheduledTaskHolder
 *  org.springframework.scheduling.config.Task
 *  org.springframework.scheduling.support.CronExpression
 *  org.springframework.scheduling.support.CronTrigger
 *  org.springframework.scheduling.support.ScheduledMethodRunnable
 *  org.springframework.stereotype.Service
 */
package com.una.embyhub.config.job;

import com.una.embyhub.config.job.ScheduledTaskMeta;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.scheduling.config.ScheduledTaskHolder;
import org.springframework.scheduling.config.Task;
import org.springframework.scheduling.support.CronExpression;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.scheduling.support.ScheduledMethodRunnable;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskRuntimeManager {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(ScheduledTaskRuntimeManager.class);
    private static final String REDIS_CRON_OVERRIDE_HASH_KEY = "scheduled:cron:overrides";
    private final ScheduledTaskHolder taskHolder;
    private final TaskScheduler taskScheduler;
    private final StringRedisTemplate stringRedisTemplate;
    private final ConcurrentMap<String, String> cronOverrides = new ConcurrentHashMap<String, String>();
    private final ConcurrentMap<String, RuntimeCronTask> runtimeCronTasks = new ConcurrentHashMap<String, RuntimeCronTask>();

    public ScheduledTaskRuntimeManager(ScheduledTaskHolder taskHolder, TaskScheduler taskScheduler, StringRedisTemplate stringRedisTemplate) {
        this.taskHolder = taskHolder;
        this.taskScheduler = taskScheduler;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @EventListener(value={ApplicationReadyEvent.class})
    public synchronized void restoreCronOverrides() {
        try {
            Map entries = this.stringRedisTemplate.opsForHash().entries((Object)REDIS_CRON_OVERRIDE_HASH_KEY);
            if (entries == null || entries.isEmpty()) {
                return;
            }
            for (Map.Entry entry : entries.entrySet()) {
                String taskKey = Objects.toString(entry.getKey(), "").trim();
                String cron = Objects.toString(entry.getValue(), "").trim();
                if (taskKey.isBlank() || cron.isBlank()) continue;
                try {
                    this.applyCronByTaskKey(taskKey, cron);
                    this.cronOverrides.put(taskKey, cron);
                    log.info("\u5df2\u6062\u590d\u5b9a\u65f6\u4efb\u52a1cron\u8986\u76d6: {} -> {}", (Object)taskKey, (Object)cron);
                }
                catch (Exception ex) {
                    log.warn("\u6062\u590d\u5b9a\u65f6\u4efb\u52a1cron\u8986\u76d6\u5931\u8d25: {} -> {}, reason={}", new Object[]{taskKey, cron, ex.getMessage()});
                }
            }
        }
        catch (Exception ex) {
            log.warn("\u8bfb\u53d6Redis\u4e2d\u7684\u5b9a\u65f6\u4efb\u52a1cron\u8986\u76d6\u5931\u8d25: {}", (Object)ex.getMessage());
        }
    }

    public synchronized void updateCron(String key, String cron) {
        String normalizedInput = this.normalizeRequired(key, "\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a");
        String normalizedCron = this.normalizeRequired(cron, "Cron\u8868\u8fbe\u5f0f\u4e0d\u80fd\u4e3a\u7a7a");
        try {
            CronExpression.parse((String)normalizedCron);
        }
        catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Cron\u8868\u8fbe\u5f0f\u65e0\u6548: " + normalizedCron);
        }
        String taskKey = this.resolveTaskKey(normalizedInput);
        this.applyCronByTaskKey(taskKey, normalizedCron);
        this.cronOverrides.put(taskKey, normalizedCron);
        this.stringRedisTemplate.opsForHash().put((Object)REDIS_CRON_OVERRIDE_HASH_KEY, (Object)taskKey, (Object)normalizedCron);
    }

    public synchronized void resetCron(String key) {
        String normalizedInput = this.normalizeRequired(key, "\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a");
        String taskKey = this.resolveTaskKey(normalizedInput);
        this.resetCronByTaskKey(taskKey);
    }

    public synchronized void resetCronBatch(List<String> keys) {
        if (keys == null || keys.isEmpty()) {
            throw new IllegalArgumentException("\u4efb\u52a1\u6807\u8bc6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a");
        }
        List<String> taskKeys = keys.stream().map(key -> this.normalizeRequired((String)key, "\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a")).map(this::resolveTaskKey).distinct().toList();
        for (String taskKey : taskKeys) {
            this.resetCronByTaskKey(taskKey);
        }
    }

    public synchronized void resetCronAll() {
        Set<String> taskKeys = this.listPersistedOverrideTaskKeys();
        for (String taskKey : taskKeys) {
            try {
                this.resetCronByTaskKey(taskKey);
            }
            catch (Exception ex) {
                this.cronOverrides.remove(taskKey);
                try {
                    this.stringRedisTemplate.opsForHash().delete((Object)REDIS_CRON_OVERRIDE_HASH_KEY, new Object[]{taskKey});
                }
                catch (Exception exception) {
                    // empty catch block
                }
                log.warn("\u6062\u590d\u4efb\u52a1\u9ed8\u8ba4cron\u5931\u8d25\uff0c\u5df2\u6e05\u7406\u8986\u76d6: {}, reason={}", (Object)taskKey, (Object)ex.getMessage());
            }
        }
    }

    public synchronized void runNow(String key) {
        String normalizedInput = this.normalizeRequired(key, "\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a");
        String taskKey = this.resolveTaskKey(normalizedInput);
        RuntimeCronTask runtimeTask = (RuntimeCronTask)this.runtimeCronTasks.get(taskKey);
        Runnable runnable = runtimeTask != null ? runtimeTask.runnable() : this.findCronTaskBindingByKey(taskKey).runnable();
        ScheduledFuture future = this.taskScheduler.schedule(runnable, Instant.now());
        if (future == null) {
            throw new IllegalStateException("\u89e6\u53d1\u4efb\u52a1\u7acb\u5373\u6267\u884c\u5931\u8d25: " + taskKey);
        }
    }

    public String getEffectiveCron(String key, String defaultCron) {
        if (key == null || key.isBlank()) {
            return defaultCron;
        }
        return this.cronOverrides.getOrDefault(key, defaultCron);
    }

    private void resetCronByTaskKey(String taskKey) {
        CronTaskBinding binding = this.findCronTaskBindingByKey(taskKey);
        this.applyCronByTaskKey(taskKey, binding.defaultCron());
        this.cronOverrides.remove(taskKey);
        this.stringRedisTemplate.opsForHash().delete((Object)REDIS_CRON_OVERRIDE_HASH_KEY, new Object[]{taskKey});
    }

    private void applyCronByTaskKey(String taskKey, String cron) {
        ZoneId zone;
        Runnable runnable;
        RuntimeCronTask runtimeTask = (RuntimeCronTask)this.runtimeCronTasks.get(taskKey);
        if (runtimeTask == null) {
            CronTaskBinding binding = this.findCronTaskBindingByKey(taskKey);
            binding.scheduledTask().cancel(false);
            runnable = binding.runnable();
            zone = binding.zone();
        } else {
            runtimeTask.cancel();
            runnable = runtimeTask.runnable();
            zone = runtimeTask.zone();
        }
        ScheduledFuture future = this.taskScheduler.schedule(runnable, (Trigger)new CronTrigger(cron, zone));
        if (future == null) {
            throw new IllegalStateException("\u91cd\u5efa\u5b9a\u65f6\u4efb\u52a1\u5931\u8d25: " + taskKey);
        }
        this.runtimeCronTasks.put(taskKey, new RuntimeCronTask(runnable, zone, future));
    }

    private String resolveTaskKey(String keyOrName) {
        CronTaskBinding byKey = this.findCronTaskBindingByKeyOrNull(keyOrName);
        if (byKey != null) {
            return byKey.key();
        }
        List<CronTaskBinding> byName = this.listCronTaskBindings().stream().filter(binding -> binding.name() != null && keyOrName.equals(binding.name())).toList();
        if (byName.isEmpty()) {
            throw new IllegalArgumentException("\u672a\u627e\u5230\u5bf9\u5e94\u7684CRON\u4efb\u52a1: " + keyOrName);
        }
        if (byName.size() > 1) {
            throw new IllegalArgumentException("\u4efb\u52a1\u540d\u79f0\u5b58\u5728\u91cd\u590d\uff0c\u8bf7\u6539\u7528\u4efb\u52a1key: " + keyOrName);
        }
        return byName.get(0).key();
    }

    private CronTaskBinding findCronTaskBindingByKey(String key) {
        CronTaskBinding binding = this.findCronTaskBindingByKeyOrNull(key);
        if (binding == null) {
            throw new IllegalArgumentException("\u672a\u627e\u5230\u5bf9\u5e94\u7684CRON\u4efb\u52a1: " + key);
        }
        return binding;
    }

    private CronTaskBinding findCronTaskBindingByKeyOrNull(String key) {
        for (CronTaskBinding binding : this.listCronTaskBindings()) {
            if (!key.equals(binding.key())) continue;
            return binding;
        }
        return null;
    }

    private List<CronTaskBinding> listCronTaskBindings() {
        ArrayList<CronTaskBinding> bindings = new ArrayList<CronTaskBinding>();
        for (ScheduledTask scheduledTask : this.taskHolder.getScheduledTasks()) {
            Runnable runnable;
            ScheduledMethodRunnable smr;
            Task task = scheduledTask.getTask();
            if (!(task instanceof CronTask) || (smr = this.unwrapToSMR(runnable = task.getRunnable())) == null) continue;
            Method method = AopUtils.getMostSpecificMethod((Method)smr.getMethod(), smr.getTarget().getClass());
            Class<?> targetClass = smr.getTarget().getClass();
            String taskKey = targetClass.getName() + "#" + method.getName();
            String taskName = this.resolveTaskName(method, targetClass);
            String defaultCron = ((CronTask)task).getExpression();
            ZoneId zone = this.resolveZone(method);
            bindings.add(new CronTaskBinding(taskKey, taskName, defaultCron, scheduledTask, runnable, zone));
        }
        return bindings;
    }

    private Set<String> listPersistedOverrideTaskKeys() {
        LinkedHashSet<String> taskKeys = new LinkedHashSet<String>(this.cronOverrides.keySet());
        try {
            Set persistedKeys = this.stringRedisTemplate.opsForHash().keys((Object)REDIS_CRON_OVERRIDE_HASH_KEY);
            if (persistedKeys != null) {
                for (Object obj : persistedKeys) {
                    String key = Objects.toString(obj, "").trim();
                    if (key.isBlank()) continue;
                    taskKeys.add(key);
                }
            }
        }
        catch (Exception ex) {
            log.warn("\u8bfb\u53d6Redis\u8986\u76d6key\u5931\u8d25: {}", (Object)ex.getMessage());
        }
        return taskKeys;
    }

    private ZoneId resolveZone(Method method) {
        try {
            Scheduled sch;
            Scheduled scheduled = sch = method != null ? (Scheduled)AnnotatedElementUtils.findMergedAnnotation((AnnotatedElement)method, Scheduled.class) : null;
            if (sch != null && sch.zone() != null && !sch.zone().isBlank()) {
                return ZoneId.of(sch.zone());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return ZoneId.of("Asia/Shanghai");
    }

    private String resolveTaskName(Method method, Class<?> targetClass) {
        ScheduledTaskMeta meta;
        ScheduledTaskMeta scheduledTaskMeta = meta = method != null ? (ScheduledTaskMeta)AnnotatedElementUtils.findMergedAnnotation((AnnotatedElement)method, ScheduledTaskMeta.class) : null;
        if (meta != null && meta.name() != null && !meta.name().isBlank()) {
            return meta.name().trim();
        }
        String methodName = method != null ? method.getName() : "unknown";
        String className = targetClass != null ? targetClass.getSimpleName() : "UnknownClass";
        return className + "#" + methodName;
    }

    private ScheduledMethodRunnable unwrapToSMR(Runnable r) {
        if (r == null) {
            return null;
        }
        Set visited = Collections.newSetFromMap(new IdentityHashMap());
        while (r != null && !(r instanceof ScheduledMethodRunnable) && visited.add(r)) {
            Runnable inner = this.tryGetRunnableField(r, "delegate", "task", "runnable");
            if (inner != null) {
                r = inner;
                continue;
            }
            if (!"org.springframework.scheduling.support.ReschedulingRunnable".equals(r.getClass().getName()) || (inner = this.tryGetRunnableField(r, "task")) == null) break;
            r = inner;
        }
        return r instanceof ScheduledMethodRunnable ? (ScheduledMethodRunnable)r : null;
    }

    private Runnable tryGetRunnableField(Object obj, String ... fieldNames) {
        Class<?> c = obj.getClass();
        for (String name : fieldNames) {
            Field f = this.findFieldRecursive(c, name);
            if (f == null) continue;
            try {
                f.setAccessible(true);
                Object v = f.get(obj);
                if (!(v instanceof Runnable)) continue;
                Runnable runnable = (Runnable)v;
                return runnable;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    private Field findFieldRecursive(Class<?> c, String name) {
        for (Class<?> cur = c; cur != null && cur != Object.class; cur = cur.getSuperclass()) {
            try {
                return cur.getDeclaredField(name);
            }
            catch (NoSuchFieldException e) {
                continue;
            }
        }
        return null;
    }

    private String normalizeRequired(String value, String message) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(message);
        }
        return value.trim();
    }

    private record RuntimeCronTask(Runnable runnable, ZoneId zone, ScheduledFuture<?> future) {
        private void cancel() {
            if (this.future != null) {
                this.future.cancel(false);
            }
        }
    }

    private record CronTaskBinding(String key, String name, String defaultCron, ScheduledTask scheduledTask, Runnable runnable, ZoneId zone) {
    }
}
