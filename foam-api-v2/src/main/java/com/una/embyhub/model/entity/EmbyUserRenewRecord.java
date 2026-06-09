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

@TableName(value="emby_user_renew_record")
public class EmbyUserRenewRecord
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
    @TableField(value="renew_channel")
    private Integer renewChannel;
    @TableField(value="renew_channel_detail")
    private String renewChannelDetail;
    @TableField(value="renew_days")
    private Integer renewDays;
    @TableField(value="expiration_date_before")
    private Date expirationDateBefore;
    @TableField(value="expiration_date_after")
    private Date expirationDateAfter;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    public static final String COL_ID = "id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_EMBY_USER_ID = "emby_user_id";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_RENEW_CHANNEL = "renew_channel";
    public static final String COL_RENEW_CHANNEL_DETAIL = "renew_channel_detail";
    public static final String COL_RENEW_DAYS = "renew_days";
    public static final String COL_EXPIRATION_DATE_BEFORE = "expiration_date_before";
    public static final String COL_EXPIRATION_DATE_AFTER = "expiration_date_after";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_CREATE_DATETIME = "create_datetime";

    @Generated
    public EmbyUserRenewRecord() {
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
    public Integer getRenewChannel() {
        return this.renewChannel;
    }

    @Generated
    public String getRenewChannelDetail() {
        return this.renewChannelDetail;
    }

    @Generated
    public Integer getRenewDays() {
        return this.renewDays;
    }

    @Generated
    public Date getExpirationDateBefore() {
        return this.expirationDateBefore;
    }

    @Generated
    public Date getExpirationDateAfter() {
        return this.expirationDateAfter;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
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
    public void setRenewChannel(Integer renewChannel) {
        this.renewChannel = renewChannel;
    }

    @Generated
    public void setRenewChannelDetail(String renewChannelDetail) {
        this.renewChannelDetail = renewChannelDetail;
    }

    @Generated
    public void setRenewDays(Integer renewDays) {
        this.renewDays = renewDays;
    }

    @Generated
    public void setExpirationDateBefore(Date expirationDateBefore) {
        this.expirationDateBefore = expirationDateBefore;
    }

    @Generated
    public void setExpirationDateAfter(Date expirationDateAfter) {
        this.expirationDateAfter = expirationDateAfter;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyUserRenewRecord(id=" + this.getId() + ", userId=" + this.getUserId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", renewChannel=" + this.getRenewChannel() + ", renewChannelDetail=" + this.getRenewChannelDetail() + ", renewDays=" + this.getRenewDays() + ", expirationDateBefore=" + String.valueOf(this.getExpirationDateBefore()) + ", expirationDateAfter=" + String.valueOf(this.getExpirationDateAfter()) + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserRenewRecord)) {
            return false;
        }
        EmbyUserRenewRecord other = (EmbyUserRenewRecord)o;
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
        Integer this$renewChannel = this.getRenewChannel();
        Integer other$renewChannel = other.getRenewChannel();
        if (this$renewChannel == null ? other$renewChannel != null : !((Object)this$renewChannel).equals(other$renewChannel)) {
            return false;
        }
        Integer this$renewDays = this.getRenewDays();
        Integer other$renewDays = other.getRenewDays();
        if (this$renewDays == null ? other$renewDays != null : !((Object)this$renewDays).equals(other$renewDays)) {
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
        String this$renewChannelDetail = this.getRenewChannelDetail();
        String other$renewChannelDetail = other.getRenewChannelDetail();
        if (this$renewChannelDetail == null ? other$renewChannelDetail != null : !this$renewChannelDetail.equals(other$renewChannelDetail)) {
            return false;
        }
        Date this$expirationDateBefore = this.getExpirationDateBefore();
        Date other$expirationDateBefore = other.getExpirationDateBefore();
        if (this$expirationDateBefore == null ? other$expirationDateBefore != null : !((Object)this$expirationDateBefore).equals(other$expirationDateBefore)) {
            return false;
        }
        Date this$expirationDateAfter = this.getExpirationDateAfter();
        Date other$expirationDateAfter = other.getExpirationDateAfter();
        return !(this$expirationDateAfter == null ? other$expirationDateAfter != null : !((Object)this$expirationDateAfter).equals(other$expirationDateAfter));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserRenewRecord;
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
        Integer $renewChannel = this.getRenewChannel();
        result = result * 59 + ($renewChannel == null ? 43 : ((Object)$renewChannel).hashCode());
        Integer $renewDays = this.getRenewDays();
        result = result * 59 + ($renewDays == null ? 43 : ((Object)$renewDays).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $embyUserId = this.getEmbyUserId();
        result = result * 59 + ($embyUserId == null ? 43 : $embyUserId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $renewChannelDetail = this.getRenewChannelDetail();
        result = result * 59 + ($renewChannelDetail == null ? 43 : $renewChannelDetail.hashCode());
        Date $expirationDateBefore = this.getExpirationDateBefore();
        result = result * 59 + ($expirationDateBefore == null ? 43 : ((Object)$expirationDateBefore).hashCode());
        Date $expirationDateAfter = this.getExpirationDateAfter();
        result = result * 59 + ($expirationDateAfter == null ? 43 : ((Object)$expirationDateAfter).hashCode());
        return result;
    }
}
