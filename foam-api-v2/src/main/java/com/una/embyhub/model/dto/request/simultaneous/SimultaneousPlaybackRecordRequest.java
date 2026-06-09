/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.simultaneous;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SimultaneousPlaybackRecordRequest
implements Serializable {
    @BindQuery(comparison=Comparison.BETWEEN_BEGIN, column="detection_time")
    private Date detectionTimeStart;
    @BindQuery(comparison=Comparison.BETWEEN_END, column="detection_time")
    private Date detectionTimeEnd;
    @BindQuery(comparison=Comparison.CONTAINS, column="emby_user_name")
    private String embyUserName;
    @BindQuery(comparison=Comparison.EQ, column="emby_info_id")
    private Long embyInfoId;
    @BindQuery(ignore=true)
    private String content;

    @Generated
    public SimultaneousPlaybackRecordRequest() {
    }

    @Generated
    public Date getDetectionTimeStart() {
        return this.detectionTimeStart;
    }

    @Generated
    public Date getDetectionTimeEnd() {
        return this.detectionTimeEnd;
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
    public String getContent() {
        return this.content;
    }

    @Generated
    public void setDetectionTimeStart(Date detectionTimeStart) {
        this.detectionTimeStart = detectionTimeStart;
    }

    @Generated
    public void setDetectionTimeEnd(Date detectionTimeEnd) {
        this.detectionTimeEnd = detectionTimeEnd;
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
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SimultaneousPlaybackRecordRequest)) {
            return false;
        }
        SimultaneousPlaybackRecordRequest other = (SimultaneousPlaybackRecordRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Date this$detectionTimeStart = this.getDetectionTimeStart();
        Date other$detectionTimeStart = other.getDetectionTimeStart();
        if (this$detectionTimeStart == null ? other$detectionTimeStart != null : !((Object)this$detectionTimeStart).equals(other$detectionTimeStart)) {
            return false;
        }
        Date this$detectionTimeEnd = this.getDetectionTimeEnd();
        Date other$detectionTimeEnd = other.getDetectionTimeEnd();
        if (this$detectionTimeEnd == null ? other$detectionTimeEnd != null : !((Object)this$detectionTimeEnd).equals(other$detectionTimeEnd)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        return !(this$content == null ? other$content != null : !this$content.equals(other$content));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SimultaneousPlaybackRecordRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Date $detectionTimeStart = this.getDetectionTimeStart();
        result = result * 59 + ($detectionTimeStart == null ? 43 : ((Object)$detectionTimeStart).hashCode());
        Date $detectionTimeEnd = this.getDetectionTimeEnd();
        result = result * 59 + ($detectionTimeEnd == null ? 43 : ((Object)$detectionTimeEnd).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SimultaneousPlaybackRecordRequest(detectionTimeStart=" + String.valueOf(this.getDetectionTimeStart()) + ", detectionTimeEnd=" + String.valueOf(this.getDetectionTimeEnd()) + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", content=" + this.getContent() + ")";
    }
}
