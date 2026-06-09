/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.emby;

import java.io.Serializable;
import lombok.Generated;

public class GetShowsByIdSeasonsRequestDto
implements Serializable {
    private String id;
    private String artistType;
    private String maxOfficialRating;
    private Boolean hasThemeSong;
    private Boolean hasThemeVideo;
    private Boolean hasSubtitles;
    private Boolean hasSpecialFeature;
    private Boolean hasTrailer;
    private Boolean isSpecialSeason;
    private String adjacentTo;
    private String startItemId;
    private Integer minIndexNumber;
    private String minStartDate;
    private String maxStartDate;
    private String minEndDate;
    private String maxEndDate;
    private Integer minPlayers;
    private Integer maxPlayers;
    private Integer parentIndexNumber;
    private Boolean hasParentalRating;
    private Boolean isHD;
    private Boolean isUnaired;
    private Double minCommunityRating;
    private Double minCriticRating;
    private Integer airedDuringSeason;
    private String minPremiereDate;
    private String minDateLastSaved;
    private String minDateLastSavedForUser;
    private String maxPremiereDate;
    private Boolean hasOverview;
    private Boolean hasImdbId;
    private Boolean hasTmdbId;
    private Boolean hasTvdbId;
    private String excludeItemIds;
    private Integer startIndex;
    private Integer limit;
    private Boolean recursive;
    private String searchTerm;
    private String sortOrder;
    private String parentId;
    private String fields;
    private String excludeItemTypes;
    private String includeItemTypes;
    private String anyProviderIdEquals;
    private String filters;
    private Boolean isFavorite;
    private Boolean isMovie;
    private Boolean isSeries;
    private Boolean isFolder;
    private Boolean isNews;
    private Boolean isKids;
    private Boolean isSports;
    private Boolean isNew;
    private Boolean isPremiere;
    private Boolean isNewOrPremiere;
    private Boolean isRepeat;
    private Boolean projectToMedia;
    private String mediaTypes;
    private String imageTypes;
    private String sortBy;
    private Boolean isPlayed;
    private String genres;
    private String officialRatings;
    private String tags;
    private String excludeTags;
    private String years;
    private Boolean enableImages;
    private Boolean enableUserData;
    private Integer imageTypeLimit;
    private String enableImageTypes;
    private String person;
    private String personIds;
    private String personTypes;
    private String studios;
    private String studioIds;
    private String artists;
    private String artistIds;
    private String albums;
    private String ids;
    private String videoTypes;
    private String containers;
    private String audioCodecs;
    private String audioLayouts;
    private String videoCodecs;
    private String extendedVideoTypes;
    private String subtitleCodecs;
    private String path;
    private String userId;
    private String minOfficialRating;
    private Boolean isLocked;
    private Boolean isPlaceHolder;
    private Boolean hasOfficialRating;
    private Boolean groupItemsIntoCollections;
    private Boolean is3D;
    private String seriesStatus;
    private String nameStartsWithOrGreater;
    private String artistStartsWithOrGreater;
    private String albumArtistStartsWithOrGreater;
    private String nameStartsWith;
    private String nameLessThan;

    @Generated
    public GetShowsByIdSeasonsRequestDto() {
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getArtistType() {
        return this.artistType;
    }

    @Generated
    public String getMaxOfficialRating() {
        return this.maxOfficialRating;
    }

    @Generated
    public Boolean getHasThemeSong() {
        return this.hasThemeSong;
    }

    @Generated
    public Boolean getHasThemeVideo() {
        return this.hasThemeVideo;
    }

    @Generated
    public Boolean getHasSubtitles() {
        return this.hasSubtitles;
    }

    @Generated
    public Boolean getHasSpecialFeature() {
        return this.hasSpecialFeature;
    }

    @Generated
    public Boolean getHasTrailer() {
        return this.hasTrailer;
    }

    @Generated
    public Boolean getIsSpecialSeason() {
        return this.isSpecialSeason;
    }

    @Generated
    public String getAdjacentTo() {
        return this.adjacentTo;
    }

    @Generated
    public String getStartItemId() {
        return this.startItemId;
    }

    @Generated
    public Integer getMinIndexNumber() {
        return this.minIndexNumber;
    }

    @Generated
    public String getMinStartDate() {
        return this.minStartDate;
    }

    @Generated
    public String getMaxStartDate() {
        return this.maxStartDate;
    }

    @Generated
    public String getMinEndDate() {
        return this.minEndDate;
    }

    @Generated
    public String getMaxEndDate() {
        return this.maxEndDate;
    }

    @Generated
    public Integer getMinPlayers() {
        return this.minPlayers;
    }

    @Generated
    public Integer getMaxPlayers() {
        return this.maxPlayers;
    }

    @Generated
    public Integer getParentIndexNumber() {
        return this.parentIndexNumber;
    }

    @Generated
    public Boolean getHasParentalRating() {
        return this.hasParentalRating;
    }

    @Generated
    public Boolean getIsHD() {
        return this.isHD;
    }

    @Generated
    public Boolean getIsUnaired() {
        return this.isUnaired;
    }

    @Generated
    public Double getMinCommunityRating() {
        return this.minCommunityRating;
    }

    @Generated
    public Double getMinCriticRating() {
        return this.minCriticRating;
    }

    @Generated
    public Integer getAiredDuringSeason() {
        return this.airedDuringSeason;
    }

    @Generated
    public String getMinPremiereDate() {
        return this.minPremiereDate;
    }

    @Generated
    public String getMinDateLastSaved() {
        return this.minDateLastSaved;
    }

    @Generated
    public String getMinDateLastSavedForUser() {
        return this.minDateLastSavedForUser;
    }

    @Generated
    public String getMaxPremiereDate() {
        return this.maxPremiereDate;
    }

    @Generated
    public Boolean getHasOverview() {
        return this.hasOverview;
    }

    @Generated
    public Boolean getHasImdbId() {
        return this.hasImdbId;
    }

    @Generated
    public Boolean getHasTmdbId() {
        return this.hasTmdbId;
    }

    @Generated
    public Boolean getHasTvdbId() {
        return this.hasTvdbId;
    }

    @Generated
    public String getExcludeItemIds() {
        return this.excludeItemIds;
    }

    @Generated
    public Integer getStartIndex() {
        return this.startIndex;
    }

    @Generated
    public Integer getLimit() {
        return this.limit;
    }

    @Generated
    public Boolean getRecursive() {
        return this.recursive;
    }

    @Generated
    public String getSearchTerm() {
        return this.searchTerm;
    }

    @Generated
    public String getSortOrder() {
        return this.sortOrder;
    }

    @Generated
    public String getParentId() {
        return this.parentId;
    }

    @Generated
    public String getFields() {
        return this.fields;
    }

    @Generated
    public String getExcludeItemTypes() {
        return this.excludeItemTypes;
    }

    @Generated
    public String getIncludeItemTypes() {
        return this.includeItemTypes;
    }

    @Generated
    public String getAnyProviderIdEquals() {
        return this.anyProviderIdEquals;
    }

    @Generated
    public String getFilters() {
        return this.filters;
    }

    @Generated
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Generated
    public Boolean getIsMovie() {
        return this.isMovie;
    }

    @Generated
    public Boolean getIsSeries() {
        return this.isSeries;
    }

    @Generated
    public Boolean getIsFolder() {
        return this.isFolder;
    }

    @Generated
    public Boolean getIsNews() {
        return this.isNews;
    }

    @Generated
    public Boolean getIsKids() {
        return this.isKids;
    }

    @Generated
    public Boolean getIsSports() {
        return this.isSports;
    }

    @Generated
    public Boolean getIsNew() {
        return this.isNew;
    }

    @Generated
    public Boolean getIsPremiere() {
        return this.isPremiere;
    }

    @Generated
    public Boolean getIsNewOrPremiere() {
        return this.isNewOrPremiere;
    }

    @Generated
    public Boolean getIsRepeat() {
        return this.isRepeat;
    }

    @Generated
    public Boolean getProjectToMedia() {
        return this.projectToMedia;
    }

    @Generated
    public String getMediaTypes() {
        return this.mediaTypes;
    }

    @Generated
    public String getImageTypes() {
        return this.imageTypes;
    }

    @Generated
    public String getSortBy() {
        return this.sortBy;
    }

    @Generated
    public Boolean getIsPlayed() {
        return this.isPlayed;
    }

    @Generated
    public String getGenres() {
        return this.genres;
    }

    @Generated
    public String getOfficialRatings() {
        return this.officialRatings;
    }

    @Generated
    public String getTags() {
        return this.tags;
    }

    @Generated
    public String getExcludeTags() {
        return this.excludeTags;
    }

    @Generated
    public String getYears() {
        return this.years;
    }

    @Generated
    public Boolean getEnableImages() {
        return this.enableImages;
    }

    @Generated
    public Boolean getEnableUserData() {
        return this.enableUserData;
    }

    @Generated
    public Integer getImageTypeLimit() {
        return this.imageTypeLimit;
    }

    @Generated
    public String getEnableImageTypes() {
        return this.enableImageTypes;
    }

    @Generated
    public String getPerson() {
        return this.person;
    }

    @Generated
    public String getPersonIds() {
        return this.personIds;
    }

    @Generated
    public String getPersonTypes() {
        return this.personTypes;
    }

    @Generated
    public String getStudios() {
        return this.studios;
    }

    @Generated
    public String getStudioIds() {
        return this.studioIds;
    }

    @Generated
    public String getArtists() {
        return this.artists;
    }

    @Generated
    public String getArtistIds() {
        return this.artistIds;
    }

    @Generated
    public String getAlbums() {
        return this.albums;
    }

    @Generated
    public String getIds() {
        return this.ids;
    }

    @Generated
    public String getVideoTypes() {
        return this.videoTypes;
    }

    @Generated
    public String getContainers() {
        return this.containers;
    }

    @Generated
    public String getAudioCodecs() {
        return this.audioCodecs;
    }

    @Generated
    public String getAudioLayouts() {
        return this.audioLayouts;
    }

    @Generated
    public String getVideoCodecs() {
        return this.videoCodecs;
    }

    @Generated
    public String getExtendedVideoTypes() {
        return this.extendedVideoTypes;
    }

    @Generated
    public String getSubtitleCodecs() {
        return this.subtitleCodecs;
    }

    @Generated
    public String getPath() {
        return this.path;
    }

    @Generated
    public String getUserId() {
        return this.userId;
    }

    @Generated
    public String getMinOfficialRating() {
        return this.minOfficialRating;
    }

    @Generated
    public Boolean getIsLocked() {
        return this.isLocked;
    }

    @Generated
    public Boolean getIsPlaceHolder() {
        return this.isPlaceHolder;
    }

    @Generated
    public Boolean getHasOfficialRating() {
        return this.hasOfficialRating;
    }

    @Generated
    public Boolean getGroupItemsIntoCollections() {
        return this.groupItemsIntoCollections;
    }

    @Generated
    public Boolean getIs3D() {
        return this.is3D;
    }

    @Generated
    public String getSeriesStatus() {
        return this.seriesStatus;
    }

    @Generated
    public String getNameStartsWithOrGreater() {
        return this.nameStartsWithOrGreater;
    }

    @Generated
    public String getArtistStartsWithOrGreater() {
        return this.artistStartsWithOrGreater;
    }

    @Generated
    public String getAlbumArtistStartsWithOrGreater() {
        return this.albumArtistStartsWithOrGreater;
    }

    @Generated
    public String getNameStartsWith() {
        return this.nameStartsWith;
    }

    @Generated
    public String getNameLessThan() {
        return this.nameLessThan;
    }

    @Generated
    public void setId(String id) {
        this.id = id;
    }

    @Generated
    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    @Generated
    public void setMaxOfficialRating(String maxOfficialRating) {
        this.maxOfficialRating = maxOfficialRating;
    }

    @Generated
    public void setHasThemeSong(Boolean hasThemeSong) {
        this.hasThemeSong = hasThemeSong;
    }

    @Generated
    public void setHasThemeVideo(Boolean hasThemeVideo) {
        this.hasThemeVideo = hasThemeVideo;
    }

    @Generated
    public void setHasSubtitles(Boolean hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    @Generated
    public void setHasSpecialFeature(Boolean hasSpecialFeature) {
        this.hasSpecialFeature = hasSpecialFeature;
    }

    @Generated
    public void setHasTrailer(Boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Generated
    public void setIsSpecialSeason(Boolean isSpecialSeason) {
        this.isSpecialSeason = isSpecialSeason;
    }

    @Generated
    public void setAdjacentTo(String adjacentTo) {
        this.adjacentTo = adjacentTo;
    }

    @Generated
    public void setStartItemId(String startItemId) {
        this.startItemId = startItemId;
    }

    @Generated
    public void setMinIndexNumber(Integer minIndexNumber) {
        this.minIndexNumber = minIndexNumber;
    }

    @Generated
    public void setMinStartDate(String minStartDate) {
        this.minStartDate = minStartDate;
    }

    @Generated
    public void setMaxStartDate(String maxStartDate) {
        this.maxStartDate = maxStartDate;
    }

    @Generated
    public void setMinEndDate(String minEndDate) {
        this.minEndDate = minEndDate;
    }

    @Generated
    public void setMaxEndDate(String maxEndDate) {
        this.maxEndDate = maxEndDate;
    }

    @Generated
    public void setMinPlayers(Integer minPlayers) {
        this.minPlayers = minPlayers;
    }

    @Generated
    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    @Generated
    public void setParentIndexNumber(Integer parentIndexNumber) {
        this.parentIndexNumber = parentIndexNumber;
    }

    @Generated
    public void setHasParentalRating(Boolean hasParentalRating) {
        this.hasParentalRating = hasParentalRating;
    }

    @Generated
    public void setIsHD(Boolean isHD) {
        this.isHD = isHD;
    }

    @Generated
    public void setIsUnaired(Boolean isUnaired) {
        this.isUnaired = isUnaired;
    }

    @Generated
    public void setMinCommunityRating(Double minCommunityRating) {
        this.minCommunityRating = minCommunityRating;
    }

    @Generated
    public void setMinCriticRating(Double minCriticRating) {
        this.minCriticRating = minCriticRating;
    }

    @Generated
    public void setAiredDuringSeason(Integer airedDuringSeason) {
        this.airedDuringSeason = airedDuringSeason;
    }

    @Generated
    public void setMinPremiereDate(String minPremiereDate) {
        this.minPremiereDate = minPremiereDate;
    }

    @Generated
    public void setMinDateLastSaved(String minDateLastSaved) {
        this.minDateLastSaved = minDateLastSaved;
    }

    @Generated
    public void setMinDateLastSavedForUser(String minDateLastSavedForUser) {
        this.minDateLastSavedForUser = minDateLastSavedForUser;
    }

    @Generated
    public void setMaxPremiereDate(String maxPremiereDate) {
        this.maxPremiereDate = maxPremiereDate;
    }

    @Generated
    public void setHasOverview(Boolean hasOverview) {
        this.hasOverview = hasOverview;
    }

    @Generated
    public void setHasImdbId(Boolean hasImdbId) {
        this.hasImdbId = hasImdbId;
    }

    @Generated
    public void setHasTmdbId(Boolean hasTmdbId) {
        this.hasTmdbId = hasTmdbId;
    }

    @Generated
    public void setHasTvdbId(Boolean hasTvdbId) {
        this.hasTvdbId = hasTvdbId;
    }

    @Generated
    public void setExcludeItemIds(String excludeItemIds) {
        this.excludeItemIds = excludeItemIds;
    }

    @Generated
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @Generated
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Generated
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    @Generated
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Generated
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Generated
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Generated
    public void setFields(String fields) {
        this.fields = fields;
    }

    @Generated
    public void setExcludeItemTypes(String excludeItemTypes) {
        this.excludeItemTypes = excludeItemTypes;
    }

    @Generated
    public void setIncludeItemTypes(String includeItemTypes) {
        this.includeItemTypes = includeItemTypes;
    }

    @Generated
    public void setAnyProviderIdEquals(String anyProviderIdEquals) {
        this.anyProviderIdEquals = anyProviderIdEquals;
    }

    @Generated
    public void setFilters(String filters) {
        this.filters = filters;
    }

    @Generated
    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    @Generated
    public void setIsMovie(Boolean isMovie) {
        this.isMovie = isMovie;
    }

    @Generated
    public void setIsSeries(Boolean isSeries) {
        this.isSeries = isSeries;
    }

    @Generated
    public void setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
    }

    @Generated
    public void setIsNews(Boolean isNews) {
        this.isNews = isNews;
    }

    @Generated
    public void setIsKids(Boolean isKids) {
        this.isKids = isKids;
    }

    @Generated
    public void setIsSports(Boolean isSports) {
        this.isSports = isSports;
    }

    @Generated
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    @Generated
    public void setIsPremiere(Boolean isPremiere) {
        this.isPremiere = isPremiere;
    }

    @Generated
    public void setIsNewOrPremiere(Boolean isNewOrPremiere) {
        this.isNewOrPremiere = isNewOrPremiere;
    }

    @Generated
    public void setIsRepeat(Boolean isRepeat) {
        this.isRepeat = isRepeat;
    }

    @Generated
    public void setProjectToMedia(Boolean projectToMedia) {
        this.projectToMedia = projectToMedia;
    }

    @Generated
    public void setMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    @Generated
    public void setImageTypes(String imageTypes) {
        this.imageTypes = imageTypes;
    }

    @Generated
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    @Generated
    public void setIsPlayed(Boolean isPlayed) {
        this.isPlayed = isPlayed;
    }

    @Generated
    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Generated
    public void setOfficialRatings(String officialRatings) {
        this.officialRatings = officialRatings;
    }

    @Generated
    public void setTags(String tags) {
        this.tags = tags;
    }

    @Generated
    public void setExcludeTags(String excludeTags) {
        this.excludeTags = excludeTags;
    }

    @Generated
    public void setYears(String years) {
        this.years = years;
    }

    @Generated
    public void setEnableImages(Boolean enableImages) {
        this.enableImages = enableImages;
    }

    @Generated
    public void setEnableUserData(Boolean enableUserData) {
        this.enableUserData = enableUserData;
    }

    @Generated
    public void setImageTypeLimit(Integer imageTypeLimit) {
        this.imageTypeLimit = imageTypeLimit;
    }

    @Generated
    public void setEnableImageTypes(String enableImageTypes) {
        this.enableImageTypes = enableImageTypes;
    }

    @Generated
    public void setPerson(String person) {
        this.person = person;
    }

    @Generated
    public void setPersonIds(String personIds) {
        this.personIds = personIds;
    }

    @Generated
    public void setPersonTypes(String personTypes) {
        this.personTypes = personTypes;
    }

    @Generated
    public void setStudios(String studios) {
        this.studios = studios;
    }

    @Generated
    public void setStudioIds(String studioIds) {
        this.studioIds = studioIds;
    }

    @Generated
    public void setArtists(String artists) {
        this.artists = artists;
    }

    @Generated
    public void setArtistIds(String artistIds) {
        this.artistIds = artistIds;
    }

    @Generated
    public void setAlbums(String albums) {
        this.albums = albums;
    }

    @Generated
    public void setIds(String ids) {
        this.ids = ids;
    }

    @Generated
    public void setVideoTypes(String videoTypes) {
        this.videoTypes = videoTypes;
    }

    @Generated
    public void setContainers(String containers) {
        this.containers = containers;
    }

    @Generated
    public void setAudioCodecs(String audioCodecs) {
        this.audioCodecs = audioCodecs;
    }

    @Generated
    public void setAudioLayouts(String audioLayouts) {
        this.audioLayouts = audioLayouts;
    }

    @Generated
    public void setVideoCodecs(String videoCodecs) {
        this.videoCodecs = videoCodecs;
    }

    @Generated
    public void setExtendedVideoTypes(String extendedVideoTypes) {
        this.extendedVideoTypes = extendedVideoTypes;
    }

    @Generated
    public void setSubtitleCodecs(String subtitleCodecs) {
        this.subtitleCodecs = subtitleCodecs;
    }

    @Generated
    public void setPath(String path) {
        this.path = path;
    }

    @Generated
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Generated
    public void setMinOfficialRating(String minOfficialRating) {
        this.minOfficialRating = minOfficialRating;
    }

    @Generated
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @Generated
    public void setIsPlaceHolder(Boolean isPlaceHolder) {
        this.isPlaceHolder = isPlaceHolder;
    }

    @Generated
    public void setHasOfficialRating(Boolean hasOfficialRating) {
        this.hasOfficialRating = hasOfficialRating;
    }

    @Generated
    public void setGroupItemsIntoCollections(Boolean groupItemsIntoCollections) {
        this.groupItemsIntoCollections = groupItemsIntoCollections;
    }

    @Generated
    public void setIs3D(Boolean is3D) {
        this.is3D = is3D;
    }

    @Generated
    public void setSeriesStatus(String seriesStatus) {
        this.seriesStatus = seriesStatus;
    }

    @Generated
    public void setNameStartsWithOrGreater(String nameStartsWithOrGreater) {
        this.nameStartsWithOrGreater = nameStartsWithOrGreater;
    }

    @Generated
    public void setArtistStartsWithOrGreater(String artistStartsWithOrGreater) {
        this.artistStartsWithOrGreater = artistStartsWithOrGreater;
    }

    @Generated
    public void setAlbumArtistStartsWithOrGreater(String albumArtistStartsWithOrGreater) {
        this.albumArtistStartsWithOrGreater = albumArtistStartsWithOrGreater;
    }

    @Generated
    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    @Generated
    public void setNameLessThan(String nameLessThan) {
        this.nameLessThan = nameLessThan;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetShowsByIdSeasonsRequestDto)) {
            return false;
        }
        GetShowsByIdSeasonsRequestDto other = (GetShowsByIdSeasonsRequestDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$hasThemeSong = this.getHasThemeSong();
        Boolean other$hasThemeSong = other.getHasThemeSong();
        if (this$hasThemeSong == null ? other$hasThemeSong != null : !((Object)this$hasThemeSong).equals(other$hasThemeSong)) {
            return false;
        }
        Boolean this$hasThemeVideo = this.getHasThemeVideo();
        Boolean other$hasThemeVideo = other.getHasThemeVideo();
        if (this$hasThemeVideo == null ? other$hasThemeVideo != null : !((Object)this$hasThemeVideo).equals(other$hasThemeVideo)) {
            return false;
        }
        Boolean this$hasSubtitles = this.getHasSubtitles();
        Boolean other$hasSubtitles = other.getHasSubtitles();
        if (this$hasSubtitles == null ? other$hasSubtitles != null : !((Object)this$hasSubtitles).equals(other$hasSubtitles)) {
            return false;
        }
        Boolean this$hasSpecialFeature = this.getHasSpecialFeature();
        Boolean other$hasSpecialFeature = other.getHasSpecialFeature();
        if (this$hasSpecialFeature == null ? other$hasSpecialFeature != null : !((Object)this$hasSpecialFeature).equals(other$hasSpecialFeature)) {
            return false;
        }
        Boolean this$hasTrailer = this.getHasTrailer();
        Boolean other$hasTrailer = other.getHasTrailer();
        if (this$hasTrailer == null ? other$hasTrailer != null : !((Object)this$hasTrailer).equals(other$hasTrailer)) {
            return false;
        }
        Boolean this$isSpecialSeason = this.getIsSpecialSeason();
        Boolean other$isSpecialSeason = other.getIsSpecialSeason();
        if (this$isSpecialSeason == null ? other$isSpecialSeason != null : !((Object)this$isSpecialSeason).equals(other$isSpecialSeason)) {
            return false;
        }
        Integer this$minIndexNumber = this.getMinIndexNumber();
        Integer other$minIndexNumber = other.getMinIndexNumber();
        if (this$minIndexNumber == null ? other$minIndexNumber != null : !((Object)this$minIndexNumber).equals(other$minIndexNumber)) {
            return false;
        }
        Integer this$minPlayers = this.getMinPlayers();
        Integer other$minPlayers = other.getMinPlayers();
        if (this$minPlayers == null ? other$minPlayers != null : !((Object)this$minPlayers).equals(other$minPlayers)) {
            return false;
        }
        Integer this$maxPlayers = this.getMaxPlayers();
        Integer other$maxPlayers = other.getMaxPlayers();
        if (this$maxPlayers == null ? other$maxPlayers != null : !((Object)this$maxPlayers).equals(other$maxPlayers)) {
            return false;
        }
        Integer this$parentIndexNumber = this.getParentIndexNumber();
        Integer other$parentIndexNumber = other.getParentIndexNumber();
        if (this$parentIndexNumber == null ? other$parentIndexNumber != null : !((Object)this$parentIndexNumber).equals(other$parentIndexNumber)) {
            return false;
        }
        Boolean this$hasParentalRating = this.getHasParentalRating();
        Boolean other$hasParentalRating = other.getHasParentalRating();
        if (this$hasParentalRating == null ? other$hasParentalRating != null : !((Object)this$hasParentalRating).equals(other$hasParentalRating)) {
            return false;
        }
        Boolean this$isHD = this.getIsHD();
        Boolean other$isHD = other.getIsHD();
        if (this$isHD == null ? other$isHD != null : !((Object)this$isHD).equals(other$isHD)) {
            return false;
        }
        Boolean this$isUnaired = this.getIsUnaired();
        Boolean other$isUnaired = other.getIsUnaired();
        if (this$isUnaired == null ? other$isUnaired != null : !((Object)this$isUnaired).equals(other$isUnaired)) {
            return false;
        }
        Double this$minCommunityRating = this.getMinCommunityRating();
        Double other$minCommunityRating = other.getMinCommunityRating();
        if (this$minCommunityRating == null ? other$minCommunityRating != null : !((Object)this$minCommunityRating).equals(other$minCommunityRating)) {
            return false;
        }
        Double this$minCriticRating = this.getMinCriticRating();
        Double other$minCriticRating = other.getMinCriticRating();
        if (this$minCriticRating == null ? other$minCriticRating != null : !((Object)this$minCriticRating).equals(other$minCriticRating)) {
            return false;
        }
        Integer this$airedDuringSeason = this.getAiredDuringSeason();
        Integer other$airedDuringSeason = other.getAiredDuringSeason();
        if (this$airedDuringSeason == null ? other$airedDuringSeason != null : !((Object)this$airedDuringSeason).equals(other$airedDuringSeason)) {
            return false;
        }
        Boolean this$hasOverview = this.getHasOverview();
        Boolean other$hasOverview = other.getHasOverview();
        if (this$hasOverview == null ? other$hasOverview != null : !((Object)this$hasOverview).equals(other$hasOverview)) {
            return false;
        }
        Boolean this$hasImdbId = this.getHasImdbId();
        Boolean other$hasImdbId = other.getHasImdbId();
        if (this$hasImdbId == null ? other$hasImdbId != null : !((Object)this$hasImdbId).equals(other$hasImdbId)) {
            return false;
        }
        Boolean this$hasTmdbId = this.getHasTmdbId();
        Boolean other$hasTmdbId = other.getHasTmdbId();
        if (this$hasTmdbId == null ? other$hasTmdbId != null : !((Object)this$hasTmdbId).equals(other$hasTmdbId)) {
            return false;
        }
        Boolean this$hasTvdbId = this.getHasTvdbId();
        Boolean other$hasTvdbId = other.getHasTvdbId();
        if (this$hasTvdbId == null ? other$hasTvdbId != null : !((Object)this$hasTvdbId).equals(other$hasTvdbId)) {
            return false;
        }
        Integer this$startIndex = this.getStartIndex();
        Integer other$startIndex = other.getStartIndex();
        if (this$startIndex == null ? other$startIndex != null : !((Object)this$startIndex).equals(other$startIndex)) {
            return false;
        }
        Integer this$limit = this.getLimit();
        Integer other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !((Object)this$limit).equals(other$limit)) {
            return false;
        }
        Boolean this$recursive = this.getRecursive();
        Boolean other$recursive = other.getRecursive();
        if (this$recursive == null ? other$recursive != null : !((Object)this$recursive).equals(other$recursive)) {
            return false;
        }
        Boolean this$isFavorite = this.getIsFavorite();
        Boolean other$isFavorite = other.getIsFavorite();
        if (this$isFavorite == null ? other$isFavorite != null : !((Object)this$isFavorite).equals(other$isFavorite)) {
            return false;
        }
        Boolean this$isMovie = this.getIsMovie();
        Boolean other$isMovie = other.getIsMovie();
        if (this$isMovie == null ? other$isMovie != null : !((Object)this$isMovie).equals(other$isMovie)) {
            return false;
        }
        Boolean this$isSeries = this.getIsSeries();
        Boolean other$isSeries = other.getIsSeries();
        if (this$isSeries == null ? other$isSeries != null : !((Object)this$isSeries).equals(other$isSeries)) {
            return false;
        }
        Boolean this$isFolder = this.getIsFolder();
        Boolean other$isFolder = other.getIsFolder();
        if (this$isFolder == null ? other$isFolder != null : !((Object)this$isFolder).equals(other$isFolder)) {
            return false;
        }
        Boolean this$isNews = this.getIsNews();
        Boolean other$isNews = other.getIsNews();
        if (this$isNews == null ? other$isNews != null : !((Object)this$isNews).equals(other$isNews)) {
            return false;
        }
        Boolean this$isKids = this.getIsKids();
        Boolean other$isKids = other.getIsKids();
        if (this$isKids == null ? other$isKids != null : !((Object)this$isKids).equals(other$isKids)) {
            return false;
        }
        Boolean this$isSports = this.getIsSports();
        Boolean other$isSports = other.getIsSports();
        if (this$isSports == null ? other$isSports != null : !((Object)this$isSports).equals(other$isSports)) {
            return false;
        }
        Boolean this$isNew = this.getIsNew();
        Boolean other$isNew = other.getIsNew();
        if (this$isNew == null ? other$isNew != null : !((Object)this$isNew).equals(other$isNew)) {
            return false;
        }
        Boolean this$isPremiere = this.getIsPremiere();
        Boolean other$isPremiere = other.getIsPremiere();
        if (this$isPremiere == null ? other$isPremiere != null : !((Object)this$isPremiere).equals(other$isPremiere)) {
            return false;
        }
        Boolean this$isNewOrPremiere = this.getIsNewOrPremiere();
        Boolean other$isNewOrPremiere = other.getIsNewOrPremiere();
        if (this$isNewOrPremiere == null ? other$isNewOrPremiere != null : !((Object)this$isNewOrPremiere).equals(other$isNewOrPremiere)) {
            return false;
        }
        Boolean this$isRepeat = this.getIsRepeat();
        Boolean other$isRepeat = other.getIsRepeat();
        if (this$isRepeat == null ? other$isRepeat != null : !((Object)this$isRepeat).equals(other$isRepeat)) {
            return false;
        }
        Boolean this$projectToMedia = this.getProjectToMedia();
        Boolean other$projectToMedia = other.getProjectToMedia();
        if (this$projectToMedia == null ? other$projectToMedia != null : !((Object)this$projectToMedia).equals(other$projectToMedia)) {
            return false;
        }
        Boolean this$isPlayed = this.getIsPlayed();
        Boolean other$isPlayed = other.getIsPlayed();
        if (this$isPlayed == null ? other$isPlayed != null : !((Object)this$isPlayed).equals(other$isPlayed)) {
            return false;
        }
        Boolean this$enableImages = this.getEnableImages();
        Boolean other$enableImages = other.getEnableImages();
        if (this$enableImages == null ? other$enableImages != null : !((Object)this$enableImages).equals(other$enableImages)) {
            return false;
        }
        Boolean this$enableUserData = this.getEnableUserData();
        Boolean other$enableUserData = other.getEnableUserData();
        if (this$enableUserData == null ? other$enableUserData != null : !((Object)this$enableUserData).equals(other$enableUserData)) {
            return false;
        }
        Integer this$imageTypeLimit = this.getImageTypeLimit();
        Integer other$imageTypeLimit = other.getImageTypeLimit();
        if (this$imageTypeLimit == null ? other$imageTypeLimit != null : !((Object)this$imageTypeLimit).equals(other$imageTypeLimit)) {
            return false;
        }
        Boolean this$isLocked = this.getIsLocked();
        Boolean other$isLocked = other.getIsLocked();
        if (this$isLocked == null ? other$isLocked != null : !((Object)this$isLocked).equals(other$isLocked)) {
            return false;
        }
        Boolean this$isPlaceHolder = this.getIsPlaceHolder();
        Boolean other$isPlaceHolder = other.getIsPlaceHolder();
        if (this$isPlaceHolder == null ? other$isPlaceHolder != null : !((Object)this$isPlaceHolder).equals(other$isPlaceHolder)) {
            return false;
        }
        Boolean this$hasOfficialRating = this.getHasOfficialRating();
        Boolean other$hasOfficialRating = other.getHasOfficialRating();
        if (this$hasOfficialRating == null ? other$hasOfficialRating != null : !((Object)this$hasOfficialRating).equals(other$hasOfficialRating)) {
            return false;
        }
        Boolean this$groupItemsIntoCollections = this.getGroupItemsIntoCollections();
        Boolean other$groupItemsIntoCollections = other.getGroupItemsIntoCollections();
        if (this$groupItemsIntoCollections == null ? other$groupItemsIntoCollections != null : !((Object)this$groupItemsIntoCollections).equals(other$groupItemsIntoCollections)) {
            return false;
        }
        Boolean this$is3D = this.getIs3D();
        Boolean other$is3D = other.getIs3D();
        if (this$is3D == null ? other$is3D != null : !((Object)this$is3D).equals(other$is3D)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$artistType = this.getArtistType();
        String other$artistType = other.getArtistType();
        if (this$artistType == null ? other$artistType != null : !this$artistType.equals(other$artistType)) {
            return false;
        }
        String this$maxOfficialRating = this.getMaxOfficialRating();
        String other$maxOfficialRating = other.getMaxOfficialRating();
        if (this$maxOfficialRating == null ? other$maxOfficialRating != null : !this$maxOfficialRating.equals(other$maxOfficialRating)) {
            return false;
        }
        String this$adjacentTo = this.getAdjacentTo();
        String other$adjacentTo = other.getAdjacentTo();
        if (this$adjacentTo == null ? other$adjacentTo != null : !this$adjacentTo.equals(other$adjacentTo)) {
            return false;
        }
        String this$startItemId = this.getStartItemId();
        String other$startItemId = other.getStartItemId();
        if (this$startItemId == null ? other$startItemId != null : !this$startItemId.equals(other$startItemId)) {
            return false;
        }
        String this$minStartDate = this.getMinStartDate();
        String other$minStartDate = other.getMinStartDate();
        if (this$minStartDate == null ? other$minStartDate != null : !this$minStartDate.equals(other$minStartDate)) {
            return false;
        }
        String this$maxStartDate = this.getMaxStartDate();
        String other$maxStartDate = other.getMaxStartDate();
        if (this$maxStartDate == null ? other$maxStartDate != null : !this$maxStartDate.equals(other$maxStartDate)) {
            return false;
        }
        String this$minEndDate = this.getMinEndDate();
        String other$minEndDate = other.getMinEndDate();
        if (this$minEndDate == null ? other$minEndDate != null : !this$minEndDate.equals(other$minEndDate)) {
            return false;
        }
        String this$maxEndDate = this.getMaxEndDate();
        String other$maxEndDate = other.getMaxEndDate();
        if (this$maxEndDate == null ? other$maxEndDate != null : !this$maxEndDate.equals(other$maxEndDate)) {
            return false;
        }
        String this$minPremiereDate = this.getMinPremiereDate();
        String other$minPremiereDate = other.getMinPremiereDate();
        if (this$minPremiereDate == null ? other$minPremiereDate != null : !this$minPremiereDate.equals(other$minPremiereDate)) {
            return false;
        }
        String this$minDateLastSaved = this.getMinDateLastSaved();
        String other$minDateLastSaved = other.getMinDateLastSaved();
        if (this$minDateLastSaved == null ? other$minDateLastSaved != null : !this$minDateLastSaved.equals(other$minDateLastSaved)) {
            return false;
        }
        String this$minDateLastSavedForUser = this.getMinDateLastSavedForUser();
        String other$minDateLastSavedForUser = other.getMinDateLastSavedForUser();
        if (this$minDateLastSavedForUser == null ? other$minDateLastSavedForUser != null : !this$minDateLastSavedForUser.equals(other$minDateLastSavedForUser)) {
            return false;
        }
        String this$maxPremiereDate = this.getMaxPremiereDate();
        String other$maxPremiereDate = other.getMaxPremiereDate();
        if (this$maxPremiereDate == null ? other$maxPremiereDate != null : !this$maxPremiereDate.equals(other$maxPremiereDate)) {
            return false;
        }
        String this$excludeItemIds = this.getExcludeItemIds();
        String other$excludeItemIds = other.getExcludeItemIds();
        if (this$excludeItemIds == null ? other$excludeItemIds != null : !this$excludeItemIds.equals(other$excludeItemIds)) {
            return false;
        }
        String this$searchTerm = this.getSearchTerm();
        String other$searchTerm = other.getSearchTerm();
        if (this$searchTerm == null ? other$searchTerm != null : !this$searchTerm.equals(other$searchTerm)) {
            return false;
        }
        String this$sortOrder = this.getSortOrder();
        String other$sortOrder = other.getSortOrder();
        if (this$sortOrder == null ? other$sortOrder != null : !this$sortOrder.equals(other$sortOrder)) {
            return false;
        }
        String this$parentId = this.getParentId();
        String other$parentId = other.getParentId();
        if (this$parentId == null ? other$parentId != null : !this$parentId.equals(other$parentId)) {
            return false;
        }
        String this$fields = this.getFields();
        String other$fields = other.getFields();
        if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) {
            return false;
        }
        String this$excludeItemTypes = this.getExcludeItemTypes();
        String other$excludeItemTypes = other.getExcludeItemTypes();
        if (this$excludeItemTypes == null ? other$excludeItemTypes != null : !this$excludeItemTypes.equals(other$excludeItemTypes)) {
            return false;
        }
        String this$includeItemTypes = this.getIncludeItemTypes();
        String other$includeItemTypes = other.getIncludeItemTypes();
        if (this$includeItemTypes == null ? other$includeItemTypes != null : !this$includeItemTypes.equals(other$includeItemTypes)) {
            return false;
        }
        String this$anyProviderIdEquals = this.getAnyProviderIdEquals();
        String other$anyProviderIdEquals = other.getAnyProviderIdEquals();
        if (this$anyProviderIdEquals == null ? other$anyProviderIdEquals != null : !this$anyProviderIdEquals.equals(other$anyProviderIdEquals)) {
            return false;
        }
        String this$filters = this.getFilters();
        String other$filters = other.getFilters();
        if (this$filters == null ? other$filters != null : !this$filters.equals(other$filters)) {
            return false;
        }
        String this$mediaTypes = this.getMediaTypes();
        String other$mediaTypes = other.getMediaTypes();
        if (this$mediaTypes == null ? other$mediaTypes != null : !this$mediaTypes.equals(other$mediaTypes)) {
            return false;
        }
        String this$imageTypes = this.getImageTypes();
        String other$imageTypes = other.getImageTypes();
        if (this$imageTypes == null ? other$imageTypes != null : !this$imageTypes.equals(other$imageTypes)) {
            return false;
        }
        String this$sortBy = this.getSortBy();
        String other$sortBy = other.getSortBy();
        if (this$sortBy == null ? other$sortBy != null : !this$sortBy.equals(other$sortBy)) {
            return false;
        }
        String this$genres = this.getGenres();
        String other$genres = other.getGenres();
        if (this$genres == null ? other$genres != null : !this$genres.equals(other$genres)) {
            return false;
        }
        String this$officialRatings = this.getOfficialRatings();
        String other$officialRatings = other.getOfficialRatings();
        if (this$officialRatings == null ? other$officialRatings != null : !this$officialRatings.equals(other$officialRatings)) {
            return false;
        }
        String this$tags = this.getTags();
        String other$tags = other.getTags();
        if (this$tags == null ? other$tags != null : !this$tags.equals(other$tags)) {
            return false;
        }
        String this$excludeTags = this.getExcludeTags();
        String other$excludeTags = other.getExcludeTags();
        if (this$excludeTags == null ? other$excludeTags != null : !this$excludeTags.equals(other$excludeTags)) {
            return false;
        }
        String this$years = this.getYears();
        String other$years = other.getYears();
        if (this$years == null ? other$years != null : !this$years.equals(other$years)) {
            return false;
        }
        String this$enableImageTypes = this.getEnableImageTypes();
        String other$enableImageTypes = other.getEnableImageTypes();
        if (this$enableImageTypes == null ? other$enableImageTypes != null : !this$enableImageTypes.equals(other$enableImageTypes)) {
            return false;
        }
        String this$person = this.getPerson();
        String other$person = other.getPerson();
        if (this$person == null ? other$person != null : !this$person.equals(other$person)) {
            return false;
        }
        String this$personIds = this.getPersonIds();
        String other$personIds = other.getPersonIds();
        if (this$personIds == null ? other$personIds != null : !this$personIds.equals(other$personIds)) {
            return false;
        }
        String this$personTypes = this.getPersonTypes();
        String other$personTypes = other.getPersonTypes();
        if (this$personTypes == null ? other$personTypes != null : !this$personTypes.equals(other$personTypes)) {
            return false;
        }
        String this$studios = this.getStudios();
        String other$studios = other.getStudios();
        if (this$studios == null ? other$studios != null : !this$studios.equals(other$studios)) {
            return false;
        }
        String this$studioIds = this.getStudioIds();
        String other$studioIds = other.getStudioIds();
        if (this$studioIds == null ? other$studioIds != null : !this$studioIds.equals(other$studioIds)) {
            return false;
        }
        String this$artists = this.getArtists();
        String other$artists = other.getArtists();
        if (this$artists == null ? other$artists != null : !this$artists.equals(other$artists)) {
            return false;
        }
        String this$artistIds = this.getArtistIds();
        String other$artistIds = other.getArtistIds();
        if (this$artistIds == null ? other$artistIds != null : !this$artistIds.equals(other$artistIds)) {
            return false;
        }
        String this$albums = this.getAlbums();
        String other$albums = other.getAlbums();
        if (this$albums == null ? other$albums != null : !this$albums.equals(other$albums)) {
            return false;
        }
        String this$ids = this.getIds();
        String other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !this$ids.equals(other$ids)) {
            return false;
        }
        String this$videoTypes = this.getVideoTypes();
        String other$videoTypes = other.getVideoTypes();
        if (this$videoTypes == null ? other$videoTypes != null : !this$videoTypes.equals(other$videoTypes)) {
            return false;
        }
        String this$containers = this.getContainers();
        String other$containers = other.getContainers();
        if (this$containers == null ? other$containers != null : !this$containers.equals(other$containers)) {
            return false;
        }
        String this$audioCodecs = this.getAudioCodecs();
        String other$audioCodecs = other.getAudioCodecs();
        if (this$audioCodecs == null ? other$audioCodecs != null : !this$audioCodecs.equals(other$audioCodecs)) {
            return false;
        }
        String this$audioLayouts = this.getAudioLayouts();
        String other$audioLayouts = other.getAudioLayouts();
        if (this$audioLayouts == null ? other$audioLayouts != null : !this$audioLayouts.equals(other$audioLayouts)) {
            return false;
        }
        String this$videoCodecs = this.getVideoCodecs();
        String other$videoCodecs = other.getVideoCodecs();
        if (this$videoCodecs == null ? other$videoCodecs != null : !this$videoCodecs.equals(other$videoCodecs)) {
            return false;
        }
        String this$extendedVideoTypes = this.getExtendedVideoTypes();
        String other$extendedVideoTypes = other.getExtendedVideoTypes();
        if (this$extendedVideoTypes == null ? other$extendedVideoTypes != null : !this$extendedVideoTypes.equals(other$extendedVideoTypes)) {
            return false;
        }
        String this$subtitleCodecs = this.getSubtitleCodecs();
        String other$subtitleCodecs = other.getSubtitleCodecs();
        if (this$subtitleCodecs == null ? other$subtitleCodecs != null : !this$subtitleCodecs.equals(other$subtitleCodecs)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        String this$userId = this.getUserId();
        String other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) {
            return false;
        }
        String this$minOfficialRating = this.getMinOfficialRating();
        String other$minOfficialRating = other.getMinOfficialRating();
        if (this$minOfficialRating == null ? other$minOfficialRating != null : !this$minOfficialRating.equals(other$minOfficialRating)) {
            return false;
        }
        String this$seriesStatus = this.getSeriesStatus();
        String other$seriesStatus = other.getSeriesStatus();
        if (this$seriesStatus == null ? other$seriesStatus != null : !this$seriesStatus.equals(other$seriesStatus)) {
            return false;
        }
        String this$nameStartsWithOrGreater = this.getNameStartsWithOrGreater();
        String other$nameStartsWithOrGreater = other.getNameStartsWithOrGreater();
        if (this$nameStartsWithOrGreater == null ? other$nameStartsWithOrGreater != null : !this$nameStartsWithOrGreater.equals(other$nameStartsWithOrGreater)) {
            return false;
        }
        String this$artistStartsWithOrGreater = this.getArtistStartsWithOrGreater();
        String other$artistStartsWithOrGreater = other.getArtistStartsWithOrGreater();
        if (this$artistStartsWithOrGreater == null ? other$artistStartsWithOrGreater != null : !this$artistStartsWithOrGreater.equals(other$artistStartsWithOrGreater)) {
            return false;
        }
        String this$albumArtistStartsWithOrGreater = this.getAlbumArtistStartsWithOrGreater();
        String other$albumArtistStartsWithOrGreater = other.getAlbumArtistStartsWithOrGreater();
        if (this$albumArtistStartsWithOrGreater == null ? other$albumArtistStartsWithOrGreater != null : !this$albumArtistStartsWithOrGreater.equals(other$albumArtistStartsWithOrGreater)) {
            return false;
        }
        String this$nameStartsWith = this.getNameStartsWith();
        String other$nameStartsWith = other.getNameStartsWith();
        if (this$nameStartsWith == null ? other$nameStartsWith != null : !this$nameStartsWith.equals(other$nameStartsWith)) {
            return false;
        }
        String this$nameLessThan = this.getNameLessThan();
        String other$nameLessThan = other.getNameLessThan();
        return !(this$nameLessThan == null ? other$nameLessThan != null : !this$nameLessThan.equals(other$nameLessThan));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof GetShowsByIdSeasonsRequestDto;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $hasThemeSong = this.getHasThemeSong();
        result = result * 59 + ($hasThemeSong == null ? 43 : ((Object)$hasThemeSong).hashCode());
        Boolean $hasThemeVideo = this.getHasThemeVideo();
        result = result * 59 + ($hasThemeVideo == null ? 43 : ((Object)$hasThemeVideo).hashCode());
        Boolean $hasSubtitles = this.getHasSubtitles();
        result = result * 59 + ($hasSubtitles == null ? 43 : ((Object)$hasSubtitles).hashCode());
        Boolean $hasSpecialFeature = this.getHasSpecialFeature();
        result = result * 59 + ($hasSpecialFeature == null ? 43 : ((Object)$hasSpecialFeature).hashCode());
        Boolean $hasTrailer = this.getHasTrailer();
        result = result * 59 + ($hasTrailer == null ? 43 : ((Object)$hasTrailer).hashCode());
        Boolean $isSpecialSeason = this.getIsSpecialSeason();
        result = result * 59 + ($isSpecialSeason == null ? 43 : ((Object)$isSpecialSeason).hashCode());
        Integer $minIndexNumber = this.getMinIndexNumber();
        result = result * 59 + ($minIndexNumber == null ? 43 : ((Object)$minIndexNumber).hashCode());
        Integer $minPlayers = this.getMinPlayers();
        result = result * 59 + ($minPlayers == null ? 43 : ((Object)$minPlayers).hashCode());
        Integer $maxPlayers = this.getMaxPlayers();
        result = result * 59 + ($maxPlayers == null ? 43 : ((Object)$maxPlayers).hashCode());
        Integer $parentIndexNumber = this.getParentIndexNumber();
        result = result * 59 + ($parentIndexNumber == null ? 43 : ((Object)$parentIndexNumber).hashCode());
        Boolean $hasParentalRating = this.getHasParentalRating();
        result = result * 59 + ($hasParentalRating == null ? 43 : ((Object)$hasParentalRating).hashCode());
        Boolean $isHD = this.getIsHD();
        result = result * 59 + ($isHD == null ? 43 : ((Object)$isHD).hashCode());
        Boolean $isUnaired = this.getIsUnaired();
        result = result * 59 + ($isUnaired == null ? 43 : ((Object)$isUnaired).hashCode());
        Double $minCommunityRating = this.getMinCommunityRating();
        result = result * 59 + ($minCommunityRating == null ? 43 : ((Object)$minCommunityRating).hashCode());
        Double $minCriticRating = this.getMinCriticRating();
        result = result * 59 + ($minCriticRating == null ? 43 : ((Object)$minCriticRating).hashCode());
        Integer $airedDuringSeason = this.getAiredDuringSeason();
        result = result * 59 + ($airedDuringSeason == null ? 43 : ((Object)$airedDuringSeason).hashCode());
        Boolean $hasOverview = this.getHasOverview();
        result = result * 59 + ($hasOverview == null ? 43 : ((Object)$hasOverview).hashCode());
        Boolean $hasImdbId = this.getHasImdbId();
        result = result * 59 + ($hasImdbId == null ? 43 : ((Object)$hasImdbId).hashCode());
        Boolean $hasTmdbId = this.getHasTmdbId();
        result = result * 59 + ($hasTmdbId == null ? 43 : ((Object)$hasTmdbId).hashCode());
        Boolean $hasTvdbId = this.getHasTvdbId();
        result = result * 59 + ($hasTvdbId == null ? 43 : ((Object)$hasTvdbId).hashCode());
        Integer $startIndex = this.getStartIndex();
        result = result * 59 + ($startIndex == null ? 43 : ((Object)$startIndex).hashCode());
        Integer $limit = this.getLimit();
        result = result * 59 + ($limit == null ? 43 : ((Object)$limit).hashCode());
        Boolean $recursive = this.getRecursive();
        result = result * 59 + ($recursive == null ? 43 : ((Object)$recursive).hashCode());
        Boolean $isFavorite = this.getIsFavorite();
        result = result * 59 + ($isFavorite == null ? 43 : ((Object)$isFavorite).hashCode());
        Boolean $isMovie = this.getIsMovie();
        result = result * 59 + ($isMovie == null ? 43 : ((Object)$isMovie).hashCode());
        Boolean $isSeries = this.getIsSeries();
        result = result * 59 + ($isSeries == null ? 43 : ((Object)$isSeries).hashCode());
        Boolean $isFolder = this.getIsFolder();
        result = result * 59 + ($isFolder == null ? 43 : ((Object)$isFolder).hashCode());
        Boolean $isNews = this.getIsNews();
        result = result * 59 + ($isNews == null ? 43 : ((Object)$isNews).hashCode());
        Boolean $isKids = this.getIsKids();
        result = result * 59 + ($isKids == null ? 43 : ((Object)$isKids).hashCode());
        Boolean $isSports = this.getIsSports();
        result = result * 59 + ($isSports == null ? 43 : ((Object)$isSports).hashCode());
        Boolean $isNew = this.getIsNew();
        result = result * 59 + ($isNew == null ? 43 : ((Object)$isNew).hashCode());
        Boolean $isPremiere = this.getIsPremiere();
        result = result * 59 + ($isPremiere == null ? 43 : ((Object)$isPremiere).hashCode());
        Boolean $isNewOrPremiere = this.getIsNewOrPremiere();
        result = result * 59 + ($isNewOrPremiere == null ? 43 : ((Object)$isNewOrPremiere).hashCode());
        Boolean $isRepeat = this.getIsRepeat();
        result = result * 59 + ($isRepeat == null ? 43 : ((Object)$isRepeat).hashCode());
        Boolean $projectToMedia = this.getProjectToMedia();
        result = result * 59 + ($projectToMedia == null ? 43 : ((Object)$projectToMedia).hashCode());
        Boolean $isPlayed = this.getIsPlayed();
        result = result * 59 + ($isPlayed == null ? 43 : ((Object)$isPlayed).hashCode());
        Boolean $enableImages = this.getEnableImages();
        result = result * 59 + ($enableImages == null ? 43 : ((Object)$enableImages).hashCode());
        Boolean $enableUserData = this.getEnableUserData();
        result = result * 59 + ($enableUserData == null ? 43 : ((Object)$enableUserData).hashCode());
        Integer $imageTypeLimit = this.getImageTypeLimit();
        result = result * 59 + ($imageTypeLimit == null ? 43 : ((Object)$imageTypeLimit).hashCode());
        Boolean $isLocked = this.getIsLocked();
        result = result * 59 + ($isLocked == null ? 43 : ((Object)$isLocked).hashCode());
        Boolean $isPlaceHolder = this.getIsPlaceHolder();
        result = result * 59 + ($isPlaceHolder == null ? 43 : ((Object)$isPlaceHolder).hashCode());
        Boolean $hasOfficialRating = this.getHasOfficialRating();
        result = result * 59 + ($hasOfficialRating == null ? 43 : ((Object)$hasOfficialRating).hashCode());
        Boolean $groupItemsIntoCollections = this.getGroupItemsIntoCollections();
        result = result * 59 + ($groupItemsIntoCollections == null ? 43 : ((Object)$groupItemsIntoCollections).hashCode());
        Boolean $is3D = this.getIs3D();
        result = result * 59 + ($is3D == null ? 43 : ((Object)$is3D).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $artistType = this.getArtistType();
        result = result * 59 + ($artistType == null ? 43 : $artistType.hashCode());
        String $maxOfficialRating = this.getMaxOfficialRating();
        result = result * 59 + ($maxOfficialRating == null ? 43 : $maxOfficialRating.hashCode());
        String $adjacentTo = this.getAdjacentTo();
        result = result * 59 + ($adjacentTo == null ? 43 : $adjacentTo.hashCode());
        String $startItemId = this.getStartItemId();
        result = result * 59 + ($startItemId == null ? 43 : $startItemId.hashCode());
        String $minStartDate = this.getMinStartDate();
        result = result * 59 + ($minStartDate == null ? 43 : $minStartDate.hashCode());
        String $maxStartDate = this.getMaxStartDate();
        result = result * 59 + ($maxStartDate == null ? 43 : $maxStartDate.hashCode());
        String $minEndDate = this.getMinEndDate();
        result = result * 59 + ($minEndDate == null ? 43 : $minEndDate.hashCode());
        String $maxEndDate = this.getMaxEndDate();
        result = result * 59 + ($maxEndDate == null ? 43 : $maxEndDate.hashCode());
        String $minPremiereDate = this.getMinPremiereDate();
        result = result * 59 + ($minPremiereDate == null ? 43 : $minPremiereDate.hashCode());
        String $minDateLastSaved = this.getMinDateLastSaved();
        result = result * 59 + ($minDateLastSaved == null ? 43 : $minDateLastSaved.hashCode());
        String $minDateLastSavedForUser = this.getMinDateLastSavedForUser();
        result = result * 59 + ($minDateLastSavedForUser == null ? 43 : $minDateLastSavedForUser.hashCode());
        String $maxPremiereDate = this.getMaxPremiereDate();
        result = result * 59 + ($maxPremiereDate == null ? 43 : $maxPremiereDate.hashCode());
        String $excludeItemIds = this.getExcludeItemIds();
        result = result * 59 + ($excludeItemIds == null ? 43 : $excludeItemIds.hashCode());
        String $searchTerm = this.getSearchTerm();
        result = result * 59 + ($searchTerm == null ? 43 : $searchTerm.hashCode());
        String $sortOrder = this.getSortOrder();
        result = result * 59 + ($sortOrder == null ? 43 : $sortOrder.hashCode());
        String $parentId = this.getParentId();
        result = result * 59 + ($parentId == null ? 43 : $parentId.hashCode());
        String $fields = this.getFields();
        result = result * 59 + ($fields == null ? 43 : $fields.hashCode());
        String $excludeItemTypes = this.getExcludeItemTypes();
        result = result * 59 + ($excludeItemTypes == null ? 43 : $excludeItemTypes.hashCode());
        String $includeItemTypes = this.getIncludeItemTypes();
        result = result * 59 + ($includeItemTypes == null ? 43 : $includeItemTypes.hashCode());
        String $anyProviderIdEquals = this.getAnyProviderIdEquals();
        result = result * 59 + ($anyProviderIdEquals == null ? 43 : $anyProviderIdEquals.hashCode());
        String $filters = this.getFilters();
        result = result * 59 + ($filters == null ? 43 : $filters.hashCode());
        String $mediaTypes = this.getMediaTypes();
        result = result * 59 + ($mediaTypes == null ? 43 : $mediaTypes.hashCode());
        String $imageTypes = this.getImageTypes();
        result = result * 59 + ($imageTypes == null ? 43 : $imageTypes.hashCode());
        String $sortBy = this.getSortBy();
        result = result * 59 + ($sortBy == null ? 43 : $sortBy.hashCode());
        String $genres = this.getGenres();
        result = result * 59 + ($genres == null ? 43 : $genres.hashCode());
        String $officialRatings = this.getOfficialRatings();
        result = result * 59 + ($officialRatings == null ? 43 : $officialRatings.hashCode());
        String $tags = this.getTags();
        result = result * 59 + ($tags == null ? 43 : $tags.hashCode());
        String $excludeTags = this.getExcludeTags();
        result = result * 59 + ($excludeTags == null ? 43 : $excludeTags.hashCode());
        String $years = this.getYears();
        result = result * 59 + ($years == null ? 43 : $years.hashCode());
        String $enableImageTypes = this.getEnableImageTypes();
        result = result * 59 + ($enableImageTypes == null ? 43 : $enableImageTypes.hashCode());
        String $person = this.getPerson();
        result = result * 59 + ($person == null ? 43 : $person.hashCode());
        String $personIds = this.getPersonIds();
        result = result * 59 + ($personIds == null ? 43 : $personIds.hashCode());
        String $personTypes = this.getPersonTypes();
        result = result * 59 + ($personTypes == null ? 43 : $personTypes.hashCode());
        String $studios = this.getStudios();
        result = result * 59 + ($studios == null ? 43 : $studios.hashCode());
        String $studioIds = this.getStudioIds();
        result = result * 59 + ($studioIds == null ? 43 : $studioIds.hashCode());
        String $artists = this.getArtists();
        result = result * 59 + ($artists == null ? 43 : $artists.hashCode());
        String $artistIds = this.getArtistIds();
        result = result * 59 + ($artistIds == null ? 43 : $artistIds.hashCode());
        String $albums = this.getAlbums();
        result = result * 59 + ($albums == null ? 43 : $albums.hashCode());
        String $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : $ids.hashCode());
        String $videoTypes = this.getVideoTypes();
        result = result * 59 + ($videoTypes == null ? 43 : $videoTypes.hashCode());
        String $containers = this.getContainers();
        result = result * 59 + ($containers == null ? 43 : $containers.hashCode());
        String $audioCodecs = this.getAudioCodecs();
        result = result * 59 + ($audioCodecs == null ? 43 : $audioCodecs.hashCode());
        String $audioLayouts = this.getAudioLayouts();
        result = result * 59 + ($audioLayouts == null ? 43 : $audioLayouts.hashCode());
        String $videoCodecs = this.getVideoCodecs();
        result = result * 59 + ($videoCodecs == null ? 43 : $videoCodecs.hashCode());
        String $extendedVideoTypes = this.getExtendedVideoTypes();
        result = result * 59 + ($extendedVideoTypes == null ? 43 : $extendedVideoTypes.hashCode());
        String $subtitleCodecs = this.getSubtitleCodecs();
        result = result * 59 + ($subtitleCodecs == null ? 43 : $subtitleCodecs.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        String $minOfficialRating = this.getMinOfficialRating();
        result = result * 59 + ($minOfficialRating == null ? 43 : $minOfficialRating.hashCode());
        String $seriesStatus = this.getSeriesStatus();
        result = result * 59 + ($seriesStatus == null ? 43 : $seriesStatus.hashCode());
        String $nameStartsWithOrGreater = this.getNameStartsWithOrGreater();
        result = result * 59 + ($nameStartsWithOrGreater == null ? 43 : $nameStartsWithOrGreater.hashCode());
        String $artistStartsWithOrGreater = this.getArtistStartsWithOrGreater();
        result = result * 59 + ($artistStartsWithOrGreater == null ? 43 : $artistStartsWithOrGreater.hashCode());
        String $albumArtistStartsWithOrGreater = this.getAlbumArtistStartsWithOrGreater();
        result = result * 59 + ($albumArtistStartsWithOrGreater == null ? 43 : $albumArtistStartsWithOrGreater.hashCode());
        String $nameStartsWith = this.getNameStartsWith();
        result = result * 59 + ($nameStartsWith == null ? 43 : $nameStartsWith.hashCode());
        String $nameLessThan = this.getNameLessThan();
        result = result * 59 + ($nameLessThan == null ? 43 : $nameLessThan.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "GetShowsByIdSeasonsRequestDto(id=" + this.getId() + ", artistType=" + this.getArtistType() + ", maxOfficialRating=" + this.getMaxOfficialRating() + ", hasThemeSong=" + this.getHasThemeSong() + ", hasThemeVideo=" + this.getHasThemeVideo() + ", hasSubtitles=" + this.getHasSubtitles() + ", hasSpecialFeature=" + this.getHasSpecialFeature() + ", hasTrailer=" + this.getHasTrailer() + ", isSpecialSeason=" + this.getIsSpecialSeason() + ", adjacentTo=" + this.getAdjacentTo() + ", startItemId=" + this.getStartItemId() + ", minIndexNumber=" + this.getMinIndexNumber() + ", minStartDate=" + this.getMinStartDate() + ", maxStartDate=" + this.getMaxStartDate() + ", minEndDate=" + this.getMinEndDate() + ", maxEndDate=" + this.getMaxEndDate() + ", minPlayers=" + this.getMinPlayers() + ", maxPlayers=" + this.getMaxPlayers() + ", parentIndexNumber=" + this.getParentIndexNumber() + ", hasParentalRating=" + this.getHasParentalRating() + ", isHD=" + this.getIsHD() + ", isUnaired=" + this.getIsUnaired() + ", minCommunityRating=" + this.getMinCommunityRating() + ", minCriticRating=" + this.getMinCriticRating() + ", airedDuringSeason=" + this.getAiredDuringSeason() + ", minPremiereDate=" + this.getMinPremiereDate() + ", minDateLastSaved=" + this.getMinDateLastSaved() + ", minDateLastSavedForUser=" + this.getMinDateLastSavedForUser() + ", maxPremiereDate=" + this.getMaxPremiereDate() + ", hasOverview=" + this.getHasOverview() + ", hasImdbId=" + this.getHasImdbId() + ", hasTmdbId=" + this.getHasTmdbId() + ", hasTvdbId=" + this.getHasTvdbId() + ", excludeItemIds=" + this.getExcludeItemIds() + ", startIndex=" + this.getStartIndex() + ", limit=" + this.getLimit() + ", recursive=" + this.getRecursive() + ", searchTerm=" + this.getSearchTerm() + ", sortOrder=" + this.getSortOrder() + ", parentId=" + this.getParentId() + ", fields=" + this.getFields() + ", excludeItemTypes=" + this.getExcludeItemTypes() + ", includeItemTypes=" + this.getIncludeItemTypes() + ", anyProviderIdEquals=" + this.getAnyProviderIdEquals() + ", filters=" + this.getFilters() + ", isFavorite=" + this.getIsFavorite() + ", isMovie=" + this.getIsMovie() + ", isSeries=" + this.getIsSeries() + ", isFolder=" + this.getIsFolder() + ", isNews=" + this.getIsNews() + ", isKids=" + this.getIsKids() + ", isSports=" + this.getIsSports() + ", isNew=" + this.getIsNew() + ", isPremiere=" + this.getIsPremiere() + ", isNewOrPremiere=" + this.getIsNewOrPremiere() + ", isRepeat=" + this.getIsRepeat() + ", projectToMedia=" + this.getProjectToMedia() + ", mediaTypes=" + this.getMediaTypes() + ", imageTypes=" + this.getImageTypes() + ", sortBy=" + this.getSortBy() + ", isPlayed=" + this.getIsPlayed() + ", genres=" + this.getGenres() + ", officialRatings=" + this.getOfficialRatings() + ", tags=" + this.getTags() + ", excludeTags=" + this.getExcludeTags() + ", years=" + this.getYears() + ", enableImages=" + this.getEnableImages() + ", enableUserData=" + this.getEnableUserData() + ", imageTypeLimit=" + this.getImageTypeLimit() + ", enableImageTypes=" + this.getEnableImageTypes() + ", person=" + this.getPerson() + ", personIds=" + this.getPersonIds() + ", personTypes=" + this.getPersonTypes() + ", studios=" + this.getStudios() + ", studioIds=" + this.getStudioIds() + ", artists=" + this.getArtists() + ", artistIds=" + this.getArtistIds() + ", albums=" + this.getAlbums() + ", ids=" + this.getIds() + ", videoTypes=" + this.getVideoTypes() + ", containers=" + this.getContainers() + ", audioCodecs=" + this.getAudioCodecs() + ", audioLayouts=" + this.getAudioLayouts() + ", videoCodecs=" + this.getVideoCodecs() + ", extendedVideoTypes=" + this.getExtendedVideoTypes() + ", subtitleCodecs=" + this.getSubtitleCodecs() + ", path=" + this.getPath() + ", userId=" + this.getUserId() + ", minOfficialRating=" + this.getMinOfficialRating() + ", isLocked=" + this.getIsLocked() + ", isPlaceHolder=" + this.getIsPlaceHolder() + ", hasOfficialRating=" + this.getHasOfficialRating() + ", groupItemsIntoCollections=" + this.getGroupItemsIntoCollections() + ", is3D=" + this.getIs3D() + ", seriesStatus=" + this.getSeriesStatus() + ", nameStartsWithOrGreater=" + this.getNameStartsWithOrGreater() + ", artistStartsWithOrGreater=" + this.getArtistStartsWithOrGreater() + ", albumArtistStartsWithOrGreater=" + this.getAlbumArtistStartsWithOrGreater() + ", nameStartsWith=" + this.getNameStartsWith() + ", nameLessThan=" + (this.getNameLessThan() + ")");
    }
}
