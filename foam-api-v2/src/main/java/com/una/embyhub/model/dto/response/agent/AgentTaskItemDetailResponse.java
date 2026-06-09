/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.agent;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class AgentTaskItemDetailResponse
implements Serializable {
    private Long id;
    private Long taskId;
    private Integer batchNo;
    private Integer sortOrder;
    private String itemType;
    private String sourcePath;
    private String targetPath;
    private String status;
    private String summary;
    private String errorMessage;
    private Date processedAt;
    private Date createDatetime;
    private Date updateDatetime;
    private Boolean manualTmdbResolvable;

    @Generated
    public AgentTaskItemDetailResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getTaskId() {
        return this.taskId;
    }

    @Generated
    public Integer getBatchNo() {
        return this.batchNo;
    }

    @Generated
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    @Generated
    public String getItemType() {
        return this.itemType;
    }

    @Generated
    public String getSourcePath() {
        return this.sourcePath;
    }

    @Generated
    public String getTargetPath() {
        return this.targetPath;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getSummary() {
        return this.summary;
    }

    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Generated
    public Date getProcessedAt() {
        return this.processedAt;
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
    public Boolean getManualTmdbResolvable() {
        return this.manualTmdbResolvable;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Generated
    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    @Generated
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Generated
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Generated
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    @Generated
    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Generated
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Generated
    public void setProcessedAt(Date processedAt) {
        this.processedAt = processedAt;
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
    public void setManualTmdbResolvable(Boolean manualTmdbResolvable) {
        this.manualTmdbResolvable = manualTmdbResolvable;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskItemDetailResponse)) {
            return false;
        }
        AgentTaskItemDetailResponse other = (AgentTaskItemDetailResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$taskId = this.getTaskId();
        Long other$taskId = other.getTaskId();
        if (this$taskId == null ? other$taskId != null : !((Object)this$taskId).equals(other$taskId)) {
            return false;
        }
        Integer this$batchNo = this.getBatchNo();
        Integer other$batchNo = other.getBatchNo();
        if (this$batchNo == null ? other$batchNo != null : !((Object)this$batchNo).equals(other$batchNo)) {
            return false;
        }
        Integer this$sortOrder = this.getSortOrder();
        Integer other$sortOrder = other.getSortOrder();
        if (this$sortOrder == null ? other$sortOrder != null : !((Object)this$sortOrder).equals(other$sortOrder)) {
            return false;
        }
        Boolean this$manualTmdbResolvable = this.getManualTmdbResolvable();
        Boolean other$manualTmdbResolvable = other.getManualTmdbResolvable();
        if (this$manualTmdbResolvable == null ? other$manualTmdbResolvable != null : !((Object)this$manualTmdbResolvable).equals(other$manualTmdbResolvable)) {
            return false;
        }
        String this$itemType = this.getItemType();
        String other$itemType = other.getItemType();
        if (this$itemType == null ? other$itemType != null : !this$itemType.equals(other$itemType)) {
            return false;
        }
        String this$sourcePath = this.getSourcePath();
        String other$sourcePath = other.getSourcePath();
        if (this$sourcePath == null ? other$sourcePath != null : !this$sourcePath.equals(other$sourcePath)) {
            return false;
        }
        String this$targetPath = this.getTargetPath();
        String other$targetPath = other.getTargetPath();
        if (this$targetPath == null ? other$targetPath != null : !this$targetPath.equals(other$targetPath)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$summary = this.getSummary();
        String other$summary = other.getSummary();
        if (this$summary == null ? other$summary != null : !this$summary.equals(other$summary)) {
            return false;
        }
        String this$errorMessage = this.getErrorMessage();
        String other$errorMessage = other.getErrorMessage();
        if (this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage)) {
            return false;
        }
        Date this$processedAt = this.getProcessedAt();
        Date other$processedAt = other.getProcessedAt();
        if (this$processedAt == null ? other$processedAt != null : !((Object)this$processedAt).equals(other$processedAt)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        return !(this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentTaskItemDetailResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $taskId = this.getTaskId();
        result = result * 59 + ($taskId == null ? 43 : ((Object)$taskId).hashCode());
        Integer $batchNo = this.getBatchNo();
        result = result * 59 + ($batchNo == null ? 43 : ((Object)$batchNo).hashCode());
        Integer $sortOrder = this.getSortOrder();
        result = result * 59 + ($sortOrder == null ? 43 : ((Object)$sortOrder).hashCode());
        Boolean $manualTmdbResolvable = this.getManualTmdbResolvable();
        result = result * 59 + ($manualTmdbResolvable == null ? 43 : ((Object)$manualTmdbResolvable).hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $sourcePath = this.getSourcePath();
        result = result * 59 + ($sourcePath == null ? 43 : $sourcePath.hashCode());
        String $targetPath = this.getTargetPath();
        result = result * 59 + ($targetPath == null ? 43 : $targetPath.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $summary = this.getSummary();
        result = result * 59 + ($summary == null ? 43 : $summary.hashCode());
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        Date $processedAt = this.getProcessedAt();
        result = result * 59 + ($processedAt == null ? 43 : ((Object)$processedAt).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentTaskItemDetailResponse(id=" + this.getId() + ", taskId=" + this.getTaskId() + ", batchNo=" + this.getBatchNo() + ", sortOrder=" + this.getSortOrder() + ", itemType=" + this.getItemType() + ", sourcePath=" + this.getSourcePath() + ", targetPath=" + this.getTargetPath() + ", status=" + this.getStatus() + ", summary=" + this.getSummary() + ", errorMessage=" + this.getErrorMessage() + ", processedAt=" + String.valueOf(this.getProcessedAt()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", manualTmdbResolvable=" + this.getManualTmdbResolvable() + ")";
    }
}
