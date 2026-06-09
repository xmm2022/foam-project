/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotEmpty
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.requestlist;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class RequestListSave
implements Serializable {
    @NotEmpty(message="\u7247\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u7247\u540d\u4e0d\u80fd\u4e3a\u7a7a") String name;
    @NotEmpty(message="\u7c7b\u578b\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u7c7b\u578b\u4e0d\u80fd\u4e3a\u7a7a") String type;
    private String imageUrl;
    @NotEmpty(message="\u8bc4\u5206\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u8bc4\u5206\u4e0d\u80fd\u4e3a\u7a7a") String score;
    private String doubanId;
    private String doubanUrl;
    private String doubanScore;
    private String doubanImage;
    @NotEmpty(message="tmdb\u5730\u5740\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="tmdb\u5730\u5740\u4e0d\u80fd\u4e3a\u7a7a") String tmdbUrl;
    private Date releaseDate;
    @NotNull(message="tmdb\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="tmdb\u4e0d\u80fd\u4e3a\u7a7a") Integer tmdbId;
    private String overview;
    private Long embyInfoId;
    private String embyServerId;
    private String backdropPath;
    private Integer season;
    private Integer episode;
    private Integer parentTmdbId;
    private String originalName;
    private String remark;
    private Integer runtime;
    private String productionCountries;

    @Generated
    public RequestListSave() {
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
    public String getTmdbUrl() {
        return this.tmdbUrl;
    }

    @Generated
    public Date getReleaseDate() {
        return this.releaseDate;
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
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getEmbyServerId() {
        return this.embyServerId;
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
    public Integer getParentTmdbId() {
        return this.parentTmdbId;
    }

    @Generated
    public String getOriginalName() {
        return this.originalName;
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
    public void setTmdbUrl(String tmdbUrl) {
        this.tmdbUrl = tmdbUrl;
    }

    @Generated
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
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
    public void setParentTmdbId(Integer parentTmdbId) {
        this.parentTmdbId = parentTmdbId;
    }

    @Generated
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestListSave)) {
            return false;
        }
        RequestListSave other = (RequestListSave)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
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
        Integer this$parentTmdbId = this.getParentTmdbId();
        Integer other$parentTmdbId = other.getParentTmdbId();
        if (this$parentTmdbId == null ? other$parentTmdbId != null : !((Object)this$parentTmdbId).equals(other$parentTmdbId)) {
            return false;
        }
        Integer this$runtime = this.getRuntime();
        Integer other$runtime = other.getRuntime();
        if (this$runtime == null ? other$runtime != null : !((Object)this$runtime).equals(other$runtime)) {
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
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$originalName = this.getOriginalName();
        String other$originalName = other.getOriginalName();
        if (this$originalName == null ? other$originalName != null : !this$originalName.equals(other$originalName)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        return !(this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestListSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $season = this.getSeason();
        result = result * 59 + ($season == null ? 43 : ((Object)$season).hashCode());
        Integer $episode = this.getEpisode();
        result = result * 59 + ($episode == null ? 43 : ((Object)$episode).hashCode());
        Integer $parentTmdbId = this.getParentTmdbId();
        result = result * 59 + ($parentTmdbId == null ? 43 : ((Object)$parentTmdbId).hashCode());
        Integer $runtime = this.getRuntime();
        result = result * 59 + ($runtime == null ? 43 : ((Object)$runtime).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $imageUrl = this.getImageUrl();
        result = result * 59 + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        String $score = this.getScore();
        result = result * 59 + ($score == null ? 43 : $score.hashCode());
        String $doubanId = this.getDoubanId();
        result = result * 59 + ($doubanId == null ? 43 : $doubanId.hashCode());
        String $doubanUrl = this.getDoubanUrl();
        result = result * 59 + ($doubanUrl == null ? 43 : $doubanUrl.hashCode());
        String $doubanScore = this.getDoubanScore();
        result = result * 59 + ($doubanScore == null ? 43 : $doubanScore.hashCode());
        String $doubanImage = this.getDoubanImage();
        result = result * 59 + ($doubanImage == null ? 43 : $doubanImage.hashCode());
        String $tmdbUrl = this.getTmdbUrl();
        result = result * 59 + ($tmdbUrl == null ? 43 : $tmdbUrl.hashCode());
        Date $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : ((Object)$releaseDate).hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $originalName = this.getOriginalName();
        result = result * 59 + ($originalName == null ? 43 : $originalName.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestListSave(name=" + this.getName() + ", type=" + this.getType() + ", imageUrl=" + this.getImageUrl() + ", score=" + this.getScore() + ", doubanId=" + this.getDoubanId() + ", doubanUrl=" + this.getDoubanUrl() + ", doubanScore=" + this.getDoubanScore() + ", doubanImage=" + this.getDoubanImage() + ", tmdbUrl=" + this.getTmdbUrl() + ", releaseDate=" + String.valueOf(this.getReleaseDate()) + ", tmdbId=" + this.getTmdbId() + ", overview=" + this.getOverview() + ", embyInfoId=" + this.getEmbyInfoId() + ", embyServerId=" + this.getEmbyServerId() + ", backdropPath=" + this.getBackdropPath() + ", season=" + this.getSeason() + ", episode=" + this.getEpisode() + ", parentTmdbId=" + this.getParentTmdbId() + ", originalName=" + this.getOriginalName() + ", remark=" + this.getRemark() + ", runtime=" + this.getRuntime() + ", productionCountries=" + this.getProductionCountries() + ")";
    }
}
