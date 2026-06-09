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

public class AgentTaskHistoryResponse
implements Serializable {
    private Long taskId;
    private String status;
    private String phase;
    private String phaseMessage;
    private String prompt;
    private String workspaceRoot;
    private Integer maxSteps;
    private Integer batchSize;
    private Integer steps;
    private Boolean dryRun;
    private Integer totalItems;
    private Integer processedItems;
    private Integer successItems;
    private Integer skippedItems;
    private Integer failedItems;
    private Integer currentBatch;
    private Integer totalBatches;
    private String currentTarget;
    private String errorMessage;
    private Date startedAt;
    private Date finishedAt;
    private Date createDatetime;
    private Date updateDatetime;

    @Generated
    public AgentTaskHistoryResponse() {
    }

    @Generated
    public Long getTaskId() {
        return this.taskId;
    }

    @Generated
    public String getStatus() {
        return this.status;
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
    public Integer getSteps() {
        return this.steps;
    }

    @Generated
    public Boolean getDryRun() {
        return this.dryRun;
    }

    @Generated
    public Integer getTotalItems() {
        return this.totalItems;
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
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
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
    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    @Generated
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Generated
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
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
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Generated
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @Generated
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskHistoryResponse)) {
            return false;
        }
        AgentTaskHistoryResponse other = (AgentTaskHistoryResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$taskId = this.getTaskId();
        Long other$taskId = other.getTaskId();
        if (this$taskId == null ? other$taskId != null : !((Object)this$taskId).equals(other$taskId)) {
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
        Integer this$steps = this.getSteps();
        Integer other$steps = other.getSteps();
        if (this$steps == null ? other$steps != null : !((Object)this$steps).equals(other$steps)) {
            return false;
        }
        Boolean this$dryRun = this.getDryRun();
        Boolean other$dryRun = other.getDryRun();
        if (this$dryRun == null ? other$dryRun != null : !((Object)this$dryRun).equals(other$dryRun)) {
            return false;
        }
        Integer this$totalItems = this.getTotalItems();
        Integer other$totalItems = other.getTotalItems();
        if (this$totalItems == null ? other$totalItems != null : !((Object)this$totalItems).equals(other$totalItems)) {
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
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
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
        String this$errorMessage = this.getErrorMessage();
        String other$errorMessage = other.getErrorMessage();
        if (this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage)) {
            return false;
        }
        Date this$startedAt = this.getStartedAt();
        Date other$startedAt = other.getStartedAt();
        if (this$startedAt == null ? other$startedAt != null : !((Object)this$startedAt).equals(other$startedAt)) {
            return false;
        }
        Date this$finishedAt = this.getFinishedAt();
        Date other$finishedAt = other.getFinishedAt();
        if (this$finishedAt == null ? other$finishedAt != null : !((Object)this$finishedAt).equals(other$finishedAt)) {
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
        return other instanceof AgentTaskHistoryResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $taskId = this.getTaskId();
        result = result * 59 + ($taskId == null ? 43 : ((Object)$taskId).hashCode());
        Integer $maxSteps = this.getMaxSteps();
        result = result * 59 + ($maxSteps == null ? 43 : ((Object)$maxSteps).hashCode());
        Integer $batchSize = this.getBatchSize();
        result = result * 59 + ($batchSize == null ? 43 : ((Object)$batchSize).hashCode());
        Integer $steps = this.getSteps();
        result = result * 59 + ($steps == null ? 43 : ((Object)$steps).hashCode());
        Boolean $dryRun = this.getDryRun();
        result = result * 59 + ($dryRun == null ? 43 : ((Object)$dryRun).hashCode());
        Integer $totalItems = this.getTotalItems();
        result = result * 59 + ($totalItems == null ? 43 : ((Object)$totalItems).hashCode());
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
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
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
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        Date $startedAt = this.getStartedAt();
        result = result * 59 + ($startedAt == null ? 43 : ((Object)$startedAt).hashCode());
        Date $finishedAt = this.getFinishedAt();
        result = result * 59 + ($finishedAt == null ? 43 : ((Object)$finishedAt).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentTaskHistoryResponse(taskId=" + this.getTaskId() + ", status=" + this.getStatus() + ", phase=" + this.getPhase() + ", phaseMessage=" + this.getPhaseMessage() + ", prompt=" + this.getPrompt() + ", workspaceRoot=" + this.getWorkspaceRoot() + ", maxSteps=" + this.getMaxSteps() + ", batchSize=" + this.getBatchSize() + ", steps=" + this.getSteps() + ", dryRun=" + this.getDryRun() + ", totalItems=" + this.getTotalItems() + ", processedItems=" + this.getProcessedItems() + ", successItems=" + this.getSuccessItems() + ", skippedItems=" + this.getSkippedItems() + ", failedItems=" + this.getFailedItems() + ", currentBatch=" + this.getCurrentBatch() + ", totalBatches=" + this.getTotalBatches() + ", currentTarget=" + this.getCurrentTarget() + ", errorMessage=" + this.getErrorMessage() + ", startedAt=" + String.valueOf(this.getStartedAt()) + ", finishedAt=" + String.valueOf(this.getFinishedAt()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ")";
    }
}
