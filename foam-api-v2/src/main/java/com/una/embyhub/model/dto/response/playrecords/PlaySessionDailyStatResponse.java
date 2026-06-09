/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playrecords;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class PlaySessionDailyStatResponse
implements Serializable {
    private Long embyUserId;
    private String embyUserName;
    private String content;
    private String device;
    private String playDay;
    private Date firstPlayStartTime;
    private Date lastPlayEndTime;
    private Integer totalSeconds;
    private String totalPlayTime;

    @Generated
    public PlaySessionDailyStatResponse() {
    }

    @Generated
    public Long getEmbyUserId() {
        return this.embyUserId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public String getContent() {
        return this.content;
    }

    @Generated
    public String getDevice() {
        return this.device;
    }

    @Generated
    public String getPlayDay() {
        return this.playDay;
    }

    @Generated
    public Date getFirstPlayStartTime() {
        return this.firstPlayStartTime;
    }

    @Generated
    public Date getLastPlayEndTime() {
        return this.lastPlayEndTime;
    }

    @Generated
    public Integer getTotalSeconds() {
        return this.totalSeconds;
    }

    @Generated
    public String getTotalPlayTime() {
        return this.totalPlayTime;
    }

    @Generated
    public void setEmbyUserId(Long embyUserId) {
        this.embyUserId = embyUserId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public void setDevice(String device) {
        this.device = device;
    }

    @Generated
    public void setPlayDay(String playDay) {
        this.playDay = playDay;
    }

    @Generated
    public void setFirstPlayStartTime(Date firstPlayStartTime) {
        this.firstPlayStartTime = firstPlayStartTime;
    }

    @Generated
    public void setLastPlayEndTime(Date lastPlayEndTime) {
        this.lastPlayEndTime = lastPlayEndTime;
    }

    @Generated
    public void setTotalSeconds(Integer totalSeconds) {
        this.totalSeconds = totalSeconds;
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
        if (!(o instanceof PlaySessionDailyStatResponse)) {
            return false;
        }
        PlaySessionDailyStatResponse other = (PlaySessionDailyStatResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyUserId = this.getEmbyUserId();
        Long other$embyUserId = other.getEmbyUserId();
        if (this$embyUserId == null ? other$embyUserId != null : !((Object)this$embyUserId).equals(other$embyUserId)) {
            return false;
        }
        Integer this$totalSeconds = this.getTotalSeconds();
        Integer other$totalSeconds = other.getTotalSeconds();
        if (this$totalSeconds == null ? other$totalSeconds != null : !((Object)this$totalSeconds).equals(other$totalSeconds)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) {
            return false;
        }
        String this$device = this.getDevice();
        String other$device = other.getDevice();
        if (this$device == null ? other$device != null : !this$device.equals(other$device)) {
            return false;
        }
        String this$playDay = this.getPlayDay();
        String other$playDay = other.getPlayDay();
        if (this$playDay == null ? other$playDay != null : !this$playDay.equals(other$playDay)) {
            return false;
        }
        Date this$firstPlayStartTime = this.getFirstPlayStartTime();
        Date other$firstPlayStartTime = other.getFirstPlayStartTime();
        if (this$firstPlayStartTime == null ? other$firstPlayStartTime != null : !((Object)this$firstPlayStartTime).equals(other$firstPlayStartTime)) {
            return false;
        }
        Date this$lastPlayEndTime = this.getLastPlayEndTime();
        Date other$lastPlayEndTime = other.getLastPlayEndTime();
        if (this$lastPlayEndTime == null ? other$lastPlayEndTime != null : !((Object)this$lastPlayEndTime).equals(other$lastPlayEndTime)) {
            return false;
        }
        String this$totalPlayTime = this.getTotalPlayTime();
        String other$totalPlayTime = other.getTotalPlayTime();
        return !(this$totalPlayTime == null ? other$totalPlayTime != null : !this$totalPlayTime.equals(other$totalPlayTime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlaySessionDailyStatResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : ((Object)$embyUserId).hashCode());
        Integer $totalSeconds = this.getTotalSeconds();
        result = result * 59 + ($totalSeconds == null ? 43 : ((Object)$totalSeconds).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        String $device = this.getDevice();
        result = result * 59 + ($device == null ? 43 : $device.hashCode());
        String $playDay = this.getPlayDay();
        result = result * 59 + ($playDay == null ? 43 : $playDay.hashCode());
        Date $firstPlayStartTime = this.getFirstPlayStartTime();
        result = result * 59 + ($firstPlayStartTime == null ? 43 : ((Object)$firstPlayStartTime).hashCode());
        Date $lastPlayEndTime = this.getLastPlayEndTime();
        result = result * 59 + ($lastPlayEndTime == null ? 43 : ((Object)$lastPlayEndTime).hashCode());
        String $totalPlayTime = this.getTotalPlayTime();
        result = result * 59 + ($totalPlayTime == null ? 43 : $totalPlayTime.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PlaySessionDailyStatResponse(embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", content=" + this.getContent() + ", device=" + this.getDevice() + ", playDay=" + this.getPlayDay() + ", firstPlayStartTime=" + String.valueOf(this.getFirstPlayStartTime()) + ", lastPlayEndTime=" + String.valueOf(this.getLastPlayEndTime()) + ", totalSeconds=" + this.getTotalSeconds() + ", totalPlayTime=" + this.getTotalPlayTime() + ")";
    }
}
