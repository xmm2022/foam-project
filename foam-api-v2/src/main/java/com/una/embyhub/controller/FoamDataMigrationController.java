/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.annotation.PreDestroy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.foammigration.FoamDataMigrationRequest;
import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationConnectionResponse;
import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationJobResponse;
import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationPlanResponse;
import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationProgressResponse;
import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationResultResponse;
import com.una.embyhub.service.FoamDataMigrationService;
import jakarta.annotation.PreDestroy;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping(value={"foamMigration"})
@SkipLicense
public class FoamDataMigrationController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(FoamDataMigrationController.class);
    private static final long SSE_TIMEOUT_MILLIS = TimeUnit.HOURS.toMillis(2L);
    private static final AtomicInteger MIGRATION_THREAD_ID = new AtomicInteger(1);
    private static final Set<String> LIGHT_MIGRATION_EXCLUDED_TABLES = Set.of("emby_device", "play_records", "sys_operation_log", "tmdb_episode");
    private final FoamDataMigrationService migrationService;
    private final ConcurrentMap<String, MigrationJob> migrationJobs = new ConcurrentHashMap<String, MigrationJob>();
    private final AtomicReference<String> activeJobId = new AtomicReference();
    private final ExecutorService migrationExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(4), runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("foam-migration-sse-" + MIGRATION_THREAD_ID.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }, new ThreadPoolExecutor.AbortPolicy());

    public FoamDataMigrationController(FoamDataMigrationService migrationService) {
        this.migrationService = migrationService;
    }

    @GetMapping(value={"tables"})