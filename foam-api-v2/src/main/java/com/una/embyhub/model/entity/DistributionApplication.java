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

@TableName(value="distribution_application")
public class DistributionApplication
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="order_no")
    private String orderNo;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="card_count")
    private Integer cardCount;
    @TableField(value="card_days")
    private Integer cardDays;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="status")
    private Integer status;
    @TableField(value="review_comment")
    private String reviewComment;

    @Generated
    public DistributionApplication() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getOrderNo() {
        return this.orderNo;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Integer getCardCount() {
        return this.cardCount;
    }

    @Generated
    public Integer getCardDays() {
        return this.cardDays;
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
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    @Generated
    public void setCardDays(Integer cardDays) {
        this.cardDays = cardDays;
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
        return "DistributionApplication(id=" + this.getId() + ", orderNo=" + this.getOrderNo() + ", userId=" + this.getUserId() + ", cardCount=" + this.getCardCount() + ", cardDays=" + this.getCardDays() + ", embyInfoId=" + this.getEmbyInfoId() + ", status=" + this.getStatus() + ", reviewComment=" + this.getReviewComment() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionApplication)) {
            return false;
        }
        DistributionApplication other = (DistributionApplication)o;
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
        Integer this$cardCount = this.getCardCount();
        Integer other$cardCount = other.getCardCount();
        if (this$cardCount == null ? other$cardCount != null : !((Object)this$cardCount).equals(other$cardCount)) {
            return false;
        }
        Integer this$cardDays = this.getCardDays();
        Integer other$cardDays = other.getCardDays();
        if (this$cardDays == null ? other$cardDays != null : !((Object)this$cardDays).equals(other$cardDays)) {
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
        String this$orderNo = this.getOrderNo();
        String other$orderNo = other.getOrderNo();
        if (this$orderNo == null ? other$orderNo != null : !this$orderNo.equals(other$orderNo)) {
            return false;
        }
        String this$reviewComment = this.getReviewComment();
        String other$reviewComment = other.getReviewComment();
        return !(this$reviewComment == null ? other$reviewComment != null : !this$reviewComment.equals(other$reviewComment));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionApplication;
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
        Integer $cardCount = this.getCardCount();
        result = result * 59 + ($cardCount == null ? 43 : ((Object)$cardCount).hashCode());
        Integer $cardDays = this.getCardDays();
        result = result * 59 + ($cardDays == null ? 43 : ((Object)$cardDays).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $orderNo = this.getOrderNo();
        result = result * 59 + ($orderNo == null ? 43 : $orderNo.hashCode());
        String $reviewComment = this.getReviewComment();
        result = result * 59 + ($reviewComment == null ? 43 : $reviewComment.hashCode());
        return result;
    }
}
