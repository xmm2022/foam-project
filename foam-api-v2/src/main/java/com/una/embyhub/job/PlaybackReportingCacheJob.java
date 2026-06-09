/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.context.event.ApplicationReadyEvent
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.context.event.EventListener
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.CollectionUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import com.una.embyhub.component.MapSummaryCache;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.service.playbackreporting.PlaybackReportingCacheService;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.CollectionUtils;

@Configuration
@EnableScheduling
public class PlaybackReportingCacheJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(PlaybackReportingCacheJob.class);
    private static final ZoneId ZONE_ID = ZoneId.of("Asia/Shanghai");
    private final EmbyInfoCacheManagerUtils embyInfoCacheManager;
    private final PlaybackReportingCacheService playbackReportingCacheService;
    private final MapSummaryCache mapSummaryCache;

    public PlaybackReportingCacheJob(EmbyInfoCacheManagerUtils embyInfoCacheManager, PlaybackReportingCacheService playbackReportingCacheService, MapSummaryCache mapSummaryCache) {
        this.embyInfoCacheManager = embyInfoCacheManager;
        this.playbackReportingCacheService = playbackReportingCacheService;
        this.mapSummaryCache = mapSummaryCache;
    }

    @EventListener(value={ApplicationReadyEvent.class})
    public void syncYesterdayOnStartup() {
        CompletableFuture.runAsync(() -> this.syncPastDays(1, "\u542f\u52a8\u8865\u9f50"));
    }

    @Scheduled(cron="0 0 3 * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="Playback Reporting\u64ad\u653e\u8bb0\u5f55\u540c\u6b65", remark="\u6bcf\u5929\u51cc\u66683\u70b9\u540c\u6b65\u6628\u5929\u64ad\u653e\u8bb0\u5f55\u5230\u672c\u5730\u5e93")
    public void syncYesterdayDaily() {
        this.syncPastDays(1, "\u5b9a\u65f6\u540c\u6b65");
    }

    private void syncPastDays(int days, String source) {
        log.info("{} Playback Reporting \u64ad\u653e\u8bb0\u5f55\u5f00\u59cb\uff1a{}\uff0cdays={}", new Object[]{source, DateUtil.formatDateTime((Date)new Date()), days});
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs = this.embyInfoCacheManager.getEnabledConfigs();
        if (CollectionUtils.isEmpty(serverConfigs)) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        LocalDate today = LocalDate.now(ZONE_ID);
        boolean mapDataChanged = false;
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            Long serverId = serverConfig.id();
            for (int i = 1; i <= days; ++i) {
                LocalDate playDay = today.minusDays(i);
                try {
                    int count = this.playbackReportingCacheService.syncServerDay(serverId, playDay);
                    if (count <= 0) continue;
                    mapDataChanged = true;
                    log.info("\u670d\u52a1\u5668[{}] Playback Reporting \u64ad\u653e\u8bb0\u5f55\u540c\u6b65\u5b8c\u6210\uff1aday={}, count={}", new Object[]{serverConfig.serverName(), playDay, count});
                    continue;
                }
                catch (Exception e) {
                    this.playbackReportingCacheService.markSyncFailure(serverId, playDay, e.getMessage());
                    log.error("\u670d\u52a1\u5668[{}] Playback Reporting \u64ad\u653e\u8bb0\u5f55\u540c\u6b65\u5931\u8d25\uff1aday={}", new Object[]{serverConfig.serverName(), playDay, e});
                }
            }
        }
        if (mapDataChanged) {
            this.mapSummaryCache.refresh();
        }
        log.info("{} Playback Reporting \u64ad\u653e\u8bb0\u5f55\u7ed3\u675f\uff1a{}", (Object)source, (Object)DateUtil.formatDateTime((Date)new Date()));
    }
}
