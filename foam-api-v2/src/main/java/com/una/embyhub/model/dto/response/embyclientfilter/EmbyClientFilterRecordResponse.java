/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyclientfilter;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyClientFilterRecordResponse
implements Serializable {
    private Long id;
    private Long embyInfoId;
    private String embyServerId;
    private String serverName;
    private String event;
    private String embyUserId;
    private String embyUserName;
    private String sessionId;
    private String clientName;
    private String deviceName;
    private String deviceId;
    private String applicationVersion;
    private String remoteEndpoint;
    private String itemId;
    private String itemName;
    private String itemType;
    private String matchedPattern;
    private Integer usingDefaultPatterns;
    private Integer stopSuccess;
    private Integer messageSuccess;
    private Integer blockUserEnabled;
    private Integer blockUserSuccess;
    private Integer notifySent;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date triggerTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createDatetime;

    @Generated
    public EmbyClientFilterRecordResponse() {
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
    public String getEmbyServerId() {
        return this.embyServerId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getEvent() {
        return this.event;
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
    public String getSessionId() {
        return this.sessionId;
    }

    @Generated
    public String getClientName() {
        return this.clientName;
    }

    @Generated
    public String getDeviceName() {
        return this.deviceName;
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
    public String getRemoteEndpoint() {
        return this.remoteEndpoint;
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
    public String getMatchedPattern() {
        return this.matchedPattern;
    }

    @Generated
    public Integer getUsingDefaultPatterns() {
        return this.usingDefaultPatterns;
    }

    @Generated
    public Integer getStopSuccess() {
        return this.stopSuccess;
    }

    @Generated
    public Integer getMessageSuccess() {
        return this.messageSuccess;
    }

    @Generated
    public Integer getBlockUserEnabled() {
        return this.blockUserEnabled;
    }

    @Generated
    public Integer getBlockUserSuccess() {
        return this.blockUserSuccess;
    }

    @Generated
    public Integer getNotifySent() {
        return this.notifySent;
    }

    @Generated
    public Date getTriggerTime() {
        return this.triggerTime;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
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
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setEvent(String event) {
        this.event = event;
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
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Generated
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Generated
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Generated
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Generated
    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    @Generated
    public void setRemoteEndpoint(String remoteEndpoint) {
        this.remoteEndpoint = remoteEndpoint;
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
    public void setMatchedPattern(String matchedPattern) {
        this.matchedPattern = matchedPattern;
    }

    @Generated
    public void setUsingDefaultPatterns(Integer usingDefaultPatterns) {
        this.usingDefaultPatterns = usingDefaultPatterns;
    }

    @Generated
    public void setStopSuccess(Integer stopSuccess) {
        this.stopSuccess = stopSuccess;
    }

    @Generated
    public void setMessageSuccess(Integer messageSuccess) {
        this.messageSuccess = messageSuccess;
    }

    @Generated
    public void setBlockUserEnabled(Integer blockUserEnabled) {
        this.blockUserEnabled = blockUserEnabled;
    }

    @Generated
    public void setBlockUserSuccess(Integer blockUserSuccess) {
        this.blockUserSuccess = blockUserSuccess;
    }

    @Generated
    public void setNotifySent(Integer notifySent) {
        this.notifySent = notifySent;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Generated
    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyClientFilterRecordResponse)) {
            return false;
        }
        EmbyClientFilterRecordResponse other = (EmbyClientFilterRecordResponse)o;
        if (!other.canEqual(this)) {
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
        Integer this$usingDefaultPatterns = this.getUsingDefaultPatterns();
        Integer other$usingDefaultPatterns = other.getUsingDefaultPatterns();
        if (this$usingDefaultPatterns == null ? other$usingDefaultPatterns != null : !((Object)this$usingDefaultPatterns).equals(other$usingDefaultPatterns)) {
            return false;
        }
        Integer this$stopSuccess = this.getStopSuccess();
        Integer other$stopSuccess = other.getStopSuccess();
        if (this$stopSuccess == null ? other$stopSuccess != null : !((Object)this$stopSuccess).equals(other$stopSuccess)) {
            return false;
        }
        Integer this$messageSuccess = this.getMessageSuccess();
        Integer other$messageSuccess = other.getMessageSuccess();
        if (this$messageSuccess == null ? other$messageSuccess != null : !((Object)this$messageSuccess).equals(other$messageSuccess)) {
            return false;
        }
        Integer this$blockUserEnabled = this.getBlockUserEnabled();
        Integer other$blockUserEnabled = other.getBlockUserEnabled();
        if (this$blockUserEnabled == null ? other$blockUserEnabled != null : !((Object)this$blockUserEnabled).equals(other$blockUserEnabled)) {
            return false;
        }
        Integer this$blockUserSuccess = this.getBlockUserSuccess();
        Integer other$blockUserSuccess = other.getBlockUserSuccess();
        if (this$blockUserSuccess == null ? other$blockUserSuccess != null : !((Object)this$blockUserSuccess).equals(other$blockUserSuccess)) {
            return false;
        }
        Integer this$notifySent = this.getNotifySent();
        Integer other$notifySent = other.getNotifySent();
        if (this$notifySent == null ? other$notifySent != null : !((Object)this$notifySent).equals(other$notifySent)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$event = this.getEvent();
        String other$event = other.getEvent();
        if (this$event == null ? other$event != null : !this$event.equals(other$event)) {
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
        String this$sessionId = this.getSessionId();
        String other$sessionId = other.getSessionId();
        if (this$sessionId == null ? other$sessionId != null : !this$sessionId.equals(other$sessionId)) {
            return false;
        }
        String this$clientName = this.getClientName();
        String other$clientName = other.getClientName();
        if (this$clientName == null ? other$clientName != null : !this$clientName.equals(other$clientName)) {
            return false;
        }
        String this$deviceName = this.getDeviceName();
        String other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
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
        String this$remoteEndpoint = this.getRemoteEndpoint();
        String other$remoteEndpoint = other.getRemoteEndpoint();
        if (this$remoteEndpoint == null ? other$remoteEndpoint != null : !this$remoteEndpoint.equals(other$remoteEndpoint)) {
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
        String this$matchedPattern = this.getMatchedPattern();
        String other$matchedPattern = other.getMatchedPattern();
        if (this$matchedPattern == null ? other$matchedPattern != null : !this$matchedPattern.equals(other$matchedPattern)) {
            return false;
        }
        Date this$triggerTime = this.getTriggerTime();
        Date other$triggerTime = other.getTriggerTime();
        if (this$triggerTime == null ? other$triggerTime != null : !((Object)this$triggerTime).equals(other$triggerTime)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyClientFilterRecordResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $usingDefaultPatterns = this.getUsingDefaultPatterns();
        result = result * 59 + ($usingDefaultPatterns == null ? 43 : ((Object)$usingDefaultPatterns).hashCode());
        Integer $stopSuccess = this.getStopSuccess();
        result = result * 59 + ($stopSuccess == null ? 43 : ((Object)$stopSuccess).hashCode());
        Integer $messageSuccess = this.getMessageSuccess();
        result = result * 59 + ($messageSuccess == null ? 43 : ((Object)$messageSuccess).hashCode());
        Integer $blockUserEnabled = this.getBlockUserEnabled();
        result = result * 59 + ($blockUserEnabled == null ? 43 : ((Object)$blockUserEnabled).hashCode());
        Integer $blockUserSuccess = this.getBlockUserSuccess();
        result = result * 59 + ($blockUserSuccess == null ? 43 : ((Object)$blockUserSuccess).hashCode());
        Integer $notifySent = this.getNotifySent();
        result = result * 59 + ($notifySent == null ? 43 : ((Object)$notifySent).hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $event = this.getEvent();
        result = result * 59 + ($event == null ? 43 : $event.hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $sessionId = this.getSessionId();
        result = result * 59 + ($sessionId == null ? 43 : $sessionId.hashCode());
        String $clientName = this.getClientName();
        result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
        String $deviceName = this.getDeviceName();
        result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
        String $deviceId = this.getDeviceId();
        result = result * 59 + ($deviceId == null ? 43 : $deviceId.hashCode());
        String $applicationVersion = this.getApplicationVersion();
        result = result * 59 + ($applicationVersion == null ? 43 : $applicationVersion.hashCode());
        String $remoteEndpoint = this.getRemoteEndpoint();
        result = result * 59 + ($remoteEndpoint == null ? 43 : $remoteEndpoint.hashCode());
        String $itemId = this.getItemId();
        result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
        String $itemName = this.getItemName();
        result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $matchedPattern = this.getMatchedPattern();
        result = result * 59 + ($matchedPattern == null ? 43 : $matchedPattern.hashCode());
        Date $triggerTime = this.getTriggerTime();
        result = result * 59 + ($triggerTime == null ? 43 : ((Object)$triggerTime).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyClientFilterRecordResponse(id=" + this.getId() + ", embyInfoId=" + this.getEmbyInfoId() + ", embyServerId=" + this.getEmbyServerId() + ", serverName=" + this.getServerName() + ", event=" + this.getEvent() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", sessionId=" + this.getSessionId() + ", clientName=" + this.getClientName() + ", deviceName=" + this.getDeviceName() + ", deviceId=" + this.getDeviceId() + ", applicationVersion=" + this.getApplicationVersion() + ", remoteEndpoint=" + this.getRemoteEndpoint() + ", itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", itemType=" + this.getItemType() + ", matchedPattern=" + this.getMatchedPattern() + ", usingDefaultPatterns=" + this.getUsingDefaultPatterns() + ", stopSuccess=" + this.getStopSuccess() + ", messageSuccess=" + this.getMessageSuccess() + ", blockUserEnabled=" + this.getBlockUserEnabled() + ", blockUserSuccess=" + this.getBlockUserSuccess() + ", notifySent=" + this.getNotifySent() + ", triggerTime=" + String.valueOf(this.getTriggerTime()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
