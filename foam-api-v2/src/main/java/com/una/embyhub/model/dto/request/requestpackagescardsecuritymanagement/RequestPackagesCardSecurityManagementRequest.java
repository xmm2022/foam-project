/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.BindQuery$List
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.requestpackagescardsecuritymanagement;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import lombok.Generated;

public class RequestPackagesCardSecurityManagementRequest
implements Serializable {
    @BindQuery(comparison=Comparison.EQ)
    private String cardPassword;
    @BindQuery(comparison=Comparison.EQ)
    private Integer cardStatus;
    @BindQuery(ignore=true)
    private String embyUserName;
    @BindQuery(comparison=Comparison.EQ)
    private Integer cardValidity;
    @BindQuery.List(value={@BindQuery(comparison=Comparison.EQ, field="cardPassword"), @BindQuery(comparison=Comparison.STARTSWITH, field="embyUserName")})
    private String query;
    @BindQuery(comparison=Comparison.EQ)
    private Integer cardCount;

    @Generated
    public RequestPackagesCardSecurityManagementRequest() {
    }

    @Generated
    public String getCardPassword() {
        return this.cardPassword;
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
    public Integer getCardValidity() {
        return this.cardValidity;
    }

    @Generated
    public String getQuery() {
        return this.query;
    }

    @Generated
    public Integer getCardCount() {
        return this.cardCount;
    }

    @Generated
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
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
    public void setCardValidity(Integer cardValidity) {
        this.cardValidity = cardValidity;
    }

    @Generated
    public void setQuery(String query) {
        this.query = query;
    }

    @Generated
    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestPackagesCardSecurityManagementRequest)) {
            return false;
        }
        RequestPackagesCardSecurityManagementRequest other = (RequestPackagesCardSecurityManagementRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$cardStatus = this.getCardStatus();
        Integer other$cardStatus = other.getCardStatus();
        if (this$cardStatus == null ? other$cardStatus != null : !((Object)this$cardStatus).equals(other$cardStatus)) {
            return false;
        }
        Integer this$cardValidity = this.getCardValidity();
        Integer other$cardValidity = other.getCardValidity();
        if (this$cardValidity == null ? other$cardValidity != null : !((Object)this$cardValidity).equals(other$cardValidity)) {
            return false;
        }
        Integer this$cardCount = this.getCardCount();
        Integer other$cardCount = other.getCardCount();
        if (this$cardCount == null ? other$cardCount != null : !((Object)this$cardCount).equals(other$cardCount)) {
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
        String this$query = this.getQuery();
        String other$query = other.getQuery();
        return !(this$query == null ? other$query != null : !this$query.equals(other$query));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestPackagesCardSecurityManagementRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $cardStatus = this.getCardStatus();
        result = result * 59 + ($cardStatus == null ? 43 : ((Object)$cardStatus).hashCode());
        Integer $cardValidity = this.getCardValidity();
        result = result * 59 + ($cardValidity == null ? 43 : ((Object)$cardValidity).hashCode());
        Integer $cardCount = this.getCardCount();
        result = result * 59 + ($cardCount == null ? 43 : ((Object)$cardCount).hashCode());
        String $cardPassword = this.getCardPassword();
        result = result * 59 + ($cardPassword == null ? 43 : $cardPassword.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $query = this.getQuery();
        result = result * 59 + ($query == null ? 43 : $query.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestPackagesCardSecurityManagementRequest(cardPassword=" + this.getCardPassword() + ", cardStatus=" + this.getCardStatus() + ", embyUserName=" + this.getEmbyUserName() + ", cardValidity=" + this.getCardValidity() + ", query=" + this.getQuery() + ", cardCount=" + this.getCardCount() + ")";
    }
}
