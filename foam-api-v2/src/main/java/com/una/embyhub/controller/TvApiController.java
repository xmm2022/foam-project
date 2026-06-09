/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  info.movito.themoviedbapi.TmdbApi
 *  info.movito.themoviedbapi.model.core.Genre
 *  info.movito.themoviedbapi.model.core.TvKeywords
 *  info.movito.themoviedbapi.model.core.TvSeriesResultsPage
 *  info.movito.themoviedbapi.model.core.video.VideoResults
 *  info.movito.themoviedbapi.model.tv.core.credits.Credits
 *  info.movito.themoviedbapi.model.tv.series.Images
 *  info.movito.themoviedbapi.model.tv.series.TvSeriesDb
 *  info.movito.themoviedbapi.tools.TmdbException
 *  info.movito.themoviedbapi.tools.appendtoresponse.TvSeriesAppendToResponse
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.config.common.utils.MovieDbUtils;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.model.core.Genre;
import info.movito.themoviedbapi.model.core.TvKeywords;
import info.movito.themoviedbapi.model.core.TvSeriesResultsPage;
import info.movito.themoviedbapi.model.core.video.VideoResults;
import info.movito.themoviedbapi.model.tv.core.credits.Credits;
import info.movito.themoviedbapi.model.tv.series.Images;
import info.movito.themoviedbapi.model.tv.series.TvSeriesDb;
import info.movito.themoviedbapi.tools.TmdbException;
import info.movito.themoviedbapi.tools.appendtoresponse.TvSeriesAppendToResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"tv"})
public class TvApiController {
    @Autowired
    private TmdbApi tmdbApi;
    @Autowired
    private MovieDbUtils movieDbUtils;

    @PostMapping(value={"{tvId}"})
    public TvSeriesDb getTvDetails(@PathVariable int tvId, @RequestParam String language, TvSeriesAppendToResponse ... appendToResponse) throws TmdbException {
        TvSeriesDb tvSeriesDb = this.tmdbApi.getTvSeries().getDetails(tvId, language, appendToResponse);
        return tvSeriesDb;
    }

    @PostMapping(value={"getTvCredits"})
    public Credits getTvCredits(@RequestParam int tvId, @RequestParam String language) throws TmdbException {
        Credits credits = this.tmdbApi.getTvSeries().getCredits(tvId, language);
        return credits;
    }

    @PostMapping(value={"getTvKeywords"})
    public TvKeywords getTvKeywords(@RequestParam int tvId) throws TmdbException {
        TvKeywords tvKeywords = this.tmdbApi.getTvSeries().getKeywords(tvId);
        return tvKeywords;
    }

    @PostMapping(value={"getTvImages"})
    public Images getTvImages(@RequestParam int tvId, @RequestParam String includeImageLanguage) throws TmdbException {
        Images images = this.tmdbApi.getTvSeries().getImages(tvId, "zh-CN", new String[]{includeImageLanguage});
        return images;
    }

    @PostMapping(value={"getTvList"})
    public List<Genre> getTvList(@RequestParam String language) throws TmdbException {
        List genreList = this.tmdbApi.getGenre().getTvList(language);
        return genreList;
    }