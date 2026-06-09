/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.agent;

import java.util.Date;
import java.util.List;
import lombok.Generated;

public class AgentRunResponse {
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
    private String finalAnswer;
    private String errorMessage;
    private Date startedAt;
    private Date finishedAt;
    private Integer totalItems;
    private Integer scannedItems;
    private Integer plannedItems;
    private Integer processedItems;
    private Integer successItems;
    private Integer skippedItems;
    private Integer failedItems;
    private Integer currentBatch;
    private Integer totalBatches;
    private String currentTarget;
    private List<String> changedFiles;
    private List<AgentToolStep> toolSteps;
    private List<AgentTaskItemSummary> recentItems;

    @Generated
    public static AgentRunResponseBuilder builder() {
        return new AgentRunResponseBuilder();
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
    public String getFinalAnswer() {
        return this.finalAnswer;
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
    public List<String> getChangedFiles() {
        return this.changedFiles;
    }

    @Generated
    public List<AgentToolStep> getToolSteps() {
        return this.toolSteps;
    }

    @Generated
    public List<AgentTaskItemSummary> getRecentItems() {
        return this.recentItems;
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
    public void setFinalAnswer(String finalAnswer) {
        this.finalAnswer = finalAnswer;
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
    public void setChangedFiles(List<String> changedFiles) {
        this.changedFiles = changedFiles;
    }

    @Generated
    public void setToolSteps(List<AgentToolStep> toolSteps) {
        this.toolSteps = toolSteps;
    }

    @Generated
    public void setRecentItems(List<AgentTaskItemSummary> recentItems) {
        this.recentItems = recentItems;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentRunResponse)) {
            return false;
        }
        AgentRunResponse other = (AgentRunResponse)o;
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
        String this$currentTarget = this.getCurrentTarget();
        String other$currentTarget = other.getCurrentTarget();
        if (this$currentTarget == null ? other$currentTarget != null : !this$currentTarget.equals(other$currentTarget)) {
            return false;
        }
        List<String> this$changedFiles = this.getChangedFiles();
        List<String> other$changedFiles = other.getChangedFiles();
        if (this$changedFiles == null ? other$changedFiles != null : !((Object)this$changedFiles).equals(other$changedFiles)) {
            return false;
        }
        List<AgentToolStep> this$toolSteps = this.getToolSteps();
        List<AgentToolStep> other$toolSteps = other.getToolSteps();
        if (this$toolSteps == null ? other$toolSteps != null : !((Object)this$toolSteps).equals(other$toolSteps)) {
            return false;
        }
        List<AgentTaskItemSummary> this$recentItems = this.getRecentItems();
        List<AgentTaskItemSummary> other$recentItems = other.getRecentItems();
        return !(this$recentItems == null ? other$recentItems != null : !((Object)this$recentItems).equals(other$recentItems));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentRunResponse;
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
        String $finalAnswer = this.getFinalAnswer();
        result = result * 59 + ($finalAnswer == null ? 43 : $finalAnswer.hashCode());
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        Date $startedAt = this.getStartedAt();
        result = result * 59 + ($startedAt == null ? 43 : ((Object)$startedAt).hashCode());
        Date $finishedAt = this.getFinishedAt();
        result = result * 59 + ($finishedAt == null ? 43 : ((Object)$finishedAt).hashCode());
        String $currentTarget = this.getCurrentTarget();
        result = result * 59 + ($currentTarget == null ? 43 : $currentTarget.hashCode());
        List<String> $changedFiles = this.getChangedFiles();
        result = result * 59 + ($changedFiles == null ? 43 : ((Object)$changedFiles).hashCode());
        List<AgentToolStep> $toolSteps = this.getToolSteps();
        result = result * 59 + ($toolSteps == null ? 43 : ((Object)$toolSteps).hashCode());
        List<AgentTaskItemSummary> $recentItems = this.getRecentItems();
        result = result * 59 + ($recentItems == null ? 43 : ((Object)$recentItems).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentRunResponse(taskId=" + this.getTaskId() + ", status=" + this.getStatus() + ", phase=" + this.getPhase() + ", phaseMessage=" + this.getPhaseMessage() + ", prompt=" + this.getPrompt() + ", workspaceRoot=" + this.getWorkspaceRoot() + ", maxSteps=" + this.getMaxSteps() + ", batchSize=" + this.getBatchSize() + ", steps=" + this.getSteps() + ", dryRun=" + this.getDryRun() + ", finalAnswer=" + this.getFinalAnswer() + ", errorMessage=" + this.getErrorMessage() + ", startedAt=" + String.valueOf(this.getStartedAt()) + ", finishedAt=" + String.valueOf(this.getFinishedAt()) + ", totalItems=" + this.getTotalItems() + ", scannedItems=" + this.getScannedItems() + ", plannedItems=" + this.getPlannedItems() + ", processedItems=" + this.getProcessedItems() + ", successItems=" + this.getSuccessItems() + ", skippedItems=" + this.getSkippedItems() + ", failedItems=" + this.getFailedItems() + ", currentBatch=" + this.getCurrentBatch() + ", totalBatches=" + this.getTotalBatches() + ", currentTarget=" + this.getCurrentTarget() + ", changedFiles=" + String.valueOf(this.getChangedFiles()) + ", toolSteps=" + String.valueOf(this.getToolSteps()) + ", recentItems=" + String.valueOf(this.getRecentItems()) + ")";
    }

    @Generated
    public AgentRunResponse() {
    }

    @Generated
    public AgentRunResponse(Long taskId, String status, String phase, String phaseMessage, String prompt, String workspaceRoot, Integer maxSteps, Integer batchSize, Integer steps, Boolean dryRun, String finalAnswer, String errorMessage, Date startedAt, Date finishedAt, Integer totalItems, Integer scannedItems, Integer plannedItems, Integer processedItems, Integer successItems, Integer skippedItems, Integer failedItems, Integer currentBatch, Integer totalBatches, String currentTarget, List<String> changedFiles, List<AgentToolStep> toolSteps, List<AgentTaskItemSummary> recentItems) {
        this.taskId = taskId;
        this.status = status;
        this.phase = phase;
        this.phaseMessage = phaseMessage;
        this.prompt = prompt;
        this.workspaceRoot = workspaceRoot;
        this.maxSteps = maxSteps;
        this.batchSize = batchSize;
        this.steps = steps;
        this.dryRun = dryRun;
        this.finalAnswer = finalAnswer;
        this.errorMessage = errorMessage;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
        this.totalItems = totalItems;
        this.scannedItems = scannedItems;
        this.plannedItems = plannedItems;
        this.processedItems = processedItems;
        this.successItems = successItems;
        this.skippedItems = skippedItems;
        this.failedItems = failedItems;
        this.currentBatch = currentBatch;
        this.totalBatches = totalBatches;
        this.currentTarget = currentTarget;
        this.changedFiles = changedFiles;
        this.toolSteps = toolSteps;
        this.recentItems = recentItems;
    }

    @Generated
    public static class AgentRunResponseBuilder {
        @Generated
        private Long taskId;
        @Generated
        private String status;
        @Generated
        private String phase;
        @Generated
        private String phaseMessage;
        @Generated
        private String prompt;
        @Generated
        private String workspaceRoot;
        @Generated
        private Integer maxSteps;
        @Generated
        private Integer batchSize;
        @Generated
        private Integer steps;
        @Generated
        private Boolean dryRun;
        @Generated
        private String finalAnswer;
        @Generated
        private String errorMessage;
        @Generated
        private Date startedAt;
        @Generated
        private Date finishedAt;
        @Generated
        private Integer totalItems;
        @Generated
        private Integer scannedItems;
        @Generated
        private Integer plannedItems;
        @Generated
        private Integer processedItems;
        @Generated
        private Integer successItems;
        @Generated
        private Integer skippedItems;
        @Generated
        private Integer failedItems;
        @Generated
        private Integer currentBatch;
        @Generated
        private Integer totalBatches;
        @Generated
        private String currentTarget;
        @Generated
        private List<String> changedFiles;
        @Generated
        private List<AgentToolStep> toolSteps;
        @Generated
        private List<AgentTaskItemSummary> recentItems;

        @Generated
        AgentRunResponseBuilder() {
        }

        @Generated
        public AgentRunResponseBuilder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder status(String status) {
            this.status = status;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder phase(String phase) {
            this.phase = phase;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder phaseMessage(String phaseMessage) {
            this.phaseMessage = phaseMessage;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder workspaceRoot(String workspaceRoot) {
            this.workspaceRoot = workspaceRoot;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder maxSteps(Integer maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder steps(Integer steps) {
            this.steps = steps;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder finalAnswer(String finalAnswer) {
            this.finalAnswer = finalAnswer;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder startedAt(Date startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder finishedAt(Date finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder scannedItems(Integer scannedItems) {
            this.scannedItems = scannedItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder plannedItems(Integer plannedItems) {
            this.plannedItems = plannedItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder processedItems(Integer processedItems) {
            this.processedItems = processedItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder successItems(Integer successItems) {
            this.successItems = successItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder skippedItems(Integer skippedItems) {
            this.skippedItems = skippedItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder failedItems(Integer failedItems) {
            this.failedItems = failedItems;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder currentBatch(Integer currentBatch) {
            this.currentBatch = currentBatch;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder totalBatches(Integer totalBatches) {
            this.totalBatches = totalBatches;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder currentTarget(String currentTarget) {
            this.currentTarget = currentTarget;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder changedFiles(List<String> changedFiles) {
            this.changedFiles = changedFiles;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder toolSteps(List<AgentToolStep> toolSteps) {
            this.toolSteps = toolSteps;
            return this;
        }

        @Generated
        public AgentRunResponseBuilder recentItems(List<AgentTaskItemSummary> recentItems) {
            this.recentItems = recentItems;
            return this;
        }

        @Generated
        public AgentRunResponse build() {
            return new AgentRunResponse(this.taskId, this.status, this.phase, this.phaseMessage, this.prompt, this.workspaceRoot, this.maxSteps, this.batchSize, this.steps, this.dryRun, this.finalAnswer, this.errorMessage, this.startedAt, this.finishedAt, this.totalItems, this.scannedItems, this.plannedItems, this.processedItems, this.successItems, this.skippedItems, this.failedItems, this.currentBatch, this.totalBatches, this.currentTarget, this.changedFiles, this.toolSteps, this.recentItems);
        }

        @Generated
        public String toString() {
            return "AgentRunResponse.AgentRunResponseBuilder(taskId=" + this.taskId + ", status=" + this.status + ", phase=" + this.phase + ", phaseMessage=" + this.phaseMessage + ", prompt=" + this.prompt + ", workspaceRoot=" + this.workspaceRoot + ", maxSteps=" + this.maxSteps + ", batchSize=" + this.batchSize + ", steps=" + this.steps + ", dryRun=" + this.dryRun + ", finalAnswer=" + this.finalAnswer + ", errorMessage=" + this.errorMessage + ", startedAt=" + String.valueOf(this.startedAt) + ", finishedAt=" + String.valueOf(this.finishedAt) + ", totalItems=" + this.totalItems + ", scannedItems=" + this.scannedItems + ", plannedItems=" + this.plannedItems + ", processedItems=" + this.processedItems + ", successItems=" + this.successItems + ", skippedItems=" + this.skippedItems + ", failedItems=" + this.failedItems + ", currentBatch=" + this.currentBatch + ", totalBatches=" + this.totalBatches + ", currentTarget=" + this.currentTarget + ", changedFiles=" + String.valueOf(this.changedFiles) + ", toolSteps=" + String.valueOf(this.toolSteps) + ", recentItems=" + String.valueOf(this.recentItems) + ")";
        }
    }

    public static class AgentTaskItemSummary {
        private Long itemId;
        private Integer batch;
        private String itemType;
        private String sourcePath;
        private String targetPath;
        private String status;
        private String summary;
        private String errorMessage;
        private Date processedAt;

        @Generated
        public static AgentTaskItemSummaryBuilder builder() {
            return new AgentTaskItemSummaryBuilder();
        }

        @Generated
        public Long getItemId() {
            return this.itemId;
        }

        @Generated
        public Integer getBatch() {
            return this.batch;
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
        public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        @Generated
        public void setBatch(Integer batch) {
            this.batch = batch;
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
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof AgentTaskItemSummary)) {
                return false;
            }
            AgentTaskItemSummary other = (AgentTaskItemSummary)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Long this$itemId = this.getItemId();
            Long other$itemId = other.getItemId();
            if (this$itemId == null ? other$itemId != null : !((Object)this$itemId).equals(other$itemId)) {
                return false;
            }
            Integer this$batch = this.getBatch();
            Integer other$batch = other.getBatch();
            if (this$batch == null ? other$batch != null : !((Object)this$batch).equals(other$batch)) {
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
            return !(this$processedAt == null ? other$processedAt != null : !((Object)this$processedAt).equals(other$processedAt));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof AgentTaskItemSummary;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $itemId = this.getItemId();
            result = result * 59 + ($itemId == null ? 43 : ((Object)$itemId).hashCode());
            Integer $batch = this.getBatch();
            result = result * 59 + ($batch == null ? 43 : ((Object)$batch).hashCode());
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
            return result;
        }

        @Generated
        public String toString() {
            return "AgentRunResponse.AgentTaskItemSummary(itemId=" + this.getItemId() + ", batch=" + this.getBatch() + ", itemType=" + this.getItemType() + ", sourcePath=" + this.getSourcePath() + ", targetPath=" + this.getTargetPath() + ", status=" + this.getStatus() + ", summary=" + this.getSummary() + ", errorMessage=" + this.getErrorMessage() + ", processedAt=" + String.valueOf(this.getProcessedAt()) + ")";
        }

        @Generated
        public AgentTaskItemSummary() {
        }

        @Generated
        public AgentTaskItemSummary(Long itemId, Integer batch, String itemType, String sourcePath, String targetPath, String status, String summary, String errorMessage, Date processedAt) {
            this.itemId = itemId;
            this.batch = batch;
            this.itemType = itemType;
            this.sourcePath = sourcePath;
            this.targetPath = targetPath;
            this.status = status;
            this.summary = summary;
            this.errorMessage = errorMessage;
            this.processedAt = processedAt;
        }

        @Generated
        public static class AgentTaskItemSummaryBuilder {
            @Generated
            private Long itemId;
            @Generated
            private Integer batch;
            @Generated
            private String itemType;
            @Generated
            private String sourcePath;
            @Generated
            private String targetPath;
            @Generated
            private String status;
            @Generated
            private String summary;
            @Generated
            private String errorMessage;
            @Generated
            private Date processedAt;

            @Generated
            AgentTaskItemSummaryBuilder() {
            }

            @Generated
            public AgentTaskItemSummaryBuilder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder batch(Integer batch) {
                this.batch = batch;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder status(String status) {
                this.status = status;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder summary(String summary) {
                this.summary = summary;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            @Generated
            public AgentTaskItemSummaryBuilder processedAt(Date processedAt) {
                this.processedAt = processedAt;
                return this;
            }

            @Generated
            public AgentTaskItemSummary build() {
                return new AgentTaskItemSummary(this.itemId, this.batch, this.itemType, this.sourcePath, this.targetPath, this.status, this.summary, this.errorMessage, this.processedAt);
            }

            @Generated
            public String toString() {
                return "AgentRunResponse.AgentTaskItemSummary.AgentTaskItemSummaryBuilder(itemId=" + this.itemId + ", batch=" + this.batch + ", itemType=" + this.itemType + ", sourcePath=" + this.sourcePath + ", targetPath=" + this.targetPath + ", status=" + this.status + ", summary=" + this.summary + ", errorMessage=" + this.errorMessage + ", processedAt=" + String.valueOf(this.processedAt) + ")";
            }
        }
    }

    public static class AgentToolStep {
        private Integer batch;
        private Integer step;
        private String action;
        private String target;
        private String summary;

        @Generated
        public static AgentToolStepBuilder builder() {
            return new AgentToolStepBuilder();
        }

        @Generated
        public Integer getBatch() {
            return this.batch;
        }

        @Generated
        public Integer getStep() {
            return this.step;
        }

        @Generated
        public String getAction() {
            return this.action;
        }

        @Generated
        public String getTarget() {
            return this.target;
        }

        @Generated
        public String getSummary() {
            return this.summary;
        }

        @Generated
        public void setBatch(Integer batch) {
            this.batch = batch;
        }

        @Generated
        public void setStep(Integer step) {
            this.step = step;
        }

        @Generated
        public void setAction(String action) {
            this.action = action;
        }

        @Generated
        public void setTarget(String target) {
            this.target = target;
        }

        @Generated
        public void setSummary(String summary) {
            this.summary = summary;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof AgentToolStep)) {
                return false;
            }
            AgentToolStep other = (AgentToolStep)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Integer this$batch = this.getBatch();
            Integer other$batch = other.getBatch();
            if (this$batch == null ? other$batch != null : !((Object)this$batch).equals(other$batch)) {
                return false;
            }
            Integer this$step = this.getStep();
            Integer other$step = other.getStep();
            if (this$step == null ? other$step != null : !((Object)this$step).equals(other$step)) {
                return false;
            }
            String this$action = this.getAction();
            String other$action = other.getAction();
            if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
                return false;
            }
            String this$target = this.getTarget();
            String other$target = other.getTarget();
            if (this$target == null ? other$target != null : !this$target.equals(other$target)) {
                return false;
            }
            String this$summary = this.getSummary();
            String other$summary = other.getSummary();
            return !(this$summary == null ? other$summary != null : !this$summary.equals(other$summary));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof AgentToolStep;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Integer $batch = this.getBatch();
            result = result * 59 + ($batch == null ? 43 : ((Object)$batch).hashCode());
            Integer $step = this.getStep();
            result = result * 59 + ($step == null ? 43 : ((Object)$step).hashCode());
            String $action = this.getAction();
            result = result * 59 + ($action == null ? 43 : $action.hashCode());
            String $target = this.getTarget();
            result = result * 59 + ($target == null ? 43 : $target.hashCode());
            String $summary = this.getSummary();
            result = result * 59 + ($summary == null ? 43 : $summary.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "AgentRunResponse.AgentToolStep(batch=" + this.getBatch() + ", step=" + this.getStep() + ", action=" + this.getAction() + ", target=" + this.getTarget() + ", summary=" + this.getSummary() + ")";
        }

        @Generated
        public AgentToolStep() {
        }

        @Generated
        public AgentToolStep(Integer batch, Integer step, String action, String target, String summary) {
            this.batch = batch;
            this.step = step;
            this.action = action;
            this.target = target;
            this.summary = summary;
        }

        @Generated
        public static class AgentToolStepBuilder {
            @Generated
            private Integer batch;
            @Generated
            private Integer step;
            @Generated
            private String action;
            @Generated
            private String target;
            @Generated
            private String summary;

            @Generated
            AgentToolStepBuilder() {
            }

            @Generated
            public AgentToolStepBuilder batch(Integer batch) {
                this.batch = batch;
                return this;
            }

            @Generated
            public AgentToolStepBuilder step(Integer step) {
                this.step = step;
                return this;
            }

            @Generated
            public AgentToolStepBuilder action(String action) {
                this.action = action;
                return this;
            }

            @Generated
            public AgentToolStepBuilder target(String target) {
                this.target = target;
                return this;
            }

            @Generated
            public AgentToolStepBuilder summary(String summary) {
                this.summary = summary;
                return this;
            }

            @Generated
            public AgentToolStep build() {
                return new AgentToolStep(this.batch, this.step, this.action, this.target, this.summary);
            }

            @Generated
            public String toString() {
                return "AgentRunResponse.AgentToolStep.AgentToolStepBuilder(batch=" + this.batch + ", step=" + this.step + ", action=" + this.action + ", target=" + this.target + ", summary=" + this.summary + ")";
            }
        }
    }
}
