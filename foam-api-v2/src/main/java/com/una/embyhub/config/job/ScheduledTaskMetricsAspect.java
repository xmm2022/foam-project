/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.aspectj.lang.ProceedingJoinPoint
 *  org.aspectj.lang.annotation.Around
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.reflect.MethodSignature
 *  org.springframework.aop.support.AopUtils
 *  org.springframework.core.annotation.AnnotatedElementUtils
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.job;

import com.una.embyhub.config.job.ScheduledTaskMeta;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lombok.Generated;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.support.AopUtils;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ScheduledTaskMetricsAspect {
    private final ConcurrentMap<String, TaskMetric> metrics = new ConcurrentHashMap<String, TaskMetric>();

    @Around(value="@annotation(org.springframework.scheduling.annotation.Scheduled)")
    public Object record(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature sig = (MethodSignature)pjp.getSignature();
        Method methodOnProxy = sig.getMethod();
        Class<?> targetClass = pjp.getTarget().getClass();
        Method specificMethod = AopUtils.getMostSpecificMethod((Method)methodOnProxy, targetClass);
        String key = targetClass.getName() + "#" + specificMethod.getName();
        ScheduledTaskMeta meta = (ScheduledTaskMeta)AnnotatedElementUtils.findMergedAnnotation((AnnotatedElement)specificMethod, ScheduledTaskMeta.class);
        Object taskName = meta != null && !meta.name().isBlank() ? meta.name() : targetClass.getSimpleName() + "#" + specificMethod.getName();
        String taskRemark = meta != null ? meta.remark() : "";
        long start = System.currentTimeMillis();
        Date startDate = new Date(start);
        TaskMetric metric = this.metrics.computeIfAbsent(key, k -> new TaskMetric());
        metric.setTaskName((String)taskName);
        metric.setTaskRemark(taskRemark);
        metric.setLastStartTime(startDate);
        try {
            Object ret = pjp.proceed();
            long end = System.currentTimeMillis();
            metric.setLastEndTime(new Date(end));
            metric.setLastDurationMs(end - start);
            metric.setRunCount(metric.getRunCount() + 1L);
            metric.setLastError(null);
            return ret;
        }
        catch (Throwable ex) {
            long end = System.currentTimeMillis();
            metric.setLastEndTime(new Date(end));
            metric.setLastDurationMs(end - start);
            metric.setRunCount(metric.getRunCount() + 1L);
            metric.setLastError(ex.getClass().getSimpleName() + ": " + ex.getMessage());
            throw ex;
        }
    }

    public Map<String, TaskMetric> getMetrics() {
        return this.metrics;
    }

    public static class TaskMetric {
        private String taskName;
        private String taskRemark;
        private Date lastStartTime;
        private Date lastEndTime;
        private long lastDurationMs;
        private long runCount;
        private String lastError;

        @Generated
        public TaskMetric() {
        }

        @Generated
        public String getTaskName() {
            return this.taskName;
        }

        @Generated
        public String getTaskRemark() {
            return this.taskRemark;
        }

        @Generated
        public Date getLastStartTime() {
            return this.lastStartTime;
        }

        @Generated
        public Date getLastEndTime() {
            return this.lastEndTime;
        }

        @Generated
        public long getLastDurationMs() {
            return this.lastDurationMs;
        }

        @Generated
        public long getRunCount() {
            return this.runCount;
        }

        @Generated
        public String getLastError() {
            return this.lastError;
        }

        @Generated
        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        @Generated
        public void setTaskRemark(String taskRemark) {
            this.taskRemark = taskRemark;
        }

        @Generated
        public void setLastStartTime(Date lastStartTime) {
            this.lastStartTime = lastStartTime;
        }

        @Generated
        public void setLastEndTime(Date lastEndTime) {
            this.lastEndTime = lastEndTime;
        }

        @Generated
        public void setLastDurationMs(long lastDurationMs) {
            this.lastDurationMs = lastDurationMs;
        }

        @Generated
        public void setRunCount(long runCount) {
            this.runCount = runCount;
        }

        @Generated
        public void setLastError(String lastError) {
            this.lastError = lastError;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TaskMetric)) {
                return false;
            }
            TaskMetric other = (TaskMetric)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getLastDurationMs() != other.getLastDurationMs()) {
                return false;
            }
            if (this.getRunCount() != other.getRunCount()) {
                return false;
            }
            String this$taskName = this.getTaskName();
            String other$taskName = other.getTaskName();
            if (this$taskName == null ? other$taskName != null : !this$taskName.equals(other$taskName)) {
                return false;
            }
            String this$taskRemark = this.getTaskRemark();
            String other$taskRemark = other.getTaskRemark();
            if (this$taskRemark == null ? other$taskRemark != null : !this$taskRemark.equals(other$taskRemark)) {
                return false;
            }
            Date this$lastStartTime = this.getLastStartTime();
            Date other$lastStartTime = other.getLastStartTime();
            if (this$lastStartTime == null ? other$lastStartTime != null : !((Object)this$lastStartTime).equals(other$lastStartTime)) {
                return false;
            }
            Date this$lastEndTime = this.getLastEndTime();
            Date other$lastEndTime = other.getLastEndTime();
            if (this$lastEndTime == null ? other$lastEndTime != null : !((Object)this$lastEndTime).equals(other$lastEndTime)) {
                return false;
            }
            String this$lastError = this.getLastError();
            String other$lastError = other.getLastError();
            return !(this$lastError == null ? other$lastError != null : !this$lastError.equals(other$lastError));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof TaskMetric;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            long $lastDurationMs = this.getLastDurationMs();
            result = result * 59 + (int)($lastDurationMs >>> 32 ^ $lastDurationMs);
            long $runCount = this.getRunCount();
            result = result * 59 + (int)($runCount >>> 32 ^ $runCount);
            String $taskName = this.getTaskName();
            result = result * 59 + ($taskName == null ? 43 : $taskName.hashCode());
            String $taskRemark = this.getTaskRemark();
            result = result * 59 + ($taskRemark == null ? 43 : $taskRemark.hashCode());
            Date $lastStartTime = this.getLastStartTime();
            result = result * 59 + ($lastStartTime == null ? 43 : ((Object)$lastStartTime).hashCode());
            Date $lastEndTime = this.getLastEndTime();
            result = result * 59 + ($lastEndTime == null ? 43 : ((Object)$lastEndTime).hashCode());
            String $lastError = this.getLastError();
            result = result * 59 + ($lastError == null ? 43 : $lastError.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "ScheduledTaskMetricsAspect.TaskMetric(taskName=" + this.getTaskName() + ", taskRemark=" + this.getTaskRemark() + ", lastStartTime=" + String.valueOf(this.getLastStartTime()) + ", lastEndTime=" + String.valueOf(this.getLastEndTime()) + ", lastDurationMs=" + this.getLastDurationMs() + ", runCount=" + this.getRunCount() + ", lastError=" + this.getLastError() + ")";
        }
    }
}
