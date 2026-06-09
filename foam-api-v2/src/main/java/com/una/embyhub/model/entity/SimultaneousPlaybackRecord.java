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

@TableName(value="simultaneous_playback_record")
public class SimultaneousPlaybackRecord
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="emby_user_id")
    private String embyUserId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="detection_time")
    private Date detectionTime;
    @TableField(value="session_count")
    private Integer sessionCount;
    public static final String COL_ID = "id";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_EMBY_USER_ID = "emby_user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_DETECTION_TIME = "detection_time";
    public static final String COL_SESSION_COUNT = "session_count";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public SimultaneousPlaybackRecord() {
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
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
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
    public void setDetectionTime(Date detectionTime) {
        this.detectionTime = detectionTime;
    }

    @Generated
    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    @Override
    @Generated
    public String toString() {
        return "SimultaneousPlaybackRecord(id=" + this.getId() + ", embyInfoId=" + this.getEmbyInfoId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", detectionTime=" + String.valueOf(this.getDetectionTime()) + ", sessionCount=" + this.getSessionCount() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SimultaneousPlaybackRecord)) {
            return false;
        }
        SimultaneousPlaybackRecord other = (SimultaneousPlaybackRecord)o;
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
        Integer this$sessionCount = this.getSessionCount();
        Integer other$sessionCount = other.getSessionCount();
        if (this$sessionCount == null ? other$sessionCount != null : !((Object)this$sessionCount).equals(other$sessionCount)) {
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
        return !(this$detectionTime == null ? other$detectionTime != null : !((Object)this$detectionTime).equals(other$detectionTime));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SimultaneousPlaybackRecord;
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
        Integer $sessionCount = this.getSessionCount();
        result = result * 59 + ($sessionCount == null ? 43 : ((Object)$sessionCount).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        Date $detectionTime = this.getDetectionTime();
        result = result * 59 + ($detectionTime == null ? 43 : ((Object)$detectionTime).hashCode());
        return result;
    }
}
