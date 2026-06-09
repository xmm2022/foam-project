/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  info.movito.themoviedbapi.TmdbApi
 *  info.movito.themoviedbapi.model.core.Genre
 *  info.movito.themoviedbapi.model.core.MovieResultsPage
 *  info.movito.themoviedbapi.model.core.video.VideoResults
 *  info.movito.themoviedbapi.model.movies.Credits
 *  info.movito.themoviedbapi.model.movies.Images
 *  info.movito.themoviedbapi.model.movies.KeywordResults
 *  info.movito.themoviedbapi.model.movies.MovieDb
 *  info.movito.themoviedbapi.tools.TmdbException
 *  info.movito.themoviedbapi.tools.appendtoresponse.MovieAppendToResponse
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
import info.movito.themoviedbapi.model.core.MovieResultsPage;
import info.movito.themoviedbapi.model.core.video.VideoResults;
import info.movito.themoviedbapi.model.movies.Credits;
import info.movito.themoviedbapi.model.movies.Images;
import info.movito.themoviedbapi.model.movies.KeywordResults;
import info.movito.themoviedbapi.model.movies.MovieDb;
import info.movito.themoviedbapi.tools.TmdbException;
import info.movito.themoviedbapi.tools.appendtoresponse.MovieAppendToResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"movie"})
public class MovieDbApiController {
    @Autowired
    private TmdbApi tmdbApi;
    @Autowired
    private MovieDbUtils movieDbUtils;

    @PostMapping(value={"{movieId}"})
    public MovieDb getMovieDetails(@PathVariable int movieId, @RequestParam String language, MovieAppendToResponse ... appendToResponse) throws TmdbException {
        MovieDb movieDb = this.tmdbApi.getMovies().getDetails(movieId, language, appendToResponse);
        return movieDb;
    }

    @PostMapping(value={"getMovieCredits"})
    public Credits getMovieCredits(@RequestParam int movieId, @RequestParam String language) throws TmdbException {
        Credits credits = this.tmdbApi.getMovies().getCredits(movieId, language);
        return credits;
    }

    @PostMapping(value={"getMovieKeywords"})
    public KeywordResults getMovieKeywords(@RequestParam int movieId) throws TmdbException {
        KeywordResults keywordResults = this.tmdbApi.getMovies().getKeywords(movieId);
        return keywordResults;
    }

    @PostMapping(value={"getMovieVideos"})
    public VideoResults getMovieVideos(@RequestParam int movieId, @RequestParam String language) throws TmdbException {
        VideoResults videoResults = this.tmdbApi.getMovies().getVideos(movieId, language);
        return videoResults;
    }

    @PostMapping(value={"getMovieImages"})
    public Images getMovieImages(@RequestParam int movieId, @RequestParam String includeImageLanguage) throws TmdbException {
        Images images = this.tmdbApi.getMovies().getImages(movieId, "zh-CN", new String[]{includeImageLanguage});
        return images;
    }