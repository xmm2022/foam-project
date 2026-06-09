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

public class UpcomingTrailerResponse
implements Serializable {
    @JsonProperty(value="page")
    private Integer page;
    @JsonProperty(value="total_pages")
    private Integer totalPages;
    @JsonProperty(value="total_results")
    private Integer totalResults;
    @JsonProperty(value="results")
    private List<UpcomingMedia> results;

    @Generated
    public UpcomingTrailerResponse() {
    }

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
    public List<UpcomingMedia> getResults() {
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
    public void setResults(List<UpcomingMedia> results) {
        this.results = results;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UpcomingTrailerResponse)) {
            return false;
        }
        UpcomingTrailerResponse other = (UpcomingTrailerResponse)o;
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
        List<UpcomingMedia> this$results = this.getResults();
        List<UpcomingMedia> other$results = other.getResults();
        return !(this$results == null ? other$results != null : !((Object)this$results).equals(other$results));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UpcomingTrailerResponse;
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
        List<UpcomingMedia> $results = this.getResults();
        result = result * 59 + ($results == null ? 43 : ((Object)$results).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UpcomingTrailerResponse(page=" + this.getPage() + ", totalPages=" + this.getTotalPages() + ", totalResults=" + this.getTotalResults() + ", results=" + String.valueOf(this.getResults()) + ")";
    }

    public static class VideoInfo
    implements Serializable {
        @JsonProperty(value="id")
        private String id;
        @JsonProperty(value="name")
        private String name;
        @JsonProperty(value="key")
        private String key;
        @JsonProperty(value="site")
        private String site;
        @JsonProperty(value="type")
        private String type;
        @JsonProperty(value="official")
        private Boolean official;
        @JsonProperty(value="published_at")
        private String publishedAt;
        @JsonProperty(value="size")
        private Integer size;
        @JsonProperty(value="iso_639_1")
        private String iso6391;
        @JsonProperty(value="iso_3166_1")
        private String iso31661;

        public String getYoutubeUrl() {
            if ("YouTube".equalsIgnoreCase(this.site) && this.key != null) {
                return "https://www.youtube.com/watch?v=" + this.key;
            }
            return null;
        }

        public String getYoutubeEmbedUrl() {
            if ("YouTube".equalsIgnoreCase(this.site) && this.key != null) {
                return "https://www.youtube.com/embed/" + this.key;
            }
            return null;
        }

        @Generated
        public VideoInfo() {
        }

        @Generated
        public String getId() {
            return this.id;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getKey() {
            return this.key;
        }

        @Generated
        public String getSite() {
            return this.site;
        }

        @Generated
        public String getType() {
            return this.type;
        }

        @Generated
        public Boolean getOfficial() {
            return this.official;
        }

        @Generated
        public String getPublishedAt() {
            return this.publishedAt;
        }

        @Generated
        public Integer getSize() {
            return this.size;
        }

        @Generated
        public String getIso6391() {
            return this.iso6391;
        }

        @Generated
        public String getIso31661() {
            return this.iso31661;
        }

        @JsonProperty(value="id")
        @Generated
        public void setId(String id) {
            this.id = id;
        }

        @JsonProperty(value="name")
        @Generated
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty(value="key")
        @Generated
        public void setKey(String key) {
            this.key = key;
        }

        @JsonProperty(value="site")
        @Generated
        public void setSite(String site) {
            this.site = site;
        }

        @JsonProperty(value="type")
        @Generated
        public void setType(String type) {
            this.type = type;
        }

        @JsonProperty(value="official")
        @Generated
        public void setOfficial(Boolean official) {
            this.official = official;
        }

        @JsonProperty(value="published_at")
        @Generated
        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        @JsonProperty(value="size")
        @Generated
        public void setSize(Integer size) {
            this.size = size;
        }

        @JsonProperty(value="iso_639_1")
        @Generated
        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        @JsonProperty(value="iso_3166_1")
        @Generated
        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof VideoInfo)) {
                return false;
            }
            VideoInfo other = (VideoInfo)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Boolean this$official = this.getOfficial();
            Boolean other$official = other.getOfficial();
            if (this$official == null ? other$official != null : !((Object)this$official).equals(other$official)) {
                return false;
            }
            Integer this$size = this.getSize();
            Integer other$size = other.getSize();
            if (this$size == null ? other$size != null : !((Object)this$size).equals(other$size)) {
                return false;
            }
            String this$id = this.getId();
            String other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            String this$key = this.getKey();
            String other$key = other.getKey();
            if (this$key == null ? other$key != null : !this$key.equals(other$key)) {
                return false;
            }
            String this$site = this.getSite();
            String other$site = other.getSite();
            if (this$site == null ? other$site != null : !this$site.equals(other$site)) {
                return false;
            }
            String this$type = this.getType();
            String other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
                return false;
            }
            String this$publishedAt = this.getPublishedAt();
            String other$publishedAt = other.getPublishedAt();
            if (this$publishedAt == null ? other$publishedAt != null : !this$publishedAt.equals(other$publishedAt)) {
                return false;
            }
            String this$iso6391 = this.getIso6391();
            String other$iso6391 = other.getIso6391();
            if (this$iso6391 == null ? other$iso6391 != null : !this$iso6391.equals(other$iso6391)) {
                return false;
            }
            String this$iso31661 = this.getIso31661();
            String other$iso31661 = other.getIso31661();
            return !(this$iso31661 == null ? other$iso31661 != null : !this$iso31661.equals(other$iso31661));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof VideoInfo;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Boolean $official = this.getOfficial();
            result = result * 59 + ($official == null ? 43 : ((Object)$official).hashCode());
            Integer $size = this.getSize();
            result = result * 59 + ($size == null ? 43 : ((Object)$size).hashCode());
            String $id = this.getId();
            result = result * 59 + ($id == null ? 43 : $id.hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            String $key = this.getKey();
            result = result * 59 + ($key == null ? 43 : $key.hashCode());
            String $site = this.getSite();
            result = result * 59 + ($site == null ? 43 : $site.hashCode());
            String $type = this.getType();
            result = result * 59 + ($type == null ? 43 : $type.hashCode());
            String $publishedAt = this.getPublishedAt();
            result = result * 59 + ($publishedAt == null ? 43 : $publishedAt.hashCode());
            String $iso6391 = this.getIso6391();
            result = result * 59 + ($iso6391 == null ? 43 : $iso6391.hashCode());
            String $iso31661 = this.getIso31661();
            result = result * 59 + ($iso31661 == null ? 43 : $iso31661.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "UpcomingTrailerResponse.VideoInfo(id=" + this.getId() + ", name=" + this.getName() + ", key=" + this.getKey() + ", site=" + this.getSite() + ", type=" + this.getType() + ", official=" + this.getOfficial() + ", publishedAt=" + this.getPublishedAt() + ", size=" + this.getSize() + ", iso6391=" + this.getIso6391() + ", iso31661=" + this.getIso31661() + ")";
        }
    }

    public static class UpcomingMedia
    implements Serializable {
        @JsonProperty(value="id")
        private Long id;
        @JsonProperty(value="media_type")
        private String mediaType;
        @JsonProperty(value="title")
        private String title;
        @JsonProperty(value="name")
        private String name;
        @JsonProperty(value="original_title")
        private String originalTitle;
        @JsonProperty(value="original_name")
        private String originalName;
        @JsonProperty(value="overview")
        private String overview;
        @JsonProperty(value="poster_path")
        private String posterPath;
        @JsonProperty(value="backdrop_path")
        private String backdropPath;
        @JsonProperty(value="release_date")
        private String releaseDate;
        @JsonProperty(value="first_air_date")
        private String firstAirDate;
        @JsonProperty(value="genre_ids")
        private List<Integer> genreIds;
        @JsonProperty(value="original_language")
        private String originalLanguage;
        @JsonProperty(value="popularity")
        private Double popularity;
        @JsonProperty(value="vote_average")
        private Double voteAverage;
        @JsonProperty(value="vote_count")
        private Integer voteCount;
        @JsonProperty(value="adult")
        private Boolean adult;
        @JsonProperty(value="videos")
        private List<VideoInfo> videos;

        @Generated
        public UpcomingMedia() {
        }

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public String getMediaType() {
            return this.mediaType;
        }

        @Generated
        public String getTitle() {
            return this.title;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getOriginalTitle() {
            return this.originalTitle;
        }

        @Generated
        public String getOriginalName() {
            return this.originalName;
        }

        @Generated
        public String getOverview() {
            return this.overview;
        }

        @Generated
        public String getPosterPath() {
            return this.posterPath;
        }

        @Generated
        public String getBackdropPath() {
            return this.backdropPath;
        }

        @Generated
        public String getReleaseDate() {
            return this.releaseDate;
        }

        @Generated
        public String getFirstAirDate() {
            return this.firstAirDate;
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
        public Double getPopularity() {
            return this.popularity;
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
        public Boolean getAdult() {
            return this.adult;
        }

        @Generated
        public List<VideoInfo> getVideos() {
            return this.videos;
        }

        @JsonProperty(value="id")
        @Generated
        public void setId(Long id) {
            this.id = id;
        }

        @JsonProperty(value="media_type")
        @Generated
        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        @JsonProperty(value="title")
        @Generated
        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty(value="name")
        @Generated
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty(value="original_title")
        @Generated
        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        @JsonProperty(value="original_name")
        @Generated
        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        @JsonProperty(value="overview")
        @Generated
        public void setOverview(String overview) {
            this.overview = overview;
        }

        @JsonProperty(value="poster_path")
        @Generated
        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        @JsonProperty(value="backdrop_path")
        @Generated
        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        @JsonProperty(value="release_date")
        @Generated
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        @JsonProperty(value="first_air_date")
        @Generated
        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
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

        @JsonProperty(value="popularity")
        @Generated
        public void setPopularity(Double popularity) {
            this.popularity = popularity;
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

        @JsonProperty(value="adult")
        @Generated
        public void setAdult(Boolean adult) {
            this.adult = adult;
        }

        @JsonProperty(value="videos")
        @Generated
        public void setVideos(List<VideoInfo> videos) {
            this.videos = videos;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof UpcomingMedia)) {
                return false;
            }
            UpcomingMedia other = (UpcomingMedia)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Long this$id = this.getId();
            Long other$id = other.getId();
            if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
            Boolean this$adult = this.getAdult();
            Boolean other$adult = other.getAdult();
            if (this$adult == null ? other$adult != null : !((Object)this$adult).equals(other$adult)) {
                return false;
            }
            String this$mediaType = this.getMediaType();
            String other$mediaType = other.getMediaType();
            if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
                return false;
            }
            String this$title = this.getTitle();
            String other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            String this$originalTitle = this.getOriginalTitle();
            String other$originalTitle = other.getOriginalTitle();
            if (this$originalTitle == null ? other$originalTitle != null : !this$originalTitle.equals(other$originalTitle)) {
                return false;
            }
            String this$originalName = this.getOriginalName();
            String other$originalName = other.getOriginalName();
            if (this$originalName == null ? other$originalName != null : !this$originalName.equals(other$originalName)) {
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
            String this$backdropPath = this.getBackdropPath();
            String other$backdropPath = other.getBackdropPath();
            if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
                return false;
            }
            String this$releaseDate = this.getReleaseDate();
            String other$releaseDate = other.getReleaseDate();
            if (this$releaseDate == null ? other$releaseDate != null : !this$releaseDate.equals(other$releaseDate)) {
                return false;
            }
            String this$firstAirDate = this.getFirstAirDate();
            String other$firstAirDate = other.getFirstAirDate();
            if (this$firstAirDate == null ? other$firstAirDate != null : !this$firstAirDate.equals(other$firstAirDate)) {
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
            List<VideoInfo> this$videos = this.getVideos();
            List<VideoInfo> other$videos = other.getVideos();
            return !(this$videos == null ? other$videos != null : !((Object)this$videos).equals(other$videos));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof UpcomingMedia;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $id = this.getId();
            result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
            Double $popularity = this.getPopularity();
            result = result * 59 + ($popularity == null ? 43 : ((Object)$popularity).hashCode());
            Double $voteAverage = this.getVoteAverage();
            result = result * 59 + ($voteAverage == null ? 43 : ((Object)$voteAverage).hashCode());
            Integer $voteCount = this.getVoteCount();
            result = result * 59 + ($voteCount == null ? 43 : ((Object)$voteCount).hashCode());
            Boolean $adult = this.getAdult();
            result = result * 59 + ($adult == null ? 43 : ((Object)$adult).hashCode());
            String $mediaType = this.getMediaType();
            result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
            String $title = this.getTitle();
            result = result * 59 + ($title == null ? 43 : $title.hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            String $originalTitle = this.getOriginalTitle();
            result = result * 59 + ($originalTitle == null ? 43 : $originalTitle.hashCode());
            String $originalName = this.getOriginalName();
            result = result * 59 + ($originalName == null ? 43 : $originalName.hashCode());
            String $overview = this.getOverview();
            result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
            String $posterPath = this.getPosterPath();
            result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
            String $backdropPath = this.getBackdropPath();
            result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
            String $releaseDate = this.getReleaseDate();
            result = result * 59 + ($releaseDate == null ? 43 : $releaseDate.hashCode());
            String $firstAirDate = this.getFirstAirDate();
            result = result * 59 + ($firstAirDate == null ? 43 : $firstAirDate.hashCode());
            List<Integer> $genreIds = this.getGenreIds();
            result = result * 59 + ($genreIds == null ? 43 : ((Object)$genreIds).hashCode());
            String $originalLanguage = this.getOriginalLanguage();
            result = result * 59 + ($originalLanguage == null ? 43 : $originalLanguage.hashCode());
            List<VideoInfo> $videos = this.getVideos();
            result = result * 59 + ($videos == null ? 43 : ((Object)$videos).hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "UpcomingTrailerResponse.UpcomingMedia(id=" + this.getId() + ", mediaType=" + this.getMediaType() + ", title=" + this.getTitle() + ", name=" + this.getName() + ", originalTitle=" + this.getOriginalTitle() + ", originalName=" + this.getOriginalName() + ", overview=" + this.getOverview() + ", posterPath=" + this.getPosterPath() + ", backdropPath=" + this.getBackdropPath() + ", releaseDate=" + this.getReleaseDate() + ", firstAirDate=" + this.getFirstAirDate() + ", genreIds=" + String.valueOf(this.getGenreIds()) + ", originalLanguage=" + this.getOriginalLanguage() + ", popularity=" + this.getPopularity() + ", voteAverage=" + this.getVoteAverage() + ", voteCount=" + this.getVoteCount() + ", adult=" + this.getAdult() + ", videos=" + String.valueOf(this.getVideos()) + ")";
        }
    }
}
