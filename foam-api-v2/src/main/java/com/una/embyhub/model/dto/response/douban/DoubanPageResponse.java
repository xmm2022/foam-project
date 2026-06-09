/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.douban;

import com.una.embyhub.model.dto.response.douban.DoubanSimpleSubjectResponse;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class DoubanPageResponse
implements Serializable {
    private Integer page;
    private Integer pageSize;
    private Long total;
    private List<DoubanSimpleSubjectResponse> items;

    @Generated
    public DoubanPageResponse() {
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
    public Long getTotal() {
        return this.total;
    }

    @Generated
    public List<DoubanSimpleSubjectResponse> getItems() {
        return this.items;
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
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated
    public void setItems(List<DoubanSimpleSubjectResponse> items) {
        this.items = items;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DoubanPageResponse)) {
            return false;
        }
        DoubanPageResponse other = (DoubanPageResponse)o;
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
        Long this$total = this.getTotal();
        Long other$total = other.getTotal();
        if (this$total == null ? other$total != null : !((Object)this$total).equals(other$total)) {
            return false;
        }
        List<DoubanSimpleSubjectResponse> this$items = this.getItems();
        List<DoubanSimpleSubjectResponse> other$items = other.getItems();
        return !(this$items == null ? other$items != null : !((Object)this$items).equals(other$items));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DoubanPageResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        Integer $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : ((Object)$pageSize).hashCode());
        Long $total = this.getTotal();
        result = result * 59 + ($total == null ? 43 : ((Object)$total).hashCode());
        List<DoubanSimpleSubjectResponse> $items = this.getItems();
        result = result * 59 + ($items == null ? 43 : ((Object)$items).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DoubanPageResponse(page=" + this.getPage() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", items=" + String.valueOf(this.getItems()) + ")";
    }
}
