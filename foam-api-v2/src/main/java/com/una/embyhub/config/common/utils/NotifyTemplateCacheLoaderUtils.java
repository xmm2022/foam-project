/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  jakarta.annotation.PostConstruct
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.mapper.NotifyTemplateMapper;
import com.una.embyhub.model.entity.NotifyTemplate;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class NotifyTemplateCacheLoaderUtils {
    private static final String COMMON_CHANNEL = "common";
    private static final String REDIS_KEY = "notify:template";
    @Autowired
    private NotifyTemplateMapper notifyTemplateMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostConstruct
    public void init() {
        this.refreshCache();
    }

    public void refreshCache() {
        List templates = ((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.notifyTemplateMapper).eq(NotifyTemplate::getEnabled, (Object)1)).list();
        HashMap<String, String> temp = new HashMap<String, String>();
        for (NotifyTemplate template : templates) {
            String channel = StringUtils.hasText((String)template.getChannelType()) ? template.getChannelType() : COMMON_CHANNEL;
            temp.put(this.buildKey(template.getTemplateCode(), channel), template.getTemplateContent());
        }
        this.redisTemplate.delete((Object)REDIS_KEY);
        if (!temp.isEmpty()) {
            this.redisTemplate.opsForHash().putAll((Object)REDIS_KEY, temp);
        }
    }

    public String getTemplateContent(String templateCode, String channelType) {
        if (!StringUtils.hasText((String)templateCode)) {
            return null;
        }
        String channel = StringUtils.hasText((String)channelType) ? channelType : COMMON_CHANNEL;
        Object template = this.redisTemplate.opsForHash().get((Object)REDIS_KEY, (Object)this.buildKey(templateCode, channel));
        if (template == null) {
            template = this.redisTemplate.opsForHash().get((Object)REDIS_KEY, (Object)this.buildKey(templateCode, COMMON_CHANNEL));
        }
        return template != null ? template.toString() : null;
    }

    private String buildKey(String templateCode, String channelType) {
        return templateCode + "::" + (StringUtils.hasText((String)channelType) ? channelType : COMMON_CHANNEL);
    }
}
