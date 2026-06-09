/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonAlias
 *  jakarta.validation.constraints.Max
 *  jakarta.validation.constraints.Min
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.agent;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Generated;

public class AgentRunRequest {
    @NotBlank(message="prompt \u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="prompt \u4e0d\u80fd\u4e3a\u7a7a") String prompt;
    @NotBlank(message="workspaceRoot \u4e0d\u80fd\u4e3a\u7a7a")
    @JsonAlias(value={"workspace_root"})
    private @NotBlank(message="workspaceRoot \u4e0d\u80fd\u4e3a\u7a7a") String workspaceRoot;
    @JsonAlias(value={"scope_path"})
    private String scopePath;
    @NotNull(message="maxSteps \u4e0d\u80fd\u4e3a\u7a7a")
    @Min(value=1L, message="maxSteps \u5fc5\u987b\u5927\u4e8e 0")
    @Max(value=8L, message="maxSteps \u4e0d\u80fd\u5927\u4e8e 8")
    @JsonAlias(value={"max_steps"})
    private @NotNull(message="maxSteps \u4e0d\u80fd\u4e3a\u7a7a") @Min(value=1L, message="maxSteps \u5fc5\u987b\u5927\u4e8e 0") @Max(value=8L, message="maxSteps \u4e0d\u80fd\u5927\u4e8e 8") Integer maxSteps;
    @Min(value=1L, message="batchSize \u5fc5\u987b\u5927\u4e8e 0")
    @Max(value=30L, message="batchSize \u4e0d\u80fd\u5927\u4e8e 30")
    @JsonAlias(value={"batch_size"})
    private @Min(value=1L, message="batchSize \u5fc5\u987b\u5927\u4e8e 0") @Max(value=30L, message="batchSize \u4e0d\u80fd\u5927\u4e8e 30") Integer batchSize;
    @JsonAlias(value={"dry_run"})
    private Boolean dryRun;

    @Generated
    public AgentRunRequest() {
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
    public String getScopePath() {
        return this.scopePath;
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
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @JsonAlias(value={"workspace_root"})
    @Generated
    public void setWorkspaceRoot(String workspaceRoot) {
        this.workspaceRoot = workspaceRoot;
    }

    @JsonAlias(value={"scope_path"})
    @Generated
    public void setScopePath(String scopePath) {
        this.scopePath = scopePath;
    }

    @JsonAlias(value={"max_steps"})
    @Generated
    public void setMaxSteps(Integer maxSteps) {
        this.maxSteps = maxSteps;
    }

    @JsonAlias(value={"batch_size"})
    @Generated
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    @JsonAlias(value={"dry_run"})
    @Generated
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentRunRequest)) {
            return false;
        }
        AgentRunRequest other = (AgentRunRequest)o;
        if (!other.canEqual(this)) {
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
        String this$scopePath = this.getScopePath();
        String other$scopePath = other.getScopePath();
        return !(this$scopePath == null ? other$scopePath != null : !this$scopePath.equals(other$scopePath));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentRunRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $maxSteps = this.getMaxSteps();
        result = result * 59 + ($maxSteps == null ? 43 : ((Object)$maxSteps).hashCode());
        Integer $batchSize = this.getBatchSize();
        result = result * 59 + ($batchSize == null ? 43 : ((Object)$batchSize).hashCode());
        Boolean $dryRun = this.getDryRun();
        result = result * 59 + ($dryRun == null ? 43 : ((Object)$dryRun).hashCode());
        String $prompt = this.getPrompt();
        result = result * 59 + ($prompt == null ? 43 : $prompt.hashCode());
        String $workspaceRoot = this.getWorkspaceRoot();
        result = result * 59 + ($workspaceRoot == null ? 43 : $workspaceRoot.hashCode());
        String $scopePath = this.getScopePath();
        result = result * 59 + ($scopePath == null ? 43 : $scopePath.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentRunRequest(prompt=" + this.getPrompt() + ", workspaceRoot=" + this.getWorkspaceRoot() + ", scopePath=" + this.getScopePath() + ", maxSteps=" + this.getMaxSteps() + ", batchSize=" + this.getBatchSize() + ", dryRun=" + this.getDryRun() + ")";
    }
}
