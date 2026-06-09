/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.rose;

import com.una.embyhub.model.dto.response.rose.RoseLibraryBindingResponse;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class RoseBindingResponse
implements Serializable {
    private Long id;
    private Long userId;
    private String embyUserId;
    private String embyUserName;
    private String roseAccountId;
    private String roseAccountName;
    private String roseUserId;
    private String roseUsername;
    private String roseMobile;
    private String roseAvatarUrl;
    private String deviceApp;
    private Boolean hasCookie;
    private String cookieTextMasked;
    private String targetRoot;
    private String targetRootName;
    private String targetRootPath;
    private List<RoseLibraryBindingResponse> libraries;
    private String bindingStatus;
    private Boolean bound;
    private String qrSessionId;
    private String qrStatus;
    private String qrScanUrl;
    private String lastError;
    private Object roseProfile;
    private Object accountSummary;
    private Date cookieUpdatedAt;
    private Date boundAt;
    private Date lastSyncAt;

    @Generated
    public RoseBindingResponse() {
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
    public Boolean getHasCookie() {
        return this.hasCookie;
    }

    @Generated
    public String getCookieTextMasked() {
        return this.cookieTextMasked;
    }

    @Generated
    public String getTargetRoot() {
        return this.targetRoot;
    }

    @Generated
    public String getTargetRootName() {
        return this.targetRootName;
    }

    @Generated
    public String getTargetRootPath() {
        return this.targetRootPath;
    }

    @Generated
    public List<RoseLibraryBindingResponse> getLibraries() {
        return this.libraries;
    }

    @Generated
    public String getBindingStatus() {
        return this.bindingStatus;
    }

    @Generated
    public Boolean getBound() {
        return this.bound;
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
    public Object getRoseProfile() {
        return this.roseProfile;
    }

    @Generated
    public Object getAccountSummary() {
        return this.accountSummary;
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
    public void setHasCookie(Boolean hasCookie) {
        this.hasCookie = hasCookie;
    }

    @Generated
    public void setCookieTextMasked(String cookieTextMasked) {
        this.cookieTextMasked = cookieTextMasked;
    }

    @Generated
    public void setTargetRoot(String targetRoot) {
        this.targetRoot = targetRoot;
    }

    @Generated
    public void setTargetRootName(String targetRootName) {
        this.targetRootName = targetRootName;
    }

    @Generated
    public void setTargetRootPath(String targetRootPath) {
        this.targetRootPath = targetRootPath;
    }

    @Generated
    public void setLibraries(List<RoseLibraryBindingResponse> libraries) {
        this.libraries = libraries;
    }

    @Generated
    public void setBindingStatus(String bindingStatus) {
        this.bindingStatus = bindingStatus;
    }

    @Generated
    public void setBound(Boolean bound) {
        this.bound = bound;
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
    public void setRoseProfile(Object roseProfile) {
        this.roseProfile = roseProfile;
    }

    @Generated
    public void setAccountSummary(Object accountSummary) {
        this.accountSummary = accountSummary;
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

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RoseBindingResponse)) {
            return false;
        }
        RoseBindingResponse other = (RoseBindingResponse)o;
        if (!other.canEqual(this)) {
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
        Boolean this$hasCookie = this.getHasCookie();
        Boolean other$hasCookie = other.getHasCookie();
        if (this$hasCookie == null ? other$hasCookie != null : !((Object)this$hasCookie).equals(other$hasCookie)) {
            return false;
        }
        Boolean this$bound = this.getBound();
        Boolean other$bound = other.getBound();
        if (this$bound == null ? other$bound != null : !((Object)this$bound).equals(other$bound)) {
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
        String this$cookieTextMasked = this.getCookieTextMasked();
        String other$cookieTextMasked = other.getCookieTextMasked();
        if (this$cookieTextMasked == null ? other$cookieTextMasked != null : !this$cookieTextMasked.equals(other$cookieTextMasked)) {
            return false;
        }
        String this$targetRoot = this.getTargetRoot();
        String other$targetRoot = other.getTargetRoot();
        if (this$targetRoot == null ? other$targetRoot != null : !this$targetRoot.equals(other$targetRoot)) {
            return false;
        }
        String this$targetRootName = this.getTargetRootName();
        String other$targetRootName = other.getTargetRootName();
        if (this$targetRootName == null ? other$targetRootName != null : !this$targetRootName.equals(other$targetRootName)) {
            return false;
        }
        String this$targetRootPath = this.getTargetRootPath();
        String other$targetRootPath = other.getTargetRootPath();
        if (this$targetRootPath == null ? other$targetRootPath != null : !this$targetRootPath.equals(other$targetRootPath)) {
            return false;
        }
        List<RoseLibraryBindingResponse> this$libraries = this.getLibraries();
        List<RoseLibraryBindingResponse> other$libraries = other.getLibraries();
        if (this$libraries == null ? other$libraries != null : !((Object)this$libraries).equals(other$libraries)) {
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
        Object this$roseProfile = this.getRoseProfile();
        Object other$roseProfile = other.getRoseProfile();
        if (this$roseProfile == null ? other$roseProfile != null : !this$roseProfile.equals(other$roseProfile)) {
            return false;
        }
        Object this$accountSummary = this.getAccountSummary();
        Object other$accountSummary = other.getAccountSummary();
        if (this$accountSummary == null ? other$accountSummary != null : !this$accountSummary.equals(other$accountSummary)) {
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

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseBindingResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Boolean $hasCookie = this.getHasCookie();
        result = result * 59 + ($hasCookie == null ? 43 : ((Object)$hasCookie).hashCode());
        Boolean $bound = this.getBound();
        result = result * 59 + ($bound == null ? 43 : ((Object)$bound).hashCode());
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
        String $cookieTextMasked = this.getCookieTextMasked();
        result = result * 59 + ($cookieTextMasked == null ? 43 : $cookieTextMasked.hashCode());
        String $targetRoot = this.getTargetRoot();
        result = result * 59 + ($targetRoot == null ? 43 : $targetRoot.hashCode());
        String $targetRootName = this.getTargetRootName();
        result = result * 59 + ($targetRootName == null ? 43 : $targetRootName.hashCode());
        String $targetRootPath = this.getTargetRootPath();
        result = result * 59 + ($targetRootPath == null ? 43 : $targetRootPath.hashCode());
        List<RoseLibraryBindingResponse> $libraries = this.getLibraries();
        result = result * 59 + ($libraries == null ? 43 : ((Object)$libraries).hashCode());
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
        Object $roseProfile = this.getRoseProfile();
        result = result * 59 + ($roseProfile == null ? 43 : $roseProfile.hashCode());
        Object $accountSummary = this.getAccountSummary();
        result = result * 59 + ($accountSummary == null ? 43 : $accountSummary.hashCode());
        Date $cookieUpdatedAt = this.getCookieUpdatedAt();
        result = result * 59 + ($cookieUpdatedAt == null ? 43 : ((Object)$cookieUpdatedAt).hashCode());
        Date $boundAt = this.getBoundAt();
        result = result * 59 + ($boundAt == null ? 43 : ((Object)$boundAt).hashCode());
        Date $lastSyncAt = this.getLastSyncAt();
        result = result * 59 + ($lastSyncAt == null ? 43 : ((Object)$lastSyncAt).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseBindingResponse(id=" + this.getId() + ", userId=" + this.getUserId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", roseAccountId=" + this.getRoseAccountId() + ", roseAccountName=" + this.getRoseAccountName() + ", roseUserId=" + this.getRoseUserId() + ", roseUsername=" + this.getRoseUsername() + ", roseMobile=" + this.getRoseMobile() + ", roseAvatarUrl=" + this.getRoseAvatarUrl() + ", deviceApp=" + this.getDeviceApp() + ", hasCookie=" + this.getHasCookie() + ", cookieTextMasked=" + this.getCookieTextMasked() + ", targetRoot=" + this.getTargetRoot() + ", targetRootName=" + this.getTargetRootName() + ", targetRootPath=" + this.getTargetRootPath() + ", libraries=" + String.valueOf(this.getLibraries()) + ", bindingStatus=" + this.getBindingStatus() + ", bound=" + this.getBound() + ", qrSessionId=" + this.getQrSessionId() + ", qrStatus=" + this.getQrStatus() + ", qrScanUrl=" + this.getQrScanUrl() + ", lastError=" + this.getLastError() + ", roseProfile=" + String.valueOf(this.getRoseProfile()) + ", accountSummary=" + String.valueOf(this.getAccountSummary()) + ", cookieUpdatedAt=" + String.valueOf(this.getCookieUpdatedAt()) + ", boundAt=" + String.valueOf(this.getBoundAt()) + ", lastSyncAt=" + String.valueOf(this.getLastSyncAt()) + ")";
    }
}
