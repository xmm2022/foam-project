/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distributionapplication;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class DistributionApplicationDeleteRequest
implements Serializable {
    private List<Long> ids;

    @Generated
    public DistributionApplicationDeleteRequest() {
    }

    @Generated
    public List<Long> getIds() {
        return this.ids;
    }

    @Generated
    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionApplicationDeleteRequest)) {
            return false;
        }
        DistributionApplicationDeleteRequest other = (DistributionApplicationDeleteRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<Long> this$ids = this.getIds();
        List<Long> other$ids = other.getIds();
        return !(this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionApplicationDeleteRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<Long> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionApplicationDeleteRequest(ids=" + String.valueOf(this.getIds()) + ")";
    }
}
