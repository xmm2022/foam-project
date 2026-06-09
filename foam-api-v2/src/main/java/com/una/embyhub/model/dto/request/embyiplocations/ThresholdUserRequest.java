/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyiplocations;

import java.io.Serializable;
import lombok.Generated;

public class ThresholdUserRequest
implements Serializable {
    private Integer thresholdUserCount = 0;
    private Long embyInfoId;

    @Generated
    public ThresholdUserRequest() {
    }

    @Generated
    public Integer getThresholdUserCount() {
        return this.thresholdUserCount;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public void setThresholdUserCount(Integer thresholdUserCount) {
        this.thresholdUserCount = thresholdUserCount;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ThresholdUserRequest)) {
            return false;
        }
        ThresholdUserRequest other = (ThresholdUserRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$thresholdUserCount = this.getThresholdUserCount();
        Integer other$thresholdUserCount = other.getThresholdUserCount();
        if (this$thresholdUserCount == null ? other$thresholdUserCount != null : !((Object)this$thresholdUserCount).equals(other$thresholdUserCount)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        return !(this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ThresholdUserRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $thresholdUserCount = this.getThresholdUserCount();
        result = result * 59 + ($thresholdUserCount == null ? 43 : ((Object)$thresholdUserCount).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ThresholdUserRequest(thresholdUserCount=" + this.getThresholdUserCount() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
