/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONObject
 *  com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper
 *  com.diboot.core.util.BeanUtils
 *  embyclient.ApiClient
 *  embyclient.ApiException
 *  embyclient.api.SessionsServiceApi
 *  embyclient.api.UserServiceApi
 *  embyclient.model.BaseItemDto
 *  embyclient.model.UserDto
 *  embyclient.model.UserPolicy
 *  lombok.Generated
 *  net.dreamlu.mica.ip2region.core.Ip2regionSearcher
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.job;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.diboot.core.util.BeanUtils;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.common.utils.NotifyUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.model.dto.request.telegram.SendMessageRequest;
import com.una.embyhub.model.dto.response.emby.SessionSessionInfoResponse;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.SimultaneousPlaybackRecord;
import com.una.embyhub.model.entity.SimultaneousPlaybackRecordDetail;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.SimultaneousPlaybackRecordService;
import embyclient.ApiClient;
import embyclient.ApiException;
import embyclient.api.SessionsServiceApi;
import embyclient.api.UserServiceApi;
import embyclient.model.BaseItemDto;
import embyclient.model.UserDto;
import embyclient.model.UserPolicy;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Generated;
import net.dreamlu.mica.ip2region.core.Ip2regionSearcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

@Configuration
@EnableScheduling
public class NowPlayingJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(NowPlayingJob.class);
    @Autowired
    private NotifyUtils notifyUtils;
    @Autowired
    private Ip2regionSearcher searchSearcher;
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;
    @Autowired
    private EmbyInfoService embyInfoService;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private SimultaneousPlaybackRecordService simultaneousPlaybackRecordService;

    @Scheduled(cron="0 * * * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u540c\u65f6\u64ad\u653e\u68c0\u6d4b\u4efb\u52a1", remark="\u7528\u6237\u540c\u65f6\u64ad\u653e\u5185\u5bb9\u68c0\u6d4b")
    public void configureTasks() throws ApiException {
        log.info("\u6b63\u5728\u64ad\u653e\u76f8\u540c\u7528\u6237\u68c0\u6d4b");
        List serverConfigs = Optional.ofNullable(this.embyInfoCacheManager.getEnabledConfigs()).filter(configs -> !configs.isEmpty()).orElse(null);
        if (serverConfigs == null) {
            log.warn("\u672a\u627e\u5230\u542f\u7528\u7684 Emby \u670d\u52a1\u5668\u914d\u7f6e\uff0c\u7ec8\u6b62\u672c\u6b21\u540c\u65f6\u64ad\u653e\u68c0\u6d4b\u4efb\u52a1");
            return;
        }
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            SessionsServiceApi sessionServiceApi = new SessionsServiceApi(this.buildApiClient(serverConfig));
            List sessions = sessionServiceApi.getSessions(null, null, null);
            List sessionSessionInfoResponses = BeanUtils.convertList((List)sessions, SessionSessionInfoResponse.class);
            sessionSessionInfoResponses = sessionSessionInfoResponses.stream().filter(sessionSessionInfo -> sessionSessionInfo.getNowPlayingItem() != null).collect(Collectors.toList());
            Map<String, List<SessionSessionInfoResponse>> groupedByUserName = sessionSessionInfoResponses.stream().collect(Collectors.groupingBy(SessionSessionInfoResponse::getUserName));
            for (Map.Entry<String, List<SessionSessionInfoResponse>> entry : groupedByUserName.entrySet()) {
                String userName = entry.getKey();
                List<SessionSessionInfoResponse> userSessions = entry.getValue();
                if (userSessions == null || userSessions.size() <= 1) continue;
                String disableMessage = "";
                int disableThreshold = this.resolveDisableThreshold(serverConfig);
                if (disableThreshold > 0 && userSessions.size() >= disableThreshold) {
                    if (!this.isAdminUser(serverConfig, userSessions.get(0))) {
                        boolean disabled = this.disableUser(serverConfig, userSessions.get(0));
                        if (disabled) {
                            disableMessage = "\ud83d\udeab \u5df2\u81ea\u52a8\u7981\u7528\u8be5\u7528\u6237\uff08\u8d85\u8fc7\u540c\u65f6\u64ad\u653e\u9650\u5236\uff09\u3002\n\n";
                        }
                    } else {
                        log.info("\u7528\u6237 {} \u662f\u7ba1\u7406\u5458\uff0c\u8df3\u8fc7\u81ea\u52a8\u7981\u7528", (Object)userName);
                    }
                }
                StringBuilder detailsBuilder = new StringBuilder();
                for (SessionSessionInfoResponse session : userSessions) {
                    detailsBuilder.append("\ud83c\udfac \u64ad\u653e\u5185\u5bb9\uff1a").append(session.getNowPlayingItem().getName()).append("\n");
                    detailsBuilder.append("\ud83c\udf0d \u64ad\u653e\u5730\u5740\uff1a").append(session.getRemoteEndPoint()).append(" ").append(Objects.requireNonNull(this.searchSearcher.memorySearch(session.getRemoteEndPoint())).getAddressAndIsp()).append("\n");
                    detailsBuilder.append("\u23f0 \u64ad\u653e\u65f6\u95f4\uff1a").append(session.getLastActivityDate().atZoneSameInstant(ZoneId.of("Asia/Shanghai")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))).append("\n\n");
                }
                detailsBuilder.append(disableMessage);
                HashMap<String, String> extras = new HashMap<String, String>();
                extras.put("userName", userName);
                extras.put("playbackDetails", String.valueOf(detailsBuilder) + "\n");
                this.saveSimultaneousPlaybackRecord(serverConfig, userSessions);
                if (!this.isSimultaneousPlaybackNotifyEnabled()) continue;
                SendMessageRequest sendMessageRequest = new SendMessageRequest();
                sendMessageRequest.setParseMode("Markdown");
                sendMessageRequest.setServerUrl(serverConfig.url());
                sendMessageRequest.setServerName(this.resolveServerName(serverConfig));
                sendMessageRequest.setExtraVariables(extras);
                this.notifyUtils.sendMultiChannel(sendMessageRequest, "simultaneous_playback", false, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
            }
        }
    }

    private ApiClient buildApiClient(EmbyInfoCacheManagerUtils.EmbyServerConfig config) {
        ApiClient apiClient = new ApiClient();
        this.embyInfoCacheManager.applyTo(apiClient, config);
        return apiClient;
    }

    private String resolveServerName(EmbyInfoCacheManagerUtils.EmbyServerConfig config) {
        if (config == null || config.id() == null) {
            return null;
        }
        return Optional.ofNullable((EmbyInfo)this.embyInfoService.getById(config.id())).map(embyInfo -> embyInfo.getServerName()).orElse(null);
    }

    private int resolveDisableThreshold(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        String threshold = this.configCacheLoaderUtils.getConfigValue("simultaneous_playback_disable_threshold");
        if (!StringUtils.hasText((String)threshold)) {
            return 0;
        }
        String value = threshold.trim();
        if (value.startsWith("{")) {
            return this.resolveJsonDisableThreshold(value, serverConfig);
        }
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException ex) {
            log.warn("\u81ea\u52a8\u7981\u7528\u540c\u65f6\u64ad\u653e\u9608\u503c\u89e3\u6790\u5931\u8d25\uff0c\u4f7f\u7528\u9ed8\u8ba4\u503c2", (Throwable)ex);
            return 2;
        }
    }

    private int resolveJsonDisableThreshold(String value, EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        try {
            Long serverId;
            JSONObject json = JSON.parseObject((String)value);
            int defaultThreshold = this.nonNegativeOrDefault(json.get("defaultThreshold"), 2);
            Long l = serverId = serverConfig == null ? null : serverConfig.id();
            if (serverId == null) {
                return defaultThreshold;
            }
            JSONObject serverThresholds = json.getJSONObject("serverThresholds");
            if (serverThresholds == null) {
                return defaultThreshold;
            }
            return this.nonNegativeOrDefault(serverThresholds.get(String.valueOf(serverId)), defaultThreshold);
        }
        catch (Exception ex) {
            log.warn("\u81ea\u52a8\u7981\u7528\u540c\u65f6\u64ad\u653e\u9608\u503c\u914d\u7f6e\u89e3\u6790\u5931\u8d25\uff0c\u4f7f\u7528\u9ed8\u8ba4\u503c2\uff1a{}", (Object)value, (Object)ex);
            return 2;
        }
    }

    private int nonNegativeOrDefault(Object value, int fallback) {
        if (value == null) {
            return fallback;
        }
        try {
            int parsed = Integer.parseInt(String.valueOf(value).trim());
            return parsed >= 0 ? parsed : fallback;
        }
        catch (NumberFormatException ex) {
            return fallback;
        }
    }

    private boolean isSimultaneousPlaybackNotifyEnabled() {
        String notifyEnabled = this.configCacheLoaderUtils.getConfigValue("simultaneous_playback_notify");
        return "true".equalsIgnoreCase(notifyEnabled);
    }

    private void saveSimultaneousPlaybackRecord(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig, List<SessionSessionInfoResponse> userSessions) {
        if (serverConfig == null || userSessions == null || userSessions.isEmpty()) {
            return;
        }
        SessionSessionInfoResponse firstSession = userSessions.get(0);
        SimultaneousPlaybackRecord record = new SimultaneousPlaybackRecord();
        record.setEmbyInfoId(serverConfig.id());
        record.setEmbyUserId(firstSession.getUserId());
        record.setEmbyUserName(firstSession.getUserName());
        record.setDetectionTime(this.convertToDate(firstSession.getLastActivityDate()));
        record.setSessionCount(userSessions.size());
        List<SimultaneousPlaybackRecordDetail> details = userSessions.stream().map(session -> {
            SimultaneousPlaybackRecordDetail detail = new SimultaneousPlaybackRecordDetail();
            BaseItemDto nowPlayingItem = session.getNowPlayingItem();
            detail.setItemId(nowPlayingItem != null ? nowPlayingItem.getId() : null);
            detail.setItemName(nowPlayingItem != null ? nowPlayingItem.getName() : null);
            detail.setItemType(nowPlayingItem != null ? nowPlayingItem.getType() : null);
            detail.setPosterUrl(this.buildPosterUrl((SessionSessionInfoResponse)session, serverConfig));
            detail.setPlaybackTime(this.convertToDate(session.getLastActivityDate()));
            detail.setClient(session.getClient());
            detail.setDeviceName(session.getDeviceName());
            detail.setRemoteEndpoint(session.getRemoteEndPoint());
            detail.setRemoteAddress(this.resolveRemoteAddress(session.getRemoteEndPoint()));
            return detail;
        }).collect(Collectors.toList());
        this.simultaneousPlaybackRecordService.saveRecordWithDetails(record, details);
    }

    private Date convertToDate(OffsetDateTime offsetDateTime) {
        return offsetDateTime == null ? new Date() : Date.from(offsetDateTime.toInstant());
    }

    private String resolveRemoteAddress(String remoteEndPoint) {
        if (!StringUtils.hasText((String)remoteEndPoint)) {
            return null;
        }
        return Optional.ofNullable(this.searchSearcher.memorySearch(remoteEndPoint)).map(ipInfo -> ipInfo.getAddressAndIsp()).orElse(null);
    }

    private String buildPosterUrl(SessionSessionInfoResponse session, EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        if (session == null || session.getNowPlayingItem() == null) {
            return null;
        }
        BaseItemDto nowPlayingItem = session.getNowPlayingItem();
        Map imageTags = nowPlayingItem.getImageTags();
        if ("Movie".equals(nowPlayingItem.getType()) && imageTags != null && imageTags.get("Primary") != null) {
            return "Items/" + nowPlayingItem.getId() + "/Images/Primary?tag=" + (String)imageTags.get("Primary") + "&quality=90&maxWidth=200";
        }
        if ("Episode".equals(nowPlayingItem.getType()) && nowPlayingItem.getParentId() != null && nowPlayingItem.getSeriesPrimaryImageTag() != null) {
            return "Items/" + nowPlayingItem.getParentId() + "/Images/Primary?tag=" + nowPlayingItem.getSeriesPrimaryImageTag() + "&quality=90&maxWidth=200";
        }
        return null;
    }

    private boolean isAdminUser(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig, SessionSessionInfoResponse session) throws ApiException {
        UserServiceApi userServiceApi = new UserServiceApi(this.buildApiClient(serverConfig));
        UserDto userDto = userServiceApi.getUsersById(session.getUserId());
        if (userDto != null && userDto.getPolicy() != null) {
            Boolean isAdmin = userDto.getPolicy().isIsAdministrator();
            return Boolean.TRUE.equals(isAdmin);
        }
        throw new ApiException("\u65e0\u6cd5\u83b7\u53d6\u7528\u6237\u4fe1\u606f");
    }

    private boolean disableUser(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig, SessionSessionInfoResponse session) {
        if (serverConfig == null || session == null || session.getUserId() == null) {
            return false;
        }
        try {
            UserServiceApi userServiceApi = new UserServiceApi(this.buildApiClient(serverConfig));
            UserDto userDto = userServiceApi.getUsersById(session.getUserId());
            UserPolicy userPolicy = userDto.getPolicy();
            userPolicy.setIsDisabled(Boolean.valueOf(true));
            userServiceApi.postUsersByIdPolicy(userPolicy, session.getUserId());
        }
        catch (ApiException e) {
            log.error("\u81ea\u52a8\u7981\u7528Emby\u7528\u6237\u5931\u8d25 userId={} status={} body={}", new Object[]{session.getUserId(), e.getCode(), e.getResponseBody(), e});
            return false;
        }
        ((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)this.embyUserService.lambdaUpdate().eq(EmbyUser::getEmbyUserId, (Object)session.getUserId())).eq(EmbyUser::getEmbyInfoId, (Object)serverConfig.id())).set(EmbyUser::getUserStatus, (Object)1)).update();
        return true;
    }
}
