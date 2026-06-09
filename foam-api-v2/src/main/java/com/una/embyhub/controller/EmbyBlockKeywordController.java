/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.core.conditions.Wrapper
 *  com.baomidou.mybatisplus.core.toolkit.Wrappers
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.embyblockkeyword.EmbyBlockKeywordRequest;
import com.una.embyhub.model.dto.request.embyblockkeyword.EmbyClientFilterSettingsRequest;
import com.una.embyhub.model.dto.request.embyclientfilter.EmbyClientFilterRecordRequest;
import com.una.embyhub.model.dto.response.embyblockkeyword.EmbyBlockKeywordResponse;
import com.una.embyhub.model.dto.response.embyblockkeyword.EmbyClientFilterSettingsResponse;
import com.una.embyhub.model.dto.response.embyblockkeyword.EmbyClientFilterStatsResponse;
import com.una.embyhub.model.dto.response.embyclientfilter.EmbyClientFilterRecordResponse;
import com.una.embyhub.model.entity.EmbyBlockKeyword;
import com.una.embyhub.service.EmbyBlockKeywordService;
import com.una.embyhub.service.EmbyClientFilterRecordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyBlockKeyword"})
@SkipLicense
public class EmbyBlockKeywordController {
    @Autowired
    private EmbyBlockKeywordService embyBlockKeywordService;
    @Autowired
    private EmbyClientFilterRecordService embyClientFilterRecordService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    public Page<EmbyBlockKeywordResponse> select(@RequestBody MybatisPlusPage<EmbyBlockKeywordRequest> page) {
        return this.embyBlockKeywordService.select(page);
    }

    @PostMapping(value={"add"})
    @SaCheckPermission(value={"admin"})
    public void add(@RequestBody @Validated EmbyBlockKeywordRequest request) {
        this.embyBlockKeywordService.add(request);
    }

    @PostMapping(value={"update"})
    @SaCheckPermission(value={"admin"})
    public void update(@RequestBody @Validated EmbyBlockKeywordRequest request) {
        this.embyBlockKeywordService.update(request);
    }

    @PostMapping(value={"delete"})
    @SaCheckPermission(value={"admin"})
    public void delete(@RequestParam Long id) {
        this.embyBlockKeywordService.delete(id);
    }

    @GetMapping(value={"enabled"})
    public List<String> getEnabledKeywords() {