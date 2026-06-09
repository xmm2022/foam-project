/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.validation.Valid
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.PutMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.movie.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.movie.model.MovieActionResponse;
import com.una.embyhub.movie.model.MovieQbittorrentAddRequest;
import com.una.embyhub.movie.model.MovieQbittorrentConfig;
import com.una.embyhub.movie.model.MovieQbittorrentConfigRequest;
import com.una.embyhub.movie.model.MovieQbittorrentTorrent;
import com.una.embyhub.movie.service.MovieQbittorrentService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.Generated;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"movie/qbittorrent"})
@Validated
@SaCheckPermission(value={"admin"})
public class MovieQbittorrentController {
    private final MovieQbittorrentService qbittorrentService;

    @GetMapping(value={"config"})
    public MovieQbittorrentConfig getConfig() {
        return this.qbittorrentService.getConfig();
    }

    @PostMapping(value={"config"})
    public MovieQbittorrentConfig saveConfig(@RequestBody @Valid MovieQbittorrentConfigRequest request) {
        return this.qbittorrentService.saveConfig(request);
    }

    @PostMapping(value={"config/create"})
    public MovieQbittorrentConfig createConfig(@RequestBody @Valid MovieQbittorrentConfigRequest request) {
        return this.qbittorrentService.createConfig(request);
    }

    @PutMapping(value={"config/{id}"})
    public MovieQbittorrentConfig updateConfig(@PathVariable(value="id") Long id, @RequestBody @Valid MovieQbittorrentConfigRequest request) {
        return this.qbittorrentService.updateConfig(id, request);
    }

    @GetMapping(value={"config/{id}"})
    public MovieQbittorrentConfig getConfigById(@PathVariable(value="id") Long id) {
        return this.qbittorrentService.getConfigById(id);
    }

    @GetMapping(value={"config/list"})
    public List<MovieQbittorrentConfig> listConfigs() {
        return this.qbittorrentService.listConfigs();