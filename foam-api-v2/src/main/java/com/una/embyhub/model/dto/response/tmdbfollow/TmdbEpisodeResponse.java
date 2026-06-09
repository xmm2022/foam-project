/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.tmdbfollow;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class TmdbEpisodeResponse
implements Serializable {
    private Integer seasonNumber;
    private Integer episodeNumber;
    private String name;
    private String overview;
    private Date airDate;
    private String stillPath;
    private Boolean watched;

    @Generated
    public TmdbEpisodeResponse() {
    }

    @Generated
    public Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    @Generated
    public Integer getEpisodeNumber() {
        return this.episodeNumber;
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
    public Date getAirDate() {
        return this.airDate;
    }

    @Generated
    public String getStillPath() {
        return this.stillPath;
    }

    @Generated
    public Boolean getWatched() {
        return this.watched;
    }

    @Generated
    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Generated
    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
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
    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    @Generated
    public void setStillPath(String stillPath) {
        this.stillPath = stillPath;
    }

    @Generated
    public void setWatched(Boolean watched) {
        this.watched = watched;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbEpisodeResponse)) {
            return false;
        }
        TmdbEpisodeResponse other = (TmdbEpisodeResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$seasonNumber = this.getSeasonNumber();
        Integer other$seasonNumber = other.getSeasonNumber();
        if (this$seasonNumber == null ? other$seasonNumber != null : !((Object)this$seasonNumber).equals(other$seasonNumber)) {
            return false;
        }
        Integer this$episodeNumber = this.getEpisodeNumber();
        Integer other$episodeNumber = other.getEpisodeNumber();
        if (this$episodeNumber == null ? other$episodeNumber != null : !((Object)this$episodeNumber).equals(other$episodeNumber)) {
            return false;
        }
        Boolean this$watched = this.getWatched();
        Boolean other$watched = other.getWatched();
        if (this$watched == null ? other$watched != null : !((Object)this$watched).equals(other$watched)) {
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
        Date this$airDate = this.getAirDate();
        Date other$airDate = other.getAirDate();
        if (this$airDate == null ? other$airDate != null : !((Object)this$airDate).equals(other$airDate)) {
            return false;
        }
        String this$stillPath = this.getStillPath();
        String other$stillPath = other.getStillPath();
        return !(this$stillPath == null ? other$stillPath != null : !this$stillPath.equals(other$stillPath));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbEpisodeResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $seasonNumber = this.getSeasonNumber();
        result = result * 59 + ($seasonNumber == null ? 43 : ((Object)$seasonNumber).hashCode());
        Integer $episodeNumber = this.getEpisodeNumber();
        result = result * 59 + ($episodeNumber == null ? 43 : ((Object)$episodeNumber).hashCode());
        Boolean $watched = this.getWatched();
        result = result * 59 + ($watched == null ? 43 : ((Object)$watched).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        Date $airDate = this.getAirDate();
        result = result * 59 + ($airDate == null ? 43 : ((Object)$airDate).hashCode());
        String $stillPath = this.getStillPath();
        result = result * 59 + ($stillPath == null ? 43 : $stillPath.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbEpisodeResponse(seasonNumber=" + this.getSeasonNumber() + ", episodeNumber=" + this.getEpisodeNumber() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", airDate=" + String.valueOf(this.getAirDate()) + ", stillPath=" + this.getStillPath() + ", watched=" + this.getWatched() + ")";
    }
}
