/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdbfollow;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class TmdbFollowProgressRequest
implements Serializable {
    @NotNull(message="\u8ba2\u9605ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u8ba2\u9605ID\u4e0d\u80fd\u4e3a\u7a7a") Long followId;
    private String watcherName;
    private Integer seasonNumber;
    private Integer episodeNumber;

    @Generated
    public TmdbFollowProgressRequest() {
    }

    @Generated
    public Long getFollowId() {
        return this.followId;
    }

    @Generated
    public String getWatcherName() {
        return this.watcherName;
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
    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    @Generated
    public void setWatcherName(String watcherName) {
        this.watcherName = watcherName;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollowProgressRequest)) {
            return false;
        }
        TmdbFollowProgressRequest other = (TmdbFollowProgressRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$followId = this.getFollowId();
        Long other$followId = other.getFollowId();
        if (this$followId == null ? other$followId != null : !((Object)this$followId).equals(other$followId)) {
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
        String this$watcherName = this.getWatcherName();
        String other$watcherName = other.getWatcherName();
        return !(this$watcherName == null ? other$watcherName != null : !this$watcherName.equals(other$watcherName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowProgressRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $followId = this.getFollowId();
        result = result * 59 + ($followId == null ? 43 : ((Object)$followId).hashCode());
        Integer $seasonNumber = this.getSeasonNumber();
        result = result * 59 + ($seasonNumber == null ? 43 : ((Object)$seasonNumber).hashCode());
        Integer $episodeNumber = this.getEpisodeNumber();
        result = result * 59 + ($episodeNumber == null ? 43 : ((Object)$episodeNumber).hashCode());
        String $watcherName = this.getWatcherName();
        result = result * 59 + ($watcherName == null ? 43 : $watcherName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowProgressRequest(followId=" + this.getFollowId() + ", watcherName=" + this.getWatcherName() + ", seasonNumber=" + this.getSeasonNumber() + ", episodeNumber=" + this.getEpisodeNumber() + ")";
    }
}
