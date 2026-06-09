/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.sysoperationlog;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SysOperationLogResponse
implements Serializable {
    private Long id;
    private String operationContent;
    private String operationType;
    private Date operationTime;
    private String operator;
    private String ipAddress;

    @Generated
    public SysOperationLogResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getOperationContent() {
        return this.operationContent;
    }

    @Generated
    public String getOperationType() {
        return this.operationType;
    }

    @Generated
    public Date getOperationTime() {
        return this.operationTime;
    }

    @Generated
    public String getOperator() {
        return this.operator;
    }

    @Generated
    public String getIpAddress() {
        return this.ipAddress;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    @Generated
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Generated
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    @Generated
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Generated
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysOperationLogResponse)) {
            return false;
        }
        SysOperationLogResponse other = (SysOperationLogResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$operationContent = this.getOperationContent();
        String other$operationContent = other.getOperationContent();
        if (this$operationContent == null ? other$operationContent != null : !this$operationContent.equals(other$operationContent)) {
            return false;
        }
        String this$operationType = this.getOperationType();
        String other$operationType = other.getOperationType();
        if (this$operationType == null ? other$operationType != null : !this$operationType.equals(other$operationType)) {
            return false;
        }
        Date this$operationTime = this.getOperationTime();
        Date other$operationTime = other.getOperationTime();
        if (this$operationTime == null ? other$operationTime != null : !((Object)this$operationTime).equals(other$operationTime)) {
            return false;
        }
        String this$operator = this.getOperator();
        String other$operator = other.getOperator();
        if (this$operator == null ? other$operator != null : !this$operator.equals(other$operator)) {
            return false;
        }
        String this$ipAddress = this.getIpAddress();
        String other$ipAddress = other.getIpAddress();
        return !(this$ipAddress == null ? other$ipAddress != null : !this$ipAddress.equals(other$ipAddress));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysOperationLogResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $operationContent = this.getOperationContent();
        result = result * 59 + ($operationContent == null ? 43 : $operationContent.hashCode());
        String $operationType = this.getOperationType();
        result = result * 59 + ($operationType == null ? 43 : $operationType.hashCode());
        Date $operationTime = this.getOperationTime();
        result = result * 59 + ($operationTime == null ? 43 : ((Object)$operationTime).hashCode());
        String $operator = this.getOperator();
        result = result * 59 + ($operator == null ? 43 : $operator.hashCode());
        String $ipAddress = this.getIpAddress();
        result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SysOperationLogResponse(id=" + this.getId() + ", operationContent=" + this.getOperationContent() + ", operationType=" + this.getOperationType() + ", operationTime=" + String.valueOf(this.getOperationTime()) + ", operator=" + this.getOperator() + ", ipAddress=" + this.getIpAddress() + ")";
    }
}
