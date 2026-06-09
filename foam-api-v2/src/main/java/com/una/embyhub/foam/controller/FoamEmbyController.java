/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  cn.dev33.satoken.stp.StpUtil
 *  com.alibaba.fastjson2.JSONObject
 *  embyclient.ApiClient
 *  embyclient.ApiException
 *  embyclient.api.SystemServiceApi
 *  jakarta.servlet.http.HttpServletResponse
 *  lombok.Generated
 *  org.springframework.http.CacheControl
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.multipart.MultipartFile
 */
package com.una.embyhub.foam.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.dev33.satoken.stp.StpUtil;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.foam.client.EmbyClient;
import com.una.embyhub.model.dto.response.emby.EmbyUrlResponse;
import com.una.embyhub.model.entity.EmbyUser;
import embyclient.ApiClient;
import embyclient.ApiException;
import embyclient.api.SystemServiceApi;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import org.springframework.http.CacheControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value={"/foam/emby"})
public class FoamEmbyController {
    private final EmbyClient embyClient;
    private final EmbyInfoCacheManagerUtils embyInfoCacheManager;

    @GetMapping(value={"/library/counts"})
    @SkipLicense
    public JSONObject libraryCounts(@RequestParam(value="embyInfoId", required=false) Long embyInfoId) {
        EmbyUser embyUser = (EmbyUser)StpUtil.getSession().get("user");
        EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig = embyInfoId != null ? this.embyInfoCacheManager.getRequiredConfigById(embyInfoId) : this.embyInfoCacheManager.getRequiredConfig(embyUser);
        return this.embyClient.getLibraryCounts(serverConfig, embyUser);
    }

    @GetMapping(value={"/library/media-folders"})
    @SaCheckPermission(value={"admin"})
    public JSONObject mediaFolders(@RequestParam(value="embyInfoId") Long embyInfoId) {
        return this.embyClient.getMediaFolders(this.embyInfoCacheManager.getRequiredConfigById(embyInfoId));
    }

    @GetMapping(value={"/library/items"})
    @SaCheckPermission(value={"admin"})
    public JSONObject libraryItems(@RequestParam(value="embyInfoId") Long embyInfoId, @RequestParam(value="parentId") String parentId, @RequestParam(value="limit", defaultValue="20") Integer limit) {
        EmbyUser embyUser = (EmbyUser)StpUtil.getSession().get("user");
        return this.embyClient.getLibraryItems(this.embyInfoCacheManager.getRequiredConfigById(embyInfoId), embyUser, parentId, limit == null ? 20 : limit);
    }

    @GetMapping(value={"/items/{id}/image/{imageType}"})
    @SaCheckPermission(value={"admin"})
    public void itemImage(@PathVariable(value="id") String id, @PathVariable(value="imageType") String imageType, @RequestParam(value="embyInfoId") Long embyInfoId, @RequestParam(value="imageIndex", required=false) Integer imageIndex, @RequestParam(value="width", required=false) Integer width, @RequestParam(value="height", required=false) Integer height, @RequestParam(value="maxWidth", required=false) Integer maxWidth, @RequestParam(value="maxHeight", required=false) Integer maxHeight, @RequestParam(value="quality", defaultValue="90") Integer quality, @RequestParam(value="tag", required=false) String tag, HttpServletResponse response) throws IOException {
        EmbyClient.EmbyImageBytes image = this.embyClient.getItemImage(this.embyInfoCacheManager.getRequiredConfigById(embyInfoId), id, imageType, imageIndex, width, height, maxWidth, maxHeight, quality, tag);
        response.setStatus(200);
        response.setContentType(image.contentType());