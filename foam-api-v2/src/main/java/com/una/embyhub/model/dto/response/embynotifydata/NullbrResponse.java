/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydata;

import java.io.Serializable;
import lombok.Generated;

public class NullbrResponse
implements Serializable {
    private String appid;
    private String apikey;

    @Generated
    public NullbrResponse() {
    }

    @Generated
    public String getAppid() {
        return this.appid;
    }

    @Generated
    public String getApikey() {
        return this.apikey;
    }

    @Generated
    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Generated
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NullbrResponse)) {
            return false;
        }
        NullbrResponse other = (NullbrResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$appid = this.getAppid();
        String other$appid = other.getAppid();
        if (this$appid == null ? other$appid != null : !this$appid.equals(other$appid)) {
            return false;
        }
        String this$apikey = this.getApikey();
        String other$apikey = other.getApikey();
        return !(this$apikey == null ? other$apikey != null : !this$apikey.equals(other$apikey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof NullbrResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $appid = this.getAppid();
        result = result * 59 + ($appid == null ? 43 : $appid.hashCode());
        String $apikey = this.getApikey();
        result = result * 59 + ($apikey == null ? 43 : $apikey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "NullbrResponse(appid=" + this.getAppid() + ", apikey=" + this.getApikey() + ")";
    }
}
