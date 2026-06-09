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

@TableName(value="user_invitation")
public class UserInvitation
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="inviter_id")
    private Long inviterId;
    @TableField(value="invitee_id")
    private Long inviteeId;
    @TableField(value="invitation_source")
    private String invitationSource;

    @Generated
    public UserInvitation() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getInviterId() {
        return this.inviterId;
    }

    @Generated
    public Long getInviteeId() {
        return this.inviteeId;
    }

    @Generated
    public String getInvitationSource() {
        return this.invitationSource;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setInviterId(Long inviterId) {
        this.inviterId = inviterId;
    }

    @Generated
    public void setInviteeId(Long inviteeId) {
        this.inviteeId = inviteeId;
    }

    @Generated
    public void setInvitationSource(String invitationSource) {
        this.invitationSource = invitationSource;
    }

    @Override
    @Generated
    public String toString() {
        return "UserInvitation(id=" + this.getId() + ", inviterId=" + this.getInviterId() + ", inviteeId=" + this.getInviteeId() + ", invitationSource=" + this.getInvitationSource() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserInvitation)) {
            return false;
        }
        UserInvitation other = (UserInvitation)o;
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
        Long this$inviterId = this.getInviterId();
        Long other$inviterId = other.getInviterId();
        if (this$inviterId == null ? other$inviterId != null : !((Object)this$inviterId).equals(other$inviterId)) {
            return false;
        }
        Long this$inviteeId = this.getInviteeId();
        Long other$inviteeId = other.getInviteeId();
        if (this$inviteeId == null ? other$inviteeId != null : !((Object)this$inviteeId).equals(other$inviteeId)) {
            return false;
        }
        String this$invitationSource = this.getInvitationSource();
        String other$invitationSource = other.getInvitationSource();
        return !(this$invitationSource == null ? other$invitationSource != null : !this$invitationSource.equals(other$invitationSource));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserInvitation;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $inviterId = this.getInviterId();
        result = result * 59 + ($inviterId == null ? 43 : ((Object)$inviterId).hashCode());
        Long $inviteeId = this.getInviteeId();
        result = result * 59 + ($inviteeId == null ? 43 : ((Object)$inviteeId).hashCode());
        String $invitationSource = this.getInvitationSource();
        result = result * 59 + ($invitationSource == null ? 43 : $invitationSource.hashCode());
        return result;
    }
}
