/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distribution;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class DistributionCustomExchangeReviewRequest
implements Serializable {
    private List<Long> idList;
    private Integer status;
    private String reviewComment;

    @Generated
    public DistributionCustomExchangeReviewRequest() {
    }

    @Generated
    public List<Long> getIdList() {
        return this.idList;
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
    public void setIdList(List<Long> idList) {
        this.idList = idList;
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
        if (!(o instanceof DistributionCustomExchangeReviewRequest)) {
            return false;
        }
        DistributionCustomExchangeReviewRequest other = (DistributionCustomExchangeReviewRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        String this$reviewComment = this.getReviewComment();
        String other$reviewComment = other.getReviewComment();
        return !(this$reviewComment == null ? other$reviewComment != null : !this$reviewComment.equals(other$reviewComment));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionCustomExchangeReviewRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $reviewComment = this.getReviewComment();
        result = result * 59 + ($reviewComment == null ? 43 : $reviewComment.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionCustomExchangeReviewRequest(idList=" + String.valueOf(this.getIdList()) + ", status=" + this.getStatus() + ", reviewComment=" + this.getReviewComment() + ")";
    }
}
