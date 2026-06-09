/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.supportticket;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SupportTicketPageRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    @BindQuery(comparison=Comparison.LIKE)
    private String title;
    @BindQuery(comparison=Comparison.EQ)
    private Integer status;
    @BindQuery(comparison=Comparison.LIKE)
    private String embyUserName;
    @BindQuery(column="create_datetime", comparison=Comparison.GE)
    private Date createStartTime;
    @BindQuery(column="create_datetime", comparison=Comparison.LE)
    private Date createEndTime;

    @Generated
    public SupportTicketPageRequest() {
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
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
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
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
        if (!(o instanceof SupportTicketPageRequest)) {
            return false;
        }
        SupportTicketPageRequest other = (SupportTicketPageRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
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
        return other instanceof SupportTicketPageRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        Date $createStartTime = this.getCreateStartTime();
        result = result * 59 + ($createStartTime == null ? 43 : ((Object)$createStartTime).hashCode());
        Date $createEndTime = this.getCreateEndTime();
        result = result * 59 + ($createEndTime == null ? 43 : ((Object)$createEndTime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SupportTicketPageRequest(title=" + this.getTitle() + ", status=" + this.getStatus() + ", embyUserName=" + this.getEmbyUserName() + ", createStartTime=" + String.valueOf(this.getCreateStartTime()) + ", createEndTime=" + String.valueOf(this.getCreateEndTime()) + ")";
    }
}
