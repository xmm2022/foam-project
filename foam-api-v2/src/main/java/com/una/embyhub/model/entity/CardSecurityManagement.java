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
import lombok.Generated;

@TableName(value="card_security_management")
public class CardSecurityManagement
extends BaseEntity
implements Serializable {
    public static final String COL_CARD_TYPE = "card_type";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="card_password")
    private String cardPassword;
    @TableField(value="card_validity")
    private Integer cardValidity;
    @TableField(value="card_status")
    private Integer cardStatus;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="host_line_type")
    private Integer hostLineType;
    @TableField(value="distributor_id")
    private Long distributorId;
    public static final String COL_ID = "id";
    public static final String COL_CARD_PASSWORD = "card_password";
    public static final String COL_CARD_VALIDITY = "card_validity";
    public static final String COL_CARD_STATUS = "card_status";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_HOST_LINE_TYPE = "host_line_type";
    public static final String COL_DISTRIBUTOR_ID = "distributor_id";

    @Generated
    public CardSecurityManagement() {
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
    public Long getDistributorId() {
        return this.distributorId;
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
    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
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
    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = hostLineType;
    }

    @Generated
    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    @Override
    @Generated
    public String toString() {
        return "CardSecurityManagement(id=" + this.getId() + ", cardPassword=" + this.getCardPassword() + ", cardValidity=" + this.getCardValidity() + ", cardStatus=" + this.getCardStatus() + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", distributorId=" + this.getDistributorId() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CardSecurityManagement)) {
            return false;
        }
        CardSecurityManagement other = (CardSecurityManagement)o;
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
        String this$cardPassword = this.getCardPassword();
        String other$cardPassword = other.getCardPassword();
        if (this$cardPassword == null ? other$cardPassword != null : !this$cardPassword.equals(other$cardPassword)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        return !(this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CardSecurityManagement;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $cardValidity = this.getCardValidity();
        result = result * 59 + ($cardValidity == null ? 43 : ((Object)$cardValidity).hashCode());
        Integer $cardStatus = this.getCardStatus();
        result = result * 59 + ($cardStatus == null ? 43 : ((Object)$cardStatus).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Long $distributorId = this.getDistributorId();
        result = result * 59 + ($distributorId == null ? 43 : ((Object)$distributorId).hashCode());
        String $cardPassword = this.getCardPassword();
        result = result * 59 + ($cardPassword == null ? 43 : $cardPassword.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        return result;
    }
}
