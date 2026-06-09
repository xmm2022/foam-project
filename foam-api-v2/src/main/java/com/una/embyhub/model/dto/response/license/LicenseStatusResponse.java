/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.license;

import java.io.Serializable;
import lombok.Generated;

public class LicenseStatusResponse
implements Serializable {
    private boolean activated;
    private boolean valid;
    private String status;
    private String expireTime;
    private String message;
    private String licenseCode;
    private String deviceFingerprint;
    private String externalUserId;

    public static LicenseStatusResponse inactive(String message, String deviceFingerprint, String externalUserId) {
        LicenseStatusResponse response = new LicenseStatusResponse();
        response.setActivated(false);
        response.setValid(false);
        response.setStatus("INACTIVE");
        response.setMessage(message);
        response.setDeviceFingerprint(deviceFingerprint);
        response.setExternalUserId(externalUserId);
        return response;
    }

    @Generated
    public LicenseStatusResponse() {
    }

    @Generated
    public boolean isActivated() {
        return this.activated;
    }

    @Generated
    public boolean isValid() {
        return this.valid;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getExpireTime() {
        return this.expireTime;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public String getLicenseCode() {
        return this.licenseCode;
    }

    @Generated
    public String getDeviceFingerprint() {
        return this.deviceFingerprint;
    }

    @Generated
    public String getExternalUserId() {
        return this.externalUserId;
    }

    @Generated
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Generated
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Generated
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    @Generated
    public void setDeviceFingerprint(String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }

    @Generated
    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LicenseStatusResponse)) {
            return false;
        }
        LicenseStatusResponse other = (LicenseStatusResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isActivated() != other.isActivated()) {
            return false;
        }
        if (this.isValid() != other.isValid()) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$expireTime = this.getExpireTime();
        String other$expireTime = other.getExpireTime();
        if (this$expireTime == null ? other$expireTime != null : !this$expireTime.equals(other$expireTime)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        String this$licenseCode = this.getLicenseCode();
        String other$licenseCode = other.getLicenseCode();
        if (this$licenseCode == null ? other$licenseCode != null : !this$licenseCode.equals(other$licenseCode)) {
            return false;
        }
        String this$deviceFingerprint = this.getDeviceFingerprint();
        String other$deviceFingerprint = other.getDeviceFingerprint();
        if (this$deviceFingerprint == null ? other$deviceFingerprint != null : !this$deviceFingerprint.equals(other$deviceFingerprint)) {
            return false;
        }
        String this$externalUserId = this.getExternalUserId();
        String other$externalUserId = other.getExternalUserId();
        return !(this$externalUserId == null ? other$externalUserId != null : !this$externalUserId.equals(other$externalUserId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LicenseStatusResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isActivated() ? 79 : 97);
        result = result * 59 + (this.isValid() ? 79 : 97);
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $expireTime = this.getExpireTime();
        result = result * 59 + ($expireTime == null ? 43 : $expireTime.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        String $licenseCode = this.getLicenseCode();
        result = result * 59 + ($licenseCode == null ? 43 : $licenseCode.hashCode());
        String $deviceFingerprint = this.getDeviceFingerprint();
        result = result * 59 + ($deviceFingerprint == null ? 43 : $deviceFingerprint.hashCode());
        String $externalUserId = this.getExternalUserId();
        result = result * 59 + ($externalUserId == null ? 43 : $externalUserId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LicenseStatusResponse(activated=" + this.isActivated() + ", valid=" + this.isValid() + ", status=" + this.getStatus() + ", expireTime=" + this.getExpireTime() + ", message=" + this.getMessage() + ", licenseCode=" + this.getLicenseCode() + ", deviceFingerprint=" + this.getDeviceFingerprint() + ", externalUserId=" + this.getExternalUserId() + ")";
    }
}
