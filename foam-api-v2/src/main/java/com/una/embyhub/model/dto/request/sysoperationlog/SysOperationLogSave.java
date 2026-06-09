/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.sysoperationlog;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SysOperationLogSave
implements Serializable {
    private Long id;
    private String operationContent;
    private String operationType;
    private Date operationTime;
    private String operator;
    private String requestUrl;
    private String requestMethod;
    private String requestParams;
    private String responseResult;
    private String ipAddress;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;

    @Generated
    public SysOperationLogSave() {
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public String getCreateUserName() {
        return this.createUserName;
    }

    @Generated
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    @Generated
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    @Generated
    public Long getCreateUserId() {
        return this.createUserId;
    }

    @Generated
    public Integer getDelFlag() {
        return this.delFlag;
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

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Generated
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Generated
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Generated
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Generated
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SysOperationLogSave)) {
            return false;
        }
        SysOperationLogSave other = (SysOperationLogSave)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$updateUserId = this.getUpdateUserId();
        Long other$updateUserId = other.getUpdateUserId();
        if (this$updateUserId == null ? other$updateUserId != null : !((Object)this$updateUserId).equals(other$updateUserId)) {
            return false;
        }
        Long this$createUserId = this.getCreateUserId();
        Long other$createUserId = other.getCreateUserId();
        if (this$createUserId == null ? other$createUserId != null : !((Object)this$createUserId).equals(other$createUserId)) {
            return false;
        }
        Integer this$delFlag = this.getDelFlag();
        Integer other$delFlag = other.getDelFlag();
        if (this$delFlag == null ? other$delFlag != null : !((Object)this$delFlag).equals(other$delFlag)) {
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
        if (this$ipAddress == null ? other$ipAddress != null : !this$ipAddress.equals(other$ipAddress)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        if (this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime)) {
            return false;
        }
        String this$createUserName = this.getCreateUserName();
        String other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) {
            return false;
        }
        String this$updateUserName = this.getUpdateUserName();
        String other$updateUserName = other.getUpdateUserName();
        return !(this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SysOperationLogSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
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
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SysOperationLogSave(id=" + this.getId() + ", operationContent=" + this.getOperationContent() + ", operationType=" + this.getOperationType() + ", operationTime=" + String.valueOf(this.getOperationTime()) + ", operator=" + this.getOperator() + ", requestUrl=" + this.getRequestUrl() + ", requestMethod=" + this.getRequestMethod() + ", requestParams=" + this.getRequestParams() + ", responseResult=" + this.getResponseResult() + ", ipAddress=" + this.getIpAddress() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ")";
    }
}
