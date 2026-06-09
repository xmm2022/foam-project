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

@TableName(value="sys_notice")
public class SysNotice
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="notice_title")
    private String noticeTitle;
    @TableField(value="notice_content")
    private String noticeContent;
    @TableField(value="notice_status")
    private Integer noticeStatus;
    @TableField(value="notice_scope")
    private Integer noticeScope;
    @TableField(value="top_flag")
    private Integer topFlag;
    @TableField(value="sort")
    private Integer sort;
    public static final String COL_ID = "id";
    public static final String COL_NOTICE_TITLE = "notice_title";
    public static final String COL_NOTICE_CONTENT = "notice_content";
    public static final String COL_NOTICE_STATUS = "notice_status";
    public static final String COL_NOTICE_SCOPE = "notice_scope";
    public static final String COL_TOP_FLAG = "top_flag";
    public static final String COL_SORT = "sort";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public SysNotice() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getNoticeTitle() {
        return this.noticeTitle;
    }

    @Generated
    public String getNoticeContent() {
        return this.noticeContent;
    }

    @Generated
    public Integer getNoticeStatus() {
        return this.noticeStatus;
    }

    @Generated
    public Integer getNoticeScope() {
        return this.noticeScope;
    }

    @Generated
    public Integer getTopFlag() {
        return this.topFlag;
    }

    @Generated
    public Integer getSort() {
        return this.sort;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    @Generated
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    @Generated
    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    @Generated
    public void setNoticeScope(Integer noticeScope) {
        this.noticeScope = noticeScope;
    }

    @Generated
    public void setTopFlag(Integer topFlag) {
        this.topFlag = topFlag;
    }

    @Generated
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    @Generated
    public String toString() {
        return "SysNotice(id=" + this.getId() + ", noticeTitle=" + this.getNoticeTitle() + ", noticeContent=" + this.getNoticeContent() + ", noticeStatus=" + this.getNoticeStatus() + ", noticeScope=" + this.getNoticeScope() + ", topFlag=" + this.getTopFlag() + ", sort=" + this.getSort() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysNotice)) {
            return false;
        }
        SysNotice other = (SysNotice)o;
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
        Integer this$noticeStatus = this.getNoticeStatus();
        Integer other$noticeStatus = other.getNoticeStatus();
        if (this$noticeStatus == null ? other$noticeStatus != null : !((Object)this$noticeStatus).equals(other$noticeStatus)) {
            return false;
        }
        Integer this$noticeScope = this.getNoticeScope();
        Integer other$noticeScope = other.getNoticeScope();
        if (this$noticeScope == null ? other$noticeScope != null : !((Object)this$noticeScope).equals(other$noticeScope)) {
            return false;
        }
        Integer this$topFlag = this.getTopFlag();
        Integer other$topFlag = other.getTopFlag();
        if (this$topFlag == null ? other$topFlag != null : !((Object)this$topFlag).equals(other$topFlag)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        String this$noticeTitle = this.getNoticeTitle();
        String other$noticeTitle = other.getNoticeTitle();
        if (this$noticeTitle == null ? other$noticeTitle != null : !this$noticeTitle.equals(other$noticeTitle)) {
            return false;
        }
        String this$noticeContent = this.getNoticeContent();
        String other$noticeContent = other.getNoticeContent();
        return !(this$noticeContent == null ? other$noticeContent != null : !this$noticeContent.equals(other$noticeContent));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysNotice;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $noticeStatus = this.getNoticeStatus();
        result = result * 59 + ($noticeStatus == null ? 43 : ((Object)$noticeStatus).hashCode());
        Integer $noticeScope = this.getNoticeScope();
        result = result * 59 + ($noticeScope == null ? 43 : ((Object)$noticeScope).hashCode());
        Integer $topFlag = this.getTopFlag();
        result = result * 59 + ($topFlag == null ? 43 : ((Object)$topFlag).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        String $noticeTitle = this.getNoticeTitle();
        result = result * 59 + ($noticeTitle == null ? 43 : $noticeTitle.hashCode());
        String $noticeContent = this.getNoticeContent();
        result = result * 59 + ($noticeContent == null ? 43 : $noticeContent.hashCode());
        return result;
    }
}
