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

public class TmdbFollowCheckRequest
implements Serializable {
    @NotNull(message="TMDB ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="TMDB ID\u4e0d\u80fd\u4e3a\u7a7a") Integer tmdbId;

    @Generated
    public TmdbFollowCheckRequest() {
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
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
        if (!(o instanceof TmdbFollowCheckRequest)) {
            return false;
        }
        TmdbFollowCheckRequest other = (TmdbFollowCheckRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        return !(this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowCheckRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowCheckRequest(tmdbId=" + this.getTmdbId() + ")";
    }
}
