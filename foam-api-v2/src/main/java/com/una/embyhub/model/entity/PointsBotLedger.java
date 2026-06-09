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

@TableName(value="points_bot_ledger")
public class PointsBotLedger
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="chat_id")
    private Long chatId;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="delta")
    private Integer delta;
    @TableField(value="reason")
    private String reason;
    @TableField(value="ref_id")
    private String refId;

    @Generated
    public PointsBotLedger() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getChatId() {
        return this.chatId;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Integer getDelta() {
        return this.delta;
    }

    @Generated
    public String getReason() {
        return this.reason;
    }

    @Generated
    public String getRefId() {
        return this.refId;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setDelta(Integer delta) {
        this.delta = delta;
    }

    @Generated
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Generated
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @Override
    @Generated
    public String toString() {
        return "PointsBotLedger(id=" + this.getId() + ", chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", delta=" + this.getDelta() + ", reason=" + this.getReason() + ", refId=" + this.getRefId() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLedger)) {
            return false;
        }
        PointsBotLedger other = (PointsBotLedger)o;
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
        Long this$chatId = this.getChatId();
        Long other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !((Object)this$chatId).equals(other$chatId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$delta = this.getDelta();
        Integer other$delta = other.getDelta();
        if (this$delta == null ? other$delta != null : !((Object)this$delta).equals(other$delta)) {
            return false;
        }
        String this$reason = this.getReason();
        String other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) {
            return false;
        }
        String this$refId = this.getRefId();
        String other$refId = other.getRefId();
        return !(this$refId == null ? other$refId != null : !this$refId.equals(other$refId));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLedger;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $delta = this.getDelta();
        result = result * 59 + ($delta == null ? 43 : ((Object)$delta).hashCode());
        String $reason = this.getReason();
        result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
        String $refId = this.getRefId();
        result = result * 59 + ($refId == null ? 43 : $refId.hashCode());
        return result;
    }
}
