/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.cardsecuritymanagement;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import lombok.Generated;

public class CardSecurityManagementRequest
implements Serializable {
    @BindQuery(comparison=Comparison.EQ)
    private String cardPassword;
    @BindQuery(comparison=Comparison.EQ)
    private Integer cardValidity;
    @BindQuery(comparison=Comparison.EQ)
    private Integer cardStatus;
    @BindQuery(comparison=Comparison.LIKE)
    private String embyUserName;
    @BindQuery(comparison=Comparison.EQ)
    private Long embyInfoId;
    @BindQuery(comparison=Comparison.EQ)
    private Integer hostLineType;
    @BindQuery(ignore=true)
    private Boolean queryIsDistributor;
    @BindQuery(ignore=true)
    private String distributorName;

    @Generated
    public CardSecurityManagementRequest() {
    }

    @Generated
    public String getCardPassword() {
        return this.cardPassword;
    }

    @Generated
    public Integer getCardValidity() {
        return this.cardValidity;
    }

    @Generated
    public Integer getCardStatus() {
        return this.cardStatus;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public Boolean getQueryIsDistributor() {
        return this.queryIsDistributor;
    }

    @Generated
    public String getDistributorName() {
        return this.distributorName;
    }

    @Generated
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    @Generated
    public void setCardValidity(Integer cardValidity) {
        this.cardValidity = cardValidity;
    }

    @Generated
    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = hostLineType;
    }

    @Generated
    public void setQueryIsDistributor(Boolean queryIsDistributor) {
        this.queryIsDistributor = queryIsDistributor;
    }

    @Generated
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CardSecurityManagementRequest)) {
            return false;
        }
        CardSecurityManagementRequest other = (CardSecurityManagementRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$cardValidity = this.getCardValidity();
        Integer other$cardValidity = other.getCardValidity();
        if (this$cardValidity == null ? other$cardValidity != null : !((Object)this$cardValidity).equals(other$cardValidity)) {
            return false;
        }
        Integer this$cardStatus = this.getCardStatus();
        Integer other$cardStatus = other.getCardStatus();
        if (this$cardStatus == null ? other$cardStatus != null : !((Object)this$cardStatus).equals(other$cardStatus)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$hostLineType = this.getHostLineType();
        Integer other$hostLineType = other.getHostLineType();
        if (this$hostLineType == null ? other$hostLineType != null : !((Object)this$hostLineType).equals(other$hostLineType)) {
            return false;
        }
        Boolean this$queryIsDistributor = this.getQueryIsDistributor();
        Boolean other$queryIsDistributor = other.getQueryIsDistributor();
        if (this$queryIsDistributor == null ? other$queryIsDistributor != null : !((Object)this$queryIsDistributor).equals(other$queryIsDistributor)) {
            return false;
        }
        String this$cardPassword = this.getCardPassword();
        String other$cardPassword = other.getCardPassword();
        if (this$cardPassword == null ? other$cardPassword != null : !this$cardPassword.equals(other$cardPassword)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$distributorName = this.getDistributorName();
        String other$distributorName = other.getDistributorName();
        return !(this$distributorName == null ? other$distributorName != null : !this$distributorName.equals(other$distributorName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CardSecurityManagementRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $cardValidity = this.getCardValidity();
        result = result * 59 + ($cardValidity == null ? 43 : ((Object)$cardValidity).hashCode());
        Integer $cardStatus = this.getCardStatus();
        result = result * 59 + ($cardStatus == null ? 43 : ((Object)$cardStatus).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Boolean $queryIsDistributor = this.getQueryIsDistributor();
        result = result * 59 + ($queryIsDistributor == null ? 43 : ((Object)$queryIsDistributor).hashCode());
        String $cardPassword = this.getCardPassword();
        result = result * 59 + ($cardPassword == null ? 43 : $cardPassword.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $distributorName = this.getDistributorName();
        result = result * 59 + ($distributorName == null ? 43 : $distributorName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CardSecurityManagementRequest(cardPassword=" + this.getCardPassword() + ", cardValidity=" + this.getCardValidity() + ", cardStatus=" + this.getCardStatus() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", queryIsDistributor=" + this.getQueryIsDistributor() + ", distributorName=" + this.getDistributorName() + ")";
    }
}
