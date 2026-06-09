/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.rose;

import java.io.Serializable;
import lombok.Generated;

public class RoseLibraryBrowseRequest
implements Serializable {
    private String cid;
    private String sourceRoot;
    private String accountId;
    private String sourceAccount;
    private String app;
    private String cookie;
    private String cookieText;
    private String cookies;
    private String embyPassword;

    @Generated
    public RoseLibraryBrowseRequest() {
    }

    @Generated
    public String getCid() {
        return this.cid;
    }

    @Generated
    public String getSourceRoot() {
        return this.sourceRoot;
    }

    @Generated
    public String getAccountId() {
        return this.accountId;
    }

    @Generated
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    @Generated
    public String getApp() {
        return this.app;
    }

    @Generated
    public String getCookie() {
        return this.cookie;
    }

    @Generated
    public String getCookieText() {
        return this.cookieText;
    }

    @Generated
    public String getCookies() {
        return this.cookies;
    }

    @Generated
    public String getEmbyPassword() {
        return this.embyPassword;
    }

    @Generated
    public void setCid(String cid) {
        this.cid = cid;
    }

    @Generated
    public void setSourceRoot(String sourceRoot) {
        this.sourceRoot = sourceRoot;
    }

    @Generated
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Generated
    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    @Generated
    public void setApp(String app) {
        this.app = app;
    }

    @Generated
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    @Generated
    public void setCookieText(String cookieText) {
        this.cookieText = cookieText;
    }

    @Generated
    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    @Generated
    public void setEmbyPassword(String embyPassword) {
        this.embyPassword = embyPassword;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RoseLibraryBrowseRequest)) {
            return false;
        }
        RoseLibraryBrowseRequest other = (RoseLibraryBrowseRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$cid = this.getCid();
        String other$cid = other.getCid();
        if (this$cid == null ? other$cid != null : !this$cid.equals(other$cid)) {
            return false;
        }
        String this$sourceRoot = this.getSourceRoot();
        String other$sourceRoot = other.getSourceRoot();
        if (this$sourceRoot == null ? other$sourceRoot != null : !this$sourceRoot.equals(other$sourceRoot)) {
            return false;
        }
        String this$accountId = this.getAccountId();
        String other$accountId = other.getAccountId();
        if (this$accountId == null ? other$accountId != null : !this$accountId.equals(other$accountId)) {
            return false;
        }
        String this$sourceAccount = this.getSourceAccount();
        String other$sourceAccount = other.getSourceAccount();
        if (this$sourceAccount == null ? other$sourceAccount != null : !this$sourceAccount.equals(other$sourceAccount)) {
            return false;
        }
        String this$app = this.getApp();
        String other$app = other.getApp();
        if (this$app == null ? other$app != null : !this$app.equals(other$app)) {
            return false;
        }
        String this$cookie = this.getCookie();
        String other$cookie = other.getCookie();
        if (this$cookie == null ? other$cookie != null : !this$cookie.equals(other$cookie)) {
            return false;
        }
        String this$cookieText = this.getCookieText();
        String other$cookieText = other.getCookieText();
        if (this$cookieText == null ? other$cookieText != null : !this$cookieText.equals(other$cookieText)) {
            return false;
        }
        String this$cookies = this.getCookies();
        String other$cookies = other.getCookies();
        if (this$cookies == null ? other$cookies != null : !this$cookies.equals(other$cookies)) {
            return false;
        }
        String this$embyPassword = this.getEmbyPassword();
        String other$embyPassword = other.getEmbyPassword();
        return !(this$embyPassword == null ? other$embyPassword != null : !this$embyPassword.equals(other$embyPassword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseLibraryBrowseRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $cid = this.getCid();
        result = result * 59 + ($cid == null ? 43 : $cid.hashCode());
        String $sourceRoot = this.getSourceRoot();
        result = result * 59 + ($sourceRoot == null ? 43 : $sourceRoot.hashCode());
        String $accountId = this.getAccountId();
        result = result * 59 + ($accountId == null ? 43 : $accountId.hashCode());
        String $sourceAccount = this.getSourceAccount();
        result = result * 59 + ($sourceAccount == null ? 43 : $sourceAccount.hashCode());
        String $app = this.getApp();
        result = result * 59 + ($app == null ? 43 : $app.hashCode());
        String $cookie = this.getCookie();
        result = result * 59 + ($cookie == null ? 43 : $cookie.hashCode());
        String $cookieText = this.getCookieText();
        result = result * 59 + ($cookieText == null ? 43 : $cookieText.hashCode());
        String $cookies = this.getCookies();
        result = result * 59 + ($cookies == null ? 43 : $cookies.hashCode());
        String $embyPassword = this.getEmbyPassword();
        result = result * 59 + ($embyPassword == null ? 43 : $embyPassword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseLibraryBrowseRequest(cid=" + this.getCid() + ", sourceRoot=" + this.getSourceRoot() + ", accountId=" + this.getAccountId() + ", sourceAccount=" + this.getSourceAccount() + ", app=" + this.getApp() + ", cookie=" + this.getCookie() + ", cookieText=" + this.getCookieText() + ", cookies=" + this.getCookies() + ", embyPassword=" + this.getEmbyPassword() + ")";
    }
}
