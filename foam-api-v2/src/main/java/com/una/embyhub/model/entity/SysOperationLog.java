/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

@TableName(value="sys_operation_log")
public class SysOperationLog
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="operation_content")
    private String operationContent;
    @TableField(value="operation_type")
    private String operationType;
    @TableField(value="operation_time")
    private Date operationTime;
    @TableField(value="`operator`")
    private String operator;
    @TableField(value="request_url")
    private String requestUrl;
    @TableField(value="request_method")
    private String requestMethod;
    @TableField(value="request_params")
    private String requestParams;
    @TableField(value="response_result")
    private String responseResult;
    @TableField(value="ip_address")
    private String ipAddress;
    public static final String COL_ID = "id";
    public static final String COL_OPERATION_CONTENT = "operation_content";
    public static final String COL_OPERATION_TYPE = "operation_type";
    public static final String COL_OPERATION_TIME = "operation_time";
    public static final String COL_OPERATOR = "operator";
    public static final String COL_REQUEST_URL = "request_url";
    public static final String COL_REQUEST_METHOD = "request_method";
    public static final String COL_REQUEST_PARAMS = "request_params";
    public static final String COL_RESPONSE_RESULT = "response_result";
    public static final String COL_IP_ADDRESS = "ip_address";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public SysOperationLog() {
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
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Generated
    public String getRequestMethod() {
        return this.requestMethod;
    }

    @Generated
    public String getRequestParams() {
        return this.requestParams;
    }

    @Generated
    public String getResponseResult() {
        return this.responseResult;
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
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Generated
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    @Generated
    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    @Generated
    public void setResponseResult(String responseResult) {
        this.responseResult = responseResult;
    }

    @Generated
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    @Generated
    public String toString() {
        return "SysOperationLog(id=" + this.getId() + ", operationContent=" + this.getOperationContent() + ", operationType=" + this.getOperationType() + ", operationTime=" + String.valueOf(this.getOperationTime()) + ", operator=" + this.getOperator() + ", requestUrl=" + this.getRequestUrl() + ", requestMethod=" + this.getRequestMethod() + ", requestParams=" + this.getRequestParams() + ", responseResult=" + this.getResponseResult() + ", ipAddress=" + this.getIpAddress() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysOperationLog)) {
            return false;
        }
        SysOperationLog other = (SysOperationLog)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        String this$requestUrl = this.getRequestUrl();
        String other$requestUrl = other.getRequestUrl();
        if (this$requestUrl == null ? other$requestUrl != null : !this$requestUrl.equals(other$requestUrl)) {
            return false;
        }
        String this$requestMethod = this.getRequestMethod();
        String other$requestMethod = other.getRequestMethod();
        if (this$requestMethod == null ? other$requestMethod != null : !this$requestMethod.equals(other$requestMethod)) {
            return false;
        }
        String this$requestParams = this.getRequestParams();
        String other$requestParams = other.getRequestParams();
        if (this$requestParams == null ? other$requestParams != null : !this$requestParams.equals(other$requestParams)) {
            return false;
        }
        String this$responseResult = this.getResponseResult();
        String other$responseResult = other.getResponseResult();
        if (this$responseResult == null ? other$responseResult != null : !this$responseResult.equals(other$responseResult)) {
            return false;
        }
        String this$ipAddress = this.getIpAddress();
        String other$ipAddress = other.getIpAddress();
        return !(this$ipAddress == null ? other$ipAddress != null : !this$ipAddress.equals(other$ipAddress));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysOperationLog;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
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
        String $requestUrl = this.getRequestUrl();
        result = result * 59 + ($requestUrl == null ? 43 : $requestUrl.hashCode());
        String $requestMethod = this.getRequestMethod();
        result = result * 59 + ($requestMethod == null ? 43 : $requestMethod.hashCode());
        String $requestParams = this.getRequestParams();
        result = result * 59 + ($requestParams == null ? 43 : $requestParams.hashCode());
        String $responseResult = this.getResponseResult();
        result = result * 59 + ($responseResult == null ? 43 : $responseResult.hashCode());
        String $ipAddress = this.getIpAddress();
        result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
        return result;
    }
}
