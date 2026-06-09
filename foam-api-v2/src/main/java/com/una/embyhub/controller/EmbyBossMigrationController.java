/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.validation.Valid
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.embybossmigration.EmbyBossMigrationRequest;
import com.una.embyhub.model.dto.response.embybossmigration.EmbyBossMigrationResultResponse;
import com.una.embyhub.pointsbot.config.PointsBotInitializer;
import com.una.embyhub.service.EmbyBossMigrationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyBossMigration"})
@SkipLicense
public class EmbyBossMigrationController {
    private final EmbyBossMigrationService embyBossMigrationService;
    private final PointsBotInitializer pointsBotInitializer;

    public EmbyBossMigrationController(EmbyBossMigrationService embyBossMigrationService, PointsBotInitializer pointsBotInitializer) {
        this.embyBossMigrationService = embyBossMigrationService;
        this.pointsBotInitializer = pointsBotInitializer;
    }

    @PostMapping(value={"preview"})
    @SaCheckPermission(value={"admin"})
    public EmbyBossMigrationResultResponse preview(@RequestBody @Valid EmbyBossMigrationRequest request) {
        return this.embyBossMigrationService.preview(request);
    }

    @PostMapping(value={"sync"})
    @SaCheckPermission(value={"admin"})
    public EmbyBossMigrationResultResponse sync(@RequestBody @Valid EmbyBossMigrationRequest request) {
        EmbyBossMigrationResultResponse result = this.embyBossMigrationService.sync(request);
        if (result.getPointsBotConfigUpdated() != null && result.getPointsBotConfigUpdated() > 0L) {
            this.pointsBotInitializer.restart();
        }
        return result;
    }
}