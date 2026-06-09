/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.sysnotice;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SysNoticeResponse
implements Serializable {
    private Long id;
    private String noticeTitle;
    private String noticeContent;
    private Integer noticeStatus;
    private Integer noticeScope;
    private Integer topFlag;
    private Integer sort;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Boolean readFlag;
    private Date readDatetime;

    @Generated
    public SysNoticeResponse() {
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public String getCreateUserName() {
        return this.createUserName;
    }

    @Generated
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    @Generated
    public Boolean getReadFlag() {
        return this.readFlag;
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

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Generated
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Generated
    public void setReadFlag(Boolean readFlag) {
        this.readFlag = readFlag;
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
        if (!(o instanceof SysNoticeResponse)) {
            return false;
        }
        SysNoticeResponse other = (SysNoticeResponse)o;
        if (!other.canEqual(this)) {
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
        Boolean this$readFlag = this.getReadFlag();
        Boolean other$readFlag = other.getReadFlag();
        if (this$readFlag == null ? other$readFlag != null : !((Object)this$readFlag).equals(other$readFlag)) {
            return false;
        }
        String this$noticeTitle = this.getNoticeTitle();
        String other$noticeTitle = other.getNoticeTitle();
        if (this$noticeTitle == null ? other$noticeTitle != null : !this$noticeTitle.equals(other$noticeTitle)) {
            return false;
        }
        String this$noticeContent = this.getNoticeContent();
        String other$noticeContent = other.getNoticeContent();
        if (this$noticeContent == null ? other$noticeContent != null : !this$noticeContent.equals(other$noticeContent)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        if (this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime)) {
            return false;
        }
        String this$createUserName = this.getCreateUserName();
        String other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) {
            return false;
        }
        String this$updateUserName = this.getUpdateUserName();
        String other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName)) {
            return false;
        }
        Date this$readDatetime = this.getReadDatetime();
        Date other$readDatetime = other.getReadDatetime();
        return !(this$readDatetime == null ? other$readDatetime != null : !((Object)this$readDatetime).equals(other$readDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysNoticeResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        Boolean $readFlag = this.getReadFlag();
        result = result * 59 + ($readFlag == null ? 43 : ((Object)$readFlag).hashCode());
        String $noticeTitle = this.getNoticeTitle();
        result = result * 59 + ($noticeTitle == null ? 43 : $noticeTitle.hashCode());
        String $noticeContent = this.getNoticeContent();
        result = result * 59 + ($noticeContent == null ? 43 : $noticeContent.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        Date $readDatetime = this.getReadDatetime();
        result = result * 59 + ($readDatetime == null ? 43 : ((Object)$readDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SysNoticeResponse(id=" + this.getId() + ", noticeTitle=" + this.getNoticeTitle() + ", noticeContent=" + this.getNoticeContent() + ", noticeStatus=" + this.getNoticeStatus() + ", noticeScope=" + this.getNoticeScope() + ", topFlag=" + this.getTopFlag() + ", sort=" + this.getSort() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", readFlag=" + this.getReadFlag() + ", readDatetime=" + String.valueOf(this.getReadDatetime()) + ")";
    }
}
