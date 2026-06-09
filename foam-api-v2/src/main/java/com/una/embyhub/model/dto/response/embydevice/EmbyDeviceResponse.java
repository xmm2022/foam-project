/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embydevice;

import java.util.Date;
import lombok.Generated;

public class EmbyDeviceResponse {
    private Long id;
    private String deviceId;
    private String deviceName;
    private String appName;
    private String appVersion;
    private String lastUserId;
    private String lastUserName;
    private Integer blocked;
    private Date lastActivityTime;
    private Long embyInfoId;
    private String embyServerId;
    private String serverName;

    @Generated
    public EmbyDeviceResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getDeviceId() {
        return this.deviceId;
    }

    @Generated
    public String getDeviceName() {
        return this.deviceName;
    }

    @Generated
    public String getAppName() {
        return this.appName;
    }

    @Generated
    public String getAppVersion() {
        return this.appVersion;
    }

    @Generated
    public String getLastUserId() {
        return this.lastUserId;
    }

    @Generated
    public String getLastUserName() {
        return this.lastUserName;
    }

    @Generated
    public Integer getBlocked() {
        return this.blocked;
    }

    @Generated
    public Date getLastActivityTime() {
        return this.lastActivityTime;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getEmbyServerId() {
        return this.embyServerId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Generated
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Generated
    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Generated
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Generated
    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId;
    }

    @Generated
    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
    }

    @Generated
    public void setBlocked(Integer blocked) {
        this.blocked = blocked;
    }

    @Generated
    public void setLastActivityTime(Date lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyDeviceResponse)) {
            return false;
        }
        EmbyDeviceResponse other = (EmbyDeviceResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$blocked = this.getBlocked();
        Integer other$blocked = other.getBlocked();
        if (this$blocked == null ? other$blocked != null : !((Object)this$blocked).equals(other$blocked)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        String this$deviceId = this.getDeviceId();
        String other$deviceId = other.getDeviceId();
        if (this$deviceId == null ? other$deviceId != null : !this$deviceId.equals(other$deviceId)) {
            return false;
        }
        String this$deviceName = this.getDeviceName();
        String other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
            return false;
        }
        String this$appName = this.getAppName();
        String other$appName = other.getAppName();
        if (this$appName == null ? other$appName != null : !this$appName.equals(other$appName)) {
            return false;
        }
        String this$appVersion = this.getAppVersion();
        String other$appVersion = other.getAppVersion();
        if (this$appVersion == null ? other$appVersion != null : !this$appVersion.equals(other$appVersion)) {
            return false;
        }
        String this$lastUserId = this.getLastUserId();
        String other$lastUserId = other.getLastUserId();
        if (this$lastUserId == null ? other$lastUserId != null : !this$lastUserId.equals(other$lastUserId)) {
            return false;
        }
        String this$lastUserName = this.getLastUserName();
        String other$lastUserName = other.getLastUserName();
        if (this$lastUserName == null ? other$lastUserName != null : !this$lastUserName.equals(other$lastUserName)) {
            return false;
        }
        Date this$lastActivityTime = this.getLastActivityTime();
        Date other$lastActivityTime = other.getLastActivityTime();
        if (this$lastActivityTime == null ? other$lastActivityTime != null : !((Object)this$lastActivityTime).equals(other$lastActivityTime)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        return !(this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyDeviceResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $blocked = this.getBlocked();
        result = result * 59 + ($blocked == null ? 43 : ((Object)$blocked).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $deviceId = this.getDeviceId();
        result = result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
        String $deviceName = this.getDeviceName();
        result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
        String $appName = this.getAppName();
        result = result * 59 + ($appName == null ? 43 : $appName.hashCode());
        String $appVersion = this.getAppVersion();
        result = result * 59 + ($appVersion == null ? 43 : $appVersion.hashCode());
        String $lastUserId = this.getLastUserId();
        result = result * 59 + ($lastUserId == null ? 43 : $lastUserId.hashCode());
        String $lastUserName = this.getLastUserName();
        result = result * 59 + ($lastUserName == null ? 43 : $lastUserName.hashCode());
        Date $lastActivityTime = this.getLastActivityTime();
        result = result * 59 + ($lastActivityTime == null ? 43 : ((Object)$lastActivityTime).hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyDeviceResponse(id=" + this.getId() + ", deviceId=" + this.getDeviceId() + ", deviceName=" + this.getDeviceName() + ", appName=" + this.getAppName() + ", appVersion=" + this.getAppVersion() + ", lastUserId=" + this.getLastUserId() + ", lastUserName=" + this.getLastUserName() + ", blocked=" + this.getBlocked() + ", lastActivityTime=" + String.valueOf(this.getLastActivityTime()) + ", embyInfoId=" + this.getEmbyInfoId() + ", embyServerId=" + this.getEmbyServerId() + ", serverName=" + this.getServerName() + ")";
    }
}
