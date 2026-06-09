/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.douban;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class DoubanHotRequest
implements Serializable {
    private String type = "movie";
    private String tag;
    @NotNull(message="\u9875\u7801\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u9875\u7801\u4e0d\u80fd\u4e3a\u7a7a") Integer page;
    private Integer pageSize;

    @Generated
    public DoubanHotRequest() {
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public String getTag() {
        return this.tag;
    }

    @Generated
    public Integer getPage() {
        return this.page;
    }

    @Generated
    public Integer getPageSize() {
        return this.pageSize;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Generated
    public void setPage(Integer page) {
        this.page = page;
    }

    @Generated
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DoubanHotRequest)) {
            return false;
        }
        DoubanHotRequest other = (DoubanHotRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$page = this.getPage();
        Integer other$page = other.getPage();
        if (this$page == null ? other$page != null : !((Object)this$page).equals(other$page)) {
            return false;
        }
        Integer this$pageSize = this.getPageSize();
        Integer other$pageSize = other.getPageSize();
        if (this$pageSize == null ? other$pageSize != null : !((Object)this$pageSize).equals(other$pageSize)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$tag = this.getTag();
        String other$tag = other.getTag();
        return !(this$tag == null ? other$tag != null : !this$tag.equals(other$tag));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DoubanHotRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        Integer $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : ((Object)$pageSize).hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $tag = this.getTag();
        result = result * 59 + ($tag == null ? 43 : $tag.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DoubanHotRequest(type=" + this.getType() + ", tag=" + this.getTag() + ", page=" + this.getPage() + ", pageSize=" + this.getPageSize() + ")";
    }
}
