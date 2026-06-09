/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.notifychannel;

import java.io.Serializable;
import lombok.Generated;

public class NotifyChannelUpdate
implements Serializable {
    private Long id;
    private String name;
    private String desc;
    private String iconType;
    private Integer enabled;
    private String customIcon;
    private String params;

    @Generated
    public NotifyChannelUpdate() {
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
    public String getDesc() {
        return this.desc;
    }

    @Generated
    public String getIconType() {
        return this.iconType;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public String getCustomIcon() {
        return this.customIcon;
    }

    @Generated
    public String getParams() {
        return this.params;
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
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Generated
    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setCustomIcon(String customIcon) {
        this.customIcon = customIcon;
    }

    @Generated
    public void setParams(String params) {
        this.params = params;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NotifyChannelUpdate)) {
            return false;
        }
        NotifyChannelUpdate other = (NotifyChannelUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$desc = this.getDesc();
        String other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) {
            return false;
        }
        String this$iconType = this.getIconType();
        String other$iconType = other.getIconType();
        if (this$iconType == null ? other$iconType != null : !this$iconType.equals(other$iconType)) {
            return false;
        }
        String this$customIcon = this.getCustomIcon();
        String other$customIcon = other.getCustomIcon();
        if (this$customIcon == null ? other$customIcon != null : !this$customIcon.equals(other$customIcon)) {
            return false;
        }
        String this$params = this.getParams();
        String other$params = other.getParams();
        return !(this$params == null ? other$params != null : !this$params.equals(other$params));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof NotifyChannelUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $desc = this.getDesc();
        result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
        String $iconType = this.getIconType();
        result = result * 59 + ($iconType == null ? 43 : $iconType.hashCode());
        String $customIcon = this.getCustomIcon();
        result = result * 59 + ($customIcon == null ? 43 : $customIcon.hashCode());
        String $params = this.getParams();
        result = result * 59 + ($params == null ? 43 : $params.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "NotifyChannelUpdate(id=" + this.getId() + ", name=" + this.getName() + ", desc=" + this.getDesc() + ", iconType=" + this.getIconType() + ", enabled=" + this.getEnabled() + ", customIcon=" + this.getCustomIcon() + ", params=" + this.getParams() + ")";
    }
}
