/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import java.util.List;
import lombok.Generated;

public class PublisherInfoRequest {
    private long id;
    private String name;
    private String logo_path;
    private List<String> searchNames;

    @Generated
    public long getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getLogo_path() {
        return this.logo_path;
    }

    @Generated
    public List<String> getSearchNames() {
        return this.searchNames;
    }

    @Generated
    public void setId(long id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
    }

    @Generated
    public void setSearchNames(List<String> searchNames) {
        this.searchNames = searchNames;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PublisherInfoRequest)) {
            return false;
        }
        PublisherInfoRequest other = (PublisherInfoRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$logo_path = this.getLogo_path();
        String other$logo_path = other.getLogo_path();
        if (this$logo_path == null ? other$logo_path != null : !this$logo_path.equals(other$logo_path)) {
            return false;
        }
        List<String> this$searchNames = this.getSearchNames();
        List<String> other$searchNames = other.getSearchNames();
        return !(this$searchNames == null ? other$searchNames != null : !((Object)this$searchNames).equals(other$searchNames));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PublisherInfoRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $id = this.getId();
        result = result * 59 + (int)($id >>> 32 ^ $id);
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $logo_path = this.getLogo_path();
        result = result * 59 + ($logo_path == null ? 43 : $logo_path.hashCode());
        List<String> $searchNames = this.getSearchNames();
        result = result * 59 + ($searchNames == null ? 43 : ((Object)$searchNames).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PublisherInfoRequest(id=" + this.getId() + ", name=" + this.getName() + ", logo_path=" + this.getLogo_path() + ", searchNames=" + String.valueOf(this.getSearchNames()) + ")";
    }

    @Generated
    public PublisherInfoRequest() {
    }

    @Generated
    public PublisherInfoRequest(long id, String name, String logo_path, List<String> searchNames) {
        this.id = id;
        this.name = name;
        this.logo_path = logo_path;
        this.searchNames = searchNames;
    }
}
