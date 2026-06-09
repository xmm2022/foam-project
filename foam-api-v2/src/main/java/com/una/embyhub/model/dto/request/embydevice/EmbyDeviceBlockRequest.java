/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embydevice;

import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class EmbyDeviceBlockRequest {
    @NotBlank(message="\u8bbe\u5907ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u8bbe\u5907ID\u4e0d\u80fd\u4e3a\u7a7a") String deviceId;
    private Long embyInfoId;

    @Generated
    public EmbyDeviceBlockRequest() {
    }

    @Generated
    public String getDeviceId() {
        return this.deviceId;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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
        if (!(o instanceof EmbyDeviceBlockRequest)) {
            return false;
        }
        EmbyDeviceBlockRequest other = (EmbyDeviceBlockRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        String this$deviceId = this.getDeviceId();
        String other$deviceId = other.getDeviceId();
        return !(this$deviceId == null ? other$deviceId != null : !this$deviceId.equals(other$deviceId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyDeviceBlockRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $deviceId = this.getDeviceId();
        result = result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyDeviceBlockRequest(deviceId=" + this.getDeviceId() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
