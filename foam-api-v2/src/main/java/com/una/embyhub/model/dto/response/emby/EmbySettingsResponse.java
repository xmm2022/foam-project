/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import lombok.Generated;

public class EmbySettingsResponse
implements Serializable {
    private String embyUrl;
    private String embyKey;
    private String adminUserId;

    @Generated
    public EmbySettingsResponse() {
    }

    @Generated
    public String getEmbyUrl() {
        return this.embyUrl;
    }

    @Generated
    public String getEmbyKey() {
        return this.embyKey;
    }

    @Generated
    public String getAdminUserId() {
        return this.adminUserId;
    }

    @Generated
    public void setEmbyUrl(String embyUrl) {
        this.embyUrl = embyUrl;
    }

    @Generated
    public void setEmbyKey(String embyKey) {
        this.embyKey = embyKey;
    }

    @Generated
    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbySettingsResponse)) {
            return false;
        }
        EmbySettingsResponse other = (EmbySettingsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$embyUrl = this.getEmbyUrl();
        String other$embyUrl = other.getEmbyUrl();
        if (this$embyUrl == null ? other$embyUrl != null : !this$embyUrl.equals(other$embyUrl)) {
            return false;
        }
        String this$embyKey = this.getEmbyKey();
        String other$embyKey = other.getEmbyKey();
        if (this$embyKey == null ? other$embyKey != null : !this$embyKey.equals(other$embyKey)) {
            return false;
        }
        String this$adminUserId = this.getAdminUserId();
        String other$adminUserId = other.getAdminUserId();
        return !(this$adminUserId == null ? other$adminUserId != null : !this$adminUserId.equals(other$adminUserId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbySettingsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $embyUrl = this.getEmbyUrl();
        result = result * 59 + ($embyUrl == null ? 43 : $embyUrl.hashCode());
        String $embyKey = this.getEmbyKey();
        result = result * 59 + ($embyKey == null ? 43 : $embyKey.hashCode());
        String $adminUserId = this.getAdminUserId();
        result = result * 59 + ($adminUserId == null ? 43 : $adminUserId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbySettingsResponse(embyUrl=" + this.getEmbyUrl() + ", embyKey=" + this.getEmbyKey() + ", adminUserId=" + this.getAdminUserId() + ")";
    }
}
