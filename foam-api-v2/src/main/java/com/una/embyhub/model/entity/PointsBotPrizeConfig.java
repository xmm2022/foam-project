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
import lombok.Generated;

@TableName(value="points_bot_prize_config")
public class PointsBotPrizeConfig
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="prize_name")
    private String prizeName;
    @TableField(value="required_points")
    private Integer requiredPoints;
    @TableField(value="level_id")
    private Long levelId;
    @TableField(value="total_quantity")
    private Integer totalQuantity;
    @TableField(value="remaining_quantity")
    private Integer remainingQuantity;
    @TableField(value="enabled")
    private Integer enabled;
    @TableField(value="sort")
    private Integer sort;
    @TableField(value="remark")
    private String remark;

    @Generated
    public PointsBotPrizeConfig() {
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

    @Override
    @Generated
    public String toString() {
        return "PointsBotPrizeConfig(id=" + this.getId() + ", prizeName=" + this.getPrizeName() + ", requiredPoints=" + this.getRequiredPoints() + ", levelId=" + this.getLevelId() + ", totalQuantity=" + this.getTotalQuantity() + ", remainingQuantity=" + this.getRemainingQuantity() + ", enabled=" + this.getEnabled() + ", sort=" + this.getSort() + ", remark=" + this.getRemark() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotPrizeConfig)) {
            return false;
        }
        PointsBotPrizeConfig other = (PointsBotPrizeConfig)o;
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

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotPrizeConfig;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
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
}
