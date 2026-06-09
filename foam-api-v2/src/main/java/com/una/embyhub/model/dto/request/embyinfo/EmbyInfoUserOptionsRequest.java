/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyinfo;

import java.io.Serializable;
import lombok.Generated;

public class EmbyInfoUserOptionsRequest
implements Serializable {
    private String embyUrl;
    private String embyApikey;

    @Generated
    public EmbyInfoUserOptionsRequest() {
    }

    @Generated
    public String getEmbyUrl() {
        return this.embyUrl;
    }

    @Generated
    public String getEmbyApikey() {
        return this.embyApikey;
    }

    @Generated
    public void setEmbyUrl(String embyUrl) {
        this.embyUrl = embyUrl;
    }

    @Generated
    public void setEmbyApikey(String embyApikey) {
        this.embyApikey = embyApikey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyInfoUserOptionsRequest)) {
            return false;
        }
        EmbyInfoUserOptionsRequest other = (EmbyInfoUserOptionsRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$embyUrl = this.getEmbyUrl();
        String other$embyUrl = other.getEmbyUrl();
        if (this$embyUrl == null ? other$embyUrl != null : !this$embyUrl.equals(other$embyUrl)) {
            return false;
        }
        String this$embyApikey = this.getEmbyApikey();
        String other$embyApikey = other.getEmbyApikey();
        return !(this$embyApikey == null ? other$embyApikey != null : !this$embyApikey.equals(other$embyApikey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyInfoUserOptionsRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $embyUrl = this.getEmbyUrl();
        result = result * 59 + ($embyUrl == null ? 43 : $embyUrl.hashCode());
        String $embyApikey = this.getEmbyApikey();
        result = result * 59 + ($embyApikey == null ? 43 : $embyApikey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyInfoUserOptionsRequest(embyUrl=" + this.getEmbyUrl() + ", embyApikey=" + this.getEmbyApikey() + ")";
    }
}
