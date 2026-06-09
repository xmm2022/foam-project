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
import java.util.Date;
import lombok.Generated;

@TableName(value="tmdb_season")
public class TmdbSeason
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type=IdType.AUTO)
    private Long id;
    @TableField(value="follow_id")
    private Long followId;
    @TableField(value="tmdb_id")
    private Integer tmdbId;
    @TableField(value="season_number")
    private Integer seasonNumber;
    @TableField(value="name")
    private String name;
    @TableField(value="overview")
    private String overview;
    @TableField(value="poster_path")
    private String posterPath;
    @TableField(value="air_date")
    private Date airDate;
    @TableField(value="episode_count")
    private Integer episodeCount;
    @TableField(value="casts")
    private String casts;

    @Generated
    public TmdbSeason() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getFollowId() {
        return this.followId;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public String getPosterPath() {
        return this.posterPath;
    }

    @Generated
    public Date getAirDate() {
        return this.airDate;
    }

    @Generated
    public Integer getEpisodeCount() {
        return this.episodeCount;
    }

    @Generated
    public String getCasts() {
        return this.casts;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @Generated
    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    @Generated
    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    @Generated
    public void setCasts(String casts) {
        this.casts = casts;
    }

    @Override
    @Generated
    public String toString() {
        return "TmdbSeason(id=" + this.getId() + ", followId=" + this.getFollowId() + ", tmdbId=" + this.getTmdbId() + ", seasonNumber=" + this.getSeasonNumber() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", posterPath=" + this.getPosterPath() + ", airDate=" + String.valueOf(this.getAirDate()) + ", episodeCount=" + this.getEpisodeCount() + ", casts=" + this.getCasts() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbSeason)) {
            return false;
        }
        TmdbSeason other = (TmdbSeason)o;
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
        Long this$followId = this.getFollowId();
        Long other$followId = other.getFollowId();
        if (this$followId == null ? other$followId != null : !((Object)this$followId).equals(other$followId)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Integer this$seasonNumber = this.getSeasonNumber();
        Integer other$seasonNumber = other.getSeasonNumber();
        if (this$seasonNumber == null ? other$seasonNumber != null : !((Object)this$seasonNumber).equals(other$seasonNumber)) {
            return false;
        }
        Integer this$episodeCount = this.getEpisodeCount();
        Integer other$episodeCount = other.getEpisodeCount();
        if (this$episodeCount == null ? other$episodeCount != null : !((Object)this$episodeCount).equals(other$episodeCount)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$overview = this.getOverview();
        String other$overview = other.getOverview();
        if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
            return false;
        }
        String this$posterPath = this.getPosterPath();
        String other$posterPath = other.getPosterPath();
        if (this$posterPath == null ? other$posterPath != null : !this$posterPath.equals(other$posterPath)) {
            return false;
        }
        Date this$airDate = this.getAirDate();
        Date other$airDate = other.getAirDate();
        if (this$airDate == null ? other$airDate != null : !((Object)this$airDate).equals(other$airDate)) {
            return false;
        }
        String this$casts = this.getCasts();
        String other$casts = other.getCasts();
        return !(this$casts == null ? other$casts != null : !this$casts.equals(other$casts));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbSeason;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $followId = this.getFollowId();
        result = result * 59 + ($followId == null ? 43 : ((Object)$followId).hashCode());
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Integer $seasonNumber = this.getSeasonNumber();
        result = result * 59 + ($seasonNumber == null ? 43 : ((Object)$seasonNumber).hashCode());
        Integer $episodeCount = this.getEpisodeCount();
        result = result * 59 + ($episodeCount == null ? 43 : ((Object)$episodeCount).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $posterPath = this.getPosterPath();
        result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
        Date $airDate = this.getAirDate();
        result = result * 59 + ($airDate == null ? 43 : ((Object)$airDate).hashCode());
        String $casts = this.getCasts();
        result = result * 59 + ($casts == null ? 43 : $casts.hashCode());
        return result;
    }
}
