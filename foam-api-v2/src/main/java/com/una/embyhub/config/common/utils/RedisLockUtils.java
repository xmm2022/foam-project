/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.data.redis.core.script.DefaultRedisScript
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RedisLockUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(RedisLockUtils.class);
    private final RedisTemplate<String, Object> redisTemplate;
    private static final DefaultRedisScript<Long> UNLOCK_SCRIPT = new DefaultRedisScript("if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end", Long.class);

    public String tryLock(String key, long ttlSeconds) {
        if (!StringUtils.hasText((String)key) || ttlSeconds <= 0L) {
            return null;
        }
        String token = UUID.randomUUID().toString();
        try {
            Boolean locked = this.redisTemplate.opsForValue().setIfAbsent((Object)key, (Object)token, ttlSeconds, TimeUnit.SECONDS);
            return Boolean.TRUE.equals(locked) ? token : null;
        }
        catch (Exception e) {
            log.warn("Redis \u9501\u5199\u5165\u5931\u8d25: key={}", (Object)key, (Object)e);
            throw e;
        }
    }

    public void unlock(String key, String token) {
        if (!StringUtils.hasText((String)key) || !StringUtils.hasText((String)token)) {
            return;
        }
        try {
            this.redisTemplate.execute(UNLOCK_SCRIPT, Collections.singletonList(key), new Object[]{token});
        }
        catch (Exception e) {
            log.warn("Redis \u9501\u91ca\u653e\u5931\u8d25: key={}", (Object)key, (Object)e);
        }
    }

    @Generated
    public RedisLockUtils(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
