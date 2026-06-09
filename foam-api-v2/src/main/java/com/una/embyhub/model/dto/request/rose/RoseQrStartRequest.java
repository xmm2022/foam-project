/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.rose;

import java.io.Serializable;
import lombok.Generated;

public class RoseQrStartRequest
implements Serializable {
    private String app;
    private String embyPassword;

    @Generated
    public RoseQrStartRequest() {
    }

    @Generated
    public String getApp() {
        return this.app;
    }

    @Generated
    public String getEmbyPassword() {
        return this.embyPassword;
    }

    @Generated
    public void setApp(String app) {
        this.app = app;
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
        if (!(o instanceof RoseQrStartRequest)) {
            return false;
        }
        RoseQrStartRequest other = (RoseQrStartRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$app = this.getApp();
        String other$app = other.getApp();
        if (this$app == null ? other$app != null : !this$app.equals(other$app)) {
            return false;
        }
        String this$embyPassword = this.getEmbyPassword();
        String other$embyPassword = other.getEmbyPassword();
        return !(this$embyPassword == null ? other$embyPassword != null : !this$embyPassword.equals(other$embyPassword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseQrStartRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $app = this.getApp();
        result = result * 59 + ($app == null ? 43 : $app.hashCode());
        String $embyPassword = this.getEmbyPassword();
        result = result * 59 + ($embyPassword == null ? 43 : $embyPassword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseQrStartRequest(app=" + this.getApp() + ", embyPassword=" + this.getEmbyPassword() + ")";
    }
}
