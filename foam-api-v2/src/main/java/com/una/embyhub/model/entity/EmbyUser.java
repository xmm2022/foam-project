/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

@TableName(value="emby_user")
public class EmbyUser
extends BaseEntity
implements Serializable {
    public static final String COL_CARD_PASSWORD = "card_password";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="emby_user_id")
    private String embyUserId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="emby_user_password")
    private String embyUserPassword;
    @TableField(value="is_admin")
    private Integer isAdmin;
    @TableField(value="user_status")
    private Integer userStatus;
    @TableField(value="disable_reason")
    private String disableReason;
    @TableField(value="disabled_datetime")
    private Date disabledDatetime;
    @TableField(value="expiration_date")
    private Date expirationDate;
    @TableField(value="expire_date_count")
    private Long expireDateCount;
    @TableField(value="remarks")
    private String remarks;
    @TableField(value="request_packages_count")
    private Integer requestPackagesCount;
    @TableField(value="email")
    private String email;
    @TableField(value="mobile")
    private String mobile;
    @TableField(value="gender")
    private String gender;
    @TableField(value="birthday")
    private Date birthday;
    @TableField(value="interests")
    private String interests;
    @TableField(value="avatar")
    private String avatar;
    @TableField(value="invitation_code")
    private String invitationCode;
    @TableField(value="register_channel")
    private Integer registerChannel;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="host_line_type")
    private Integer hostLineType;
    @TableField(value="is_distributor")
    private Integer isDistributor;
    public static final String COL_ID = "id";
    public static final String COL_EMBY_USER_ID = "emby_user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_EMBY_USER_PASSWORD = "emby_user_password";
    public static final String COL_IS_ADMIN = "is_admin";
    public static final String COL_USER_STATUS = "user_status";
    public static final String COL_DISABLE_REASON = "disable_reason";
    public static final String COL_DISABLED_DATETIME = "disabled_datetime";
    public static final String COL_EXPIRATION_DATE = "expiration_date";
    public static final String COL_EXPIRE_DATE_COUNT = "expire_date_count";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_REMARKS = "remarks";
    public static final String COL_REQUEST_PACKAGES_COUNT = "request_packages_count";
    public static final String COL_EMAIL = "email";
    public static final String COL_MOBILE = "mobile";
    public static final String COL_GENDER = "gender";
    public static final String COL_BIRTHDAY = "birthday";
    public static final String COL_INTERESTS = "interests";
    public static final String COL_AVATAR = "avatar";
    public static final String COL_INVITATION_CODE = "invitation_code";
    public static final String COL_REGISTER_CHANNEL = "register_channel";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_HOST_LINE_TYPE = "host_line_type";
    public static final String COL_IS_DISTRIBUTOR = "is_distributor";

    @Generated
    public EmbyUser() {
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
    public String getDisableReason() {
        return this.disableReason;
    }

    @Generated
    public Date getDisabledDatetime() {
        return this.disabledDatetime;
    }

    @Generated
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Generated
    public Long getExpireDateCount() {
        return this.expireDateCount;
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
    public String getAvatar() {
        return this.avatar;
    }

    @Generated
    public String getInvitationCode() {
        return this.invitationCode;
    }

    @Generated
    public Integer getRegisterChannel() {
        return this.registerChannel;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public Integer getIsDistributor() {
        return this.isDistributor;
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
    public void setDisableReason(String disableReason) {
        this.disableReason = disableReason;
    }

    @Generated
    public void setDisabledDatetime(Date disabledDatetime) {
        this.disabledDatetime = disabledDatetime;
    }

    @Generated
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Generated
    public void setExpireDateCount(Long expireDateCount) {
        this.expireDateCount = expireDateCount;
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
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Generated
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Generated
    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = hostLineType;
    }

    @Generated
    public void setIsDistributor(Integer isDistributor) {
        this.isDistributor = isDistributor;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyUser(id=" + this.getId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", embyUserPassword=" + this.getEmbyUserPassword() + ", isAdmin=" + this.getIsAdmin() + ", userStatus=" + this.getUserStatus() + ", disableReason=" + this.getDisableReason() + ", disabledDatetime=" + String.valueOf(this.getDisabledDatetime()) + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", expireDateCount=" + this.getExpireDateCount() + ", remarks=" + this.getRemarks() + ", requestPackagesCount=" + this.getRequestPackagesCount() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", gender=" + this.getGender() + ", birthday=" + String.valueOf(this.getBirthday()) + ", interests=" + this.getInterests() + ", avatar=" + this.getAvatar() + ", invitationCode=" + this.getInvitationCode() + ", registerChannel=" + this.getRegisterChannel() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", isDistributor=" + this.getIsDistributor() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUser)) {
            return false;
        }
        EmbyUser other = (EmbyUser)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        Long this$expireDateCount = this.getExpireDateCount();
        Long other$expireDateCount = other.getExpireDateCount();
        if (this$expireDateCount == null ? other$expireDateCount != null : !((Object)this$expireDateCount).equals(other$expireDateCount)) {
            return false;
        }
        Integer this$requestPackagesCount = this.getRequestPackagesCount();
        Integer other$requestPackagesCount = other.getRequestPackagesCount();
        if (this$requestPackagesCount == null ? other$requestPackagesCount != null : !((Object)this$requestPackagesCount).equals(other$requestPackagesCount)) {
            return false;
        }
        Integer this$registerChannel = this.getRegisterChannel();
        Integer other$registerChannel = other.getRegisterChannel();
        if (this$registerChannel == null ? other$registerChannel != null : !((Object)this$registerChannel).equals(other$registerChannel)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$hostLineType = this.getHostLineType();
        Integer other$hostLineType = other.getHostLineType();
        if (this$hostLineType == null ? other$hostLineType != null : !((Object)this$hostLineType).equals(other$hostLineType)) {
            return false;
        }
        Integer this$isDistributor = this.getIsDistributor();
        Integer other$isDistributor = other.getIsDistributor();
        if (this$isDistributor == null ? other$isDistributor != null : !((Object)this$isDistributor).equals(other$isDistributor)) {
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
        String this$disableReason = this.getDisableReason();
        String other$disableReason = other.getDisableReason();
        if (this$disableReason == null ? other$disableReason != null : !this$disableReason.equals(other$disableReason)) {
            return false;
        }
        Date this$disabledDatetime = this.getDisabledDatetime();
        Date other$disabledDatetime = other.getDisabledDatetime();
        if (this$disabledDatetime == null ? other$disabledDatetime != null : !((Object)this$disabledDatetime).equals(other$disabledDatetime)) {
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
        if (this$interests == null ? other$interests != null : !this$interests.equals(other$interests)) {
            return false;
        }
        String this$avatar = this.getAvatar();
        String other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) {
            return false;
        }
        String this$invitationCode = this.getInvitationCode();
        String other$invitationCode = other.getInvitationCode();
        return !(this$invitationCode == null ? other$invitationCode != null : !this$invitationCode.equals(other$invitationCode));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUser;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $isAdmin = this.getIsAdmin();
        result = result * 59 + ($isAdmin == null ? 43 : ((Object)$isAdmin).hashCode());
        Integer $userStatus = this.getUserStatus();
        result = result * 59 + ($userStatus == null ? 43 : ((Object)$userStatus).hashCode());
        Long $expireDateCount = this.getExpireDateCount();
        result = result * 59 + ($expireDateCount == null ? 43 : ((Object)$expireDateCount).hashCode());
        Integer $requestPackagesCount = this.getRequestPackagesCount();
        result = result * 59 + ($requestPackagesCount == null ? 43 : ((Object)$requestPackagesCount).hashCode());
        Integer $registerChannel = this.getRegisterChannel();
        result = result * 59 + ($registerChannel == null ? 43 : ((Object)$registerChannel).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $isDistributor = this.getIsDistributor();
        result = result * 59 + ($isDistributor == null ? 43 : ((Object)$isDistributor).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $embyUserPassword = this.getEmbyUserPassword();
        result = result * 59 + ($embyUserPassword == null ? 43 : $embyUserPassword.hashCode());
        String $disableReason = this.getDisableReason();
        result = result * 59 + ($disableReason == null ? 43 : $disableReason.hashCode());
        Date $disabledDatetime = this.getDisabledDatetime();
        result = result * 59 + ($disabledDatetime == null ? 43 : ((Object)$disabledDatetime).hashCode());
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
        String $avatar = this.getAvatar();
        result = result * 59 + ($avatar == null ? 43 : $avatar.hashCode());
        String $invitationCode = this.getInvitationCode();
        result = result * 59 + ($invitationCode == null ? 43 : $invitationCode.hashCode());
        return result;
    }
}
