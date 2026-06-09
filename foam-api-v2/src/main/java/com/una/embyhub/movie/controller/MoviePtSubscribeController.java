/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  jakarta.annotation.PreDestroy
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 */
package com.una.embyhub.movie.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.movie.model.MovieDownloadRecordWithDetailsResponse;
import com.una.embyhub.movie.model.MoviePtSubscribe;
import com.una.embyhub.movie.model.MoviePtSubscribeRequest;
import com.una.embyhub.movie.model.MoviePtSubscribeSearchProgressEvent;
import com.una.embyhub.movie.model.MoviePtSubscribeSearchResponse;
import com.una.embyhub.movie.model.MovieSubscribeQualityConfig;
import com.una.embyhub.movie.service.MoviePtSubscribeService;
import jakarta.annotation.PreDestroy;
import jakarta.validation.Valid;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping(value={"movie/pt-subscribe"})
@Validated
@SaCheckPermission(value={"admin"})
public class MoviePtSubscribeController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MoviePtSubscribeController.class);
    private static final String SUBSCRIBE_SEARCH_SSE_EVENT = "pt-subscribe-search-progress";
    private static final long SSE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(10L);
    private static final AtomicInteger SSE_THREAD_ID = new AtomicInteger(1);
    private final MoviePtSubscribeService moviePtSubscribeService;
    private final ExecutorService sseExecutor = new ThreadPoolExecutor(2, Math.max(4, Runtime.getRuntime().availableProcessors()), 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(128), runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("pt-subscribe-sse-" + SSE_THREAD_ID.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }, new ThreadPoolExecutor.CallerRunsPolicy());

    @GetMapping
    public List<MoviePtSubscribe> list(@RequestParam(value="state", required=false) String state) {
        return this.moviePtSubscribeService.list(state);
    }

    @GetMapping(value={"{id}"})