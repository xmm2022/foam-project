/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.swagger.v3.oas.annotations.media.Schema
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.pointsbot;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import java.util.Map;
import lombok.Generated;

@Schema(description="\u79ef\u5206\u673a\u5668\u4eba\u62bd\u5956\u53c2\u4e0e\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotLotteryEntryStatsResponse {
    @Schema(description="\u603b\u53c2\u4e0e\u8bb0\u5f55\u6570")
    private Long totalEntries;
    @Schema(description="\u53c2\u4e0e\u7528\u6237\u6570\uff08\u53bb\u91cd\uff09")
    private Long uniqueUsers;
    @Schema(description="\u6700\u6d3b\u8dc3\u7528\u6237Top5\uff08userId -> \u53c2\u4e0e\u6b21\u6570\uff09")
    private List<Map<String, Object>> topActiveUsers;
    @Schema(description="\u53c2\u4e0e\u7387\uff08\u6709\u4eba\u53c2\u4e0e\u7684\u62bd\u5956\u5360\u6bd4\uff09")
    private String participationRate;

    @Generated
    public PointsBotLotteryEntryStatsResponse() {
    }

    @Generated
    public Long getTotalEntries() {
        return this.totalEntries;
    }

    @Generated
    public Long getUniqueUsers() {
        return this.uniqueUsers;
    }

    @Generated
    public List<Map<String, Object>> getTopActiveUsers() {
        return this.topActiveUsers;
    }

    @Generated
    public String getParticipationRate() {
        return this.participationRate;
    }

    @Generated
    public void setTotalEntries(Long totalEntries) {
        this.totalEntries = totalEntries;
    }

    @Generated
    public void setUniqueUsers(Long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
    }

    @Generated
    public void setTopActiveUsers(List<Map<String, Object>> topActiveUsers) {
        this.topActiveUsers = topActiveUsers;
    }

    @Generated
    public void setParticipationRate(String participationRate) {
        this.participationRate = participationRate;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLotteryEntryStatsResponse)) {
            return false;
        }
        PointsBotLotteryEntryStatsResponse other = (PointsBotLotteryEntryStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalEntries = this.getTotalEntries();
        Long other$totalEntries = other.getTotalEntries();
        if (this$totalEntries == null ? other$totalEntries != null : !((Object)this$totalEntries).equals(other$totalEntries)) {
            return false;
        }
        Long this$uniqueUsers = this.getUniqueUsers();
        Long other$uniqueUsers = other.getUniqueUsers();
        if (this$uniqueUsers == null ? other$uniqueUsers != null : !((Object)this$uniqueUsers).equals(other$uniqueUsers)) {
            return false;
        }
        List<Map<String, Object>> this$topActiveUsers = this.getTopActiveUsers();
        List<Map<String, Object>> other$topActiveUsers = other.getTopActiveUsers();
        if (this$topActiveUsers == null ? other$topActiveUsers != null : !((Object)this$topActiveUsers).equals(other$topActiveUsers)) {
            return false;
        }
        String this$participationRate = this.getParticipationRate();
        String other$participationRate = other.getParticipationRate();
        return !(this$participationRate == null ? other$participationRate != null : !this$participationRate.equals(other$participationRate));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLotteryEntryStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalEntries = this.getTotalEntries();
        result = result * 59 + ($totalEntries == null ? 43 : ((Object)$totalEntries).hashCode());
        Long $uniqueUsers = this.getUniqueUsers();
        result = result * 59 + ($uniqueUsers == null ? 43 : ((Object)$uniqueUsers).hashCode());
        List<Map<String, Object>> $topActiveUsers = this.getTopActiveUsers();
        result = result * 59 + ($topActiveUsers == null ? 43 : ((Object)$topActiveUsers).hashCode());
        String $participationRate = this.getParticipationRate();
        result = result * 59 + ($participationRate == null ? 43 : $participationRate.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLotteryEntryStatsResponse(totalEntries=" + this.getTotalEntries() + ", uniqueUsers=" + this.getUniqueUsers() + ", topActiveUsers=" + String.valueOf(this.getTopActiveUsers()) + ", participationRate=" + this.getParticipationRate() + ")";
    }
}
