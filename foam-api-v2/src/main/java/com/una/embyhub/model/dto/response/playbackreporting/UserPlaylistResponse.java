/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playbackreporting;

import com.alibaba.fastjson2.annotation.JSONField;
import java.io.Serializable;
import lombok.Generated;

public class UserPlaylistResponse
implements Serializable {
    private String date;
    private String time;
    private String dateTime;
    @JSONField(name="user_id")
    private String userId;
    @JSONField(name="item_name")
    private String itemName;
    @JSONField(name="item_id")
    private Integer itemId;
    @JSONField(name="item_type")
    private String itemType;
    private String duration;
    @JSONField(name="remote_address")
    private String remoteAddress;
    private String location;
    @JSONField(name="user_name")
    private String userName;
    private String nickName;
    @JSONField(name="user_has_image")
    private Boolean userHasImage;
    private String posterUrl;

    @Generated
    public UserPlaylistResponse() {
    }

    @Generated
    public String getDate() {
        return this.date;
    }

    @Generated
    public String getTime() {
        return this.time;
    }

    @Generated
    public String getDateTime() {
        return this.dateTime;
    }

    @Generated
    public String getUserId() {
        return this.userId;
    }

    @Generated
    public String getItemName() {
        return this.itemName;
    }

    @Generated
    public Integer getItemId() {
        return this.itemId;
    }

    @Generated
    public String getItemType() {
        return this.itemType;
    }

    @Generated
    public String getDuration() {
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
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public String getNickName() {
        return this.nickName;
    }

    @Generated
    public Boolean getUserHasImage() {
        return this.userHasImage;
    }

    @Generated
    public String getPosterUrl() {
        return this.posterUrl;
    }

    @Generated
    public void setDate(String date) {
        this.date = date;
    }

    @Generated
    public void setTime(String time) {
        this.time = time;
    }

    @Generated
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Generated
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Generated
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Generated
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Generated
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Generated
    public void setDuration(String duration) {
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
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Generated
    public void setUserHasImage(Boolean userHasImage) {
        this.userHasImage = userHasImage;
    }

    @Generated
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserPlaylistResponse)) {
            return false;
        }
        UserPlaylistResponse other = (UserPlaylistResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$itemId = this.getItemId();
        Integer other$itemId = other.getItemId();
        if (this$itemId == null ? other$itemId != null : !((Object)this$itemId).equals(other$itemId)) {
            return false;
        }
        Boolean this$userHasImage = this.getUserHasImage();
        Boolean other$userHasImage = other.getUserHasImage();
        if (this$userHasImage == null ? other$userHasImage != null : !((Object)this$userHasImage).equals(other$userHasImage)) {
            return false;
        }
        String this$date = this.getDate();
        String other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) {
            return false;
        }
        String this$time = this.getTime();
        String other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) {
            return false;
        }
        String this$dateTime = this.getDateTime();
        String other$dateTime = other.getDateTime();
        if (this$dateTime == null ? other$dateTime != null : !this$dateTime.equals(other$dateTime)) {
            return false;
        }
        String this$userId = this.getUserId();
        String other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) {
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
        String this$duration = this.getDuration();
        String other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !this$duration.equals(other$duration)) {
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
        String this$posterUrl = this.getPosterUrl();
        String other$posterUrl = other.getPosterUrl();
        return !(this$posterUrl == null ? other$posterUrl != null : !this$posterUrl.equals(other$posterUrl));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserPlaylistResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $itemId = this.getItemId();
        result = result * 59 + ($itemId == null ? 43 : ((Object)$itemId).hashCode());
        Boolean $userHasImage = this.getUserHasImage();
        result = result * 59 + ($userHasImage == null ? 43 : ((Object)$userHasImage).hashCode());
        String $date = this.getDate();
        result = result * 59 + ($date == null ? 43 : $date.hashCode());
        String $time = this.getTime();
        result = result * 59 + ($time == null ? 43 : $time.hashCode());
        String $dateTime = this.getDateTime();
        result = result * 59 + ($dateTime == null ? 43 : $dateTime.hashCode());
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        String $itemName = this.getItemName();
        result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $duration = this.getDuration();
        result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
        String $remoteAddress = this.getRemoteAddress();
        result = result * 59 + ($remoteAddress == null ? 43 : $remoteAddress.hashCode());
        String $location = this.getLocation();
        result = result * 59 + ($location == null ? 43 : $location.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $nickName = this.getNickName();
        result = result * 59 + ($nickName == null ? 43 : $nickName.hashCode());
        String $posterUrl = this.getPosterUrl();
        result = result * 59 + ($posterUrl == null ? 43 : $posterUrl.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserPlaylistResponse(date=" + this.getDate() + ", time=" + this.getTime() + ", dateTime=" + this.getDateTime() + ", userId=" + this.getUserId() + ", itemName=" + this.getItemName() + ", itemId=" + this.getItemId() + ", itemType=" + this.getItemType() + ", duration=" + this.getDuration() + ", remoteAddress=" + this.getRemoteAddress() + ", location=" + this.getLocation() + ", userName=" + this.getUserName() + ", nickName=" + this.getNickName() + ", userHasImage=" + this.getUserHasImage() + ", posterUrl=" + this.getPosterUrl() + ")";
    }
}
