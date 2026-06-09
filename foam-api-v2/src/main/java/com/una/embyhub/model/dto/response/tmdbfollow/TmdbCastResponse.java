/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.tmdbfollow;

import java.io.Serializable;
import lombok.Generated;

public class TmdbCastResponse
implements Serializable {
    private String name;
    private String character;
    private String profilePath;
    private Integer order;

    @Generated
    public TmdbCastResponse() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getCharacter() {
        return this.character;
    }

    @Generated
    public String getProfilePath() {
        return this.profilePath;
    }

    @Generated
    public Integer getOrder() {
        return this.order;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setCharacter(String character) {
        this.character = character;
    }

    @Generated
    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    @Generated
    public void setOrder(Integer order) {
        this.order = order;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbCastResponse)) {
            return false;
        }
        TmdbCastResponse other = (TmdbCastResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$character = this.getCharacter();
        String other$character = other.getCharacter();
        if (this$character == null ? other$character != null : !this$character.equals(other$character)) {
            return false;
        }
        String this$profilePath = this.getProfilePath();
        String other$profilePath = other.getProfilePath();
        return !(this$profilePath == null ? other$profilePath != null : !this$profilePath.equals(other$profilePath));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbCastResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $character = this.getCharacter();
        result = result * 59 + ($character == null ? 43 : $character.hashCode());
        String $profilePath = this.getProfilePath();
        result = result * 59 + ($profilePath == null ? 43 : $profilePath.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbCastResponse(name=" + this.getName() + ", character=" + this.getCharacter() + ", profilePath=" + this.getProfilePath() + ", order=" + this.getOrder() + ")";
    }
}
