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
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

@TableName(value="sys_notice_read")
public class SysNoticeRead
implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String COL_ID = "id";
    public static final String COL_NOTICE_ID = "notice_id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_READ_DATETIME = "read_datetime";
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="notice_id")
    private Long noticeId;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="read_datetime")
    private Date readDatetime;

    @Generated
    public SysNoticeRead() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getNoticeId() {
        return this.noticeId;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Date getReadDatetime() {
        return this.readDatetime;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setReadDatetime(Date readDatetime) {
        this.readDatetime = readDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysNoticeRead)) {
            return false;
        }
        SysNoticeRead other = (SysNoticeRead)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$noticeId = this.getNoticeId();
        Long other$noticeId = other.getNoticeId();
        if (this$noticeId == null ? other$noticeId != null : !((Object)this$noticeId).equals(other$noticeId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Date this$readDatetime = this.getReadDatetime();
        Date other$readDatetime = other.getReadDatetime();
        return !(this$readDatetime == null ? other$readDatetime != null : !((Object)this$readDatetime).equals(other$readDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysNoticeRead;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $noticeId = this.getNoticeId();
        result = result * 59 + ($noticeId == null ? 43 : ((Object)$noticeId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Date $readDatetime = this.getReadDatetime();
        result = result * 59 + ($readDatetime == null ? 43 : ((Object)$readDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SysNoticeRead(id=" + this.getId() + ", noticeId=" + this.getNoticeId() + ", userId=" + this.getUserId() + ", readDatetime=" + String.valueOf(this.getReadDatetime()) + ")";
    }
}
