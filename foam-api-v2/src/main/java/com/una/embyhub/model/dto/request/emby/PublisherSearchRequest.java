/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.emby;

import java.io.Serializable;
import lombok.Generated;

public class PublisherSearchRequest
implements Serializable {
    private String publisher;
    private Integer page = 1;
    private Integer limit = 50;
    private String includeItemTypes = "Movie,Series";
    private String genres;

    @Generated
    public PublisherSearchRequest() {
    }

    @Generated
    public String getPublisher() {
        return this.publisher;
    }

    @Generated
    public Integer getPage() {
        return this.page;
    }

    @Generated
    public Integer getLimit() {
        return this.limit;
    }

    @Generated
    public String getIncludeItemTypes() {
        return this.includeItemTypes;
    }

    @Generated
    public String getGenres() {
        return this.genres;
    }

    @Generated
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Generated
    public void setPage(Integer page) {
        this.page = page;
    }

    @Generated
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Generated
    public void setIncludeItemTypes(String includeItemTypes) {
        this.includeItemTypes = includeItemTypes;
    }

    @Generated
    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PublisherSearchRequest)) {
            return false;
        }
        PublisherSearchRequest other = (PublisherSearchRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$page = this.getPage();
        Integer other$page = other.getPage();
        if (this$page == null ? other$page != null : !((Object)this$page).equals(other$page)) {
            return false;
        }
        Integer this$limit = this.getLimit();
        Integer other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !((Object)this$limit).equals(other$limit)) {
            return false;
        }
        String this$publisher = this.getPublisher();
        String other$publisher = other.getPublisher();
        if (this$publisher == null ? other$publisher != null : !this$publisher.equals(other$publisher)) {
            return false;
        }
        String this$includeItemTypes = this.getIncludeItemTypes();
        String other$includeItemTypes = other.getIncludeItemTypes();
        if (this$includeItemTypes == null ? other$includeItemTypes != null : !this$includeItemTypes.equals(other$includeItemTypes)) {
            return false;
        }
        String this$genres = this.getGenres();
        String other$genres = other.getGenres();
        return !(this$genres == null ? other$genres != null : !this$genres.equals(other$genres));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PublisherSearchRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        Integer $limit = this.getLimit();
        result = result * 59 + ($limit == null ? 43 : ((Object)$limit).hashCode());
        String $publisher = this.getPublisher();
        result = result * 59 + ($publisher == null ? 43 : $publisher.hashCode());
        String $includeItemTypes = this.getIncludeItemTypes();
        result = result * 59 + ($includeItemTypes == null ? 43 : $includeItemTypes.hashCode());
        String $genres = this.getGenres();
        result = result * 59 + ($genres == null ? 43 : $genres.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PublisherSearchRequest(publisher=" + this.getPublisher() + ", page=" + this.getPage() + ", limit=" + this.getLimit() + ", includeItemTypes=" + this.getIncludeItemTypes() + ", genres=" + this.getGenres() + ")";
    }
}
