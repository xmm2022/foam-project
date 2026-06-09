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

@TableName(value="rose_user_binding")
public class RoseUserBinding
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_user_id")
    private String embyUserId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="rose_account_id")
    private String roseAccountId;
    @TableField(value="rose_account_name")
    private String roseAccountName;
    @TableField(value="rose_user_id")
    private String roseUserId;
    @TableField(value="rose_username")
    private String roseUsername;
    @TableField(value="rose_mobile")
    private String roseMobile;
    @TableField(value="rose_avatar_url")
    private String roseAvatarUrl;
    @TableField(value="device_app")
    private String deviceApp;
    @TableField(value="cookie_text")
    private String cookieText;
    @TableField(value="cookie_text_masked")
    private String cookieTextMasked;
    @TableField(value="rose_auth_cookie_text")
    private String roseAuthCookieText;
    @TableField(value="target_root")
    private String targetRoot;
    @TableField(value="libraries_json")
    private String librariesJson;
    @TableField(value="binding_status")
    private String bindingStatus;
    @TableField(value="qr_session_id")
    private String qrSessionId;
    @TableField(value="qr_status")
    private String qrStatus;
    @TableField(value="qr_scan_url")
    private String qrScanUrl;
    @TableField(value="last_error")
    private String lastError;
    @TableField(value="rose_profile_json")
    private String roseProfileJson;
    @TableField(value="account_summary_json")
    private String accountSummaryJson;
    @TableField(value="cookie_updated_at")
    private Date cookieUpdatedAt;
    @TableField(value="bound_at")
    private Date boundAt;
    @TableField(value="last_sync_at")
    private Date lastSyncAt;

    @Generated
    public RoseUserBinding() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
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
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getRoseAccountId() {
        return this.roseAccountId;
    }

    @Generated
    public String getRoseAccountName() {
        return this.roseAccountName;
    }

    @Generated
    public String getRoseUserId() {
        return this.roseUserId;
    }

    @Generated
    public String getRoseUsername() {
        return this.roseUsername;
    }

    @Generated
    public String getRoseMobile() {
        return this.roseMobile;
    }

    @Generated
    public String getRoseAvatarUrl() {
        return this.roseAvatarUrl;
    }

    @Generated
    public String getDeviceApp() {
        return this.deviceApp;
    }

    @Generated
    public String getCookieText() {
        return this.cookieText;
    }

    @Generated
    public String getCookieTextMasked() {
        return this.cookieTextMasked;
    }

    @Generated
    public String getRoseAuthCookieText() {
        return this.roseAuthCookieText;
    }

    @Generated
    public String getTargetRoot() {
        return this.targetRoot;
    }

    @Generated
    public String getLibrariesJson() {
        return this.librariesJson;
    }

    @Generated
    public String getBindingStatus() {
        return this.bindingStatus;
    }

    @Generated
    public String getQrSessionId() {
        return this.qrSessionId;
    }

    @Generated
    public String getQrStatus() {
        return this.qrStatus;
    }

    @Generated
    public String getQrScanUrl() {
        return this.qrScanUrl;
    }

    @Generated
    public String getLastError() {
        return this.lastError;
    }

    @Generated
    public String getRoseProfileJson() {
        return this.roseProfileJson;
    }

    @Generated
    public String getAccountSummaryJson() {
        return this.accountSummaryJson;
    }

    @Generated
    public Date getCookieUpdatedAt() {
        return this.cookieUpdatedAt;
    }

    @Generated
    public Date getBoundAt() {
        return this.boundAt;
    }

    @Generated
    public Date getLastSyncAt() {
        return this.lastSyncAt;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
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
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setRoseAccountId(String roseAccountId) {
        this.roseAccountId = roseAccountId;
    }

    @Generated
    public void setRoseAccountName(String roseAccountName) {
        this.roseAccountName = roseAccountName;
    }

    @Generated
    public void setRoseUserId(String roseUserId) {
        this.roseUserId = roseUserId;
    }

    @Generated
    public void setRoseUsername(String roseUsername) {
        this.roseUsername = roseUsername;
    }

    @Generated
    public void setRoseMobile(String roseMobile) {
        this.roseMobile = roseMobile;
    }

    @Generated
    public void setRoseAvatarUrl(String roseAvatarUrl) {
        this.roseAvatarUrl = roseAvatarUrl;
    }

    @Generated
    public void setDeviceApp(String deviceApp) {
        this.deviceApp = deviceApp;
    }

    @Generated
    public void setCookieText(String cookieText) {
        this.cookieText = cookieText;
    }

    @Generated
    public void setCookieTextMasked(String cookieTextMasked) {
        this.cookieTextMasked = cookieTextMasked;
    }

    @Generated
    public void setRoseAuthCookieText(String roseAuthCookieText) {
        this.roseAuthCookieText = roseAuthCookieText;
    }

    @Generated
    public void setTargetRoot(String targetRoot) {
        this.targetRoot = targetRoot;
    }

    @Generated
    public void setLibrariesJson(String librariesJson) {
        this.librariesJson = librariesJson;
    }

    @Generated
    public void setBindingStatus(String bindingStatus) {
        this.bindingStatus = bindingStatus;
    }

    @Generated
    public void setQrSessionId(String qrSessionId) {
        this.qrSessionId = qrSessionId;
    }

    @Generated
    public void setQrStatus(String qrStatus) {
        this.qrStatus = qrStatus;
    }

    @Generated
    public void setQrScanUrl(String qrScanUrl) {
        this.qrScanUrl = qrScanUrl;
    }

    @Generated
    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    @Generated
    public void setRoseProfileJson(String roseProfileJson) {
        this.roseProfileJson = roseProfileJson;
    }

    @Generated
    public void setAccountSummaryJson(String accountSummaryJson) {
        this.accountSummaryJson = accountSummaryJson;
    }

    @Generated
    public void setCookieUpdatedAt(Date cookieUpdatedAt) {
        this.cookieUpdatedAt = cookieUpdatedAt;
    }

    @Generated
    public void setBoundAt(Date boundAt) {
        this.boundAt = boundAt;
    }

    @Generated
    public void setLastSyncAt(Date lastSyncAt) {
        this.lastSyncAt = lastSyncAt;
    }

    @Override
    @Generated
    public String toString() {
        return "RoseUserBinding(id=" + this.getId() + ", userId=" + this.getUserId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", roseAccountId=" + this.getRoseAccountId() + ", roseAccountName=" + this.getRoseAccountName() + ", roseUserId=" + this.getRoseUserId() + ", roseUsername=" + this.getRoseUsername() + ", roseMobile=" + this.getRoseMobile() + ", roseAvatarUrl=" + this.getRoseAvatarUrl() + ", deviceApp=" + this.getDeviceApp() + ", cookieText=" + this.getCookieText() + ", cookieTextMasked=" + this.getCookieTextMasked() + ", roseAuthCookieText=" + this.getRoseAuthCookieText() + ", targetRoot=" + this.getTargetRoot() + ", librariesJson=" + this.getLibrariesJson() + ", bindingStatus=" + this.getBindingStatus() + ", qrSessionId=" + this.getQrSessionId() + ", qrStatus=" + this.getQrStatus() + ", qrScanUrl=" + this.getQrScanUrl() + ", lastError=" + this.getLastError() + ", roseProfileJson=" + this.getRoseProfileJson() + ", accountSummaryJson=" + this.getAccountSummaryJson() + ", cookieUpdatedAt=" + String.valueOf(this.getCookieUpdatedAt()) + ", boundAt=" + String.valueOf(this.getBoundAt()) + ", lastSyncAt=" + String.valueOf(this.getLastSyncAt()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RoseUserBinding)) {
            return false;
        }
        RoseUserBinding other = (RoseUserBinding)o;
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
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
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
        String this$roseAccountId = this.getRoseAccountId();
        String other$roseAccountId = other.getRoseAccountId();
        if (this$roseAccountId == null ? other$roseAccountId != null : !this$roseAccountId.equals(other$roseAccountId)) {
            return false;
        }
        String this$roseAccountName = this.getRoseAccountName();
        String other$roseAccountName = other.getRoseAccountName();
        if (this$roseAccountName == null ? other$roseAccountName != null : !this$roseAccountName.equals(other$roseAccountName)) {
            return false;
        }
        String this$roseUserId = this.getRoseUserId();
        String other$roseUserId = other.getRoseUserId();
        if (this$roseUserId == null ? other$roseUserId != null : !this$roseUserId.equals(other$roseUserId)) {
            return false;
        }
        String this$roseUsername = this.getRoseUsername();
        String other$roseUsername = other.getRoseUsername();
        if (this$roseUsername == null ? other$roseUsername != null : !this$roseUsername.equals(other$roseUsername)) {
            return false;
        }
        String this$roseMobile = this.getRoseMobile();
        String other$roseMobile = other.getRoseMobile();
        if (this$roseMobile == null ? other$roseMobile != null : !this$roseMobile.equals(other$roseMobile)) {
            return false;
        }
        String this$roseAvatarUrl = this.getRoseAvatarUrl();
        String other$roseAvatarUrl = other.getRoseAvatarUrl();
        if (this$roseAvatarUrl == null ? other$roseAvatarUrl != null : !this$roseAvatarUrl.equals(other$roseAvatarUrl)) {
            return false;
        }
        String this$deviceApp = this.getDeviceApp();
        String other$deviceApp = other.getDeviceApp();
        if (this$deviceApp == null ? other$deviceApp != null : !this$deviceApp.equals(other$deviceApp)) {
            return false;
        }
        String this$cookieText = this.getCookieText();
        String other$cookieText = other.getCookieText();
        if (this$cookieText == null ? other$cookieText != null : !this$cookieText.equals(other$cookieText)) {
            return false;
        }
        String this$cookieTextMasked = this.getCookieTextMasked();
        String other$cookieTextMasked = other.getCookieTextMasked();
        if (this$cookieTextMasked == null ? other$cookieTextMasked != null : !this$cookieTextMasked.equals(other$cookieTextMasked)) {
            return false;
        }
        String this$roseAuthCookieText = this.getRoseAuthCookieText();
        String other$roseAuthCookieText = other.getRoseAuthCookieText();
        if (this$roseAuthCookieText == null ? other$roseAuthCookieText != null : !this$roseAuthCookieText.equals(other$roseAuthCookieText)) {
            return false;
        }
        String this$targetRoot = this.getTargetRoot();
        String other$targetRoot = other.getTargetRoot();
        if (this$targetRoot == null ? other$targetRoot != null : !this$targetRoot.equals(other$targetRoot)) {
            return false;
        }
        String this$librariesJson = this.getLibrariesJson();
        String other$librariesJson = other.getLibrariesJson();
        if (this$librariesJson == null ? other$librariesJson != null : !this$librariesJson.equals(other$librariesJson)) {
            return false;
        }
        String this$bindingStatus = this.getBindingStatus();
        String other$bindingStatus = other.getBindingStatus();
        if (this$bindingStatus == null ? other$bindingStatus != null : !this$bindingStatus.equals(other$bindingStatus)) {
            return false;
        }
        String this$qrSessionId = this.getQrSessionId();
        String other$qrSessionId = other.getQrSessionId();
        if (this$qrSessionId == null ? other$qrSessionId != null : !this$qrSessionId.equals(other$qrSessionId)) {
            return false;
        }
        String this$qrStatus = this.getQrStatus();
        String other$qrStatus = other.getQrStatus();
        if (this$qrStatus == null ? other$qrStatus != null : !this$qrStatus.equals(other$qrStatus)) {
            return false;
        }
        String this$qrScanUrl = this.getQrScanUrl();
        String other$qrScanUrl = other.getQrScanUrl();
        if (this$qrScanUrl == null ? other$qrScanUrl != null : !this$qrScanUrl.equals(other$qrScanUrl)) {
            return false;
        }
        String this$lastError = this.getLastError();
        String other$lastError = other.getLastError();
        if (this$lastError == null ? other$lastError != null : !this$lastError.equals(other$lastError)) {
            return false;
        }
        String this$roseProfileJson = this.getRoseProfileJson();
        String other$roseProfileJson = other.getRoseProfileJson();
        if (this$roseProfileJson == null ? other$roseProfileJson != null : !this$roseProfileJson.equals(other$roseProfileJson)) {
            return false;
        }
        String this$accountSummaryJson = this.getAccountSummaryJson();
        String other$accountSummaryJson = other.getAccountSummaryJson();
        if (this$accountSummaryJson == null ? other$accountSummaryJson != null : !this$accountSummaryJson.equals(other$accountSummaryJson)) {
            return false;
        }
        Date this$cookieUpdatedAt = this.getCookieUpdatedAt();
        Date other$cookieUpdatedAt = other.getCookieUpdatedAt();
        if (this$cookieUpdatedAt == null ? other$cookieUpdatedAt != null : !((Object)this$cookieUpdatedAt).equals(other$cookieUpdatedAt)) {
            return false;
        }
        Date this$boundAt = this.getBoundAt();
        Date other$boundAt = other.getBoundAt();
        if (this$boundAt == null ? other$boundAt != null : !((Object)this$boundAt).equals(other$boundAt)) {
            return false;
        }
        Date this$lastSyncAt = this.getLastSyncAt();
        Date other$lastSyncAt = other.getLastSyncAt();
        return !(this$lastSyncAt == null ? other$lastSyncAt != null : !((Object)this$lastSyncAt).equals(other$lastSyncAt));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseUserBinding;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $roseAccountId = this.getRoseAccountId();
        result = result * 59 + ($roseAccountId == null ? 43 : $roseAccountId.hashCode());
        String $roseAccountName = this.getRoseAccountName();
        result = result * 59 + ($roseAccountName == null ? 43 : $roseAccountName.hashCode());
        String $roseUserId = this.getRoseUserId();
        result = result * 59 + ($roseUserId == null ? 43 : $roseUserId.hashCode());
        String $roseUsername = this.getRoseUsername();
        result = result * 59 + ($roseUsername == null ? 43 : $roseUsername.hashCode());
        String $roseMobile = this.getRoseMobile();
        result = result * 59 + ($roseMobile == null ? 43 : $roseMobile.hashCode());
        String $roseAvatarUrl = this.getRoseAvatarUrl();
        result = result * 59 + ($roseAvatarUrl == null ? 43 : $roseAvatarUrl.hashCode());
        String $deviceApp = this.getDeviceApp();
        result = result * 59 + ($deviceApp == null ? 43 : $deviceApp.hashCode());
        String $cookieText = this.getCookieText();
        result = result * 59 + ($cookieText == null ? 43 : $cookieText.hashCode());
        String $cookieTextMasked = this.getCookieTextMasked();
        result = result * 59 + ($cookieTextMasked == null ? 43 : $cookieTextMasked.hashCode());
        String $roseAuthCookieText = this.getRoseAuthCookieText();
        result = result * 59 + ($roseAuthCookieText == null ? 43 : $roseAuthCookieText.hashCode());
        String $targetRoot = this.getTargetRoot();
        result = result * 59 + ($targetRoot == null ? 43 : $targetRoot.hashCode());
        String $librariesJson = this.getLibrariesJson();
        result = result * 59 + ($librariesJson == null ? 43 : $librariesJson.hashCode());
        String $bindingStatus = this.getBindingStatus();
        result = result * 59 + ($bindingStatus == null ? 43 : $bindingStatus.hashCode());
        String $qrSessionId = this.getQrSessionId();
        result = result * 59 + ($qrSessionId == null ? 43 : $qrSessionId.hashCode());
        String $qrStatus = this.getQrStatus();
        result = result * 59 + ($qrStatus == null ? 43 : $qrStatus.hashCode());
        String $qrScanUrl = this.getQrScanUrl();
        result = result * 59 + ($qrScanUrl == null ? 43 : $qrScanUrl.hashCode());
        String $lastError = this.getLastError();
        result = result * 59 + ($lastError == null ? 43 : $lastError.hashCode());
        String $roseProfileJson = this.getRoseProfileJson();
        result = result * 59 + ($roseProfileJson == null ? 43 : $roseProfileJson.hashCode());
        String $accountSummaryJson = this.getAccountSummaryJson();
        result = result * 59 + ($accountSummaryJson == null ? 43 : $accountSummaryJson.hashCode());
        Date $cookieUpdatedAt = this.getCookieUpdatedAt();
        result = result * 59 + ($cookieUpdatedAt == null ? 43 : ((Object)$cookieUpdatedAt).hashCode());
        Date $boundAt = this.getBoundAt();
        result = result * 59 + ($boundAt == null ? 43 : ((Object)$boundAt).hashCode());
        Date $lastSyncAt = this.getLastSyncAt();
        result = result * 59 + ($lastSyncAt == null ? 43 : ((Object)$lastSyncAt).hashCode());
        return result;
    }
}
