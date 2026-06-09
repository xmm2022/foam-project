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
import com.una.embyhub.model.entity.NotifyChannel;
import com.una.embyhub.service.NotifyChannelService;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class NotifyChannelCacheLoaderUtils {
    @Autowired
    private NotifyChannelService notifyChannelService;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private static final String REDIS_KEY = "notify:channel:config";

    @PostConstruct
    public void init() {
        this.loadConfigCache();
    }

    public void loadConfigCache() {
        List notifyChannelList = ((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.notifyChannelService.getBaseMapper()).eq(NotifyChannel::getEnabled, (Object)1)).list();
        HashMap tempCache = new HashMap();
        notifyChannelList.forEach(notifyChannel -> tempCache.put(notifyChannel.getIconType(), notifyChannel.getParams()));
        this.redisTemplate.delete((Object)REDIS_KEY);
        if (!tempCache.isEmpty()) {
            this.redisTemplate.opsForHash().putAll((Object)REDIS_KEY, tempCache);
        }
    }

    public String getNotifyChannelValue(String key) {
        Object value = this.redisTemplate.opsForHash().get((Object)REDIS_KEY, (Object)key);
        return value != null ? value.toString() : null;
    }

    public Map<String, String> getAllNotifyChannels() {
        Map entries = this.redisTemplate.opsForHash().entries((Object)REDIS_KEY);
        HashMap<String, String> result = new HashMap<String, String>();
        entries.forEach((k, v) -> result.put(k.toString(), v.toString()));
        return result;
    }

    public void refreshCache() {
        this.loadConfigCache();
    }
}
