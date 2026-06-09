/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindEntityList
 *  com.diboot.core.binding.annotation.BindField
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.simultaneous;

import com.diboot.core.binding.annotation.BindEntityList;
import com.diboot.core.binding.annotation.BindField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.una.embyhub.model.dto.response.simultaneous.SimultaneousPlaybackRecordDetailResponse;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.SimultaneousPlaybackRecordDetail;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class SimultaneousPlaybackRecordResponse
implements Serializable {
    private Long id;
    private Long embyInfoId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private String embyUserId;
    private String embyUserName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date detectionTime;
    private Integer sessionCount;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createDatetime;
    @BindEntityList(entity=SimultaneousPlaybackRecordDetail.class, condition="this.id = record_id")
    private List<SimultaneousPlaybackRecordDetailResponse> details;

    @Generated
    public static SimultaneousPlaybackRecordResponseBuilder builder() {
        return new SimultaneousPlaybackRecordResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
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
    public String getEmbyUserId() {
        return this.embyUserId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Date getDetectionTime() {
        return this.detectionTime;
    }

    @Generated
    public Integer getSessionCount() {
        return this.sessionCount;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public List<SimultaneousPlaybackRecordDetailResponse> getDetails() {
        return this.details;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
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
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Generated
    public void setDetectionTime(Date detectionTime) {
        this.detectionTime = detectionTime;
    }

    @Generated
    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setDetails(List<SimultaneousPlaybackRecordDetailResponse> details) {
        this.details = details;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SimultaneousPlaybackRecordResponse)) {
            return false;
        }
        SimultaneousPlaybackRecordResponse other = (SimultaneousPlaybackRecordResponse)o;
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
        Integer this$sessionCount = this.getSessionCount();
        Integer other$sessionCount = other.getSessionCount();
        if (this$sessionCount == null ? other$sessionCount != null : !((Object)this$sessionCount).equals(other$sessionCount)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
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
        Date this$detectionTime = this.getDetectionTime();
        Date other$detectionTime = other.getDetectionTime();
        if (this$detectionTime == null ? other$detectionTime != null : !((Object)this$detectionTime).equals(other$detectionTime)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        List<SimultaneousPlaybackRecordDetailResponse> this$details = this.getDetails();
        List<SimultaneousPlaybackRecordDetailResponse> other$details = other.getDetails();
        return !(this$details == null ? other$details != null : !((Object)this$details).equals(other$details));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SimultaneousPlaybackRecordResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $sessionCount = this.getSessionCount();
        result = result * 59 + ($sessionCount == null ? 43 : ((Object)$sessionCount).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        Date $detectionTime = this.getDetectionTime();
        result = result * 59 + ($detectionTime == null ? 43 : ((Object)$detectionTime).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        List<SimultaneousPlaybackRecordDetailResponse> $details = this.getDetails();
        result = result * 59 + ($details == null ? 43 : ((Object)$details).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SimultaneousPlaybackRecordResponse(id=" + this.getId() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", detectionTime=" + String.valueOf(this.getDetectionTime()) + ", sessionCount=" + this.getSessionCount() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", details=" + String.valueOf(this.getDetails()) + ")";
    }

    @Generated
    public SimultaneousPlaybackRecordResponse() {
    }

    @Generated
    public SimultaneousPlaybackRecordResponse(Long id, Long embyInfoId, String serverName, String embyUserId, String embyUserName, Date detectionTime, Integer sessionCount, Date createDatetime, List<SimultaneousPlaybackRecordDetailResponse> details) {
        this.id = id;
        this.embyInfoId = embyInfoId;
        this.serverName = serverName;
        this.embyUserId = embyUserId;
        this.embyUserName = embyUserName;
        this.detectionTime = detectionTime;
        this.sessionCount = sessionCount;
        this.createDatetime = createDatetime;
        this.details = details;
    }

    @Generated
    public static class SimultaneousPlaybackRecordResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private Long embyInfoId;
        @Generated
        private String serverName;
        @Generated
        private String embyUserId;
        @Generated
        private String embyUserName;
        @Generated
        private Date detectionTime;
        @Generated
        private Integer sessionCount;
        @Generated
        private Date createDatetime;
        @Generated
        private List<SimultaneousPlaybackRecordDetailResponse> details;

        @Generated
        SimultaneousPlaybackRecordResponseBuilder() {
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder embyInfoId(Long embyInfoId) {
            this.embyInfoId = embyInfoId;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder serverName(String serverName) {
            this.serverName = serverName;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder embyUserId(String embyUserId) {
            this.embyUserId = embyUserId;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder embyUserName(String embyUserName) {
            this.embyUserName = embyUserName;
            return this;
        }

        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
        @Generated
        public SimultaneousPlaybackRecordResponseBuilder detectionTime(Date detectionTime) {
            this.detectionTime = detectionTime;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder sessionCount(Integer sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }

        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
        @Generated
        public SimultaneousPlaybackRecordResponseBuilder createDatetime(Date createDatetime) {
            this.createDatetime = createDatetime;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponseBuilder details(List<SimultaneousPlaybackRecordDetailResponse> details) {
            this.details = details;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordResponse build() {
            return new SimultaneousPlaybackRecordResponse(this.id, this.embyInfoId, this.serverName, this.embyUserId, this.embyUserName, this.detectionTime, this.sessionCount, this.createDatetime, this.details);
        }

        @Generated
        public String toString() {
            return "SimultaneousPlaybackRecordResponse.SimultaneousPlaybackRecordResponseBuilder(id=" + this.id + ", embyInfoId=" + this.embyInfoId + ", serverName=" + this.serverName + ", embyUserId=" + this.embyUserId + ", embyUserName=" + this.embyUserName + ", detectionTime=" + String.valueOf(this.detectionTime) + ", sessionCount=" + this.sessionCount + ", createDatetime=" + String.valueOf(this.createDatetime) + ", details=" + String.valueOf(this.details) + ")";
        }
    }
}
