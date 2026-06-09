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

@TableName(value="support_ticket_reply")
public class SupportTicketReply
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String COL_ID = "id";
    public static final String COL_TICKET_ID = "ticket_id";
    public static final String COL_REPLY_CONTENT = "reply_content";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_REPLY_ROLE = "reply_role";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="ticket_id")
    private Long ticketId;
    @TableField(value="reply_content")
    private String replyContent;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="reply_role")
    private Integer replyRole;

    @Generated
    public SupportTicketReply() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getTicketId() {
        return this.ticketId;
    }

    @Generated
    public String getReplyContent() {
        return this.replyContent;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Integer getReplyRole() {
        return this.replyRole;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    @Generated
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setReplyRole(Integer replyRole) {
        this.replyRole = replyRole;
    }

    @Override
    @Generated
    public String toString() {
        return "SupportTicketReply(id=" + this.getId() + ", ticketId=" + this.getTicketId() + ", replyContent=" + this.getReplyContent() + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", replyRole=" + this.getReplyRole() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportTicketReply)) {
            return false;
        }
        SupportTicketReply other = (SupportTicketReply)o;
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
        Long this$ticketId = this.getTicketId();
        Long other$ticketId = other.getTicketId();
        if (this$ticketId == null ? other$ticketId != null : !((Object)this$ticketId).equals(other$ticketId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$replyRole = this.getReplyRole();
        Integer other$replyRole = other.getReplyRole();
        if (this$replyRole == null ? other$replyRole != null : !((Object)this$replyRole).equals(other$replyRole)) {
            return false;
        }
        String this$replyContent = this.getReplyContent();
        String other$replyContent = other.getReplyContent();
        if (this$replyContent == null ? other$replyContent != null : !this$replyContent.equals(other$replyContent)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        return !(this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicketReply;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $ticketId = this.getTicketId();
        result = result * 59 + ($ticketId == null ? 43 : ((Object)$ticketId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $replyRole = this.getReplyRole();
        result = result * 59 + ($replyRole == null ? 43 : ((Object)$replyRole).hashCode());
        String $replyContent = this.getReplyContent();
        result = result * 59 + ($replyContent == null ? 43 : $replyContent.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        return result;
    }
}
