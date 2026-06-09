/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  com.baomidou.mybatisplus.core.conditions.Wrapper
 *  com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
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
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.common.utils.NotifyUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.model.dto.request.telegram.SendMessageRequest;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.LicenseService;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
public class EmbyUserExpirationNotifyJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyUserExpirationNotifyJob.class);
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private NotifyUtils notifyUtils;
    @Autowired
    private EmbyInfoService embyInfoService;
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;
    @Autowired
    private LicenseService licenseService;

    @Scheduled(cron="0 0 0 * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u7528\u6237\u8fc7\u671f\u63d0\u9192\u4efb\u52a1", remark="\u7528\u6237\u8fc7\u671f\u63d0\u9192\u7ba1\u7406\u5458\u7eed\u8d39\u5b9a\u65f6\u4efb\u52a1")
    public void configureTasks() {
        log.info("\u7528\u6237\u8fc7\u671f\u63d0\u9192\u7ba1\u7406\u5458\u7eed\u8d39\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        if (!this.licenseService.hasValidLicense()) {
            log.warn("\u7528\u6237\u8fc7\u671f\u63d0\u9192\u4efb\u52a1\u8df3\u8fc7\uff1a\u6388\u6743\u7801\u672a\u6fc0\u6d3b\u6216\u672c\u5730\u6388\u6743\u72b6\u6001\u65e0\u6548");
            return;
        }
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs = this.embyInfoCacheManager.getEnabledConfigs();
        if (serverConfigs.isEmpty()) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.select((Object[])new String[]{"id", "emby_user_id", "emby_user_name", "emby_user_password", "is_admin", "user_status", "expiration_date", "create_datetime", "update_datetime", "create_user_name", "update_user_name", "update_user_id", "create_user_id", "del_flag", "DATEDIFF(expiration_date, CURRENT_TIMESTAMP()) as expireDateCount", "remarks"});
            queryWrapper.eq(serverConfig.id() != null, (Object)"emby_info_id", (Object)serverConfig.id());
            queryWrapper.isNull(serverConfig.id() == null, (Object)"emby_info_id");
            queryWrapper.last("and DATEDIFF(expiration_date,CURRENT_TIMESTAMP()) <= 3 and DATEDIFF(expiration_date,CURRENT_TIMESTAMP()) >= 0 and user_status != 1 order by case when is_admin = 1 then 0 else 1 end, id desc");
            List embyUserList = this.embyUserService.list((Wrapper)queryWrapper);
            embyUserList.forEach(embyUser -> {
                HashMap<String, String> extras = new HashMap<String, String>();
                extras.put("userName", embyUser.getEmbyUserName());
                extras.put("expirationDate", DateUtil.formatDateTime((Date)embyUser.getExpirationDate()));
                extras.put("timeLeft", EmbyUserExpirationNotifyJob.compareTime(embyUser.getExpirationDate(), new Date()));
                SendMessageRequest sendMessageRequest = new SendMessageRequest();
                sendMessageRequest.setParseMode("Markdown");
                sendMessageRequest.setName("Emby\u7528\u6237\u8fc7\u671f\u63d0\u9192");
                sendMessageRequest.setServerUrl(this.resolveServerUrl(serverConfig));
                sendMessageRequest.setServerName(this.resolveServerName(serverConfig));
                sendMessageRequest.setExtraVariables(extras);
                this.notifyUtils.sendMultiChannel(sendMessageRequest, "user_expiration", false, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
            });
        }
    }

    public static String compareTime(Date date1, Date date2) {
        if (date1.before(date2)) {
            return "\u5df2\u7ecf\u8fc7\u671f";
        }
        long betweenMs = date1.getTime() - date2.getTime();
        long days = betweenMs / 86400000L;
        if (days > 0L) {
            return days + "\u5929";
        }
        long hours = betweenMs / 3600000L;
        if (hours > 0L) {
            return hours + "\u5c0f\u65f6";
        }
        long minutes = betweenMs / 60000L;
        if (minutes > 0L) {
            return minutes + "\u5206\u949f";
        }
        long seconds = betweenMs / 1000L;
        return seconds + "\u79d2";
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
            return null;
        }
        if (serverConfig.id() != null && (embyInfo = (EmbyInfo)this.embyInfoService.getById(serverConfig.id())) != null && StringUtils.hasText((String)embyInfo.getServerName())) {
            return embyInfo.getServerName();
        }
        return null;
    }

    private String resolveServerUrl(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        if (serverConfig == null) {
            return null;
        }
        String configUrl = serverConfig.url();
        if (StringUtils.hasText((String)configUrl) && (configUrl.startsWith("http://") || configUrl.startsWith("https://"))) {
            return configUrl;
        }
        if (serverConfig.id() != null) {
            return this.getServerUrl(serverConfig.id());
        }
        return configUrl;
    }
}
