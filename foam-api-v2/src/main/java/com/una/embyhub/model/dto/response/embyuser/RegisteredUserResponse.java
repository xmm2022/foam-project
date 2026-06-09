/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class RegisteredUserResponse
implements Serializable {
    private Long id;
    private String embyUserId;
    private String embyUserName;
    private String embyUserPassword;
    private Integer isAdmin;
    private Integer userStatus;
    private Integer hostLineType;
    private String hostLineTypeName;
    private Date expirationDate;
    private String remarks;
    private Integer requestPackagesCount;
    private String email;
    private String mobile;
    private String gender;
    private Date birthday;
    private String interests;

    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = HostLineTypeEnum.normalize(hostLineType);
        this.hostLineTypeName = HostLineTypeEnum.resolveUserRoleLabel(hostLineType);
    }

    @Generated
    public RegisteredUserResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getEmbyUserId() {
        return this.embyUserId;
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
    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    @Generated
    public Integer getUserStatus() {
        return this.userStatus;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public String getHostLineTypeName() {
        return this.hostLineTypeName;
    }

    @Generated
    public Date getExpirationDate() {
        return this.expirationDate;
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
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyUserId(String embyUserId) {
        this.embyUserId = embyUserId;
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
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Generated
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Generated
    public void setHostLineTypeName(String hostLineTypeName) {
        this.hostLineTypeName = hostLineTypeName;
    }

    @Generated
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RegisteredUserResponse)) {
            return false;
        }
        RegisteredUserResponse other = (RegisteredUserResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$isAdmin = this.getIsAdmin();
        Integer other$isAdmin = other.getIsAdmin();
        if (this$isAdmin == null ? other$isAdmin != null : !((Object)this$isAdmin).equals(other$isAdmin)) {
            return false;
        }
        Integer this$userStatus = this.getUserStatus();
        Integer other$userStatus = other.getUserStatus();
        if (this$userStatus == null ? other$userStatus != null : !((Object)this$userStatus).equals(other$userStatus)) {
            return false;
        }
        Integer this$hostLineType = this.getHostLineType();
        Integer other$hostLineType = other.getHostLineType();
        if (this$hostLineType == null ? other$hostLineType != null : !((Object)this$hostLineType).equals(other$hostLineType)) {
            return false;
        }
        Integer this$requestPackagesCount = this.getRequestPackagesCount();
        Integer other$requestPackagesCount = other.getRequestPackagesCount();
        if (this$requestPackagesCount == null ? other$requestPackagesCount != null : !((Object)this$requestPackagesCount).equals(other$requestPackagesCount)) {
            return false;
        }
        String this$embyUserId = this.getEmbyUserId();
        String other$embyUserId = other.getEmbyUserId();
        if (this$embyUserId == null ? other$embyUserId != null : !this$embyUserId.equals(other$embyUserId)) {
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
        String this$hostLineTypeName = this.getHostLineTypeName();
        String other$hostLineTypeName = other.getHostLineTypeName();
        if (this$hostLineTypeName == null ? other$hostLineTypeName != null : !this$hostLineTypeName.equals(other$hostLineTypeName)) {
            return false;
        }
        Date this$expirationDate = this.getExpirationDate();
        Date other$expirationDate = other.getExpirationDate();
        if (this$expirationDate == null ? other$expirationDate != null : !((Object)this$expirationDate).equals(other$expirationDate)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
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
        return !(this$interests == null ? other$interests != null : !this$interests.equals(other$interests));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RegisteredUserResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $isAdmin = this.getIsAdmin();
        result = result * 59 + ($isAdmin == null ? 43 : ((Object)$isAdmin).hashCode());
        Integer $userStatus = this.getUserStatus();
        result = result * 59 + ($userStatus == null ? 43 : ((Object)$userStatus).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $requestPackagesCount = this.getRequestPackagesCount();
        result = result * 59 + ($requestPackagesCount == null ? 43 : ((Object)$requestPackagesCount).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $embyUserPassword = this.getEmbyUserPassword();
        result = result * 59 + ($embyUserPassword == null ? 43 : $embyUserPassword.hashCode());
        String $hostLineTypeName = this.getHostLineTypeName();
        result = result * 59 + ($hostLineTypeName == null ? 43 : $hostLineTypeName.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
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
        return result;
    }

    @Generated
    public String toString() {
        return "RegisteredUserResponse(id=" + this.getId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", embyUserPassword=" + this.getEmbyUserPassword() + ", isAdmin=" + this.getIsAdmin() + ", userStatus=" + this.getUserStatus() + ", hostLineType=" + this.getHostLineType() + ", hostLineTypeName=" + this.getHostLineTypeName() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", remarks=" + this.getRemarks() + ", requestPackagesCount=" + this.getRequestPackagesCount() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", gender=" + this.getGender() + ", birthday=" + String.valueOf(this.getBirthday()) + ", interests=" + this.getInterests() + ")";
    }
}
