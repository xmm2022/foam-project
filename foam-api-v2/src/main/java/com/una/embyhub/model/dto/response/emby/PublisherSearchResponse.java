/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import com.una.embyhub.model.dto.response.emby.QueryResultBaseItemResponse;
import com.una.embyhub.model.dto.response.telegram.PublisherGroupResponse;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class PublisherSearchResponse
implements Serializable {
    private String publisher;
    private QueryResultBaseItemResponse items;
    private List<PublisherGroupResponse> publisherOptions;
    private SearchMeta meta;

    @Generated
    public PublisherSearchResponse() {
    }

    @Generated
    public String getPublisher() {
        return this.publisher;
    }

    @Generated
    public QueryResultBaseItemResponse getItems() {
        return this.items;
    }

    @Generated
    public List<PublisherGroupResponse> getPublisherOptions() {
        return this.publisherOptions;
    }

    @Generated
    public SearchMeta getMeta() {
        return this.meta;
    }

    @Generated
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Generated
    public void setItems(QueryResultBaseItemResponse items) {
        this.items = items;
    }

    @Generated
    public void setPublisherOptions(List<PublisherGroupResponse> publisherOptions) {
        this.publisherOptions = publisherOptions;
    }

    @Generated
    public void setMeta(SearchMeta meta) {
        this.meta = meta;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PublisherSearchResponse)) {
            return false;
        }
        PublisherSearchResponse other = (PublisherSearchResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$publisher = this.getPublisher();
        String other$publisher = other.getPublisher();
        if (this$publisher == null ? other$publisher != null : !this$publisher.equals(other$publisher)) {
            return false;
        }
        QueryResultBaseItemResponse this$items = this.getItems();
        QueryResultBaseItemResponse other$items = other.getItems();
        if (this$items == null ? other$items != null : !((Object)this$items).equals(other$items)) {
            return false;
        }
        List<PublisherGroupResponse> this$publisherOptions = this.getPublisherOptions();
        List<PublisherGroupResponse> other$publisherOptions = other.getPublisherOptions();
        if (this$publisherOptions == null ? other$publisherOptions != null : !((Object)this$publisherOptions).equals(other$publisherOptions)) {
            return false;
        }
        SearchMeta this$meta = this.getMeta();
        SearchMeta other$meta = other.getMeta();
        return !(this$meta == null ? other$meta != null : !((Object)this$meta).equals(other$meta));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PublisherSearchResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $publisher = this.getPublisher();
        result = result * 59 + ($publisher == null ? 43 : $publisher.hashCode());
        QueryResultBaseItemResponse $items = this.getItems();
        result = result * 59 + ($items == null ? 43 : ((Object)$items).hashCode());
        List<PublisherGroupResponse> $publisherOptions = this.getPublisherOptions();
        result = result * 59 + ($publisherOptions == null ? 43 : ((Object)$publisherOptions).hashCode());
        SearchMeta $meta = this.getMeta();
        result = result * 59 + ($meta == null ? 43 : ((Object)$meta).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PublisherSearchResponse(publisher=" + this.getPublisher() + ", items=" + String.valueOf(this.getItems()) + ", publisherOptions=" + String.valueOf(this.getPublisherOptions()) + ", meta=" + String.valueOf(this.getMeta()) + ")";
    }

    public static class SearchMeta
    implements Serializable {
        private Integer page;
        private Integer limit;
        private String includeItemTypes;
        private String genres;

        @Generated
        public SearchMeta() {
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
            if (!(o instanceof SearchMeta)) {
                return false;
            }
            SearchMeta other = (SearchMeta)o;
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
            return other instanceof SearchMeta;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Integer $page = this.getPage();
            result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
            Integer $limit = this.getLimit();
            result = result * 59 + ($limit == null ? 43 : ((Object)$limit).hashCode());
            String $includeItemTypes = this.getIncludeItemTypes();
            result = result * 59 + ($includeItemTypes == null ? 43 : $includeItemTypes.hashCode());
            String $genres = this.getGenres();
            result = result * 59 + ($genres == null ? 43 : $genres.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "PublisherSearchResponse.SearchMeta(page=" + this.getPage() + ", limit=" + this.getLimit() + ", includeItemTypes=" + this.getIncludeItemTypes() + ", genres=" + this.getGenres() + ")";
        }
    }
}
