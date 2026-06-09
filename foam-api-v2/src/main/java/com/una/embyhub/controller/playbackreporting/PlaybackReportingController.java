/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.alibaba.fastjson2.JSONObject
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RequestPart
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.multipart.MultipartFile
 */
package com.una.embyhub.controller.playbackreporting;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.playbackreporting.CustomQueryRequest;
import com.una.embyhub.model.dto.response.playbackreporting.HourlyReportResponse;
import com.una.embyhub.model.dto.response.playbackreporting.MoviesReportResponse;
import com.una.embyhub.model.dto.response.playbackreporting.PlayActivityResponse;
import com.una.embyhub.model.dto.response.playbackreporting.TvShowsReportResponse;
import com.una.embyhub.model.dto.response.playbackreporting.UserPlaylistResponse;
import com.una.embyhub.service.playbackreporting.PlaybackReportingCacheService;
import com.una.embyhub.service.playbackreporting.PlaybackReportingService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value={"playbackReporting"})
@SkipLicense
public class PlaybackReportingController {
    @Autowired
    private PlaybackReportingService playbackReportingService;
    @Autowired
    private PlaybackReportingCacheService playbackReportingCacheService;

    @GetMapping(value={"hourlyReport"})
    @SaCheckPermission(value={"admin"})
    public HourlyReportResponse getHourlyReport(@RequestParam(value="userId", required=false) String userId, @RequestParam(value="days", required=false) Integer days, @RequestParam(value="endDate", required=false) String endDate, @RequestParam(value="filter", required=false) String filter) {
        JSONObject jsonResult = this.playbackReportingService.getHourlyReport(userId, days, endDate, filter);
        return HourlyReportResponse.fromMap((Map<String, Object>)jsonResult);
    }

    @GetMapping(value={"moviesReport"})
    @SaCheckPermission(value={"admin"})
    public List<MoviesReportResponse> getMoviesReport(@RequestParam(value="embyInfoId") Long embyInfoId, @RequestParam(value="userId", required=false) String userId, @RequestParam(value="days", required=false) Integer days, @RequestParam(value="endDate", required=false) String endDate) {
        return this.playbackReportingService.getMoviesReport(embyInfoId, userId, days, endDate);
    }

    @GetMapping(value={"playActivity"})
    @SaCheckPermission(value={"admin"})
    public List<PlayActivityResponse> getPlayActivity(@RequestParam(value="embyInfoId") Long embyInfoId, @RequestParam(value="days", required=false) Integer days, @RequestParam(value="endDate", required=false) String endDate, @RequestParam(value="filter", required=false, defaultValue="Episode,Movie") String filter, @RequestParam(value="dataType", required=false, defaultValue="time") String dataType) {
        return this.playbackReportingService.getPlayActivity(embyInfoId, days, endDate, filter, dataType);
    }

    @GetMapping(value={"tvShowsReport"})
    @SaCheckPermission(value={"admin"})
    public List<TvShowsReportResponse> getTvShowsReport(@RequestParam(value="embyInfoId") Long embyInfoId, @RequestParam(value="userId", required=false) String userId, @RequestParam(value="days", required=false) Integer days, @RequestParam(value="endDate", required=false) String endDate) {
        return this.playbackReportingService.getTvShowsReport(embyInfoId, userId, days, endDate);
    }

    @GetMapping(value={"userPlaylist"})