/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.distributionapplication;

import java.io.Serializable;
import lombok.Generated;

public class DistributionApplicationStatisticsResponse
implements Serializable {
    private Long total;
    private Long pending;
    private Long approved;
    private Long rejected;

    @Generated
    public DistributionApplicationStatisticsResponse() {
    }

    @Generated
    public Long getTotal() {
        return this.total;
    }

    @Generated
    public Long getPending() {
        return this.pending;
    }

    @Generated
    public Long getApproved() {
        return this.approved;
    }

    @Generated
    public Long getRejected() {
        return this.rejected;
    }

    @Generated
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated
    public void setPending(Long pending) {
        this.pending = pending;
    }

    @Generated
    public void setApproved(Long approved) {
        this.approved = approved;
    }

    @Generated
    public void setRejected(Long rejected) {
        this.rejected = rejected;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionApplicationStatisticsResponse)) {
            return false;
        }
        DistributionApplicationStatisticsResponse other = (DistributionApplicationStatisticsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$total = this.getTotal();
        Long other$total = other.getTotal();
        if (this$total == null ? other$total != null : !((Object)this$total).equals(other$total)) {
            return false;
        }
        Long this$pending = this.getPending();
        Long other$pending = other.getPending();
        if (this$pending == null ? other$pending != null : !((Object)this$pending).equals(other$pending)) {
            return false;
        }
        Long this$approved = this.getApproved();
        Long other$approved = other.getApproved();
        if (this$approved == null ? other$approved != null : !((Object)this$approved).equals(other$approved)) {
            return false;
        }
        Long this$rejected = this.getRejected();
        Long other$rejected = other.getRejected();
        return !(this$rejected == null ? other$rejected != null : !((Object)this$rejected).equals(other$rejected));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionApplicationStatisticsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $total = this.getTotal();
        result = result * 59 + ($total == null ? 43 : ((Object)$total).hashCode());
        Long $pending = this.getPending();
        result = result * 59 + ($pending == null ? 43 : ((Object)$pending).hashCode());
        Long $approved = this.getApproved();
        result = result * 59 + ($approved == null ? 43 : ((Object)$approved).hashCode());
        Long $rejected = this.getRejected();
        result = result * 59 + ($rejected == null ? 43 : ((Object)$rejected).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionApplicationStatisticsResponse(total=" + this.getTotal() + ", pending=" + this.getPending() + ", approved=" + this.getApproved() + ", rejected=" + this.getRejected() + ")";
    }
}
