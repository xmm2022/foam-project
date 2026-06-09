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
import java.util.Date;
import lombok.Generated;

@TableName(value="support_ticket")
public class SupportTicket
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_CONTENT = "content";
    public static final String COL_STATUS = "status";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_REPLY_COUNT = "reply_count";
    public static final String COL_LAST_REPLY_CONTENT = "last_reply_content";
    public static final String COL_LAST_REPLY_USER_NAME = "last_reply_user_name";
    public static final String COL_LAST_REPLY_DATETIME = "last_reply_datetime";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="title")
    private String title;
    @TableField(value="content")
    private String content;
    @TableField(value="`status`")
    private Integer status;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="reply_count")
    private Integer replyCount;
    @TableField(value="last_reply_content")
    private String lastReplyContent;
    @TableField(value="last_reply_user_name")
    private String lastReplyUserName;
    @TableField(value="last_reply_datetime")
    private Date lastReplyDatetime;

    @Generated
    public SupportTicket() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public String getContent() {
        return this.content;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
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
    public Integer getReplyCount() {
        return this.replyCount;
    }

    @Generated
    public String getLastReplyContent() {
        return this.lastReplyContent;
    }

    @Generated
    public String getLastReplyUserName() {
        return this.lastReplyUserName;
    }

    @Generated
    public Date getLastReplyDatetime() {
        return this.lastReplyDatetime;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
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
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    @Generated
    public void setLastReplyContent(String lastReplyContent) {
        this.lastReplyContent = lastReplyContent;
    }

    @Generated
    public void setLastReplyUserName(String lastReplyUserName) {
        this.lastReplyUserName = lastReplyUserName;
    }

    @Generated
    public void setLastReplyDatetime(Date lastReplyDatetime) {
        this.lastReplyDatetime = lastReplyDatetime;
    }

    @Override
    @Generated
    public String toString() {
        return "SupportTicket(id=" + this.getId() + ", title=" + this.getTitle() + ", content=" + this.getContent() + ", status=" + this.getStatus() + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", replyCount=" + this.getReplyCount() + ", lastReplyContent=" + this.getLastReplyContent() + ", lastReplyUserName=" + this.getLastReplyUserName() + ", lastReplyDatetime=" + String.valueOf(this.getLastReplyDatetime()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportTicket)) {
            return false;
        }
        SupportTicket other = (SupportTicket)o;
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
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$replyCount = this.getReplyCount();
        Integer other$replyCount = other.getReplyCount();
        if (this$replyCount == null ? other$replyCount != null : !((Object)this$replyCount).equals(other$replyCount)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$lastReplyContent = this.getLastReplyContent();
        String other$lastReplyContent = other.getLastReplyContent();
        if (this$lastReplyContent == null ? other$lastReplyContent != null : !this$lastReplyContent.equals(other$lastReplyContent)) {
            return false;
        }
        String this$lastReplyUserName = this.getLastReplyUserName();
        String other$lastReplyUserName = other.getLastReplyUserName();
        if (this$lastReplyUserName == null ? other$lastReplyUserName != null : !this$lastReplyUserName.equals(other$lastReplyUserName)) {
            return false;
        }
        Date this$lastReplyDatetime = this.getLastReplyDatetime();
        Date other$lastReplyDatetime = other.getLastReplyDatetime();
        return !(this$lastReplyDatetime == null ? other$lastReplyDatetime != null : !((Object)this$lastReplyDatetime).equals(other$lastReplyDatetime));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicket;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $replyCount = this.getReplyCount();
        result = result * 59 + ($replyCount == null ? 43 : ((Object)$replyCount).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $lastReplyContent = this.getLastReplyContent();
        result = result * 59 + ($lastReplyContent == null ? 43 : $lastReplyContent.hashCode());
        String $lastReplyUserName = this.getLastReplyUserName();
        result = result * 59 + ($lastReplyUserName == null ? 43 : $lastReplyUserName.hashCode());
        Date $lastReplyDatetime = this.getLastReplyDatetime();
        result = result * 59 + ($lastReplyDatetime == null ? 43 : ((Object)$lastReplyDatetime).hashCode());
        return result;
    }
}
