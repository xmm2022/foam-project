/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydata;

import java.io.Serializable;
import lombok.Generated;

public class DingDingResponse
implements Serializable {
    private String accessToken;
    private String secret;

    @Generated
    public DingDingResponse() {
    }

    @Generated
    public String getAccessToken() {
        return this.accessToken;
    }

    @Generated
    public String getSecret() {
        return this.secret;
    }

    @Generated
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Generated
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DingDingResponse)) {
            return false;
        }
        DingDingResponse other = (DingDingResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$accessToken = this.getAccessToken();
        String other$accessToken = other.getAccessToken();
        if (this$accessToken == null ? other$accessToken != null : !this$accessToken.equals(other$accessToken)) {
            return false;
        }
        String this$secret = this.getSecret();
        String other$secret = other.getSecret();
        return !(this$secret == null ? other$secret != null : !this$secret.equals(other$secret));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DingDingResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $accessToken = this.getAccessToken();
        result = result * 59 + ($accessToken == null ? 43 : $accessToken.hashCode());
        String $secret = this.getSecret();
        result = result * 59 + ($secret == null ? 43 : $secret.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DingDingResponse(accessToken=" + this.getAccessToken() + ", secret=" + this.getSecret() + ")";
    }
}
