/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.emby;

import java.io.Serializable;
import lombok.Generated;

public class GetItemsRequest
implements Serializable {
    private Integer startIndex = 0;
    private Integer limit = 50;
    private String includeItemTypes;
    private String ids;
    private String studioIds;
    private String studios;
    private String genres;
    private String serverId;

    @Generated
    public GetItemsRequest() {
    }

    @Generated
    public Integer getStartIndex() {
        return this.startIndex;
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
    public String getIds() {
        return this.ids;
    }

    @Generated
    public String getStudioIds() {
        return this.studioIds;
    }

    @Generated
    public String getStudios() {
        return this.studios;
    }

    @Generated
    public String getGenres() {
        return this.genres;
    }

    @Generated
    public String getServerId() {
        return this.serverId;
    }

    @Generated
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
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
    public void setIds(String ids) {
        this.ids = ids;
    }

    @Generated
    public void setStudioIds(String studioIds) {
        this.studioIds = studioIds;
    }

    @Generated
    public void setStudios(String studios) {
        this.studios = studios;
    }

    @Generated
    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Generated
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetItemsRequest)) {
            return false;
        }
        GetItemsRequest other = (GetItemsRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$startIndex = this.getStartIndex();
        Integer other$startIndex = other.getStartIndex();
        if (this$startIndex == null ? other$startIndex != null : !((Object)this$startIndex).equals(other$startIndex)) {
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
        String this$ids = this.getIds();
        String other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !this$ids.equals(other$ids)) {
            return false;
        }
        String this$studioIds = this.getStudioIds();
        String other$studioIds = other.getStudioIds();
        if (this$studioIds == null ? other$studioIds != null : !this$studioIds.equals(other$studioIds)) {
            return false;
        }
        String this$studios = this.getStudios();
        String other$studios = other.getStudios();
        if (this$studios == null ? other$studios != null : !this$studios.equals(other$studios)) {
            return false;
        }
        String this$genres = this.getGenres();
        String other$genres = other.getGenres();
        if (this$genres == null ? other$genres != null : !this$genres.equals(other$genres)) {
            return false;
        }
        String this$serverId = this.getServerId();
        String other$serverId = other.getServerId();
        return !(this$serverId == null ? other$serverId != null : !this$serverId.equals(other$serverId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof GetItemsRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $startIndex = this.getStartIndex();
        result = result * 59 + ($startIndex == null ? 43 : ((Object)$startIndex).hashCode());
        Integer $limit = this.getLimit();
        result = result * 59 + ($limit == null ? 43 : ((Object)$limit).hashCode());
        String $includeItemTypes = this.getIncludeItemTypes();
        result = result * 59 + ($includeItemTypes == null ? 43 : $includeItemTypes.hashCode());
        String $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : $ids.hashCode());
        String $studioIds = this.getStudioIds();
        result = result * 59 + ($studioIds == null ? 43 : $studioIds.hashCode());
        String $studios = this.getStudios();
        result = result * 59 + ($studios == null ? 43 : $studios.hashCode());
        String $genres = this.getGenres();
        result = result * 59 + ($genres == null ? 43 : $genres.hashCode());
        String $serverId = this.getServerId();
        result = result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "GetItemsRequest(startIndex=" + this.getStartIndex() + ", limit=" + this.getLimit() + ", includeItemTypes=" + this.getIncludeItemTypes() + ", ids=" + this.getIds() + ", studioIds=" + this.getStudioIds() + ", studios=" + this.getStudios() + ", genres=" + this.getGenres() + ", serverId=" + this.getServerId() + ")";
    }
}
