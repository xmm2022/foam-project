/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import lombok.Generated;

public class MediaSearchRequest {
    private String mediaType;
    private String query;
    private Integer page;

    @Generated
    public MediaSearchRequest() {
    }

    @Generated
    public String getMediaType() {
        return this.mediaType;
    }

    @Generated
    public String getQuery() {
        return this.query;
    }

    @Generated
    public Integer getPage() {
        return this.page;
    }

    @Generated
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Generated
    public void setQuery(String query) {
        this.query = query;
    }

    @Generated
    public void setPage(Integer page) {
        this.page = page;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MediaSearchRequest)) {
            return false;
        }
        MediaSearchRequest other = (MediaSearchRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$page = this.getPage();
        Integer other$page = other.getPage();
        if (this$page == null ? other$page != null : !((Object)this$page).equals(other$page)) {
            return false;
        }
        String this$mediaType = this.getMediaType();
        String other$mediaType = other.getMediaType();
        if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
            return false;
        }
        String this$query = this.getQuery();
        String other$query = other.getQuery();
        return !(this$query == null ? other$query != null : !this$query.equals(other$query));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MediaSearchRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        String $mediaType = this.getMediaType();
        result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
        String $query = this.getQuery();
        result = result * 59 + ($query == null ? 43 : $query.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MediaSearchRequest(mediaType=" + this.getMediaType() + ", query=" + this.getQuery() + ", page=" + this.getPage() + ")";
    }
}
