/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.wechatipconfig;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class WeChatIpConfigResponse
implements Serializable {
    private Long id;
    private String corpId;
    private String corpName;
    private String appIds;
    private String lastIp;
    private Date lastIpUpdateTime;
    private Integer enabled;
    private String remark;
    private Date createDatetime;
    private Date updateDatetime;

    @Generated
    public WeChatIpConfigResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getCorpId() {
        return this.corpId;
    }

    @Generated
    public String getCorpName() {
        return this.corpName;
    }

    @Generated
    public String getAppIds() {
        return this.appIds;
    }

    @Generated
    public String getLastIp() {
        return this.lastIp;
    }

    @Generated
    public Date getLastIpUpdateTime() {
        return this.lastIpUpdateTime;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public String getRemark() {
        return this.remark;
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
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    @Generated
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    @Generated
    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    @Generated
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    @Generated
    public void setLastIpUpdateTime(Date lastIpUpdateTime) {
        this.lastIpUpdateTime = lastIpUpdateTime;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WeChatIpConfigResponse)) {
            return false;
        }
        WeChatIpConfigResponse other = (WeChatIpConfigResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$corpId = this.getCorpId();
        String other$corpId = other.getCorpId();
        if (this$corpId == null ? other$corpId != null : !this$corpId.equals(other$corpId)) {
            return false;
        }
        String this$corpName = this.getCorpName();
        String other$corpName = other.getCorpName();
        if (this$corpName == null ? other$corpName != null : !this$corpName.equals(other$corpName)) {
            return false;
        }
        String this$appIds = this.getAppIds();
        String other$appIds = other.getAppIds();
        if (this$appIds == null ? other$appIds != null : !this$appIds.equals(other$appIds)) {
            return false;
        }
        String this$lastIp = this.getLastIp();
        String other$lastIp = other.getLastIp();
        if (this$lastIp == null ? other$lastIp != null : !this$lastIp.equals(other$lastIp)) {
            return false;
        }
        Date this$lastIpUpdateTime = this.getLastIpUpdateTime();
        Date other$lastIpUpdateTime = other.getLastIpUpdateTime();
        if (this$lastIpUpdateTime == null ? other$lastIpUpdateTime != null : !((Object)this$lastIpUpdateTime).equals(other$lastIpUpdateTime)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        return !(this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WeChatIpConfigResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $corpId = this.getCorpId();
        result = result * 59 + ($corpId == null ? 43 : $corpId.hashCode());
        String $corpName = this.getCorpName();
        result = result * 59 + ($corpName == null ? 43 : $corpName.hashCode());
        String $appIds = this.getAppIds();
        result = result * 59 + ($appIds == null ? 43 : $appIds.hashCode());
        String $lastIp = this.getLastIp();
        result = result * 59 + ($lastIp == null ? 43 : $lastIp.hashCode());
        Date $lastIpUpdateTime = this.getLastIpUpdateTime();
        result = result * 59 + ($lastIpUpdateTime == null ? 43 : ((Object)$lastIpUpdateTime).hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WeChatIpConfigResponse(id=" + this.getId() + ", corpId=" + this.getCorpId() + ", corpName=" + this.getCorpName() + ", appIds=" + this.getAppIds() + ", lastIp=" + this.getLastIp() + ", lastIpUpdateTime=" + String.valueOf(this.getLastIpUpdateTime()) + ", enabled=" + this.getEnabled() + ", remark=" + this.getRemark() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ")";
    }
}
