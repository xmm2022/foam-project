/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import lombok.Generated;

public class TmdbSearchResponse
implements Serializable {
    private String imgUrl;
    private String backdropPath;
    private String overview;
    private String releaseDate;
    private Integer tmdbId;
    private Double voteAverage;
    private Integer voteCount;
    private Integer runtime;
    private String productionCountries;

    @Generated
    public TmdbSearchResponse() {
    }

    @Generated
    public String getImgUrl() {
        return this.imgUrl;
    }

    @Generated
    public String getBackdropPath() {
        return this.backdropPath;
    }

    @Generated
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public String getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
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
    public Integer getRuntime() {
        return this.runtime;
    }

    @Generated
    public String getProductionCountries() {
        return this.productionCountries;
    }

    @Generated
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Generated
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Generated
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Generated
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Generated
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @Generated
    public void setProductionCountries(String productionCountries) {
        this.productionCountries = productionCountries;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbSearchResponse)) {
            return false;
        }
        TmdbSearchResponse other = (TmdbSearchResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
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
        Integer this$runtime = this.getRuntime();
        Integer other$runtime = other.getRuntime();
        if (this$runtime == null ? other$runtime != null : !((Object)this$runtime).equals(other$runtime)) {
            return false;
        }
        String this$imgUrl = this.getImgUrl();
        String other$imgUrl = other.getImgUrl();
        if (this$imgUrl == null ? other$imgUrl != null : !this$imgUrl.equals(other$imgUrl)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$overview = this.getOverview();
        String other$overview = other.getOverview();
        if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
            return false;
        }
        String this$releaseDate = this.getReleaseDate();
        String other$releaseDate = other.getReleaseDate();
        if (this$releaseDate == null ? other$releaseDate != null : !this$releaseDate.equals(other$releaseDate)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        return !(this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbSearchResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Double $voteAverage = this.getVoteAverage();
        result = result * 59 + ($voteAverage == null ? 43 : ((Object)$voteAverage).hashCode());
        Integer $voteCount = this.getVoteCount();
        result = result * 59 + ($voteCount == null ? 43 : ((Object)$voteCount).hashCode());
        Integer $runtime = this.getRuntime();
        result = result * 59 + ($runtime == null ? 43 : ((Object)$runtime).hashCode());
        String $imgUrl = this.getImgUrl();
        result = result * 59 + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : $releaseDate.hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbSearchResponse(imgUrl=" + this.getImgUrl() + ", backdropPath=" + this.getBackdropPath() + ", overview=" + this.getOverview() + ", releaseDate=" + this.getReleaseDate() + ", tmdbId=" + this.getTmdbId() + ", voteAverage=" + this.getVoteAverage() + ", voteCount=" + this.getVoteCount() + ", runtime=" + this.getRuntime() + ", productionCountries=" + this.getProductionCountries() + ")";
    }
}
