/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  com.baomidou.mybatisplus.core.conditions.Wrapper
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  embyclient.ApiException
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.common.utils.NotifyUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.mapper.UserOauthBindingMapper;
import com.una.embyhub.model.dto.request.embyuser.DisableUserRequest;
import com.una.embyhub.model.dto.request.telegram.SendMessageRequest;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.UserOauthBinding;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.LicenseService;
import com.una.embyhub.service.RoseUserBindingService;
import embyclient.ApiException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

@Configuration
@EnableScheduling
public class EmbyUserExpirationJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyUserExpirationJob.class);
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private NotifyUtils notifyUtils;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;
    @Autowired
    private EmbyInfoService embyInfoService;
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;
    @Autowired
    private UserOauthBindingMapper userOauthBindingMapper;
    @Autowired
    private RoseUserBindingService roseUserBindingService;
    @Autowired
    private LicenseService licenseService;

    @Scheduled(cron="0 0 * * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u7528\u6237\u5230\u671f\u7981\u7528\u4efb\u52a1", remark="\u7528\u6237\u5230\u671f\u7981\u7528\u4f1a\u63d0\u9192\u7ba1\u7406\u5458")
    public void configureTasksDisableUser() {
        log.info("\u7528\u6237\u8fc7\u671f\u7981\u7528\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        if (!this.hasValidLicense("\u7528\u6237\u5230\u671f\u7981\u7528\u4efb\u52a1")) {
            return;
        }
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs = this.embyInfoCacheManager.getEnabledConfigs();
        if (serverConfigs.isEmpty()) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            List embyUserList = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getUserStatus, (Object)0)).ne(EmbyUser::getIsAdmin, (Object)1)).and(wrapper -> ((LambdaQueryWrapper)((LambdaQueryWrapper)wrapper.ne(EmbyUser::getHostLineType, (Object)HostLineTypeEnum.WHITELIST.getCode())).or()).isNull(EmbyUser::getHostLineType))).eq(serverConfig.id() != null, EmbyUser::getEmbyInfoId, (Object)serverConfig.id())).isNull(serverConfig.id() == null, EmbyUser::getEmbyInfoId)).list();
            for (EmbyUser embyUser : embyUserList) {
                if (embyUser.getExpirationDate() == null || !embyUser.getExpirationDate().before(new Date())) continue;
                log.info("\u7528\u6237\u8fc7\u671f\u7981\u7528\uff1a{}", (Object)embyUser.getEmbyUserName());
                DisableUserRequest disableUserRequest = new DisableUserRequest();
                disableUserRequest.setEmbyUserId(embyUser.getEmbyUserId());
                this.embyUserService.disableUser(disableUserRequest);
                HashMap<String, String> extras = new HashMap<String, String>();
                extras.put("userName", embyUser.getEmbyUserName());
                extras.put("reason", "\u8fc7\u671f");
                SendMessageRequest sendMessageRequest = new SendMessageRequest();
                sendMessageRequest.setParseMode("Markdown");
                sendMessageRequest.setName("Emby\u7528\u6237\u8fc7\u671f\u7981\u7528\u63d0\u9192");
                sendMessageRequest.setServerUrl(this.resolveServerUrl(serverConfig));
                sendMessageRequest.setServerName(this.resolveServerName(serverConfig));
                sendMessageRequest.setExtraVariables(extras);
                this.notifyUtils.sendMultiChannel(sendMessageRequest, "user_disabled", false, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
                log.info("\u7528\u6237\u7981\u7528\u6210\u529f\uff1a{}", (Object)embyUser.getEmbyUserName());
            }
        }
    }

    @Scheduled(cron="0 0 * * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u7528\u6237\u5230\u671f\u5220\u9664\u4efb\u52a1", remark="\u7528\u6237\u5230\u671f\u67e5\u8be2\u662f\u5426\u9700\u8981\u5220\u9664\u4efb\u52a1")
    public void configureTasksRemoveUser() throws ApiException {
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs;
        log.info("\u7528\u6237\u8fc7\u671f\u5220\u9664\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        if (!this.hasValidLicense("\u7528\u6237\u5230\u671f\u5220\u9664\u4efb\u52a1")) {
            return;
        }
        String daysExpired = this.configCacheLoaderUtils.getConfigValue("days_expired");
        Long days = 0L;
        if (StringUtils.hasText((String)daysExpired)) {
            days = Long.parseLong(daysExpired);
        }
        if ((serverConfigs = this.embyInfoCacheManager.getEnabledConfigs()).isEmpty()) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            List embyUserList = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getUserStatus, (Object)1)).ne(EmbyUser::getIsAdmin, (Object)1)).and(wrapper -> ((LambdaQueryWrapper)((LambdaQueryWrapper)wrapper.ne(EmbyUser::getHostLineType, (Object)HostLineTypeEnum.WHITELIST.getCode())).or()).isNull(EmbyUser::getHostLineType))).eq(serverConfig.id() != null, EmbyUser::getEmbyInfoId, (Object)serverConfig.id())).isNull(serverConfig.id() == null, EmbyUser::getEmbyInfoId)).list();
            for (EmbyUser embyUser : embyUserList) {
                if (embyUser.getExpirationDate() == null || !new Date().after(embyUser.getExpirationDate()) || days > 0L && DateUtil.betweenDay((Date)embyUser.getExpirationDate(), (Date)new Date(), (boolean)true) <= days) continue;
                log.info("\u7528\u6237\u8fc7\u671f\u5220\u9664\uff1a{}", (Object)embyUser.getEmbyUserName());
                this.userOauthBindingMapper.delete((Wrapper)new LambdaQueryWrapper().eq(UserOauthBinding::getUserId, (Object)embyUser.getId()));
                SendMessageRequest sendMessageRequest = new SendMessageRequest();
                HashMap<String, String> extras = new HashMap<String, String>();
                extras.put("userName", embyUser.getEmbyUserName());
                extras.put("reason", "\u8fc7\u671f");
                sendMessageRequest.setParseMode("Markdown");
                sendMessageRequest.setName("Emby\u7528\u6237\u8fc7\u671f\u5220\u9664\u63d0\u9192");
                sendMessageRequest.setServerUrl(this.resolveServerUrl(serverConfig));
                sendMessageRequest.setServerName(this.resolveServerName(serverConfig));
                sendMessageRequest.setExtraVariables(extras);
                this.notifyUtils.sendMultiChannel(sendMessageRequest, "user_deleted", false, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
                try {
                    this.roseUserBindingService.unbindExpiredUserIfBoundAsync(embyUser);
                }
                catch (Exception e) {
                    log.warn("Rose\u5230\u671f\u5220\u9664\u81ea\u52a8\u89e3\u7ed1\u89e6\u53d1\u5931\u8d25\uff0c\u4e0d\u5f71\u54cd\u7528\u6237\u5220\u9664\u4e3b\u6d41\u7a0b\uff1auserId={}, embyUserName={}, error={}", new Object[]{embyUser.getId(), embyUser.getEmbyUserName(), e.getMessage()});
                }
                this.embyUserService.deleteByUserId(Collections.singletonList(embyUser.getId()));
                log.info("\u7528\u6237\u5220\u9664\u6210\u529f\uff1a{}", (Object)embyUser.getEmbyUserName());
            }
        }
    }

    @Scheduled(cron="0 30 4 * * ?", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u7528\u6237\u72b6\u6001\u4e00\u81f4\u6027\u68c0\u67e5", remark="\u53cd\u5411\u5bf9\u8d26\uff1a\u7981\u7528\u672c\u5730\u5df2\u7981\u7528\u4f46Emby\u672a\u7981\u7528\u7684\u7528\u6237")
    public void configureTasksSyncUserStatusConsistency() {
        log.info("\u5f00\u59cb\u6267\u884c\u7528\u6237\u72b6\u6001\u4e00\u81f4\u6027\u68c0\u67e5\u4efb\u52a1...");
        int fixedCount = this.embyUserService.syncUserStatusConsistency();
        log.info("\u7528\u6237\u72b6\u6001\u4e00\u81f4\u6027\u68c0\u67e5\u4efb\u52a1\u5b8c\u6210\uff0c\u4fee\u590d\u7528\u6237\u6570\u91cf\uff1a{}", (Object)fixedCount);
    }

    private String getServerLabel(Long embyInfoId) {
        if (embyInfoId == null) {
            return "\u9ed8\u8ba4\u670d\u52a1\u5668";
        }
        return this.embyInfoService.getById(embyInfoId) != null ? ((EmbyInfo)this.embyInfoService.getById(embyInfoId)).getEmbyUrl() : "\u9ed8\u8ba4\u670d\u52a1\u5668";
    }

    private String getServerLabel(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        if (serverConfig == null) {
            return "\u9ed8\u8ba4\u670d\u52a1\u5668";
        }
        if (serverConfig.id() != null) {
            return this.getServerLabel(serverConfig.id());
        }
        return StringUtils.hasText((String)serverConfig.url()) ? serverConfig.url() : "\u9ed8\u8ba4\u670d\u52a1\u5668";
    }

    private String getServerUrl(Long embyInfoId) {
        if (embyInfoId == null) {
            return null;
        }
        EmbyInfo embyInfo = (EmbyInfo)this.embyInfoService.getById(embyInfoId);
        if (embyInfo == null) {
            return null;
        }
        String embyUrl = embyInfo.getEmbyUrl();
        if (StringUtils.hasText((String)embyUrl) && (embyUrl.startsWith("http://") || embyUrl.startsWith("https://"))) {
            return embyUrl;
        }
        StringBuilder baseUrl = new StringBuilder();
        if (StringUtils.hasText((String)embyInfo.getEmbyAgreement())) {
            baseUrl.append(embyInfo.getEmbyAgreement()).append("://");
        }
        if (StringUtils.hasText((String)embyInfo.getEmbyUrl())) {
            baseUrl.append(embyInfo.getEmbyUrl());
        }
        if (StringUtils.hasText((String)embyInfo.getEmbyPort())) {
            if (embyInfo.getEmbyUrl() != null && !embyInfo.getEmbyUrl().contains(":")) {
                baseUrl.append(":");
            }
            baseUrl.append(embyInfo.getEmbyPort());
        }
        return baseUrl.length() > 0 ? baseUrl.toString() : null;
    }

    private String resolveServerName(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        EmbyInfo embyInfo;
        if (serverConfig == null) {
            return "\u672a\u77e5\u670d\u52a1\u5668";
        }
        if (StringUtils.hasText((String)serverConfig.serverName())) {
            return serverConfig.serverName();
        }
        if (serverConfig.id() != null && (embyInfo = (EmbyInfo)this.embyInfoService.getById(serverConfig.id())) != null && StringUtils.hasText((String)embyInfo.getServerName())) {
            return embyInfo.getServerName();
        }
        if (StringUtils.hasText((String)serverConfig.url())) {
            return serverConfig.url();
        }
        return "\u672a\u77e5\u670d\u52a1\u5668";
    }

    private String resolveServerUrl(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        if (serverConfig == null) {
            return null;
        }
        String configUrl = serverConfig.url();
        if (StringUtils.hasText((String)configUrl) && (configUrl.startsWith("http://") || configUrl.startsWith("https://"))) {
            return configUrl;
        }
        if (Objects.nonNull(serverConfig.id())) {
            return this.getServerUrl(serverConfig.id());
        }
        return configUrl;
    }

    private boolean hasValidLicense(String taskName) {
        if (this.licenseService.hasValidLicense()) {
            return true;
        }
        log.warn("{}\u8df3\u8fc7\uff1a\u6388\u6743\u7801\u672a\u6fc0\u6d3b\u6216\u672c\u5730\u6388\u6743\u72b6\u6001\u65e0\u6548", (Object)taskName);
        return false;
    }
}
