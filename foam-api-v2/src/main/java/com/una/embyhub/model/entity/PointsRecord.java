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

@TableName(value="points_record")
public class PointsRecord
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="record_type")
    private String recordType;
    @TableField(value="amount")
    private Integer amount;
    @TableField(value="balance_after")
    private Integer balanceAfter;
    @TableField(value="description")
    private String description;

    @Generated
    public PointsRecord() {
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
    public String getRecordType() {
        return this.recordType;
    }

    @Generated
    public Integer getAmount() {
        return this.amount;
    }

    @Generated
    public Integer getBalanceAfter() {
        return this.balanceAfter;
    }

    @Generated
    public String getDescription() {
        return this.description;
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
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Generated
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Generated
    public void setBalanceAfter(Integer balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    @Generated
    public String toString() {
        return "PointsRecord(id=" + this.getId() + ", userId=" + this.getUserId() + ", recordType=" + this.getRecordType() + ", amount=" + this.getAmount() + ", balanceAfter=" + this.getBalanceAfter() + ", description=" + this.getDescription() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsRecord)) {
            return false;
        }
        PointsRecord other = (PointsRecord)o;
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
        Integer this$amount = this.getAmount();
        Integer other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !((Object)this$amount).equals(other$amount)) {
            return false;
        }
        Integer this$balanceAfter = this.getBalanceAfter();
        Integer other$balanceAfter = other.getBalanceAfter();
        if (this$balanceAfter == null ? other$balanceAfter != null : !((Object)this$balanceAfter).equals(other$balanceAfter)) {
            return false;
        }
        String this$recordType = this.getRecordType();
        String other$recordType = other.getRecordType();
        if (this$recordType == null ? other$recordType != null : !this$recordType.equals(other$recordType)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        return !(this$description == null ? other$description != null : !this$description.equals(other$description));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsRecord;
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
        Integer $amount = this.getAmount();
        result = result * 59 + ($amount == null ? 43 : ((Object)$amount).hashCode());
        Integer $balanceAfter = this.getBalanceAfter();
        result = result * 59 + ($balanceAfter == null ? 43 : ((Object)$balanceAfter).hashCode());
        String $recordType = this.getRecordType();
        result = result * 59 + ($recordType == null ? 43 : $recordType.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        return result;
    }
}
