/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.agent;

import java.io.Serializable;
import lombok.Generated;

public class AgentTaskItemQueryRequest
implements Serializable {
    private String status;
    private Integer batchNo;
    private String keyword;

    @Generated
    public AgentTaskItemQueryRequest() {
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public Integer getBatchNo() {
        return this.batchNo;
    }

    @Generated
    public String getKeyword() {
        return this.keyword;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    @Generated
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskItemQueryRequest)) {
            return false;
        }
        AgentTaskItemQueryRequest other = (AgentTaskItemQueryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$batchNo = this.getBatchNo();
        Integer other$batchNo = other.getBatchNo();
        if (this$batchNo == null ? other$batchNo != null : !((Object)this$batchNo).equals(other$batchNo)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$keyword = this.getKeyword();
        String other$keyword = other.getKeyword();
        return !(this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentTaskItemQueryRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $batchNo = this.getBatchNo();
        result = result * 59 + ($batchNo == null ? 43 : ((Object)$batchNo).hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $keyword = this.getKeyword();
        result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentTaskItemQueryRequest(status=" + this.getStatus() + ", batchNo=" + this.getBatchNo() + ", keyword=" + this.getKeyword() + ")";
    }
}
