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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import lombok.Generated;

@TableName(value="wechat_ip_config")
public class WeChatIpConfig
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="corp_id")
    private String corpId;
    @TableField(value="corp_name")
    private String corpName;
    @TableField(value="app_ids")
    private String appIds;
    @TableField(value="last_ip")
    private String lastIp;
    @TableField(value="last_ip_update_time")
    private Date lastIpUpdateTime;
    @TableField(value="enabled")
    private Integer enabled;
    @TableField(value="remark")
    private String remark;
    public static final String COL_ID = "id";
    public static final String COL_CORP_ID = "corp_id";
    public static final String COL_CORP_NAME = "corp_name";
    public static final String COL_APP_IDS = "app_ids";
    public static final String COL_LAST_IP = "last_ip";
    public static final String COL_LAST_IP_UPDATE_TIME = "last_ip_update_time";
    public static final String COL_ENABLED = "enabled";
    public static final String COL_REMARK = "remark";

    public List<String> getAppIdList() {
        if (this.appIds == null || this.appIds.isEmpty()) {
            return List.of();
        }
        return Arrays.stream(this.appIds.split(",")).map(String::trim).filter(s -> !s.isEmpty()).toList();
    }

    @Generated
    public WeChatIpConfig() {
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

    @Override
    @Generated
    public String toString() {
        return "WeChatIpConfig(id=" + this.getId() + ", corpId=" + this.getCorpId() + ", corpName=" + this.getCorpName() + ", appIds=" + this.getAppIds() + ", lastIp=" + this.getLastIp() + ", lastIpUpdateTime=" + String.valueOf(this.getLastIpUpdateTime()) + ", enabled=" + this.getEnabled() + ", remark=" + this.getRemark() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WeChatIpConfig)) {
            return false;
        }
        WeChatIpConfig other = (WeChatIpConfig)o;
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
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WeChatIpConfig;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
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
        return result;
    }
}
