/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  info.movito.themoviedbapi.TmdbApi
 *  info.movito.themoviedbapi.model.core.MovieResultsPage
 *  info.movito.themoviedbapi.model.core.TvSeriesResultsPage
 *  info.movito.themoviedbapi.tools.TmdbException
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import com.una.embyhub.model.dto.response.tmdb.MediaItemResponse;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.model.core.MovieResultsPage;
import info.movito.themoviedbapi.model.core.TvSeriesResultsPage;
import info.movito.themoviedbapi.tools.TmdbException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class MovieDbUtils {
    @Autowired
    private TmdbApi tmdbApi;
    private static final double WEIGHT_VOTE_AVERAGE = 0.6;
    private static final double WEIGHT_POPULARITY = 0.3;
    private static final double WEIGHT_RELEASE_DATE = 0.1;

    public String fetchMediaItemResponses(int pages, Integer type) throws TmdbException {
        ArrayList<MediaItemResponse> items = new ArrayList<MediaItemResponse>();
        for (int page = 1; page <= pages; ++page) {
            if (type == 1) {
                MovieResultsPage movieResultsPage = this.tmdbApi.getMovieLists().getPopular(null, Integer.valueOf(page), null);
                movieResultsPage.getResults().forEach(movie -> {
                    String id = String.valueOf(movie.getId());
                    double voteAverage = movie.getVoteAverage() != null ? movie.getVoteAverage() : 0.0;
                    double popularity = movie.getPopularity() != null ? movie.getPopularity() : 0.0;
                    String releaseDateStr = "";
                    releaseDateStr = StringUtils.hasText((String)movie.getReleaseDate()) ? movie.getReleaseDate() : "";
                    items.add(new MediaItemResponse(id, voteAverage, popularity, releaseDateStr, 0.0));
                });
            }
            if (type != 2) continue;
            TvSeriesResultsPage tvSeriesResultsPage = this.tmdbApi.getTvSeriesLists().getPopular(null, Integer.valueOf(page));
            tvSeriesResultsPage.getResults().forEach(tvSeries -> {
                String id = String.valueOf(tvSeries.getId());
                double voteAverage = tvSeries.getVoteAverage() != null ? tvSeries.getVoteAverage() : 0.0;
                double popularity = tvSeries.getPopularity() != null ? tvSeries.getPopularity() : 0.0;
                String releaseDateStr = "";
                releaseDateStr = StringUtils.hasText((String)tvSeries.getFirstAirDate()) ? tvSeries.getFirstAirDate() : "";
                items.add(new MediaItemResponse(id, voteAverage, popularity, releaseDateStr, 0.0));
            });
        }
        String id = MovieDbUtils.calculateBestMediaItemResponse(items).getId();
        return id;
    }

    private static MediaItemResponse calculateBestMediaItemResponse(List<MediaItemResponse> items) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        return items.stream().filter(item -> !item.getReleaseDate().isEmpty()).peek(item -> {
            try {
                LocalDate releaseDate = LocalDate.parse(item.getReleaseDate(), formatter);
                long daysSinceRelease = ChronoUnit.DAYS.between(releaseDate, currentDate);
                double normalizedVote = item.getVoteAverage() / 10.0;
                double normalizedPopularity = Math.min(item.getPopularity() / 100.0, 1.0);
                double dateFactor = Math.exp((double)(-daysSinceRelease) / 180.0);
                double score = normalizedVote * 0.6 + normalizedPopularity * 0.3 + dateFactor * 0.1;
                item.setScore(score);
            }
            catch (Exception e) {
                item.setScore(0.0);
            }
        }).max(Comparator.comparingDouble(MediaItemResponse::getScore)).orElseThrow(() -> new IllegalStateException("No media items found"));
    }
}
