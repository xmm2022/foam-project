/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.systemconfig;

import java.io.Serializable;
import lombok.Generated;

public class SystemConfigUpdate
implements Serializable {
    private Long id;
    private String configValue;
    private Integer isEnabled;
    private Integer isUpdate;

    @Generated
    public SystemConfigUpdate() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getConfigValue() {
        return this.configValue;
    }

    @Generated
    public Integer getIsEnabled() {
        return this.isEnabled;
    }

    @Generated
    public Integer getIsUpdate() {
        return this.isUpdate;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Generated
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Generated
    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SystemConfigUpdate)) {
            return false;
        }
        SystemConfigUpdate other = (SystemConfigUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$isEnabled = this.getIsEnabled();
        Integer other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        Integer this$isUpdate = this.getIsUpdate();
        Integer other$isUpdate = other.getIsUpdate();
        if (this$isUpdate == null ? other$isUpdate != null : !((Object)this$isUpdate).equals(other$isUpdate)) {
            return false;
        }
        String this$configValue = this.getConfigValue();
        String other$configValue = other.getConfigValue();
        return !(this$configValue == null ? other$configValue != null : !this$configValue.equals(other$configValue));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SystemConfigUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        Integer $isUpdate = this.getIsUpdate();
        result = result * 59 + ($isUpdate == null ? 43 : ((Object)$isUpdate).hashCode());
        String $configValue = this.getConfigValue();
        result = result * 59 + ($configValue == null ? 43 : $configValue.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SystemConfigUpdate(id=" + this.getId() + ", configValue=" + this.getConfigValue() + ", isEnabled=" + this.getIsEnabled() + ", isUpdate=" + this.getIsUpdate() + ")";
    }
}
