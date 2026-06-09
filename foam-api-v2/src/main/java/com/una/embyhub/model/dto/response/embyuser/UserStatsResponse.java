/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import java.io.Serializable;
import lombok.Generated;

public class UserStatsResponse
implements Serializable {
    private Long allUserCount;
    private Long activeUserCount;
    private Long inactiveUserCount;
    private Long expiringSoonUserCount;

    @Generated
    public UserStatsResponse() {
    }

    @Generated
    public Long getAllUserCount() {
        return this.allUserCount;
    }

    @Generated
    public Long getActiveUserCount() {
        return this.activeUserCount;
    }

    @Generated
    public Long getInactiveUserCount() {
        return this.inactiveUserCount;
    }

    @Generated
    public Long getExpiringSoonUserCount() {
        return this.expiringSoonUserCount;
    }

    @Generated
    public void setAllUserCount(Long allUserCount) {
        this.allUserCount = allUserCount;
    }

    @Generated
    public void setActiveUserCount(Long activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    @Generated
    public void setInactiveUserCount(Long inactiveUserCount) {
        this.inactiveUserCount = inactiveUserCount;
    }

    @Generated
    public void setExpiringSoonUserCount(Long expiringSoonUserCount) {
        this.expiringSoonUserCount = expiringSoonUserCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserStatsResponse)) {
            return false;
        }
        UserStatsResponse other = (UserStatsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$allUserCount = this.getAllUserCount();
        Long other$allUserCount = other.getAllUserCount();
        if (this$allUserCount == null ? other$allUserCount != null : !((Object)this$allUserCount).equals(other$allUserCount)) {
            return false;
        }
        Long this$activeUserCount = this.getActiveUserCount();
        Long other$activeUserCount = other.getActiveUserCount();
        if (this$activeUserCount == null ? other$activeUserCount != null : !((Object)this$activeUserCount).equals(other$activeUserCount)) {
            return false;
        }
        Long this$inactiveUserCount = this.getInactiveUserCount();
        Long other$inactiveUserCount = other.getInactiveUserCount();
        if (this$inactiveUserCount == null ? other$inactiveUserCount != null : !((Object)this$inactiveUserCount).equals(other$inactiveUserCount)) {
            return false;
        }
        Long this$expiringSoonUserCount = this.getExpiringSoonUserCount();
        Long other$expiringSoonUserCount = other.getExpiringSoonUserCount();
        return !(this$expiringSoonUserCount == null ? other$expiringSoonUserCount != null : !((Object)this$expiringSoonUserCount).equals(other$expiringSoonUserCount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserStatsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $allUserCount = this.getAllUserCount();
        result = result * 59 + ($allUserCount == null ? 43 : ((Object)$allUserCount).hashCode());
        Long $activeUserCount = this.getActiveUserCount();
        result = result * 59 + ($activeUserCount == null ? 43 : ((Object)$activeUserCount).hashCode());
        Long $inactiveUserCount = this.getInactiveUserCount();
        result = result * 59 + ($inactiveUserCount == null ? 43 : ((Object)$inactiveUserCount).hashCode());
        Long $expiringSoonUserCount = this.getExpiringSoonUserCount();
        result = result * 59 + ($expiringSoonUserCount == null ? 43 : ((Object)$expiringSoonUserCount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserStatsResponse(allUserCount=" + this.getAllUserCount() + ", activeUserCount=" + this.getActiveUserCount() + ", inactiveUserCount=" + this.getInactiveUserCount() + ", expiringSoonUserCount=" + this.getExpiringSoonUserCount() + ")";
    }
}
