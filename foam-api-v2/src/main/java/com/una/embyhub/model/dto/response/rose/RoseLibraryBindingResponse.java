/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.rose;

import java.io.Serializable;
import lombok.Generated;

public class RoseLibraryBindingResponse
implements Serializable {
    private String libraryKey;
    private String name;
    private String targetRoot;
    private String targetRootName;
    private String targetRootPath;
    private Boolean enabled;

    @Generated
    public RoseLibraryBindingResponse() {
    }

    @Generated
    public String getLibraryKey() {
        return this.libraryKey;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getTargetRoot() {
        return this.targetRoot;
    }

    @Generated
    public String getTargetRootName() {
        return this.targetRootName;
    }

    @Generated
    public String getTargetRootPath() {
        return this.targetRootPath;
    }

    @Generated
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Generated
    public void setLibraryKey(String libraryKey) {
        this.libraryKey = libraryKey;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setTargetRoot(String targetRoot) {
        this.targetRoot = targetRoot;
    }

    @Generated
    public void setTargetRootName(String targetRootName) {
        this.targetRootName = targetRootName;
    }

    @Generated
    public void setTargetRootPath(String targetRootPath) {
        this.targetRootPath = targetRootPath;
    }

    @Generated
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RoseLibraryBindingResponse)) {
            return false;
        }
        RoseLibraryBindingResponse other = (RoseLibraryBindingResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$enabled = this.getEnabled();
        Boolean other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$libraryKey = this.getLibraryKey();
        String other$libraryKey = other.getLibraryKey();
        if (this$libraryKey == null ? other$libraryKey != null : !this$libraryKey.equals(other$libraryKey)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$targetRoot = this.getTargetRoot();
        String other$targetRoot = other.getTargetRoot();
        if (this$targetRoot == null ? other$targetRoot != null : !this$targetRoot.equals(other$targetRoot)) {
            return false;
        }
        String this$targetRootName = this.getTargetRootName();
        String other$targetRootName = other.getTargetRootName();
        if (this$targetRootName == null ? other$targetRootName != null : !this$targetRootName.equals(other$targetRootName)) {
            return false;
        }
        String this$targetRootPath = this.getTargetRootPath();
        String other$targetRootPath = other.getTargetRootPath();
        return !(this$targetRootPath == null ? other$targetRootPath != null : !this$targetRootPath.equals(other$targetRootPath));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RoseLibraryBindingResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $libraryKey = this.getLibraryKey();
        result = result * 59 + ($libraryKey == null ? 43 : $libraryKey.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $targetRoot = this.getTargetRoot();
        result = result * 59 + ($targetRoot == null ? 43 : $targetRoot.hashCode());
        String $targetRootName = this.getTargetRootName();
        result = result * 59 + ($targetRootName == null ? 43 : $targetRootName.hashCode());
        String $targetRootPath = this.getTargetRootPath();
        result = result * 59 + ($targetRootPath == null ? 43 : $targetRootPath.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RoseLibraryBindingResponse(libraryKey=" + this.getLibraryKey() + ", name=" + this.getName() + ", targetRoot=" + this.getTargetRoot() + ", targetRootName=" + this.getTargetRootName() + ", targetRootPath=" + this.getTargetRootPath() + ", enabled=" + this.getEnabled() + ")";
    }
}
