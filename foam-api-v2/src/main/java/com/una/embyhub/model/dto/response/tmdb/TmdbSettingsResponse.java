/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.tmdb;

import java.io.Serializable;
import lombok.Generated;

public class TmdbSettingsResponse
implements Serializable {
    private String tmdbKey;

    @Generated
    public TmdbSettingsResponse() {
    }

    @Generated
    public String getTmdbKey() {
        return this.tmdbKey;
    }

    @Generated
    public void setTmdbKey(String tmdbKey) {
        this.tmdbKey = tmdbKey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbSettingsResponse)) {
            return false;
        }
        TmdbSettingsResponse other = (TmdbSettingsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$tmdbKey = this.getTmdbKey();
        String other$tmdbKey = other.getTmdbKey();
        return !(this$tmdbKey == null ? other$tmdbKey != null : !this$tmdbKey.equals(other$tmdbKey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbSettingsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $tmdbKey = this.getTmdbKey();
        result = result * 59 + ($tmdbKey == null ? 43 : $tmdbKey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbSettingsResponse(tmdbKey=" + this.getTmdbKey() + ")";
    }
}
