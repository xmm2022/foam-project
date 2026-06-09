/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.hostline;

import java.io.Serializable;
import lombok.Generated;

public class HostLineRequest
implements Serializable {
    private Long embyInfoId;
    private String lineName;
    private Integer lineType;
    private Integer isDisplay;
    private Integer enabled;

    @Generated
    public HostLineRequest() {
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getLineName() {
        return this.lineName;
    }

    @Generated
    public Integer getLineType() {
        return this.lineType;
    }

    @Generated
    public Integer getIsDisplay() {
        return this.isDisplay;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    @Generated
    public void setLineType(Integer lineType) {
        this.lineType = lineType;
    }

    @Generated
    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
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
        if (!(o instanceof HostLineRequest)) {
            return false;
        }
        HostLineRequest other = (HostLineRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$lineType = this.getLineType();
        Integer other$lineType = other.getLineType();
        if (this$lineType == null ? other$lineType != null : !((Object)this$lineType).equals(other$lineType)) {
            return false;
        }
        Integer this$isDisplay = this.getIsDisplay();
        Integer other$isDisplay = other.getIsDisplay();
        if (this$isDisplay == null ? other$isDisplay != null : !((Object)this$isDisplay).equals(other$isDisplay)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$lineName = this.getLineName();
        String other$lineName = other.getLineName();
        return !(this$lineName == null ? other$lineName != null : !this$lineName.equals(other$lineName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof HostLineRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $lineType = this.getLineType();
        result = result * 59 + ($lineType == null ? 43 : ((Object)$lineType).hashCode());
        Integer $isDisplay = this.getIsDisplay();
        result = result * 59 + ($isDisplay == null ? 43 : ((Object)$isDisplay).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $lineName = this.getLineName();
        result = result * 59 + ($lineName == null ? 43 : $lineName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "HostLineRequest(embyInfoId=" + this.getEmbyInfoId() + ", lineName=" + this.getLineName() + ", lineType=" + this.getLineType() + ", isDisplay=" + this.getIsDisplay() + ", enabled=" + this.getEnabled() + ")";
    }
}
