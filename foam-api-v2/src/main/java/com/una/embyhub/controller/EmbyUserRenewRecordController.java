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
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.embyuserrecord.EmbyUserRenewRecordRequest;
import com.una.embyhub.model.dto.response.embyuserrecord.EmbyUserRenewRecordResponse;
import com.una.embyhub.service.EmbyUserRenewRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyUserRenewRecord"})
public class EmbyUserRenewRecordController {
    @Autowired
    private EmbyUserRenewRecordService embyUserRenewRecordService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    public Page<EmbyUserRenewRecordResponse> select(@RequestBody MybatisPlusPage<EmbyUserRenewRecordRequest> page) {
        return this.embyUserRenewRecordService.select(page);
    }
}