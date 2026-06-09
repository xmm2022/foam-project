/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotEmpty
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Generated;

public class InsertUserCardRequest
implements Serializable {
    private String cardPassword;
    private String remarks;
    private String password;
    @NotEmpty(message="emby\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="emby\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a") String embyUserName;

    @Generated
    public InsertUserCardRequest() {
    }

    @Generated
    public String getCardPassword() {
        return this.cardPassword;
    }

    @Generated
    public String getRemarks() {
        return this.remarks;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Generated
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InsertUserCardRequest)) {
            return false;
        }
        InsertUserCardRequest other = (InsertUserCardRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$cardPassword = this.getCardPassword();
        String other$cardPassword = other.getCardPassword();
        if (this$cardPassword == null ? other$cardPassword != null : !this$cardPassword.equals(other$cardPassword)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$password = this.getPassword();
        String other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        return !(this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InsertUserCardRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $cardPassword = this.getCardPassword();
        result = result * 59 + ($cardPassword == null ? 43 : $cardPassword.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "InsertUserCardRequest(cardPassword=" + this.getCardPassword() + ", remarks=" + this.getRemarks() + ", password=" + this.getPassword() + ", embyUserName=" + this.getEmbyUserName() + ")";
    }
}
