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

@TableName(value="user_points")
public class UserPoints
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="points_balance")
    private Integer pointsBalance;
    @TableField(value="total_earned")
    private Integer totalEarned;
    @TableField(value="total_spent")
    private Integer totalSpent;

    @Generated
    public UserPoints() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Integer getPointsBalance() {
        return this.pointsBalance;
    }

    @Generated
    public Integer getTotalEarned() {
        return this.totalEarned;
    }

    @Generated
    public Integer getTotalSpent() {
        return this.totalSpent;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setPointsBalance(Integer pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    @Generated
    public void setTotalEarned(Integer totalEarned) {
        this.totalEarned = totalEarned;
    }

    @Generated
    public void setTotalSpent(Integer totalSpent) {
        this.totalSpent = totalSpent;
    }

    @Override
    @Generated
    public String toString() {
        return "UserPoints(id=" + this.getId() + ", userId=" + this.getUserId() + ", pointsBalance=" + this.getPointsBalance() + ", totalEarned=" + this.getTotalEarned() + ", totalSpent=" + this.getTotalSpent() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserPoints)) {
            return false;
        }
        UserPoints other = (UserPoints)o;
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
        Integer this$pointsBalance = this.getPointsBalance();
        Integer other$pointsBalance = other.getPointsBalance();
        if (this$pointsBalance == null ? other$pointsBalance != null : !((Object)this$pointsBalance).equals(other$pointsBalance)) {
            return false;
        }
        Integer this$totalEarned = this.getTotalEarned();
        Integer other$totalEarned = other.getTotalEarned();
        if (this$totalEarned == null ? other$totalEarned != null : !((Object)this$totalEarned).equals(other$totalEarned)) {
            return false;
        }
        Integer this$totalSpent = this.getTotalSpent();
        Integer other$totalSpent = other.getTotalSpent();
        return !(this$totalSpent == null ? other$totalSpent != null : !((Object)this$totalSpent).equals(other$totalSpent));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserPoints;
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
        Integer $pointsBalance = this.getPointsBalance();
        result = result * 59 + ($pointsBalance == null ? 43 : ((Object)$pointsBalance).hashCode());
        Integer $totalEarned = this.getTotalEarned();
        result = result * 59 + ($totalEarned == null ? 43 : ((Object)$totalEarned).hashCode());
        Integer $totalSpent = this.getTotalSpent();
        result = result * 59 + ($totalSpent == null ? 43 : ((Object)$totalSpent).hashCode());
        return result;
    }
}
