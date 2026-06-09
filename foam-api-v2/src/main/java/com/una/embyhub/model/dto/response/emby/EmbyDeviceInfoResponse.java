/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;
import lombok.Generated;

public class EmbyDeviceInfoResponse {
    @SerializedName(value="Id")
    private String id;
    @SerializedName(value="Name")
    private String name;
    @SerializedName(value="AppName")
    private String appName;
    @SerializedName(value="AppVersion")
    private String appVersion;
    @SerializedName(value="LastUserId")
    private String lastUserId;
    @SerializedName(value="LastUserName")
    private String lastUserName;
    @SerializedName(value="DateLastActivity")
    private OffsetDateTime dateLastActivity;
    @SerializedName(value="IsBlocked")
    private Boolean blocked;
    @SerializedName(value="ServerId")
    private String serverId;

    @Generated
    public EmbyDeviceInfoResponse() {
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getAppName() {
        return this.appName;
    }

    @Generated
    public String getAppVersion() {
        return this.appVersion;
    }

    @Generated
    public String getLastUserId() {
        return this.lastUserId;
    }

    @Generated
    public String getLastUserName() {
        return this.lastUserName;
    }

    @Generated
    public OffsetDateTime getDateLastActivity() {
        return this.dateLastActivity;
    }

    @Generated
    public Boolean getBlocked() {
        return this.blocked;
    }

    @Generated
    public String getServerId() {
        return this.serverId;
    }

    @Generated
    public void setId(String id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Generated
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Generated
    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId;
    }

    @Generated
    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
    }

    @Generated
    public void setDateLastActivity(OffsetDateTime dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    @Generated
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    @Generated
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyDeviceInfoResponse)) {
            return false;
        }
        EmbyDeviceInfoResponse other = (EmbyDeviceInfoResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$blocked = this.getBlocked();
        Boolean other$blocked = other.getBlocked();
        if (this$blocked == null ? other$blocked != null : !((Object)this$blocked).equals(other$blocked)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$appName = this.getAppName();
        String other$appName = other.getAppName();
        if (this$appName == null ? other$appName != null : !this$appName.equals(other$appName)) {
            return false;
        }
        String this$appVersion = this.getAppVersion();
        String other$appVersion = other.getAppVersion();
        if (this$appVersion == null ? other$appVersion != null : !this$appVersion.equals(other$appVersion)) {
            return false;
        }
        String this$lastUserId = this.getLastUserId();
        String other$lastUserId = other.getLastUserId();
        if (this$lastUserId == null ? other$lastUserId != null : !this$lastUserId.equals(other$lastUserId)) {
            return false;
        }
        String this$lastUserName = this.getLastUserName();
        String other$lastUserName = other.getLastUserName();
        if (this$lastUserName == null ? other$lastUserName != null : !this$lastUserName.equals(other$lastUserName)) {
            return false;
        }
        OffsetDateTime this$dateLastActivity = this.getDateLastActivity();
        OffsetDateTime other$dateLastActivity = other.getDateLastActivity();
        if (this$dateLastActivity == null ? other$dateLastActivity != null : !((Object)this$dateLastActivity).equals(other$dateLastActivity)) {
            return false;
        }
        String this$serverId = this.getServerId();
        String other$serverId = other.getServerId();
        return !(this$serverId == null ? other$serverId != null : !this$serverId.equals(other$serverId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyDeviceInfoResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $blocked = this.getBlocked();
        result = result * 59 + ($blocked == null ? 43 : ((Object)$blocked).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $appName = this.getAppName();
        result = result * 59 + ($appName == null ? 43 : $appName.hashCode());
        String $appVersion = this.getAppVersion();
        result = result * 59 + ($appVersion == null ? 43 : $appVersion.hashCode());
        String $lastUserId = this.getLastUserId();
        result = result * 59 + ($lastUserId == null ? 43 : $lastUserId.hashCode());
        String $lastUserName = this.getLastUserName();
        result = result * 59 + ($lastUserName == null ? 43 : $lastUserName.hashCode());
        OffsetDateTime $dateLastActivity = this.getDateLastActivity();
        result = result * 59 + ($dateLastActivity == null ? 43 : ((Object)$dateLastActivity).hashCode());
        String $serverId = this.getServerId();
        result = result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyDeviceInfoResponse(id=" + this.getId() + ", name=" + this.getName() + ", appName=" + this.getAppName() + ", appVersion=" + this.getAppVersion() + ", lastUserId=" + this.getLastUserId() + ", lastUserName=" + this.getLastUserName() + ", dateLastActivity=" + String.valueOf(this.getDateLastActivity()) + ", blocked=" + this.getBlocked() + ", serverId=" + this.getServerId() + ")";
    }
}
