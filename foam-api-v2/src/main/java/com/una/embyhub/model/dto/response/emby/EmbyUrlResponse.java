/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import lombok.Generated;

public class EmbyUrlResponse
implements Serializable {
    private String url;
    private String serverId;

    @Generated
    public EmbyUrlResponse() {
    }

    @Generated
    public String getUrl() {
        return this.url;
    }

    @Generated
    public String getServerId() {
        return this.serverId;
    }

    @Generated
    public void setUrl(String url) {
        this.url = url;
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
        if (!(o instanceof EmbyUrlResponse)) {
            return false;
        }
        EmbyUrlResponse other = (EmbyUrlResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String this$serverId = this.getServerId();
        String other$serverId = other.getServerId();
        return !(this$serverId == null ? other$serverId != null : !this$serverId.equals(other$serverId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUrlResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $serverId = this.getServerId();
        result = result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUrlResponse(url=" + this.getUrl() + ", serverId=" + this.getServerId() + ")";
    }
}
