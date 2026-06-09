/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyblockkeyword;

import lombok.Generated;

public class EmbyBlockKeywordRequest {
    private Long id;
    private String keyword;
    private String description;
    private Integer enabled;

    @Generated
    public EmbyBlockKeywordRequest() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getKeyword() {
        return this.keyword;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyBlockKeywordRequest)) {
            return false;
        }
        EmbyBlockKeywordRequest other = (EmbyBlockKeywordRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$keyword = this.getKeyword();
        String other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        return !(this$description == null ? other$description != null : !this$description.equals(other$description));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyBlockKeywordRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $keyword = this.getKeyword();
        result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyBlockKeywordRequest(id=" + this.getId() + ", keyword=" + this.getKeyword() + ", description=" + this.getDescription() + ", enabled=" + this.getEnabled() + ")";
    }
}
