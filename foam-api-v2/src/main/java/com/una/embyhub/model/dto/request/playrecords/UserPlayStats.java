/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.playrecords;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class UserPlayStats
implements Serializable {
    private String embyUserId;
    private String embyUserName;
    private Long embyInfoId;
    private String serverName;
    private Date playDay;
    private Integer playTimes;
    private String totalPlayTime;

    @Generated
    public UserPlayStats() {
    }

    @Generated
    public String getEmbyUserId() {
        return this.embyUserId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
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
    public Date getPlayDay() {
        return this.playDay;
    }

    @Generated
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    @Generated
    public String getTotalPlayTime() {
        return this.totalPlayTime;
    }

    @Generated
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
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
    public void setPlayDay(Date playDay) {
        this.playDay = playDay;
    }

    @Generated
    public void setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
    }

    @Generated
    public void setTotalPlayTime(String totalPlayTime) {
        this.totalPlayTime = totalPlayTime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserPlayStats)) {
            return false;
        }
        UserPlayStats other = (UserPlayStats)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$playTimes = this.getPlayTimes();
        Integer other$playTimes = other.getPlayTimes();
        if (this$playTimes == null ? other$playTimes != null : !((Object)this$playTimes).equals(other$playTimes)) {
            return false;
        }
        String this$embyUserId = this.getEmbyUserId();
        String other$embyUserId = other.getEmbyUserId();
        if (this$embyUserId == null ? other$embyUserId != null : !this$embyUserId.equals(other$embyUserId)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        Date this$playDay = this.getPlayDay();
        Date other$playDay = other.getPlayDay();
        if (this$playDay == null ? other$playDay != null : !((Object)this$playDay).equals(other$playDay)) {
            return false;
        }
        String this$totalPlayTime = this.getTotalPlayTime();
        String other$totalPlayTime = other.getTotalPlayTime();
        return !(this$totalPlayTime == null ? other$totalPlayTime != null : !this$totalPlayTime.equals(other$totalPlayTime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserPlayStats;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $playTimes = this.getPlayTimes();
        result = result * 59 + ($playTimes == null ? 43 : ((Object)$playTimes).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        Date $playDay = this.getPlayDay();
        result = result * 59 + ($playDay == null ? 43 : ((Object)$playDay).hashCode());
        String $totalPlayTime = this.getTotalPlayTime();
        result = result * 59 + ($totalPlayTime == null ? 43 : $totalPlayTime.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserPlayStats(embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", playDay=" + String.valueOf(this.getPlayDay()) + ", playTimes=" + this.getPlayTimes() + ", totalPlayTime=" + this.getTotalPlayTime() + ")";
    }
}
