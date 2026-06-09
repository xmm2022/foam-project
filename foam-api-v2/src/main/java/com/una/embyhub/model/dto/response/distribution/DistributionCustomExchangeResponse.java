/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.distribution;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class DistributionCustomExchangeResponse
implements Serializable {
    private Long id;
    private String exchangeNo;
    private Long userId;
    private String userName;
    private Long productId;
    private String productName;
    private Integer productValue;
    private Integer pointsCost;
    private Long embyInfoId;
    private Integer status;
    private String reviewComment;
    private Date createDatetime;
    private Date updateDatetime;

    @Generated
    public DistributionCustomExchangeResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getExchangeNo() {
        return this.exchangeNo;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public Long getProductId() {
        return this.productId;
    }

    @Generated
    public String getProductName() {
        return this.productName;
    }

    @Generated
    public Integer getProductValue() {
        return this.productValue;
    }

    @Generated
    public Integer getPointsCost() {
        return this.pointsCost;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setExchangeNo(String exchangeNo) {
        this.exchangeNo = exchangeNo;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated
    public void setProductValue(Integer productValue) {
        this.productValue = productValue;
    }

    @Generated
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
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
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionCustomExchangeResponse)) {
            return false;
        }
        DistributionCustomExchangeResponse other = (DistributionCustomExchangeResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Integer this$productValue = this.getProductValue();
        Integer other$productValue = other.getProductValue();
        if (this$productValue == null ? other$productValue != null : !((Object)this$productValue).equals(other$productValue)) {
            return false;
        }
        Integer this$pointsCost = this.getPointsCost();
        Integer other$pointsCost = other.getPointsCost();
        if (this$pointsCost == null ? other$pointsCost != null : !((Object)this$pointsCost).equals(other$pointsCost)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        String this$exchangeNo = this.getExchangeNo();
        String other$exchangeNo = other.getExchangeNo();
        if (this$exchangeNo == null ? other$exchangeNo != null : !this$exchangeNo.equals(other$exchangeNo)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        String this$reviewComment = this.getReviewComment();
        String other$reviewComment = other.getReviewComment();
        if (this$reviewComment == null ? other$reviewComment != null : !this$reviewComment.equals(other$reviewComment)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        return !(this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionCustomExchangeResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Integer $productValue = this.getProductValue();
        result = result * 59 + ($productValue == null ? 43 : ((Object)$productValue).hashCode());
        Integer $pointsCost = this.getPointsCost();
        result = result * 59 + ($pointsCost == null ? 43 : ((Object)$pointsCost).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $exchangeNo = this.getExchangeNo();
        result = result * 59 + ($exchangeNo == null ? 43 : $exchangeNo.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        String $reviewComment = this.getReviewComment();
        result = result * 59 + ($reviewComment == null ? 43 : $reviewComment.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionCustomExchangeResponse(id=" + this.getId() + ", exchangeNo=" + this.getExchangeNo() + ", userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", productId=" + this.getProductId() + ", productName=" + this.getProductName() + ", productValue=" + this.getProductValue() + ", pointsCost=" + this.getPointsCost() + ", embyInfoId=" + this.getEmbyInfoId() + ", status=" + this.getStatus() + ", reviewComment=" + this.getReviewComment() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ")";
    }
}
