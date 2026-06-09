/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.docker;

import java.io.Serializable;
import lombok.Generated;

public class DockerImageVersionResponse
implements Serializable {
    private String image;
    private String currentVersion;
    private String latestVersion;

    @Generated
    public DockerImageVersionResponse() {
    }

    @Generated
    public String getImage() {
        return this.image;
    }

    @Generated
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    @Generated
    public String getLatestVersion() {
        return this.latestVersion;
    }

    @Generated
    public void setImage(String image) {
        this.image = image;
    }

    @Generated
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Generated
    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DockerImageVersionResponse)) {
            return false;
        }
        DockerImageVersionResponse other = (DockerImageVersionResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$image = this.getImage();
        String other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) {
            return false;
        }
        String this$currentVersion = this.getCurrentVersion();
        String other$currentVersion = other.getCurrentVersion();
        if (this$currentVersion == null ? other$currentVersion != null : !this$currentVersion.equals(other$currentVersion)) {
            return false;
        }
        String this$latestVersion = this.getLatestVersion();
        String other$latestVersion = other.getLatestVersion();
        return !(this$latestVersion == null ? other$latestVersion != null : !this$latestVersion.equals(other$latestVersion));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DockerImageVersionResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $image = this.getImage();
        result = result * 59 + ($image == null ? 43 : $image.hashCode());
        String $currentVersion = this.getCurrentVersion();
        result = result * 59 + ($currentVersion == null ? 43 : $currentVersion.hashCode());
        String $latestVersion = this.getLatestVersion();
        result = result * 59 + ($latestVersion == null ? 43 : $latestVersion.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DockerImageVersionResponse(image=" + this.getImage() + ", currentVersion=" + this.getCurrentVersion() + ", latestVersion=" + this.getLatestVersion() + ")";
    }
}
