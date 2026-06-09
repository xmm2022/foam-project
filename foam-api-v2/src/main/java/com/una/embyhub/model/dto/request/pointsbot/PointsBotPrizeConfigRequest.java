/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import java.io.Serializable;
import lombok.Generated;

public class PointsBotPrizeConfigRequest
implements Serializable {
    private String prizeName;
    private Long levelId;
    private Integer enabled;

    @Generated
    public PointsBotPrizeConfigRequest() {
    }

    @Generated
    public String getPrizeName() {
        return this.prizeName;
    }

    @Generated
    public Long getLevelId() {
        return this.levelId;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    @Generated
    public void setLevelId(Long levelId) {
        this.levelId = levelId;
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
        if (!(o instanceof PointsBotPrizeConfigRequest)) {
            return false;
        }
        PointsBotPrizeConfigRequest other = (PointsBotPrizeConfigRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$levelId = this.getLevelId();
        Long other$levelId = other.getLevelId();
        if (this$levelId == null ? other$levelId != null : !((Object)this$levelId).equals(other$levelId)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$prizeName = this.getPrizeName();
        String other$prizeName = other.getPrizeName();
        return !(this$prizeName == null ? other$prizeName != null : !this$prizeName.equals(other$prizeName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotPrizeConfigRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $levelId = this.getLevelId();
        result = result * 59 + ($levelId == null ? 43 : ((Object)$levelId).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $prizeName = this.getPrizeName();
        result = result * 59 + ($prizeName == null ? 43 : $prizeName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotPrizeConfigRequest(prizeName=" + this.getPrizeName() + ", levelId=" + this.getLevelId() + ", enabled=" + this.getEnabled() + ")";
    }
}
