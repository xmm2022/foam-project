/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.diboot.core.binding.annotation.BindEntityList
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import com.baomidou.mybatisplus.annotation.TableField;
import com.diboot.core.binding.annotation.BindEntityList;
import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import com.una.embyhub.config.common.enums.RegisterChannelEnum;
import com.una.embyhub.model.dto.response.cardsecuritymanagement.CardSecurityManagementResponse;
import com.una.embyhub.model.dto.response.embyuser.UserOauthBindingResponse;
import com.una.embyhub.model.dto.response.rose.RoseBindingResponse;
import com.una.embyhub.model.entity.CardSecurityManagement;
import com.una.embyhub.model.entity.EmbyInfo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class EmbyUserResponse
implements Serializable {
    private Long id;
    private String embyUserId;
    private String embyUserName;
    private Integer isAdmin;
    private Integer userStatus;
    private String userStatusName;
    private Date expirationDate;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;
    @BindEntityList(entity=CardSecurityManagement.class, condition="this.id=user_id")
    private List<CardSecurityManagementResponse> cardSecurityManagementList;
    private Long expireDateCount;
    private String remarks;
    private Integer requestPackagesCount;
    private String email;
    private String mobile;
    private String gender;
    private Date birthday;
    private String interests;
    private String avatar;
    private Integer registerChannel;
    private String registerChannelName;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    private Integer hostLineType;
    private String hostLineTypeName;
    private Integer isDistributor;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private RoseBindingResponse roseBinding;
    private UserOauthBindingResponse telegramBinding;

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        if (this.expireDateCount != null && this.expireDateCount <= 3L && this.expireDateCount >= 0L && this.userStatus == 0) {
            this.userStatusName = "\u5373\u5c06\u8fc7\u671f";
        } else if (this.userStatus == 0) {
            this.userStatusName = "\u542f\u7528";
        } else if (this.userStatus == 1) {
            this.userStatusName = "\u7981\u7528";
        }
    }

    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
        this.registerChannelName = RegisterChannelEnum.resolveLabel(registerChannel);
    }

    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = HostLineTypeEnum.normalize(hostLineType);
        this.hostLineTypeName = HostLineTypeEnum.resolveUserRoleLabel(hostLineType);
    }

    @Generated
    public EmbyUserResponse() {
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
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public String getCreateUserName() {
        return this.createUserName;
    }

    @Generated
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    @Generated
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    @Generated
    public Long getCreateUserId() {
        return this.createUserId;
    }

    @Generated
    public Integer getDelFlag() {
        return this.delFlag;
    }

    @Generated
    public List<CardSecurityManagementResponse> getCardSecurityManagementList() {
        return this.cardSecurityManagementList;
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
    public Integer getRegisterChannel() {
        return this.registerChannel;
    }

    @Generated
    public String getRegisterChannelName() {
        return this.registerChannelName;
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
    public String getHostLineTypeName() {
        return this.hostLineTypeName;
    }

    @Generated
    public Integer getIsDistributor() {
        return this.isDistributor;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public RoseBindingResponse getRoseBinding() {
        return this.roseBinding;
    }

    @Generated
    public UserOauthBindingResponse getTelegramBinding() {
        return this.telegramBinding;
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
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Generated
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Generated
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Generated
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Generated
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Generated
    public void setCardSecurityManagementList(List<CardSecurityManagementResponse> cardSecurityManagementList) {
        this.cardSecurityManagementList = cardSecurityManagementList;
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
    public void setRegisterChannelName(String registerChannelName) {
        this.registerChannelName = registerChannelName;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setHostLineTypeName(String hostLineTypeName) {
        this.hostLineTypeName = hostLineTypeName;
    }

    @Generated
    public void setIsDistributor(Integer isDistributor) {
        this.isDistributor = isDistributor;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setRoseBinding(RoseBindingResponse roseBinding) {
        this.roseBinding = roseBinding;
    }

    @Generated
    public void setTelegramBinding(UserOauthBindingResponse telegramBinding) {
        this.telegramBinding = telegramBinding;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserResponse)) {
            return false;
        }
        EmbyUserResponse other = (EmbyUserResponse)o;
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
        Long this$updateUserId = this.getUpdateUserId();
        Long other$updateUserId = other.getUpdateUserId();
        if (this$updateUserId == null ? other$updateUserId != null : !((Object)this$updateUserId).equals(other$updateUserId)) {
            return false;
        }
        Long this$createUserId = this.getCreateUserId();
        Long other$createUserId = other.getCreateUserId();
        if (this$createUserId == null ? other$createUserId != null : !((Object)this$createUserId).equals(other$createUserId)) {
            return false;
        }
        Integer this$delFlag = this.getDelFlag();
        Integer other$delFlag = other.getDelFlag();
        if (this$delFlag == null ? other$delFlag != null : !((Object)this$delFlag).equals(other$delFlag)) {
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
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        if (this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime)) {
            return false;
        }
        String this$createUserName = this.getCreateUserName();
        String other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) {
            return false;
        }
        String this$updateUserName = this.getUpdateUserName();
        String other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName)) {
            return false;
        }
        List<CardSecurityManagementResponse> this$cardSecurityManagementList = this.getCardSecurityManagementList();
        List<CardSecurityManagementResponse> other$cardSecurityManagementList = other.getCardSecurityManagementList();
        if (this$cardSecurityManagementList == null ? other$cardSecurityManagementList != null : !((Object)this$cardSecurityManagementList).equals(other$cardSecurityManagementList)) {
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
        String this$registerChannelName = this.getRegisterChannelName();
        String other$registerChannelName = other.getRegisterChannelName();
        if (this$registerChannelName == null ? other$registerChannelName != null : !this$registerChannelName.equals(other$registerChannelName)) {
            return false;
        }
        String this$hostLineTypeName = this.getHostLineTypeName();
        String other$hostLineTypeName = other.getHostLineTypeName();
        if (this$hostLineTypeName == null ? other$hostLineTypeName != null : !this$hostLineTypeName.equals(other$hostLineTypeName)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        RoseBindingResponse this$roseBinding = this.getRoseBinding();
        RoseBindingResponse other$roseBinding = other.getRoseBinding();
        if (this$roseBinding == null ? other$roseBinding != null : !((Object)this$roseBinding).equals(other$roseBinding)) {
            return false;
        }
        UserOauthBindingResponse this$telegramBinding = this.getTelegramBinding();
        UserOauthBindingResponse other$telegramBinding = other.getTelegramBinding();
        return !(this$telegramBinding == null ? other$telegramBinding != null : !((Object)this$telegramBinding).equals(other$telegramBinding));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserResponse;
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
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
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
        String $userStatusName = this.getUserStatusName();
        result = result * 59 + ($userStatusName == null ? 43 : $userStatusName.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        List<CardSecurityManagementResponse> $cardSecurityManagementList = this.getCardSecurityManagementList();
        result = result * 59 + ($cardSecurityManagementList == null ? 43 : ((Object)$cardSecurityManagementList).hashCode());
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
        String $registerChannelName = this.getRegisterChannelName();
        result = result * 59 + ($registerChannelName == null ? 43 : $registerChannelName.hashCode());
        String $hostLineTypeName = this.getHostLineTypeName();
        result = result * 59 + ($hostLineTypeName == null ? 43 : $hostLineTypeName.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        RoseBindingResponse $roseBinding = this.getRoseBinding();
        result = result * 59 + ($roseBinding == null ? 43 : ((Object)$roseBinding).hashCode());
        UserOauthBindingResponse $telegramBinding = this.getTelegramBinding();
        result = result * 59 + ($telegramBinding == null ? 43 : ((Object)$telegramBinding).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserResponse(id=" + this.getId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", isAdmin=" + this.getIsAdmin() + ", userStatus=" + this.getUserStatus() + ", userStatusName=" + this.getUserStatusName() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ", cardSecurityManagementList=" + String.valueOf(this.getCardSecurityManagementList()) + ", expireDateCount=" + this.getExpireDateCount() + ", remarks=" + this.getRemarks() + ", requestPackagesCount=" + this.getRequestPackagesCount() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", gender=" + this.getGender() + ", birthday=" + String.valueOf(this.getBirthday()) + ", interests=" + this.getInterests() + ", avatar=" + this.getAvatar() + ", registerChannel=" + this.getRegisterChannel() + ", registerChannelName=" + this.getRegisterChannelName() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", hostLineTypeName=" + this.getHostLineTypeName() + ", isDistributor=" + this.getIsDistributor() + ", serverName=" + this.getServerName() + ", roseBinding=" + String.valueOf(this.getRoseBinding()) + ", telegramBinding=" + String.valueOf(this.getTelegramBinding()) + ")";
    }
}
