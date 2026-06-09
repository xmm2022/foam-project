/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playrecords;

import lombok.Generated;

public class PlayCountSummary {
    private String content;
    private Long playCount;

    @Generated
    public PlayCountSummary() {
    }

    @Generated
    public String getContent() {
        return this.content;
    }

    @Generated
    public Long getPlayCount() {
        return this.playCount;
    }

    @Generated
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public void setPlayCount(Long playCount) {
        this.playCount = playCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayCountSummary)) {
            return false;
        }
        PlayCountSummary other = (PlayCountSummary)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$playCount = this.getPlayCount();
        Long other$playCount = other.getPlayCount();
        if (this$playCount == null ? other$playCount != null : !((Object)this$playCount).equals(other$playCount)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        return !(this$content == null ? other$content != null : !this$content.equals(other$content));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlayCountSummary;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $playCount = this.getPlayCount();
        result = result * 59 + ($playCount == null ? 43 : ((Object)$playCount).hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PlayCountSummary(content=" + this.getContent() + ", playCount=" + this.getPlayCount() + ")";
    }
}
