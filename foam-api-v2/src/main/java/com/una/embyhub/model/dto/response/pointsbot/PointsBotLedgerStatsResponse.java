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

@Schema(description="\u79ef\u5206\u673a\u5668\u4eba\u79ef\u5206\u6d41\u6c34\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotLedgerStatsResponse {
    @Schema(description="\u603b\u6d41\u6c34\u8bb0\u5f55\u6570")
    private Long totalRecords;
    @Schema(description="\u603b\u6536\u5165\u79ef\u5206\u6570\uff08delta > 0\uff09")
    private Long totalIncome;
    @Schema(description="\u603b\u652f\u51fa\u79ef\u5206\u6570\uff08delta < 0\uff0c\u7edd\u5bf9\u503c\uff09")
    private Long totalExpense;
    @Schema(description="\u51c0\u79ef\u5206\u53d8\u5316")
    private Long netChange;
    @Schema(description="\u5404\u7c7b\u578b\u6d41\u6c34\u7edf\u8ba1\uff08reason -> count\uff09")
    private Map<String, Long> reasonStats;

    @Generated
    public PointsBotLedgerStatsResponse() {
    }

    @Generated
    public Long getTotalRecords() {
        return this.totalRecords;
    }

    @Generated
    public Long getTotalIncome() {
        return this.totalIncome;
    }

    @Generated
    public Long getTotalExpense() {
        return this.totalExpense;
    }

    @Generated
    public Long getNetChange() {
        return this.netChange;
    }

    @Generated
    public Map<String, Long> getReasonStats() {
        return this.reasonStats;
    }

    @Generated
    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    @Generated
    public void setTotalIncome(Long totalIncome) {
        this.totalIncome = totalIncome;
    }

    @Generated
    public void setTotalExpense(Long totalExpense) {
        this.totalExpense = totalExpense;
    }

    @Generated
    public void setNetChange(Long netChange) {
        this.netChange = netChange;
    }

    @Generated
    public void setReasonStats(Map<String, Long> reasonStats) {
        this.reasonStats = reasonStats;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLedgerStatsResponse)) {
            return false;
        }
        PointsBotLedgerStatsResponse other = (PointsBotLedgerStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalRecords = this.getTotalRecords();
        Long other$totalRecords = other.getTotalRecords();
        if (this$totalRecords == null ? other$totalRecords != null : !((Object)this$totalRecords).equals(other$totalRecords)) {
            return false;
        }
        Long this$totalIncome = this.getTotalIncome();
        Long other$totalIncome = other.getTotalIncome();
        if (this$totalIncome == null ? other$totalIncome != null : !((Object)this$totalIncome).equals(other$totalIncome)) {
            return false;
        }
        Long this$totalExpense = this.getTotalExpense();
        Long other$totalExpense = other.getTotalExpense();
        if (this$totalExpense == null ? other$totalExpense != null : !((Object)this$totalExpense).equals(other$totalExpense)) {
            return false;
        }
        Long this$netChange = this.getNetChange();
        Long other$netChange = other.getNetChange();
        if (this$netChange == null ? other$netChange != null : !((Object)this$netChange).equals(other$netChange)) {
            return false;
        }
        Map<String, Long> this$reasonStats = this.getReasonStats();
        Map<String, Long> other$reasonStats = other.getReasonStats();
        return !(this$reasonStats == null ? other$reasonStats != null : !((Object)this$reasonStats).equals(other$reasonStats));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLedgerStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalRecords = this.getTotalRecords();
        result = result * 59 + ($totalRecords == null ? 43 : ((Object)$totalRecords).hashCode());
        Long $totalIncome = this.getTotalIncome();
        result = result * 59 + ($totalIncome == null ? 43 : ((Object)$totalIncome).hashCode());
        Long $totalExpense = this.getTotalExpense();
        result = result * 59 + ($totalExpense == null ? 43 : ((Object)$totalExpense).hashCode());
        Long $netChange = this.getNetChange();
        result = result * 59 + ($netChange == null ? 43 : ((Object)$netChange).hashCode());
        Map<String, Long> $reasonStats = this.getReasonStats();
        result = result * 59 + ($reasonStats == null ? 43 : ((Object)$reasonStats).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLedgerStatsResponse(totalRecords=" + this.getTotalRecords() + ", totalIncome=" + this.getTotalIncome() + ", totalExpense=" + this.getTotalExpense() + ", netChange=" + this.getNetChange() + ", reasonStats=" + String.valueOf(this.getReasonStats()) + ")";
    }
}
