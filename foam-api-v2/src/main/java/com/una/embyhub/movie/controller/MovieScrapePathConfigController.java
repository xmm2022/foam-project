/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.movie.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.movie.model.MovieScrapePathConfig;
import com.una.embyhub.movie.model.MovieScrapePathConfigRequest;
import com.una.embyhub.movie.service.MovieScrapePathConfigService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.Generated;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"movie/scrape-paths"})
@Validated
@SaCheckPermission(value={"admin"})
public class MovieScrapePathConfigController {
    private final MovieScrapePathConfigService movieScrapePathConfigService;

    @GetMapping
    public List<MovieScrapePathConfig> list() {
        return this.movieScrapePathConfigService.list();
    }

    @GetMapping(value={"{id}"})
    public MovieScrapePathConfig detail(@PathVariable(value="id") Long id) {
        return this.movieScrapePathConfigService.getById(id);
    }

    @PostMapping
    public MovieScrapePathConfig save(@RequestBody @Valid MovieScrapePathConfigRequest request) {
        return this.movieScrapePathConfigService.save(request);
    }

    @DeleteMapping(value={"{id}"})
    public void delete(@PathVariable(value="id") Long id) {
        this.movieScrapePathConfigService.delete(id);
    }

    @Generated
    public MovieScrapePathConfigController(MovieScrapePathConfigService movieScrapePathConfigService) {
        this.movieScrapePathConfigService = movieScrapePathConfigService;
    }
}