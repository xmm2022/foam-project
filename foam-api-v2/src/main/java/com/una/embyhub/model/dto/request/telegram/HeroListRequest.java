/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import java.io.Serializable;
import lombok.Generated;

public class HeroListRequest
implements Serializable {
    private String timeWindow;
    private Integer page;

    @Generated
    public HeroListRequest() {
    }

    @Generated
    public String getTimeWindow() {
        return this.timeWindow;
    }

    @Generated
    public Integer getPage() {
        return this.page;
    }

    @Generated
    public void setTimeWindow(String timeWindow) {
        this.timeWindow = timeWindow;
    }

    @Generated
    public void setPage(Integer page) {
        this.page = page;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HeroListRequest)) {
            return false;
        }
        HeroListRequest other = (HeroListRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$page = this.getPage();
        Integer other$page = other.getPage();
        if (this$page == null ? other$page != null : !((Object)this$page).equals(other$page)) {
            return false;
        }
        String this$timeWindow = this.getTimeWindow();
        String other$timeWindow = other.getTimeWindow();
        return !(this$timeWindow == null ? other$timeWindow != null : !this$timeWindow.equals(other$timeWindow));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof HeroListRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        String $timeWindow = this.getTimeWindow();
        result = result * 59 + ($timeWindow == null ? 43 : $timeWindow.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "HeroListRequest(timeWindow=" + this.getTimeWindow() + ", page=" + this.getPage() + ")";
    }
}
