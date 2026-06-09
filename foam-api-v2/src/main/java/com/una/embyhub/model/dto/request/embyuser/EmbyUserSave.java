/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotEmpty
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Generated;

public class EmbyUserSave
implements Serializable {
    private Integer day;
    @NotEmpty(message="\u5907\u6ce8\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u5907\u6ce8\u4e0d\u80fd\u4e3a\u7a7a") String remarks;
    private String embyUserName;
    private String embyUserPassword;
    private Long embyInfoId;
    private Integer hostLineType;
    private Integer registerChannel;
    private String registerChannelDetail;
    private Integer isAdmin;

    @Generated
    public EmbyUserSave() {
    }

    @Generated
    public Integer getDay() {
        return this.day;
    }

    @Generated
    public String getRemarks() {
        return this.remarks;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public String getEmbyUserPassword() {
        return this.embyUserPassword;
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
    public String getRegisterChannelDetail() {
        return this.registerChannelDetail;
    }

    @Generated
    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    @Generated
    public void setDay(Integer day) {
        this.day = day;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setEmbyUserPassword(String embyUserPassword) {
        this.embyUserPassword = embyUserPassword;
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
    public void setRegisterChannelDetail(String registerChannelDetail) {
        this.registerChannelDetail = registerChannelDetail;
    }

    @Generated
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserSave)) {
            return false;
        }
        EmbyUserSave other = (EmbyUserSave)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$day = this.getDay();
        Integer other$day = other.getDay();
        if (this$day == null ? other$day != null : !((Object)this$day).equals(other$day)) {
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
        Integer this$isAdmin = this.getIsAdmin();
        Integer other$isAdmin = other.getIsAdmin();
        if (this$isAdmin == null ? other$isAdmin != null : !((Object)this$isAdmin).equals(other$isAdmin)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$embyUserPassword = this.getEmbyUserPassword();
        String other$embyUserPassword = other.getEmbyUserPassword();
        if (this$embyUserPassword == null ? other$embyUserPassword != null : !this$embyUserPassword.equals(other$embyUserPassword)) {
            return false;
        }
        String this$registerChannelDetail = this.getRegisterChannelDetail();
        String other$registerChannelDetail = other.getRegisterChannelDetail();
        return !(this$registerChannelDetail == null ? other$registerChannelDetail != null : !this$registerChannelDetail.equals(other$registerChannelDetail));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $day = this.getDay();
        result = result * 59 + ($day == null ? 43 : ((Object)$day).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $registerChannel = this.getRegisterChannel();
        result = result * 59 + ($registerChannel == null ? 43 : ((Object)$registerChannel).hashCode());
        Integer $isAdmin = this.getIsAdmin();
        result = result * 59 + ($isAdmin == null ? 43 : ((Object)$isAdmin).hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $embyUserPassword = this.getEmbyUserPassword();
        result = result * 59 + ($embyUserPassword == null ? 43 : $embyUserPassword.hashCode());
        String $registerChannelDetail = this.getRegisterChannelDetail();
        result = result * 59 + ($registerChannelDetail == null ? 43 : $registerChannelDetail.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserSave(day=" + this.getDay() + ", remarks=" + this.getRemarks() + ", embyUserName=" + this.getEmbyUserName() + ", embyUserPassword=" + this.getEmbyUserPassword() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", registerChannel=" + this.getRegisterChannel() + ", registerChannelDetail=" + this.getRegisterChannelDetail() + ", isAdmin=" + this.getIsAdmin() + ")";
    }
}
