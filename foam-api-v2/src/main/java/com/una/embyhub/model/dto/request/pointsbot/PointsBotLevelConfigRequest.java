/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import java.io.Serializable;
import lombok.Generated;

public class PointsBotLevelConfigRequest
implements Serializable {
    private String levelName;
    private Integer enabled;

    @Generated
    public PointsBotLevelConfigRequest() {
    }

    @Generated
    public String getLevelName() {
        return this.levelName;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public void setLevelName(String levelName) {
        this.levelName = levelName;
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
        if (!(o instanceof PointsBotLevelConfigRequest)) {
            return false;
        }
        PointsBotLevelConfigRequest other = (PointsBotLevelConfigRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$levelName = this.getLevelName();
        String other$levelName = other.getLevelName();
        return !(this$levelName == null ? other$levelName != null : !this$levelName.equals(other$levelName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLevelConfigRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $levelName = this.getLevelName();
        result = result * 59 + ($levelName == null ? 43 : $levelName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLevelConfigRequest(levelName=" + this.getLevelName() + ", enabled=" + this.getEnabled() + ")";
    }
}
