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

@TableName(value="emby_user_register_record")
public class EmbyUserRegisterRecord
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_user_id")
    private String embyUserId;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="register_channel")
    private Integer registerChannel;
    @TableField(value="register_channel_detail")
    private String registerChannelDetail;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="remarks")
    private String remarks;
    @TableField(value="expiration_date")
    private Date expirationDate;
    public static final String COL_ID = "id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_EMBY_USER_ID = "emby_user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_REGISTER_CHANNEL = "register_channel";
    public static final String COL_REGISTER_CHANNEL_DETAIL = "register_channel_detail";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_REMARKS = "remarks";
    public static final String COL_EXPIRATION_DATE = "expiration_date";
    public static final String COL_CREATE_DATETIME = "create_datetime";

    @Generated
    public EmbyUserRegisterRecord() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
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
    public Integer getRegisterChannel() {
        return this.registerChannel;
    }

    @Generated
    public String getRegisterChannelDetail() {
        return this.registerChannelDetail;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
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
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
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
    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
    }

    @Generated
    public void setRegisterChannelDetail(String registerChannelDetail) {
        this.registerChannelDetail = registerChannelDetail;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Generated
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyUserRegisterRecord(id=" + this.getId() + ", userId=" + this.getUserId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", registerChannel=" + this.getRegisterChannel() + ", registerChannelDetail=" + this.getRegisterChannelDetail() + ", embyInfoId=" + this.getEmbyInfoId() + ", remarks=" + this.getRemarks() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserRegisterRecord)) {
            return false;
        }
        EmbyUserRegisterRecord other = (EmbyUserRegisterRecord)o;
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
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
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
        String this$registerChannelDetail = this.getRegisterChannelDetail();
        String other$registerChannelDetail = other.getRegisterChannelDetail();
        if (this$registerChannelDetail == null ? other$registerChannelDetail != null : !this$registerChannelDetail.equals(other$registerChannelDetail)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        Date this$expirationDate = this.getExpirationDate();
        Date other$expirationDate = other.getExpirationDate();
        return !(this$expirationDate == null ? other$expirationDate != null : !((Object)this$expirationDate).equals(other$expirationDate));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserRegisterRecord;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $registerChannel = this.getRegisterChannel();
        result = result * 59 + ($registerChannel == null ? 43 : ((Object)$registerChannel).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $registerChannelDetail = this.getRegisterChannelDetail();
        result = result * 59 + ($registerChannelDetail == null ? 43 : $registerChannelDetail.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        return result;
    }
}
