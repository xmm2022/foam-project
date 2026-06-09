/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyinfo;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyInfoResponse
implements Serializable {
    private Long id;
    private String embyUrl;
    private String embyPort;
    private String embyAgreement;
    private String serverName;
    private String embyServerId;
    private Integer status;
    private Long userId;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;
    private String embyApikey;
    private Integer enabled;
    private String copyfromuserid;
    private Integer spread;
    private Long lineCount;
    private String adminQueryUserid;

    @Generated
    public EmbyInfoResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getEmbyUrl() {
        return this.embyUrl;
    }

    @Generated
    public String getEmbyPort() {
        return this.embyPort;
    }

    @Generated
    public String getEmbyAgreement() {
        return this.embyAgreement;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getEmbyServerId() {
        return this.embyServerId;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
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
    public String getEmbyApikey() {
        return this.embyApikey;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public String getCopyfromuserid() {
        return this.copyfromuserid;
    }

    @Generated
    public Integer getSpread() {
        return this.spread;
    }

    @Generated
    public Long getLineCount() {
        return this.lineCount;
    }

    @Generated
    public String getAdminQueryUserid() {
        return this.adminQueryUserid;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyUrl(String embyUrl) {
        this.embyUrl = embyUrl;
    }

    @Generated
    public void setEmbyPort(String embyPort) {
        this.embyPort = embyPort;
    }

    @Generated
    public void setEmbyAgreement(String embyAgreement) {
        this.embyAgreement = embyAgreement;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
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
    public void setEmbyApikey(String embyApikey) {
        this.embyApikey = embyApikey;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setCopyfromuserid(String copyfromuserid) {
        this.copyfromuserid = copyfromuserid;
    }

    @Generated
    public void setSpread(Integer spread) {
        this.spread = spread;
    }

    @Generated
    public void setLineCount(Long lineCount) {
        this.lineCount = lineCount;
    }

    @Generated
    public void setAdminQueryUserid(String adminQueryUserid) {
        this.adminQueryUserid = adminQueryUserid;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyInfoResponse)) {
            return false;
        }
        EmbyInfoResponse other = (EmbyInfoResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
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
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Integer this$spread = this.getSpread();
        Integer other$spread = other.getSpread();
        if (this$spread == null ? other$spread != null : !((Object)this$spread).equals(other$spread)) {
            return false;
        }
        Long this$lineCount = this.getLineCount();
        Long other$lineCount = other.getLineCount();
        if (this$lineCount == null ? other$lineCount != null : !((Object)this$lineCount).equals(other$lineCount)) {
            return false;
        }
        String this$embyUrl = this.getEmbyUrl();
        String other$embyUrl = other.getEmbyUrl();
        if (this$embyUrl == null ? other$embyUrl != null : !this$embyUrl.equals(other$embyUrl)) {
            return false;
        }
        String this$embyPort = this.getEmbyPort();
        String other$embyPort = other.getEmbyPort();
        if (this$embyPort == null ? other$embyPort != null : !this$embyPort.equals(other$embyPort)) {
            return false;
        }
        String this$embyAgreement = this.getEmbyAgreement();
        String other$embyAgreement = other.getEmbyAgreement();
        if (this$embyAgreement == null ? other$embyAgreement != null : !this$embyAgreement.equals(other$embyAgreement)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
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
        String this$embyApikey = this.getEmbyApikey();
        String other$embyApikey = other.getEmbyApikey();
        if (this$embyApikey == null ? other$embyApikey != null : !this$embyApikey.equals(other$embyApikey)) {
            return false;
        }
        String this$copyfromuserid = this.getCopyfromuserid();
        String other$copyfromuserid = other.getCopyfromuserid();
        if (this$copyfromuserid == null ? other$copyfromuserid != null : !this$copyfromuserid.equals(other$copyfromuserid)) {
            return false;
        }
        String this$adminQueryUserid = this.getAdminQueryUserid();
        String other$adminQueryUserid = other.getAdminQueryUserid();
        return !(this$adminQueryUserid == null ? other$adminQueryUserid != null : !this$adminQueryUserid.equals(other$adminQueryUserid));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyInfoResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $spread = this.getSpread();
        result = result * 59 + ($spread == null ? 43 : ((Object)$spread).hashCode());
        Long $lineCount = this.getLineCount();
        result = result * 59 + ($lineCount == null ? 43 : ((Object)$lineCount).hashCode());
        String $embyUrl = this.getEmbyUrl();
        result = result * 59 + ($embyUrl == null ? 43 : $embyUrl.hashCode());
        String $embyPort = this.getEmbyPort();
        result = result * 59 + ($embyPort == null ? 43 : $embyPort.hashCode());
        String $embyAgreement = this.getEmbyAgreement();
        result = result * 59 + ($embyAgreement == null ? 43 : $embyAgreement.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        String $embyApikey = this.getEmbyApikey();
        result = result * 59 + ($embyApikey == null ? 43 : $embyApikey.hashCode());
        String $copyfromuserid = this.getCopyfromuserid();
        result = result * 59 + ($copyfromuserid == null ? 43 : $copyfromuserid.hashCode());
        String $adminQueryUserid = this.getAdminQueryUserid();
        result = result * 59 + ($adminQueryUserid == null ? 43 : $adminQueryUserid.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyInfoResponse(id=" + this.getId() + ", embyUrl=" + this.getEmbyUrl() + ", embyPort=" + this.getEmbyPort() + ", embyAgreement=" + this.getEmbyAgreement() + ", serverName=" + this.getServerName() + ", embyServerId=" + this.getEmbyServerId() + ", status=" + this.getStatus() + ", userId=" + this.getUserId() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ", embyApikey=" + this.getEmbyApikey() + ", enabled=" + this.getEnabled() + ", copyfromuserid=" + this.getCopyfromuserid() + ", spread=" + this.getSpread() + ", lineCount=" + this.getLineCount() + ", adminQueryUserid=" + this.getAdminQueryUserid() + ")";
    }
}
