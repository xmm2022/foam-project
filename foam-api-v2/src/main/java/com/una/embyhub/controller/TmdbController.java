/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  info.movito.themoviedbapi.model.core.multi.MultiResultsPage
 *  info.movito.themoviedbapi.model.find.FindResults
 *  info.movito.themoviedbapi.model.movies.MovieDb
 *  info.movito.themoviedbapi.model.tv.episode.TvEpisodeDb
 *  info.movito.themoviedbapi.model.tv.season.TvSeasonDb
 *  info.movito.themoviedbapi.model.tv.series.TvSeriesDb
 *  info.movito.themoviedbapi.tools.TmdbException
 *  info.movito.themoviedbapi.tools.appendtoresponse.MovieAppendToResponse
 *  info.movito.themoviedbapi.tools.appendtoresponse.TvEpisodesAppendToResponse
 *  info.movito.themoviedbapi.tools.appendtoresponse.TvSeasonsAppendToResponse
 *  info.movito.themoviedbapi.tools.appendtoresponse.TvSeriesAppendToResponse
 *  info.movito.themoviedbapi.tools.model.time.ExternalSource
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.util.StringUtils
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.foam.client.TmdbClient;
import com.una.embyhub.model.dto.request.tmdb.UpcomingTrailersRequest;
import com.una.embyhub.model.dto.response.telegram.PublisherGroupResponse;
import com.una.embyhub.model.dto.response.tmdb.TmdbResponse;
import com.una.embyhub.model.dto.response.tmdb.TmdbSettingsResponse;
import com.una.embyhub.service.TmdbService;
import info.movito.themoviedbapi.model.core.multi.MultiResultsPage;
import info.movito.themoviedbapi.model.find.FindResults;
import info.movito.themoviedbapi.model.movies.MovieDb;
import info.movito.themoviedbapi.model.tv.episode.TvEpisodeDb;
import info.movito.themoviedbapi.model.tv.season.TvSeasonDb;
import info.movito.themoviedbapi.model.tv.series.TvSeriesDb;
import info.movito.themoviedbapi.tools.TmdbException;
import info.movito.themoviedbapi.tools.appendtoresponse.MovieAppendToResponse;
import info.movito.themoviedbapi.tools.appendtoresponse.TvEpisodesAppendToResponse;
import info.movito.themoviedbapi.tools.appendtoresponse.TvSeasonsAppendToResponse;
import info.movito.themoviedbapi.tools.appendtoresponse.TvSeriesAppendToResponse;
import info.movito.themoviedbapi.tools.model.time.ExternalSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"tmdb"})
@SkipLicense
public class TmdbController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(TmdbController.class);
    @Autowired