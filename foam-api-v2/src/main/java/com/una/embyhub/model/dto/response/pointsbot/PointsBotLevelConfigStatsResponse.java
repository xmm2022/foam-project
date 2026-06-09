/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.swagger.v3.oas.annotations.media.Schema
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.pointsbot;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;
import lombok.Generated;

@Schema(description="\u79ef\u5206\u7b49\u7ea7\u914d\u7f6e\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotLevelConfigStatsResponse {
    @Schema(description="\u603b\u7b49\u7ea7\u6570")
    private Long totalLevels;
    @Schema(description="\u542f\u7528\u7b49\u7ea7\u6570\uff08enabled = 1\uff09")
    private Long enabledLevels;
    @Schema(description="\u5404\u7b49\u7ea7\u7528\u6237\u5206\u5e03\uff08levelId -> \u7528\u6237\u6570\uff09")
    private Map<Long, Long> userDistribution;

    @Generated
    public PointsBotLevelConfigStatsResponse() {
    }

    @Generated
    public Long getTotalLevels() {
        return this.totalLevels;
    }

    @Generated
    public Long getEnabledLevels() {
        return this.enabledLevels;
    }

    @Generated
    public Map<Long, Long> getUserDistribution() {
        return this.userDistribution;
    }

    @Generated
    public void setTotalLevels(Long totalLevels) {
        this.totalLevels = totalLevels;
    }

    @Generated
    public void setEnabledLevels(Long enabledLevels) {
        this.enabledLevels = enabledLevels;
    }

    @Generated
    public void setUserDistribution(Map<Long, Long> userDistribution) {
        this.userDistribution = userDistribution;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLevelConfigStatsResponse)) {
            return false;
        }
        PointsBotLevelConfigStatsResponse other = (PointsBotLevelConfigStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalLevels = this.getTotalLevels();
        Long other$totalLevels = other.getTotalLevels();
        if (this$totalLevels == null ? other$totalLevels != null : !((Object)this$totalLevels).equals(other$totalLevels)) {
            return false;
        }
        Long this$enabledLevels = this.getEnabledLevels();
        Long other$enabledLevels = other.getEnabledLevels();
        if (this$enabledLevels == null ? other$enabledLevels != null : !((Object)this$enabledLevels).equals(other$enabledLevels)) {
            return false;
        }
        Map<Long, Long> this$userDistribution = this.getUserDistribution();
        Map<Long, Long> other$userDistribution = other.getUserDistribution();
        return !(this$userDistribution == null ? other$userDistribution != null : !((Object)this$userDistribution).equals(other$userDistribution));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLevelConfigStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalLevels = this.getTotalLevels();
        result = result * 59 + ($totalLevels == null ? 43 : ((Object)$totalLevels).hashCode());
        Long $enabledLevels = this.getEnabledLevels();
        result = result * 59 + ($enabledLevels == null ? 43 : ((Object)$enabledLevels).hashCode());
        Map<Long, Long> $userDistribution = this.getUserDistribution();
        result = result * 59 + ($userDistribution == null ? 43 : ((Object)$userDistribution).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLevelConfigStatsResponse(totalLevels=" + this.getTotalLevels() + ", enabledLevels=" + this.getEnabledLevels() + ", userDistribution=" + String.valueOf(this.getUserDistribution()) + ")";
    }
}
