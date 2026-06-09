/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyblockkeyword;

import java.util.List;
import lombok.Generated;

public class EmbyClientFilterSettingsResponse {
    private Boolean enabled;
    private Boolean blockUser;
    private Boolean usingDefaultPatterns;
    private List<String> defaultPatterns;
    private List<String> effectivePatterns;

    @Generated
    public EmbyClientFilterSettingsResponse() {
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
    public Boolean getUsingDefaultPatterns() {
        return this.usingDefaultPatterns;
    }

    @Generated
    public List<String> getDefaultPatterns() {
        return this.defaultPatterns;
    }

    @Generated
    public List<String> getEffectivePatterns() {
        return this.effectivePatterns;
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
    public void setUsingDefaultPatterns(Boolean usingDefaultPatterns) {
        this.usingDefaultPatterns = usingDefaultPatterns;
    }

    @Generated
    public void setDefaultPatterns(List<String> defaultPatterns) {
        this.defaultPatterns = defaultPatterns;
    }

    @Generated
    public void setEffectivePatterns(List<String> effectivePatterns) {
        this.effectivePatterns = effectivePatterns;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyClientFilterSettingsResponse)) {
            return false;
        }
        EmbyClientFilterSettingsResponse other = (EmbyClientFilterSettingsResponse)o;
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
        if (this$blockUser == null ? other$blockUser != null : !((Object)this$blockUser).equals(other$blockUser)) {
            return false;
        }
        Boolean this$usingDefaultPatterns = this.getUsingDefaultPatterns();
        Boolean other$usingDefaultPatterns = other.getUsingDefaultPatterns();
        if (this$usingDefaultPatterns == null ? other$usingDefaultPatterns != null : !((Object)this$usingDefaultPatterns).equals(other$usingDefaultPatterns)) {
            return false;
        }
        List<String> this$defaultPatterns = this.getDefaultPatterns();
        List<String> other$defaultPatterns = other.getDefaultPatterns();
        if (this$defaultPatterns == null ? other$defaultPatterns != null : !((Object)this$defaultPatterns).equals(other$defaultPatterns)) {
            return false;
        }
        List<String> this$effectivePatterns = this.getEffectivePatterns();
        List<String> other$effectivePatterns = other.getEffectivePatterns();
        return !(this$effectivePatterns == null ? other$effectivePatterns != null : !((Object)this$effectivePatterns).equals(other$effectivePatterns));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyClientFilterSettingsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $blockUser = this.getBlockUser();
        result = result * 59 + ($blockUser == null ? 43 : ((Object)$blockUser).hashCode());
        Boolean $usingDefaultPatterns = this.getUsingDefaultPatterns();
        result = result * 59 + ($usingDefaultPatterns == null ? 43 : ((Object)$usingDefaultPatterns).hashCode());
        List<String> $defaultPatterns = this.getDefaultPatterns();
        result = result * 59 + ($defaultPatterns == null ? 43 : ((Object)$defaultPatterns).hashCode());
        List<String> $effectivePatterns = this.getEffectivePatterns();
        result = result * 59 + ($effectivePatterns == null ? 43 : ((Object)$effectivePatterns).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyClientFilterSettingsResponse(enabled=" + this.getEnabled() + ", blockUser=" + this.getBlockUser() + ", usingDefaultPatterns=" + this.getUsingDefaultPatterns() + ", defaultPatterns=" + String.valueOf(this.getDefaultPatterns()) + ", effectivePatterns=" + String.valueOf(this.getEffectivePatterns()) + ")";
    }
}
