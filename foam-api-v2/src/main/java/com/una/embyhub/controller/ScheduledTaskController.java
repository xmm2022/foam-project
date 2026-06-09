/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.job.ScheduledTaskExplorer;
import com.una.embyhub.config.job.ScheduledTaskInfo;
import com.una.embyhub.config.job.ScheduledTaskRuntimeManager;
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.config.license.RequireProduct;
import com.una.embyhub.model.dto.request.scheduledtask.ScheduledTaskCronBatchResetRequest;
import com.una.embyhub.model.dto.request.scheduledtask.ScheduledTaskCronResetRequest;
import com.una.embyhub.model.dto.request.scheduledtask.ScheduledTaskCronUpdateRequest;
import com.una.embyhub.model.dto.request.scheduledtask.ScheduledTaskRunNowRequest;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"scheduledTask"})
public class ScheduledTaskController {
    private final ScheduledTaskExplorer explorer;
    private final ScheduledTaskRuntimeManager runtimeManager;

    public ScheduledTaskController(ScheduledTaskExplorer explorer, ScheduledTaskRuntimeManager runtimeManager) {
        this.explorer = explorer;
        this.runtimeManager = runtimeManager;
    }

    @GetMapping(value={"listAll"})
    public List<ScheduledTaskInfo> listAll() {
        return this.explorer.listAllTasks();
    }

    @PostMapping(value={"updateCron"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public void updateCron(@RequestBody @Validated ScheduledTaskCronUpdateRequest request) {
        this.runtimeManager.updateCron(request.getKey(), request.getCron());
    }

    @PostMapping(value={"resetCron"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public void resetCron(@RequestBody @Validated ScheduledTaskCronResetRequest request) {
        this.runtimeManager.resetCron(request.getKey());
    }

    @PostMapping(value={"resetCronBatch"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public void resetCronBatch(@RequestBody @Validated ScheduledTaskCronBatchResetRequest request) {
        this.runtimeManager.resetCronBatch(request.getKeys());
    }

    @PostMapping(value={"resetCronAll"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public void resetCronAll() {
        this.runtimeManager.resetCronAll();
    }

    @PostMapping(value={"runNow"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public void runNow(@RequestBody @Validated ScheduledTaskRunNowRequest request) {