/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  info.movito.themoviedbapi.tools.TmdbException
 *  jakarta.validation.Valid
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowCancelRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowCheckRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowProgressBatchRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowProgressRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowQueryRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowSubscribeRequest;
import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowSyncRequest;
import com.una.embyhub.model.dto.response.tmdbfollow.TmdbEpisodeResponse;
import com.una.embyhub.model.dto.response.tmdbfollow.TmdbFollowResponse;
import com.una.embyhub.model.dto.response.tmdbfollow.TmdbSeasonResponse;
import com.una.embyhub.model.entity.TmdbWatchProgress;
import com.una.embyhub.service.TmdbFollowService;
import info.movito.themoviedbapi.tools.TmdbException;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"tmdb/track"})
public class TmdbTrackController {
    @Autowired
    private TmdbFollowService tmdbFollowService;

    @PostMapping(value={"subscribe"})
    @SaCheckPermission(value={"admin"})
    public TmdbFollowResponse subscribe(@RequestBody @Valid TmdbFollowSubscribeRequest request) throws TmdbException {
        return this.tmdbFollowService.subscribe(request);
    }

    @PostMapping(value={"unsubscribe"})
    @SaCheckPermission(value={"admin"})
    public Boolean unsubscribe(@RequestBody TmdbFollowCancelRequest request) {
        this.tmdbFollowService.unsubscribe(request);
        return Boolean.TRUE;
    }

    @PostMapping(value={"list"})
    @SaCheckPermission(value={"admin"})
    public Page<TmdbFollowResponse> list(@RequestBody MybatisPlusPage<TmdbFollowQueryRequest> page) {
        return this.tmdbFollowService.pageFollows(page);
    }

    @GetMapping(value={"seasons"})
    @SaCheckPermission(value={"admin"})
    public List<TmdbSeasonResponse> getSeasons(@RequestParam Long followId) {
        return this.tmdbFollowService.getSeasons(followId);
    }

    @GetMapping(value={"episodes"})
    @SaCheckPermission(value={"admin"})
    public List<TmdbEpisodeResponse> getEpisodes(@RequestParam Long followId, @RequestParam Integer seasonNumber) {
        return this.tmdbFollowService.getEpisodes(followId, seasonNumber);
    }