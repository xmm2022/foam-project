/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.invitation;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class InvitationRegisterRequest
implements Serializable {
    private String invitationCode;
    private String embyUserName;
    private String embyUserPassword;
    private String remarks;
    private Date expirationDate;
    private Integer requestPackagesCount;
    private String email;
    private String mobile;
    private String gender;
    private Date birthday;
    private String interests;
    private String clientIp;

    @Generated
    public InvitationRegisterRequest() {
    }

    @Generated
    public String getInvitationCode() {
        return this.invitationCode;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
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
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Generated
    public Integer getRequestPackagesCount() {
        return this.requestPackagesCount;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getMobile() {
        return this.mobile;
    }

    @Generated
    public String getGender() {
        return this.gender;
    }

    @Generated
    public Date getBirthday() {
        return this.birthday;
    }

    @Generated
    public String getInterests() {
        return this.interests;
    }

    @Generated
    public String getClientIp() {
        return this.clientIp;
    }

    @Generated
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
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
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Generated
    public void setRequestPackagesCount(Integer requestPackagesCount) {
        this.requestPackagesCount = requestPackagesCount;
    }

    @Generated
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Generated
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Generated
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Generated
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Generated
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvitationRegisterRequest)) {
            return false;
        }
        InvitationRegisterRequest other = (InvitationRegisterRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$requestPackagesCount = this.getRequestPackagesCount();
        Integer other$requestPackagesCount = other.getRequestPackagesCount();
        if (this$requestPackagesCount == null ? other$requestPackagesCount != null : !((Object)this$requestPackagesCount).equals(other$requestPackagesCount)) {
            return false;
        }
        String this$invitationCode = this.getInvitationCode();
        String other$invitationCode = other.getInvitationCode();
        if (this$invitationCode == null ? other$invitationCode != null : !this$invitationCode.equals(other$invitationCode)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$embyUserPassword = this.getEmbyUserPassword();
        String other$embyUserPassword = other.getEmbyUserPassword();
        if (this$embyUserPassword == null ? other$embyUserPassword != null : !this$embyUserPassword.equals(other$embyUserPassword)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        Date this$expirationDate = this.getExpirationDate();
        Date other$expirationDate = other.getExpirationDate();
        if (this$expirationDate == null ? other$expirationDate != null : !((Object)this$expirationDate).equals(other$expirationDate)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
            return false;
        }
        String this$gender = this.getGender();
        String other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) {
            return false;
        }
        Date this$birthday = this.getBirthday();
        Date other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !((Object)this$birthday).equals(other$birthday)) {
            return false;
        }
        String this$interests = this.getInterests();
        String other$interests = other.getInterests();
        if (this$interests == null ? other$interests != null : !this$interests.equals(other$interests)) {
            return false;
        }
        String this$clientIp = this.getClientIp();
        String other$clientIp = other.getClientIp();
        return !(this$clientIp == null ? other$clientIp != null : !this$clientIp.equals(other$clientIp));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InvitationRegisterRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $requestPackagesCount = this.getRequestPackagesCount();
        result = result * 59 + ($requestPackagesCount == null ? 43 : ((Object)$requestPackagesCount).hashCode());
        String $invitationCode = this.getInvitationCode();
        result = result * 59 + ($invitationCode == null ? 43 : $invitationCode.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $embyUserPassword = this.getEmbyUserPassword();
        result = result * 59 + ($embyUserPassword == null ? 43 : $embyUserPassword.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
        Date $birthday = this.getBirthday();
        result = result * 59 + ($birthday == null ? 43 : ((Object)$birthday).hashCode());
        String $interests = this.getInterests();
        result = result * 59 + ($interests == null ? 43 : $interests.hashCode());
        String $clientIp = this.getClientIp();
        result = result * 59 + ($clientIp == null ? 43 : $clientIp.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "InvitationRegisterRequest(invitationCode=" + this.getInvitationCode() + ", embyUserName=" + this.getEmbyUserName() + ", embyUserPassword=" + this.getEmbyUserPassword() + ", remarks=" + this.getRemarks() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", requestPackagesCount=" + this.getRequestPackagesCount() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", gender=" + this.getGender() + ", birthday=" + String.valueOf(this.getBirthday()) + ", interests=" + this.getInterests() + ", clientIp=" + this.getClientIp() + ")";
    }
}
