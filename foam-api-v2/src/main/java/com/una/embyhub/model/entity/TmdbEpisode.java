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

@TableName(value="tmdb_episode")
public class TmdbEpisode
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
    @TableField(value="episode_number")
    private Integer episodeNumber;
    @TableField(value="name")
    private String name;
    @TableField(value="overview")
    private String overview;
    @TableField(value="air_date")
    private Date airDate;
    @TableField(value="still_path")
    private String stillPath;

    @Generated
    public TmdbEpisode() {
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
    public Integer getEpisodeNumber() {
        return this.episodeNumber;
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
    public Date getAirDate() {
        return this.airDate;
    }

    @Generated
    public String getStillPath() {
        return this.stillPath;
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
    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
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
    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    @Generated
    public void setStillPath(String stillPath) {
        this.stillPath = stillPath;
    }

    @Override
    @Generated
    public String toString() {
        return "TmdbEpisode(id=" + this.getId() + ", followId=" + this.getFollowId() + ", tmdbId=" + this.getTmdbId() + ", seasonNumber=" + this.getSeasonNumber() + ", episodeNumber=" + this.getEpisodeNumber() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", airDate=" + String.valueOf(this.getAirDate()) + ", stillPath=" + this.getStillPath() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbEpisode)) {
            return false;
        }
        TmdbEpisode other = (TmdbEpisode)o;
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
        Integer this$episodeNumber = this.getEpisodeNumber();
        Integer other$episodeNumber = other.getEpisodeNumber();
        if (this$episodeNumber == null ? other$episodeNumber != null : !((Object)this$episodeNumber).equals(other$episodeNumber)) {
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
        Date this$airDate = this.getAirDate();
        Date other$airDate = other.getAirDate();
        if (this$airDate == null ? other$airDate != null : !((Object)this$airDate).equals(other$airDate)) {
            return false;
        }
        String this$stillPath = this.getStillPath();
        String other$stillPath = other.getStillPath();
        return !(this$stillPath == null ? other$stillPath != null : !this$stillPath.equals(other$stillPath));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbEpisode;
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
        Integer $episodeNumber = this.getEpisodeNumber();
        result = result * 59 + ($episodeNumber == null ? 43 : ((Object)$episodeNumber).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        Date $airDate = this.getAirDate();
        result = result * 59 + ($airDate == null ? 43 : ((Object)$airDate).hashCode());
        String $stillPath = this.getStillPath();
        result = result * 59 + ($stillPath == null ? 43 : $stillPath.hashCode());
        return result;
    }
}
