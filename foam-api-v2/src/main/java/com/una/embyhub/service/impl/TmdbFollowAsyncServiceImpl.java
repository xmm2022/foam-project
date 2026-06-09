/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  info.movito.themoviedbapi.model.movies.MovieDb
 *  info.movito.themoviedbapi.model.tv.series.TvSeriesDb
 *  info.movito.themoviedbapi.tools.TmdbException
 *  info.movito.themoviedbapi.tools.appendtoresponse.MovieAppendToResponse
 *  info.movito.themoviedbapi.tools.appendtoresponse.TvSeriesAppendToResponse
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.scheduling.annotation.Async
 *  org.springframework.stereotype.Service
 */
package com.una.embyhub.service.impl;

import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowProgressBatchRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowProgressRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowSubscribeRequest;
import com.una.embyhub.model.entity.TmdbFollow;
import com.una.embyhub.service.TmdbFollowAsyncService;
import com.una.embyhub.service.TmdbFollowService;
import com.una.embyhub.service.TmdbService;
import info.movito.themoviedbapi.model.movies.MovieDb;
import info.movito.themoviedbapi.model.tv.series.TvSeriesDb;
import info.movito.themoviedbapi.tools.TmdbException;
import info.movito.themoviedbapi.tools.appendtoresponse.MovieAppendToResponse;
import info.movito.themoviedbapi.tools.appendtoresponse.TvSeriesAppendToResponse;
import java.util.Date;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TmdbFollowAsyncServiceImpl
implements TmdbFollowAsyncService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(TmdbFollowAsyncServiceImpl.class);
    @Autowired
    private TmdbService tmdbService;
    @Lazy
    @Autowired
    private TmdbFollowService tmdbFollowService;

    @Override
    @Async
    public void asyncSyncFollowData(Long followId, TmdbFollowSubscribeRequest request) {
        block5: {
            try {
                TmdbFollow follow = (TmdbFollow)this.tmdbFollowService.getById(followId);
                if (follow == null) {
                    log.error("\u8ba2\u9605\u8bb0\u5f55\u4e0d\u5b58\u5728\uff1a{}", (Object)followId);
                    return;
                }
                String mediaType = follow.getMediaType();
                if ("movie".equalsIgnoreCase(mediaType)) {
                    this.syncMovieData(follow);
                } else {
                    this.syncTvData(follow);
                }
                follow.setStatus(0);
                follow.setLastSyncTime(new Date());
                this.tmdbFollowService.updateById(follow);
                log.info("\u8ba2\u9605\u6570\u636e\u540c\u6b65\u6210\u529f\uff1a{} - {}", (Object)follow.getName(), (Object)follow.getTmdbId());
            }
            catch (Exception e) {
                log.error("\u8ba2\u9605\u6570\u636e\u540c\u6b65\u5931\u8d25\uff1afollowId={}", (Object)followId, (Object)e);
                TmdbFollow follow = (TmdbFollow)this.tmdbFollowService.getById(followId);
                if (follow == null) break block5;
                follow.setStatus(3);
                this.tmdbFollowService.updateById(follow);
            }
        }
    }

    @Override
    @Async
    public void asyncBatchUpdateProgress(TmdbFollowProgressBatchRequest request) {
        log.info("\u5f00\u59cb\u5f02\u6b65\u6279\u91cf\u66f4\u65b0\u89c2\u770b\u8fdb\u5ea6\uff0c\u5171 {} \u6761", (Object)request.getProgressList().size());
        int successCount = 0;
        int failCount = 0;
        for (TmdbFollowProgressRequest progressRequest : request.getProgressList()) {
            try {
                this.tmdbFollowService.updateProgress(progressRequest);
                ++successCount;
            }
            catch (Exception e) {
                ++failCount;
                log.error("\u6279\u91cf\u66f4\u65b0\u8fdb\u5ea6\u5931\u8d25\uff1afollowId={}, error={}", (Object)progressRequest.getFollowId(), (Object)e.getMessage());
            }
        }