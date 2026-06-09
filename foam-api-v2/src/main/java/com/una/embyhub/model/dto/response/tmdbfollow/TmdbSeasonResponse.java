/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.tmdbfollow;

import com.una.embyhub.model.dto.response.tmdbfollow.TmdbCastResponse;
import com.una.embyhub.model.dto.response.tmdbfollow.TmdbEpisodeResponse;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class TmdbSeasonResponse
implements Serializable {
    private Integer seasonNumber;
    private String name;
    private String overview;
    private String posterPath;
    private Date airDate;
    private Integer episodeCount;
    private List<TmdbCastResponse> casts;
    private List<TmdbEpisodeResponse> episodes;

    @Generated
    public TmdbSeasonResponse() {
    }

    @Generated
    public Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    @Generated
    public String getName() {
        return this.name;
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
    public Date getAirDate() {
        return this.airDate;
    }

    @Generated
    public Integer getEpisodeCount() {
        return this.episodeCount;
    }

    @Generated
    public List<TmdbCastResponse> getCasts() {
        return this.casts;
    }

    @Generated
    public List<TmdbEpisodeResponse> getEpisodes() {
        return this.episodes;
    }

    @Generated
    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @Generated
    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    @Generated
    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    @Generated
    public void setCasts(List<TmdbCastResponse> casts) {
        this.casts = casts;
    }

    @Generated
    public void setEpisodes(List<TmdbEpisodeResponse> episodes) {
        this.episodes = episodes;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbSeasonResponse)) {
            return false;
        }
        TmdbSeasonResponse other = (TmdbSeasonResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$seasonNumber = this.getSeasonNumber();
        Integer other$seasonNumber = other.getSeasonNumber();
        if (this$seasonNumber == null ? other$seasonNumber != null : !((Object)this$seasonNumber).equals(other$seasonNumber)) {
            return false;
        }
        Integer this$episodeCount = this.getEpisodeCount();
        Integer other$episodeCount = other.getEpisodeCount();
        if (this$episodeCount == null ? other$episodeCount != null : !((Object)this$episodeCount).equals(other$episodeCount)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
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
        Date this$airDate = this.getAirDate();
        Date other$airDate = other.getAirDate();
        if (this$airDate == null ? other$airDate != null : !((Object)this$airDate).equals(other$airDate)) {
            return false;
        }
        List<TmdbCastResponse> this$casts = this.getCasts();
        List<TmdbCastResponse> other$casts = other.getCasts();
        if (this$casts == null ? other$casts != null : !((Object)this$casts).equals(other$casts)) {
            return false;
        }
        List<TmdbEpisodeResponse> this$episodes = this.getEpisodes();
        List<TmdbEpisodeResponse> other$episodes = other.getEpisodes();
        return !(this$episodes == null ? other$episodes != null : !((Object)this$episodes).equals(other$episodes));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbSeasonResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $seasonNumber = this.getSeasonNumber();
        result = result * 59 + ($seasonNumber == null ? 43 : ((Object)$seasonNumber).hashCode());
        Integer $episodeCount = this.getEpisodeCount();
        result = result * 59 + ($episodeCount == null ? 43 : ((Object)$episodeCount).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $posterPath = this.getPosterPath();
        result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
        Date $airDate = this.getAirDate();
        result = result * 59 + ($airDate == null ? 43 : ((Object)$airDate).hashCode());
        List<TmdbCastResponse> $casts = this.getCasts();
        result = result * 59 + ($casts == null ? 43 : ((Object)$casts).hashCode());
        List<TmdbEpisodeResponse> $episodes = this.getEpisodes();
        result = result * 59 + ($episodes == null ? 43 : ((Object)$episodes).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbSeasonResponse(seasonNumber=" + this.getSeasonNumber() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", posterPath=" + this.getPosterPath() + ", airDate=" + String.valueOf(this.getAirDate()) + ", episodeCount=" + this.getEpisodeCount() + ", casts=" + String.valueOf(this.getCasts()) + ", episodes=" + String.valueOf(this.getEpisodes()) + ")";
    }
}
