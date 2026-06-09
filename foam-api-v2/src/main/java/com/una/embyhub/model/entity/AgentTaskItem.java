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

@TableName(value="agent_task_item")
public class AgentTaskItem
extends BaseEntity
implements Serializable {
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="task_id")
    private Long taskId;
    @TableField(value="batch_no")
    private Integer batchNo;
    @TableField(value="sort_order")
    private Integer sortOrder;
    @TableField(value="item_type")
    private String itemType;
    @TableField(value="source_path")
    private String sourcePath;
    @TableField(value="target_path")
    private String targetPath;
    @TableField(value="item_status")
    private String itemStatus;
    @TableField(value="summary")
    private String summary;
    @TableField(value="error_message")
    private String errorMessage;
    @TableField(value="processed_at")
    private Date processedAt;

    @Generated
    public AgentTaskItem() {
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
    public String getItemStatus() {
        return this.itemStatus;
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
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
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

    @Override
    @Generated
    public String toString() {
        return "AgentTaskItem(id=" + this.getId() + ", taskId=" + this.getTaskId() + ", batchNo=" + this.getBatchNo() + ", sortOrder=" + this.getSortOrder() + ", itemType=" + this.getItemType() + ", sourcePath=" + this.getSourcePath() + ", targetPath=" + this.getTargetPath() + ", itemStatus=" + this.getItemStatus() + ", summary=" + this.getSummary() + ", errorMessage=" + this.getErrorMessage() + ", processedAt=" + String.valueOf(this.getProcessedAt()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskItem)) {
            return false;
        }
        AgentTaskItem other = (AgentTaskItem)o;
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
        String this$itemStatus = this.getItemStatus();
        String other$itemStatus = other.getItemStatus();
        if (this$itemStatus == null ? other$itemStatus != null : !this$itemStatus.equals(other$itemStatus)) {
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
        return !(this$processedAt == null ? other$processedAt != null : !((Object)this$processedAt).equals(other$processedAt));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentTaskItem;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $taskId = this.getTaskId();
        result = result * 59 + ($taskId == null ? 43 : ((Object)$taskId).hashCode());
        Integer $batchNo = this.getBatchNo();
        result = result * 59 + ($batchNo == null ? 43 : ((Object)$batchNo).hashCode());
        Integer $sortOrder = this.getSortOrder();
        result = result * 59 + ($sortOrder == null ? 43 : ((Object)$sortOrder).hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $sourcePath = this.getSourcePath();
        result = result * 59 + ($sourcePath == null ? 43 : $sourcePath.hashCode());
        String $targetPath = this.getTargetPath();
        result = result * 59 + ($targetPath == null ? 43 : $targetPath.hashCode());
        String $itemStatus = this.getItemStatus();
        result = result * 59 + ($itemStatus == null ? 43 : $itemStatus.hashCode());
        String $summary = this.getSummary();
        result = result * 59 + ($summary == null ? 43 : $summary.hashCode());
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        Date $processedAt = this.getProcessedAt();
        result = result * 59 + ($processedAt == null ? 43 : ((Object)$processedAt).hashCode());
        return result;
    }
}
