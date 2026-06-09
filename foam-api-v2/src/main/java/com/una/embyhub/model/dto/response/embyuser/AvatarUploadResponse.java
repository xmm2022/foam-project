/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import java.io.Serializable;
import lombok.Generated;

public class AvatarUploadResponse
implements Serializable {
    private String url;
    private String fileName;

    @Generated
    public AvatarUploadResponse() {
    }

    @Generated
    public String getUrl() {
        return this.url;
    }

    @Generated
    public String getFileName() {
        return this.fileName;
    }

    @Generated
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AvatarUploadResponse)) {
            return false;
        }
        AvatarUploadResponse other = (AvatarUploadResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String this$fileName = this.getFileName();
        String other$fileName = other.getFileName();
        return !(this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AvatarUploadResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $fileName = this.getFileName();
        result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AvatarUploadResponse(url=" + this.getUrl() + ", fileName=" + this.getFileName() + ")";
    }
}
