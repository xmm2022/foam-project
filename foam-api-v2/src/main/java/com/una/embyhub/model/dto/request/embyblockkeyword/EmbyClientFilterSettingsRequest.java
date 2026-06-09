/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyblockkeyword;

import lombok.Generated;

public class EmbyClientFilterSettingsRequest {
    private Boolean enabled;
    private Boolean blockUser;

    @Generated
    public EmbyClientFilterSettingsRequest() {
    }

    @Generated
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Generated
    public Boolean getBlockUser() {
        return this.blockUser;
    }

    @Generated
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setBlockUser(Boolean blockUser) {
        this.blockUser = blockUser;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyClientFilterSettingsRequest)) {
            return false;
        }
        EmbyClientFilterSettingsRequest other = (EmbyClientFilterSettingsRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$enabled = this.getEnabled();
        Boolean other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Boolean this$blockUser = this.getBlockUser();
        Boolean other$blockUser = other.getBlockUser();
        return !(this$blockUser == null ? other$blockUser != null : !((Object)this$blockUser).equals(other$blockUser));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyClientFilterSettingsRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $blockUser = this.getBlockUser();
        result = result * 59 + ($blockUser == null ? 43 : ((Object)$blockUser).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyClientFilterSettingsRequest(enabled=" + this.getEnabled() + ", blockUser=" + this.getBlockUser() + ")";
    }
}
