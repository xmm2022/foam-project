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
import lombok.Generated;

@TableName(value="media_view_detail")
public class MediaViewDetail
extends BaseEntity
implements Serializable {
    public static final String COL_CREATE_TIME = "create_time";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="media_id")
    private Long mediaId;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="view_time")
    private String viewTime;
    @TableField(value="device")
    private String device;
    public static final String COL_ID = "id";
    public static final String COL_MEDIA_ID = "media_id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_VIEW_TIME = "view_time";
    public static final String COL_DEVICE = "device";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public MediaViewDetail() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getMediaId() {
        return this.mediaId;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public String getViewTime() {
        return this.viewTime;
    }

    @Generated
    public String getDevice() {
        return this.device;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setViewTime(String viewTime) {
        this.viewTime = viewTime;
    }

    @Generated
    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    @Generated
    public String toString() {
        return "MediaViewDetail(id=" + this.getId() + ", mediaId=" + this.getMediaId() + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", viewTime=" + this.getViewTime() + ", device=" + this.getDevice() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MediaViewDetail)) {
            return false;
        }
        MediaViewDetail other = (MediaViewDetail)o;
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
        Long this$mediaId = this.getMediaId();
        Long other$mediaId = other.getMediaId();
        if (this$mediaId == null ? other$mediaId != null : !((Object)this$mediaId).equals(other$mediaId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$viewTime = this.getViewTime();
        String other$viewTime = other.getViewTime();
        if (this$viewTime == null ? other$viewTime != null : !this$viewTime.equals(other$viewTime)) {
            return false;
        }
        String this$device = this.getDevice();
        String other$device = other.getDevice();
        return !(this$device == null ? other$device != null : !this$device.equals(other$device));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MediaViewDetail;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $mediaId = this.getMediaId();
        result = result * 59 + ($mediaId == null ? 43 : ((Object)$mediaId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $viewTime = this.getViewTime();
        result = result * 59 + ($viewTime == null ? 43 : $viewTime.hashCode());
        String $device = this.getDevice();
        result = result * 59 + ($device == null ? 43 : $device.hashCode());
        return result;
    }
}
