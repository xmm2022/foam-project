/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.playrecords;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class PlayRecordsRequest
implements Serializable {
    @BindQuery(comparison=Comparison.BETWEEN_BEGIN, column="play_date")
    private Date playDateStart;
    @BindQuery(comparison=Comparison.BETWEEN_END, column="play_date")
    private Date playDateEnd;
    @BindQuery(comparison=Comparison.CONTAINS)
    private String embyUserName;
    @BindQuery(comparison=Comparison.EQ)
    private Long embyInfoId;

    @Generated
    public PlayRecordsRequest() {
    }

    @Generated
    public Date getPlayDateStart() {
        return this.playDateStart;
    }

    @Generated
    public Date getPlayDateEnd() {
        return this.playDateEnd;
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
    public void setPlayDateStart(Date playDateStart) {
        this.playDateStart = playDateStart;
    }

    @Generated
    public void setPlayDateEnd(Date playDateEnd) {
        this.playDateEnd = playDateEnd;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayRecordsRequest)) {
            return false;
        }
        PlayRecordsRequest other = (PlayRecordsRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Date this$playDateStart = this.getPlayDateStart();
        Date other$playDateStart = other.getPlayDateStart();
        if (this$playDateStart == null ? other$playDateStart != null : !((Object)this$playDateStart).equals(other$playDateStart)) {
            return false;
        }
        Date this$playDateEnd = this.getPlayDateEnd();
        Date other$playDateEnd = other.getPlayDateEnd();
        if (this$playDateEnd == null ? other$playDateEnd != null : !((Object)this$playDateEnd).equals(other$playDateEnd)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        return !(this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlayRecordsRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Date $playDateStart = this.getPlayDateStart();
        result = result * 59 + ($playDateStart == null ? 43 : ((Object)$playDateStart).hashCode());
        Date $playDateEnd = this.getPlayDateEnd();
        result = result * 59 + ($playDateEnd == null ? 43 : ((Object)$playDateEnd).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PlayRecordsRequest(playDateStart=" + String.valueOf(this.getPlayDateStart()) + ", playDateEnd=" + String.valueOf(this.getPlayDateEnd()) + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
