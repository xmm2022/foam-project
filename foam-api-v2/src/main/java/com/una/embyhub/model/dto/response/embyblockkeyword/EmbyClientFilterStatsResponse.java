/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyblockkeyword;

import java.io.Serializable;
import lombok.Generated;

public class EmbyClientFilterStatsResponse
implements Serializable {
    private Boolean enabled;
    private Boolean blockUser;
    private Long customRuleCount;
    private Long enabledRuleCount;
    private Long interceptTotalCount;

    @Generated
    public EmbyClientFilterStatsResponse() {
    }

    @Generated
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Generated
    public Boolean getBlockUser() {
        return this.blockUser;
    }

    @Generated
    public Long getCustomRuleCount() {
        return this.customRuleCount;
    }

    @Generated
    public Long getEnabledRuleCount() {
        return this.enabledRuleCount;
    }

    @Generated
    public Long getInterceptTotalCount() {
        return this.interceptTotalCount;
    }

    @Generated
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setBlockUser(Boolean blockUser) {
        this.blockUser = blockUser;
    }

    @Generated
    public void setCustomRuleCount(Long customRuleCount) {
        this.customRuleCount = customRuleCount;
    }

    @Generated
    public void setEnabledRuleCount(Long enabledRuleCount) {
        this.enabledRuleCount = enabledRuleCount;
    }

    @Generated
    public void setInterceptTotalCount(Long interceptTotalCount) {
        this.interceptTotalCount = interceptTotalCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyClientFilterStatsResponse)) {
            return false;
        }
        EmbyClientFilterStatsResponse other = (EmbyClientFilterStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$enabled = this.getEnabled();
        Boolean other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Boolean this$blockUser = this.getBlockUser();
        Boolean other$blockUser = other.getBlockUser();
        if (this$blockUser == null ? other$blockUser != null : !((Object)this$blockUser).equals(other$blockUser)) {
            return false;
        }
        Long this$customRuleCount = this.getCustomRuleCount();
        Long other$customRuleCount = other.getCustomRuleCount();
        if (this$customRuleCount == null ? other$customRuleCount != null : !((Object)this$customRuleCount).equals(other$customRuleCount)) {
            return false;
        }
        Long this$enabledRuleCount = this.getEnabledRuleCount();
        Long other$enabledRuleCount = other.getEnabledRuleCount();
        if (this$enabledRuleCount == null ? other$enabledRuleCount != null : !((Object)this$enabledRuleCount).equals(other$enabledRuleCount)) {
            return false;
        }
        Long this$interceptTotalCount = this.getInterceptTotalCount();
        Long other$interceptTotalCount = other.getInterceptTotalCount();
        return !(this$interceptTotalCount == null ? other$interceptTotalCount != null : !((Object)this$interceptTotalCount).equals(other$interceptTotalCount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyClientFilterStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $blockUser = this.getBlockUser();
        result = result * 59 + ($blockUser == null ? 43 : ((Object)$blockUser).hashCode());
        Long $customRuleCount = this.getCustomRuleCount();
        result = result * 59 + ($customRuleCount == null ? 43 : ((Object)$customRuleCount).hashCode());
        Long $enabledRuleCount = this.getEnabledRuleCount();
        result = result * 59 + ($enabledRuleCount == null ? 43 : ((Object)$enabledRuleCount).hashCode());
        Long $interceptTotalCount = this.getInterceptTotalCount();
        result = result * 59 + ($interceptTotalCount == null ? 43 : ((Object)$interceptTotalCount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyClientFilterStatsResponse(enabled=" + this.getEnabled() + ", blockUser=" + this.getBlockUser() + ", customRuleCount=" + this.getCustomRuleCount() + ", enabledRuleCount=" + this.getEnabledRuleCount() + ", interceptTotalCount=" + this.getInterceptTotalCount() + ")";
    }
}
