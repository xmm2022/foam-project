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

@TableName(value="playback_reporting_record")
public class PlaybackReportingRecord
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="play_day")
    private Date playDay;
    @TableField(value="play_date")
    private Date playDate;
    @TableField(value="user_id")
    private String userId;
    @TableField(value="user_name")
    private String userName;
    @TableField(value="nick_name")
    private String nickName;
    @TableField(value="item_id")
    private Integer itemId;
    @TableField(value="item_name")
    private String itemName;
    @TableField(value="item_type")
    private String itemType;
    @TableField(value="duration")
    private Integer duration;
    @TableField(value="remote_address")
    private String remoteAddress;
    @TableField(value="location")
    private String location;
    @TableField(value="poster_url")
    private String posterUrl;
    @TableField(value="row_hash")
    private String rowHash;

    @Generated
    public PlaybackReportingRecord() {
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
    public Date getPlayDate() {
        return this.playDate;
    }

    @Generated
    public String getUserId() {
        return this.userId;
    }

    @Generated
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public String getNickName() {
        return this.nickName;
    }

    @Generated
    public Integer getItemId() {
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
    public Integer getDuration() {
        return this.duration;
    }

    @Generated
    public String getRemoteAddress() {
        return this.remoteAddress;
    }

    @Generated
    public String getLocation() {
        return this.location;
    }

    @Generated
    public String getPosterUrl() {
        return this.posterUrl;
    }

    @Generated
    public String getRowHash() {
        return this.rowHash;
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
    public void setPlayDate(Date playDate) {
        this.playDate = playDate;
    }

    @Generated
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Generated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Generated
    public void setItemId(Integer itemId) {
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
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Generated
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Generated
    public void setLocation(String location) {
        this.location = location;
    }

    @Generated
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    @Generated
    public void setRowHash(String rowHash) {
        this.rowHash = rowHash;
    }

    @Override
    @Generated
    public String toString() {
        return "PlaybackReportingRecord(id=" + this.getId() + ", embyInfoId=" + this.getEmbyInfoId() + ", playDay=" + String.valueOf(this.getPlayDay()) + ", playDate=" + String.valueOf(this.getPlayDate()) + ", userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", nickName=" + this.getNickName() + ", itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", itemType=" + this.getItemType() + ", duration=" + this.getDuration() + ", remoteAddress=" + this.getRemoteAddress() + ", location=" + this.getLocation() + ", posterUrl=" + this.getPosterUrl() + ", rowHash=" + this.getRowHash() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlaybackReportingRecord)) {
            return false;
        }
        PlaybackReportingRecord other = (PlaybackReportingRecord)o;
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
        Integer this$itemId = this.getItemId();
        Integer other$itemId = other.getItemId();
        if (this$itemId == null ? other$itemId != null : !((Object)this$itemId).equals(other$itemId)) {
            return false;
        }
        Integer this$duration = this.getDuration();
        Integer other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !((Object)this$duration).equals(other$duration)) {
            return false;
        }
        Date this$playDay = this.getPlayDay();
        Date other$playDay = other.getPlayDay();
        if (this$playDay == null ? other$playDay != null : !((Object)this$playDay).equals(other$playDay)) {
            return false;
        }
        Date this$playDate = this.getPlayDate();
        Date other$playDate = other.getPlayDate();
        if (this$playDate == null ? other$playDate != null : !((Object)this$playDate).equals(other$playDate)) {
            return false;
        }
        String this$userId = this.getUserId();
        String other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        String this$nickName = this.getNickName();
        String other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) {
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
        String this$remoteAddress = this.getRemoteAddress();
        String other$remoteAddress = other.getRemoteAddress();
        if (this$remoteAddress == null ? other$remoteAddress != null : !this$remoteAddress.equals(other$remoteAddress)) {
            return false;
        }
        String this$location = this.getLocation();
        String other$location = other.getLocation();
        if (this$location == null ? other$location != null : !this$location.equals(other$location)) {
            return false;
        }
        String this$posterUrl = this.getPosterUrl();
        String other$posterUrl = other.getPosterUrl();
        if (this$posterUrl == null ? other$posterUrl != null : !this$posterUrl.equals(other$posterUrl)) {
            return false;
        }
        String this$rowHash = this.getRowHash();
        String other$rowHash = other.getRowHash();
        return !(this$rowHash == null ? other$rowHash != null : !this$rowHash.equals(other$rowHash));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlaybackReportingRecord;
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
        Integer $itemId = this.getItemId();
        result = result * 59 + ($itemId == null ? 43 : ((Object)$itemId).hashCode());
        Integer $duration = this.getDuration();
        result = result * 59 + ($duration == null ? 43 : ((Object)$duration).hashCode());
        Date $playDay = this.getPlayDay();
        result = result * 59 + ($playDay == null ? 43 : ((Object)$playDay).hashCode());
        Date $playDate = this.getPlayDate();
        result = result * 59 + ($playDate == null ? 43 : ((Object)$playDate).hashCode());
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $nickName = this.getNickName();
        result = result * 59 + ($nickName == null ? 43 : $nickName.hashCode());
        String $itemName = this.getItemName();
        result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $remoteAddress = this.getRemoteAddress();
        result = result * 59 + ($remoteAddress == null ? 43 : $remoteAddress.hashCode());
        String $location = this.getLocation();
        result = result * 59 + ($location == null ? 43 : $location.hashCode());
        String $posterUrl = this.getPosterUrl();
        result = result * 59 + ($posterUrl == null ? 43 : $posterUrl.hashCode());
        String $rowHash = this.getRowHash();
        result = result * 59 + ($rowHash == null ? 43 : $rowHash.hashCode());
        return result;
    }
}
