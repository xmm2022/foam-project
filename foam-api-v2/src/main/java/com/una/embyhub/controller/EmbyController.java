/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.alibaba.fastjson2.JSONObject
 *  embyclient.ApiException
 *  embyclient.model.QueryResultBaseItemDto
 *  jakarta.servlet.http.HttpServletRequest
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.util.StringUtils
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.emby.GetItemsRequest;
import com.una.embyhub.model.dto.request.emby.PublisherSearchRequest;
import com.una.embyhub.model.dto.response.emby.EmbySettingsResponse;
import com.una.embyhub.model.dto.response.emby.EmbyStudioPresetResponse;
import com.una.embyhub.model.dto.response.emby.GetEmbyUrlResponse;
import com.una.embyhub.model.dto.response.emby.GetEpisodesByIdResponse;
import com.una.embyhub.model.dto.response.emby.NowPlayingGroupedResponse;
import com.una.embyhub.model.dto.response.emby.PublisherSearchResponse;
import com.una.embyhub.model.dto.response.emby.QueryResultBaseItemResponse;
import com.una.embyhub.model.dto.response.emby.StatsResponse;
import com.una.embyhub.service.EmbyService;
import embyclient.ApiException;
import embyclient.model.QueryResultBaseItemDto;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"emby"})
@SkipLicense
public class EmbyController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyController.class);
    @Autowired
    private EmbyService embyService;

    @PostMapping(value={"getItems"})
    public QueryResultBaseItemResponse getItems(@RequestBody GetItemsRequest getItemsRequest) throws ApiException {
        return this.embyService.getItems(getItemsRequest);
    }

    @PostMapping(value={"stats"})
    public StatsResponse stats() {
        return this.embyService.stats();
    }

    @PostMapping(value={"notifier"})
    public void notifier(@RequestBody JSONObject data) {
        this.embyService.notifier(data);
    }