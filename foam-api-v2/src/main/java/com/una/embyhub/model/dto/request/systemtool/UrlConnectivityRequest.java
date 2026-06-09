/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.systemtool;

import java.util.List;
import lombok.Generated;

public class UrlConnectivityRequest {
    private List<String> urls;

    @Generated
    public UrlConnectivityRequest() {
    }

    @Generated
    public List<String> getUrls() {
        return this.urls;
    }

    @Generated
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UrlConnectivityRequest)) {
            return false;
        }
        UrlConnectivityRequest other = (UrlConnectivityRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<String> this$urls = this.getUrls();
        List<String> other$urls = other.getUrls();
        return !(this$urls == null ? other$urls != null : !((Object)this$urls).equals(other$urls));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UrlConnectivityRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<String> $urls = this.getUrls();
        result = result * 59 + ($urls == null ? 43 : ((Object)$urls).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UrlConnectivityRequest(urls=" + String.valueOf(this.getUrls()) + ")";
    }
}
