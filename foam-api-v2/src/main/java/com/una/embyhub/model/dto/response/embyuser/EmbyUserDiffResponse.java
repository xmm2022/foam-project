/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyUserDiffResponse
implements Serializable {
    private Long embyInfoId;
    private String serverName;
    private String userName;
    private String systemStatus;
    private String embyStatus;
    private String diffType;
    private Long systemUserId;
    private String systemEmbyUserId;
    private String embyUserId;
    private Date createDatetime;
    private Date updateDatetime;

    @Generated
    public EmbyUserDiffResponse() {
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public String getSystemStatus() {
        return this.systemStatus;
    }

    @Generated
    public String getEmbyStatus() {
        return this.embyStatus;
    }

    @Generated
    public String getDiffType() {
        return this.diffType;
    }

    @Generated
    public Long getSystemUserId() {
        return this.systemUserId;
    }

    @Generated
    public String getSystemEmbyUserId() {
        return this.systemEmbyUserId;
    }

    @Generated
    public String getEmbyUserId() {
        return this.embyUserId;
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
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus;
    }

    @Generated
    public void setEmbyStatus(String embyStatus) {
        this.embyStatus = embyStatus;
    }

    @Generated
    public void setDiffType(String diffType) {
        this.diffType = diffType;
    }

    @Generated
    public void setSystemUserId(Long systemUserId) {
        this.systemUserId = systemUserId;
    }

    @Generated
    public void setSystemEmbyUserId(String systemEmbyUserId) {
        this.systemEmbyUserId = systemEmbyUserId;
    }

    @Generated
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserDiffResponse)) {
            return false;
        }
        EmbyUserDiffResponse other = (EmbyUserDiffResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Long this$systemUserId = this.getSystemUserId();
        Long other$systemUserId = other.getSystemUserId();
        if (this$systemUserId == null ? other$systemUserId != null : !((Object)this$systemUserId).equals(other$systemUserId)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        String this$systemStatus = this.getSystemStatus();
        String other$systemStatus = other.getSystemStatus();
        if (this$systemStatus == null ? other$systemStatus != null : !this$systemStatus.equals(other$systemStatus)) {
            return false;
        }
        String this$embyStatus = this.getEmbyStatus();
        String other$embyStatus = other.getEmbyStatus();
        if (this$embyStatus == null ? other$embyStatus != null : !this$embyStatus.equals(other$embyStatus)) {
            return false;
        }
        String this$diffType = this.getDiffType();
        String other$diffType = other.getDiffType();
        if (this$diffType == null ? other$diffType != null : !this$diffType.equals(other$diffType)) {
            return false;
        }
        String this$systemEmbyUserId = this.getSystemEmbyUserId();
        String other$systemEmbyUserId = other.getSystemEmbyUserId();
        if (this$systemEmbyUserId == null ? other$systemEmbyUserId != null : !this$systemEmbyUserId.equals(other$systemEmbyUserId)) {
            return false;
        }
        String this$embyUserId = this.getEmbyUserId();
        String other$embyUserId = other.getEmbyUserId();
        if (this$embyUserId == null ? other$embyUserId != null : !this$embyUserId.equals(other$embyUserId)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        return !(this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserDiffResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Long $systemUserId = this.getSystemUserId();
        result = result * 59 + ($systemUserId == null ? 43 : ((Object)$systemUserId).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $systemStatus = this.getSystemStatus();
        result = result * 59 + ($systemStatus == null ? 43 : $systemStatus.hashCode());
        String $embyStatus = this.getEmbyStatus();
        result = result * 59 + ($embyStatus == null ? 43 : $embyStatus.hashCode());
        String $diffType = this.getDiffType();
        result = result * 59 + ($diffType == null ? 43 : $diffType.hashCode());
        String $systemEmbyUserId = this.getSystemEmbyUserId();
        result = result * 59 + ($systemEmbyUserId == null ? 43 : $systemEmbyUserId.hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserDiffResponse(embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", userName=" + this.getUserName() + ", systemStatus=" + this.getSystemStatus() + ", embyStatus=" + this.getEmbyStatus() + ", diffType=" + this.getDiffType() + ", systemUserId=" + this.getSystemUserId() + ", systemEmbyUserId=" + this.getSystemEmbyUserId() + ", embyUserId=" + this.getEmbyUserId() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ")";
    }
}
