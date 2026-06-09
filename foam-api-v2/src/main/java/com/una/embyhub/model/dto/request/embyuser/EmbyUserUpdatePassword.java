/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import java.io.Serializable;
import lombok.Generated;

public class EmbyUserUpdatePassword
implements Serializable {
    private Long id;
    private String oldPassword;
    private String embyUserPassword;

    @Generated
    public EmbyUserUpdatePassword() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getOldPassword() {
        return this.oldPassword;
    }

    @Generated
    public String getEmbyUserPassword() {
        return this.embyUserPassword;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    @Generated
    public void setEmbyUserPassword(String embyUserPassword) {
        this.embyUserPassword = embyUserPassword;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserUpdatePassword)) {
            return false;
        }
        EmbyUserUpdatePassword other = (EmbyUserUpdatePassword)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$oldPassword = this.getOldPassword();
        String other$oldPassword = other.getOldPassword();
        if (this$oldPassword == null ? other$oldPassword != null : !this$oldPassword.equals(other$oldPassword)) {
            return false;
        }
        String this$embyUserPassword = this.getEmbyUserPassword();
        String other$embyUserPassword = other.getEmbyUserPassword();
        return !(this$embyUserPassword == null ? other$embyUserPassword != null : !this$embyUserPassword.equals(other$embyUserPassword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserUpdatePassword;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $oldPassword = this.getOldPassword();
        result = result * 59 + ($oldPassword == null ? 43 : $oldPassword.hashCode());
        String $embyUserPassword = this.getEmbyUserPassword();
        result = result * 59 + ($embyUserPassword == null ? 43 : $embyUserPassword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserUpdatePassword(id=" + this.getId() + ", oldPassword=" + this.getOldPassword() + ", embyUserPassword=" + this.getEmbyUserPassword() + ")";
    }
}
