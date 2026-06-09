/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.moviepilot;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Generated;

public class MoviePilotSubscribeRequest {
    @NotBlank(message="\u5f71\u7247\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u5f71\u7247\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a") String name;
    @NotBlank(message="\u5f71\u7247\u7c7b\u578b\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u5f71\u7247\u7c7b\u578b\u4e0d\u80fd\u4e3a\u7a7a") String type;
    @NotBlank(message="\u5e74\u4efd\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u5e74\u4efd\u4e0d\u80fd\u4e3a\u7a7a") String year;
    @NotNull(message="tmdbid\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="tmdbid\u4e0d\u80fd\u4e3a\u7a7a") Long tmdbid;
    private String doubanid;
    private String bangumiid;
    private String mediaid;
    private Integer season;
    private Integer bestVersion;
    private String episodeGroup;

    @Generated
    public MoviePilotSubscribeRequest() {
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
    public String getYear() {
        return this.year;
    }

    @Generated
    public Long getTmdbid() {
        return this.tmdbid;
    }

    @Generated
    public String getDoubanid() {
        return this.doubanid;
    }

    @Generated
    public String getBangumiid() {
        return this.bangumiid;
    }

    @Generated
    public String getMediaid() {
        return this.mediaid;
    }

    @Generated
    public Integer getSeason() {
        return this.season;
    }

    @Generated
    public Integer getBestVersion() {
        return this.bestVersion;
    }

    @Generated
    public String getEpisodeGroup() {
        return this.episodeGroup;
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
    public void setYear(String year) {
        this.year = year;
    }

    @Generated
    public void setTmdbid(Long tmdbid) {
        this.tmdbid = tmdbid;
    }

    @Generated
    public void setDoubanid(String doubanid) {
        this.doubanid = doubanid;
    }

    @Generated
    public void setBangumiid(String bangumiid) {
        this.bangumiid = bangumiid;
    }

    @Generated
    public void setMediaid(String mediaid) {
        this.mediaid = mediaid;
    }

    @Generated
    public void setSeason(Integer season) {
        this.season = season;
    }

    @Generated
    public void setBestVersion(Integer bestVersion) {
        this.bestVersion = bestVersion;
    }

    @Generated
    public void setEpisodeGroup(String episodeGroup) {
        this.episodeGroup = episodeGroup;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MoviePilotSubscribeRequest)) {
            return false;
        }
        MoviePilotSubscribeRequest other = (MoviePilotSubscribeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$tmdbid = this.getTmdbid();
        Long other$tmdbid = other.getTmdbid();
        if (this$tmdbid == null ? other$tmdbid != null : !((Object)this$tmdbid).equals(other$tmdbid)) {
            return false;
        }
        Integer this$season = this.getSeason();
        Integer other$season = other.getSeason();
        if (this$season == null ? other$season != null : !((Object)this$season).equals(other$season)) {
            return false;
        }
        Integer this$bestVersion = this.getBestVersion();
        Integer other$bestVersion = other.getBestVersion();
        if (this$bestVersion == null ? other$bestVersion != null : !((Object)this$bestVersion).equals(other$bestVersion)) {
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
        String this$year = this.getYear();
        String other$year = other.getYear();
        if (this$year == null ? other$year != null : !this$year.equals(other$year)) {
            return false;
        }
        String this$doubanid = this.getDoubanid();
        String other$doubanid = other.getDoubanid();
        if (this$doubanid == null ? other$doubanid != null : !this$doubanid.equals(other$doubanid)) {
            return false;
        }
        String this$bangumiid = this.getBangumiid();
        String other$bangumiid = other.getBangumiid();
        if (this$bangumiid == null ? other$bangumiid != null : !this$bangumiid.equals(other$bangumiid)) {
            return false;
        }
        String this$mediaid = this.getMediaid();
        String other$mediaid = other.getMediaid();
        if (this$mediaid == null ? other$mediaid != null : !this$mediaid.equals(other$mediaid)) {
            return false;
        }
        String this$episodeGroup = this.getEpisodeGroup();
        String other$episodeGroup = other.getEpisodeGroup();
        return !(this$episodeGroup == null ? other$episodeGroup != null : !this$episodeGroup.equals(other$episodeGroup));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MoviePilotSubscribeRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $tmdbid = this.getTmdbid();
        result = result * 59 + ($tmdbid == null ? 43 : ((Object)$tmdbid).hashCode());
        Integer $season = this.getSeason();
        result = result * 59 + ($season == null ? 43 : ((Object)$season).hashCode());
        Integer $bestVersion = this.getBestVersion();
        result = result * 59 + ($bestVersion == null ? 43 : ((Object)$bestVersion).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $year = this.getYear();
        result = result * 59 + ($year == null ? 43 : $year.hashCode());
        String $doubanid = this.getDoubanid();
        result = result * 59 + ($doubanid == null ? 43 : $doubanid.hashCode());
        String $bangumiid = this.getBangumiid();
        result = result * 59 + ($bangumiid == null ? 43 : $bangumiid.hashCode());
        String $mediaid = this.getMediaid();
        result = result * 59 + ($mediaid == null ? 43 : $mediaid.hashCode());
        String $episodeGroup = this.getEpisodeGroup();
        result = result * 59 + ($episodeGroup == null ? 43 : $episodeGroup.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MoviePilotSubscribeRequest(name=" + this.getName() + ", type=" + this.getType() + ", year=" + this.getYear() + ", tmdbid=" + this.getTmdbid() + ", doubanid=" + this.getDoubanid() + ", bangumiid=" + this.getBangumiid() + ", mediaid=" + this.getMediaid() + ", season=" + this.getSeason() + ", bestVersion=" + this.getBestVersion() + ", episodeGroup=" + this.getEpisodeGroup() + ")";
    }
}
