/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.springframework.util.StringUtils
 *  org.telegram.telegrambots.meta.generics.TelegramClient
 */
package com.una.embyhub.model.dto.request.telegram;

import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import org.springframework.util.StringUtils;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class SendPhotoRequest
implements Serializable {
    private String chatId;
    private String name;
    private String tvInfo;
    private String overview;
    private String tmdbUrl;
    private String imgUrl;
    private InputStream imgUrlInputStream;
    private String parseMode = "Markdown";
    private Integer productionYear;
    private String genres;
    private String Type;
    private String displayTitle;
    private String Size;
    private Double voteAverage;
    private Integer voteCount;
    private int episodeNumber;
    private String seriesName;
    private int seasonNumber;
    private String episodeName;
    private String backdropPath;
    private String serverUrl;
    private String serverName;
    private String playUser;
    private String playTitle;
    private String userLocation;
    private String playTime;
    private String playPosition;
    private String clientInfo;
    private TelegramClient telegramClient;
    private String caption;
    private Map<String, String> extraVariables = new HashMap<String, String>();
    private Integer runtime;
    private String productionCountries;
    private String releaseDate;

    public void setOverview(String overview) {
        this.overview = overview;
        if (!StringUtils.hasText((String)overview)) {
            this.overview = "\u672c\u5f71\u7247\u6682\u65e0\u7b80\u4ecb\uff0c\u53ef\u80fd\u662f\u56e0\u4e3a\u5f71\u7247\u8fd8\u6ca1\u6709\u8be6\u60c5\u5185\u5bb9\uff0c\u8bf7\u70b9\u51fb\u94fe\u63a5\u67e5\u770b\u8be6\u60c5";
        }
    }

    @Generated
    public SendPhotoRequest() {
    }

    @Generated
    public String getChatId() {
        return this.chatId;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getTvInfo() {
        return this.tvInfo;
    }

    @Generated
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public String getTmdbUrl() {
        return this.tmdbUrl;
    }

    @Generated
    public String getImgUrl() {
        return this.imgUrl;
    }

    @Generated
    public InputStream getImgUrlInputStream() {
        return this.imgUrlInputStream;
    }

    @Generated
    public String getParseMode() {
        return this.parseMode;
    }

    @Generated
    public Integer getProductionYear() {
        return this.productionYear;
    }

    @Generated
    public String getGenres() {
        return this.genres;
    }

    @Generated
    public String getType() {
        return this.Type;
    }

    @Generated
    public String getDisplayTitle() {
        return this.displayTitle;
    }

    @Generated
    public String getSize() {
        return this.Size;
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
    public int getEpisodeNumber() {
        return this.episodeNumber;
    }

    @Generated
    public String getSeriesName() {
        return this.seriesName;
    }

    @Generated
    public int getSeasonNumber() {
        return this.seasonNumber;
    }

    @Generated
    public String getEpisodeName() {
        return this.episodeName;
    }

    @Generated
    public String getBackdropPath() {
        return this.backdropPath;
    }

    @Generated
    public String getServerUrl() {
        return this.serverUrl;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getPlayUser() {
        return this.playUser;
    }

    @Generated
    public String getPlayTitle() {
        return this.playTitle;
    }

    @Generated
    public String getUserLocation() {
        return this.userLocation;
    }

    @Generated
    public String getPlayTime() {
        return this.playTime;
    }

    @Generated
    public String getPlayPosition() {
        return this.playPosition;
    }

    @Generated
    public String getClientInfo() {
        return this.clientInfo;
    }

    @Generated
    public TelegramClient getTelegramClient() {
        return this.telegramClient;
    }

    @Generated
    public String getCaption() {
        return this.caption;
    }

    @Generated
    public Map<String, String> getExtraVariables() {
        return this.extraVariables;
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
    public String getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setTvInfo(String tvInfo) {
        this.tvInfo = tvInfo;
    }

    @Generated
    public void setTmdbUrl(String tmdbUrl) {
        this.tmdbUrl = tmdbUrl;
    }

    @Generated
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Generated
    public void setImgUrlInputStream(InputStream imgUrlInputStream) {
        this.imgUrlInputStream = imgUrlInputStream;
    }

    @Generated
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    @Generated
    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    @Generated
    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Generated
    public void setType(String Type) {
        this.Type = Type;
    }

    @Generated
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    @Generated
    public void setSize(String Size) {
        this.Size = Size;
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
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @Generated
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    @Generated
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Generated
    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    @Generated
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Generated
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setPlayUser(String playUser) {
        this.playUser = playUser;
    }

    @Generated
    public void setPlayTitle(String playTitle) {
        this.playTitle = playTitle;
    }

    @Generated
    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    @Generated
    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    @Generated
    public void setPlayPosition(String playPosition) {
        this.playPosition = playPosition;
    }

    @Generated
    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    @Generated
    public void setTelegramClient(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @Generated
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Generated
    public void setExtraVariables(Map<String, String> extraVariables) {
        this.extraVariables = extraVariables;
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
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SendPhotoRequest)) {
            return false;
        }
        SendPhotoRequest other = (SendPhotoRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getEpisodeNumber() != other.getEpisodeNumber()) {
            return false;
        }
        if (this.getSeasonNumber() != other.getSeasonNumber()) {
            return false;
        }
        Integer this$productionYear = this.getProductionYear();
        Integer other$productionYear = other.getProductionYear();
        if (this$productionYear == null ? other$productionYear != null : !((Object)this$productionYear).equals(other$productionYear)) {
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
        Integer this$runtime = this.getRuntime();
        Integer other$runtime = other.getRuntime();
        if (this$runtime == null ? other$runtime != null : !((Object)this$runtime).equals(other$runtime)) {
            return false;
        }
        String this$chatId = this.getChatId();
        String other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !this$chatId.equals(other$chatId)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$tvInfo = this.getTvInfo();
        String other$tvInfo = other.getTvInfo();
        if (this$tvInfo == null ? other$tvInfo != null : !this$tvInfo.equals(other$tvInfo)) {
            return false;
        }
        String this$overview = this.getOverview();
        String other$overview = other.getOverview();
        if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
            return false;
        }
        String this$tmdbUrl = this.getTmdbUrl();
        String other$tmdbUrl = other.getTmdbUrl();
        if (this$tmdbUrl == null ? other$tmdbUrl != null : !this$tmdbUrl.equals(other$tmdbUrl)) {
            return false;
        }
        String this$imgUrl = this.getImgUrl();
        String other$imgUrl = other.getImgUrl();
        if (this$imgUrl == null ? other$imgUrl != null : !this$imgUrl.equals(other$imgUrl)) {
            return false;
        }
        InputStream this$imgUrlInputStream = this.getImgUrlInputStream();
        InputStream other$imgUrlInputStream = other.getImgUrlInputStream();
        if (this$imgUrlInputStream == null ? other$imgUrlInputStream != null : !this$imgUrlInputStream.equals(other$imgUrlInputStream)) {
            return false;
        }
        String this$parseMode = this.getParseMode();
        String other$parseMode = other.getParseMode();
        if (this$parseMode == null ? other$parseMode != null : !this$parseMode.equals(other$parseMode)) {
            return false;
        }
        String this$genres = this.getGenres();
        String other$genres = other.getGenres();
        if (this$genres == null ? other$genres != null : !this$genres.equals(other$genres)) {
            return false;
        }
        String this$Type = this.getType();
        String other$Type = other.getType();
        if (this$Type == null ? other$Type != null : !this$Type.equals(other$Type)) {
            return false;
        }
        String this$displayTitle = this.getDisplayTitle();
        String other$displayTitle = other.getDisplayTitle();
        if (this$displayTitle == null ? other$displayTitle != null : !this$displayTitle.equals(other$displayTitle)) {
            return false;
        }
        String this$Size = this.getSize();
        String other$Size = other.getSize();
        if (this$Size == null ? other$Size != null : !this$Size.equals(other$Size)) {
            return false;
        }
        String this$seriesName = this.getSeriesName();
        String other$seriesName = other.getSeriesName();
        if (this$seriesName == null ? other$seriesName != null : !this$seriesName.equals(other$seriesName)) {
            return false;
        }
        String this$episodeName = this.getEpisodeName();
        String other$episodeName = other.getEpisodeName();
        if (this$episodeName == null ? other$episodeName != null : !this$episodeName.equals(other$episodeName)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$serverUrl = this.getServerUrl();
        String other$serverUrl = other.getServerUrl();
        if (this$serverUrl == null ? other$serverUrl != null : !this$serverUrl.equals(other$serverUrl)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$playUser = this.getPlayUser();
        String other$playUser = other.getPlayUser();
        if (this$playUser == null ? other$playUser != null : !this$playUser.equals(other$playUser)) {
            return false;
        }
        String this$playTitle = this.getPlayTitle();
        String other$playTitle = other.getPlayTitle();
        if (this$playTitle == null ? other$playTitle != null : !this$playTitle.equals(other$playTitle)) {
            return false;
        }
        String this$userLocation = this.getUserLocation();
        String other$userLocation = other.getUserLocation();
        if (this$userLocation == null ? other$userLocation != null : !this$userLocation.equals(other$userLocation)) {
            return false;
        }
        String this$playTime = this.getPlayTime();
        String other$playTime = other.getPlayTime();
        if (this$playTime == null ? other$playTime != null : !this$playTime.equals(other$playTime)) {
            return false;
        }
        String this$playPosition = this.getPlayPosition();
        String other$playPosition = other.getPlayPosition();
        if (this$playPosition == null ? other$playPosition != null : !this$playPosition.equals(other$playPosition)) {
            return false;
        }
        String this$clientInfo = this.getClientInfo();
        String other$clientInfo = other.getClientInfo();
        if (this$clientInfo == null ? other$clientInfo != null : !this$clientInfo.equals(other$clientInfo)) {
            return false;
        }
        TelegramClient this$telegramClient = this.getTelegramClient();
        TelegramClient other$telegramClient = other.getTelegramClient();
        if (this$telegramClient == null ? other$telegramClient != null : !this$telegramClient.equals(other$telegramClient)) {
            return false;
        }
        String this$caption = this.getCaption();
        String other$caption = other.getCaption();
        if (this$caption == null ? other$caption != null : !this$caption.equals(other$caption)) {
            return false;
        }
        Map<String, String> this$extraVariables = this.getExtraVariables();
        Map<String, String> other$extraVariables = other.getExtraVariables();
        if (this$extraVariables == null ? other$extraVariables != null : !((Object)this$extraVariables).equals(other$extraVariables)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        if (this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries)) {
            return false;
        }
        String this$releaseDate = this.getReleaseDate();
        String other$releaseDate = other.getReleaseDate();
        return !(this$releaseDate == null ? other$releaseDate != null : !this$releaseDate.equals(other$releaseDate));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SendPhotoRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getEpisodeNumber();
        result = result * 59 + this.getSeasonNumber();
        Integer $productionYear = this.getProductionYear();
        result = result * 59 + ($productionYear == null ? 43 : ((Object)$productionYear).hashCode());
        Double $voteAverage = this.getVoteAverage();
        result = result * 59 + ($voteAverage == null ? 43 : ((Object)$voteAverage).hashCode());
        Integer $voteCount = this.getVoteCount();
        result = result * 59 + ($voteCount == null ? 43 : ((Object)$voteCount).hashCode());
        Integer $runtime = this.getRuntime();
        result = result * 59 + ($runtime == null ? 43 : ((Object)$runtime).hashCode());
        String $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $tvInfo = this.getTvInfo();
        result = result * 59 + ($tvInfo == null ? 43 : $tvInfo.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $tmdbUrl = this.getTmdbUrl();
        result = result * 59 + ($tmdbUrl == null ? 43 : $tmdbUrl.hashCode());
        String $imgUrl = this.getImgUrl();
        result = result * 59 + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        InputStream $imgUrlInputStream = this.getImgUrlInputStream();
        result = result * 59 + ($imgUrlInputStream == null ? 43 : $imgUrlInputStream.hashCode());
        String $parseMode = this.getParseMode();
        result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
        String $genres = this.getGenres();
        result = result * 59 + ($genres == null ? 43 : $genres.hashCode());
        String $Type = this.getType();
        result = result * 59 + ($Type == null ? 43 : $Type.hashCode());
        String $displayTitle = this.getDisplayTitle();
        result = result * 59 + ($displayTitle == null ? 43 : $displayTitle.hashCode());
        String $Size = this.getSize();
        result = result * 59 + ($Size == null ? 43 : $Size.hashCode());
        String $seriesName = this.getSeriesName();
        result = result * 59 + ($seriesName == null ? 43 : $seriesName.hashCode());
        String $episodeName = this.getEpisodeName();
        result = result * 59 + ($episodeName == null ? 43 : $episodeName.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $serverUrl = this.getServerUrl();
        result = result * 59 + ($serverUrl == null ? 43 : $serverUrl.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $playUser = this.getPlayUser();
        result = result * 59 + ($playUser == null ? 43 : $playUser.hashCode());
        String $playTitle = this.getPlayTitle();
        result = result * 59 + ($playTitle == null ? 43 : $playTitle.hashCode());
        String $userLocation = this.getUserLocation();
        result = result * 59 + ($userLocation == null ? 43 : $userLocation.hashCode());
        String $playTime = this.getPlayTime();
        result = result * 59 + ($playTime == null ? 43 : $playTime.hashCode());
        String $playPosition = this.getPlayPosition();
        result = result * 59 + ($playPosition == null ? 43 : $playPosition.hashCode());
        String $clientInfo = this.getClientInfo();
        result = result * 59 + ($clientInfo == null ? 43 : $clientInfo.hashCode());
        TelegramClient $telegramClient = this.getTelegramClient();
        result = result * 59 + ($telegramClient == null ? 43 : $telegramClient.hashCode());
        String $caption = this.getCaption();
        result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
        Map<String, String> $extraVariables = this.getExtraVariables();
        result = result * 59 + ($extraVariables == null ? 43 : ((Object)$extraVariables).hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        String $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : $releaseDate.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SendPhotoRequest(chatId=" + this.getChatId() + ", name=" + this.getName() + ", tvInfo=" + this.getTvInfo() + ", overview=" + this.getOverview() + ", tmdbUrl=" + this.getTmdbUrl() + ", imgUrl=" + this.getImgUrl() + ", imgUrlInputStream=" + String.valueOf(this.getImgUrlInputStream()) + ", parseMode=" + this.getParseMode() + ", productionYear=" + this.getProductionYear() + ", genres=" + this.getGenres() + ", Type=" + this.getType() + ", displayTitle=" + this.getDisplayTitle() + ", Size=" + this.getSize() + ", voteAverage=" + this.getVoteAverage() + ", voteCount=" + this.getVoteCount() + ", episodeNumber=" + this.getEpisodeNumber() + ", seriesName=" + this.getSeriesName() + ", seasonNumber=" + this.getSeasonNumber() + ", episodeName=" + this.getEpisodeName() + ", backdropPath=" + this.getBackdropPath() + ", serverUrl=" + this.getServerUrl() + ", serverName=" + this.getServerName() + ", playUser=" + this.getPlayUser() + ", playTitle=" + this.getPlayTitle() + ", userLocation=" + this.getUserLocation() + ", playTime=" + this.getPlayTime() + ", playPosition=" + this.getPlayPosition() + ", clientInfo=" + this.getClientInfo() + ", telegramClient=" + String.valueOf(this.getTelegramClient()) + ", caption=" + this.getCaption() + ", extraVariables=" + String.valueOf(this.getExtraVariables()) + ", runtime=" + this.getRuntime() + ", productionCountries=" + this.getProductionCountries() + ", releaseDate=" + this.getReleaseDate() + ")";
    }
}
