/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.rose;

import java.io.Serializable;
import lombok.Generated;

public class RoseAdminUnbindRequest
implements Serializable {
    private String adminPassword;

    @Generated
    public RoseAdminUnbindRequest() {
    }

    @Generated
    public String getAdminPassword() {
        return this.adminPassword;
    }

    @Generated
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RoseAdminUnbindRequest)) {
            return false;
        }
        RoseAdminUnbindRequest other = (RoseAdminUnbindRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$adminPassword = this.getAdminPassword();
        String other$adminPassword = other.getAdminPassword();
        return !(this$adminPassword == null ? other$adminPassword != null : !this$adminPassword.equals(other$adminPassword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseAdminUnbindRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $adminPassword = this.getAdminPassword();
        result = result * 59 + ($adminPassword == null ? 43 : $adminPassword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseAdminUnbindRequest(adminPassword=" + this.getAdminPassword() + ")";
    }
}
