/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import lombok.Generated;

public class MediaListRequest {
    private String mediaType;
    private String category;
    private Integer page;

    @Generated
    public MediaListRequest() {
    }

    @Generated
    public String getMediaType() {
        return this.mediaType;
    }

    @Generated
    public String getCategory() {
        return this.category;
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
    public void setCategory(String category) {
        this.category = category;
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
        if (!(o instanceof MediaListRequest)) {
            return false;
        }
        MediaListRequest other = (MediaListRequest)o;
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
        String this$category = this.getCategory();
        String other$category = other.getCategory();
        return !(this$category == null ? other$category != null : !this$category.equals(other$category));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MediaListRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        String $mediaType = this.getMediaType();
        result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
        String $category = this.getCategory();
        result = result * 59 + ($category == null ? 43 : $category.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MediaListRequest(mediaType=" + this.getMediaType() + ", category=" + this.getCategory() + ", page=" + this.getPage() + ")";
    }
}
