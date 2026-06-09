/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyinfo;

import java.io.Serializable;
import lombok.Generated;

public class EmbyInfoUserOptionResponse
implements Serializable {
    private String id;
    private String name;
    private String avatarUrl;

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Generated
    public void setId(String id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyInfoUserOptionResponse)) {
            return false;
        }
        EmbyInfoUserOptionResponse other = (EmbyInfoUserOptionResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$avatarUrl = this.getAvatarUrl();
        String other$avatarUrl = other.getAvatarUrl();
        return !(this$avatarUrl == null ? other$avatarUrl != null : !this$avatarUrl.equals(other$avatarUrl));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyInfoUserOptionResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $avatarUrl = this.getAvatarUrl();
        result = result * 59 + ($avatarUrl == null ? 43 : $avatarUrl.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyInfoUserOptionResponse(id=" + this.getId() + ", name=" + this.getName() + ", avatarUrl=" + this.getAvatarUrl() + ")";
    }

    @Generated
    public EmbyInfoUserOptionResponse() {
    }

    @Generated
    public EmbyInfoUserOptionResponse(String id, String name, String avatarUrl) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
    }
}
