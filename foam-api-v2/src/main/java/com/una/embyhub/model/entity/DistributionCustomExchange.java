/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import lombok.Generated;

@TableName(value="distribution_custom_exchange")
public class DistributionCustomExchange
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="exchange_no")
    private String exchangeNo;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="product_id")
    private Long productId;
    @TableField(value="product_name")
    private String productName;
    @TableField(value="product_value")
    private Integer productValue;
    @TableField(value="points_cost")
    private Integer pointsCost;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="status")
    private Integer status;
    @TableField(value="review_comment")
    private String reviewComment;

    @Generated
    public DistributionCustomExchange() {
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

    @Override
    @Generated
    public String toString() {
        return "DistributionCustomExchange(id=" + this.getId() + ", exchangeNo=" + this.getExchangeNo() + ", userId=" + this.getUserId() + ", productId=" + this.getProductId() + ", productName=" + this.getProductName() + ", productValue=" + this.getProductValue() + ", pointsCost=" + this.getPointsCost() + ", embyInfoId=" + this.getEmbyInfoId() + ", status=" + this.getStatus() + ", reviewComment=" + this.getReviewComment() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionCustomExchange)) {
            return false;
        }
        DistributionCustomExchange other = (DistributionCustomExchange)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        String this$reviewComment = this.getReviewComment();
        String other$reviewComment = other.getReviewComment();
        return !(this$reviewComment == null ? other$reviewComment != null : !this$reviewComment.equals(other$reviewComment));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionCustomExchange;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
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
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        String $reviewComment = this.getReviewComment();
        result = result * 59 + ($reviewComment == null ? 43 : $reviewComment.hashCode());
        return result;
    }
}
