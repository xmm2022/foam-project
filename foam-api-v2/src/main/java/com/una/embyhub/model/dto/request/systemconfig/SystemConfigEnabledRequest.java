/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.systemconfig;

import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class SystemConfigEnabledRequest {
    @NotBlank(message="\u914d\u7f6e\u952e\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u914d\u7f6e\u952e\u540d\u4e0d\u80fd\u4e3a\u7a7a") String configKey;

    @Generated
    public SystemConfigEnabledRequest() {
    }

    @Generated
    public String getConfigKey() {
        return this.configKey;
    }

    @Generated
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SystemConfigEnabledRequest)) {
            return false;
        }
        SystemConfigEnabledRequest other = (SystemConfigEnabledRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$configKey = this.getConfigKey();
        String other$configKey = other.getConfigKey();
        return !(this$configKey == null ? other$configKey != null : !this$configKey.equals(other$configKey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SystemConfigEnabledRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $configKey = this.getConfigKey();
        result = result * 59 + ($configKey == null ? 43 : $configKey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SystemConfigEnabledRequest(configKey=" + this.getConfigKey() + ")";
    }
}
