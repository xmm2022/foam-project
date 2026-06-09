/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.invitation;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class InvitationCodeGenerateRequest
implements Serializable {
    private Long embyInfoId;
    private Integer hostLineType;
    private Integer count;
    private Integer usageLimit;
    private Date expireDatetime;
    private Integer validityDays;

    @Generated
    public InvitationCodeGenerateRequest() {
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public Integer getUsageLimit() {
        return this.usageLimit;
    }

    @Generated
    public Date getExpireDatetime() {
        return this.expireDatetime;
    }

    @Generated
    public Integer getValidityDays() {
        return this.validityDays;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = hostLineType;
    }

    @Generated
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated
    public void setUsageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
    }

    @Generated
    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    @Generated
    public void setValidityDays(Integer validityDays) {
        this.validityDays = validityDays;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvitationCodeGenerateRequest)) {
            return false;
        }
        InvitationCodeGenerateRequest other = (InvitationCodeGenerateRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$hostLineType = this.getHostLineType();
        Integer other$hostLineType = other.getHostLineType();
        if (this$hostLineType == null ? other$hostLineType != null : !((Object)this$hostLineType).equals(other$hostLineType)) {
            return false;
        }
        Integer this$count = this.getCount();
        Integer other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
            return false;
        }
        Integer this$usageLimit = this.getUsageLimit();
        Integer other$usageLimit = other.getUsageLimit();
        if (this$usageLimit == null ? other$usageLimit != null : !((Object)this$usageLimit).equals(other$usageLimit)) {
            return false;
        }
        Integer this$validityDays = this.getValidityDays();
        Integer other$validityDays = other.getValidityDays();
        if (this$validityDays == null ? other$validityDays != null : !((Object)this$validityDays).equals(other$validityDays)) {
            return false;
        }
        Date this$expireDatetime = this.getExpireDatetime();
        Date other$expireDatetime = other.getExpireDatetime();
        return !(this$expireDatetime == null ? other$expireDatetime != null : !((Object)this$expireDatetime).equals(other$expireDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InvitationCodeGenerateRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        Integer $usageLimit = this.getUsageLimit();
        result = result * 59 + ($usageLimit == null ? 43 : ((Object)$usageLimit).hashCode());
        Integer $validityDays = this.getValidityDays();
        result = result * 59 + ($validityDays == null ? 43 : ((Object)$validityDays).hashCode());
        Date $expireDatetime = this.getExpireDatetime();
        result = result * 59 + ($expireDatetime == null ? 43 : ((Object)$expireDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "InvitationCodeGenerateRequest(embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", count=" + this.getCount() + ", usageLimit=" + this.getUsageLimit() + ", expireDatetime=" + String.valueOf(this.getExpireDatetime()) + ", validityDays=" + this.getValidityDays() + ")";
    }
}
