/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.Valid
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.http.ResponseEntity
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.douban.DoubanHotRequest;
import com.una.embyhub.model.dto.request.douban.DoubanSearchRequest;
import com.una.embyhub.model.dto.response.douban.DoubanIdMappingResponse;
import com.una.embyhub.model.dto.response.douban.DoubanPageResponse;
import com.una.embyhub.model.dto.response.douban.DoubanSubjectResponse;
import com.una.embyhub.model.dto.response.douban.DoubanTmdbDetailResponse;
import com.una.embyhub.service.DoubanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"douban"})
@SkipLicense
public class DoubanController {
    @Autowired
    private DoubanService doubanService;

    @PostMapping(value={"trending"})
    public DoubanPageResponse trending(@RequestBody @Valid DoubanHotRequest request) {
        return this.doubanService.trending(request);
    }

    @PostMapping(value={"search"})
    public DoubanPageResponse search(@RequestBody @Valid DoubanSearchRequest request) {
        return this.doubanService.search(request);
    }

    @GetMapping(value={"subject/{doubanId}"})
    public DoubanSubjectResponse subject(@PathVariable String doubanId) {
        return this.doubanService.getSubject(doubanId);
    }

    @GetMapping(value={"ids/{doubanId}"})
    public DoubanIdMappingResponse idMapping(@PathVariable String doubanId) {
        return this.doubanService.getIdMapping(doubanId);
    }

    @GetMapping(value={"tmdb/{doubanId}"})
    public DoubanTmdbDetailResponse tmdbDetail(@PathVariable String doubanId) {
        return this.doubanService.getTmdbDetail(doubanId);
    }

    @GetMapping(value={"image"})
    public ResponseEntity<byte[]> proxyImage(@RequestParam(value="url") String imageUrl) {
        return this.doubanService.proxyImage(imageUrl);
    }
}