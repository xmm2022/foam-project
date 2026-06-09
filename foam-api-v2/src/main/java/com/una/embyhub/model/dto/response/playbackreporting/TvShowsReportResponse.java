/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playbackreporting;

import java.io.Serializable;
import lombok.Generated;

public class TvShowsReportResponse
implements Serializable {
    private String label;
    private Integer count;
    private Integer time;

    @Generated
    public TvShowsReportResponse() {
    }

    @Generated
    public String getLabel() {
        return this.label;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public Integer getTime() {
        return this.time;
    }

    @Generated
    public void setLabel(String label) {
        this.label = label;
    }

    @Generated
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated
    public void setTime(Integer time) {
        this.time = time;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TvShowsReportResponse)) {
            return false;
        }
        TvShowsReportResponse other = (TvShowsReportResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$count = this.getCount();
        Integer other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
            return false;
        }
        Integer this$time = this.getTime();
        Integer other$time = other.getTime();
        if (this$time == null ? other$time != null : !((Object)this$time).equals(other$time)) {
            return false;
        }
        String this$label = this.getLabel();
        String other$label = other.getLabel();
        return !(this$label == null ? other$label != null : !this$label.equals(other$label));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TvShowsReportResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        Integer $time = this.getTime();
        result = result * 59 + ($time == null ? 43 : ((Object)$time).hashCode());
        String $label = this.getLabel();
        result = result * 59 + ($label == null ? 43 : $label.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TvShowsReportResponse(label=" + this.getLabel() + ", count=" + this.getCount() + ", time=" + this.getTime() + ")";
    }
}
