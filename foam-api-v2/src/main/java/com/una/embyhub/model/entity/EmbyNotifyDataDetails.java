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

@TableName(value="emby_notify_data_details")
public class EmbyNotifyDataDetails
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="emby_notify_data_id")
    private Long embyNotifyDataId;
    @TableField(value="episode_details")
    private String episodeDetails;
    @TableField(value="episode_info")
    private String episodeInfo;
    @TableField(value="`size`")
    private String size;
    @TableField(value="`status`")
    private Integer status;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    public static final String COL_ID = "id";
    public static final String COL_EMBY_NOTIFY_DATA_ID = "emby_notify_data_id";
    public static final String COL_EPISODE_DETAILS = "episode_details";
    public static final String COL_EPISODE_INFO = "episode_info";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_SIZE = "size";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_STATUS = "status";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";

    @Generated
    public EmbyNotifyDataDetails() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getEmbyNotifyDataId() {
        return this.embyNotifyDataId;
    }

    @Generated
    public String getEpisodeDetails() {
        return this.episodeDetails;
    }

    @Generated
    public String getEpisodeInfo() {
        return this.episodeInfo;
    }

    @Generated
    public String getSize() {
        return this.size;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyNotifyDataId(Long embyNotifyDataId) {
        this.embyNotifyDataId = embyNotifyDataId;
    }

    @Generated
    public void setEpisodeDetails(String episodeDetails) {
        this.episodeDetails = episodeDetails;
    }

    @Generated
    public void setEpisodeInfo(String episodeInfo) {
        this.episodeInfo = episodeInfo;
    }

    @Generated
    public void setSize(String size) {
        this.size = size;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyNotifyDataDetails(id=" + this.getId() + ", embyNotifyDataId=" + this.getEmbyNotifyDataId() + ", episodeDetails=" + this.getEpisodeDetails() + ", episodeInfo=" + this.getEpisodeInfo() + ", size=" + this.getSize() + ", status=" + this.getStatus() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyNotifyDataDetails)) {
            return false;
        }
        EmbyNotifyDataDetails other = (EmbyNotifyDataDetails)o;
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
        Long this$embyNotifyDataId = this.getEmbyNotifyDataId();
        Long other$embyNotifyDataId = other.getEmbyNotifyDataId();
        if (this$embyNotifyDataId == null ? other$embyNotifyDataId != null : !((Object)this$embyNotifyDataId).equals(other$embyNotifyDataId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        String this$episodeDetails = this.getEpisodeDetails();
        String other$episodeDetails = other.getEpisodeDetails();
        if (this$episodeDetails == null ? other$episodeDetails != null : !this$episodeDetails.equals(other$episodeDetails)) {
            return false;
        }
        String this$episodeInfo = this.getEpisodeInfo();
        String other$episodeInfo = other.getEpisodeInfo();
        if (this$episodeInfo == null ? other$episodeInfo != null : !this$episodeInfo.equals(other$episodeInfo)) {
            return false;
        }
        String this$size = this.getSize();
        String other$size = other.getSize();
        return !(this$size == null ? other$size != null : !this$size.equals(other$size));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyNotifyDataDetails;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyNotifyDataId = this.getEmbyNotifyDataId();
        result = result * 59 + ($embyNotifyDataId == null ? 43 : ((Object)$embyNotifyDataId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $episodeDetails = this.getEpisodeDetails();
        result = result * 59 + ($episodeDetails == null ? 43 : $episodeDetails.hashCode());
        String $episodeInfo = this.getEpisodeInfo();
        result = result * 59 + ($episodeInfo == null ? 43 : $episodeInfo.hashCode());
        String $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : $size.hashCode());
        return result;
    }
}
