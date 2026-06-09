/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.util.StringUtils
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.foam.controller;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.foam.client.TmdbClient;
import com.una.embyhub.foam.service.TmdbRecommendationService;
import com.una.embyhub.service.EmbyApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/foam/tmdb"})
@SkipLicense
public class FoamTmdbController {
    @Autowired
    private TmdbClient tmdbClient;
    @Autowired
    private TmdbRecommendationService tmdbRecommendationService;
    @Autowired
    private EmbyApiClientService embyApiClientService;

    @GetMapping(value={"/library-status"})
    public Boolean getLibraryStatus(@RequestParam String tmdbId) {
        if (!StringUtils.hasText((String)tmdbId)) {
            return false;
        }
        return this.embyApiClientService.getEmbyByTmdbId(tmdbId);
    }

    @GetMapping(value={"/trending"})
    public JSONObject trending(@RequestParam(defaultValue="day") String timeWindow, @RequestParam(defaultValue="1") Integer page) {
        return this.tmdbClient.fetchTrending(timeWindow, page);
    }

    @GetMapping(value={"/movies/popular"})
    public JSONObject popularMovies(@RequestParam(defaultValue="1") Integer page) {
        return this.tmdbClient.fetchPopularMovies(page);
    }

    @GetMapping(value={"/tv/popular"})
    public JSONObject popularTv(@RequestParam(defaultValue="1") Integer page) {
        return this.tmdbClient.fetchPopularTv(page);
    }

    @GetMapping(value={"/search/multi"})
    public JSONObject searchMulti(@RequestParam String keyword, @RequestParam(defaultValue="1") Integer page) {
        return this.tmdbClient.searchMulti(keyword, page);
    }

    @GetMapping(value={"/movie/{id}"})
    public JSONObject movieDetail(@PathVariable Long id) {
        return this.tmdbClient.fetchMovieDetail(id);
    }

    @GetMapping(value={"/movie/{id}/videos"})
    public JSONObject movieVideos(@PathVariable Long id) {
        return this.tmdbClient.fetchMovieVideos(id);
    }

    @GetMapping(value={"/tv/{id}"})
    public JSONObject tvDetail(@PathVariable Long id) {
        return this.tmdbClient.fetchTvDetail(id);