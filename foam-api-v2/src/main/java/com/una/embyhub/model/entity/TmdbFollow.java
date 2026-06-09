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

@TableName(value="tmdb_follow")
public class TmdbFollow
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type=IdType.AUTO)
    private Long id;
    @TableField(value="tmdb_id")
    private Integer tmdbId;
    @TableField(value="media_type")
    private String mediaType;
    @TableField(value="name")
    private String name;
    @TableField(value="original_name")
    private String originalName;
    @TableField(value="poster_path")
    private String posterPath;
    @TableField(value="backdrop_path")
    private String backdropPath;
    @TableField(value="overview")
    private String overview;
    @TableField(value="next_air_date")
    private Date nextAirDate;
    @TableField(value="next_season_number")
    private Integer nextSeasonNumber;
    @TableField(value="next_episode_number")
    private Integer nextEpisodeNumber;
    @TableField(value="last_notified_season")
    private Integer lastNotifiedSeason;
    @TableField(value="last_notified_episode")
    private Integer lastNotifiedEpisode;
    @TableField(value="language")
    private String language;
    @TableField(value="notify_channels")
    private String notifyChannels;
    @TableField(value="status")
    private Integer status;
    @TableField(value="last_sync_time")
    private Date lastSyncTime;
    @TableField(value="subscriber_name")
    private String subscriberName;
    @TableField(value="release_date")
    private Date releaseDate;
    @TableField(value="runtime_minutes")
    private Integer runtimeMinutes;
    @TableField(value="release_notified")
    private Boolean releaseNotified;
    @TableField(value="latest_season_number")
    private Integer latestSeasonNumber;
    @TableField(value="latest_season_name")
    private String latestSeasonName;
    @TableField(value="latest_season_overview")
    private String latestSeasonOverview;
    @TableField(value="latest_season_poster_path")
    private String latestSeasonPosterPath;

    @Generated
    public TmdbFollow() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public String getMediaType() {
        return this.mediaType;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getOriginalName() {
        return this.originalName;
    }

    @Generated
    public String getPosterPath() {
        return this.posterPath;
    }

    @Generated
    public String getBackdropPath() {
        return this.backdropPath;
    }

    @Generated
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public Date getNextAirDate() {
        return this.nextAirDate;
    }

    @Generated
    public Integer getNextSeasonNumber() {
        return this.nextSeasonNumber;
    }

    @Generated
    public Integer getNextEpisodeNumber() {
        return this.nextEpisodeNumber;
    }

    @Generated
    public Integer getLastNotifiedSeason() {
        return this.lastNotifiedSeason;
    }

    @Generated
    public Integer getLastNotifiedEpisode() {
        return this.lastNotifiedEpisode;
    }

    @Generated
    public String getLanguage() {
        return this.language;
    }

    @Generated
    public String getNotifyChannels() {
        return this.notifyChannels;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Date getLastSyncTime() {
        return this.lastSyncTime;
    }

    @Generated
    public String getSubscriberName() {
        return this.subscriberName;
    }

    @Generated
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public Integer getRuntimeMinutes() {
        return this.runtimeMinutes;
    }

    @Generated
    public Boolean getReleaseNotified() {
        return this.releaseNotified;
    }

    @Generated
    public Integer getLatestSeasonNumber() {
        return this.latestSeasonNumber;
    }

    @Generated
    public String getLatestSeasonName() {
        return this.latestSeasonName;
    }

    @Generated
    public String getLatestSeasonOverview() {
        return this.latestSeasonOverview;
    }

    @Generated
    public String getLatestSeasonPosterPath() {
        return this.latestSeasonPosterPath;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    @Generated
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @Generated
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Generated
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setNextAirDate(Date nextAirDate) {
        this.nextAirDate = nextAirDate;
    }

    @Generated
    public void setNextSeasonNumber(Integer nextSeasonNumber) {
        this.nextSeasonNumber = nextSeasonNumber;
    }

    @Generated
    public void setNextEpisodeNumber(Integer nextEpisodeNumber) {
        this.nextEpisodeNumber = nextEpisodeNumber;
    }

    @Generated
    public void setLastNotifiedSeason(Integer lastNotifiedSeason) {
        this.lastNotifiedSeason = lastNotifiedSeason;
    }

    @Generated
    public void setLastNotifiedEpisode(Integer lastNotifiedEpisode) {
        this.lastNotifiedEpisode = lastNotifiedEpisode;
    }

    @Generated
    public void setLanguage(String language) {
        this.language = language;
    }

    @Generated
    public void setNotifyChannels(String notifyChannels) {
        this.notifyChannels = notifyChannels;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setLastSyncTime(Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    @Generated
    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Generated
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public void setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    @Generated
    public void setReleaseNotified(Boolean releaseNotified) {
        this.releaseNotified = releaseNotified;
    }

    @Generated
    public void setLatestSeasonNumber(Integer latestSeasonNumber) {
        this.latestSeasonNumber = latestSeasonNumber;
    }

    @Generated
    public void setLatestSeasonName(String latestSeasonName) {
        this.latestSeasonName = latestSeasonName;
    }

    @Generated
    public void setLatestSeasonOverview(String latestSeasonOverview) {
        this.latestSeasonOverview = latestSeasonOverview;
    }

    @Generated
    public void setLatestSeasonPosterPath(String latestSeasonPosterPath) {
        this.latestSeasonPosterPath = latestSeasonPosterPath;
    }

    @Override
    @Generated
    public String toString() {
        return "TmdbFollow(id=" + this.getId() + ", tmdbId=" + this.getTmdbId() + ", mediaType=" + this.getMediaType() + ", name=" + this.getName() + ", originalName=" + this.getOriginalName() + ", posterPath=" + this.getPosterPath() + ", backdropPath=" + this.getBackdropPath() + ", overview=" + this.getOverview() + ", nextAirDate=" + String.valueOf(this.getNextAirDate()) + ", nextSeasonNumber=" + this.getNextSeasonNumber() + ", nextEpisodeNumber=" + this.getNextEpisodeNumber() + ", lastNotifiedSeason=" + this.getLastNotifiedSeason() + ", lastNotifiedEpisode=" + this.getLastNotifiedEpisode() + ", language=" + this.getLanguage() + ", notifyChannels=" + this.getNotifyChannels() + ", status=" + this.getStatus() + ", lastSyncTime=" + String.valueOf(this.getLastSyncTime()) + ", subscriberName=" + this.getSubscriberName() + ", releaseDate=" + String.valueOf(this.getReleaseDate()) + ", runtimeMinutes=" + this.getRuntimeMinutes() + ", releaseNotified=" + this.getReleaseNotified() + ", latestSeasonNumber=" + this.getLatestSeasonNumber() + ", latestSeasonName=" + this.getLatestSeasonName() + ", latestSeasonOverview=" + this.getLatestSeasonOverview() + ", latestSeasonPosterPath=" + this.getLatestSeasonPosterPath() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollow)) {
            return false;
        }
        TmdbFollow other = (TmdbFollow)o;
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
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Integer this$nextSeasonNumber = this.getNextSeasonNumber();
        Integer other$nextSeasonNumber = other.getNextSeasonNumber();
        if (this$nextSeasonNumber == null ? other$nextSeasonNumber != null : !((Object)this$nextSeasonNumber).equals(other$nextSeasonNumber)) {
            return false;
        }
        Integer this$nextEpisodeNumber = this.getNextEpisodeNumber();
        Integer other$nextEpisodeNumber = other.getNextEpisodeNumber();
        if (this$nextEpisodeNumber == null ? other$nextEpisodeNumber != null : !((Object)this$nextEpisodeNumber).equals(other$nextEpisodeNumber)) {
            return false;
        }
        Integer this$lastNotifiedSeason = this.getLastNotifiedSeason();
        Integer other$lastNotifiedSeason = other.getLastNotifiedSeason();
        if (this$lastNotifiedSeason == null ? other$lastNotifiedSeason != null : !((Object)this$lastNotifiedSeason).equals(other$lastNotifiedSeason)) {
            return false;
        }
        Integer this$lastNotifiedEpisode = this.getLastNotifiedEpisode();
        Integer other$lastNotifiedEpisode = other.getLastNotifiedEpisode();
        if (this$lastNotifiedEpisode == null ? other$lastNotifiedEpisode != null : !((Object)this$lastNotifiedEpisode).equals(other$lastNotifiedEpisode)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$runtimeMinutes = this.getRuntimeMinutes();
        Integer other$runtimeMinutes = other.getRuntimeMinutes();
        if (this$runtimeMinutes == null ? other$runtimeMinutes != null : !((Object)this$runtimeMinutes).equals(other$runtimeMinutes)) {
            return false;
        }
        Boolean this$releaseNotified = this.getReleaseNotified();
        Boolean other$releaseNotified = other.getReleaseNotified();
        if (this$releaseNotified == null ? other$releaseNotified != null : !((Object)this$releaseNotified).equals(other$releaseNotified)) {
            return false;
        }
        Integer this$latestSeasonNumber = this.getLatestSeasonNumber();
        Integer other$latestSeasonNumber = other.getLatestSeasonNumber();
        if (this$latestSeasonNumber == null ? other$latestSeasonNumber != null : !((Object)this$latestSeasonNumber).equals(other$latestSeasonNumber)) {
            return false;
        }
        String this$mediaType = this.getMediaType();
        String other$mediaType = other.getMediaType();
        if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$originalName = this.getOriginalName();
        String other$originalName = other.getOriginalName();
        if (this$originalName == null ? other$originalName != null : !this$originalName.equals(other$originalName)) {
            return false;
        }
        String this$posterPath = this.getPosterPath();
        String other$posterPath = other.getPosterPath();
        if (this$posterPath == null ? other$posterPath != null : !this$posterPath.equals(other$posterPath)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$overview = this.getOverview();
        String other$overview = other.getOverview();
        if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
            return false;
        }
        Date this$nextAirDate = this.getNextAirDate();
        Date other$nextAirDate = other.getNextAirDate();
        if (this$nextAirDate == null ? other$nextAirDate != null : !((Object)this$nextAirDate).equals(other$nextAirDate)) {
            return false;
        }
        String this$language = this.getLanguage();
        String other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) {
            return false;
        }
        String this$notifyChannels = this.getNotifyChannels();
        String other$notifyChannels = other.getNotifyChannels();
        if (this$notifyChannels == null ? other$notifyChannels != null : !this$notifyChannels.equals(other$notifyChannels)) {
            return false;
        }
        Date this$lastSyncTime = this.getLastSyncTime();
        Date other$lastSyncTime = other.getLastSyncTime();
        if (this$lastSyncTime == null ? other$lastSyncTime != null : !((Object)this$lastSyncTime).equals(other$lastSyncTime)) {
            return false;
        }
        String this$subscriberName = this.getSubscriberName();
        String other$subscriberName = other.getSubscriberName();
        if (this$subscriberName == null ? other$subscriberName != null : !this$subscriberName.equals(other$subscriberName)) {
            return false;
        }
        Date this$releaseDate = this.getReleaseDate();
        Date other$releaseDate = other.getReleaseDate();
        if (this$releaseDate == null ? other$releaseDate != null : !((Object)this$releaseDate).equals(other$releaseDate)) {
            return false;
        }
        String this$latestSeasonName = this.getLatestSeasonName();
        String other$latestSeasonName = other.getLatestSeasonName();
        if (this$latestSeasonName == null ? other$latestSeasonName != null : !this$latestSeasonName.equals(other$latestSeasonName)) {
            return false;
        }
        String this$latestSeasonOverview = this.getLatestSeasonOverview();
        String other$latestSeasonOverview = other.getLatestSeasonOverview();
        if (this$latestSeasonOverview == null ? other$latestSeasonOverview != null : !this$latestSeasonOverview.equals(other$latestSeasonOverview)) {
            return false;
        }
        String this$latestSeasonPosterPath = this.getLatestSeasonPosterPath();
        String other$latestSeasonPosterPath = other.getLatestSeasonPosterPath();
        return !(this$latestSeasonPosterPath == null ? other$latestSeasonPosterPath != null : !this$latestSeasonPosterPath.equals(other$latestSeasonPosterPath));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollow;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Integer $nextSeasonNumber = this.getNextSeasonNumber();
        result = result * 59 + ($nextSeasonNumber == null ? 43 : ((Object)$nextSeasonNumber).hashCode());
        Integer $nextEpisodeNumber = this.getNextEpisodeNumber();
        result = result * 59 + ($nextEpisodeNumber == null ? 43 : ((Object)$nextEpisodeNumber).hashCode());
        Integer $lastNotifiedSeason = this.getLastNotifiedSeason();
        result = result * 59 + ($lastNotifiedSeason == null ? 43 : ((Object)$lastNotifiedSeason).hashCode());
        Integer $lastNotifiedEpisode = this.getLastNotifiedEpisode();
        result = result * 59 + ($lastNotifiedEpisode == null ? 43 : ((Object)$lastNotifiedEpisode).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $runtimeMinutes = this.getRuntimeMinutes();
        result = result * 59 + ($runtimeMinutes == null ? 43 : ((Object)$runtimeMinutes).hashCode());
        Boolean $releaseNotified = this.getReleaseNotified();
        result = result * 59 + ($releaseNotified == null ? 43 : ((Object)$releaseNotified).hashCode());
        Integer $latestSeasonNumber = this.getLatestSeasonNumber();
        result = result * 59 + ($latestSeasonNumber == null ? 43 : ((Object)$latestSeasonNumber).hashCode());
        String $mediaType = this.getMediaType();
        result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $originalName = this.getOriginalName();
        result = result * 59 + ($originalName == null ? 43 : $originalName.hashCode());
        String $posterPath = this.getPosterPath();
        result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        Date $nextAirDate = this.getNextAirDate();
        result = result * 59 + ($nextAirDate == null ? 43 : ((Object)$nextAirDate).hashCode());
        String $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        String $notifyChannels = this.getNotifyChannels();
        result = result * 59 + ($notifyChannels == null ? 43 : $notifyChannels.hashCode());
        Date $lastSyncTime = this.getLastSyncTime();
        result = result * 59 + ($lastSyncTime == null ? 43 : ((Object)$lastSyncTime).hashCode());
        String $subscriberName = this.getSubscriberName();
        result = result * 59 + ($subscriberName == null ? 43 : $subscriberName.hashCode());
        Date $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : ((Object)$releaseDate).hashCode());
        String $latestSeasonName = this.getLatestSeasonName();
        result = result * 59 + ($latestSeasonName == null ? 43 : $latestSeasonName.hashCode());
        String $latestSeasonOverview = this.getLatestSeasonOverview();
        result = result * 59 + ($latestSeasonOverview == null ? 43 : $latestSeasonOverview.hashCode());
        String $latestSeasonPosterPath = this.getLatestSeasonPosterPath();
        result = result * 59 + ($latestSeasonPosterPath == null ? 43 : $latestSeasonPosterPath.hashCode());
        return result;
    }
}
