/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distributionapplication;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import lombok.Generated;

public class DistributionApplicationRequest
implements Serializable {
    @BindQuery(comparison=Comparison.EQ)
    private Long userId;
    @BindQuery(comparison=Comparison.EQ)
    private Integer status;
    private String userName;
    private String orderNo;

    @Generated
    public DistributionApplicationRequest() {
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
    public String getOrderNo() {
        return this.orderNo;
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
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionApplicationRequest)) {
            return false;
        }
        DistributionApplicationRequest other = (DistributionApplicationRequest)o;
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
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        String this$orderNo = this.getOrderNo();
        String other$orderNo = other.getOrderNo();
        return !(this$orderNo == null ? other$orderNo != null : !this$orderNo.equals(other$orderNo));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionApplicationRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $orderNo = this.getOrderNo();
        result = result * 59 + ($orderNo == null ? 43 : $orderNo.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionApplicationRequest(userId=" + this.getUserId() + ", status=" + this.getStatus() + ", userName=" + this.getUserName() + ", orderNo=" + this.getOrderNo() + ")";
    }
}
