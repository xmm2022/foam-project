/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.invitation;

import java.io.Serializable;
import lombok.Generated;

public class InvitationCodeStatusResponse
implements Serializable {
    private Long allInvitationCodeCount;
    private Long availableInvitationCodeCount;
    private Long usedInvitationCodeCount;

    @Generated
    public InvitationCodeStatusResponse() {
    }

    @Generated
    public Long getAllInvitationCodeCount() {
        return this.allInvitationCodeCount;
    }

    @Generated
    public Long getAvailableInvitationCodeCount() {
        return this.availableInvitationCodeCount;
    }

    @Generated
    public Long getUsedInvitationCodeCount() {
        return this.usedInvitationCodeCount;
    }

    @Generated
    public void setAllInvitationCodeCount(Long allInvitationCodeCount) {
        this.allInvitationCodeCount = allInvitationCodeCount;
    }

    @Generated
    public void setAvailableInvitationCodeCount(Long availableInvitationCodeCount) {
        this.availableInvitationCodeCount = availableInvitationCodeCount;
    }

    @Generated
    public void setUsedInvitationCodeCount(Long usedInvitationCodeCount) {
        this.usedInvitationCodeCount = usedInvitationCodeCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvitationCodeStatusResponse)) {
            return false;
        }
        InvitationCodeStatusResponse other = (InvitationCodeStatusResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$allInvitationCodeCount = this.getAllInvitationCodeCount();
        Long other$allInvitationCodeCount = other.getAllInvitationCodeCount();
        if (this$allInvitationCodeCount == null ? other$allInvitationCodeCount != null : !((Object)this$allInvitationCodeCount).equals(other$allInvitationCodeCount)) {
            return false;
        }
        Long this$availableInvitationCodeCount = this.getAvailableInvitationCodeCount();
        Long other$availableInvitationCodeCount = other.getAvailableInvitationCodeCount();
        if (this$availableInvitationCodeCount == null ? other$availableInvitationCodeCount != null : !((Object)this$availableInvitationCodeCount).equals(other$availableInvitationCodeCount)) {
            return false;
        }
        Long this$usedInvitationCodeCount = this.getUsedInvitationCodeCount();
        Long other$usedInvitationCodeCount = other.getUsedInvitationCodeCount();
        return !(this$usedInvitationCodeCount == null ? other$usedInvitationCodeCount != null : !((Object)this$usedInvitationCodeCount).equals(other$usedInvitationCodeCount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InvitationCodeStatusResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $allInvitationCodeCount = this.getAllInvitationCodeCount();
        result = result * 59 + ($allInvitationCodeCount == null ? 43 : ((Object)$allInvitationCodeCount).hashCode());
        Long $availableInvitationCodeCount = this.getAvailableInvitationCodeCount();
        result = result * 59 + ($availableInvitationCodeCount == null ? 43 : ((Object)$availableInvitationCodeCount).hashCode());
        Long $usedInvitationCodeCount = this.getUsedInvitationCodeCount();
        result = result * 59 + ($usedInvitationCodeCount == null ? 43 : ((Object)$usedInvitationCodeCount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "InvitationCodeStatusResponse(allInvitationCodeCount=" + this.getAllInvitationCodeCount() + ", availableInvitationCodeCount=" + this.getAvailableInvitationCodeCount() + ", usedInvitationCodeCount=" + this.getUsedInvitationCodeCount() + ")";
    }
}
