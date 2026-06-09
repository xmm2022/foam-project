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

@Schema(description="\u79ef\u5206\u5956\u54c1\u914d\u7f6e\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotPrizeConfigStatsResponse {
    @Schema(description="\u603b\u5956\u54c1\u6570")
    private Long totalPrizes;
    @Schema(description="\u542f\u7528\u5956\u54c1\u6570\uff08enabled = 1\uff09")
    private Long enabledPrizes;
    @Schema(description="\u5269\u4f59\u5e93\u5b58\u603b\u6570")
    private Long totalRemainingQuantity;
    @Schema(description="\u5df2\u552e\u7f44\u5956\u54c1\u6570\uff08remainingQuantity <= 0\uff09")
    private Long soldOutPrizes;
    @Schema(description="\u603b\u5956\u54c1\u4ef7\u503c\uff08\u6240\u6709\u5956\u54c1\u6240\u9700\u79ef\u5206\u603b\u548c\uff09")
    private Long totalPrizeValue;

    @Generated
    public PointsBotPrizeConfigStatsResponse() {
    }

    @Generated
    public Long getTotalPrizes() {
        return this.totalPrizes;
    }

    @Generated
    public Long getEnabledPrizes() {
        return this.enabledPrizes;
    }

    @Generated
    public Long getTotalRemainingQuantity() {
        return this.totalRemainingQuantity;
    }

    @Generated
    public Long getSoldOutPrizes() {
        return this.soldOutPrizes;
    }

    @Generated
    public Long getTotalPrizeValue() {
        return this.totalPrizeValue;
    }

    @Generated
    public void setTotalPrizes(Long totalPrizes) {
        this.totalPrizes = totalPrizes;
    }

    @Generated
    public void setEnabledPrizes(Long enabledPrizes) {
        this.enabledPrizes = enabledPrizes;
    }

    @Generated
    public void setTotalRemainingQuantity(Long totalRemainingQuantity) {
        this.totalRemainingQuantity = totalRemainingQuantity;
    }

    @Generated
    public void setSoldOutPrizes(Long soldOutPrizes) {
        this.soldOutPrizes = soldOutPrizes;
    }

    @Generated
    public void setTotalPrizeValue(Long totalPrizeValue) {
        this.totalPrizeValue = totalPrizeValue;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotPrizeConfigStatsResponse)) {
            return false;
        }
        PointsBotPrizeConfigStatsResponse other = (PointsBotPrizeConfigStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalPrizes = this.getTotalPrizes();
        Long other$totalPrizes = other.getTotalPrizes();
        if (this$totalPrizes == null ? other$totalPrizes != null : !((Object)this$totalPrizes).equals(other$totalPrizes)) {
            return false;
        }
        Long this$enabledPrizes = this.getEnabledPrizes();
        Long other$enabledPrizes = other.getEnabledPrizes();
        if (this$enabledPrizes == null ? other$enabledPrizes != null : !((Object)this$enabledPrizes).equals(other$enabledPrizes)) {
            return false;
        }
        Long this$totalRemainingQuantity = this.getTotalRemainingQuantity();
        Long other$totalRemainingQuantity = other.getTotalRemainingQuantity();
        if (this$totalRemainingQuantity == null ? other$totalRemainingQuantity != null : !((Object)this$totalRemainingQuantity).equals(other$totalRemainingQuantity)) {
            return false;
        }
        Long this$soldOutPrizes = this.getSoldOutPrizes();
        Long other$soldOutPrizes = other.getSoldOutPrizes();
        if (this$soldOutPrizes == null ? other$soldOutPrizes != null : !((Object)this$soldOutPrizes).equals(other$soldOutPrizes)) {
            return false;
        }
        Long this$totalPrizeValue = this.getTotalPrizeValue();
        Long other$totalPrizeValue = other.getTotalPrizeValue();
        return !(this$totalPrizeValue == null ? other$totalPrizeValue != null : !((Object)this$totalPrizeValue).equals(other$totalPrizeValue));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotPrizeConfigStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalPrizes = this.getTotalPrizes();
        result = result * 59 + ($totalPrizes == null ? 43 : ((Object)$totalPrizes).hashCode());
        Long $enabledPrizes = this.getEnabledPrizes();
        result = result * 59 + ($enabledPrizes == null ? 43 : ((Object)$enabledPrizes).hashCode());
        Long $totalRemainingQuantity = this.getTotalRemainingQuantity();
        result = result * 59 + ($totalRemainingQuantity == null ? 43 : ((Object)$totalRemainingQuantity).hashCode());
        Long $soldOutPrizes = this.getSoldOutPrizes();
        result = result * 59 + ($soldOutPrizes == null ? 43 : ((Object)$soldOutPrizes).hashCode());
        Long $totalPrizeValue = this.getTotalPrizeValue();
        result = result * 59 + ($totalPrizeValue == null ? 43 : ((Object)$totalPrizeValue).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotPrizeConfigStatsResponse(totalPrizes=" + this.getTotalPrizes() + ", enabledPrizes=" + this.getEnabledPrizes() + ", totalRemainingQuantity=" + this.getTotalRemainingQuantity() + ", soldOutPrizes=" + this.getSoldOutPrizes() + ", totalPrizeValue=" + this.getTotalPrizeValue() + ")";
    }
}
