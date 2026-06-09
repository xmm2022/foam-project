/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  jakarta.annotation.PostConstruct
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.common.utils;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.model.entity.SystemConfig;
import com.una.embyhub.service.SystemConfigService;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConfigCacheLoaderUtils {
    @Autowired
    private SystemConfigService systemConfigService;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private static final String REDIS_KEY = "system:config";

    @PostConstruct
    public void init() {
        this.loadConfigCache();
    }

    public void loadConfigCache() {
        List systemConfigList = ((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.systemConfigService.getBaseMapper()).eq(SystemConfig::getIsEnabled, (Object)1)).list();
        HashMap tempCache = new HashMap();
        systemConfigList.forEach(config -> tempCache.put(config.getConfigKey(), config.getConfigValue()));
        this.redisTemplate.delete((Object)REDIS_KEY);
        if (!tempCache.isEmpty()) {
            this.redisTemplate.opsForHash().putAll((Object)REDIS_KEY, tempCache);
        }
    }

    public String getConfigValue(String key) {
        Object value = this.redisTemplate.opsForHash().get((Object)REDIS_KEY, (Object)key);
        return value != null ? value.toString() : null;
    }

    public Map<String, String> getAllConfigs() {
        Map entries = this.redisTemplate.opsForHash().entries((Object)REDIS_KEY);
        HashMap<String, String> result = new HashMap<String, String>();
        entries.forEach((k, v) -> result.put(k.toString(), v.toString()));
        return result;
    }

    public void refreshCache() {
        this.loadConfigCache();
    }
}
