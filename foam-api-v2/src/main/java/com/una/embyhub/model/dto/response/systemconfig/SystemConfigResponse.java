/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.systemconfig;

import java.io.Serializable;
import lombok.Generated;

public class SystemConfigResponse
implements Serializable {
    private Long id;
    private String configKey;
    private String configValue;
    private Integer isEnabled;
    private String description;
    private Integer isUpdate;
    private String name;

    @Generated
    public SystemConfigResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getConfigKey() {
        return this.configKey;
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
    public String getDescription() {
        return this.description;
    }

    @Generated
    public Integer getIsUpdate() {
        return this.isUpdate;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
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
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SystemConfigResponse)) {
            return false;
        }
        SystemConfigResponse other = (SystemConfigResponse)o;
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
        String this$configKey = this.getConfigKey();
        String other$configKey = other.getConfigKey();
        if (this$configKey == null ? other$configKey != null : !this$configKey.equals(other$configKey)) {
            return false;
        }
        String this$configValue = this.getConfigValue();
        String other$configValue = other.getConfigValue();
        if (this$configValue == null ? other$configValue != null : !this$configValue.equals(other$configValue)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SystemConfigResponse;
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
        String $configKey = this.getConfigKey();
        result = result * 59 + ($configKey == null ? 43 : $configKey.hashCode());
        String $configValue = this.getConfigValue();
        result = result * 59 + ($configValue == null ? 43 : $configValue.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SystemConfigResponse(id=" + this.getId() + ", configKey=" + this.getConfigKey() + ", configValue=" + this.getConfigValue() + ", isEnabled=" + this.getIsEnabled() + ", description=" + this.getDescription() + ", isUpdate=" + this.getIsUpdate() + ", name=" + this.getName() + ")";
    }
}
