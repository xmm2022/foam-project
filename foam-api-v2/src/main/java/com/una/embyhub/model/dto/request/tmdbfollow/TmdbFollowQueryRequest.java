/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdbfollow;

import java.io.Serializable;
import lombok.Generated;

public class TmdbFollowQueryRequest
implements Serializable {
    private String mediaType;
    private String name;

    @Generated
    public TmdbFollowQueryRequest() {
    }

    @Generated
    public String getMediaType() {
        return this.mediaType;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollowQueryRequest)) {
            return false;
        }
        TmdbFollowQueryRequest other = (TmdbFollowQueryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$mediaType = this.getMediaType();
        String other$mediaType = other.getMediaType();
        if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowQueryRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $mediaType = this.getMediaType();
        result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowQueryRequest(mediaType=" + this.getMediaType() + ", name=" + this.getName() + ")";
    }
}
