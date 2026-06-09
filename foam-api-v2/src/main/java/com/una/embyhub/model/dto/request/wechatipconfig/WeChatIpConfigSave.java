/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.wechatipconfig;

import java.io.Serializable;
import lombok.Generated;

public class WeChatIpConfigSave
implements Serializable {
    private String corpId;
    private String corpName;
    private String appIds;
    private Integer enabled;
    private String remark;

    @Generated
    public WeChatIpConfigSave() {
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
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public String getRemark() {
        return this.remark;
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
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WeChatIpConfigSave)) {
            return false;
        }
        WeChatIpConfigSave other = (WeChatIpConfigSave)o;
        if (!other.canEqual(this)) {
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
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WeChatIpConfigSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $corpId = this.getCorpId();
        result = result * 59 + ($corpId == null ? 43 : $corpId.hashCode());
        String $corpName = this.getCorpName();
        result = result * 59 + ($corpName == null ? 43 : $corpName.hashCode());
        String $appIds = this.getAppIds();
        result = result * 59 + ($appIds == null ? 43 : $appIds.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WeChatIpConfigSave(corpId=" + this.getCorpId() + ", corpName=" + this.getCorpName() + ", appIds=" + this.getAppIds() + ", enabled=" + this.getEnabled() + ", remark=" + this.getRemark() + ")";
    }
}
