/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.requestpackagescardsecuritymanagement;

import java.io.Serializable;
import lombok.Generated;

public class RequestPackagesCardSecurityManagementStatusResponse
implements Serializable {
    private Long allCardSecurityManagementCount;
    private Long notUsedCardSecurityManagementCount;
    private Long usedCardSecurityManagementCount;
    private Long todayAddCount;

    @Generated
    public RequestPackagesCardSecurityManagementStatusResponse() {
    }

    @Generated
    public Long getAllCardSecurityManagementCount() {
        return this.allCardSecurityManagementCount;
    }

    @Generated
    public Long getNotUsedCardSecurityManagementCount() {
        return this.notUsedCardSecurityManagementCount;
    }

    @Generated
    public Long getUsedCardSecurityManagementCount() {
        return this.usedCardSecurityManagementCount;
    }

    @Generated
    public Long getTodayAddCount() {
        return this.todayAddCount;
    }

    @Generated
    public void setAllCardSecurityManagementCount(Long allCardSecurityManagementCount) {
        this.allCardSecurityManagementCount = allCardSecurityManagementCount;
    }

    @Generated
    public void setNotUsedCardSecurityManagementCount(Long notUsedCardSecurityManagementCount) {
        this.notUsedCardSecurityManagementCount = notUsedCardSecurityManagementCount;
    }

    @Generated
    public void setUsedCardSecurityManagementCount(Long usedCardSecurityManagementCount) {
        this.usedCardSecurityManagementCount = usedCardSecurityManagementCount;
    }

    @Generated
    public void setTodayAddCount(Long todayAddCount) {
        this.todayAddCount = todayAddCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestPackagesCardSecurityManagementStatusResponse)) {
            return false;
        }
        RequestPackagesCardSecurityManagementStatusResponse other = (RequestPackagesCardSecurityManagementStatusResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$allCardSecurityManagementCount = this.getAllCardSecurityManagementCount();
        Long other$allCardSecurityManagementCount = other.getAllCardSecurityManagementCount();
        if (this$allCardSecurityManagementCount == null ? other$allCardSecurityManagementCount != null : !((Object)this$allCardSecurityManagementCount).equals(other$allCardSecurityManagementCount)) {
            return false;
        }
        Long this$notUsedCardSecurityManagementCount = this.getNotUsedCardSecurityManagementCount();
        Long other$notUsedCardSecurityManagementCount = other.getNotUsedCardSecurityManagementCount();
        if (this$notUsedCardSecurityManagementCount == null ? other$notUsedCardSecurityManagementCount != null : !((Object)this$notUsedCardSecurityManagementCount).equals(other$notUsedCardSecurityManagementCount)) {
            return false;
        }
        Long this$usedCardSecurityManagementCount = this.getUsedCardSecurityManagementCount();
        Long other$usedCardSecurityManagementCount = other.getUsedCardSecurityManagementCount();
        if (this$usedCardSecurityManagementCount == null ? other$usedCardSecurityManagementCount != null : !((Object)this$usedCardSecurityManagementCount).equals(other$usedCardSecurityManagementCount)) {
            return false;
        }
        Long this$todayAddCount = this.getTodayAddCount();
        Long other$todayAddCount = other.getTodayAddCount();
        return !(this$todayAddCount == null ? other$todayAddCount != null : !((Object)this$todayAddCount).equals(other$todayAddCount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestPackagesCardSecurityManagementStatusResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $allCardSecurityManagementCount = this.getAllCardSecurityManagementCount();
        result = result * 59 + ($allCardSecurityManagementCount == null ? 43 : ((Object)$allCardSecurityManagementCount).hashCode());
        Long $notUsedCardSecurityManagementCount = this.getNotUsedCardSecurityManagementCount();
        result = result * 59 + ($notUsedCardSecurityManagementCount == null ? 43 : ((Object)$notUsedCardSecurityManagementCount).hashCode());
        Long $usedCardSecurityManagementCount = this.getUsedCardSecurityManagementCount();
        result = result * 59 + ($usedCardSecurityManagementCount == null ? 43 : ((Object)$usedCardSecurityManagementCount).hashCode());
        Long $todayAddCount = this.getTodayAddCount();
        result = result * 59 + ($todayAddCount == null ? 43 : ((Object)$todayAddCount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestPackagesCardSecurityManagementStatusResponse(allCardSecurityManagementCount=" + this.getAllCardSecurityManagementCount() + ", notUsedCardSecurityManagementCount=" + this.getNotUsedCardSecurityManagementCount() + ", usedCardSecurityManagementCount=" + this.getUsedCardSecurityManagementCount() + ", todayAddCount=" + this.getTodayAddCount() + ")";
    }
}
