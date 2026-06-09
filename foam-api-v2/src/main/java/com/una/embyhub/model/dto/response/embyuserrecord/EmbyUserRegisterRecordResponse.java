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
import com.una.embyhub.config.common.enums.RegisterChannelEnum;
import com.una.embyhub.model.entity.EmbyInfo;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;
import org.springframework.util.StringUtils;

public class EmbyUserRegisterRecordResponse
implements Serializable {
    private Long id;
    private Long userId;
    private String embyUserId;
    private String embyUserName;
    private Integer registerChannel;
    private String registerChannelName;
    private String registerChannelDetail;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private String remarks;
    private Date expirationDate;
    private Date createDatetime;

    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
        this.registerChannelName = RegisterChannelEnum.resolveLabel(registerChannel);
    }

    public String getRegisterChannelDetail() {
        return StringUtils.hasText((String)this.registerChannelDetail) ? this.registerChannelDetail : this.registerChannelName;
    }

    @Generated
    public EmbyUserRegisterRecordResponse() {
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
    public String getRegisterChannelName() {
        return this.registerChannelName;
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
    public String getRemarks() {
        return this.remarks;
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
    public void setRegisterChannelName(String registerChannelName) {
        this.registerChannelName = registerChannelName;
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
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserRegisterRecordResponse)) {
            return false;
        }
        EmbyUserRegisterRecordResponse other = (EmbyUserRegisterRecordResponse)o;
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
        String this$registerChannelName = this.getRegisterChannelName();
        String other$registerChannelName = other.getRegisterChannelName();
        if (this$registerChannelName == null ? other$registerChannelName != null : !this$registerChannelName.equals(other$registerChannelName)) {
            return false;
        }
        String this$registerChannelDetail = this.getRegisterChannelDetail();
        String other$registerChannelDetail = other.getRegisterChannelDetail();
        if (this$registerChannelDetail == null ? other$registerChannelDetail != null : !this$registerChannelDetail.equals(other$registerChannelDetail)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        Date this$expirationDate = this.getExpirationDate();
        Date other$expirationDate = other.getExpirationDate();
        if (this$expirationDate == null ? other$expirationDate != null : !((Object)this$expirationDate).equals(other$expirationDate)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserRegisterRecordResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        String $registerChannelName = this.getRegisterChannelName();
        result = result * 59 + ($registerChannelName == null ? 43 : $registerChannelName.hashCode());
        String $registerChannelDetail = this.getRegisterChannelDetail();
        result = result * 59 + ($registerChannelDetail == null ? 43 : $registerChannelDetail.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserRegisterRecordResponse(id=" + this.getId() + ", userId=" + this.getUserId() + ", embyUserId=" + this.getEmbyUserId() + ", embyUserName=" + this.getEmbyUserName() + ", registerChannel=" + this.getRegisterChannel() + ", registerChannelName=" + this.getRegisterChannelName() + ", registerChannelDetail=" + this.getRegisterChannelDetail() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", remarks=" + this.getRemarks() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
