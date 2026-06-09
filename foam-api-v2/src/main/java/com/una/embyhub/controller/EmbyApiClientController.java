/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.response.emby.EmbyTmdbResponse;
import com.una.embyhub.service.EmbyApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyApiClient"})
@SkipLicense
public class EmbyApiClientController {
    @Autowired
    private EmbyApiClientService embyApiClientService;

    @PostMapping(value={"getEmbyTmdbResponseByTmdbIdAll"})
    public EmbyTmdbResponse getEmbyTmdbResponseByTmdbIdAll(@RequestParam String tmdbId) {
        return this.embyApiClientService.getEmbyTmdbResponseByTmdbIdAll(tmdbId);
    }

    @PostMapping(value={"getEmbyTmdbResponseByTmdbId"})
    public EmbyTmdbResponse getEmbyTmdbResponseByTmdbId(@RequestParam String tmdbId) {
        return this.embyApiClientService.getEmbyTmdbResponseByTmdbId(tmdbId);
    }
}