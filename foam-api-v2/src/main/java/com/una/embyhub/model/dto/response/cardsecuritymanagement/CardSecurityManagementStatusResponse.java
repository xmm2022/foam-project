/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.cardsecuritymanagement;

import java.io.Serializable;
import lombok.Generated;

public class CardSecurityManagementStatusResponse
implements Serializable {
    private Long allCardSecurityManagementCount;
    private Long notUsedCardSecurityManagementCount;
    private Long usedCardSecurityManagementCount;
    private Long distributorAllCardCount;
    private Long distributorNotUsedCardCount;
    private Long distributorUsedCardCount;

    @Generated
    public CardSecurityManagementStatusResponse() {
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
    public Long getDistributorAllCardCount() {
        return this.distributorAllCardCount;
    }

    @Generated
    public Long getDistributorNotUsedCardCount() {
        return this.distributorNotUsedCardCount;
    }

    @Generated
    public Long getDistributorUsedCardCount() {
        return this.distributorUsedCardCount;
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
    public void setDistributorAllCardCount(Long distributorAllCardCount) {
        this.distributorAllCardCount = distributorAllCardCount;
    }

    @Generated
    public void setDistributorNotUsedCardCount(Long distributorNotUsedCardCount) {
        this.distributorNotUsedCardCount = distributorNotUsedCardCount;
    }

    @Generated
    public void setDistributorUsedCardCount(Long distributorUsedCardCount) {
        this.distributorUsedCardCount = distributorUsedCardCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CardSecurityManagementStatusResponse)) {
            return false;
        }
        CardSecurityManagementStatusResponse other = (CardSecurityManagementStatusResponse)o;
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
        Long this$distributorAllCardCount = this.getDistributorAllCardCount();
        Long other$distributorAllCardCount = other.getDistributorAllCardCount();
        if (this$distributorAllCardCount == null ? other$distributorAllCardCount != null : !((Object)this$distributorAllCardCount).equals(other$distributorAllCardCount)) {
            return false;
        }
        Long this$distributorNotUsedCardCount = this.getDistributorNotUsedCardCount();
        Long other$distributorNotUsedCardCount = other.getDistributorNotUsedCardCount();
        if (this$distributorNotUsedCardCount == null ? other$distributorNotUsedCardCount != null : !((Object)this$distributorNotUsedCardCount).equals(other$distributorNotUsedCardCount)) {
            return false;
        }
        Long this$distributorUsedCardCount = this.getDistributorUsedCardCount();
        Long other$distributorUsedCardCount = other.getDistributorUsedCardCount();
        return !(this$distributorUsedCardCount == null ? other$distributorUsedCardCount != null : !((Object)this$distributorUsedCardCount).equals(other$distributorUsedCardCount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CardSecurityManagementStatusResponse;
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
        Long $distributorAllCardCount = this.getDistributorAllCardCount();
        result = result * 59 + ($distributorAllCardCount == null ? 43 : ((Object)$distributorAllCardCount).hashCode());
        Long $distributorNotUsedCardCount = this.getDistributorNotUsedCardCount();
        result = result * 59 + ($distributorNotUsedCardCount == null ? 43 : ((Object)$distributorNotUsedCardCount).hashCode());
        Long $distributorUsedCardCount = this.getDistributorUsedCardCount();
        result = result * 59 + ($distributorUsedCardCount == null ? 43 : ((Object)$distributorUsedCardCount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CardSecurityManagementStatusResponse(allCardSecurityManagementCount=" + this.getAllCardSecurityManagementCount() + ", notUsedCardSecurityManagementCount=" + this.getNotUsedCardSecurityManagementCount() + ", usedCardSecurityManagementCount=" + this.getUsedCardSecurityManagementCount() + ", distributorAllCardCount=" + this.getDistributorAllCardCount() + ", distributorNotUsedCardCount=" + this.getDistributorNotUsedCardCount() + ", distributorUsedCardCount=" + this.getDistributorUsedCardCount() + ")";
    }
}
