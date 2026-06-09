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

@TableName(value="request_list")
public class RequestList
extends BaseEntity
implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_TYPE = "type";
    public static final String COL_IMAGE_URL = "image_url";
    public static final String COL_SCORE = "score";
    public static final String COL_TMDB_URL = "tmdb_url";
    public static final String COL_RELEASE_DATE = "release_date";
    public static final String COL_TMDB_ID = "tmdb_id";
    public static final String COL_OVERVIEW = "overview";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_STATUS = "status";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_EMBY_SERVER_ID = "emby_server_id";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_BACKDROP_PATH = "backdrop_path";
    public static final String COL_REMARK = "remark";
    public static final String COL_AUDIT_STATUS = "audit_status";
    public static final String COL_DOUBAN_ID = "douban_id";
    public static final String COL_DOUBAN_URL = "douban_url";
    public static final String COL_DOUBAN_SCORE = "douban_score";
    public static final String COL_DOUBAN_IMAGE = "douban_image";
    public static final String COL_REQUEST_SOURCE = "request_source";
    public static final String COL_TELEGRAM_USER_ID = "telegram_user_id";
    public static final String COL_POINTS_COST = "points_cost";
    public static final String COL_POINTS_REFUNDED = "points_refunded";
    public static final String COL_POINTS_REF_ID = "points_ref_id";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="`name`")
    private String name;
    @TableField(value="`type`")
    private String type;
    @TableField(value="image_url")
    private String imageUrl;
    @TableField(value="score")
    private String score;
    @TableField(value="tmdb_url")
    private String tmdbUrl;
    @TableField(value="release_date")
    private Date releaseDate;
    @TableField(value="parent_tmdb_id")
    private Integer parentTmdbId;
    @TableField(value="tmdb_id")
    private Integer tmdbId;
    @TableField(value="overview")
    private String overview;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="emby_server_id")
    private String embyServerId;
    @TableField(value="`status`")
    private Integer status;
    @TableField(value="douban_id")
    private String doubanId;
    @TableField(value="douban_url")
    private String doubanUrl;
    @TableField(value="douban_score")
    private String doubanScore;
    @TableField(value="douban_image")
    private String doubanImage;
    @TableField(value="audit_status")
    private Integer auditStatus;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="backdrop_path")
    private String backdropPath;
    @TableField(value="season")
    private Integer season;
    @TableField(value="episode")
    private Integer episode;
    @TableField(value="remark")
    private String remark;
    @TableField(value="runtime")
    private Integer runtime;
    @TableField(value="production_countries")
    private String productionCountries;
    @TableField(value="request_source")
    private String requestSource;
    @TableField(value="telegram_user_id")
    private Long telegramUserId;
    @TableField(value="points_cost")
    private Integer pointsCost;
    @TableField(value="points_refunded")
    private Integer pointsRefunded;
    @TableField(value="points_ref_id")
    private String pointsRefId;

    @Generated
    public RequestList() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Generated
    public String getScore() {
        return this.score;
    }

    @Generated
    public String getTmdbUrl() {
        return this.tmdbUrl;
    }

    @Generated
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public Integer getParentTmdbId() {
        return this.parentTmdbId;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getEmbyServerId() {
        return this.embyServerId;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getDoubanId() {
        return this.doubanId;
    }

    @Generated
    public String getDoubanUrl() {
        return this.doubanUrl;
    }

    @Generated
    public String getDoubanScore() {
        return this.doubanScore;
    }

    @Generated
    public String getDoubanImage() {
        return this.doubanImage;
    }

    @Generated
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public String getBackdropPath() {
        return this.backdropPath;
    }

    @Generated
    public Integer getSeason() {
        return this.season;
    }

    @Generated
    public Integer getEpisode() {
        return this.episode;
    }

    @Generated
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public Integer getRuntime() {
        return this.runtime;
    }

    @Generated
    public String getProductionCountries() {
        return this.productionCountries;
    }

    @Generated
    public String getRequestSource() {
        return this.requestSource;
    }

    @Generated
    public Long getTelegramUserId() {
        return this.telegramUserId;
    }

    @Generated
    public Integer getPointsCost() {
        return this.pointsCost;
    }

    @Generated
    public Integer getPointsRefunded() {
        return this.pointsRefunded;
    }

    @Generated
    public String getPointsRefId() {
        return this.pointsRefId;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Generated
    public void setScore(String score) {
        this.score = score;
    }

    @Generated
    public void setTmdbUrl(String tmdbUrl) {
        this.tmdbUrl = tmdbUrl;
    }

    @Generated
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public void setParentTmdbId(Integer parentTmdbId) {
        this.parentTmdbId = parentTmdbId;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    @Generated
    public void setDoubanUrl(String doubanUrl) {
        this.doubanUrl = doubanUrl;
    }

    @Generated
    public void setDoubanScore(String doubanScore) {
        this.doubanScore = doubanScore;
    }

    @Generated
    public void setDoubanImage(String doubanImage) {
        this.doubanImage = doubanImage;
    }

    @Generated
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Generated
    public void setSeason(Integer season) {
        this.season = season;
    }

    @Generated
    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @Generated
    public void setProductionCountries(String productionCountries) {
        this.productionCountries = productionCountries;
    }

    @Generated
    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    @Generated
    public void setTelegramUserId(Long telegramUserId) {
        this.telegramUserId = telegramUserId;
    }

    @Generated
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    @Generated
    public void setPointsRefunded(Integer pointsRefunded) {
        this.pointsRefunded = pointsRefunded;
    }

    @Generated
    public void setPointsRefId(String pointsRefId) {
        this.pointsRefId = pointsRefId;
    }

    @Override
    @Generated
    public String toString() {
        return "RequestList(id=" + this.getId() + ", name=" + this.getName() + ", type=" + this.getType() + ", imageUrl=" + this.getImageUrl() + ", score=" + this.getScore() + ", tmdbUrl=" + this.getTmdbUrl() + ", releaseDate=" + String.valueOf(this.getReleaseDate()) + ", parentTmdbId=" + this.getParentTmdbId() + ", tmdbId=" + this.getTmdbId() + ", overview=" + this.getOverview() + ", userId=" + this.getUserId() + ", embyInfoId=" + this.getEmbyInfoId() + ", embyServerId=" + this.getEmbyServerId() + ", status=" + this.getStatus() + ", doubanId=" + this.getDoubanId() + ", doubanUrl=" + this.getDoubanUrl() + ", doubanScore=" + this.getDoubanScore() + ", doubanImage=" + this.getDoubanImage() + ", auditStatus=" + this.getAuditStatus() + ", embyUserName=" + this.getEmbyUserName() + ", backdropPath=" + this.getBackdropPath() + ", season=" + this.getSeason() + ", episode=" + this.getEpisode() + ", remark=" + this.getRemark() + ", runtime=" + this.getRuntime() + ", productionCountries=" + this.getProductionCountries() + ", requestSource=" + this.getRequestSource() + ", telegramUserId=" + this.getTelegramUserId() + ", pointsCost=" + this.getPointsCost() + ", pointsRefunded=" + this.getPointsRefunded() + ", pointsRefId=" + this.getPointsRefId() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestList)) {
            return false;
        }
        RequestList other = (RequestList)o;
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
        Integer this$parentTmdbId = this.getParentTmdbId();
        Integer other$parentTmdbId = other.getParentTmdbId();
        if (this$parentTmdbId == null ? other$parentTmdbId != null : !((Object)this$parentTmdbId).equals(other$parentTmdbId)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$auditStatus = this.getAuditStatus();
        Integer other$auditStatus = other.getAuditStatus();
        if (this$auditStatus == null ? other$auditStatus != null : !((Object)this$auditStatus).equals(other$auditStatus)) {
            return false;
        }
        Integer this$season = this.getSeason();
        Integer other$season = other.getSeason();
        if (this$season == null ? other$season != null : !((Object)this$season).equals(other$season)) {
            return false;
        }
        Integer this$episode = this.getEpisode();
        Integer other$episode = other.getEpisode();
        if (this$episode == null ? other$episode != null : !((Object)this$episode).equals(other$episode)) {
            return false;
        }
        Integer this$runtime = this.getRuntime();
        Integer other$runtime = other.getRuntime();
        if (this$runtime == null ? other$runtime != null : !((Object)this$runtime).equals(other$runtime)) {
            return false;
        }
        Long this$telegramUserId = this.getTelegramUserId();
        Long other$telegramUserId = other.getTelegramUserId();
        if (this$telegramUserId == null ? other$telegramUserId != null : !((Object)this$telegramUserId).equals(other$telegramUserId)) {
            return false;
        }
        Integer this$pointsCost = this.getPointsCost();
        Integer other$pointsCost = other.getPointsCost();
        if (this$pointsCost == null ? other$pointsCost != null : !((Object)this$pointsCost).equals(other$pointsCost)) {
            return false;
        }
        Integer this$pointsRefunded = this.getPointsRefunded();
        Integer other$pointsRefunded = other.getPointsRefunded();
        if (this$pointsRefunded == null ? other$pointsRefunded != null : !((Object)this$pointsRefunded).equals(other$pointsRefunded)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$imageUrl = this.getImageUrl();
        String other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) {
            return false;
        }
        String this$score = this.getScore();
        String other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) {
            return false;
        }
        String this$tmdbUrl = this.getTmdbUrl();
        String other$tmdbUrl = other.getTmdbUrl();
        if (this$tmdbUrl == null ? other$tmdbUrl != null : !this$tmdbUrl.equals(other$tmdbUrl)) {
            return false;
        }
        Date this$releaseDate = this.getReleaseDate();
        Date other$releaseDate = other.getReleaseDate();
        if (this$releaseDate == null ? other$releaseDate != null : !((Object)this$releaseDate).equals(other$releaseDate)) {
            return false;
        }
        String this$overview = this.getOverview();
        String other$overview = other.getOverview();
        if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
            return false;
        }
        String this$doubanId = this.getDoubanId();
        String other$doubanId = other.getDoubanId();
        if (this$doubanId == null ? other$doubanId != null : !this$doubanId.equals(other$doubanId)) {
            return false;
        }
        String this$doubanUrl = this.getDoubanUrl();
        String other$doubanUrl = other.getDoubanUrl();
        if (this$doubanUrl == null ? other$doubanUrl != null : !this$doubanUrl.equals(other$doubanUrl)) {
            return false;
        }
        String this$doubanScore = this.getDoubanScore();
        String other$doubanScore = other.getDoubanScore();
        if (this$doubanScore == null ? other$doubanScore != null : !this$doubanScore.equals(other$doubanScore)) {
            return false;
        }
        String this$doubanImage = this.getDoubanImage();
        String other$doubanImage = other.getDoubanImage();
        if (this$doubanImage == null ? other$doubanImage != null : !this$doubanImage.equals(other$doubanImage)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        if (this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries)) {
            return false;
        }
        String this$requestSource = this.getRequestSource();
        String other$requestSource = other.getRequestSource();
        if (this$requestSource == null ? other$requestSource != null : !this$requestSource.equals(other$requestSource)) {
            return false;
        }
        String this$pointsRefId = this.getPointsRefId();
        String other$pointsRefId = other.getPointsRefId();
        return !(this$pointsRefId == null ? other$pointsRefId != null : !this$pointsRefId.equals(other$pointsRefId));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestList;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $parentTmdbId = this.getParentTmdbId();
        result = result * 59 + ($parentTmdbId == null ? 43 : ((Object)$parentTmdbId).hashCode());
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $auditStatus = this.getAuditStatus();
        result = result * 59 + ($auditStatus == null ? 43 : ((Object)$auditStatus).hashCode());
        Integer $season = this.getSeason();
        result = result * 59 + ($season == null ? 43 : ((Object)$season).hashCode());
        Integer $episode = this.getEpisode();
        result = result * 59 + ($episode == null ? 43 : ((Object)$episode).hashCode());
        Integer $runtime = this.getRuntime();
        result = result * 59 + ($runtime == null ? 43 : ((Object)$runtime).hashCode());
        Long $telegramUserId = this.getTelegramUserId();
        result = result * 59 + ($telegramUserId == null ? 43 : ((Object)$telegramUserId).hashCode());
        Integer $pointsCost = this.getPointsCost();
        result = result * 59 + ($pointsCost == null ? 43 : ((Object)$pointsCost).hashCode());
        Integer $pointsRefunded = this.getPointsRefunded();
        result = result * 59 + ($pointsRefunded == null ? 43 : ((Object)$pointsRefunded).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $imageUrl = this.getImageUrl();
        result = result * 59 + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        String $score = this.getScore();
        result = result * 59 + ($score == null ? 43 : $score.hashCode());
        String $tmdbUrl = this.getTmdbUrl();
        result = result * 59 + ($tmdbUrl == null ? 43 : $tmdbUrl.hashCode());
        Date $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : ((Object)$releaseDate).hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        String $doubanId = this.getDoubanId();
        result = result * 59 + ($doubanId == null ? 43 : $doubanId.hashCode());
        String $doubanUrl = this.getDoubanUrl();
        result = result * 59 + ($doubanUrl == null ? 43 : $doubanUrl.hashCode());
        String $doubanScore = this.getDoubanScore();
        result = result * 59 + ($doubanScore == null ? 43 : $doubanScore.hashCode());
        String $doubanImage = this.getDoubanImage();
        result = result * 59 + ($doubanImage == null ? 43 : $doubanImage.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        String $requestSource = this.getRequestSource();
        result = result * 59 + ($requestSource == null ? 43 : $requestSource.hashCode());
        String $pointsRefId = this.getPointsRefId();
        result = result * 59 + ($pointsRefId == null ? 43 : $pointsRefId.hashCode());
        return result;
    }
}
