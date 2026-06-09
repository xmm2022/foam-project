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

@Schema(description="\u79ef\u5206\u670d\u52a1\u5668\u5151\u6362\u914d\u7f6e\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotRedeemConfigStatsResponse {
    @Schema(description="\u603b\u914d\u7f6e\u6570")
    private Long totalConfigs;
    @Schema(description="\u542f\u7528\u914d\u7f6e\u6570\uff08enabled = 1\uff09")
    private Long enabledConfigs;
    @Schema(description="\u505c\u7528\u914d\u7f6e\u6570\uff08enabled = 0\uff09")
    private Long disabledConfigs;
    @Schema(description="\u6309\u670d\u52a1\u5668\u5206\u7ec4\u7684\u914d\u7f6e\u6570\uff08embyInfoId -> count\uff09")
    private Map<Long, Long> configsByServer;

    @Generated
    public PointsBotRedeemConfigStatsResponse() {
    }

    @Generated
    public Long getTotalConfigs() {
        return this.totalConfigs;
    }

    @Generated
    public Long getEnabledConfigs() {
        return this.enabledConfigs;
    }

    @Generated
    public Long getDisabledConfigs() {
        return this.disabledConfigs;
    }

    @Generated
    public Map<Long, Long> getConfigsByServer() {
        return this.configsByServer;
    }

    @Generated
    public void setTotalConfigs(Long totalConfigs) {
        this.totalConfigs = totalConfigs;
    }

    @Generated
    public void setEnabledConfigs(Long enabledConfigs) {
        this.enabledConfigs = enabledConfigs;
    }

    @Generated
    public void setDisabledConfigs(Long disabledConfigs) {
        this.disabledConfigs = disabledConfigs;
    }

    @Generated
    public void setConfigsByServer(Map<Long, Long> configsByServer) {
        this.configsByServer = configsByServer;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotRedeemConfigStatsResponse)) {
            return false;
        }
        PointsBotRedeemConfigStatsResponse other = (PointsBotRedeemConfigStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalConfigs = this.getTotalConfigs();
        Long other$totalConfigs = other.getTotalConfigs();
        if (this$totalConfigs == null ? other$totalConfigs != null : !((Object)this$totalConfigs).equals(other$totalConfigs)) {
            return false;
        }
        Long this$enabledConfigs = this.getEnabledConfigs();
        Long other$enabledConfigs = other.getEnabledConfigs();
        if (this$enabledConfigs == null ? other$enabledConfigs != null : !((Object)this$enabledConfigs).equals(other$enabledConfigs)) {
            return false;
        }
        Long this$disabledConfigs = this.getDisabledConfigs();
        Long other$disabledConfigs = other.getDisabledConfigs();
        if (this$disabledConfigs == null ? other$disabledConfigs != null : !((Object)this$disabledConfigs).equals(other$disabledConfigs)) {
            return false;
        }
        Map<Long, Long> this$configsByServer = this.getConfigsByServer();
        Map<Long, Long> other$configsByServer = other.getConfigsByServer();
        return !(this$configsByServer == null ? other$configsByServer != null : !((Object)this$configsByServer).equals(other$configsByServer));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotRedeemConfigStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalConfigs = this.getTotalConfigs();
        result = result * 59 + ($totalConfigs == null ? 43 : ((Object)$totalConfigs).hashCode());
        Long $enabledConfigs = this.getEnabledConfigs();
        result = result * 59 + ($enabledConfigs == null ? 43 : ((Object)$enabledConfigs).hashCode());
        Long $disabledConfigs = this.getDisabledConfigs();
        result = result * 59 + ($disabledConfigs == null ? 43 : ((Object)$disabledConfigs).hashCode());
        Map<Long, Long> $configsByServer = this.getConfigsByServer();
        result = result * 59 + ($configsByServer == null ? 43 : ((Object)$configsByServer).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotRedeemConfigStatsResponse(totalConfigs=" + this.getTotalConfigs() + ", enabledConfigs=" + this.getEnabledConfigs() + ", disabledConfigs=" + this.getDisabledConfigs() + ", configsByServer=" + String.valueOf(this.getConfigsByServer()) + ")";
    }
}
