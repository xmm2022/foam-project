/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdbfollow;

import java.io.Serializable;
import lombok.Generated;

public class TmdbFollowSyncRequest
implements Serializable {
    private Long followId;
    private boolean toGroup = true;

    @Generated
    public TmdbFollowSyncRequest() {
    }

    @Generated
    public Long getFollowId() {
        return this.followId;
    }

    @Generated
    public boolean isToGroup() {
        return this.toGroup;
    }

    @Generated
    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    @Generated
    public void setToGroup(boolean toGroup) {
        this.toGroup = toGroup;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollowSyncRequest)) {
            return false;
        }
        TmdbFollowSyncRequest other = (TmdbFollowSyncRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isToGroup() != other.isToGroup()) {
            return false;
        }
        Long this$followId = this.getFollowId();
        Long other$followId = other.getFollowId();
        return !(this$followId == null ? other$followId != null : !((Object)this$followId).equals(other$followId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowSyncRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isToGroup() ? 79 : 97);
        Long $followId = this.getFollowId();
        result = result * 59 + ($followId == null ? 43 : ((Object)$followId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowSyncRequest(followId=" + this.getFollowId() + ", toGroup=" + this.isToGroup() + ")";
    }
}
