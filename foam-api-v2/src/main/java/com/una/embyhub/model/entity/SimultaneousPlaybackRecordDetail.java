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

@TableName(value="simultaneous_playback_record_detail")
public class SimultaneousPlaybackRecordDetail
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="record_id")
    private Long recordId;
    @TableField(value="item_id")
    private String itemId;
    @TableField(value="item_name")
    private String itemName;
    @TableField(value="item_type")
    private String itemType;
    @TableField(value="poster_url")
    private String posterUrl;
    @TableField(value="playback_time")
    private Date playbackTime;
    @TableField(value="client")
    private String client;
    @TableField(value="device_name")
    private String deviceName;
    @TableField(value="remote_endpoint")
    private String remoteEndpoint;
    @TableField(value="remote_address")
    private String remoteAddress;
    public static final String COL_ID = "id";
    public static final String COL_RECORD_ID = "record_id";
    public static final String COL_ITEM_ID = "item_id";
    public static final String COL_ITEM_NAME = "item_name";
    public static final String COL_ITEM_TYPE = "item_type";
    public static final String COL_POSTER_URL = "poster_url";
    public static final String COL_PLAYBACK_TIME = "playback_time";
    public static final String COL_CLIENT = "client";
    public static final String COL_DEVICE_NAME = "device_name";
    public static final String COL_REMOTE_ENDPOINT = "remote_endpoint";
    public static final String COL_REMOTE_ADDRESS = "remote_address";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public SimultaneousPlaybackRecordDetail() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getRecordId() {
        return this.recordId;
    }

    @Generated
    public String getItemId() {
        return this.itemId;
    }

    @Generated
    public String getItemName() {
        return this.itemName;
    }

    @Generated
    public String getItemType() {
        return this.itemType;
    }

    @Generated
    public String getPosterUrl() {
        return this.posterUrl;
    }

    @Generated
    public Date getPlaybackTime() {
        return this.playbackTime;
    }

    @Generated
    public String getClient() {
        return this.client;
    }

    @Generated
    public String getDeviceName() {
        return this.deviceName;
    }

    @Generated
    public String getRemoteEndpoint() {
        return this.remoteEndpoint;
    }

    @Generated
    public String getRemoteAddress() {
        return this.remoteAddress;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    @Generated
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Generated
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Generated
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Generated
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    @Generated
    public void setPlaybackTime(Date playbackTime) {
        this.playbackTime = playbackTime;
    }

    @Generated
    public void setClient(String client) {
        this.client = client;
    }

    @Generated
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Generated
    public void setRemoteEndpoint(String remoteEndpoint) {
        this.remoteEndpoint = remoteEndpoint;
    }

    @Generated
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    @Generated
    public String toString() {
        return "SimultaneousPlaybackRecordDetail(id=" + this.getId() + ", recordId=" + this.getRecordId() + ", itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", itemType=" + this.getItemType() + ", posterUrl=" + this.getPosterUrl() + ", playbackTime=" + String.valueOf(this.getPlaybackTime()) + ", client=" + this.getClient() + ", deviceName=" + this.getDeviceName() + ", remoteEndpoint=" + this.getRemoteEndpoint() + ", remoteAddress=" + this.getRemoteAddress() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SimultaneousPlaybackRecordDetail)) {
            return false;
        }
        SimultaneousPlaybackRecordDetail other = (SimultaneousPlaybackRecordDetail)o;
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
        Long this$recordId = this.getRecordId();
        Long other$recordId = other.getRecordId();
        if (this$recordId == null ? other$recordId != null : !((Object)this$recordId).equals(other$recordId)) {
            return false;
        }
        String this$itemId = this.getItemId();
        String other$itemId = other.getItemId();
        if (this$itemId == null ? other$itemId != null : !this$itemId.equals(other$itemId)) {
            return false;
        }
        String this$itemName = this.getItemName();
        String other$itemName = other.getItemName();
        if (this$itemName == null ? other$itemName != null : !this$itemName.equals(other$itemName)) {
            return false;
        }
        String this$itemType = this.getItemType();
        String other$itemType = other.getItemType();
        if (this$itemType == null ? other$itemType != null : !this$itemType.equals(other$itemType)) {
            return false;
        }
        String this$posterUrl = this.getPosterUrl();
        String other$posterUrl = other.getPosterUrl();
        if (this$posterUrl == null ? other$posterUrl != null : !this$posterUrl.equals(other$posterUrl)) {
            return false;
        }
        Date this$playbackTime = this.getPlaybackTime();
        Date other$playbackTime = other.getPlaybackTime();
        if (this$playbackTime == null ? other$playbackTime != null : !((Object)this$playbackTime).equals(other$playbackTime)) {
            return false;
        }
        String this$client = this.getClient();
        String other$client = other.getClient();
        if (this$client == null ? other$client != null : !this$client.equals(other$client)) {
            return false;
        }
        String this$deviceName = this.getDeviceName();
        String other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
            return false;
        }
        String this$remoteEndpoint = this.getRemoteEndpoint();
        String other$remoteEndpoint = other.getRemoteEndpoint();
        if (this$remoteEndpoint == null ? other$remoteEndpoint != null : !this$remoteEndpoint.equals(other$remoteEndpoint)) {
            return false;
        }
        String this$remoteAddress = this.getRemoteAddress();
        String other$remoteAddress = other.getRemoteAddress();
        return !(this$remoteAddress == null ? other$remoteAddress != null : !this$remoteAddress.equals(other$remoteAddress));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SimultaneousPlaybackRecordDetail;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $recordId = this.getRecordId();
        result = result * 59 + ($recordId == null ? 43 : ((Object)$recordId).hashCode());
        String $itemId = this.getItemId();
        result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
        String $itemName = this.getItemName();
        result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $posterUrl = this.getPosterUrl();
        result = result * 59 + ($posterUrl == null ? 43 : $posterUrl.hashCode());
        Date $playbackTime = this.getPlaybackTime();
        result = result * 59 + ($playbackTime == null ? 43 : ((Object)$playbackTime).hashCode());
        String $client = this.getClient();
        result = result * 59 + ($client == null ? 43 : $client.hashCode());
        String $deviceName = this.getDeviceName();
        result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
        String $remoteEndpoint = this.getRemoteEndpoint();
        result = result * 59 + ($remoteEndpoint == null ? 43 : $remoteEndpoint.hashCode());
        String $remoteAddress = this.getRemoteAddress();
        result = result * 59 + ($remoteAddress == null ? 43 : $remoteAddress.hashCode());
        return result;
    }
}
