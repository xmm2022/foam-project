/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  cn.hutool.http.HttpUtil
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.hutool.http.HttpUtil;
import com.una.embyhub.model.dto.request.systemtool.UrlConnectivityRequest;
import com.una.embyhub.model.dto.response.systemtool.UrlConnectivityResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"systemTool"})
public class SystemToolController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(SystemToolController.class);
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @PostMapping(value={"connectivity"})
    @SaCheckPermission(value={"admin"})
    public List<UrlConnectivityResponse> checkConnectivity(@RequestBody UrlConnectivityRequest request) {
        List<String> urls = request.getUrls();
        if (urls == null || urls.isEmpty()) {
            return new ArrayList<UrlConnectivityResponse>();
        }
        List futures = urls.stream().map(url -> CompletableFuture.supplyAsync(() -> this.testSingleUrl((String)url), this.executorService)).collect(Collectors.toList());
        return futures.stream().map(CompletableFuture::join).collect(Collectors.toList());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private UrlConnectivityResponse testSingleUrl(String urlStr) {
        UrlConnectivityResponse response = new UrlConnectivityResponse();
        response.setUrl(urlStr);
        long startTime = System.currentTimeMillis();
        try {
            HttpUtil.createGet((String)urlStr).timeout(5000).execute();
            response.setSuccess(true);
        }
        catch (Exception e) {
            response.setSuccess(false);
            response.setErrorMessage(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        finally {
            long endTime = System.currentTimeMillis();
            response.setDurationMs(endTime - startTime);
        }
        return response;
    }
}