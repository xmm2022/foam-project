/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import java.io.Serializable;
import lombok.Generated;

public class EmbyServerUserStatsResponse
implements Serializable {
    private Long embyInfoId;
    private String serverName;
    private Long totalUserCount;
    private Long activeUserCount;
    private Long disabledUserCount;
    private Long todayNewUserCount;

    @Generated
    public EmbyServerUserStatsResponse() {
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public Long getTotalUserCount() {
        return this.totalUserCount;
    }

    @Generated
    public Long getActiveUserCount() {
        return this.activeUserCount;
    }

    @Generated
    public Long getDisabledUserCount() {
        return this.disabledUserCount;
    }

    @Generated
    public Long getTodayNewUserCount() {
        return this.todayNewUserCount;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setTotalUserCount(Long totalUserCount) {
        this.totalUserCount = totalUserCount;
    }

    @Generated
    public void setActiveUserCount(Long activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    @Generated
    public void setDisabledUserCount(Long disabledUserCount) {
        this.disabledUserCount = disabledUserCount;
    }

    @Generated
    public void setTodayNewUserCount(Long todayNewUserCount) {
        this.todayNewUserCount = todayNewUserCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyServerUserStatsResponse)) {
            return false;
        }
        EmbyServerUserStatsResponse other = (EmbyServerUserStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Long this$totalUserCount = this.getTotalUserCount();
        Long other$totalUserCount = other.getTotalUserCount();
        if (this$totalUserCount == null ? other$totalUserCount != null : !((Object)this$totalUserCount).equals(other$totalUserCount)) {
            return false;
        }
        Long this$activeUserCount = this.getActiveUserCount();
        Long other$activeUserCount = other.getActiveUserCount();
        if (this$activeUserCount == null ? other$activeUserCount != null : !((Object)this$activeUserCount).equals(other$activeUserCount)) {
            return false;
        }
        Long this$disabledUserCount = this.getDisabledUserCount();
        Long other$disabledUserCount = other.getDisabledUserCount();
        if (this$disabledUserCount == null ? other$disabledUserCount != null : !((Object)this$disabledUserCount).equals(other$disabledUserCount)) {
            return false;
        }
        Long this$todayNewUserCount = this.getTodayNewUserCount();
        Long other$todayNewUserCount = other.getTodayNewUserCount();
        if (this$todayNewUserCount == null ? other$todayNewUserCount != null : !((Object)this$todayNewUserCount).equals(other$todayNewUserCount)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        return !(this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyServerUserStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Long $totalUserCount = this.getTotalUserCount();
        result = result * 59 + ($totalUserCount == null ? 43 : ((Object)$totalUserCount).hashCode());
        Long $activeUserCount = this.getActiveUserCount();
        result = result * 59 + ($activeUserCount == null ? 43 : ((Object)$activeUserCount).hashCode());
        Long $disabledUserCount = this.getDisabledUserCount();
        result = result * 59 + ($disabledUserCount == null ? 43 : ((Object)$disabledUserCount).hashCode());
        Long $todayNewUserCount = this.getTodayNewUserCount();
        result = result * 59 + ($todayNewUserCount == null ? 43 : ((Object)$todayNewUserCount).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyServerUserStatsResponse(embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", totalUserCount=" + this.getTotalUserCount() + ", activeUserCount=" + this.getActiveUserCount() + ", disabledUserCount=" + this.getDisabledUserCount() + ", todayNewUserCount=" + this.getTodayNewUserCount() + ")";
    }
}
