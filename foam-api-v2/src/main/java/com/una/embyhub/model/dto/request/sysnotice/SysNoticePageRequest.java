/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.sysnotice;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SysNoticePageRequest
implements Serializable {
    @BindQuery(comparison=Comparison.LIKE)
    private String noticeTitle;
    @BindQuery(comparison=Comparison.EQ)
    private Integer noticeStatus;
    @BindQuery(comparison=Comparison.EQ)
    private Integer noticeScope;
    @BindQuery(comparison=Comparison.EQ)
    private Integer topFlag;
    @BindQuery(column="create_datetime", comparison=Comparison.GE)
    private Date createStartTime;
    @BindQuery(column="create_datetime", comparison=Comparison.LE)
    private Date createEndTime;

    @Generated
    public SysNoticePageRequest() {
    }

    @Generated
    public String getNoticeTitle() {
        return this.noticeTitle;
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
    public Date getCreateStartTime() {
        return this.createStartTime;
    }

    @Generated
    public Date getCreateEndTime() {
        return this.createEndTime;
    }

    @Generated
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
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
    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    @Generated
    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysNoticePageRequest)) {
            return false;
        }
        SysNoticePageRequest other = (SysNoticePageRequest)o;
        if (!other.canEqual(this)) {
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
        String this$noticeTitle = this.getNoticeTitle();
        String other$noticeTitle = other.getNoticeTitle();
        if (this$noticeTitle == null ? other$noticeTitle != null : !this$noticeTitle.equals(other$noticeTitle)) {
            return false;
        }
        Date this$createStartTime = this.getCreateStartTime();
        Date other$createStartTime = other.getCreateStartTime();
        if (this$createStartTime == null ? other$createStartTime != null : !((Object)this$createStartTime).equals(other$createStartTime)) {
            return false;
        }
        Date this$createEndTime = this.getCreateEndTime();
        Date other$createEndTime = other.getCreateEndTime();
        return !(this$createEndTime == null ? other$createEndTime != null : !((Object)this$createEndTime).equals(other$createEndTime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysNoticePageRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $noticeStatus = this.getNoticeStatus();
        result = result * 59 + ($noticeStatus == null ? 43 : ((Object)$noticeStatus).hashCode());
        Integer $noticeScope = this.getNoticeScope();
        result = result * 59 + ($noticeScope == null ? 43 : ((Object)$noticeScope).hashCode());
        Integer $topFlag = this.getTopFlag();
        result = result * 59 + ($topFlag == null ? 43 : ((Object)$topFlag).hashCode());
        String $noticeTitle = this.getNoticeTitle();
        result = result * 59 + ($noticeTitle == null ? 43 : $noticeTitle.hashCode());
        Date $createStartTime = this.getCreateStartTime();
        result = result * 59 + ($createStartTime == null ? 43 : ((Object)$createStartTime).hashCode());
        Date $createEndTime = this.getCreateEndTime();
        result = result * 59 + ($createEndTime == null ? 43 : ((Object)$createEndTime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SysNoticePageRequest(noticeTitle=" + this.getNoticeTitle() + ", noticeStatus=" + this.getNoticeStatus() + ", noticeScope=" + this.getNoticeScope() + ", topFlag=" + this.getTopFlag() + ", createStartTime=" + String.valueOf(this.getCreateStartTime()) + ", createEndTime=" + String.valueOf(this.getCreateEndTime()) + ")";
    }
}
