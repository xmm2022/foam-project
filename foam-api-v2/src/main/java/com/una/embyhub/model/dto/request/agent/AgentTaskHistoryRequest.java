/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.agent;

import java.io.Serializable;
import lombok.Generated;

public class AgentTaskHistoryRequest
implements Serializable {
    private String keyword;
    private String status;
    private String workspaceRoot;
    private Boolean activeOnly;

    @Generated
    public AgentTaskHistoryRequest() {
    }

    @Generated
    public String getKeyword() {
        return this.keyword;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getWorkspaceRoot() {
        return this.workspaceRoot;
    }

    @Generated
    public Boolean getActiveOnly() {
        return this.activeOnly;
    }

    @Generated
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setWorkspaceRoot(String workspaceRoot) {
        this.workspaceRoot = workspaceRoot;
    }

    @Generated
    public void setActiveOnly(Boolean activeOnly) {
        this.activeOnly = activeOnly;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskHistoryRequest)) {
            return false;
        }
        AgentTaskHistoryRequest other = (AgentTaskHistoryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$activeOnly = this.getActiveOnly();
        Boolean other$activeOnly = other.getActiveOnly();
        if (this$activeOnly == null ? other$activeOnly != null : !((Object)this$activeOnly).equals(other$activeOnly)) {
            return false;
        }
        String this$keyword = this.getKeyword();
        String other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$workspaceRoot = this.getWorkspaceRoot();
        String other$workspaceRoot = other.getWorkspaceRoot();
        return !(this$workspaceRoot == null ? other$workspaceRoot != null : !this$workspaceRoot.equals(other$workspaceRoot));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentTaskHistoryRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $activeOnly = this.getActiveOnly();
        result = result * 59 + ($activeOnly == null ? 43 : ((Object)$activeOnly).hashCode());
        String $keyword = this.getKeyword();
        result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $workspaceRoot = this.getWorkspaceRoot();
        result = result * 59 + ($workspaceRoot == null ? 43 : $workspaceRoot.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentTaskHistoryRequest(keyword=" + this.getKeyword() + ", status=" + this.getStatus() + ", workspaceRoot=" + this.getWorkspaceRoot() + ", activeOnly=" + this.getActiveOnly() + ")";
    }
}
