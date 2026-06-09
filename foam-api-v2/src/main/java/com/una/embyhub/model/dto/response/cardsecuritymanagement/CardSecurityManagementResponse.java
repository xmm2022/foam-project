/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.cardsecuritymanagement;

import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class CardSecurityManagementResponse
implements Serializable {
    private Long id;
    private String cardPassword;
    private Integer cardValidity;
    private Integer cardStatus;
    private String cardStatusName;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;
    private Date expirationDate;
    private Long userId;
    private String embyUserName;
    private Long embyInfoId;
    private Integer hostLineType;
    private String hostLineTypeName;
    private String embyUrl;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private Long distributorId;
    @BindField(entity=EmbyUser.class, field="embyUserName", condition="this.distributorId=id")
    private String distributorName;
    private Integer isDistributor;

    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
        if (cardStatus == 0) {
            this.cardStatusName = "\u672a\u4f7f\u7528";
        }
        if (cardStatus == 1) {
            this.cardStatusName = "\u5df2\u4f7f\u7528";
        }
    }

    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = HostLineTypeEnum.normalize(hostLineType);
        this.hostLineTypeName = HostLineTypeEnum.resolveLabel(hostLineType);
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
        this.isDistributor = distributorId != null && distributorId > 0L ? 1 : 0;
    }

    @Generated
    public CardSecurityManagementResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getCardPassword() {
        return this.cardPassword;
    }

    @Generated
    public Integer getCardValidity() {
        return this.cardValidity;
    }

    @Generated
    public Integer getCardStatus() {
        return this.cardStatus;
    }

    @Generated
    public String getCardStatusName() {
        return this.cardStatusName;
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
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
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
    public String getEmbyUrl() {
        return this.embyUrl;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public Long getDistributorId() {
        return this.distributorId;
    }

    @Generated
    public String getDistributorName() {
        return this.distributorName;
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
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    @Generated
    public void setCardValidity(Integer cardValidity) {
        this.cardValidity = cardValidity;
    }

    @Generated
    public void setCardStatusName(String cardStatusName) {
        this.cardStatusName = cardStatusName;
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
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
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
    public void setEmbyUrl(String embyUrl) {
        this.embyUrl = embyUrl;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    @Generated
    public void setIsDistributor(Integer isDistributor) {
        this.isDistributor = isDistributor;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CardSecurityManagementResponse)) {
            return false;
        }
        CardSecurityManagementResponse other = (CardSecurityManagementResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$cardValidity = this.getCardValidity();
        Integer other$cardValidity = other.getCardValidity();
        if (this$cardValidity == null ? other$cardValidity != null : !((Object)this$cardValidity).equals(other$cardValidity)) {
            return false;
        }
        Integer this$cardStatus = this.getCardStatus();
        Integer other$cardStatus = other.getCardStatus();
        if (this$cardStatus == null ? other$cardStatus != null : !((Object)this$cardStatus).equals(other$cardStatus)) {
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
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
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
        Long this$distributorId = this.getDistributorId();
        Long other$distributorId = other.getDistributorId();
        if (this$distributorId == null ? other$distributorId != null : !((Object)this$distributorId).equals(other$distributorId)) {
            return false;
        }
        Integer this$isDistributor = this.getIsDistributor();
        Integer other$isDistributor = other.getIsDistributor();
        if (this$isDistributor == null ? other$isDistributor != null : !((Object)this$isDistributor).equals(other$isDistributor)) {
            return false;
        }
        String this$cardPassword = this.getCardPassword();
        String other$cardPassword = other.getCardPassword();
        if (this$cardPassword == null ? other$cardPassword != null : !this$cardPassword.equals(other$cardPassword)) {
            return false;
        }
        String this$cardStatusName = this.getCardStatusName();
        String other$cardStatusName = other.getCardStatusName();
        if (this$cardStatusName == null ? other$cardStatusName != null : !this$cardStatusName.equals(other$cardStatusName)) {
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
        String this$hostLineTypeName = this.getHostLineTypeName();
        String other$hostLineTypeName = other.getHostLineTypeName();
        if (this$hostLineTypeName == null ? other$hostLineTypeName != null : !this$hostLineTypeName.equals(other$hostLineTypeName)) {
            return false;
        }
        String this$embyUrl = this.getEmbyUrl();
        String other$embyUrl = other.getEmbyUrl();
        if (this$embyUrl == null ? other$embyUrl != null : !this$embyUrl.equals(other$embyUrl)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$distributorName = this.getDistributorName();
        String other$distributorName = other.getDistributorName();
        return !(this$distributorName == null ? other$distributorName != null : !this$distributorName.equals(other$distributorName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CardSecurityManagementResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $cardValidity = this.getCardValidity();
        result = result * 59 + ($cardValidity == null ? 43 : ((Object)$cardValidity).hashCode());
        Integer $cardStatus = this.getCardStatus();
        result = result * 59 + ($cardStatus == null ? 43 : ((Object)$cardStatus).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Long $distributorId = this.getDistributorId();
        result = result * 59 + ($distributorId == null ? 43 : ((Object)$distributorId).hashCode());
        Integer $isDistributor = this.getIsDistributor();
        result = result * 59 + ($isDistributor == null ? 43 : ((Object)$isDistributor).hashCode());
        String $cardPassword = this.getCardPassword();
        result = result * 59 + ($cardPassword == null ? 43 : $cardPassword.hashCode());
        String $cardStatusName = this.getCardStatusName();
        result = result * 59 + ($cardStatusName == null ? 43 : $cardStatusName.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $hostLineTypeName = this.getHostLineTypeName();
        result = result * 59 + ($hostLineTypeName == null ? 43 : $hostLineTypeName.hashCode());
        String $embyUrl = this.getEmbyUrl();
        result = result * 59 + ($embyUrl == null ? 43 : $embyUrl.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $distributorName = this.getDistributorName();
        result = result * 59 + ($distributorName == null ? 43 : $distributorName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CardSecurityManagementResponse(id=" + this.getId() + ", cardPassword=" + this.getCardPassword() + ", cardValidity=" + this.getCardValidity() + ", cardStatus=" + this.getCardStatus() + ", cardStatusName=" + this.getCardStatusName() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", hostLineTypeName=" + this.getHostLineTypeName() + ", embyUrl=" + this.getEmbyUrl() + ", serverName=" + this.getServerName() + ", distributorId=" + this.getDistributorId() + ", distributorName=" + this.getDistributorName() + ", isDistributor=" + this.getIsDistributor() + ")";
    }
}
