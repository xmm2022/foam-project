/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.rose;

import com.una.embyhub.model.dto.request.rose.RoseLibraryBindingRequest;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class RoseBindRequest
implements Serializable {
    private String app;
    private String cookie;
    private String embyPassword;
    private String targetRoot;
    private String targetRootName;
    private String targetRootPath;
    private List<RoseLibraryBindingRequest> libraries;

    @Generated
    public RoseBindRequest() {
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
    public String getEmbyPassword() {
        return this.embyPassword;
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
    public List<RoseLibraryBindingRequest> getLibraries() {
        return this.libraries;
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
    public void setEmbyPassword(String embyPassword) {
        this.embyPassword = embyPassword;
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
    public void setLibraries(List<RoseLibraryBindingRequest> libraries) {
        this.libraries = libraries;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RoseBindRequest)) {
            return false;
        }
        RoseBindRequest other = (RoseBindRequest)o;
        if (!other.canEqual(this)) {
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
        String this$embyPassword = this.getEmbyPassword();
        String other$embyPassword = other.getEmbyPassword();
        if (this$embyPassword == null ? other$embyPassword != null : !this$embyPassword.equals(other$embyPassword)) {
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
        List<RoseLibraryBindingRequest> this$libraries = this.getLibraries();
        List<RoseLibraryBindingRequest> other$libraries = other.getLibraries();
        return !(this$libraries == null ? other$libraries != null : !((Object)this$libraries).equals(other$libraries));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseBindRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $app = this.getApp();
        result = result * 59 + ($app == null ? 43 : $app.hashCode());
        String $cookie = this.getCookie();
        result = result * 59 + ($cookie == null ? 43 : $cookie.hashCode());
        String $embyPassword = this.getEmbyPassword();
        result = result * 59 + ($embyPassword == null ? 43 : $embyPassword.hashCode());
        String $targetRoot = this.getTargetRoot();
        result = result * 59 + ($targetRoot == null ? 43 : $targetRoot.hashCode());
        String $targetRootName = this.getTargetRootName();
        result = result * 59 + ($targetRootName == null ? 43 : $targetRootName.hashCode());
        String $targetRootPath = this.getTargetRootPath();
        result = result * 59 + ($targetRootPath == null ? 43 : $targetRootPath.hashCode());
        List<RoseLibraryBindingRequest> $libraries = this.getLibraries();
        result = result * 59 + ($libraries == null ? 43 : ((Object)$libraries).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseBindRequest(app=" + this.getApp() + ", cookie=" + this.getCookie() + ", embyPassword=" + this.getEmbyPassword() + ", targetRoot=" + this.getTargetRoot() + ", targetRootName=" + this.getTargetRootName() + ", targetRootPath=" + this.getTargetRootPath() + ", libraries=" + String.valueOf(this.getLibraries()) + ")";
    }
}
