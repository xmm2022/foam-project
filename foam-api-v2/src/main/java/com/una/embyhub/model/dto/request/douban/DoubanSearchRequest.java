/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.douban;

import com.una.embyhub.model.dto.request.douban.DoubanHotRequest;
import lombok.Generated;

public class DoubanSearchRequest
extends DoubanHotRequest {
    private String query;

    @Generated
    public DoubanSearchRequest() {
    }

    @Generated
    public String getQuery() {
        return this.query;
    }

    @Generated
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated
    public String toString() {
        return "DoubanSearchRequest(query=" + this.getQuery() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DoubanSearchRequest)) {
            return false;
        }
        DoubanSearchRequest other = (DoubanSearchRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        String this$query = this.getQuery();
        String other$query = other.getQuery();
        return !(this$query == null ? other$query != null : !this$query.equals(other$query));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DoubanSearchRequest;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        String $query = this.getQuery();
        result = result * 59 + ($query == null ? 43 : $query.hashCode());
        return result;
    }
}
