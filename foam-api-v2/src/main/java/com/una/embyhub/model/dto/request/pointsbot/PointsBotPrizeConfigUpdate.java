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

public class PointsBotPrizeConfigUpdate
implements Serializable {
    @NotNull(message="\u5956\u54c1\u914d\u7f6eID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u5956\u54c1\u914d\u7f6eID\u4e0d\u80fd\u4e3a\u7a7a") Long id;
    private String prizeName;
    private Integer requiredPoints;
    private Long levelId;
    private Integer totalQuantity;
    private Integer remainingQuantity;
    private Integer enabled;
    private Integer sort;
    private String remark;

    @Generated
    public PointsBotPrizeConfigUpdate() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getPrizeName() {
        return this.prizeName;
    }

    @Generated
    public Integer getRequiredPoints() {
        return this.requiredPoints;
    }

    @Generated
    public Long getLevelId() {
        return this.levelId;
    }

    @Generated
    public Integer getTotalQuantity() {
        return this.totalQuantity;
    }

    @Generated
    public Integer getRemainingQuantity() {
        return this.remainingQuantity;
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
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    @Generated
    public void setRequiredPoints(Integer requiredPoints) {
        this.requiredPoints = requiredPoints;
    }

    @Generated
    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    @Generated
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Generated
    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
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
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotPrizeConfigUpdate)) {
            return false;
        }
        PointsBotPrizeConfigUpdate other = (PointsBotPrizeConfigUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$requiredPoints = this.getRequiredPoints();
        Integer other$requiredPoints = other.getRequiredPoints();
        if (this$requiredPoints == null ? other$requiredPoints != null : !((Object)this$requiredPoints).equals(other$requiredPoints)) {
            return false;
        }
        Long this$levelId = this.getLevelId();
        Long other$levelId = other.getLevelId();
        if (this$levelId == null ? other$levelId != null : !((Object)this$levelId).equals(other$levelId)) {
            return false;
        }
        Integer this$totalQuantity = this.getTotalQuantity();
        Integer other$totalQuantity = other.getTotalQuantity();
        if (this$totalQuantity == null ? other$totalQuantity != null : !((Object)this$totalQuantity).equals(other$totalQuantity)) {
            return false;
        }
        Integer this$remainingQuantity = this.getRemainingQuantity();
        Integer other$remainingQuantity = other.getRemainingQuantity();
        if (this$remainingQuantity == null ? other$remainingQuantity != null : !((Object)this$remainingQuantity).equals(other$remainingQuantity)) {
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
        String this$prizeName = this.getPrizeName();
        String other$prizeName = other.getPrizeName();
        if (this$prizeName == null ? other$prizeName != null : !this$prizeName.equals(other$prizeName)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotPrizeConfigUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $requiredPoints = this.getRequiredPoints();
        result = result * 59 + ($requiredPoints == null ? 43 : ((Object)$requiredPoints).hashCode());
        Long $levelId = this.getLevelId();
        result = result * 59 + ($levelId == null ? 43 : ((Object)$levelId).hashCode());
        Integer $totalQuantity = this.getTotalQuantity();
        result = result * 59 + ($totalQuantity == null ? 43 : ((Object)$totalQuantity).hashCode());
        Integer $remainingQuantity = this.getRemainingQuantity();
        result = result * 59 + ($remainingQuantity == null ? 43 : ((Object)$remainingQuantity).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        String $prizeName = this.getPrizeName();
        result = result * 59 + ($prizeName == null ? 43 : $prizeName.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotPrizeConfigUpdate(id=" + this.getId() + ", prizeName=" + this.getPrizeName() + ", requiredPoints=" + this.getRequiredPoints() + ", levelId=" + this.getLevelId() + ", totalQuantity=" + this.getTotalQuantity() + ", remainingQuantity=" + this.getRemainingQuantity() + ", enabled=" + this.getEnabled() + ", sort=" + this.getSort() + ", remark=" + this.getRemark() + ")";
    }
}
