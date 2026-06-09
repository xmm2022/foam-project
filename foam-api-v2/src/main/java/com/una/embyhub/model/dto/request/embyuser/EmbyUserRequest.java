/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyUserRequest
implements Serializable {
    @BindQuery(comparison=Comparison.EQ)
    private String embyUserId;
    @BindQuery(comparison=Comparison.STARTSWITH)
    private String embyUserName;
    @BindQuery(ignore=true)
    private Integer userStatus;
    @BindQuery(comparison=Comparison.BETWEEN_BEGIN, column="expiration_date")
    private Date expirationDateStart;
    @BindQuery(comparison=Comparison.BETWEEN_END, column="expiration_date")
    private Date expirationDateEnd;
    @BindQuery(comparison=Comparison.CONTAINS)
    private String remarks;
    @BindQuery(comparison=Comparison.EQ)
    private Long embyInfoId;
    @BindQuery(comparison=Comparison.EQ)
    private Integer hostLineType;
    @BindQuery(comparison=Comparison.EQ)
    private Integer registerChannel;
    @BindQuery(ignore=true)
    private Integer telegramBound;

    @Generated
    public EmbyUserRequest() {
    }

    @Generated
    public String getEmbyUserId() {
        return this.embyUserId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Integer getUserStatus() {
        return this.userStatus;
    }

    @Generated
    public Date getExpirationDateStart() {
        return this.expirationDateStart;
    }

    @Generated
    public Date getExpirationDateEnd() {
        return this.expirationDateEnd;
    }

    @Generated
    public String getRemarks() {
        return this.remarks;
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
    public Integer getRegisterChannel() {
        return this.registerChannel;
    }

    @Generated
    public Integer getTelegramBound() {
        return this.telegramBound;
    }

    @Generated
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Generated
    public void setExpirationDateStart(Date expirationDateStart) {
        this.expirationDateStart = expirationDateStart;
    }

    @Generated
    public void setExpirationDateEnd(Date expirationDateEnd) {
        this.expirationDateEnd = expirationDateEnd;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
    }

    @Generated
    public void setTelegramBound(Integer telegramBound) {
        this.telegramBound = telegramBound;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserRequest)) {
            return false;
        }
        EmbyUserRequest other = (EmbyUserRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$userStatus = this.getUserStatus();
        Integer other$userStatus = other.getUserStatus();
        if (this$userStatus == null ? other$userStatus != null : !((Object)this$userStatus).equals(other$userStatus)) {
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
        Integer this$registerChannel = this.getRegisterChannel();
        Integer other$registerChannel = other.getRegisterChannel();
        if (this$registerChannel == null ? other$registerChannel != null : !((Object)this$registerChannel).equals(other$registerChannel)) {
            return false;
        }
        Integer this$telegramBound = this.getTelegramBound();
        Integer other$telegramBound = other.getTelegramBound();
        if (this$telegramBound == null ? other$telegramBound != null : !((Object)this$telegramBound).equals(other$telegramBound)) {
            return false;
        }
        String this$embyUserId = this.getEmbyUserId();
        String other$embyUserId = other.getEmbyUserId();
        if (this$embyUserId == null ? other$embyUserId != null : !this$embyUserId.equals(other$embyUserId)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        Date this$expirationDateStart = this.getExpirationDateStart();
        Date other$expirationDateStart = other.getExpirationDateStart();
        if (this$expirationDateStart == null ? other$expirationDateStart != null : !((Object)this$expirationDateStart).equals(other$expirationDateStart)) {
            return false;
        }
        Date this$expirationDateEnd = this.getExpirationDateEnd();
        Date other$expirationDateEnd = other.getExpirationDateEnd();
        if (this$expirationDateEnd == null ? other$expirationDateEnd != null : !((Object)this$expirationDateEnd).equals(other$expirationDateEnd)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        return !(this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $userStatus = this.getUserStatus();
        result = result * 59 + ($userStatus == null ? 43 : ((Object)$userStatus).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $registerChannel = this.getRegisterChannel();
        result = result * 59 + ($registerChannel == null ? 43 : ((Object)$registerChannel).hashCode());
        Integer $telegramBound = this.getTelegramBound();
        result = result * 59 + ($telegramBound == null ? 43 : ((Object)$telegramBound).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        Date $expirationDateStart = this.getExpirationDateStart();
        result = result * 59 + ($expirationDateStart == null ? 43 : ((Object)$expirationDateStart).hashCode());
        Date $expirationDateEnd = this.getExpirationDateEnd();
        result = result * 59 + ($expirationDateEnd == null ? 43 : ((Object)$expirationDateEnd).hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserRequest(embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", userStatus=" + this.getUserStatus() + ", expirationDateStart=" + String.valueOf(this.getExpirationDateStart()) + ", expirationDateEnd=" + String.valueOf(this.getExpirationDateEnd()) + ", remarks=" + this.getRemarks() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", registerChannel=" + this.getRegisterChannel() + ", telegramBound=" + this.getTelegramBound() + ")";
    }
}
