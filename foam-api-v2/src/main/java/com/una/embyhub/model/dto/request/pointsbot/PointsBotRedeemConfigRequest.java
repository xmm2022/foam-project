/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import java.io.Serializable;
import lombok.Generated;

public class PointsBotRedeemConfigRequest
implements Serializable {
    private String configName;
    private Long embyInfoId;
    private Integer enabled;

    @Generated
    public PointsBotRedeemConfigRequest() {
    }

    @Generated
    public String getConfigName() {
        return this.configName;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotRedeemConfigRequest)) {
            return false;
        }
        PointsBotRedeemConfigRequest other = (PointsBotRedeemConfigRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$configName = this.getConfigName();
        String other$configName = other.getConfigName();
        return !(this$configName == null ? other$configName != null : !this$configName.equals(other$configName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotRedeemConfigRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $configName = this.getConfigName();
        result = result * 59 + ($configName == null ? 43 : $configName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotRedeemConfigRequest(configName=" + this.getConfigName() + ", embyInfoId=" + this.getEmbyInfoId() + ", enabled=" + this.getEnabled() + ")";
    }
}
