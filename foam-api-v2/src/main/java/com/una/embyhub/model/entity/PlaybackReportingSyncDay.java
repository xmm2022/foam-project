/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

@TableName(value="playback_reporting_sync_day")
public class PlaybackReportingSyncDay
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="play_day")
    private Date playDay;
    @TableField(value="sync_status")
    private Integer syncStatus;
    @TableField(value="record_count")
    private Integer recordCount;
    @TableField(value="synced_at")
    private Date syncedAt;
    @TableField(value="error_message")
    private String errorMessage;

    @Generated
    public PlaybackReportingSyncDay() {
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
    public Date getPlayDay() {
        return this.playDay;
    }

    @Generated
    public Integer getSyncStatus() {
        return this.syncStatus;
    }

    @Generated
    public Integer getRecordCount() {
        return this.recordCount;
    }

    @Generated
    public Date getSyncedAt() {
        return this.syncedAt;
    }

    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
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
    public void setPlayDay(Date playDay) {
        this.playDay = playDay;
    }

    @Generated
    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    @Generated
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    @Generated
    public void setSyncedAt(Date syncedAt) {
        this.syncedAt = syncedAt;
    }

    @Generated
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    @Generated
    public String toString() {
        return "PlaybackReportingSyncDay(id=" + this.getId() + ", embyInfoId=" + this.getEmbyInfoId() + ", playDay=" + String.valueOf(this.getPlayDay()) + ", syncStatus=" + this.getSyncStatus() + ", recordCount=" + this.getRecordCount() + ", syncedAt=" + String.valueOf(this.getSyncedAt()) + ", errorMessage=" + this.getErrorMessage() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlaybackReportingSyncDay)) {
            return false;
        }
        PlaybackReportingSyncDay other = (PlaybackReportingSyncDay)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        Integer this$syncStatus = this.getSyncStatus();
        Integer other$syncStatus = other.getSyncStatus();
        if (this$syncStatus == null ? other$syncStatus != null : !((Object)this$syncStatus).equals(other$syncStatus)) {
            return false;
        }
        Integer this$recordCount = this.getRecordCount();
        Integer other$recordCount = other.getRecordCount();
        if (this$recordCount == null ? other$recordCount != null : !((Object)this$recordCount).equals(other$recordCount)) {
            return false;
        }
        Date this$playDay = this.getPlayDay();
        Date other$playDay = other.getPlayDay();
        if (this$playDay == null ? other$playDay != null : !((Object)this$playDay).equals(other$playDay)) {
            return false;
        }
        Date this$syncedAt = this.getSyncedAt();
        Date other$syncedAt = other.getSyncedAt();
        if (this$syncedAt == null ? other$syncedAt != null : !((Object)this$syncedAt).equals(other$syncedAt)) {
            return false;
        }
        String this$errorMessage = this.getErrorMessage();
        String other$errorMessage = other.getErrorMessage();
        return !(this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlaybackReportingSyncDay;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $syncStatus = this.getSyncStatus();
        result = result * 59 + ($syncStatus == null ? 43 : ((Object)$syncStatus).hashCode());
        Integer $recordCount = this.getRecordCount();
        result = result * 59 + ($recordCount == null ? 43 : ((Object)$recordCount).hashCode());
        Date $playDay = this.getPlayDay();
        result = result * 59 + ($playDay == null ? 43 : ((Object)$playDay).hashCode());
        Date $syncedAt = this.getSyncedAt();
        result = result * 59 + ($syncedAt == null ? 43 : ((Object)$syncedAt).hashCode());
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        return result;
    }
}
