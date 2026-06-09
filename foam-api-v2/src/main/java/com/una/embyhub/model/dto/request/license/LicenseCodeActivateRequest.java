/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.license;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Generated;

public class LicenseCodeActivateRequest
implements Serializable {
    @NotBlank(message="\u6388\u6743\u7801\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u6388\u6743\u7801\u4e0d\u80fd\u4e3a\u7a7a") String licenseCode;

    @Generated
    public LicenseCodeActivateRequest() {
    }

    @Generated
    public String getLicenseCode() {
        return this.licenseCode;
    }

    @Generated
    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LicenseCodeActivateRequest)) {
            return false;
        }
        LicenseCodeActivateRequest other = (LicenseCodeActivateRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$licenseCode = this.getLicenseCode();
        String other$licenseCode = other.getLicenseCode();
        return !(this$licenseCode == null ? other$licenseCode != null : !this$licenseCode.equals(other$licenseCode));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LicenseCodeActivateRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $licenseCode = this.getLicenseCode();
        result = result * 59 + ($licenseCode == null ? 43 : $licenseCode.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LicenseCodeActivateRequest(licenseCode=" + this.getLicenseCode() + ")";
    }
}
