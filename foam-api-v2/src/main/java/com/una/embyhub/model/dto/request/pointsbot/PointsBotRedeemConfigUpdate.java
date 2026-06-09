/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class PointsBotRedeemConfigUpdate
implements Serializable {
    @NotNull(message="\u914d\u7f6eID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u914d\u7f6eID\u4e0d\u80fd\u4e3a\u7a7a") Long id;
    private String configName;
    private Integer redeemDays;
    private Long embyInfoId;
    private Integer enabled;
    private Integer sort;
    private Integer requiredPoints;
    private String remark;

    @Generated
    public PointsBotRedeemConfigUpdate() {
    }

    @Generated
    public Long getId() {
        return this.id;
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
    public void setId(Long id) {
        this.id = id;
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
        if (!(o instanceof PointsBotRedeemConfigUpdate)) {
            return false;
        }
        PointsBotRedeemConfigUpdate other = (PointsBotRedeemConfigUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        return other instanceof PointsBotRedeemConfigUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
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
        return "PointsBotRedeemConfigUpdate(id=" + this.getId() + ", configName=" + this.getConfigName() + ", redeemDays=" + this.getRedeemDays() + ", embyInfoId=" + this.getEmbyInfoId() + ", enabled=" + this.getEnabled() + ", sort=" + this.getSort() + ", requiredPoints=" + this.getRequiredPoints() + ", remark=" + this.getRemark() + ")";
    }
}
