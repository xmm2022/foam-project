/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import lombok.Generated;

@TableName(value="system_config")
public class SystemConfig
extends BaseEntity
implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_CONFIG_KEY = "config_key";
    public static final String COL_CONFIG_VALUE = "config_value";
    public static final String COL_IS_ENABLED = "is_enabled";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_IS_UPDATE = "is_update";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="`name`")
    private String name;
    @TableField(value="config_key")
    private String configKey;
    @TableField(value="config_value")
    private String configValue;
    @TableField(value="is_enabled")
    private Integer isEnabled;
    @TableField(value="description")
    private String description;
    @TableField(value="is_update")
    private Integer isUpdate;

    @Generated
    public SystemConfig() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
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
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
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

    @Override
    @Generated
    public String toString() {
        return "SystemConfig(id=" + this.getId() + ", name=" + this.getName() + ", configKey=" + this.getConfigKey() + ", configValue=" + this.getConfigValue() + ", isEnabled=" + this.getIsEnabled() + ", description=" + this.getDescription() + ", isUpdate=" + this.getIsUpdate() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SystemConfig)) {
            return false;
        }
        SystemConfig other = (SystemConfig)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
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
        return !(this$description == null ? other$description != null : !this$description.equals(other$description));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SystemConfig;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        Integer $isUpdate = this.getIsUpdate();
        result = result * 59 + ($isUpdate == null ? 43 : ((Object)$isUpdate).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $configKey = this.getConfigKey();
        result = result * 59 + ($configKey == null ? 43 : $configKey.hashCode());
        String $configValue = this.getConfigValue();
        result = result * 59 + ($configValue == null ? 43 : $configValue.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        return result;
    }
}
