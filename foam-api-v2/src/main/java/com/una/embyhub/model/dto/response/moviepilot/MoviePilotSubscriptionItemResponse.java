/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.moviepilot;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Generated;

public class MoviePilotSubscriptionItemResponse {
    private Long id;
    private String name;
    private String year;
    private String type;
    private String keyword;
    private Long tmdbid;
    private String doubanid;
    private String bangumiid;
    private String mediaid;
    private Integer season;
    private String poster;
    private String backdrop;
    private Integer vote;
    private String description;
    private String filter;
    private String include;
    private String exclude;
    private String quality;
    private String resolution;
    private String effect;
    @JSONField(name="total_episode")
    private Integer totalEpisode;
    @JSONField(name="start_episode")
    private Integer startEpisode;
    @JSONField(name="lack_episode")
    private Integer lackEpisode;
    private String note;
    private String state;
    @JSONField(name="last_update")
    private String lastUpdate;
    private String username;
    private String sites;
    private String downloader;
    @JSONField(name="best_version")
    private Integer bestVersion;
    @JSONField(name="current_priority")
    private Integer currentPriority;
    @JSONField(name="save_path")
    private String savePath;
    @JSONField(name="search_imdbid")
    private Integer searchImdbid;
    private String date;
    @JSONField(name="custom_words")
    private String customWords;
    @JSONField(name="media_category")
    private String mediaCategory;
    @JSONField(name="filter_groups")
    private String filterGroups;
    @JSONField(name="episode_group")
    private String episodeGroup;

    @Generated
    public MoviePilotSubscriptionItemResponse() {
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
    public String getYear() {
        return this.year;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public String getKeyword() {
        return this.keyword;
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
    public String getPoster() {
        return this.poster;
    }

    @Generated
    public String getBackdrop() {
        return this.backdrop;
    }

    @Generated
    public Integer getVote() {
        return this.vote;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getFilter() {
        return this.filter;
    }

    @Generated
    public String getInclude() {
        return this.include;
    }

    @Generated
    public String getExclude() {
        return this.exclude;
    }

    @Generated
    public String getQuality() {
        return this.quality;
    }

    @Generated
    public String getResolution() {
        return this.resolution;
    }

    @Generated
    public String getEffect() {
        return this.effect;
    }

    @Generated
    public Integer getTotalEpisode() {
        return this.totalEpisode;
    }

    @Generated
    public Integer getStartEpisode() {
        return this.startEpisode;
    }

    @Generated
    public Integer getLackEpisode() {
        return this.lackEpisode;
    }

    @Generated
    public String getNote() {
        return this.note;
    }

    @Generated
    public String getState() {
        return this.state;
    }

    @Generated
    public String getLastUpdate() {
        return this.lastUpdate;
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getSites() {
        return this.sites;
    }

    @Generated
    public String getDownloader() {
        return this.downloader;
    }

    @Generated
    public Integer getBestVersion() {
        return this.bestVersion;
    }

    @Generated
    public Integer getCurrentPriority() {
        return this.currentPriority;
    }

    @Generated
    public String getSavePath() {
        return this.savePath;
    }

    @Generated
    public Integer getSearchImdbid() {
        return this.searchImdbid;
    }

    @Generated
    public String getDate() {
        return this.date;
    }

    @Generated
    public String getCustomWords() {
        return this.customWords;
    }

    @Generated
    public String getMediaCategory() {
        return this.mediaCategory;
    }

    @Generated
    public String getFilterGroups() {
        return this.filterGroups;
    }

    @Generated
    public String getEpisodeGroup() {
        return this.episodeGroup;
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
    public void setYear(String year) {
        this.year = year;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Generated
    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    @Generated
    public void setVote(Integer vote) {
        this.vote = vote;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Generated
    public void setInclude(String include) {
        this.include = include;
    }

    @Generated
    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    @Generated
    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Generated
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Generated
    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Generated
    public void setTotalEpisode(Integer totalEpisode) {
        this.totalEpisode = totalEpisode;
    }

    @Generated
    public void setStartEpisode(Integer startEpisode) {
        this.startEpisode = startEpisode;
    }

    @Generated
    public void setLackEpisode(Integer lackEpisode) {
        this.lackEpisode = lackEpisode;
    }

    @Generated
    public void setNote(String note) {
        this.note = note;
    }

    @Generated
    public void setState(String state) {
        this.state = state;
    }

    @Generated
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setSites(String sites) {
        this.sites = sites;
    }

    @Generated
    public void setDownloader(String downloader) {
        this.downloader = downloader;
    }

    @Generated
    public void setBestVersion(Integer bestVersion) {
        this.bestVersion = bestVersion;
    }

    @Generated
    public void setCurrentPriority(Integer currentPriority) {
        this.currentPriority = currentPriority;
    }

    @Generated
    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Generated
    public void setSearchImdbid(Integer searchImdbid) {
        this.searchImdbid = searchImdbid;
    }

    @Generated
    public void setDate(String date) {
        this.date = date;
    }

    @Generated
    public void setCustomWords(String customWords) {
        this.customWords = customWords;
    }

    @Generated
    public void setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
    }

    @Generated
    public void setFilterGroups(String filterGroups) {
        this.filterGroups = filterGroups;
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
        if (!(o instanceof MoviePilotSubscriptionItemResponse)) {
            return false;
        }
        MoviePilotSubscriptionItemResponse other = (MoviePilotSubscriptionItemResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        Integer this$vote = this.getVote();
        Integer other$vote = other.getVote();
        if (this$vote == null ? other$vote != null : !((Object)this$vote).equals(other$vote)) {
            return false;
        }
        Integer this$totalEpisode = this.getTotalEpisode();
        Integer other$totalEpisode = other.getTotalEpisode();
        if (this$totalEpisode == null ? other$totalEpisode != null : !((Object)this$totalEpisode).equals(other$totalEpisode)) {
            return false;
        }
        Integer this$startEpisode = this.getStartEpisode();
        Integer other$startEpisode = other.getStartEpisode();
        if (this$startEpisode == null ? other$startEpisode != null : !((Object)this$startEpisode).equals(other$startEpisode)) {
            return false;
        }
        Integer this$lackEpisode = this.getLackEpisode();
        Integer other$lackEpisode = other.getLackEpisode();
        if (this$lackEpisode == null ? other$lackEpisode != null : !((Object)this$lackEpisode).equals(other$lackEpisode)) {
            return false;
        }
        Integer this$bestVersion = this.getBestVersion();
        Integer other$bestVersion = other.getBestVersion();
        if (this$bestVersion == null ? other$bestVersion != null : !((Object)this$bestVersion).equals(other$bestVersion)) {
            return false;
        }
        Integer this$currentPriority = this.getCurrentPriority();
        Integer other$currentPriority = other.getCurrentPriority();
        if (this$currentPriority == null ? other$currentPriority != null : !((Object)this$currentPriority).equals(other$currentPriority)) {
            return false;
        }
        Integer this$searchImdbid = this.getSearchImdbid();
        Integer other$searchImdbid = other.getSearchImdbid();
        if (this$searchImdbid == null ? other$searchImdbid != null : !((Object)this$searchImdbid).equals(other$searchImdbid)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$year = this.getYear();
        String other$year = other.getYear();
        if (this$year == null ? other$year != null : !this$year.equals(other$year)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$keyword = this.getKeyword();
        String other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) {
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
        String this$poster = this.getPoster();
        String other$poster = other.getPoster();
        if (this$poster == null ? other$poster != null : !this$poster.equals(other$poster)) {
            return false;
        }
        String this$backdrop = this.getBackdrop();
        String other$backdrop = other.getBackdrop();
        if (this$backdrop == null ? other$backdrop != null : !this$backdrop.equals(other$backdrop)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$filter = this.getFilter();
        String other$filter = other.getFilter();
        if (this$filter == null ? other$filter != null : !this$filter.equals(other$filter)) {
            return false;
        }
        String this$include = this.getInclude();
        String other$include = other.getInclude();
        if (this$include == null ? other$include != null : !this$include.equals(other$include)) {
            return false;
        }
        String this$exclude = this.getExclude();
        String other$exclude = other.getExclude();
        if (this$exclude == null ? other$exclude != null : !this$exclude.equals(other$exclude)) {
            return false;
        }
        String this$quality = this.getQuality();
        String other$quality = other.getQuality();
        if (this$quality == null ? other$quality != null : !this$quality.equals(other$quality)) {
            return false;
        }
        String this$resolution = this.getResolution();
        String other$resolution = other.getResolution();
        if (this$resolution == null ? other$resolution != null : !this$resolution.equals(other$resolution)) {
            return false;
        }
        String this$effect = this.getEffect();
        String other$effect = other.getEffect();
        if (this$effect == null ? other$effect != null : !this$effect.equals(other$effect)) {
            return false;
        }
        String this$note = this.getNote();
        String other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) {
            return false;
        }
        String this$state = this.getState();
        String other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) {
            return false;
        }
        String this$lastUpdate = this.getLastUpdate();
        String other$lastUpdate = other.getLastUpdate();
        if (this$lastUpdate == null ? other$lastUpdate != null : !this$lastUpdate.equals(other$lastUpdate)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$sites = this.getSites();
        String other$sites = other.getSites();
        if (this$sites == null ? other$sites != null : !this$sites.equals(other$sites)) {
            return false;
        }
        String this$downloader = this.getDownloader();
        String other$downloader = other.getDownloader();
        if (this$downloader == null ? other$downloader != null : !this$downloader.equals(other$downloader)) {
            return false;
        }
        String this$savePath = this.getSavePath();
        String other$savePath = other.getSavePath();
        if (this$savePath == null ? other$savePath != null : !this$savePath.equals(other$savePath)) {
            return false;
        }
        String this$date = this.getDate();
        String other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) {
            return false;
        }
        String this$customWords = this.getCustomWords();
        String other$customWords = other.getCustomWords();
        if (this$customWords == null ? other$customWords != null : !this$customWords.equals(other$customWords)) {
            return false;
        }
        String this$mediaCategory = this.getMediaCategory();
        String other$mediaCategory = other.getMediaCategory();
        if (this$mediaCategory == null ? other$mediaCategory != null : !this$mediaCategory.equals(other$mediaCategory)) {
            return false;
        }
        String this$filterGroups = this.getFilterGroups();
        String other$filterGroups = other.getFilterGroups();
        if (this$filterGroups == null ? other$filterGroups != null : !this$filterGroups.equals(other$filterGroups)) {
            return false;
        }
        String this$episodeGroup = this.getEpisodeGroup();
        String other$episodeGroup = other.getEpisodeGroup();
        return !(this$episodeGroup == null ? other$episodeGroup != null : !this$episodeGroup.equals(other$episodeGroup));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MoviePilotSubscriptionItemResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tmdbid = this.getTmdbid();
        result = result * 59 + ($tmdbid == null ? 43 : ((Object)$tmdbid).hashCode());
        Integer $season = this.getSeason();
        result = result * 59 + ($season == null ? 43 : ((Object)$season).hashCode());
        Integer $vote = this.getVote();
        result = result * 59 + ($vote == null ? 43 : ((Object)$vote).hashCode());
        Integer $totalEpisode = this.getTotalEpisode();
        result = result * 59 + ($totalEpisode == null ? 43 : ((Object)$totalEpisode).hashCode());
        Integer $startEpisode = this.getStartEpisode();
        result = result * 59 + ($startEpisode == null ? 43 : ((Object)$startEpisode).hashCode());
        Integer $lackEpisode = this.getLackEpisode();
        result = result * 59 + ($lackEpisode == null ? 43 : ((Object)$lackEpisode).hashCode());
        Integer $bestVersion = this.getBestVersion();
        result = result * 59 + ($bestVersion == null ? 43 : ((Object)$bestVersion).hashCode());
        Integer $currentPriority = this.getCurrentPriority();
        result = result * 59 + ($currentPriority == null ? 43 : ((Object)$currentPriority).hashCode());
        Integer $searchImdbid = this.getSearchImdbid();
        result = result * 59 + ($searchImdbid == null ? 43 : ((Object)$searchImdbid).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $year = this.getYear();
        result = result * 59 + ($year == null ? 43 : $year.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $keyword = this.getKeyword();
        result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
        String $doubanid = this.getDoubanid();
        result = result * 59 + ($doubanid == null ? 43 : $doubanid.hashCode());
        String $bangumiid = this.getBangumiid();
        result = result * 59 + ($bangumiid == null ? 43 : $bangumiid.hashCode());
        String $mediaid = this.getMediaid();
        result = result * 59 + ($mediaid == null ? 43 : $mediaid.hashCode());
        String $poster = this.getPoster();
        result = result * 59 + ($poster == null ? 43 : $poster.hashCode());
        String $backdrop = this.getBackdrop();
        result = result * 59 + ($backdrop == null ? 43 : $backdrop.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $filter = this.getFilter();
        result = result * 59 + ($filter == null ? 43 : $filter.hashCode());
        String $include = this.getInclude();
        result = result * 59 + ($include == null ? 43 : $include.hashCode());
        String $exclude = this.getExclude();
        result = result * 59 + ($exclude == null ? 43 : $exclude.hashCode());
        String $quality = this.getQuality();
        result = result * 59 + ($quality == null ? 43 : $quality.hashCode());
        String $resolution = this.getResolution();
        result = result * 59 + ($resolution == null ? 43 : $resolution.hashCode());
        String $effect = this.getEffect();
        result = result * 59 + ($effect == null ? 43 : $effect.hashCode());
        String $note = this.getNote();
        result = result * 59 + ($note == null ? 43 : $note.hashCode());
        String $state = this.getState();
        result = result * 59 + ($state == null ? 43 : $state.hashCode());
        String $lastUpdate = this.getLastUpdate();
        result = result * 59 + ($lastUpdate == null ? 43 : $lastUpdate.hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $sites = this.getSites();
        result = result * 59 + ($sites == null ? 43 : $sites.hashCode());
        String $downloader = this.getDownloader();
        result = result * 59 + ($downloader == null ? 43 : $downloader.hashCode());
        String $savePath = this.getSavePath();
        result = result * 59 + ($savePath == null ? 43 : $savePath.hashCode());
        String $date = this.getDate();
        result = result * 59 + ($date == null ? 43 : $date.hashCode());
        String $customWords = this.getCustomWords();
        result = result * 59 + ($customWords == null ? 43 : $customWords.hashCode());
        String $mediaCategory = this.getMediaCategory();
        result = result * 59 + ($mediaCategory == null ? 43 : $mediaCategory.hashCode());
        String $filterGroups = this.getFilterGroups();
        result = result * 59 + ($filterGroups == null ? 43 : $filterGroups.hashCode());
        String $episodeGroup = this.getEpisodeGroup();
        result = result * 59 + ($episodeGroup == null ? 43 : $episodeGroup.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MoviePilotSubscriptionItemResponse(id=" + this.getId() + ", name=" + this.getName() + ", year=" + this.getYear() + ", type=" + this.getType() + ", keyword=" + this.getKeyword() + ", tmdbid=" + this.getTmdbid() + ", doubanid=" + this.getDoubanid() + ", bangumiid=" + this.getBangumiid() + ", mediaid=" + this.getMediaid() + ", season=" + this.getSeason() + ", poster=" + this.getPoster() + ", backdrop=" + this.getBackdrop() + ", vote=" + this.getVote() + ", description=" + this.getDescription() + ", filter=" + this.getFilter() + ", include=" + this.getInclude() + ", exclude=" + this.getExclude() + ", quality=" + this.getQuality() + ", resolution=" + this.getResolution() + ", effect=" + this.getEffect() + ", totalEpisode=" + this.getTotalEpisode() + ", startEpisode=" + this.getStartEpisode() + ", lackEpisode=" + this.getLackEpisode() + ", note=" + this.getNote() + ", state=" + this.getState() + ", lastUpdate=" + this.getLastUpdate() + ", username=" + this.getUsername() + ", sites=" + this.getSites() + ", downloader=" + this.getDownloader() + ", bestVersion=" + this.getBestVersion() + ", currentPriority=" + this.getCurrentPriority() + ", savePath=" + this.getSavePath() + ", searchImdbid=" + this.getSearchImdbid() + ", date=" + this.getDate() + ", customWords=" + this.getCustomWords() + ", mediaCategory=" + this.getMediaCategory() + ", filterGroups=" + this.getFilterGroups() + ", episodeGroup=" + this.getEpisodeGroup() + ")";
    }
}
