/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdb;

import lombok.Generated;

public class UpcomingTrailersRequest {
    private String type = "all";
    private Integer page = 1;
    private Integer limit = 60;

    @Generated
    public String getType() {
        return this.type;
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
    public void setType(String type) {
        this.type = type;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UpcomingTrailersRequest)) {
            return false;
        }
        UpcomingTrailersRequest other = (UpcomingTrailersRequest)o;
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
        String this$type = this.getType();
        String other$type = other.getType();
        return !(this$type == null ? other$type != null : !this$type.equals(other$type));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UpcomingTrailersRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        Integer $limit = this.getLimit();
        result = result * 59 + ($limit == null ? 43 : ((Object)$limit).hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UpcomingTrailersRequest(type=" + this.getType() + ", page=" + this.getPage() + ", limit=" + this.getLimit() + ")";
    }

    @Generated
    public UpcomingTrailersRequest(String type, Integer page, Integer limit) {
        this.type = type;
        this.page = page;
        this.limit = limit;
    }

    @Generated
    public UpcomingTrailersRequest() {
    }
}
