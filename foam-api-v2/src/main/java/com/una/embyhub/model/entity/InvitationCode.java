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

@TableName(value="invitation_code")
public class InvitationCode
extends BaseEntity
implements Serializable {
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="code")
    private String code;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="host_line_type")
    private Integer hostLineType;
    @TableField(value="status")
    private Integer status;
    @TableField(value="usage_limit")
    private Integer usageLimit;
    @TableField(value="used_count")
    private Integer usedCount;
    @TableField(value="expire_datetime")
    private Date expireDatetime;
    @TableField(value="used_by")
    private String usedBy;
    @TableField(value="used_datetime")
    private Date usedDatetime;
    @TableField(value="validity_days")
    private Integer validityDays;
    public static final String COL_ID = "id";
    public static final String COL_CODE = "code";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_HOST_LINE_TYPE = "host_line_type";
    public static final String COL_STATUS = "status";
    public static final String COL_USAGE_LIMIT = "usage_limit";
    public static final String COL_USED_COUNT = "used_count";
    public static final String COL_EXPIRE_DATETIME = "expire_datetime";
    public static final String COL_USED_BY = "used_by";
    public static final String COL_USED_DATETIME = "used_datetime";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_VALIDITY_DAYS = "validity_days";

    @Generated
    public InvitationCode() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getCode() {
        return this.code;
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
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Integer getUsageLimit() {
        return this.usageLimit;
    }

    @Generated
    public Integer getUsedCount() {
        return this.usedCount;
    }

    @Generated
    public Date getExpireDatetime() {
        return this.expireDatetime;
    }

    @Generated
    public String getUsedBy() {
        return this.usedBy;
    }

    @Generated
    public Date getUsedDatetime() {
        return this.usedDatetime;
    }

    @Generated
    public Integer getValidityDays() {
        return this.validityDays;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setCode(String code) {
        this.code = code;
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
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setUsageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
    }

    @Generated
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    @Generated
    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    @Generated
    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

    @Generated
    public void setUsedDatetime(Date usedDatetime) {
        this.usedDatetime = usedDatetime;
    }

    @Generated
    public void setValidityDays(Integer validityDays) {
        this.validityDays = validityDays;
    }

    @Override
    @Generated
    public String toString() {
        return "InvitationCode(id=" + this.getId() + ", code=" + this.getCode() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", status=" + this.getStatus() + ", usageLimit=" + this.getUsageLimit() + ", usedCount=" + this.getUsedCount() + ", expireDatetime=" + String.valueOf(this.getExpireDatetime()) + ", usedBy=" + this.getUsedBy() + ", usedDatetime=" + String.valueOf(this.getUsedDatetime()) + ", validityDays=" + this.getValidityDays() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvitationCode)) {
            return false;
        }
        InvitationCode other = (InvitationCode)o;
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
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$usageLimit = this.getUsageLimit();
        Integer other$usageLimit = other.getUsageLimit();
        if (this$usageLimit == null ? other$usageLimit != null : !((Object)this$usageLimit).equals(other$usageLimit)) {
            return false;
        }
        Integer this$usedCount = this.getUsedCount();
        Integer other$usedCount = other.getUsedCount();
        if (this$usedCount == null ? other$usedCount != null : !((Object)this$usedCount).equals(other$usedCount)) {
            return false;
        }
        Integer this$validityDays = this.getValidityDays();
        Integer other$validityDays = other.getValidityDays();
        if (this$validityDays == null ? other$validityDays != null : !((Object)this$validityDays).equals(other$validityDays)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        Date this$expireDatetime = this.getExpireDatetime();
        Date other$expireDatetime = other.getExpireDatetime();
        if (this$expireDatetime == null ? other$expireDatetime != null : !((Object)this$expireDatetime).equals(other$expireDatetime)) {
            return false;
        }
        String this$usedBy = this.getUsedBy();
        String other$usedBy = other.getUsedBy();
        if (this$usedBy == null ? other$usedBy != null : !this$usedBy.equals(other$usedBy)) {
            return false;
        }
        Date this$usedDatetime = this.getUsedDatetime();
        Date other$usedDatetime = other.getUsedDatetime();
        return !(this$usedDatetime == null ? other$usedDatetime != null : !((Object)this$usedDatetime).equals(other$usedDatetime));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InvitationCode;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $usageLimit = this.getUsageLimit();
        result = result * 59 + ($usageLimit == null ? 43 : ((Object)$usageLimit).hashCode());
        Integer $usedCount = this.getUsedCount();
        result = result * 59 + ($usedCount == null ? 43 : ((Object)$usedCount).hashCode());
        Integer $validityDays = this.getValidityDays();
        result = result * 59 + ($validityDays == null ? 43 : ((Object)$validityDays).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Date $expireDatetime = this.getExpireDatetime();
        result = result * 59 + ($expireDatetime == null ? 43 : ((Object)$expireDatetime).hashCode());
        String $usedBy = this.getUsedBy();
        result = result * 59 + ($usedBy == null ? 43 : $usedBy.hashCode());
        Date $usedDatetime = this.getUsedDatetime();
        result = result * 59 + ($usedDatetime == null ? 43 : ((Object)$usedDatetime).hashCode());
        return result;
    }
}
