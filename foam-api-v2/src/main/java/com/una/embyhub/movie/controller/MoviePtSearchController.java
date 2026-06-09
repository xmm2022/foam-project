/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.annotation.PreDestroy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 */
package com.una.embyhub.movie.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.movie.model.MoviePtSearchProgressEvent;
import com.una.embyhub.movie.model.MoviePtSearchResult;
import com.una.embyhub.movie.service.MoviePtSearchService;
import jakarta.annotation.PreDestroy;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping(value={"movie/pt-search"})
@SaCheckPermission(value={"admin"})
public class MoviePtSearchController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MoviePtSearchController.class);
    private static final long SSE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(5L);
    private static final AtomicInteger SSE_THREAD_ID = new AtomicInteger(1);
    private final MoviePtSearchService moviePtSearchService;
    private final ExecutorService sseExecutor = new ThreadPoolExecutor(2, Math.max(4, Runtime.getRuntime().availableProcessors()), 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(128), runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("pt-search-sse-" + SSE_THREAD_ID.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }, new ThreadPoolExecutor.CallerRunsPolicy());

    @GetMapping
    public List<MoviePtSearchResult> search(@RequestParam(value="keyword") String keyword, @RequestParam(value="siteId", required=false) Long siteId, @RequestParam(value="limit", defaultValue="20") Integer limit, @RequestParam(value="title", required=false) String title, @RequestParam(value="original_title", required=false) String originalTitle, @RequestParam(value="year", required=false) String year, @RequestParam(value="type", required=false) String type) {
        return this.moviePtSearchService.search(keyword, siteId, limit, title, originalTitle, year, type);
    }

    @GetMapping(value={"/stream"}, produces={"text/event-stream"})
    public SseEmitter searchStream(@RequestParam(value="keyword") String keyword, @RequestParam(value="siteId", required=false) Long siteId, @RequestParam(value="limit", defaultValue="20") Integer limit, @RequestParam(value="title", required=false) String title, @RequestParam(value="original_title", required=false) String originalTitle, @RequestParam(value="year", required=false) String year, @RequestParam(value="type", required=false) String type) {
        SseEmitter emitter = new SseEmitter(Long.valueOf(SSE_TIMEOUT_MILLIS));
        Object sendLock = new Object();
        CompletableFuture.runAsync(() -> {
            try {
                this.moviePtSearchService.searchWithProgress(keyword, siteId, limit, title, originalTitle, year, type, event -> this.sendProgressEvent(emitter, sendLock, (MoviePtSearchProgressEvent)event));
                Object object = sendLock;
                synchronized (object) {
                    emitter.complete();
                }
            }
            catch (Exception e) {
                log.warn("PT \u641c\u7d22 SSE \u63a8\u9001\u5f02\u5e38: {}", (Object)e.getMessage());
                this.sendProgressEvent(emitter, sendLock, MoviePtSearchProgressEvent.builder().type("STREAM_ERROR").keyword(keyword).message(e.getMessage()).build());
                Object object = sendLock;
                synchronized (object) {
                    emitter.completeWithError((Throwable)e);
                }
            }
        }, this.sseExecutor);