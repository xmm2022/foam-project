/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import java.io.Serializable;
import lombok.Generated;

public class EmbyUserUpdate
implements Serializable {
    private Long id;
    private String embyUserPassword;
    private String remarks;
    private Integer requestPackagesCount;

    @Generated
    public EmbyUserUpdate() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getEmbyUserPassword() {
        return this.embyUserPassword;
    }

    @Generated
    public String getRemarks() {
        return this.remarks;
    }

    @Generated
    public Integer getRequestPackagesCount() {
        return this.requestPackagesCount;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyUserPassword(String embyUserPassword) {
        this.embyUserPassword = embyUserPassword;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Generated
    public void setRequestPackagesCount(Integer requestPackagesCount) {
        this.requestPackagesCount = requestPackagesCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserUpdate)) {
            return false;
        }
        EmbyUserUpdate other = (EmbyUserUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$requestPackagesCount = this.getRequestPackagesCount();
        Integer other$requestPackagesCount = other.getRequestPackagesCount();
        if (this$requestPackagesCount == null ? other$requestPackagesCount != null : !((Object)this$requestPackagesCount).equals(other$requestPackagesCount)) {
            return false;
        }
        String this$embyUserPassword = this.getEmbyUserPassword();
        String other$embyUserPassword = other.getEmbyUserPassword();
        if (this$embyUserPassword == null ? other$embyUserPassword != null : !this$embyUserPassword.equals(other$embyUserPassword)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        return !(this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $requestPackagesCount = this.getRequestPackagesCount();
        result = result * 59 + ($requestPackagesCount == null ? 43 : ((Object)$requestPackagesCount).hashCode());
        String $embyUserPassword = this.getEmbyUserPassword();
        result = result * 59 + ($embyUserPassword == null ? 43 : $embyUserPassword.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserUpdate(id=" + this.getId() + ", embyUserPassword=" + this.getEmbyUserPassword() + ", remarks=" + this.getRemarks() + ", requestPackagesCount=" + this.getRequestPackagesCount() + ")";
    }
}
