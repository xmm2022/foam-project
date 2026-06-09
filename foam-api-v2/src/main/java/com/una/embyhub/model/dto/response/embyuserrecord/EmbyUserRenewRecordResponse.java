/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.model.dto.response.embyuserrecord;

import com.baomidou.mybatisplus.annotation.TableField;
import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.config.common.enums.RenewChannelEnum;
import com.una.embyhub.model.entity.EmbyInfo;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;
import org.springframework.util.StringUtils;

public class EmbyUserRenewRecordResponse
implements Serializable {
    private Long id;
    private Long userId;
    private String embyUserId;
    private String embyUserName;
    private Integer renewChannel;
    private String renewChannelName;
    private String renewChannelDetail;
    private Integer renewDays;
    private Date expirationDateBefore;
    private Date expirationDateAfter;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private Date createDatetime;

    public void setRenewChannel(Integer renewChannel) {
        this.renewChannel = renewChannel;
        this.renewChannelName = RenewChannelEnum.resolveLabel(renewChannel);
    }

    public String getRenewChannelDetail() {
        return StringUtils.hasText((String)this.renewChannelDetail) ? this.renewChannelDetail : this.renewChannelName;
    }

    @Generated
    public EmbyUserRenewRecordResponse() {
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
    public String getRenewChannelName() {
        return this.renewChannelName;
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
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
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
    public void setRenewChannelName(String renewChannelName) {
        this.renewChannelName = renewChannelName;
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

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserRenewRecordResponse)) {
            return false;
        }
        EmbyUserRenewRecordResponse other = (EmbyUserRenewRecordResponse)o;
        if (!other.canEqual(this)) {
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
        String this$renewChannelName = this.getRenewChannelName();
        String other$renewChannelName = other.getRenewChannelName();
        if (this$renewChannelName == null ? other$renewChannelName != null : !this$renewChannelName.equals(other$renewChannelName)) {
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
        if (this$expirationDateAfter == null ? other$expirationDateAfter != null : !((Object)this$expirationDateAfter).equals(other$expirationDateAfter)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserRenewRecordResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        String $renewChannelName = this.getRenewChannelName();
        result = result * 59 + ($renewChannelName == null ? 43 : $renewChannelName.hashCode());
        String $renewChannelDetail = this.getRenewChannelDetail();
        result = result * 59 + ($renewChannelDetail == null ? 43 : $renewChannelDetail.hashCode());
        Date $expirationDateBefore = this.getExpirationDateBefore();
        result = result * 59 + ($expirationDateBefore == null ? 43 : ((Object)$expirationDateBefore).hashCode());
        Date $expirationDateAfter = this.getExpirationDateAfter();
        result = result * 59 + ($expirationDateAfter == null ? 43 : ((Object)$expirationDateAfter).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserRenewRecordResponse(id=" + this.getId() + ", userId=" + this.getUserId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", renewChannel=" + this.getRenewChannel() + ", renewChannelName=" + this.getRenewChannelName() + ", renewChannelDetail=" + this.getRenewChannelDetail() + ", renewDays=" + this.getRenewDays() + ", expirationDateBefore=" + String.valueOf(this.getExpirationDateBefore()) + ", expirationDateAfter=" + String.valueOf(this.getExpirationDateAfter()) + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
