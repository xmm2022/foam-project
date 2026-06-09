/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import lombok.Generated;

public class StatsResponse
implements Serializable {
    private Integer movieCount = 0;
    private Integer seriesCount = 0;
    private Integer episodeCount = 0;
    private Integer musicCount = 0;

    @Generated
    public StatsResponse() {
    }

    @Generated
    public Integer getMovieCount() {
        return this.movieCount;
    }

    @Generated
    public Integer getSeriesCount() {
        return this.seriesCount;
    }

    @Generated
    public Integer getEpisodeCount() {
        return this.episodeCount;
    }

    @Generated
    public Integer getMusicCount() {
        return this.musicCount;
    }

    @Generated
    public void setMovieCount(Integer movieCount) {
        this.movieCount = movieCount;
    }

    @Generated
    public void setSeriesCount(Integer seriesCount) {
        this.seriesCount = seriesCount;
    }

    @Generated
    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    @Generated
    public void setMusicCount(Integer musicCount) {
        this.musicCount = musicCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof StatsResponse)) {
            return false;
        }
        StatsResponse other = (StatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$movieCount = this.getMovieCount();
        Integer other$movieCount = other.getMovieCount();
        if (this$movieCount == null ? other$movieCount != null : !((Object)this$movieCount).equals(other$movieCount)) {
            return false;
        }
        Integer this$seriesCount = this.getSeriesCount();
        Integer other$seriesCount = other.getSeriesCount();
        if (this$seriesCount == null ? other$seriesCount != null : !((Object)this$seriesCount).equals(other$seriesCount)) {
            return false;
        }
        Integer this$episodeCount = this.getEpisodeCount();
        Integer other$episodeCount = other.getEpisodeCount();
        if (this$episodeCount == null ? other$episodeCount != null : !((Object)this$episodeCount).equals(other$episodeCount)) {
            return false;
        }
        Integer this$musicCount = this.getMusicCount();
        Integer other$musicCount = other.getMusicCount();
        return !(this$musicCount == null ? other$musicCount != null : !((Object)this$musicCount).equals(other$musicCount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof StatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $movieCount = this.getMovieCount();
        result = result * 59 + ($movieCount == null ? 43 : ((Object)$movieCount).hashCode());
        Integer $seriesCount = this.getSeriesCount();
        result = result * 59 + ($seriesCount == null ? 43 : ((Object)$seriesCount).hashCode());
        Integer $episodeCount = this.getEpisodeCount();
        result = result * 59 + ($episodeCount == null ? 43 : ((Object)$episodeCount).hashCode());
        Integer $musicCount = this.getMusicCount();
        result = result * 59 + ($musicCount == null ? 43 : ((Object)$musicCount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "StatsResponse(movieCount=" + this.getMovieCount() + ", seriesCount=" + this.getSeriesCount() + ", episodeCount=" + this.getEpisodeCount() + ", musicCount=" + this.getMusicCount() + ")";
    }
}
