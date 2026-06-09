/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuserrecord;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyUserRenewRecordRequest
implements Serializable {
    @BindQuery(comparison=Comparison.BETWEEN_BEGIN, column="create_datetime")
    private Date createDatetimeStart;
    @BindQuery(comparison=Comparison.BETWEEN_END, column="create_datetime")
    private Date createDatetimeEnd;
    @BindQuery(comparison=Comparison.CONTAINS)
    private String embyUserName;
    @BindQuery(comparison=Comparison.EQ)
    private Integer renewChannel;
    @BindQuery(comparison=Comparison.EQ)
    private Long embyInfoId;

    @Generated
    public EmbyUserRenewRecordRequest() {
    }

    @Generated
    public Date getCreateDatetimeStart() {
        return this.createDatetimeStart;
    }

    @Generated
    public Date getCreateDatetimeEnd() {
        return this.createDatetimeEnd;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Integer getRenewChannel() {
        return this.renewChannel;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public void setCreateDatetimeStart(Date createDatetimeStart) {
        this.createDatetimeStart = createDatetimeStart;
    }

    @Generated
    public void setCreateDatetimeEnd(Date createDatetimeEnd) {
        this.createDatetimeEnd = createDatetimeEnd;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setRenewChannel(Integer renewChannel) {
        this.renewChannel = renewChannel;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserRenewRecordRequest)) {
            return false;
        }
        EmbyUserRenewRecordRequest other = (EmbyUserRenewRecordRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$renewChannel = this.getRenewChannel();
        Integer other$renewChannel = other.getRenewChannel();
        if (this$renewChannel == null ? other$renewChannel != null : !((Object)this$renewChannel).equals(other$renewChannel)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Date this$createDatetimeStart = this.getCreateDatetimeStart();
        Date other$createDatetimeStart = other.getCreateDatetimeStart();
        if (this$createDatetimeStart == null ? other$createDatetimeStart != null : !((Object)this$createDatetimeStart).equals(other$createDatetimeStart)) {
            return false;
        }
        Date this$createDatetimeEnd = this.getCreateDatetimeEnd();
        Date other$createDatetimeEnd = other.getCreateDatetimeEnd();
        if (this$createDatetimeEnd == null ? other$createDatetimeEnd != null : !((Object)this$createDatetimeEnd).equals(other$createDatetimeEnd)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        return !(this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserRenewRecordRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $renewChannel = this.getRenewChannel();
        result = result * 59 + ($renewChannel == null ? 43 : ((Object)$renewChannel).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Date $createDatetimeStart = this.getCreateDatetimeStart();
        result = result * 59 + ($createDatetimeStart == null ? 43 : ((Object)$createDatetimeStart).hashCode());
        Date $createDatetimeEnd = this.getCreateDatetimeEnd();
        result = result * 59 + ($createDatetimeEnd == null ? 43 : ((Object)$createDatetimeEnd).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserRenewRecordRequest(createDatetimeStart=" + String.valueOf(this.getCreateDatetimeStart()) + ", createDatetimeEnd=" + String.valueOf(this.getCreateDatetimeEnd()) + ", embyUserName=" + this.getEmbyUserName() + ", renewChannel=" + this.getRenewChannel() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
