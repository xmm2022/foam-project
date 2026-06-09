/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import com.una.embyhub.config.common.enums.RegisterChannelEnum;
import com.una.embyhub.model.dto.response.embyuser.UserOauthBindingResponse;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class EmbyUserCustomResponse
implements Serializable {
    private Long id;
    private Integer isAdmin;
    private Integer userStatus;
    private String userStatusName;
    private Date expirationDate;
    private String embyUserName;
    private String remarks;
    private Integer requestPackagesCount;
    private String email;
    private String mobile;
    private String gender;
    private Date birthday;
    private String interests;
    private String avatar;
    private Integer registerChannel;
    private Integer hostLineType;
    private String hostLineTypeName;
    private String registerChannelName;
    private Integer isDistributor;
    private List<UserOauthBindingResponse> oauthBindings;
    private String token;
    private String theme;

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        if (userStatus == 0) {
            this.userStatusName = "\u542f\u7528";
        }
        if (userStatus == 1) {
            this.userStatusName = "\u7981\u7528";
        }
    }

    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = HostLineTypeEnum.normalize(hostLineType);
        this.hostLineTypeName = HostLineTypeEnum.resolveUserRoleLabel(hostLineType);
    }

    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
        this.registerChannelName = RegisterChannelEnum.resolveLabel(registerChannel);
    }

    @Generated
    public EmbyUserCustomResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
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
    public String getUserStatusName() {
        return this.userStatusName;
    }

    @Generated
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
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
    public Integer getRegisterChannel() {
        return this.registerChannel;
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
    public String getRegisterChannelName() {
        return this.registerChannelName;
    }

    @Generated
    public Integer getIsDistributor() {
        return this.isDistributor;
    }

    @Generated
    public List<UserOauthBindingResponse> getOauthBindings() {
        return this.oauthBindings;
    }

    @Generated
    public String getToken() {
        return this.token;
    }

    @Generated
    public String getTheme() {
        return this.theme;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Generated
    public void setUserStatusName(String userStatusName) {
        this.userStatusName = userStatusName;
    }

    @Generated
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
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
    public void setHostLineTypeName(String hostLineTypeName) {
        this.hostLineTypeName = hostLineTypeName;
    }

    @Generated
    public void setRegisterChannelName(String registerChannelName) {
        this.registerChannelName = registerChannelName;
    }

    @Generated
    public void setIsDistributor(Integer isDistributor) {
        this.isDistributor = isDistributor;
    }

    @Generated
    public void setOauthBindings(List<UserOauthBindingResponse> oauthBindings) {
        this.oauthBindings = oauthBindings;
    }

    @Generated
    public void setToken(String token) {
        this.token = token;
    }

    @Generated
    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserCustomResponse)) {
            return false;
        }
        EmbyUserCustomResponse other = (EmbyUserCustomResponse)o;
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
        String this$userStatusName = this.getUserStatusName();
        String other$userStatusName = other.getUserStatusName();
        if (this$userStatusName == null ? other$userStatusName != null : !this$userStatusName.equals(other$userStatusName)) {
            return false;
        }
        Date this$expirationDate = this.getExpirationDate();
        Date other$expirationDate = other.getExpirationDate();
        if (this$expirationDate == null ? other$expirationDate != null : !((Object)this$expirationDate).equals(other$expirationDate)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
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
        String this$hostLineTypeName = this.getHostLineTypeName();
        String other$hostLineTypeName = other.getHostLineTypeName();
        if (this$hostLineTypeName == null ? other$hostLineTypeName != null : !this$hostLineTypeName.equals(other$hostLineTypeName)) {
            return false;
        }
        String this$registerChannelName = this.getRegisterChannelName();
        String other$registerChannelName = other.getRegisterChannelName();
        if (this$registerChannelName == null ? other$registerChannelName != null : !this$registerChannelName.equals(other$registerChannelName)) {
            return false;
        }
        List<UserOauthBindingResponse> this$oauthBindings = this.getOauthBindings();
        List<UserOauthBindingResponse> other$oauthBindings = other.getOauthBindings();
        if (this$oauthBindings == null ? other$oauthBindings != null : !((Object)this$oauthBindings).equals(other$oauthBindings)) {
            return false;
        }
        String this$token = this.getToken();
        String other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) {
            return false;
        }
        String this$theme = this.getTheme();
        String other$theme = other.getTheme();
        return !(this$theme == null ? other$theme != null : !this$theme.equals(other$theme));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserCustomResponse;
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
        Integer $requestPackagesCount = this.getRequestPackagesCount();
        result = result * 59 + ($requestPackagesCount == null ? 43 : ((Object)$requestPackagesCount).hashCode());
        Integer $registerChannel = this.getRegisterChannel();
        result = result * 59 + ($registerChannel == null ? 43 : ((Object)$registerChannel).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $isDistributor = this.getIsDistributor();
        result = result * 59 + ($isDistributor == null ? 43 : ((Object)$isDistributor).hashCode());
        String $userStatusName = this.getUserStatusName();
        result = result * 59 + ($userStatusName == null ? 43 : $userStatusName.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
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
        String $hostLineTypeName = this.getHostLineTypeName();
        result = result * 59 + ($hostLineTypeName == null ? 43 : $hostLineTypeName.hashCode());
        String $registerChannelName = this.getRegisterChannelName();
        result = result * 59 + ($registerChannelName == null ? 43 : $registerChannelName.hashCode());
        List<UserOauthBindingResponse> $oauthBindings = this.getOauthBindings();
        result = result * 59 + ($oauthBindings == null ? 43 : ((Object)$oauthBindings).hashCode());
        String $token = this.getToken();
        result = result * 59 + ($token == null ? 43 : $token.hashCode());
        String $theme = this.getTheme();
        result = result * 59 + ($theme == null ? 43 : $theme.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserCustomResponse(id=" + this.getId() + ", isAdmin=" + this.getIsAdmin() + ", userStatus=" + this.getUserStatus() + ", userStatusName=" + this.getUserStatusName() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", embyUserName=" + this.getEmbyUserName() + ", remarks=" + this.getRemarks() + ", requestPackagesCount=" + this.getRequestPackagesCount() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", gender=" + this.getGender() + ", birthday=" + String.valueOf(this.getBirthday()) + ", interests=" + this.getInterests() + ", avatar=" + this.getAvatar() + ", registerChannel=" + this.getRegisterChannel() + ", hostLineType=" + this.getHostLineType() + ", hostLineTypeName=" + this.getHostLineTypeName() + ", registerChannelName=" + this.getRegisterChannelName() + ", isDistributor=" + this.getIsDistributor() + ", oauthBindings=" + String.valueOf(this.getOauthBindings()) + ", token=" + this.getToken() + ", theme=" + this.getTheme() + ")";
    }
}
