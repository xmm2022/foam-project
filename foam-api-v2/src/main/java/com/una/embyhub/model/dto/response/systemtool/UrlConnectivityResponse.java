/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.systemtool;

import lombok.Generated;

public class UrlConnectivityResponse {
    private String url;
    private boolean success;
    private Long durationMs;
    private String errorMessage;

    @Generated
    public UrlConnectivityResponse() {
    }

    @Generated
    public String getUrl() {
        return this.url;
    }

    @Generated
    public boolean isSuccess() {
        return this.success;
    }

    @Generated
    public Long getDurationMs() {
        return this.durationMs;
    }

    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Generated
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Generated
    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    @Generated
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UrlConnectivityResponse)) {
            return false;
        }
        UrlConnectivityResponse other = (UrlConnectivityResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isSuccess() != other.isSuccess()) {
            return false;
        }
        Long this$durationMs = this.getDurationMs();
        Long other$durationMs = other.getDurationMs();
        if (this$durationMs == null ? other$durationMs != null : !((Object)this$durationMs).equals(other$durationMs)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String this$errorMessage = this.getErrorMessage();
        String other$errorMessage = other.getErrorMessage();
        return !(this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UrlConnectivityResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        Long $durationMs = this.getDurationMs();
        result = result * 59 + ($durationMs == null ? 43 : ((Object)$durationMs).hashCode());
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $errorMessage = this.getErrorMessage();
        result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UrlConnectivityResponse(url=" + this.getUrl() + ", success=" + this.isSuccess() + ", durationMs=" + this.getDurationMs() + ", errorMessage=" + this.getErrorMessage() + ")";
    }
}
