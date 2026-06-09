/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.simultaneous.SimultaneousPlaybackRecordRequest;
import com.una.embyhub.model.dto.response.simultaneous.SimultaneousPlaybackRecordResponse;
import com.una.embyhub.service.SimultaneousPlaybackRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"simultaneousPlayback"})
@SkipLicense
public class SimultaneousPlaybackRecordController {
    @Autowired
    private SimultaneousPlaybackRecordService simultaneousPlaybackRecordService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.QUERY_SIMULTANEOUS_PLAYBACK, type=OperationType.QUERY)
    public Page<SimultaneousPlaybackRecordResponse> select(@RequestBody MybatisPlusPage<SimultaneousPlaybackRecordRequest> page) {
        return this.simultaneousPlaybackRecordService.select(page);
    }
}