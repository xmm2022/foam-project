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

@TableName(value="tmdb_watch_progress")
public class TmdbWatchProgress
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type=IdType.AUTO)
    private Long id;
    @TableField(value="follow_id")
    private Long followId;
    @TableField(value="watcher_name")
    private String watcherName;
    @Deprecated
    @TableField(value="season_number")
    private Integer seasonNumber;
    @Deprecated
    @TableField(value="episode_number")
    private Integer episodeNumber;
    @TableField(value="watched_episodes")
    private String watchedEpisodes;

    @Generated
    public TmdbWatchProgress() {
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
    public String getWatcherName() {
        return this.watcherName;
    }

    @Deprecated
    @Generated
    public Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    @Deprecated
    @Generated
    public Integer getEpisodeNumber() {
        return this.episodeNumber;
    }

    @Generated
    public String getWatchedEpisodes() {
        return this.watchedEpisodes;
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
    public void setWatcherName(String watcherName) {
        this.watcherName = watcherName;
    }

    @Deprecated
    @Generated
    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Deprecated
    @Generated
    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @Generated
    public void setWatchedEpisodes(String watchedEpisodes) {
        this.watchedEpisodes = watchedEpisodes;
    }

    @Override
    @Generated
    public String toString() {
        return "TmdbWatchProgress(id=" + this.getId() + ", followId=" + this.getFollowId() + ", watcherName=" + this.getWatcherName() + ", seasonNumber=" + this.getSeasonNumber() + ", episodeNumber=" + this.getEpisodeNumber() + ", watchedEpisodes=" + this.getWatchedEpisodes() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbWatchProgress)) {
            return false;
        }
        TmdbWatchProgress other = (TmdbWatchProgress)o;
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
        String this$watcherName = this.getWatcherName();
        String other$watcherName = other.getWatcherName();
        if (this$watcherName == null ? other$watcherName != null : !this$watcherName.equals(other$watcherName)) {
            return false;
        }
        String this$watchedEpisodes = this.getWatchedEpisodes();
        String other$watchedEpisodes = other.getWatchedEpisodes();
        return !(this$watchedEpisodes == null ? other$watchedEpisodes != null : !this$watchedEpisodes.equals(other$watchedEpisodes));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbWatchProgress;
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
        Integer $seasonNumber = this.getSeasonNumber();
        result = result * 59 + ($seasonNumber == null ? 43 : ((Object)$seasonNumber).hashCode());
        Integer $episodeNumber = this.getEpisodeNumber();
        result = result * 59 + ($episodeNumber == null ? 43 : ((Object)$episodeNumber).hashCode());
        String $watcherName = this.getWatcherName();
        result = result * 59 + ($watcherName == null ? 43 : $watcherName.hashCode());
        String $watchedEpisodes = this.getWatchedEpisodes();
        result = result * 59 + ($watchedEpisodes == null ? 43 : $watchedEpisodes.hashCode());
        return result;
    }
}
