/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.model.dto.request.telegram.HeroListRequest;
import com.una.embyhub.model.dto.request.telegram.MediaListRequest;
import com.una.embyhub.model.dto.request.telegram.MediaSearchRequest;
import com.una.embyhub.service.TelegramMediaService;
import lombok.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"media"})
public class TelegramMediaController {
    private final TelegramMediaService mediaService;

    @GetMapping(value={"hero"})
    public JSONObject getHeroList(HeroListRequest request) {
        return this.mediaService.getHeroList(request.getTimeWindow(), request.getPage());
    }

    @GetMapping(value={"list"})
    public JSONObject getList(MediaListRequest request) {
        JSONObject result = this.mediaService.getList(request.getMediaType(), request.getCategory(), request.getPage() != null ? request.getPage() : 1);
        return result;
    }

    @GetMapping(value={"search"})
    public JSONObject search(MediaSearchRequest request) {
        JSONObject result = this.mediaService.search(request.getMediaType(), request.getQuery(), request.getPage() != null ? request.getPage() : 1);
        return result;
    }

    @GetMapping(value={"{mediaType}/{id}"})
    public JSONObject getDetails(@PathVariable String mediaType, @PathVariable Long id) {
        JSONObject result = this.mediaService.getDetails(mediaType, id);
        return result;
    }

    @GetMapping(value={"tv/{tvId}/season/{seasonNumber}"})
    public JSONObject getSeasonDetails(@PathVariable Long tvId, @PathVariable int seasonNumber) {
        JSONObject result = this.mediaService.getSeasonDetails(tvId, seasonNumber);
        return result;
    }

    @Generated
    public TelegramMediaController(TelegramMediaService mediaService) {
        this.mediaService = mediaService;
    }
}