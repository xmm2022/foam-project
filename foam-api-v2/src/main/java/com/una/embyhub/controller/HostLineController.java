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
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.hostline.HostLineRequest;
import com.una.embyhub.model.dto.request.hostline.HostLineSave;
import com.una.embyhub.model.dto.request.hostline.HostLineUpdate;
import com.una.embyhub.model.dto.response.hostline.HostLineResponse;
import com.una.embyhub.service.HostLineService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"hostLine"})
@SkipLicense
public class HostLineController {
    @Autowired
    private HostLineService hostLineService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    public Page<HostLineResponse> select(@RequestBody MybatisPlusPage<HostLineRequest> page) {
        return this.hostLineService.select(page);
    }

    @PostMapping(value={"available"})
    public List<HostLineResponse> listAvailable(@RequestParam Long embyInfoId) {
        return this.hostLineService.listAvailableLines(embyInfoId);
    }

    @PostMapping(value={"myLines"})
    public List<HostLineResponse> listMyLines() {
        return this.hostLineService.listCurrentUserLines();
    }

    @PostMapping(value={"insert"})
    @SaCheckPermission(value={"admin"})
    public void insert(@RequestBody HostLineSave save) {
        this.hostLineService.insertHostLine(save);
    }

    @PostMapping(value={"update"})
    @SaCheckPermission(value={"admin"})
    public void update(@RequestBody HostLineUpdate update) {
        this.hostLineService.updateHostLine(update);
    }

    @PostMapping(value={"delete"})
    @SaCheckPermission(value={"admin"})
    public void delete(@RequestParam List<Long> ids) {
        this.hostLineService.deleteHostLine(ids);
    }
}