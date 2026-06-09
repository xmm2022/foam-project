/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distribution;

import java.io.Serializable;
import lombok.Generated;

public class DistributionCustomExchangeRequest
implements Serializable {
    private String exchangeNo;
    private Long userId;
    private Integer status;
    private String userName;

    @Generated
    public DistributionCustomExchangeRequest() {
    }

    @Generated
    public String getExchangeNo() {
        return this.exchangeNo;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public void setExchangeNo(String exchangeNo) {
        this.exchangeNo = exchangeNo;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionCustomExchangeRequest)) {
            return false;
        }
        DistributionCustomExchangeRequest other = (DistributionCustomExchangeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        String this$exchangeNo = this.getExchangeNo();
        String other$exchangeNo = other.getExchangeNo();
        if (this$exchangeNo == null ? other$exchangeNo != null : !this$exchangeNo.equals(other$exchangeNo)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        return !(this$userName == null ? other$userName != null : !this$userName.equals(other$userName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionCustomExchangeRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $exchangeNo = this.getExchangeNo();
        result = result * 59 + ($exchangeNo == null ? 43 : $exchangeNo.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionCustomExchangeRequest(exchangeNo=" + this.getExchangeNo() + ", userId=" + this.getUserId() + ", status=" + this.getStatus() + ", userName=" + this.getUserName() + ")";
    }
}
