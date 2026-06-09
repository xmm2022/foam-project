/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  embyclient.model.BaseItemDto
 *  embyclient.model.PlayerStateInfo
 *  embyclient.model.SessionUserInfo
 *  embyclient.model.TranscodingInfo
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import com.google.gson.annotations.SerializedName;
import embyclient.model.BaseItemDto;
import embyclient.model.PlayerStateInfo;
import embyclient.model.SessionUserInfo;
import embyclient.model.TranscodingInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class SessionSessionInfoResponse {
    @SerializedName(value="PlayState")
    private PlayerStateInfo playState;
    @SerializedName(value="AdditionalUsers")
    private List<SessionUserInfo> additionalUsers = new ArrayList<SessionUserInfo>();
    @SerializedName(value="RemoteEndPoint")
    private String remoteEndPoint;
    @SerializedName(value="Protocol")
    private String protocol;
    @SerializedName(value="PlayableMediaTypes")
    private List<String> playableMediaTypes = new ArrayList<String>();
    @SerializedName(value="PlaylistItemId")
    private String playlistItemId;
    @SerializedName(value="PlaylistIndex")
    private Integer playlistIndex;
    @SerializedName(value="PlaylistLength")
    private Integer playlistLength;
    @SerializedName(value="Id")
    private String id;
    @SerializedName(value="ServerId")
    private String serverId;
    @SerializedName(value="UserId")
    private String userId;
    @SerializedName(value="UserName")
    private String userName;
    @SerializedName(value="UserPrimaryImageTag")
    private String userPrimaryImageTag;
    @SerializedName(value="Client")
    private String client;
    @SerializedName(value="LastActivityDate")
    private OffsetDateTime lastActivityDate;
    @SerializedName(value="DeviceName")
    private String deviceName;
    @SerializedName(value="DeviceType")
    private String deviceType;
    @SerializedName(value="NowPlayingItem")
    private BaseItemDto nowPlayingItem;
    @SerializedName(value="InternalDeviceId")
    private Long internalDeviceId;
    @SerializedName(value="DeviceId")
    private String deviceId;
    @SerializedName(value="ApplicationVersion")
    private String applicationVersion;
    @SerializedName(value="AppIconUrl")
    private String appIconUrl;
    @SerializedName(value="SupportedCommands")
    private List<String> supportedCommands = new ArrayList<String>();
    @SerializedName(value="TranscodingInfo")
    private TranscodingInfo transcodingInfo;
    @SerializedName(value="SupportsRemoteControl")
    private Boolean supportsRemoteControl;
    private String coverImage;
    private String UserAvatar;

    @Generated
    public SessionSessionInfoResponse() {
    }

    @Generated
    public PlayerStateInfo getPlayState() {
        return this.playState;
    }

    @Generated
    public List<SessionUserInfo> getAdditionalUsers() {
        return this.additionalUsers;
    }

    @Generated
    public String getRemoteEndPoint() {
        return this.remoteEndPoint;
    }

    @Generated
    public String getProtocol() {
        return this.protocol;
    }

    @Generated
    public List<String> getPlayableMediaTypes() {
        return this.playableMediaTypes;
    }

    @Generated
    public String getPlaylistItemId() {
        return this.playlistItemId;
    }

    @Generated
    public Integer getPlaylistIndex() {
        return this.playlistIndex;
    }

    @Generated
    public Integer getPlaylistLength() {
        return this.playlistLength;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getServerId() {
        return this.serverId;
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
    public String getUserPrimaryImageTag() {
        return this.userPrimaryImageTag;
    }

    @Generated
    public String getClient() {
        return this.client;
    }

    @Generated
    public OffsetDateTime getLastActivityDate() {
        return this.lastActivityDate;
    }

    @Generated
    public String getDeviceName() {
        return this.deviceName;
    }

    @Generated
    public String getDeviceType() {
        return this.deviceType;
    }

    @Generated
    public BaseItemDto getNowPlayingItem() {
        return this.nowPlayingItem;
    }

    @Generated
    public Long getInternalDeviceId() {
        return this.internalDeviceId;
    }

    @Generated
    public String getDeviceId() {
        return this.deviceId;
    }

    @Generated
    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    @Generated
    public String getAppIconUrl() {
        return this.appIconUrl;
    }

    @Generated
    public List<String> getSupportedCommands() {
        return this.supportedCommands;
    }

    @Generated
    public TranscodingInfo getTranscodingInfo() {
        return this.transcodingInfo;
    }

    @Generated
    public Boolean getSupportsRemoteControl() {
        return this.supportsRemoteControl;
    }

    @Generated
    public String getCoverImage() {
        return this.coverImage;
    }

    @Generated
    public String getUserAvatar() {
        return this.UserAvatar;
    }

    @Generated
    public SessionSessionInfoResponse setPlayState(PlayerStateInfo playState) {
        this.playState = playState;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setAdditionalUsers(List<SessionUserInfo> additionalUsers) {
        this.additionalUsers = additionalUsers;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setRemoteEndPoint(String remoteEndPoint) {
        this.remoteEndPoint = remoteEndPoint;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setPlayableMediaTypes(List<String> playableMediaTypes) {
        this.playableMediaTypes = playableMediaTypes;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setPlaylistItemId(String playlistItemId) {
        this.playlistItemId = playlistItemId;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setPlaylistIndex(Integer playlistIndex) {
        this.playlistIndex = playlistIndex;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setPlaylistLength(Integer playlistLength) {
        this.playlistLength = playlistLength;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setUserPrimaryImageTag(String userPrimaryImageTag) {
        this.userPrimaryImageTag = userPrimaryImageTag;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setClient(String client) {
        this.client = client;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setLastActivityDate(OffsetDateTime lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setNowPlayingItem(BaseItemDto nowPlayingItem) {
        this.nowPlayingItem = nowPlayingItem;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setInternalDeviceId(Long internalDeviceId) {
        this.internalDeviceId = internalDeviceId;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setSupportedCommands(List<String> supportedCommands) {
        this.supportedCommands = supportedCommands;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setTranscodingInfo(TranscodingInfo transcodingInfo) {
        this.transcodingInfo = transcodingInfo;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setSupportsRemoteControl(Boolean supportsRemoteControl) {
        this.supportsRemoteControl = supportsRemoteControl;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setCoverImage(String coverImage) {
        this.coverImage = coverImage;
        return this;
    }

    @Generated
    public SessionSessionInfoResponse setUserAvatar(String UserAvatar) {
        this.UserAvatar = UserAvatar;
        return this;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SessionSessionInfoResponse)) {
            return false;
        }
        SessionSessionInfoResponse other = (SessionSessionInfoResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$playlistIndex = this.getPlaylistIndex();
        Integer other$playlistIndex = other.getPlaylistIndex();
        if (this$playlistIndex == null ? other$playlistIndex != null : !((Object)this$playlistIndex).equals(other$playlistIndex)) {
            return false;
        }
        Integer this$playlistLength = this.getPlaylistLength();
        Integer other$playlistLength = other.getPlaylistLength();
        if (this$playlistLength == null ? other$playlistLength != null : !((Object)this$playlistLength).equals(other$playlistLength)) {
            return false;
        }
        Long this$internalDeviceId = this.getInternalDeviceId();
        Long other$internalDeviceId = other.getInternalDeviceId();
        if (this$internalDeviceId == null ? other$internalDeviceId != null : !((Object)this$internalDeviceId).equals(other$internalDeviceId)) {
            return false;
        }
        Boolean this$supportsRemoteControl = this.getSupportsRemoteControl();
        Boolean other$supportsRemoteControl = other.getSupportsRemoteControl();
        if (this$supportsRemoteControl == null ? other$supportsRemoteControl != null : !((Object)this$supportsRemoteControl).equals(other$supportsRemoteControl)) {
            return false;
        }
        PlayerStateInfo this$playState = this.getPlayState();
        PlayerStateInfo other$playState = other.getPlayState();
        if (this$playState == null ? other$playState != null : !this$playState.equals(other$playState)) {
            return false;
        }
        List<SessionUserInfo> this$additionalUsers = this.getAdditionalUsers();
        List<SessionUserInfo> other$additionalUsers = other.getAdditionalUsers();
        if (this$additionalUsers == null ? other$additionalUsers != null : !((Object)this$additionalUsers).equals(other$additionalUsers)) {
            return false;
        }
        String this$remoteEndPoint = this.getRemoteEndPoint();
        String other$remoteEndPoint = other.getRemoteEndPoint();
        if (this$remoteEndPoint == null ? other$remoteEndPoint != null : !this$remoteEndPoint.equals(other$remoteEndPoint)) {
            return false;
        }
        String this$protocol = this.getProtocol();
        String other$protocol = other.getProtocol();
        if (this$protocol == null ? other$protocol != null : !this$protocol.equals(other$protocol)) {
            return false;
        }
        List<String> this$playableMediaTypes = this.getPlayableMediaTypes();
        List<String> other$playableMediaTypes = other.getPlayableMediaTypes();
        if (this$playableMediaTypes == null ? other$playableMediaTypes != null : !((Object)this$playableMediaTypes).equals(other$playableMediaTypes)) {
            return false;
        }
        String this$playlistItemId = this.getPlaylistItemId();
        String other$playlistItemId = other.getPlaylistItemId();
        if (this$playlistItemId == null ? other$playlistItemId != null : !this$playlistItemId.equals(other$playlistItemId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$serverId = this.getServerId();
        String other$serverId = other.getServerId();
        if (this$serverId == null ? other$serverId != null : !this$serverId.equals(other$serverId)) {
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
        String this$userPrimaryImageTag = this.getUserPrimaryImageTag();
        String other$userPrimaryImageTag = other.getUserPrimaryImageTag();
        if (this$userPrimaryImageTag == null ? other$userPrimaryImageTag != null : !this$userPrimaryImageTag.equals(other$userPrimaryImageTag)) {
            return false;
        }
        String this$client = this.getClient();
        String other$client = other.getClient();
        if (this$client == null ? other$client != null : !this$client.equals(other$client)) {
            return false;
        }
        OffsetDateTime this$lastActivityDate = this.getLastActivityDate();
        OffsetDateTime other$lastActivityDate = other.getLastActivityDate();
        if (this$lastActivityDate == null ? other$lastActivityDate != null : !((Object)this$lastActivityDate).equals(other$lastActivityDate)) {
            return false;
        }
        String this$deviceName = this.getDeviceName();
        String other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
            return false;
        }
        String this$deviceType = this.getDeviceType();
        String other$deviceType = other.getDeviceType();
        if (this$deviceType == null ? other$deviceType != null : !this$deviceType.equals(other$deviceType)) {
            return false;
        }
        BaseItemDto this$nowPlayingItem = this.getNowPlayingItem();
        BaseItemDto other$nowPlayingItem = other.getNowPlayingItem();
        if (this$nowPlayingItem == null ? other$nowPlayingItem != null : !this$nowPlayingItem.equals(other$nowPlayingItem)) {
            return false;
        }
        String this$deviceId = this.getDeviceId();
        String other$deviceId = other.getDeviceId();
        if (this$deviceId == null ? other$deviceId != null : !this$deviceId.equals(other$deviceId)) {
            return false;
        }
        String this$applicationVersion = this.getApplicationVersion();
        String other$applicationVersion = other.getApplicationVersion();
        if (this$applicationVersion == null ? other$applicationVersion != null : !this$applicationVersion.equals(other$applicationVersion)) {
            return false;
        }
        String this$appIconUrl = this.getAppIconUrl();
        String other$appIconUrl = other.getAppIconUrl();
        if (this$appIconUrl == null ? other$appIconUrl != null : !this$appIconUrl.equals(other$appIconUrl)) {
            return false;
        }
        List<String> this$supportedCommands = this.getSupportedCommands();
        List<String> other$supportedCommands = other.getSupportedCommands();
        if (this$supportedCommands == null ? other$supportedCommands != null : !((Object)this$supportedCommands).equals(other$supportedCommands)) {
            return false;
        }
        TranscodingInfo this$transcodingInfo = this.getTranscodingInfo();
        TranscodingInfo other$transcodingInfo = other.getTranscodingInfo();
        if (this$transcodingInfo == null ? other$transcodingInfo != null : !this$transcodingInfo.equals(other$transcodingInfo)) {
            return false;
        }
        String this$coverImage = this.getCoverImage();
        String other$coverImage = other.getCoverImage();
        if (this$coverImage == null ? other$coverImage != null : !this$coverImage.equals(other$coverImage)) {
            return false;
        }
        String this$UserAvatar = this.getUserAvatar();
        String other$UserAvatar = other.getUserAvatar();
        return !(this$UserAvatar == null ? other$UserAvatar != null : !this$UserAvatar.equals(other$UserAvatar));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SessionSessionInfoResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $playlistIndex = this.getPlaylistIndex();
        result = result * 59 + ($playlistIndex == null ? 43 : ((Object)$playlistIndex).hashCode());
        Integer $playlistLength = this.getPlaylistLength();
        result = result * 59 + ($playlistLength == null ? 43 : ((Object)$playlistLength).hashCode());
        Long $internalDeviceId = this.getInternalDeviceId();
        result = result * 59 + ($internalDeviceId == null ? 43 : ((Object)$internalDeviceId).hashCode());
        Boolean $supportsRemoteControl = this.getSupportsRemoteControl();
        result = result * 59 + ($supportsRemoteControl == null ? 43 : ((Object)$supportsRemoteControl).hashCode());
        PlayerStateInfo $playState = this.getPlayState();
        result = result * 59 + ($playState == null ? 43 : $playState.hashCode());
        List<SessionUserInfo> $additionalUsers = this.getAdditionalUsers();
        result = result * 59 + ($additionalUsers == null ? 43 : ((Object)$additionalUsers).hashCode());
        String $remoteEndPoint = this.getRemoteEndPoint();
        result = result * 59 + ($remoteEndPoint == null ? 43 : $remoteEndPoint.hashCode());
        String $protocol = this.getProtocol();
        result = result * 59 + ($protocol == null ? 43 : $protocol.hashCode());
        List<String> $playableMediaTypes = this.getPlayableMediaTypes();
        result = result * 59 + ($playableMediaTypes == null ? 43 : ((Object)$playableMediaTypes).hashCode());
        String $playlistItemId = this.getPlaylistItemId();
        result = result * 59 + ($playlistItemId == null ? 43 : $playlistItemId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $serverId = this.getServerId();
        result = result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $userPrimaryImageTag = this.getUserPrimaryImageTag();
        result = result * 59 + ($userPrimaryImageTag == null ? 43 : $userPrimaryImageTag.hashCode());
        String $client = this.getClient();
        result = result * 59 + ($client == null ? 43 : $client.hashCode());
        OffsetDateTime $lastActivityDate = this.getLastActivityDate();
        result = result * 59 + ($lastActivityDate == null ? 43 : ((Object)$lastActivityDate).hashCode());
        String $deviceName = this.getDeviceName();
        result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
        String $deviceType = this.getDeviceType();
        result = result * 59 + ($deviceType == null ? 43 : $deviceType.hashCode());
        BaseItemDto $nowPlayingItem = this.getNowPlayingItem();
        result = result * 59 + ($nowPlayingItem == null ? 43 : $nowPlayingItem.hashCode());
        String $deviceId = this.getDeviceId();
        result = result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
        String $applicationVersion = this.getApplicationVersion();
        result = result * 59 + ($applicationVersion == null ? 43 : $applicationVersion.hashCode());
        String $appIconUrl = this.getAppIconUrl();
        result = result * 59 + ($appIconUrl == null ? 43 : $appIconUrl.hashCode());
        List<String> $supportedCommands = this.getSupportedCommands();
        result = result * 59 + ($supportedCommands == null ? 43 : ((Object)$supportedCommands).hashCode());
        TranscodingInfo $transcodingInfo = this.getTranscodingInfo();
        result = result * 59 + ($transcodingInfo == null ? 43 : $transcodingInfo.hashCode());
        String $coverImage = this.getCoverImage();
        result = result * 59 + ($coverImage == null ? 43 : $coverImage.hashCode());
        String $UserAvatar = this.getUserAvatar();
        result = result * 59 + ($UserAvatar == null ? 43 : $UserAvatar.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SessionSessionInfoResponse(playState=" + String.valueOf(this.getPlayState()) + ", additionalUsers=" + String.valueOf(this.getAdditionalUsers()) + ", remoteEndPoint=" + this.getRemoteEndPoint() + ", protocol=" + this.getProtocol() + ", playableMediaTypes=" + String.valueOf(this.getPlayableMediaTypes()) + ", playlistItemId=" + this.getPlaylistItemId() + ", playlistIndex=" + this.getPlaylistIndex() + ", playlistLength=" + this.getPlaylistLength() + ", id=" + this.getId() + ", serverId=" + this.getServerId() + ", userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", userPrimaryImageTag=" + this.getUserPrimaryImageTag() + ", client=" + this.getClient() + ", lastActivityDate=" + String.valueOf(this.getLastActivityDate()) + ", deviceName=" + this.getDeviceName() + ", deviceType=" + this.getDeviceType() + ", nowPlayingItem=" + String.valueOf(this.getNowPlayingItem()) + ", internalDeviceId=" + this.getInternalDeviceId() + ", deviceId=" + this.getDeviceId() + ", applicationVersion=" + this.getApplicationVersion() + ", appIconUrl=" + this.getAppIconUrl() + ", supportedCommands=" + String.valueOf(this.getSupportedCommands()) + ", transcodingInfo=" + String.valueOf(this.getTranscodingInfo()) + ", supportsRemoteControl=" + this.getSupportsRemoteControl() + ", coverImage=" + this.getCoverImage() + ", UserAvatar=" + this.getUserAvatar() + ")";
    }
}
