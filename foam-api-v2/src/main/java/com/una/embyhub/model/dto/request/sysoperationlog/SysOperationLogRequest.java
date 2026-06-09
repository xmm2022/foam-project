/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.sysoperationlog;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SysOperationLogRequest
implements Serializable {
    @BindQuery(comparison=Comparison.EQ)
    private String operationContent;
    @BindQuery(comparison=Comparison.BETWEEN_BEGIN, column="operation_time")
    private Date operationTimeStart;
    @BindQuery(comparison=Comparison.BETWEEN_END, column="operation_time")
    private Date operationTimeEnd;
    @BindQuery(comparison=Comparison.EQ)
    private String operator;

    @Generated
    public SysOperationLogRequest() {
    }

    @Generated
    public String getOperationContent() {
        return this.operationContent;
    }

    @Generated
    public Date getOperationTimeStart() {
        return this.operationTimeStart;
    }

    @Generated
    public Date getOperationTimeEnd() {
        return this.operationTimeEnd;
    }

    @Generated
    public String getOperator() {
        return this.operator;
    }

    @Generated
    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    @Generated
    public void setOperationTimeStart(Date operationTimeStart) {
        this.operationTimeStart = operationTimeStart;
    }

    @Generated
    public void setOperationTimeEnd(Date operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
    }

    @Generated
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysOperationLogRequest)) {
            return false;
        }
        SysOperationLogRequest other = (SysOperationLogRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$operationContent = this.getOperationContent();
        String other$operationContent = other.getOperationContent();
        if (this$operationContent == null ? other$operationContent != null : !this$operationContent.equals(other$operationContent)) {
            return false;
        }
        Date this$operationTimeStart = this.getOperationTimeStart();
        Date other$operationTimeStart = other.getOperationTimeStart();
        if (this$operationTimeStart == null ? other$operationTimeStart != null : !((Object)this$operationTimeStart).equals(other$operationTimeStart)) {
            return false;
        }
        Date this$operationTimeEnd = this.getOperationTimeEnd();
        Date other$operationTimeEnd = other.getOperationTimeEnd();
        if (this$operationTimeEnd == null ? other$operationTimeEnd != null : !((Object)this$operationTimeEnd).equals(other$operationTimeEnd)) {
            return false;
        }
        String this$operator = this.getOperator();
        String other$operator = other.getOperator();
        return !(this$operator == null ? other$operator != null : !this$operator.equals(other$operator));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysOperationLogRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $operationContent = this.getOperationContent();
        result = result * 59 + ($operationContent == null ? 43 : $operationContent.hashCode());
        Date $operationTimeStart = this.getOperationTimeStart();
        result = result * 59 + ($operationTimeStart == null ? 43 : ((Object)$operationTimeStart).hashCode());
        Date $operationTimeEnd = this.getOperationTimeEnd();
        result = result * 59 + ($operationTimeEnd == null ? 43 : ((Object)$operationTimeEnd).hashCode());
        String $operator = this.getOperator();
        result = result * 59 + ($operator == null ? 43 : $operator.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SysOperationLogRequest(operationContent=" + this.getOperationContent() + ", operationTimeStart=" + String.valueOf(this.getOperationTimeStart()) + ", operationTimeEnd=" + String.valueOf(this.getOperationTimeEnd()) + ", operator=" + this.getOperator() + ")";
    }
}
