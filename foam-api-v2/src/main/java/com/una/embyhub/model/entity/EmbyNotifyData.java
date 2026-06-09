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

@TableName(value="emby_notify_data")
public class EmbyNotifyData
extends BaseEntity
implements Serializable {
    public static final String COL_EPISODE_DETAILS = "episode_details";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="`name`")
    private String name;
    @TableField(value="overview")
    private String overview;
    @TableField(value="production_year")
    private String productionYear;
    @TableField(value="`type`")
    private String type;
    @TableField(value="`status`")
    private Integer status;
    @TableField(value="img_url")
    private String imgUrl;
    @TableField(value="tmdb_url")
    private String tmdbUrl;
    @TableField(value="display_title")
    private String displayTitle;
    @TableField(value="genres")
    private String genres;
    @TableField(value="`size`")
    private String size;
    @TableField(value="backdrop_path")
    private String backdropPath;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="vote_average")
    private Double voteAverage;
    @TableField(value="vote_count")
    private Integer voteCount;
    @TableField(value="production_countries")
    private String productionCountries;
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_OVERVIEW = "overview";
    public static final String COL_PRODUCTION_YEAR = "production_year";
    public static final String COL_TYPE = "type";
    public static final String COL_STATUS = "status";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_IMG_URL = "img_url";
    public static final String COL_TMDB_URL = "tmdb_url";
    public static final String COL_DISPLAY_TITLE = "display_title";
    public static final String COL_GENRES = "genres";
    public static final String COL_SIZE = "size";
    public static final String COL_BACKDROP_PATH = "backdrop_path";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_VOTE_AVERAGE = "vote_average";
    public static final String COL_VOTE_COUNT = "vote_count";
    public static final String COL_PRODUCTION_COUNTRIES = "production_countries";

    @Generated
    public EmbyNotifyData() {
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
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public String getProductionYear() {
        return this.productionYear;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getImgUrl() {
        return this.imgUrl;
    }

    @Generated
    public String getTmdbUrl() {
        return this.tmdbUrl;
    }

    @Generated
    public String getDisplayTitle() {
        return this.displayTitle;
    }

    @Generated
    public String getGenres() {
        return this.genres;
    }

    @Generated
    public String getSize() {
        return this.size;
    }

    @Generated
    public String getBackdropPath() {
        return this.backdropPath;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Double getVoteAverage() {
        return this.voteAverage;
    }

    @Generated
    public Integer getVoteCount() {
        return this.voteCount;
    }

    @Generated
    public String getProductionCountries() {
        return this.productionCountries;
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
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Generated
    public void setTmdbUrl(String tmdbUrl) {
        this.tmdbUrl = tmdbUrl;
    }

    @Generated
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    @Generated
    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Generated
    public void setSize(String size) {
        this.size = size;
    }

    @Generated
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Generated
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Generated
    public void setProductionCountries(String productionCountries) {
        this.productionCountries = productionCountries;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyNotifyData(id=" + this.getId() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", productionYear=" + this.getProductionYear() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", imgUrl=" + this.getImgUrl() + ", tmdbUrl=" + this.getTmdbUrl() + ", displayTitle=" + this.getDisplayTitle() + ", genres=" + this.getGenres() + ", size=" + this.getSize() + ", backdropPath=" + this.getBackdropPath() + ", embyInfoId=" + this.getEmbyInfoId() + ", voteAverage=" + this.getVoteAverage() + ", voteCount=" + this.getVoteCount() + ", productionCountries=" + this.getProductionCountries() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyNotifyData)) {
            return false;
        }
        EmbyNotifyData other = (EmbyNotifyData)o;
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
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Double this$voteAverage = this.getVoteAverage();
        Double other$voteAverage = other.getVoteAverage();
        if (this$voteAverage == null ? other$voteAverage != null : !((Object)this$voteAverage).equals(other$voteAverage)) {
            return false;
        }
        Integer this$voteCount = this.getVoteCount();
        Integer other$voteCount = other.getVoteCount();
        if (this$voteCount == null ? other$voteCount != null : !((Object)this$voteCount).equals(other$voteCount)) {
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
        String this$productionYear = this.getProductionYear();
        String other$productionYear = other.getProductionYear();
        if (this$productionYear == null ? other$productionYear != null : !this$productionYear.equals(other$productionYear)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$imgUrl = this.getImgUrl();
        String other$imgUrl = other.getImgUrl();
        if (this$imgUrl == null ? other$imgUrl != null : !this$imgUrl.equals(other$imgUrl)) {
            return false;
        }
        String this$tmdbUrl = this.getTmdbUrl();
        String other$tmdbUrl = other.getTmdbUrl();
        if (this$tmdbUrl == null ? other$tmdbUrl != null : !this$tmdbUrl.equals(other$tmdbUrl)) {
            return false;
        }
        String this$displayTitle = this.getDisplayTitle();
        String other$displayTitle = other.getDisplayTitle();
        if (this$displayTitle == null ? other$displayTitle != null : !this$displayTitle.equals(other$displayTitle)) {
            return false;
        }
        String this$genres = this.getGenres();
        String other$genres = other.getGenres();
        if (this$genres == null ? other$genres != null : !this$genres.equals(other$genres)) {
            return false;
        }
        String this$size = this.getSize();
        String other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        return !(this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyNotifyData;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Double $voteAverage = this.getVoteAverage();
        result = result * 59 + ($voteAverage == null ? 43 : ((Object)$voteAverage).hashCode());
        Integer $voteCount = this.getVoteCount();
        result = result * 59 + ($voteCount == null ? 43 : ((Object)$voteCount).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $productionYear = this.getProductionYear();
        result = result * 59 + ($productionYear == null ? 43 : $productionYear.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $imgUrl = this.getImgUrl();
        result = result * 59 + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        String $tmdbUrl = this.getTmdbUrl();
        result = result * 59 + ($tmdbUrl == null ? 43 : $tmdbUrl.hashCode());
        String $displayTitle = this.getDisplayTitle();
        result = result * 59 + ($displayTitle == null ? 43 : $displayTitle.hashCode());
        String $genres = this.getGenres();
        result = result * 59 + ($genres == null ? 43 : $genres.hashCode());
        String $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : $size.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        return result;
    }
}
