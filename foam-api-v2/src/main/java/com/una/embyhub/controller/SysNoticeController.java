/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.sysnotice.SysNoticePageRequest;
import com.una.embyhub.model.dto.response.sysnotice.SysNoticeResponse;
import com.una.embyhub.model.entity.SysNotice;
import com.una.embyhub.service.SysNoticeService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.Generated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"sysNotice"})
public class SysNoticeController {
    private final SysNoticeService sysNoticeService;

    @PostMapping(value={"select"})
    @SkipLicense
    public Page<SysNoticeResponse> select(@RequestBody @Valid MybatisPlusPage<SysNoticePageRequest> page) {
        return this.sysNoticeService.select(page);
    }

    @PostMapping(value={"publicExternal"})
    @SkipLicense
    public List<SysNoticeResponse> publicExternal() {
        return this.sysNoticeService.publicExternalList();
    }

    @PostMapping(value={"siteList"})
    @SkipLicense
    public List<SysNoticeResponse> siteList() {
        return this.sysNoticeService.siteList();
    }

    @PostMapping(value={"unreadCount"})
    @SkipLicense
    public Long unreadCount() {
        return this.sysNoticeService.unreadCount();
    }

    @PostMapping(value={"read/{id}"})
    @SkipLicense
    public Boolean markRead(@PathVariable Long id) {
        return this.sysNoticeService.markRead(id);
    }

    @PostMapping(value={"insert"})
    @SaCheckPermission(value={"admin"})
    public Boolean insert(@RequestBody SysNotice sysNotice) {
        return this.sysNoticeService.insert(sysNotice);
    }

    @PostMapping(value={"update"})
    @SaCheckPermission(value={"admin"})
    public Boolean update(@RequestBody SysNotice sysNotice) {
        return this.sysNoticeService.update(sysNotice);
    }