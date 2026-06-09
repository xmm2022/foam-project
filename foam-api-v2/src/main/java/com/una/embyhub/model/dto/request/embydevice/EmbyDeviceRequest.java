/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embydevice;

import lombok.Generated;

public class EmbyDeviceRequest {
    private String deviceName;
    private String appName;
    private Integer blocked;
    private Long embyInfoId;

    @Generated
    public EmbyDeviceRequest() {
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
    public Integer getBlocked() {
        return this.blocked;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
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
    public void setBlocked(Integer blocked) {
        this.blocked = blocked;
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
        if (!(o instanceof EmbyDeviceRequest)) {
            return false;
        }
        EmbyDeviceRequest other = (EmbyDeviceRequest)o;
        if (!other.canEqual(this)) {
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
        String this$deviceName = this.getDeviceName();
        String other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
            return false;
        }
        String this$appName = this.getAppName();
        String other$appName = other.getAppName();
        return !(this$appName == null ? other$appName != null : !this$appName.equals(other$appName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyDeviceRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $blocked = this.getBlocked();
        result = result * 59 + ($blocked == null ? 43 : ((Object)$blocked).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $deviceName = this.getDeviceName();
        result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
        String $appName = this.getAppName();
        result = result * 59 + ($appName == null ? 43 : $appName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyDeviceRequest(deviceName=" + this.getDeviceName() + ", appName=" + this.getAppName() + ", blocked=" + this.getBlocked() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
