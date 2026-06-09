/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  embyclient.ApiClient
 *  embyclient.ApiException
 *  embyclient.api.UserServiceApi
 *  embyclient.model.QueryResultUserDto
 *  embyclient.model.UserDto
 *  embyclient.model.UserPolicy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.mapper.PlayRecordsMapper;
import com.una.embyhub.mapper.PlaybackReportingRecordMapper;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.PlayRecords;
import com.una.embyhub.model.entity.PlaybackReportingRecord;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.LicenseService;
import embyclient.ApiClient;
import embyclient.ApiException;
import embyclient.api.UserServiceApi;
import embyclient.model.QueryResultUserDto;
import embyclient.model.UserDto;
import embyclient.model.UserPolicy;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Configuration
@EnableScheduling
public class EmbyActiveAccountProtectionJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyActiveAccountProtectionJob.class);
    private static final int DEFAULT_ACTIVITY_CHECK_DAYS = 21;
    private static final int DEFAULT_DISABLED_RETENTION_DAYS = 15;
    private static final String DISABLE_REASON_ACTIVE_PROTECTION = "ACTIVE_PROTECTION";
    private final ConfigCacheLoaderUtils configCacheLoaderUtils;
    private final EmbyInfoCacheManagerUtils embyInfoCacheManager;
    private final EmbyUserService embyUserService;
    private final PlaybackReportingRecordMapper playbackReportingRecordMapper;
    private final PlayRecordsMapper playRecordsMapper;
    private final LicenseService licenseService;

    public EmbyActiveAccountProtectionJob(ConfigCacheLoaderUtils configCacheLoaderUtils, EmbyInfoCacheManagerUtils embyInfoCacheManager, EmbyUserService embyUserService, PlaybackReportingRecordMapper playbackReportingRecordMapper, PlayRecordsMapper playRecordsMapper, LicenseService licenseService) {
        this.configCacheLoaderUtils = configCacheLoaderUtils;
        this.embyInfoCacheManager = embyInfoCacheManager;
        this.embyUserService = embyUserService;
        this.playbackReportingRecordMapper = playbackReportingRecordMapper;
        this.playRecordsMapper = playRecordsMapper;
        this.licenseService = licenseService;
    }

    @Scheduled(cron="0 30 8 * * ?", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u6d3b\u8dc3\u4fdd\u53f7\u4efb\u52a1", remark="\u6309\u914d\u7f6e\u670d\u52a1\u5668\u68c0\u6d4b\u957f\u671f\u672a\u89c2\u770b\u7528\u6237\u5e76\u7981\u7528\u6216\u5220\u9664")
    public void run() {
        String configValue = this.configCacheLoaderUtils.getConfigValue("emby_active_account_protection");
        if (!StringUtils.hasText((String)configValue)) {
            return;
        }
        if (!this.licenseService.hasValidLicense()) {
            log.warn("\u6d3b\u8dc3\u4fdd\u53f7\u4efb\u52a1\u8df3\u8fc7\uff1a\u6388\u6743\u7801\u672a\u6fc0\u6d3b\u6216\u672c\u5730\u6388\u6743\u72b6\u6001\u65e0\u6548");
            return;
        }
        ActiveProtectionConfig config = this.parseConfig(configValue);
        if (CollectionUtils.isEmpty(config.serverIds())) {
            log.info("\u6d3b\u8dc3\u4fdd\u53f7\u4efb\u52a1\u8df3\u8fc7\uff1a\u672a\u914d\u7f6e\u9700\u8981\u6267\u884c\u7684\u670d\u52a1\u5668");
            return;
        }
        log.info("\u5f00\u59cb\u6267\u884c\u6d3b\u8dc3\u4fdd\u53f7\u4efb\u52a1\uff1aserverIds={}, activityCheckDays={}, disabledRetentionDays={}, deleteAfterDisabled={}", new Object[]{config.serverIds(), config.activityCheckDays(), config.disabledRetentionDays(), config.deleteAfterDisabled()});
        for (Long serverId : config.serverIds()) {
            this.runServer(serverId, config);
        }
        log.info("\u6d3b\u8dc3\u4fdd\u53f7\u4efb\u52a1\u6267\u884c\u5b8c\u6210");
    }

    private void runServer(Long serverId, ActiveProtectionConfig config) {
        EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig;
        try {
            serverConfig = this.embyInfoCacheManager.getRequiredConfigById(serverId);
        }
        catch (Exception e) {
            log.warn("\u6d3b\u8dc3\u4fdd\u53f7\u8df3\u8fc7\u670d\u52a1\u5668\uff1a\u670d\u52a1\u5668\u4e0d\u5b58\u5728\u6216\u672a\u542f\u7528\uff0cserverId={}", (Object)serverId);
            return;
        }
        if (serverConfig == null || serverConfig.id() == null) {
            log.warn("\u6d3b\u8dc3\u4fdd\u53f7\u8df3\u8fc7\u670d\u52a1\u5668\uff1a\u670d\u52a1\u5668\u4e0d\u5b58\u5728\u6216\u672a\u542f\u7528\uff0cserverId={}", (Object)serverId);
            return;
        }
        Map<String, UserDto> remoteUserMap = this.loadRemoteUsers(serverConfig);
        if (remoteUserMap.isEmpty()) {
            log.warn("\u6d3b\u8dc3\u4fdd\u53f7\u8df3\u8fc7\u670d\u52a1\u5668\uff1a\u672a\u83b7\u53d6\u5230\u8fdc\u7aef\u7528\u6237\uff0cserverId={}", (Object)serverId);
            return;
        }
        if (config.deleteAfterDisabled()) {
            this.deleteInactiveDisabledUsers(serverConfig, remoteUserMap, config);
        }
        this.disableInactiveUsers(serverConfig, remoteUserMap, config);
    }

    private Map<String, UserDto> loadRemoteUsers(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        try {
            QueryResultUserDto remoteUsers = this.buildUserServiceApi(serverConfig).getUsersQuery(null, null, null, null, null, null);
            if (remoteUsers == null || CollectionUtils.isEmpty((Collection)remoteUsers.getItems())) {
                return Collections.emptyMap();
            }
            HashMap<String, UserDto> result = new HashMap<String, UserDto>();
            for (UserDto user : remoteUsers.getItems()) {
                if (StringUtils.hasText((String)user.getId())) {
                    result.put(user.getId(), user);
                }
                if (!StringUtils.hasText((String)user.getName())) continue;
                result.put(user.getName(), user);
            }
            return result;
        }
        catch (ApiException e) {
            log.error("\u6d3b\u8dc3\u4fdd\u53f7\u83b7\u53d6\u8fdc\u7aef\u7528\u6237\u5931\u8d25\uff1aserverId={}, status={}, body={}", new Object[]{serverConfig.id(), e.getCode(), e.getResponseBody(), e});
            return Collections.emptyMap();
        }
        catch (Exception e) {
            log.error("\u6d3b\u8dc3\u4fdd\u53f7\u83b7\u53d6\u8fdc\u7aef\u7528\u6237\u5931\u8d25\uff1aserverId={}", (Object)serverConfig.id(), (Object)e);
            return Collections.emptyMap();
        }
    }

    private void deleteInactiveDisabledUsers(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig, Map<String, UserDto> remoteUserMap, ActiveProtectionConfig config) {
        List disabledUsers = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.baseUserQuery(serverConfig.id()).eq(EmbyUser::getUserStatus, (Object)1)).eq(EmbyUser::getDisableReason, (Object)DISABLE_REASON_ACTIVE_PROTECTION)).list();
        for (EmbyUser user : disabledUsers) {
            Date lastActivity;
            UserDto remoteUser = this.resolveRemoteUser(remoteUserMap, user);
            if (remoteUser == null || !this.isInactive(lastActivity = this.resolveLastActivity(serverConfig.id(), user, remoteUser), config.disabledRetentionDays())) continue;
            try {
                log.info("\u6d3b\u8dc3\u4fdd\u53f7\u5220\u9664\u7528\u6237\uff1aserverId={}, userName={}, lastActivity={}", new Object[]{serverConfig.id(), user.getEmbyUserName(), this.formatNullable(lastActivity)});
                this.embyUserService.deleteByUserId(Collections.singletonList(user.getId()));
            }
            catch (Exception e) {
                log.error("\u6d3b\u8dc3\u4fdd\u53f7\u5220\u9664\u7528\u6237\u5931\u8d25\uff1aserverId={}, userId={}, embyUserName={}", new Object[]{serverConfig.id(), user.getId(), user.getEmbyUserName(), e});
            }
        }
    }

    private void disableInactiveUsers(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig, Map<String, UserDto> remoteUserMap, ActiveProtectionConfig config) {
        List activeUsers = ((LambdaQueryChainWrapper)this.baseUserQuery(serverConfig.id()).eq(EmbyUser::getUserStatus, (Object)0)).list();
        for (EmbyUser user : activeUsers) {
            Date lastActivity;
            UserDto remoteUser = this.resolveRemoteUser(remoteUserMap, user);
            if (remoteUser == null || !this.isInactive(lastActivity = this.resolveLastActivity(serverConfig.id(), user, remoteUser), config.activityCheckDays())) continue;
            try {
                this.disableRemoteUser(serverConfig, remoteUser);
                EmbyUser update = new EmbyUser();
                update.setId(user.getId());
                update.setUserStatus(1);
                update.setDisableReason(DISABLE_REASON_ACTIVE_PROTECTION);
                update.setDisabledDatetime(new Date());
                this.embyUserService.updateById(update);
                log.info("\u6d3b\u8dc3\u4fdd\u53f7\u7981\u7528\u7528\u6237\uff1aserverId={}, userName={}, lastActivity={}", new Object[]{serverConfig.id(), user.getEmbyUserName(), this.formatNullable(lastActivity)});
            }
            catch (ApiException e) {
                log.error("\u6d3b\u8dc3\u4fdd\u53f7\u7981\u7528\u8fdc\u7aef\u7528\u6237\u5931\u8d25\uff1aserverId={}, userName={}, status={}, body={}", new Object[]{serverConfig.id(), user.getEmbyUserName(), e.getCode(), e.getResponseBody(), e});
            }
            catch (Exception e) {
                log.error("\u6d3b\u8dc3\u4fdd\u53f7\u7981\u7528\u7528\u6237\u5931\u8d25\uff1aserverId={}, userName={}", new Object[]{serverConfig.id(), user.getEmbyUserName(), e});
            }
        }
    }

    private LambdaQueryChainWrapper<EmbyUser> baseUserQuery(Long serverId) {
        return (LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getEmbyInfoId, (Object)serverId)).ne(EmbyUser::getIsAdmin, (Object)1)).and(wrapper -> ((LambdaQueryWrapper)((LambdaQueryWrapper)wrapper.ne(EmbyUser::getHostLineType, (Object)HostLineTypeEnum.WHITELIST.getCode())).or()).isNull(EmbyUser::getHostLineType));
    }

    private UserDto resolveRemoteUser(Map<String, UserDto> remoteUserMap, EmbyUser user) {
        UserDto remoteUser;
        if (StringUtils.hasText((String)user.getEmbyUserId()) && (remoteUser = remoteUserMap.get(user.getEmbyUserId())) != null) {
            return remoteUser;
        }
        if (StringUtils.hasText((String)user.getEmbyUserName())) {
            return remoteUserMap.get(user.getEmbyUserName());
        }
        return null;
    }

    private Date resolveLastActivity(Long serverId, EmbyUser user, UserDto remoteUser) {
        Date remoteLastActivity = this.toDate(remoteUser.getLastActivityDate());
        if (remoteLastActivity != null) {
            return remoteLastActivity;
        }
        Date playbackReportingActivity = this.findLatestPlaybackReportingActivity(serverId, user);
        if (playbackReportingActivity != null) {
            return playbackReportingActivity;
        }
        return this.findLatestPlayRecordsActivity(serverId, user);
    }

    private Date findLatestPlaybackReportingActivity(Long serverId, EmbyUser user) {
        PlaybackReportingRecord record = (PlaybackReportingRecord)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.playbackReportingRecordMapper).eq(PlaybackReportingRecord::getEmbyInfoId, (Object)serverId)).and(wrapper -> ((LambdaQueryWrapper)((LambdaQueryWrapper)wrapper.eq(StringUtils.hasText((String)user.getEmbyUserId()), PlaybackReportingRecord::getUserId, (Object)user.getEmbyUserId())).or()).eq(StringUtils.hasText((String)user.getEmbyUserName()), PlaybackReportingRecord::getUserName, (Object)user.getEmbyUserName()))).orderByDesc(PlaybackReportingRecord::getPlayDate)).last("limit 1")).one();
        return record == null ? null : record.getPlayDate();
    }

    private Date findLatestPlayRecordsActivity(Long serverId, EmbyUser user) {
        PlayRecords record = (PlayRecords)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper((BaseMapper)this.playRecordsMapper).eq(PlayRecords::getEmbyInfoId, (Object)serverId)).and(wrapper -> ((LambdaQueryWrapper)((LambdaQueryWrapper)wrapper.eq(StringUtils.hasText((String)user.getEmbyUserId()), PlayRecords::getEmbyUserId, (Object)user.getEmbyUserId())).or()).eq(StringUtils.hasText((String)user.getEmbyUserName()), PlayRecords::getEmbyUserName, (Object)user.getEmbyUserName()))).orderByDesc(PlayRecords::getPlayDate)).last("limit 1")).one();
        return record == null ? null : record.getPlayDate();
    }

    private void disableRemoteUser(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig, UserDto remoteUser) throws ApiException {
        UserServiceApi userServiceApi = this.buildUserServiceApi(serverConfig);
        UserDto latestUser = userServiceApi.getUsersById(remoteUser.getId());
        UserPolicy policy = latestUser.getPolicy() == null ? new UserPolicy() : latestUser.getPolicy();
        policy.setIsDisabled(Boolean.valueOf(true));
        userServiceApi.postUsersByIdPolicy(policy, remoteUser.getId());
    }

    private UserServiceApi buildUserServiceApi(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        ApiClient apiClient = new ApiClient();
        this.embyInfoCacheManager.applyTo(apiClient, serverConfig);
        return new UserServiceApi(apiClient);
    }

    private Date toDate(OffsetDateTime offsetDateTime) {
        return offsetDateTime == null ? null : Date.from(offsetDateTime.toInstant());
    }

    private boolean isInactive(Date lastActivity, int days) {
        if (lastActivity == null) {
            return true;
        }
        return DateUtil.offsetDay((Date)lastActivity, (int)days).before(new Date());
    }

    private String formatNullable(Date date) {
        return date == null ? "\u65e0\u64ad\u653e\u8bb0\u5f55" : DateUtil.formatDateTime((Date)date);
    }

    private ActiveProtectionConfig parseConfig(String configValue) {
        try {
            JSONObject json = JSON.parseObject((String)configValue);
            List<Long> serverIds = this.parseServerIds(json.get("serverIds"));
            int activityCheckDays = this.positiveOrDefault(json.getIntValue("activityCheckDays"), 21);
            int disabledRetentionDays = this.positiveOrDefault(json.getIntValue("disabledRetentionDays"), 15);
            Boolean deleteAfterDisabledValue = json.getBoolean("deleteAfterDisabled");
            boolean deleteAfterDisabled = deleteAfterDisabledValue == null || deleteAfterDisabledValue != false;
            return new ActiveProtectionConfig(serverIds, activityCheckDays, disabledRetentionDays, deleteAfterDisabled);
        }
        catch (Exception e) {
            log.warn("\u6d3b\u8dc3\u4fdd\u53f7\u914d\u7f6e\u89e3\u6790\u5931\u8d25\uff0c\u5df2\u8df3\u8fc7\u6267\u884c\uff1a{}", (Object)configValue, (Object)e);
            return new ActiveProtectionConfig(List.of(), 21, 15, true);
        }
    }

    private List<Long> parseServerIds(Object value) {
        LinkedHashSet<Long> result;
        block4: {
            block5: {
                block3: {
                    result = new LinkedHashSet<Long>();
                    if (!(value instanceof JSONArray)) break block3;
                    JSONArray array = (JSONArray)value;
                    for (Object item : array) {
                        this.addServerId(result, item);
                    }
                    break block4;
                }
                if (!(value instanceof Iterable)) break block5;
                Iterable iterable = (Iterable)value;
                for (Object item : iterable) {
                    this.addServerId(result, item);
                }
                break block4;
            }
            String text = String.valueOf(value == null ? "" : value).trim();
            if (!StringUtils.hasText((String)text)) break block4;
            for (String item : text.split("[,\uff0c\\s]+")) {
                this.addServerId(result, item);
            }
        }
        return result.stream().filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
    }

    private void addServerId(Set<Long> result, Object value) {
        String text = String.valueOf(value == null ? "" : value).trim();
        if (!StringUtils.hasText((String)text)) {
            return;
        }
        try {
            long serverId = Long.parseLong(text);
            if (serverId > 0L) {
                result.add(serverId);
            }
        }
        catch (NumberFormatException ignored) {
            log.warn("\u6d3b\u8dc3\u4fdd\u53f7\u5ffd\u7565\u65e0\u6548\u670d\u52a1\u5668 ID\uff1a{}", (Object)text);
        }
    }

    private int positiveOrDefault(int value, int fallback) {
        return value > 0 ? value : fallback;
    }

    private record ActiveProtectionConfig(List<Long> serverIds, int activityCheckDays, int disabledRetentionDays, boolean deleteAfterDisabled) {
    }
}
