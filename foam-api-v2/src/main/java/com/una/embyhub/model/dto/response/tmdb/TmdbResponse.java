/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class TmdbResponse
implements Serializable {
    @JsonProperty(value="page")
    private Integer page;
    @JsonProperty(value="total_pages")
    private Integer totalPages;
    @JsonProperty(value="total_results")
    private Integer totalResults;
    @JsonProperty(value="results")
    private List<Result> results;

    @Generated
    public Integer getPage() {
        return this.page;
    }

    @Generated
    public Integer getTotalPages() {
        return this.totalPages;
    }

    @Generated
    public Integer getTotalResults() {
        return this.totalResults;
    }

    @Generated
    public List<Result> getResults() {
        return this.results;
    }

    @JsonProperty(value="page")
    @Generated
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty(value="total_pages")
    @Generated
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty(value="total_results")
    @Generated
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty(value="results")
    @Generated
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbResponse)) {
            return false;
        }
        TmdbResponse other = (TmdbResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$page = this.getPage();
        Integer other$page = other.getPage();
        if (this$page == null ? other$page != null : !((Object)this$page).equals(other$page)) {
            return false;
        }
        Integer this$totalPages = this.getTotalPages();
        Integer other$totalPages = other.getTotalPages();
        if (this$totalPages == null ? other$totalPages != null : !((Object)this$totalPages).equals(other$totalPages)) {
            return false;
        }
        Integer this$totalResults = this.getTotalResults();
        Integer other$totalResults = other.getTotalResults();
        if (this$totalResults == null ? other$totalResults != null : !((Object)this$totalResults).equals(other$totalResults)) {
            return false;
        }
        List<Result> this$results = this.getResults();
        List<Result> other$results = other.getResults();
        return !(this$results == null ? other$results != null : !((Object)this$results).equals(other$results));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        Integer $totalPages = this.getTotalPages();
        result = result * 59 + ($totalPages == null ? 43 : ((Object)$totalPages).hashCode());
        Integer $totalResults = this.getTotalResults();
        result = result * 59 + ($totalResults == null ? 43 : ((Object)$totalResults).hashCode());
        List<Result> $results = this.getResults();
        result = result * 59 + ($results == null ? 43 : ((Object)$results).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbResponse(page=" + this.getPage() + ", totalPages=" + this.getTotalPages() + ", totalResults=" + this.getTotalResults() + ", results=" + String.valueOf(this.getResults()) + ")";
    }

    @Generated
    public TmdbResponse() {
    }

    @Generated
    public TmdbResponse(Integer page, Integer totalPages, Integer totalResults, List<Result> results) {
        this.page = page;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
        this.results = results;
    }

    public static class Result
    implements Serializable {
        @JsonProperty(value="media_type")
        private String mediaType;
        @JsonProperty(value="id")
        private int id;
        @JsonProperty(value="adult")
        private Boolean adult;
        @JsonProperty(value="backdrop_path")
        private String backdropPath;
        @JsonProperty(value="genre_ids")
        private List<Integer> genreIds;
        @JsonProperty(value="original_language")
        private String originalLanguage;
        @JsonProperty(value="overview")
        private String overview;
        @JsonProperty(value="popularity")
        private Double popularity;
        @JsonProperty(value="poster_path")
        private String posterPath;
        @JsonProperty(value="vote_average")
        private Double voteAverage;
        @JsonProperty(value="vote_count")
        private Integer voteCount;
        @JsonProperty(value="original_title")
        private String originalTitle;
        @JsonProperty(value="title")
        private String title;
        @JsonProperty(value="video")
        private Boolean video;
        @JsonProperty(value="release_date")
        private String releaseDate;
        @JsonProperty(value="origin_country")
        private List<String> originCountry;
        @JsonProperty(value="original_name")
        private String originalName;
        @JsonProperty(value="name")
        private String name;
        @JsonProperty(value="first_air_date")
        private String firstAirDate;
        private Boolean isExsit;
        private Boolean isSubmitted;

        @Generated
        public String getMediaType() {
            return this.mediaType;
        }

        @Generated
        public int getId() {
            return this.id;
        }

        @Generated
        public Boolean getAdult() {
            return this.adult;
        }

        @Generated
        public String getBackdropPath() {
            return this.backdropPath;
        }

        @Generated
        public List<Integer> getGenreIds() {
            return this.genreIds;
        }

        @Generated
        public String getOriginalLanguage() {
            return this.originalLanguage;
        }

        @Generated
        public String getOverview() {
            return this.overview;
        }

        @Generated
        public Double getPopularity() {
            return this.popularity;
        }

        @Generated
        public String getPosterPath() {
            return this.posterPath;
        }

        @Generated
        public Double getVoteAverage() {
            return this.voteAverage;
        }

        @Generated
        public Integer getVoteCount() {
            return this.voteCount;
        }

        @Generated
        public String getOriginalTitle() {
            return this.originalTitle;
        }

        @Generated
        public String getTitle() {
            return this.title;
        }

        @Generated
        public Boolean getVideo() {
            return this.video;
        }

        @Generated
        public String getReleaseDate() {
            return this.releaseDate;
        }

        @Generated
        public List<String> getOriginCountry() {
            return this.originCountry;
        }

        @Generated
        public String getOriginalName() {
            return this.originalName;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getFirstAirDate() {
            return this.firstAirDate;
        }

        @Generated
        public Boolean getIsExsit() {
            return this.isExsit;
        }

        @Generated
        public Boolean getIsSubmitted() {
            return this.isSubmitted;
        }

        @JsonProperty(value="media_type")
        @Generated
        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        @JsonProperty(value="id")
        @Generated
        public void setId(int id) {
            this.id = id;
        }

        @JsonProperty(value="adult")
        @Generated
        public void setAdult(Boolean adult) {
            this.adult = adult;
        }

        @JsonProperty(value="backdrop_path")
        @Generated
        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        @JsonProperty(value="genre_ids")
        @Generated
        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        @JsonProperty(value="original_language")
        @Generated
        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        @JsonProperty(value="overview")
        @Generated
        public void setOverview(String overview) {
            this.overview = overview;
        }

        @JsonProperty(value="popularity")
        @Generated
        public void setPopularity(Double popularity) {
            this.popularity = popularity;
        }

        @JsonProperty(value="poster_path")
        @Generated
        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        @JsonProperty(value="vote_average")
        @Generated
        public void setVoteAverage(Double voteAverage) {
            this.voteAverage = voteAverage;
        }

        @JsonProperty(value="vote_count")
        @Generated
        public void setVoteCount(Integer voteCount) {
            this.voteCount = voteCount;
        }

        @JsonProperty(value="original_title")
        @Generated
        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        @JsonProperty(value="title")
        @Generated
        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty(value="video")
        @Generated
        public void setVideo(Boolean video) {
            this.video = video;
        }

        @JsonProperty(value="release_date")
        @Generated
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        @JsonProperty(value="origin_country")
        @Generated
        public void setOriginCountry(List<String> originCountry) {
            this.originCountry = originCountry;
        }

        @JsonProperty(value="original_name")
        @Generated
        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        @JsonProperty(value="name")
        @Generated
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty(value="first_air_date")
        @Generated
        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
        }

        @Generated
        public void setIsExsit(Boolean isExsit) {
            this.isExsit = isExsit;
        }

        @Generated
        public void setIsSubmitted(Boolean isSubmitted) {
            this.isSubmitted = isSubmitted;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Result)) {
                return false;
            }
            Result other = (Result)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getId() != other.getId()) {
                return false;
            }
            Boolean this$adult = this.getAdult();
            Boolean other$adult = other.getAdult();
            if (this$adult == null ? other$adult != null : !((Object)this$adult).equals(other$adult)) {
                return false;
            }
            Double this$popularity = this.getPopularity();
            Double other$popularity = other.getPopularity();
            if (this$popularity == null ? other$popularity != null : !((Object)this$popularity).equals(other$popularity)) {
                return false;
            }
            Double this$voteAverage = this.getVoteAverage();
            Double other$voteAverage = other.getVoteAverage();
            if (this$voteAverage == null ? other$voteAverage != null : !((Object)this$voteAverage).equals(other$voteAverage)) {
                return false;
            }
            Integer this$voteCount = this.getVoteCount();
            Integer other$voteCount = other.getVoteCount();
            if (this$voteCount == null ? other$voteCount != null : !((Object)this$voteCount).equals(other$voteCount)) {
                return false;
            }
            Boolean this$video = this.getVideo();
            Boolean other$video = other.getVideo();
            if (this$video == null ? other$video != null : !((Object)this$video).equals(other$video)) {
                return false;
            }
            Boolean this$isExsit = this.getIsExsit();
            Boolean other$isExsit = other.getIsExsit();
            if (this$isExsit == null ? other$isExsit != null : !((Object)this$isExsit).equals(other$isExsit)) {
                return false;
            }
            Boolean this$isSubmitted = this.getIsSubmitted();
            Boolean other$isSubmitted = other.getIsSubmitted();
            if (this$isSubmitted == null ? other$isSubmitted != null : !((Object)this$isSubmitted).equals(other$isSubmitted)) {
                return false;
            }
            String this$mediaType = this.getMediaType();
            String other$mediaType = other.getMediaType();
            if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
                return false;
            }
            String this$backdropPath = this.getBackdropPath();
            String other$backdropPath = other.getBackdropPath();
            if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
                return false;
            }
            List<Integer> this$genreIds = this.getGenreIds();
            List<Integer> other$genreIds = other.getGenreIds();
            if (this$genreIds == null ? other$genreIds != null : !((Object)this$genreIds).equals(other$genreIds)) {
                return false;
            }
            String this$originalLanguage = this.getOriginalLanguage();
            String other$originalLanguage = other.getOriginalLanguage();
            if (this$originalLanguage == null ? other$originalLanguage != null : !this$originalLanguage.equals(other$originalLanguage)) {
                return false;
            }
            String this$overview = this.getOverview();
            String other$overview = other.getOverview();
            if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
                return false;
            }
            String this$posterPath = this.getPosterPath();
            String other$posterPath = other.getPosterPath();
            if (this$posterPath == null ? other$posterPath != null : !this$posterPath.equals(other$posterPath)) {
                return false;
            }
            String this$originalTitle = this.getOriginalTitle();
            String other$originalTitle = other.getOriginalTitle();
            if (this$originalTitle == null ? other$originalTitle != null : !this$originalTitle.equals(other$originalTitle)) {
                return false;
            }
            String this$title = this.getTitle();
            String other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
                return false;
            }
            String this$releaseDate = this.getReleaseDate();
            String other$releaseDate = other.getReleaseDate();
            if (this$releaseDate == null ? other$releaseDate != null : !this$releaseDate.equals(other$releaseDate)) {
                return false;
            }
            List<String> this$originCountry = this.getOriginCountry();
            List<String> other$originCountry = other.getOriginCountry();
            if (this$originCountry == null ? other$originCountry != null : !((Object)this$originCountry).equals(other$originCountry)) {
                return false;
            }
            String this$originalName = this.getOriginalName();
            String other$originalName = other.getOriginalName();
            if (this$originalName == null ? other$originalName != null : !this$originalName.equals(other$originalName)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            String this$firstAirDate = this.getFirstAirDate();
            String other$firstAirDate = other.getFirstAirDate();
            return !(this$firstAirDate == null ? other$firstAirDate != null : !this$firstAirDate.equals(other$firstAirDate));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof Result;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getId();
            Boolean $adult = this.getAdult();
            result = result * 59 + ($adult == null ? 43 : ((Object)$adult).hashCode());
            Double $popularity = this.getPopularity();
            result = result * 59 + ($popularity == null ? 43 : ((Object)$popularity).hashCode());
            Double $voteAverage = this.getVoteAverage();
            result = result * 59 + ($voteAverage == null ? 43 : ((Object)$voteAverage).hashCode());
            Integer $voteCount = this.getVoteCount();
            result = result * 59 + ($voteCount == null ? 43 : ((Object)$voteCount).hashCode());
            Boolean $video = this.getVideo();
            result = result * 59 + ($video == null ? 43 : ((Object)$video).hashCode());
            Boolean $isExsit = this.getIsExsit();
            result = result * 59 + ($isExsit == null ? 43 : ((Object)$isExsit).hashCode());
            Boolean $isSubmitted = this.getIsSubmitted();
            result = result * 59 + ($isSubmitted == null ? 43 : ((Object)$isSubmitted).hashCode());
            String $mediaType = this.getMediaType();
            result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
            String $backdropPath = this.getBackdropPath();
            result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
            List<Integer> $genreIds = this.getGenreIds();
            result = result * 59 + ($genreIds == null ? 43 : ((Object)$genreIds).hashCode());
            String $originalLanguage = this.getOriginalLanguage();
            result = result * 59 + ($originalLanguage == null ? 43 : $originalLanguage.hashCode());
            String $overview = this.getOverview();
            result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
            String $posterPath = this.getPosterPath();
            result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
            String $originalTitle = this.getOriginalTitle();
            result = result * 59 + ($originalTitle == null ? 43 : $originalTitle.hashCode());
            String $title = this.getTitle();
            result = result * 59 + ($title == null ? 43 : $title.hashCode());
            String $releaseDate = this.getReleaseDate();
            result = result * 59 + ($releaseDate == null ? 43 : $releaseDate.hashCode());
            List<String> $originCountry = this.getOriginCountry();
            result = result * 59 + ($originCountry == null ? 43 : ((Object)$originCountry).hashCode());
            String $originalName = this.getOriginalName();
            result = result * 59 + ($originalName == null ? 43 : $originalName.hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            String $firstAirDate = this.getFirstAirDate();
            result = result * 59 + ($firstAirDate == null ? 43 : $firstAirDate.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "TmdbResponse.Result(mediaType=" + this.getMediaType() + ", id=" + this.getId() + ", adult=" + this.getAdult() + ", backdropPath=" + this.getBackdropPath() + ", genreIds=" + String.valueOf(this.getGenreIds()) + ", originalLanguage=" + this.getOriginalLanguage() + ", overview=" + this.getOverview() + ", popularity=" + this.getPopularity() + ", posterPath=" + this.getPosterPath() + ", voteAverage=" + this.getVoteAverage() + ", voteCount=" + this.getVoteCount() + ", originalTitle=" + this.getOriginalTitle() + ", title=" + this.getTitle() + ", video=" + this.getVideo() + ", releaseDate=" + this.getReleaseDate() + ", originCountry=" + String.valueOf(this.getOriginCountry()) + ", originalName=" + this.getOriginalName() + ", name=" + this.getName() + ", firstAirDate=" + this.getFirstAirDate() + ", isExsit=" + this.getIsExsit() + ", isSubmitted=" + this.getIsSubmitted() + ")";
        }

        @Generated
        public Result() {
        }

        @Generated
        public Result(String mediaType, int id, Boolean adult, String backdropPath, List<Integer> genreIds, String originalLanguage, String overview, Double popularity, String posterPath, Double voteAverage, Integer voteCount, String originalTitle, String title, Boolean video, String releaseDate, List<String> originCountry, String originalName, String name, String firstAirDate, Boolean isExsit, Boolean isSubmitted) {
            this.mediaType = mediaType;
            this.id = id;
            this.adult = adult;
            this.backdropPath = backdropPath;
            this.genreIds = genreIds;
            this.originalLanguage = originalLanguage;
            this.overview = overview;
            this.popularity = popularity;
            this.posterPath = posterPath;
            this.voteAverage = voteAverage;
            this.voteCount = voteCount;
            this.originalTitle = originalTitle;
            this.title = title;
            this.video = video;
            this.releaseDate = releaseDate;
            this.originCountry = originCountry;
            this.originalName = originalName;
            this.name = name;
            this.firstAirDate = firstAirDate;
            this.isExsit = isExsit;
            this.isSubmitted = isSubmitted;
        }
    }
}
