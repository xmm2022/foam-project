/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import java.io.Serializable;
import lombok.Generated;

public class DisableUserRequest
implements Serializable {
    private String embyUserId;

    @Generated
    public DisableUserRequest() {
    }

    @Generated
    public String getEmbyUserId() {
        return this.embyUserId;
    }

    @Generated
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DisableUserRequest)) {
            return false;
        }
        DisableUserRequest other = (DisableUserRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$embyUserId = this.getEmbyUserId();
        String other$embyUserId = other.getEmbyUserId();
        return !(this$embyUserId == null ? other$embyUserId != null : !this$embyUserId.equals(other$embyUserId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DisableUserRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DisableUserRequest(embyUserId=" + this.getEmbyUserId() + ")";
    }
}
