/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  embyclient.ApiClient
 *  embyclient.ApiException
 *  embyclient.api.ActivityLogServiceApi
 *  embyclient.model.QueryResultActivityLogEntry
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.CollectionUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.PlayRecords;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.PlayRecordsService;
import embyclient.ApiClient;
import embyclient.ApiException;
import embyclient.api.ActivityLogServiceApi;
import embyclient.model.QueryResultActivityLogEntry;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.CollectionUtils;

@Configuration
@EnableScheduling
public class PlayRecordsJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(PlayRecordsJob.class);
    @Autowired
    private PlayRecordsService playRecordsService;
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;

    @Scheduled(cron="0 0 * * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u64ad\u653e\u8bb0\u5f55\u4efb\u52a1", remark="\u7528\u6237\u64ad\u653e\u8bb0\u5f55\u4efb\u52a1")
    public void configureTasks() {
        log.info("\u5f00\u59cb\u6267\u884c\u64ad\u653e\u8bb0\u5f55\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs = this.embyInfoCacheManager.getEnabledConfigs();
        if (CollectionUtils.isEmpty(serverConfigs)) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            Object date = DateUtil.beginOfDay((Date)new Date());
            PlayRecords playRecords = (PlayRecords)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.playRecordsService.getBaseMapper()).eq(serverConfig.id() != null, PlayRecords::getEmbyInfoId, (Object)serverConfig.id())).orderByDesc(PlayRecords::getPlayDate)).last("limit 1")).one();
            if (playRecords != null) {
                date = playRecords.getPlayDate();
            }
            ActivityLogServiceApi activityLogServiceApi = new ActivityLogServiceApi(this.buildApiClient(serverConfig));
            try {
                OffsetDateTime startDate = OffsetDateTime.ofInstant(((Date)date).toInstant(), ZoneId.systemDefault());
                QueryResultActivityLogEntry queryResultActivityLogEntry = activityLogServiceApi.getSystemActivitylogEntries(null, null, startDate);
                this.parseAndExtractData(JSONObject.toJSONString((Object)queryResultActivityLogEntry, (JSONWriter.Feature[])new JSONWriter.Feature[0]), serverConfig.id());
            }
            catch (ApiException e) {
                log.error("\u64ad\u653e\u8bb0\u5f55\u83b7\u53d6\u5931\u8d25", (Throwable)e);
            }
        }
    }

    public void parseAndExtractData(String jsonData, Long embyInfoId) {
        JSONObject rootObject = JSON.parseObject((String)jsonData);
        JSONArray itemsArray = rootObject.getJSONArray("Items");
        if (itemsArray != null && itemsArray.size() > 0) {
            for (int i = 0; i < itemsArray.size(); ++i) {
                JSONObject itemObject = itemsArray.getJSONObject(i);
                String embyUserName = itemObject.getString("Name");
                String embyUserId = "0";
                embyUserName = this.extractUsernameFromName(embyUserName);
                String recordType = itemObject.getString("Type");
                if (!"VideoPlayback".equals(recordType) && !"VideoPlaybackStopped".equals(recordType) && !"playback.start".equals(recordType) && !"playback.stop".equals(recordType)) continue;
                String date = itemObject.getString("Date");
                String device = this.extractDeviceFromName(itemObject.getString("Name"));
                String content = this.extractContentFromName(itemObject.getString("Name"));
                EmbyUser embyUser = (EmbyUser)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getEmbyUserName, (Object)embyUserName)).one();
                if (embyUser != null) {
                    embyUserId = embyUser.getEmbyUserId();
                }
                PlayRecords record = new PlayRecords();
                record.setEmbyUserId(embyUserId);
                record.setPlayDate(this.convertDateFormat(date));
                record.setRecordType(recordType);
                record.setDevice(device);
                record.setContent(content);
                record.setEmbyUserName(embyUserName);
                record.setEmbyInfoId(embyInfoId);
                this.playRecordsService.save(record);
            }
        }
    }

    public String extractUsernameFromName(String name) {
        int index = name.indexOf("\u5728");
        if (index > 0) {
            return name.substring(0, index).trim();
        }
        int stopIndex = name.indexOf("\u5df2\u505c\u6b62\u64ad\u653e");
        int upIndex = name.indexOf("\u4e0a");
        if (upIndex >= 0 && stopIndex > upIndex) {
            return name.substring(upIndex + 1, stopIndex).trim();
        }
        return "\u672a\u77e5\u7528\u6237";
    }

    public String extractDeviceFromName(String name) {
        int startIndex = name.indexOf("\u5728") + 1;
        int endIndex = name.indexOf("\u4e0a");
        if (startIndex > 0 && endIndex > startIndex) {
            return name.substring(startIndex, endIndex).trim();
        }
        if (endIndex > 0) {
            return name.substring(0, endIndex).trim();
        }
        return "\u672a\u77e5\u8bbe\u5907";
    }

    public String extractContentFromName(String name) {
        int startIndex = name.indexOf("\u64ad\u653e") + 2;
        if (startIndex > 2) {
            return name.substring(startIndex).trim();
        }
        return "\u672a\u77e5\u5185\u5bb9";
    }

    public Date convertDateFormat(String isoDate) {
        try {
            return JSON.parseObject((String)("{\"date\":\"" + isoDate + "\"}")).getDate("date");
        }
        catch (Exception e) {
            return new Date();
        }
    }

    private ApiClient buildApiClient(EmbyInfoCacheManagerUtils.EmbyServerConfig config) {
        ApiClient apiClient = new ApiClient();
        this.embyInfoCacheManager.applyTo(apiClient, config);
        return apiClient;
    }
}
