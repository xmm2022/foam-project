/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.license;

import lombok.Generated;

public class LicenseAdminVerifyResponse {
    private boolean valid;
    private String status;
    private String expireTime;
    private String message;

    @Generated
    public LicenseAdminVerifyResponse() {
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LicenseAdminVerifyResponse)) {
            return false;
        }
        LicenseAdminVerifyResponse other = (LicenseAdminVerifyResponse)o;
        if (!other.canEqual(this)) {
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
        return !(this$message == null ? other$message != null : !this$message.equals(other$message));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LicenseAdminVerifyResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isValid() ? 79 : 97);
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $expireTime = this.getExpireTime();
        result = result * 59 + ($expireTime == null ? 43 : $expireTime.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LicenseAdminVerifyResponse(valid=" + this.isValid() + ", status=" + this.getStatus() + ", expireTime=" + this.getExpireTime() + ", message=" + this.getMessage() + ")";
    }
}
