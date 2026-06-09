/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.rose;

import com.una.embyhub.model.dto.response.rose.RoseBindingResponse;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class RoseProfileResponse
implements Serializable {
    private Boolean enabled;
    private Boolean baseUrlConfigured;
    private List<String> supportedApps;
    private RoseBindingResponse binding;
    private Object roseProfile;
    private Object meta;
    private String message;

    @Generated
    public RoseProfileResponse() {
    }

    @Generated
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Generated
    public Boolean getBaseUrlConfigured() {
        return this.baseUrlConfigured;
    }

    @Generated
    public List<String> getSupportedApps() {
        return this.supportedApps;
    }

    @Generated
    public RoseBindingResponse getBinding() {
        return this.binding;
    }

    @Generated
    public Object getRoseProfile() {
        return this.roseProfile;
    }

    @Generated
    public Object getMeta() {
        return this.meta;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setBaseUrlConfigured(Boolean baseUrlConfigured) {
        this.baseUrlConfigured = baseUrlConfigured;
    }

    @Generated
    public void setSupportedApps(List<String> supportedApps) {
        this.supportedApps = supportedApps;
    }

    @Generated
    public void setBinding(RoseBindingResponse binding) {
        this.binding = binding;
    }

    @Generated
    public void setRoseProfile(Object roseProfile) {
        this.roseProfile = roseProfile;
    }

    @Generated
    public void setMeta(Object meta) {
        this.meta = meta;
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
        if (!(o instanceof RoseProfileResponse)) {
            return false;
        }
        RoseProfileResponse other = (RoseProfileResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$enabled = this.getEnabled();
        Boolean other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Boolean this$baseUrlConfigured = this.getBaseUrlConfigured();
        Boolean other$baseUrlConfigured = other.getBaseUrlConfigured();
        if (this$baseUrlConfigured == null ? other$baseUrlConfigured != null : !((Object)this$baseUrlConfigured).equals(other$baseUrlConfigured)) {
            return false;
        }
        List<String> this$supportedApps = this.getSupportedApps();
        List<String> other$supportedApps = other.getSupportedApps();
        if (this$supportedApps == null ? other$supportedApps != null : !((Object)this$supportedApps).equals(other$supportedApps)) {
            return false;
        }
        RoseBindingResponse this$binding = this.getBinding();
        RoseBindingResponse other$binding = other.getBinding();
        if (this$binding == null ? other$binding != null : !((Object)this$binding).equals(other$binding)) {
            return false;
        }
        Object this$roseProfile = this.getRoseProfile();
        Object other$roseProfile = other.getRoseProfile();
        if (this$roseProfile == null ? other$roseProfile != null : !this$roseProfile.equals(other$roseProfile)) {
            return false;
        }
        Object this$meta = this.getMeta();
        Object other$meta = other.getMeta();
        if (this$meta == null ? other$meta != null : !this$meta.equals(other$meta)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        return !(this$message == null ? other$message != null : !this$message.equals(other$message));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseProfileResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $baseUrlConfigured = this.getBaseUrlConfigured();
        result = result * 59 + ($baseUrlConfigured == null ? 43 : ((Object)$baseUrlConfigured).hashCode());
        List<String> $supportedApps = this.getSupportedApps();
        result = result * 59 + ($supportedApps == null ? 43 : ((Object)$supportedApps).hashCode());
        RoseBindingResponse $binding = this.getBinding();
        result = result * 59 + ($binding == null ? 43 : ((Object)$binding).hashCode());
        Object $roseProfile = this.getRoseProfile();
        result = result * 59 + ($roseProfile == null ? 43 : $roseProfile.hashCode());
        Object $meta = this.getMeta();
        result = result * 59 + ($meta == null ? 43 : $meta.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseProfileResponse(enabled=" + this.getEnabled() + ", baseUrlConfigured=" + this.getBaseUrlConfigured() + ", supportedApps=" + String.valueOf(this.getSupportedApps()) + ", binding=" + String.valueOf(this.getBinding()) + ", roseProfile=" + String.valueOf(this.getRoseProfile()) + ", meta=" + String.valueOf(this.getMeta()) + ", message=" + this.getMessage() + ")";
    }
}
