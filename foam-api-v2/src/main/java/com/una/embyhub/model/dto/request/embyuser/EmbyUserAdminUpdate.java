/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class EmbyUserAdminUpdate
implements Serializable {
    @NotNull(message="\u7528\u6237id\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u7528\u6237id\u4e0d\u80fd\u4e3a\u7a7a") Long userId;
    @NotNull(message="\u7ba1\u7406\u5458\u72b6\u6001\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u7ba1\u7406\u5458\u72b6\u6001\u4e0d\u80fd\u4e3a\u7a7a") Integer isAdmin;

    @Generated
    public EmbyUserAdminUpdate() {
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserAdminUpdate)) {
            return false;
        }
        EmbyUserAdminUpdate other = (EmbyUserAdminUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$isAdmin = this.getIsAdmin();
        Integer other$isAdmin = other.getIsAdmin();
        return !(this$isAdmin == null ? other$isAdmin != null : !((Object)this$isAdmin).equals(other$isAdmin));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserAdminUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $isAdmin = this.getIsAdmin();
        result = result * 59 + ($isAdmin == null ? 43 : ((Object)$isAdmin).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserAdminUpdate(userId=" + this.getUserId() + ", isAdmin=" + this.getIsAdmin() + ")";
    }
}
