/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.swagger.v3.oas.annotations.media.Schema
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.pointsbot;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Generated;

@Schema(description="\u79ef\u5206\u673a\u5668\u4eba\u62bd\u5956\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotLotteryStatsResponse {
    @Schema(description="\u603b\u62bd\u5956\u6570")
    private Long totalLotteries;
    @Schema(description="\u8fdb\u884c\u4e2d\u62bd\u5956\u6570\uff08status = 'OPEN'\uff09")
    private Long openLotteries;
    @Schema(description="\u5df2\u5b8c\u6210\u62bd\u5956\u6570\uff08status = 'CLOSED'\uff09")
    private Long closedLotteries;
    @Schema(description="\u603b\u53c2\u4e0e\u4eba\u6b21\uff08\u4eceentry\u8868\u7edf\u8ba1\uff09")
    private Long totalParticipants;
    @Schema(description="\u53c2\u4e0e\u7387\uff08\u6709\u4eba\u53c2\u4e0e\u7684\u62bd\u5956\u5360\u6bd4\uff09")
    private String participationRate;

    @Generated
    public PointsBotLotteryStatsResponse() {
    }

    @Generated
    public Long getTotalLotteries() {
        return this.totalLotteries;
    }

    @Generated
    public Long getOpenLotteries() {
        return this.openLotteries;
    }

    @Generated
    public Long getClosedLotteries() {
        return this.closedLotteries;
    }

    @Generated
    public Long getTotalParticipants() {
        return this.totalParticipants;
    }

    @Generated
    public String getParticipationRate() {
        return this.participationRate;
    }

    @Generated
    public void setTotalLotteries(Long totalLotteries) {
        this.totalLotteries = totalLotteries;
    }

    @Generated
    public void setOpenLotteries(Long openLotteries) {
        this.openLotteries = openLotteries;
    }

    @Generated
    public void setClosedLotteries(Long closedLotteries) {
        this.closedLotteries = closedLotteries;
    }

    @Generated
    public void setTotalParticipants(Long totalParticipants) {
        this.totalParticipants = totalParticipants;
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
        if (!(o instanceof PointsBotLotteryStatsResponse)) {
            return false;
        }
        PointsBotLotteryStatsResponse other = (PointsBotLotteryStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalLotteries = this.getTotalLotteries();
        Long other$totalLotteries = other.getTotalLotteries();
        if (this$totalLotteries == null ? other$totalLotteries != null : !((Object)this$totalLotteries).equals(other$totalLotteries)) {
            return false;
        }
        Long this$openLotteries = this.getOpenLotteries();
        Long other$openLotteries = other.getOpenLotteries();
        if (this$openLotteries == null ? other$openLotteries != null : !((Object)this$openLotteries).equals(other$openLotteries)) {
            return false;
        }
        Long this$closedLotteries = this.getClosedLotteries();
        Long other$closedLotteries = other.getClosedLotteries();
        if (this$closedLotteries == null ? other$closedLotteries != null : !((Object)this$closedLotteries).equals(other$closedLotteries)) {
            return false;
        }
        Long this$totalParticipants = this.getTotalParticipants();
        Long other$totalParticipants = other.getTotalParticipants();
        if (this$totalParticipants == null ? other$totalParticipants != null : !((Object)this$totalParticipants).equals(other$totalParticipants)) {
            return false;
        }
        String this$participationRate = this.getParticipationRate();
        String other$participationRate = other.getParticipationRate();
        return !(this$participationRate == null ? other$participationRate != null : !this$participationRate.equals(other$participationRate));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLotteryStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalLotteries = this.getTotalLotteries();
        result = result * 59 + ($totalLotteries == null ? 43 : ((Object)$totalLotteries).hashCode());
        Long $openLotteries = this.getOpenLotteries();
        result = result * 59 + ($openLotteries == null ? 43 : ((Object)$openLotteries).hashCode());
        Long $closedLotteries = this.getClosedLotteries();
        result = result * 59 + ($closedLotteries == null ? 43 : ((Object)$closedLotteries).hashCode());
        Long $totalParticipants = this.getTotalParticipants();
        result = result * 59 + ($totalParticipants == null ? 43 : ((Object)$totalParticipants).hashCode());
        String $participationRate = this.getParticipationRate();
        result = result * 59 + ($participationRate == null ? 43 : $participationRate.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLotteryStatsResponse(totalLotteries=" + this.getTotalLotteries() + ", openLotteries=" + this.getOpenLotteries() + ", closedLotteries=" + this.getClosedLotteries() + ", totalParticipants=" + this.getTotalParticipants() + ", participationRate=" + this.getParticipationRate() + ")";
    }
}
