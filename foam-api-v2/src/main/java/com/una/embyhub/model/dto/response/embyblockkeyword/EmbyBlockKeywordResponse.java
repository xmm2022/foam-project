/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyblockkeyword;

import java.util.Date;
import lombok.Generated;

public class EmbyBlockKeywordResponse {
    private Long id;
    private String keyword;
    private String description;
    private Integer enabled;
    private Date createDatetime;
    private Date updateDatetime;

    @Generated
    public EmbyBlockKeywordResponse() {
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
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
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyBlockKeywordResponse)) {
            return false;
        }
        EmbyBlockKeywordResponse other = (EmbyBlockKeywordResponse)o;
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
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        return !(this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyBlockKeywordResponse;
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
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyBlockKeywordResponse(id=" + this.getId() + ", keyword=" + this.getKeyword() + ", description=" + this.getDescription() + ", enabled=" + this.getEnabled() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ")";
    }
}
