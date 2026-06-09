/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import lombok.Generated;

public class GetEmbyUrlResponse
implements Serializable {
    private String embyItemUrl;

    @Generated
    public GetEmbyUrlResponse() {
    }

    @Generated
    public String getEmbyItemUrl() {
        return this.embyItemUrl;
    }

    @Generated
    public void setEmbyItemUrl(String embyItemUrl) {
        this.embyItemUrl = embyItemUrl;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetEmbyUrlResponse)) {
            return false;
        }
        GetEmbyUrlResponse other = (GetEmbyUrlResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$embyItemUrl = this.getEmbyItemUrl();
        String other$embyItemUrl = other.getEmbyItemUrl();
        return !(this$embyItemUrl == null ? other$embyItemUrl != null : !this$embyItemUrl.equals(other$embyItemUrl));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof GetEmbyUrlResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $embyItemUrl = this.getEmbyItemUrl();
        result = result * 59 + ($embyItemUrl == null ? 43 : $embyItemUrl.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "GetEmbyUrlResponse(embyItemUrl=" + this.getEmbyItemUrl() + ")";
    }
}
