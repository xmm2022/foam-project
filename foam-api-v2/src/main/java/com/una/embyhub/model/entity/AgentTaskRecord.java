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

@TableName(value="agent_task_record")
public class AgentTaskRecord
extends BaseEntity
implements Serializable {
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="task_status")
    private String taskStatus;
    @TableField(value="phase")
    private String phase;
    @TableField(value="phase_message")
    private String phaseMessage;
    @TableField(value="prompt")
    private String prompt;
    @TableField(value="workspace_root")
    private String workspaceRoot;
    @TableField(value="max_steps")
    private Integer maxSteps;
    @TableField(value="batch_size")
    private Integer batchSize;
    @TableField(value="dry_run")
    private Boolean dryRun;
    @TableField(value="steps")
    private Integer steps;
    @TableField(value="total_items")
    private Integer totalItems;
    @TableField(value="scanned_items")
    private Integer scannedItems;
    @TableField(value="planned_items")
    private Integer plannedItems;
    @TableField(value="processed_items")
    private Integer processedItems;
    @TableField(value="success_items")
    private Integer successItems;
    @TableField(value="skipped_items")
    private Integer skippedItems;
    @TableField(value="failed_items")
    private Integer failedItems;
    @TableField(value="current_batch")
    private Integer currentBatch;
    @TableField(value="total_batches")
    private Integer totalBatches;
    @TableField(value="current_target")
    private String currentTarget;
    @TableField(value="final_answer")
    private String finalAnswer;
    @TableField(value="error_message")
    private String errorMessage;
    @TableField(value="changed_files_json")
    private String changedFilesJson;
    @TableField(value="tool_steps_json")
    private String toolStepsJson;
    @TableField(value="started_at")
    private Date startedAt;
    @TableField(value="finished_at")
    private Date finishedAt;

    @Generated
    public AgentTaskRecord() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getTaskStatus() {
        return this.taskStatus;
    }

    @Generated
    public String getPhase() {
        return this.phase;
    }

    @Generated
    public String getPhaseMessage() {
        return this.phaseMessage;
    }

    @Generated
    public String getPrompt() {
        return this.prompt;
    }

    @Generated
    public String getWorkspaceRoot() {
        return this.workspaceRoot;
    }

    @Generated
    public Integer getMaxSteps() {
        return this.maxSteps;
    }

    @Generated
    public Integer getBatchSize() {
        return this.batchSize;
    }

    @Generated
    public Boolean getDryRun() {
        return this.dryRun;
    }

    @Generated
    public Integer getSteps() {
        return this.steps;
    }

    @Generated
    public Integer getTotalItems() {
        return this.totalItems;
    }

    @Generated
    public Integer getScannedItems() {
        return this.scannedItems;
    }

    @Generated
    public Integer getPlannedItems() {
        return this.plannedItems;
    }

    @Generated
    public Integer getProcessedItems() {
        return this.processedItems;
    }

    @Generated
    public Integer getSuccessItems() {
        return this.successItems;
    }

    @Generated
    public Integer getSkippedItems() {
        return this.skippedItems;
    }

    @Generated
    public Integer getFailedItems() {
        return this.failedItems;
    }

    @Generated
    public Integer getCurrentBatch() {
        return this.currentBatch;
    }

    @Generated
    public Integer getTotalBatches() {
        return this.totalBatches;
    }

    @Generated
    public String getCurrentTarget() {
        return this.currentTarget;
    }

    @Generated
    public String getFinalAnswer() {
        return this.finalAnswer;
    }

    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Generated
    public String getChangedFilesJson() {
        return this.changedFilesJson;
    }

    @Generated
    public String getToolStepsJson() {
        return this.toolStepsJson;
    }

    @Generated
    public Date getStartedAt() {
        return this.startedAt;
    }

    @Generated
    public Date getFinishedAt() {
        return this.finishedAt;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Generated
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Generated
    public void setPhaseMessage(String phaseMessage) {
        this.phaseMessage = phaseMessage;
    }

    @Generated
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Generated
    public void setWorkspaceRoot(String workspaceRoot) {
        this.workspaceRoot = workspaceRoot;
    }

    @Generated
    public void setMaxSteps(Integer maxSteps) {
        this.maxSteps = maxSteps;
    }

    @Generated
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    @Generated
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Generated
    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    @Generated
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    @Generated
    public void setScannedItems(Integer scannedItems) {
        this.scannedItems = scannedItems;
    }

    @Generated
    public void setPlannedItems(Integer plannedItems) {
        this.plannedItems = plannedItems;
    }

    @Generated
    public void setProcessedItems(Integer processedItems) {
        this.processedItems = processedItems;
    }

    @Generated
    public void setSuccessItems(Integer successItems) {
        this.successItems = successItems;
    }

    @Generated
    public void setSkippedItems(Integer skippedItems) {
        this.skippedItems = skippedItems;
    }

    @Generated
    public void setFailedItems(Integer failedItems) {
        this.failedItems = failedItems;
    }

    @Generated
    public void setCurrentBatch(Integer currentBatch) {
        this.currentBatch = currentBatch;
    }

    @Generated
    public void setTotalBatches(Integer totalBatches) {
        this.totalBatches = totalBatches;
    }

    @Generated
    public void setCurrentTarget(String currentTarget) {
        this.currentTarget = currentTarget;
    }

    @Generated
    public void setFinalAnswer(String finalAnswer) {
        this.finalAnswer = finalAnswer;
    }

    @Generated
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Generated
    public void setChangedFilesJson(String changedFilesJson) {
        this.changedFilesJson = changedFilesJson;
    }

    @Generated
    public void setToolStepsJson(String toolStepsJson) {
        this.toolStepsJson = toolStepsJson;
    }

    @Generated
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @Generated
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    @Override
    @Generated
    public String toString() {
        return "AgentTaskRecord(id=" + this.getId() + ", taskStatus=" + this.getTaskStatus() + ", phase=" + this.getPhase() + ", phaseMessage=" + this.getPhaseMessage() + ", prompt=" + this.getPrompt() + ", workspaceRoot=" + this.getWorkspaceRoot() + ", maxSteps=" + this.getMaxSteps() + ", batchSize=" + this.getBatchSize() + ", dryRun=" + this.getDryRun() + ", steps=" + this.getSteps() + ", totalItems=" + this.getTotalItems() + ", scannedItems=" + this.getScannedItems() + ", plannedItems=" + this.getPlannedItems() + ", processedItems=" + this.getProcessedItems() + ", successItems=" + this.getSuccessItems() + ", skippedItems=" + this.getSkippedItems() + ", failedItems=" + this.getFailedItems() + ", currentBatch=" + this.getCurrentBatch() + ", totalBatches=" + this.getTotalBatches() + ", currentTarget=" + this.getCurrentTarget() + ", finalAnswer=" + this.getFinalAnswer() + ", errorMessage=" + this.getErrorMessage() + ", changedFilesJson=" + this.getChangedFilesJson() + ", toolStepsJson=" + this.getToolStepsJson() + ", startedAt=" + String.valueOf(this.getStartedAt()) + ", finishedAt=" + String.valueOf(this.getFinishedAt()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskRecord)) {
            return false;
        }
        AgentTaskRecord other = (AgentTaskRecord)o;
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
        Integer this$maxSteps = this.getMaxSteps();
        Integer other$maxSteps = other.getMaxSteps();
        if (this$maxSteps == null ? other$maxSteps != null : !((Object)this$maxSteps).equals(other$maxSteps)) {
            return false;
        }
        Integer this$batchSize = this.getBatchSize();
        Integer other$batchSize = other.getBatchSize();
        if (this$batchSize == null ? other$batchSize != null : !((Object)this$batchSize).equals(other$batchSize)) {
            return false;
        }
        Boolean this$dryRun = this.getDryRun();
        Boolean other$dryRun = other.getDryRun();
        if (this$dryRun == null ? other$dryRun != null : !((Object)this$dryRun).equals(other$dryRun)) {
            return false;
        }
        Integer this$steps = this.getSteps();
        Integer other$steps = other.getSteps();
        if (this$steps == null ? other$steps != null : !((Object)this$steps).equals(other$steps)) {
            return false;
        }
        Integer this$totalItems = this.getTotalItems();
        Integer other$totalItems = other.getTotalItems();
        if (this$totalItems == null ? other$totalItems != null : !((Object)this$totalItems).equals(other$totalItems)) {
            return false;
        }
        Integer this$scannedItems = this.getScannedItems();
        Integer other$scannedItems = other.getScannedItems();
        if (this$scannedItems == null ? other$scannedItems != null : !((Object)this$scannedItems).equals(other$scannedItems)) {
            return false;
        }
        Integer this$plannedItems = this.getPlannedItems();
        Integer other$plannedItems = other.getPlannedItems();
        if (this$plannedItems == null ? other$plannedItems != null : !((Object)this$plannedItems).equals(other$plannedItems)) {
            return false;
        }
        Integer this$processedItems = this.getProcessedItems();
        Integer other$processedItems = other.getProcessedItems();
        if (this$processedItems == null ? other$processedItems != null : !((Object)this$processedItems).equals(other$processedItems)) {
            return false;
        }
        Integer this$successItems = this.getSuccessItems();
        Integer other$successItems = other.getSuccessItems();
        if (this$successItems == null ? other$successItems != null : !((Object)this$successItems).equals(other$successItems)) {
            return false;
        }
        Integer this$skippedItems = this.getSkippedItems();
        Integer other$skippedItems = other.getSkippedItems();
        if (this$skippedItems == null ? other$skippedItems != null : !((Object)this$skippedItems).equals(other$skippedItems)) {
            return false;
        }
        Integer this$failedItems = this.getFailedItems();
        Integer other$failedItems = other.getFailedItems();
        if (this$failedItems == null ? other$failedItems != null : !((Object)this$failedItems).equals(other$failedItems)) {
            return false;
        }
        Integer this$currentBatch = this.getCurrentBatch();
        Integer other$currentBatch = other.getCurrentBatch();
        if (this$currentBatch == null ? other$currentBatch != null : !((Object)this$currentBatch).equals(other$currentBatch)) {
            return false;
        }
        Integer this$totalBatches = this.getTotalBatches();
        Integer other$totalBatches = other.getTotalBatches();
        if (this$totalBatches == null ? other$totalBatches != null : !((Object)this$totalBatches).equals(other$totalBatches)) {
            return false;
        }
        String this$taskStatus = this.getTaskStatus();
        String other$taskStatus = other.getTaskStatus();
        if (this$taskStatus == null ? other$taskStatus != null : !this$taskStatus.equals(other$taskStatus)) {
            return false;
        }
        String this$phase = this.getPhase();
        String other$phase = other.getPhase();
        if (this$phase == null ? other$phase != null : !this$phase.equals(other$phase)) {
            return false;
        }
        String this$phaseMessage = this.getPhaseMessage();
        String other$phaseMessage = other.getPhaseMessage();
        if (this$phaseMessage == null ? other$phaseMessage != null : !this$phaseMessage.equals(other$phaseMessage)) {
            return false;
        }
        String this$prompt = this.getPrompt();
        String other$prompt = other.getPrompt();
        if (this$prompt == null ? other$prompt != null : !this$prompt.equals(other$prompt)) {
            return false;
        }
        String this$workspaceRoot = this.getWorkspaceRoot();
        String other$workspaceRoot = other.getWorkspaceRoot();
        if (this$workspaceRoot == null ? other$workspaceRoot != null : !this$workspaceRoot.equals(other$workspaceRoot)) {
            return false;
        }
        String this$currentTarget = this.getCurrentTarget();
        String other$currentTarget = other.getCurrentTarget();
        if (this$currentTarget == null ? other$currentTarget != null : !this$currentTarget.equals(other$currentTarget)) {
            return false;
        }
        String this$finalAnswer = this.getFinalAnswer();
        String other$finalAnswer = other.getFinalAnswer();
        if (this$finalAnswer == null ? other$finalAnswer != null : !this$finalAnswer.equals(other$finalAnswer)) {
            return false;
        }
        String this$errorMessage = this.getErrorMessage();
        String other$errorMessage = other.getErrorMessage();
        if (this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage)) {
            return false;
        }
        String this$changedFilesJson = this.getChangedFilesJson();
        String other$changedFilesJson = other.getChangedFilesJson();
        if (this$changedFilesJson == null ? other$changedFilesJson != null : !this$changedFilesJson.equals(other$changedFilesJson)) {
            return false;
        }
        String this$toolStepsJson = this.getToolStepsJson();
        String other$toolStepsJson = other.getToolStepsJson();
        if (this$toolStepsJson == null ? other$toolStepsJson != null : !this$toolStepsJson.equals(other$toolStepsJson)) {
            return false;
        }
        Date this$startedAt = this.getStartedAt();
        Date other$startedAt = other.getStartedAt();
        if (this$startedAt == null ? other$startedAt != null : !((Object)this$startedAt).equals(other$startedAt)) {
            return false;
        }
        Date this$finishedAt = this.getFinishedAt();
        Date other$finishedAt = other.getFinishedAt();
        return !(this$finishedAt == null ? other$finishedAt != null : !((Object)this$finishedAt).equals(other$finishedAt));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentTaskRecord;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $maxSteps = this.getMaxSteps();
        result = result * 59 + ($maxSteps == null ? 43 : ((Object)$maxSteps).hashCode());
        Integer $batchSize = this.getBatchSize();
        result = result * 59 + ($batchSize == null ? 43 : ((Object)$batchSize).hashCode());
        Boolean $dryRun = this.getDryRun();
        result = result * 59 + ($dryRun == null ? 43 : ((Object)$dryRun).hashCode());
        Integer $steps = this.getSteps();
        result = result * 59 + ($steps == null ? 43 : ((Object)$steps).hashCode());
        Integer $totalItems = this.getTotalItems();
        result = result * 59 + ($totalItems == null ? 43 : ((Object)$totalItems).hashCode());
        Integer $scannedItems = this.getScannedItems();
        result = result * 59 + ($scannedItems == null ? 43 : ((Object)$scannedItems).hashCode());
        Integer $plannedItems = this.getPlannedItems();
        result = result * 59 + ($plannedItems == null ? 43 : ((Object)$plannedItems).hashCode());
        Integer $processedItems = this.getProcessedItems();
        result = result * 59 + ($processedItems == null ? 43 : ((Object)$processedItems).hashCode());
        Integer $successItems = this.getSuccessItems();
        result = result * 59 + ($successItems == null ? 43 : ((Object)$successItems).hashCode());
        Integer $skippedItems = this.getSkippedItems();
        result = result * 59 + ($skippedItems == null ? 43 : ((Object)$skippedItems).hashCode());
        Integer $failedItems = this.getFailedItems();
        result = result * 59 + ($failedItems == null ? 43 : ((Object)$failedItems).hashCode());
        Integer $currentBatch = this.getCurrentBatch();
        result = result * 59 + ($currentBatch == null ? 43 : ((Object)$currentBatch).hashCode());
        Integer $totalBatches = this.getTotalBatches();
        result = result * 59 + ($totalBatches == null ? 43 : ((Object)$totalBatches).hashCode());
        String $taskStatus = this.getTaskStatus();
        result = result * 59 + ($taskStatus == null ? 43 : $taskStatus.hashCode());
        String $phase = this.getPhase();
        result = result * 59 + ($phase == null ? 43 : $phase.hashCode());
        String $phaseMessage = this.getPhaseMessage();
        result = result * 59 + ($phaseMessage == null ? 43 : $phaseMessage.hashCode());
        String $prompt = this.getPrompt();
        result = result * 59 + ($prompt == null ? 43 : $prompt.hashCode());
        String $workspaceRoot = this.getWorkspaceRoot();
        result = result * 59 + ($workspaceRoot == null ? 43 : $workspaceRoot.hashCode());
        String $currentTarget = this.getCurrentTarget();
        result = result * 59 + ($currentTarget == null ? 43 : $currentTarget.hashCode());
        String $finalAnswer = this.getFinalAnswer();
        result = result * 59 + ($finalAnswer == null ? 43 : $finalAnswer.hashCode());
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        String $changedFilesJson = this.getChangedFilesJson();
        result = result * 59 + ($changedFilesJson == null ? 43 : $changedFilesJson.hashCode());
        String $toolStepsJson = this.getToolStepsJson();
        result = result * 59 + ($toolStepsJson == null ? 43 : $toolStepsJson.hashCode());
        Date $startedAt = this.getStartedAt();
        result = result * 59 + ($startedAt == null ? 43 : ((Object)$startedAt).hashCode());
        Date $finishedAt = this.getFinishedAt();
        result = result * 59 + ($finishedAt == null ? 43 : ((Object)$finishedAt).hashCode());
        return result;
    }
}
