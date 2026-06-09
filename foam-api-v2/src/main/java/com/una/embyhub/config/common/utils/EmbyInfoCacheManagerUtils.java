/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.fasterxml.jackson.annotation.JsonTypeInfo
 *  com.fasterxml.jackson.annotation.JsonTypeInfo$Id
 *  embyclient.ApiClient
 *  embyclient.Configuration
 *  embyclient.auth.ApiKeyAuth
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.foam.properties.EmbyProperties;
import com.una.embyhub.mapper.EmbyInfoMapper;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import embyclient.ApiClient;
import embyclient.Configuration;
import embyclient.auth.ApiKeyAuth;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class EmbyInfoCacheManagerUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyInfoCacheManagerUtils.class);
    private final EmbyInfoMapper embyInfoMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private EmbyProperties embyProperties;
    private static final String KEY_ACTIVE_CONFIG = "emby:config:active";
    private static final String KEY_ADMIN_CONFIGS = "emby:config:admin_list";
    private static final String KEY_ENABLED_CONFIGS = "emby:config:enabled_list";
    private static final String KEY_PREFIX_ID = "emby:config:id:";
    private static final String KEY_PREFIX_SERVER_ID = "emby:config:serverid:";

    public EmbyInfoCacheManagerUtils(EmbyInfoMapper embyInfoMapper) {
        this.embyInfoMapper = embyInfoMapper;
    }

    private Object safeGetFromRedis(String key) {
        try {
            return this.redisTemplate.opsForValue().get((Object)key);
        }
        catch (Exception e) {
            LoggerFactory.getLogger(EmbyInfoCacheManagerUtils.class).warn("Redis read failed for key: " + key + ", treating as cache miss. Error: " + e.getMessage());
            return null;
        }
    }

    public EmbyServerConfig getConfig() {
        EmbyServerConfig config = (EmbyServerConfig)this.safeGetFromRedis(KEY_ACTIVE_CONFIG);
        if (config == null && (config = this.loadConfig()) != null) {
            this.redisTemplate.opsForValue().set((Object)KEY_ACTIVE_CONFIG, (Object)config);
        }
        return config;
    }

    public EmbyServerConfig getConfig(EmbyUser embyUser) {
        if (embyUser == null) {
            return this.getConfig();
        }
        if (embyUser.getIsAdmin() != null && embyUser.getIsAdmin() == 1) {
            List<EmbyServerConfig> adminConfigs = this.getAdminConfigs();
            if (!adminConfigs.isEmpty()) {
                return adminConfigs.get(0);
            }
            return this.getConfig();
        }
        Long embyInfoId = embyUser.getEmbyInfoId();
        if (embyInfoId == null) {
            return this.getConfig();
        }
        String key = KEY_PREFIX_ID + embyInfoId;
        EmbyServerConfig config = (EmbyServerConfig)this.safeGetFromRedis(key);
        if (config == null && (config = this.loadConfigById(embyInfoId)) != null) {
            this.redisTemplate.opsForValue().set((Object)key, (Object)config);
        }
        return config != null ? config : this.getConfig();
    }

    public EmbyServerConfig getRequiredConfig() {
        EmbyServerConfig config = this.getConfig();
        if (config == null || !StringUtils.hasText((String)config.url()) || !StringUtils.hasText((String)config.apiKey())) {
            throw new BizException(ResponseStatusEnum.EMBY_SERVER_NOT_CONFIGURED);
        }
        return config;
    }

    public EmbyServerConfig getRequiredConfig(EmbyUser embyUser) {
        EmbyServerConfig config = this.getConfig(embyUser);
        if (config == null || !StringUtils.hasText((String)config.url()) || !StringUtils.hasText((String)config.apiKey())) {
            throw new BizException(ResponseStatusEnum.EMBY_SERVER_NOT_CONFIGURED);
        }
        return config;
    }

    public EmbyServerConfig getRequiredConfigByServerId(String serverId) {
        EmbyServerConfig config = this.getConfigByServerId(serverId);
        if (config == null || !StringUtils.hasText((String)config.url()) || !StringUtils.hasText((String)config.apiKey())) {
            throw new BizException(ResponseStatusEnum.EMBY_SERVER_NOT_CONFIGURED);
        }
        return config;
    }

    public EmbyServerConfig getConfigByServerId(String serverId) {
        if (!StringUtils.hasText((String)serverId)) {
            return null;
        }
        String key = KEY_PREFIX_SERVER_ID + serverId;
        EmbyServerConfig config = (EmbyServerConfig)this.safeGetFromRedis(key);
        if (config == null && (config = this.loadConfigByServerId(serverId)) != null) {
            this.redisTemplate.opsForValue().set((Object)key, (Object)config);
        }
        return config;
    }

    public List<EmbyServerConfig> getAdminConfigs() {
        List<EmbyServerConfig> configs = (List<EmbyServerConfig>)this.safeGetFromRedis(KEY_ADMIN_CONFIGS);
        if (configs == null) {
            configs = this.loadAdminConfigs();
            if (configs != null) {
                this.redisTemplate.opsForValue().set((Object)KEY_ADMIN_CONFIGS, configs);
            } else {
                configs = Collections.emptyList();
            }
        }
        return configs;
    }

    public List<EmbyServerConfig> getEnabledConfigs() {
        List<EmbyServerConfig> configs = (List<EmbyServerConfig>)this.safeGetFromRedis(KEY_ENABLED_CONFIGS);
        if (configs == null) {
            configs = this.loadEnabledConfigs();
            if (configs != null) {
                this.redisTemplate.opsForValue().set((Object)KEY_ENABLED_CONFIGS, configs);
            } else {
                configs = Collections.emptyList();
            }
        }
        return configs;
    }

    public EmbyServerConfig getRequiredConfigById(Long embyInfoId) {
        if (embyInfoId == null) {
            return this.getRequiredConfig();
        }
        EmbyServerConfig config = this.loadConfigById(embyInfoId);
        if (config == null || !StringUtils.hasText((String)config.url()) || !StringUtils.hasText((String)config.apiKey())) {
            throw new BizException(ResponseStatusEnum.EMBY_SERVER_NOT_CONFIGURED);
        }
        return config;
    }

    public void refresh() {
        Set keys = this.redisTemplate.keys((Object)"emby:config:*");
        if (keys != null && !keys.isEmpty()) {
            this.redisTemplate.delete((Collection)keys);
        }
    }

    public void applyTo(ApiClient apiClient) {
        if (apiClient == null) {
            return;
        }
        EmbyServerConfig config = this.getConfig();
        this.applyTo(apiClient, config);
    }

    public void applyTo(ApiClient apiClient, EmbyServerConfig config) {
        if (apiClient == null || config == null) {
            return;
        }
        apiClient.setBasePath(config.url());
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth)apiClient.getAuthentication("apikeyauth");
        if (apiKeyAuth != null) {
            apiKeyAuth.setApiKey(config.apiKey());
        }
        Configuration.setDefaultApiClient((ApiClient)apiClient);
    }

    private EmbyServerConfig loadConfig() {
        EmbyInfo embyInfo = (EmbyInfo)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.embyInfoMapper).eq(EmbyInfo::getEnabled, (Object)1)).eq(BaseEntity::getDelFlag, (Object)0)).eq(EmbyInfo::getStatus, (Object)0)).eq(EmbyInfo::getSpread, (Object)1)).last("limit 1")).one();
        if (embyInfo == null) {
            embyInfo = new EmbyInfo();
        }
        return new EmbyServerConfig(embyInfo.getId(), embyInfo.getEmbyUrl(), embyInfo.getEmbyApikey(), embyInfo.getCopyfromuserid(), embyInfo.getServerName(), embyInfo.getAdminQueryUserid());
    }

    private List<EmbyServerConfig> loadAdminConfigs() {
        List embyInfos = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.embyInfoMapper).eq(EmbyInfo::getEnabled, (Object)1)).eq(BaseEntity::getDelFlag, (Object)0)).eq(EmbyInfo::getStatus, (Object)0)).eq(EmbyInfo::getSpread, (Object)1)).list();
        if (embyInfos == null || embyInfos.isEmpty()) {
            return Collections.emptyList();
        }
        return embyInfos.stream().map(info -> new EmbyServerConfig(info.getId(), info.getEmbyUrl(), info.getEmbyApikey(), info.getCopyfromuserid(), info.getServerName(), info.getAdminQueryUserid())).collect(Collectors.toList());
    }

    private List<EmbyServerConfig> loadEnabledConfigs() {
        List embyInfos = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.embyInfoMapper).eq(EmbyInfo::getEnabled, (Object)1)).eq(BaseEntity::getDelFlag, (Object)0)).eq(EmbyInfo::getStatus, (Object)0)).list();
        if (embyInfos == null || embyInfos.isEmpty()) {
            return Collections.emptyList();
        }
        return embyInfos.stream().map(info -> new EmbyServerConfig(info.getId(), info.getEmbyUrl(), info.getEmbyApikey(), info.getCopyfromuserid(), info.getServerName(), info.getAdminQueryUserid())).collect(Collectors.toList());
    }

    private EmbyServerConfig loadConfigById(Long embyInfoId) {
        EmbyInfo embyInfo = (EmbyInfo)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.embyInfoMapper).eq(EmbyInfo::getEnabled, (Object)1)).eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).eq(EmbyInfo::getId, (Object)embyInfoId)).last("limit 1")).one();
        if (embyInfo == null) {
            return null;
        }
        return new EmbyServerConfig(embyInfo.getId(), embyInfo.getEmbyUrl(), embyInfo.getEmbyApikey(), embyInfo.getCopyfromuserid(), embyInfo.getServerName(), embyInfo.getAdminQueryUserid());
    }

    private EmbyServerConfig loadConfigByServerId(String serverId) {
        EmbyInfo embyInfo = (EmbyInfo)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.embyInfoMapper).eq(EmbyInfo::getEnabled, (Object)1)).eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).eq(EmbyInfo::getEmbyServerId, (Object)serverId)).last("limit 1")).one();
        if (embyInfo == null) {
            return null;
        }
        return new EmbyServerConfig(embyInfo.getId(), embyInfo.getEmbyUrl(), embyInfo.getEmbyApikey(), embyInfo.getCopyfromuserid(), embyInfo.getServerName(), embyInfo.getAdminQueryUserid());
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS)
    public record EmbyServerConfig(Long id, String url, String apiKey, String copyfromuserid, String serverName, String adminQueryUserid) implements Serializable
    {
    }
}
