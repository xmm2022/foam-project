/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.movie.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.movie.job.MovieDownloadRecordSyncJob;
import com.una.embyhub.movie.model.MovieActionResponse;
import com.una.embyhub.movie.model.MovieDownloadRecordReorganizeRequest;
import com.una.embyhub.movie.model.MovieDownloadRecordWithDetailsResponse;
import com.una.embyhub.movie.model.MoviePtDownloadRequest;
import com.una.embyhub.movie.service.MovieDownloadRecordService;
import com.una.embyhub.movie.service.MoviePtDownloadService;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"movie/pt"})
@SaCheckPermission(value={"admin"})
public class MoviePtDownloadController {
    private final MoviePtDownloadService moviePtDownloadService;
    private final MovieDownloadRecordService movieDownloadRecordService;
    private final MovieDownloadRecordSyncJob movieDownloadRecordSyncJob;

    @PostMapping(value={"download"})
    public MovieActionResponse download(@RequestBody MoviePtDownloadRequest request) {
        return this.moviePtDownloadService.downloadAndAdd(request);
    }

    @GetMapping(value={"download-record/list"})
    public Page<MovieDownloadRecordWithDetailsResponse> listDownloadRecords(@RequestParam(value="current", defaultValue="1") long current, @RequestParam(value="size", defaultValue="10") long size, @RequestParam(value="keyword", required=false) String keyword) {
        return this.movieDownloadRecordService.pageWithDetails(current, size, keyword);
    }

    @DeleteMapping(value={"download-record"})
    public MovieActionResponse deleteDownloadRecord(@RequestParam(value="recordId", required=false) Long recordId, @RequestParam(value="recordIds", required=false) List<Long> recordIds, @RequestParam(value="deleteScrapedFiles", defaultValue="false") boolean deleteScrapedFiles, @RequestParam(value="deleteSourceFiles", defaultValue="false") boolean deleteSourceFiles) {
        List<Long> mergedRecordIds = this.mergeIds(recordId, recordIds);
        return this.movieDownloadRecordService.deleteRecord(mergedRecordIds, deleteScrapedFiles, deleteSourceFiles);
    }

    @PostMapping(value={"download-record/reorganize"})
    public MovieActionResponse reorganizeDownloadRecords(@RequestBody MovieDownloadRecordReorganizeRequest request) {
        return this.movieDownloadRecordSyncJob.reorganizeRecords(request);
    }

    private List<Long> mergeIds(Long singleId, List<Long> batchIds) {
        ArrayList<Long> merged = new ArrayList<Long>();
        if (batchIds != null && !batchIds.isEmpty()) {
            merged.addAll(batchIds);
        }
        if (singleId != null) {
            merged.add(singleId);
        }
        return merged.isEmpty() ? null : merged;
    }

    @Generated
    public MoviePtDownloadController(MoviePtDownloadService moviePtDownloadService, MovieDownloadRecordService movieDownloadRecordService, MovieDownloadRecordSyncJob movieDownloadRecordSyncJob) {
        this.moviePtDownloadService = moviePtDownloadService;