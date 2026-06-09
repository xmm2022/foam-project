/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class PointsBotRedeemConfigSave
implements Serializable {
    @NotBlank(message="\u914d\u7f6e\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u914d\u7f6e\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a") String configName;
    @NotNull(message="\u5151\u6362\u5929\u6570\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u5151\u6362\u5929\u6570\u4e0d\u80fd\u4e3a\u7a7a") Integer redeemDays;
    @NotNull(message="Emby\u670d\u52a1\u5668ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="Emby\u670d\u52a1\u5668ID\u4e0d\u80fd\u4e3a\u7a7a") Long embyInfoId;
    @NotNull(message="\u542f\u7528\u72b6\u6001\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u542f\u7528\u72b6\u6001\u4e0d\u80fd\u4e3a\u7a7a") Integer enabled;
    private Integer sort;
    private Integer requiredPoints;
    private String remark;

    @Generated
    public PointsBotRedeemConfigSave() {
    }

    @Generated
    public String getConfigName() {
        return this.configName;
    }

    @Generated
    public Integer getRedeemDays() {
        return this.redeemDays;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public Integer getSort() {
        return this.sort;
    }

    @Generated
    public Integer getRequiredPoints() {
        return this.requiredPoints;
    }

    @Generated
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    @Generated
    public void setRedeemDays(Integer redeemDays) {
        this.redeemDays = redeemDays;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated
    public void setRequiredPoints(Integer requiredPoints) {
        this.requiredPoints = requiredPoints;
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
        if (!(o instanceof PointsBotRedeemConfigSave)) {
            return false;
        }
        PointsBotRedeemConfigSave other = (PointsBotRedeemConfigSave)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$redeemDays = this.getRedeemDays();
        Integer other$redeemDays = other.getRedeemDays();
        if (this$redeemDays == null ? other$redeemDays != null : !((Object)this$redeemDays).equals(other$redeemDays)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Integer this$requiredPoints = this.getRequiredPoints();
        Integer other$requiredPoints = other.getRequiredPoints();
        if (this$requiredPoints == null ? other$requiredPoints != null : !((Object)this$requiredPoints).equals(other$requiredPoints)) {
            return false;
        }
        String this$configName = this.getConfigName();
        String other$configName = other.getConfigName();
        if (this$configName == null ? other$configName != null : !this$configName.equals(other$configName)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotRedeemConfigSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $redeemDays = this.getRedeemDays();
        result = result * 59 + ($redeemDays == null ? 43 : ((Object)$redeemDays).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Integer $requiredPoints = this.getRequiredPoints();
        result = result * 59 + ($requiredPoints == null ? 43 : ((Object)$requiredPoints).hashCode());
        String $configName = this.getConfigName();
        result = result * 59 + ($configName == null ? 43 : $configName.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotRedeemConfigSave(configName=" + this.getConfigName() + ", redeemDays=" + this.getRedeemDays() + ", embyInfoId=" + this.getEmbyInfoId() + ", enabled=" + this.getEnabled() + ", sort=" + this.getSort() + ", requiredPoints=" + this.getRequiredPoints() + ", remark=" + this.getRemark() + ")";
    }
}
