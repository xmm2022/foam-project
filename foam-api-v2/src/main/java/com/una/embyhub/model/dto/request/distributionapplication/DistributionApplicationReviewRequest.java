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

public class DistributionApplicationReviewRequest
implements Serializable {
    private List<Long> applicationIds;
    private Integer status;
    private String reviewComment;

    @Generated
    public DistributionApplicationReviewRequest() {
    }

    @Generated
    public List<Long> getApplicationIds() {
        return this.applicationIds;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getReviewComment() {
        return this.reviewComment;
    }

    @Generated
    public void setApplicationIds(List<Long> applicationIds) {
        this.applicationIds = applicationIds;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionApplicationReviewRequest)) {
            return false;
        }
        DistributionApplicationReviewRequest other = (DistributionApplicationReviewRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        List<Long> this$applicationIds = this.getApplicationIds();
        List<Long> other$applicationIds = other.getApplicationIds();
        if (this$applicationIds == null ? other$applicationIds != null : !((Object)this$applicationIds).equals(other$applicationIds)) {
            return false;
        }
        String this$reviewComment = this.getReviewComment();
        String other$reviewComment = other.getReviewComment();
        return !(this$reviewComment == null ? other$reviewComment != null : !this$reviewComment.equals(other$reviewComment));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionApplicationReviewRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        List<Long> $applicationIds = this.getApplicationIds();
        result = result * 59 + ($applicationIds == null ? 43 : ((Object)$applicationIds).hashCode());
        String $reviewComment = this.getReviewComment();
        result = result * 59 + ($reviewComment == null ? 43 : $reviewComment.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionApplicationReviewRequest(applicationIds=" + String.valueOf(this.getApplicationIds()) + ", status=" + this.getStatus() + ", reviewComment=" + this.getReviewComment() + ")";
    }
}
