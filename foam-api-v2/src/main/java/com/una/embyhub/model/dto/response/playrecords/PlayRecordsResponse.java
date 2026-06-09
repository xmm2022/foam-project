/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playrecords;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class PlayRecordsResponse
implements Serializable {
    private Long id;
    private String embyUserId;
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date playDate;
    private String recordType;
    private String device;
    private String content;
    private String embyUserName;
    private Long embyInfoId;
    private String serverName;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;
    private Date firstPlayStartTime;
    private Date lastPlayEndTime;
    private Integer totalSeconds;
    private String totalPlayTime;

    @Generated
    public static PlayRecordsResponseBuilder builder() {
        return new PlayRecordsResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getEmbyUserId() {
        return this.embyUserId;
    }

    @Generated
    public Date getPlayDate() {
        return this.playDate;
    }

    @Generated
    public String getRecordType() {
        return this.recordType;
    }

    @Generated
    public String getDevice() {
        return this.device;
    }

    @Generated
    public String getContent() {
        return this.content;
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public String getCreateUserName() {
        return this.createUserName;
    }

    @Generated
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    @Generated
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    @Generated
    public Long getCreateUserId() {
        return this.createUserId;
    }

    @Generated
    public Integer getDelFlag() {
        return this.delFlag;
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
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
    }

    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    @Generated
    public void setPlayDate(Date playDate) {
        this.playDate = playDate;
    }

    @Generated
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Generated
    public void setDevice(String device) {
        this.device = device;
    }

    @Generated
    public void setContent(String content) {
        this.content = content;
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
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Generated
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Generated
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Generated
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Generated
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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
        if (!(o instanceof PlayRecordsResponse)) {
            return false;
        }
        PlayRecordsResponse other = (PlayRecordsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Long this$updateUserId = this.getUpdateUserId();
        Long other$updateUserId = other.getUpdateUserId();
        if (this$updateUserId == null ? other$updateUserId != null : !((Object)this$updateUserId).equals(other$updateUserId)) {
            return false;
        }
        Long this$createUserId = this.getCreateUserId();
        Long other$createUserId = other.getCreateUserId();
        if (this$createUserId == null ? other$createUserId != null : !((Object)this$createUserId).equals(other$createUserId)) {
            return false;
        }
        Integer this$delFlag = this.getDelFlag();
        Integer other$delFlag = other.getDelFlag();
        if (this$delFlag == null ? other$delFlag != null : !((Object)this$delFlag).equals(other$delFlag)) {
            return false;
        }
        Integer this$totalSeconds = this.getTotalSeconds();
        Integer other$totalSeconds = other.getTotalSeconds();
        if (this$totalSeconds == null ? other$totalSeconds != null : !((Object)this$totalSeconds).equals(other$totalSeconds)) {
            return false;
        }
        String this$embyUserId = this.getEmbyUserId();
        String other$embyUserId = other.getEmbyUserId();
        if (this$embyUserId == null ? other$embyUserId != null : !this$embyUserId.equals(other$embyUserId)) {
            return false;
        }
        Date this$playDate = this.getPlayDate();
        Date other$playDate = other.getPlayDate();
        if (this$playDate == null ? other$playDate != null : !((Object)this$playDate).equals(other$playDate)) {
            return false;
        }
        String this$recordType = this.getRecordType();
        String other$recordType = other.getRecordType();
        if (this$recordType == null ? other$recordType != null : !this$recordType.equals(other$recordType)) {
            return false;
        }
        String this$device = this.getDevice();
        String other$device = other.getDevice();
        if (this$device == null ? other$device != null : !this$device.equals(other$device)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) {
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
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        if (this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime)) {
            return false;
        }
        String this$createUserName = this.getCreateUserName();
        String other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) {
            return false;
        }
        String this$updateUserName = this.getUpdateUserName();
        String other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName)) {
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
        return other instanceof PlayRecordsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        Integer $totalSeconds = this.getTotalSeconds();
        result = result * 59 + ($totalSeconds == null ? 43 : ((Object)$totalSeconds).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        Date $playDate = this.getPlayDate();
        result = result * 59 + ($playDate == null ? 43 : ((Object)$playDate).hashCode());
        String $recordType = this.getRecordType();
        result = result * 59 + ($recordType == null ? 43 : $recordType.hashCode());
        String $device = this.getDevice();
        result = result * 59 + ($device == null ? 43 : $device.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
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
        return "PlayRecordsResponse(id=" + this.getId() + ", embyUserId=" + this.getEmbyUserId() + ", playDate=" + String.valueOf(this.getPlayDate()) + ", recordType=" + this.getRecordType() + ", device=" + this.getDevice() + ", content=" + this.getContent() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ", firstPlayStartTime=" + String.valueOf(this.getFirstPlayStartTime()) + ", lastPlayEndTime=" + String.valueOf(this.getLastPlayEndTime()) + ", totalSeconds=" + this.getTotalSeconds() + ", totalPlayTime=" + this.getTotalPlayTime() + ")";
    }

    @Generated
    public PlayRecordsResponse() {
    }

    @Generated
    public PlayRecordsResponse(Long id, String embyUserId, Date playDate, String recordType, String device, String content, String embyUserName, Long embyInfoId, String serverName, Date createDatetime, Date updateDatetime, String createUserName, String updateUserName, Long updateUserId, Long createUserId, Integer delFlag, Date firstPlayStartTime, Date lastPlayEndTime, Integer totalSeconds, String totalPlayTime) {
        this.id = id;
        this.embyUserId = embyUserId;
        this.playDate = playDate;
        this.recordType = recordType;
        this.device = device;
        this.content = content;
        this.embyUserName = embyUserName;
        this.embyInfoId = embyInfoId;
        this.serverName = serverName;
        this.createDatetime = createDatetime;
        this.updateDatetime = updateDatetime;
        this.createUserName = createUserName;
        this.updateUserName = updateUserName;
        this.updateUserId = updateUserId;
        this.createUserId = createUserId;
        this.delFlag = delFlag;
        this.firstPlayStartTime = firstPlayStartTime;
        this.lastPlayEndTime = lastPlayEndTime;
        this.totalSeconds = totalSeconds;
        this.totalPlayTime = totalPlayTime;
    }

    @Generated
    public static class PlayRecordsResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private String embyUserId;
        @Generated
        private Date playDate;
        @Generated
        private String recordType;
        @Generated
        private String device;
        @Generated
        private String content;
        @Generated
        private String embyUserName;
        @Generated
        private Long embyInfoId;
        @Generated
        private String serverName;
        @Generated
        private Date createDatetime;
        @Generated
        private Date updateDatetime;
        @Generated
        private String createUserName;
        @Generated
        private String updateUserName;
        @Generated
        private Long updateUserId;
        @Generated
        private Long createUserId;
        @Generated
        private Integer delFlag;
        @Generated
        private Date firstPlayStartTime;
        @Generated
        private Date lastPlayEndTime;
        @Generated
        private Integer totalSeconds;
        @Generated
        private String totalPlayTime;

        @Generated
        PlayRecordsResponseBuilder() {
        }

        @Generated
        public PlayRecordsResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder embyUserId(String embyUserId) {
            this.embyUserId = embyUserId;
            return this;
        }

        @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
        @Generated
        public PlayRecordsResponseBuilder playDate(Date playDate) {
            this.playDate = playDate;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder device(String device) {
            this.device = device;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder content(String content) {
            this.content = content;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder embyUserName(String embyUserName) {
            this.embyUserName = embyUserName;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder embyInfoId(Long embyInfoId) {
            this.embyInfoId = embyInfoId;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder serverName(String serverName) {
            this.serverName = serverName;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder createDatetime(Date createDatetime) {
            this.createDatetime = createDatetime;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder updateDatetime(Date updateDatetime) {
            this.updateDatetime = updateDatetime;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder updateUserName(String updateUserName) {
            this.updateUserName = updateUserName;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder updateUserId(Long updateUserId) {
            this.updateUserId = updateUserId;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder createUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder delFlag(Integer delFlag) {
            this.delFlag = delFlag;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder firstPlayStartTime(Date firstPlayStartTime) {
            this.firstPlayStartTime = firstPlayStartTime;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder lastPlayEndTime(Date lastPlayEndTime) {
            this.lastPlayEndTime = lastPlayEndTime;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder totalSeconds(Integer totalSeconds) {
            this.totalSeconds = totalSeconds;
            return this;
        }

        @Generated
        public PlayRecordsResponseBuilder totalPlayTime(String totalPlayTime) {
            this.totalPlayTime = totalPlayTime;
            return this;
        }

        @Generated
        public PlayRecordsResponse build() {
            return new PlayRecordsResponse(this.id, this.embyUserId, this.playDate, this.recordType, this.device, this.content, this.embyUserName, this.embyInfoId, this.serverName, this.createDatetime, this.updateDatetime, this.createUserName, this.updateUserName, this.updateUserId, this.createUserId, this.delFlag, this.firstPlayStartTime, this.lastPlayEndTime, this.totalSeconds, this.totalPlayTime);
        }

        @Generated
        public String toString() {
            return "PlayRecordsResponse.PlayRecordsResponseBuilder(id=" + this.id + ", embyUserId=" + this.embyUserId + ", playDate=" + String.valueOf(this.playDate) + ", recordType=" + this.recordType + ", device=" + this.device + ", content=" + this.content + ", embyUserName=" + this.embyUserName + ", embyInfoId=" + this.embyInfoId + ", serverName=" + this.serverName + ", createDatetime=" + String.valueOf(this.createDatetime) + ", updateDatetime=" + String.valueOf(this.updateDatetime) + ", createUserName=" + this.createUserName + ", updateUserName=" + this.updateUserName + ", updateUserId=" + this.updateUserId + ", createUserId=" + this.createUserId + ", delFlag=" + this.delFlag + ", firstPlayStartTime=" + String.valueOf(this.firstPlayStartTime) + ", lastPlayEndTime=" + String.valueOf(this.lastPlayEndTime) + ", totalSeconds=" + this.totalSeconds + ", totalPlayTime=" + this.totalPlayTime + ")";
        }
    }
}
