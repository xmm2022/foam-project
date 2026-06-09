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

@TableName(value="points_bot_level_config")
public class PointsBotLevelConfig
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="level_name")
    private String levelName;
    @TableField(value="min_points")
    private Integer minPoints;
    @TableField(value="enabled")
    private Integer enabled;
    @TableField(value="sort")
    private Integer sort;
    @TableField(value="remark")
    private String remark;

    @Generated
    public PointsBotLevelConfig() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getLevelName() {
        return this.levelName;
    }

    @Generated
    public Integer getMinPoints() {
        return this.minPoints;
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
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Generated
    public void setMinPoints(Integer minPoints) {
        this.minPoints = minPoints;
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
        return "PointsBotLevelConfig(id=" + this.getId() + ", levelName=" + this.getLevelName() + ", minPoints=" + this.getMinPoints() + ", enabled=" + this.getEnabled() + ", sort=" + this.getSort() + ", remark=" + this.getRemark() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLevelConfig)) {
            return false;
        }
        PointsBotLevelConfig other = (PointsBotLevelConfig)o;
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
        Integer this$minPoints = this.getMinPoints();
        Integer other$minPoints = other.getMinPoints();
        if (this$minPoints == null ? other$minPoints != null : !((Object)this$minPoints).equals(other$minPoints)) {
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
        String this$levelName = this.getLevelName();
        String other$levelName = other.getLevelName();
        if (this$levelName == null ? other$levelName != null : !this$levelName.equals(other$levelName)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLevelConfig;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $minPoints = this.getMinPoints();
        result = result * 59 + ($minPoints == null ? 43 : ((Object)$minPoints).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        String $levelName = this.getLevelName();
        result = result * 59 + ($levelName == null ? 43 : $levelName.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }
}
