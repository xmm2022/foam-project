/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonAlias
 *  jakarta.validation.constraints.Min
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.agent;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Generated;

public class AgentTaskItemManualOrganizeRequest {
    @NotNull(message="tmdbId \u4e0d\u80fd\u4e3a\u7a7a")
    @Min(value=1L, message="tmdbId \u5fc5\u987b\u5927\u4e8e 0")
    @JsonAlias(value={"tmdb_id"})
    private @NotNull(message="tmdbId \u4e0d\u80fd\u4e3a\u7a7a") @Min(value=1L, message="tmdbId \u5fc5\u987b\u5927\u4e8e 0") Integer tmdbId;

    @Generated
    public AgentTaskItemManualOrganizeRequest() {
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @JsonAlias(value={"tmdb_id"})
    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentTaskItemManualOrganizeRequest)) {
            return false;
        }
        AgentTaskItemManualOrganizeRequest other = (AgentTaskItemManualOrganizeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        return !(this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AgentTaskItemManualOrganizeRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AgentTaskItemManualOrganizeRequest(tmdbId=" + this.getTmdbId() + ")";
    }
}
