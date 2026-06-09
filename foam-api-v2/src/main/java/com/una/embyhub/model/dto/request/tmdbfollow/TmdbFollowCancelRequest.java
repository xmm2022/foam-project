/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdbfollow;

import lombok.Generated;

public class TmdbFollowCancelRequest {
    private Long followId;
    private Integer tmdbId;

    @Generated
    public TmdbFollowCancelRequest() {
    }

    @Generated
    public Long getFollowId() {
        return this.followId;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollowCancelRequest)) {
            return false;
        }
        TmdbFollowCancelRequest other = (TmdbFollowCancelRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$followId = this.getFollowId();
        Long other$followId = other.getFollowId();
        if (this$followId == null ? other$followId != null : !((Object)this$followId).equals(other$followId)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        return !(this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowCancelRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $followId = this.getFollowId();
        result = result * 59 + ($followId == null ? 43 : ((Object)$followId).hashCode());
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowCancelRequest(followId=" + this.getFollowId() + ", tmdbId=" + this.getTmdbId() + ")";
    }
}
