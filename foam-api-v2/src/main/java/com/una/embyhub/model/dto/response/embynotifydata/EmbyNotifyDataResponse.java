/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindEntityList
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydata;

import com.diboot.core.binding.annotation.BindEntityList;
import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.model.dto.response.embynotifydatadetails.EmbyNotifyDataDetailsResponse;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyNotifyDataDetails;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class EmbyNotifyDataResponse
implements Serializable {
    private Long id;
    private String name;
    private String overview;
    private String productionYear;
    private String type;
    private Integer status;
    private Date createDatetime;
    private String imgUrl;
    private String tmdbUrl;
    private String displayTitle;
    private String genres;
    private String size;
    private Double voteAverage;
    private Integer voteCount;
    @BindEntityList(entity=EmbyNotifyDataDetails.class, condition="this.id = emby_notify_data_id")
    private List<EmbyNotifyDataDetailsResponse> embyNotifyDataDetailsResponseList;
    private String backdropPath;
    private Long embyInfoId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private String productionCountries;

    @Generated
    public EmbyNotifyDataResponse() {
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
    public Date getCreateDatetime() {
        return this.createDatetime;
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
    public Double getVoteAverage() {
        return this.voteAverage;
    }

    @Generated
    public Integer getVoteCount() {
        return this.voteCount;
    }

    @Generated
    public List<EmbyNotifyDataDetailsResponse> getEmbyNotifyDataDetailsResponseList() {
        return this.embyNotifyDataDetailsResponseList;
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
    public String getServerName() {
        return this.serverName;
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
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
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
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Generated
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Generated
    public void setEmbyNotifyDataDetailsResponseList(List<EmbyNotifyDataDetailsResponse> embyNotifyDataDetailsResponseList) {
        this.embyNotifyDataDetailsResponseList = embyNotifyDataDetailsResponseList;
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
    public void setServerName(String serverName) {
        this.serverName = serverName;
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
        if (!(o instanceof EmbyNotifyDataResponse)) {
            return false;
        }
        EmbyNotifyDataResponse other = (EmbyNotifyDataResponse)o;
        if (!other.canEqual(this)) {
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
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
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
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
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
        List<EmbyNotifyDataDetailsResponse> this$embyNotifyDataDetailsResponseList = this.getEmbyNotifyDataDetailsResponseList();
        List<EmbyNotifyDataDetailsResponse> other$embyNotifyDataDetailsResponseList = other.getEmbyNotifyDataDetailsResponseList();
        if (this$embyNotifyDataDetailsResponseList == null ? other$embyNotifyDataDetailsResponseList != null : !((Object)this$embyNotifyDataDetailsResponseList).equals(other$embyNotifyDataDetailsResponseList)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        return !(this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyNotifyDataResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Double $voteAverage = this.getVoteAverage();
        result = result * 59 + ($voteAverage == null ? 43 : ((Object)$voteAverage).hashCode());
        Integer $voteCount = this.getVoteCount();
        result = result * 59 + ($voteCount == null ? 43 : ((Object)$voteCount).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $productionYear = this.getProductionYear();
        result = result * 59 + ($productionYear == null ? 43 : $productionYear.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
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
        List<EmbyNotifyDataDetailsResponse> $embyNotifyDataDetailsResponseList = this.getEmbyNotifyDataDetailsResponseList();
        result = result * 59 + ($embyNotifyDataDetailsResponseList == null ? 43 : ((Object)$embyNotifyDataDetailsResponseList).hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyNotifyDataResponse(id=" + this.getId() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", productionYear=" + this.getProductionYear() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", imgUrl=" + this.getImgUrl() + ", tmdbUrl=" + this.getTmdbUrl() + ", displayTitle=" + this.getDisplayTitle() + ", genres=" + this.getGenres() + ", size=" + this.getSize() + ", voteAverage=" + this.getVoteAverage() + ", voteCount=" + this.getVoteCount() + ", embyNotifyDataDetailsResponseList=" + String.valueOf(this.getEmbyNotifyDataDetailsResponseList()) + ", backdropPath=" + this.getBackdropPath() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", productionCountries=" + this.getProductionCountries() + ")";
    }
}
