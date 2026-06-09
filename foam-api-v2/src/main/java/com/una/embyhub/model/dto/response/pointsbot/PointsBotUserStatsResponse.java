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

@Schema(description="\u79ef\u5206\u673a\u5668\u4eba\u7528\u6237\u7edf\u8ba1\u4fe1\u606f")
public class PointsBotUserStatsResponse {
    @Schema(description="\u603b\u7528\u6237\u6570")
    private Long totalUsers;
    @Schema(description="\u603b\u79ef\u5206\u6570")
    private Long totalPoints;
    @Schema(description="\u5e73\u5747\u79ef\u5206")
    private Double avgPoints;
    @Schema(description="\u6700\u9ad8\u79ef\u5206")
    private Long maxPoints;
    @Schema(description="\u6700\u4f4e\u79ef\u5206")
    private Long minPoints;
    @Schema(description="\u6d3b\u8dc3\u7528\u6237\u6570\uff08\u8fd17\u5929\u6709\u6d3b\u52a8\uff09")
    private Long activeUsers;
    @Schema(description="\u8fde\u7eed\u7b7e\u5230\u7528\u6237\u6570\uff08streak > 0\uff09")
    private Long streakUsers;

    @Generated
    public PointsBotUserStatsResponse() {
    }

    @Generated
    public Long getTotalUsers() {
        return this.totalUsers;
    }

    @Generated
    public Long getTotalPoints() {
        return this.totalPoints;
    }

    @Generated
    public Double getAvgPoints() {
        return this.avgPoints;
    }

    @Generated
    public Long getMaxPoints() {
        return this.maxPoints;
    }

    @Generated
    public Long getMinPoints() {
        return this.minPoints;
    }

    @Generated
    public Long getActiveUsers() {
        return this.activeUsers;
    }

    @Generated
    public Long getStreakUsers() {
        return this.streakUsers;
    }

    @Generated
    public void setTotalUsers(Long totalUsers) {
        this.totalUsers = totalUsers;
    }

    @Generated
    public void setTotalPoints(Long totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Generated
    public void setAvgPoints(Double avgPoints) {
        this.avgPoints = avgPoints;
    }

    @Generated
    public void setMaxPoints(Long maxPoints) {
        this.maxPoints = maxPoints;
    }

    @Generated
    public void setMinPoints(Long minPoints) {
        this.minPoints = minPoints;
    }

    @Generated
    public void setActiveUsers(Long activeUsers) {
        this.activeUsers = activeUsers;
    }

    @Generated
    public void setStreakUsers(Long streakUsers) {
        this.streakUsers = streakUsers;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotUserStatsResponse)) {
            return false;
        }
        PointsBotUserStatsResponse other = (PointsBotUserStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$totalUsers = this.getTotalUsers();
        Long other$totalUsers = other.getTotalUsers();
        if (this$totalUsers == null ? other$totalUsers != null : !((Object)this$totalUsers).equals(other$totalUsers)) {
            return false;
        }
        Long this$totalPoints = this.getTotalPoints();
        Long other$totalPoints = other.getTotalPoints();
        if (this$totalPoints == null ? other$totalPoints != null : !((Object)this$totalPoints).equals(other$totalPoints)) {
            return false;
        }
        Double this$avgPoints = this.getAvgPoints();
        Double other$avgPoints = other.getAvgPoints();
        if (this$avgPoints == null ? other$avgPoints != null : !((Object)this$avgPoints).equals(other$avgPoints)) {
            return false;
        }
        Long this$maxPoints = this.getMaxPoints();
        Long other$maxPoints = other.getMaxPoints();
        if (this$maxPoints == null ? other$maxPoints != null : !((Object)this$maxPoints).equals(other$maxPoints)) {
            return false;
        }
        Long this$minPoints = this.getMinPoints();
        Long other$minPoints = other.getMinPoints();
        if (this$minPoints == null ? other$minPoints != null : !((Object)this$minPoints).equals(other$minPoints)) {
            return false;
        }
        Long this$activeUsers = this.getActiveUsers();
        Long other$activeUsers = other.getActiveUsers();
        if (this$activeUsers == null ? other$activeUsers != null : !((Object)this$activeUsers).equals(other$activeUsers)) {
            return false;
        }
        Long this$streakUsers = this.getStreakUsers();
        Long other$streakUsers = other.getStreakUsers();
        return !(this$streakUsers == null ? other$streakUsers != null : !((Object)this$streakUsers).equals(other$streakUsers));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotUserStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $totalUsers = this.getTotalUsers();
        result = result * 59 + ($totalUsers == null ? 43 : ((Object)$totalUsers).hashCode());
        Long $totalPoints = this.getTotalPoints();
        result = result * 59 + ($totalPoints == null ? 43 : ((Object)$totalPoints).hashCode());
        Double $avgPoints = this.getAvgPoints();
        result = result * 59 + ($avgPoints == null ? 43 : ((Object)$avgPoints).hashCode());
        Long $maxPoints = this.getMaxPoints();
        result = result * 59 + ($maxPoints == null ? 43 : ((Object)$maxPoints).hashCode());
        Long $minPoints = this.getMinPoints();
        result = result * 59 + ($minPoints == null ? 43 : ((Object)$minPoints).hashCode());
        Long $activeUsers = this.getActiveUsers();
        result = result * 59 + ($activeUsers == null ? 43 : ((Object)$activeUsers).hashCode());
        Long $streakUsers = this.getStreakUsers();
        result = result * 59 + ($streakUsers == null ? 43 : ((Object)$streakUsers).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotUserStatsResponse(totalUsers=" + this.getTotalUsers() + ", totalPoints=" + this.getTotalPoints() + ", avgPoints=" + this.getAvgPoints() + ", maxPoints=" + this.getMaxPoints() + ", minPoints=" + this.getMinPoints() + ", activeUsers=" + this.getActiveUsers() + ", streakUsers=" + this.getStreakUsers() + ")";
    }
}
