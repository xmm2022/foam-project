/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  embyclient.model.BaseItemDto
 *  embyclient.model.BaseItemPerson
 *  embyclient.model.ChapterInfo
 *  embyclient.model.DayOfWeek
 *  embyclient.model.DrawingImageOrientation
 *  embyclient.model.ExternalUrl
 *  embyclient.model.LiveTvTimerType
 *  embyclient.model.LocationType
 *  embyclient.model.MediaSourceInfo
 *  embyclient.model.MediaStream
 *  embyclient.model.MediaUrl
 *  embyclient.model.MetadataFields
 *  embyclient.model.NameIdPair
 *  embyclient.model.NameLongIdPair
 *  embyclient.model.ProviderIdDictionary
 *  embyclient.model.SyncJobItemStatus
 *  embyclient.model.UserItemDataDto
 *  embyclient.model.Video3DFormat
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import embyclient.model.BaseItemDto;
import embyclient.model.BaseItemPerson;
import embyclient.model.ChapterInfo;
import embyclient.model.DayOfWeek;
import embyclient.model.DrawingImageOrientation;
import embyclient.model.ExternalUrl;
import embyclient.model.LiveTvTimerType;
import embyclient.model.LocationType;
import embyclient.model.MediaSourceInfo;
import embyclient.model.MediaStream;
import embyclient.model.MediaUrl;
import embyclient.model.MetadataFields;
import embyclient.model.NameIdPair;
import embyclient.model.NameLongIdPair;
import embyclient.model.ProviderIdDictionary;
import embyclient.model.SyncJobItemStatus;
import embyclient.model.UserItemDataDto;
import embyclient.model.Video3DFormat;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import lombok.Generated;

public class QueryResultBaseItemResponse {
    private List<ItemsDTO> items;
    private Integer totalRecordCount;

    @Generated
    public QueryResultBaseItemResponse() {
    }

    @Generated
    public List<ItemsDTO> getItems() {
        return this.items;
    }

    @Generated
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    @Generated
    public void setItems(List<ItemsDTO> items) {
        this.items = items;
    }

    @Generated
    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof QueryResultBaseItemResponse)) {
            return false;
        }
        QueryResultBaseItemResponse other = (QueryResultBaseItemResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$totalRecordCount = this.getTotalRecordCount();
        Integer other$totalRecordCount = other.getTotalRecordCount();
        if (this$totalRecordCount == null ? other$totalRecordCount != null : !((Object)this$totalRecordCount).equals(other$totalRecordCount)) {
            return false;
        }
        List<ItemsDTO> this$items = this.getItems();
        List<ItemsDTO> other$items = other.getItems();
        return !(this$items == null ? other$items != null : !((Object)this$items).equals(other$items));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof QueryResultBaseItemResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $totalRecordCount = this.getTotalRecordCount();
        result = result * 59 + ($totalRecordCount == null ? 43 : ((Object)$totalRecordCount).hashCode());
        List<ItemsDTO> $items = this.getItems();
        result = result * 59 + ($items == null ? 43 : ((Object)$items).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "QueryResultBaseItemResponse(items=" + String.valueOf(this.getItems()) + ", totalRecordCount=" + this.getTotalRecordCount() + ")";
    }

    public static class ItemsDTO {
        private String name = null;
        private String originalTitle = null;
        private String serverId = null;
        private String id = null;
        private String guid = null;
        private String etag = null;
        private String prefix = null;
        private String tunerName = null;
        private String playlistItemId = null;
        private OffsetDateTime dateCreated = null;
        private String extraType = null;
        private Integer sortIndexNumber = null;
        private Integer sortParentIndexNumber = null;
        private Boolean canDelete = null;
        private Boolean canDownload = null;
        private Boolean canEditItems = null;
        private Boolean supportsResume = null;
        private String presentationUniqueKey = null;
        private String preferredMetadataLanguage = null;
        private String preferredMetadataCountryCode = null;
        private Boolean supportsSync = null;
        private SyncJobItemStatus syncStatus = null;
        private Boolean canManageAccess = null;
        private Boolean canLeaveContent = null;
        private Boolean canMakePublic = null;
        private String container = null;
        private String sortName = null;
        private String forcedSortName = null;
        private Video3DFormat video3DFormat = null;
        private OffsetDateTime premiereDate = null;
        private List<ExternalUrl> externalUrls = null;
        private List<MediaSourceInfo> mediaSources = null;
        private Float criticRating = null;
        private Long gameSystemId = null;
        private Boolean asSeries = null;
        private String gameSystem = null;
        private List<String> productionLocations = null;
        private String path = null;
        private String officialRating = null;
        private String customRating = null;
        private String channelId = null;
        private String channelName = null;
        private String overview = null;
        private List<String> taglines = null;
        private List<String> genres = null;
        private Float communityRating = null;
        private Long runTimeTicks = null;
        private Long size = null;
        private String fileName = null;
        private Integer bitrate = null;
        private Integer productionYear = null;
        private String number = null;
        private String channelNumber = null;
        private Integer indexNumber = null;
        private Integer indexNumberEnd = null;
        private Integer parentIndexNumber = null;
        private List<MediaUrl> remoteTrailers = null;
        private ProviderIdDictionary providerIds = null;
        private Boolean isFolder = null;
        private String parentId = null;
        private String type = null;
        private List<BaseItemPerson> people = null;
        private List<NameLongIdPair> studios = null;
        private List<NameLongIdPair> genreItems = null;
        private List<NameLongIdPair> tagItems = null;
        private String parentLogoItemId = null;
        private String parentBackdropItemId = null;
        private List<String> parentBackdropImageTags = null;
        private Integer localTrailerCount = null;
        private UserItemDataDto userData = null;
        private Integer recursiveItemCount = null;
        private Integer childCount = null;
        private Integer seasonCount = null;
        private String seriesName = null;
        private String seriesId = null;
        private String seasonId = null;
        private Integer specialFeatureCount = null;
        private String displayPreferencesId = null;
        private String status = null;
        private List<DayOfWeek> airDays = null;
        private List<String> tags = null;
        private Double primaryImageAspectRatio = null;
        private List<String> artists = null;
        private List<NameIdPair> artistItems = null;
        private List<NameIdPair> composers = null;
        private String album = null;
        private String collectionType = null;
        private String displayOrder = null;
        private String albumId = null;
        private String albumPrimaryImageTag = null;
        private String seriesPrimaryImageTag = null;
        private String albumArtist = null;
        private List<NameIdPair> albumArtists = null;
        private String seasonName = null;
        private List<MediaStream> mediaStreams = null;
        private Integer partCount = null;
        private Map<String, String> imageTags = null;
        private List<String> backdropImageTags = null;
        private String parentLogoImageTag = null;
        private String seriesStudio = null;
        private String primaryImageItemId = null;
        private String primaryImageTag = null;
        private String parentThumbItemId = null;
        private String parentThumbImageTag = null;
        private List<ChapterInfo> chapters = null;
        private LocationType locationType = null;
        private String mediaType = null;
        private OffsetDateTime endDate = null;
        private List<MetadataFields> lockedFields = null;
        private Boolean lockData = null;
        private Integer width = null;
        private Integer height = null;
        private String cameraMake = null;
        private String cameraModel = null;
        private String software = null;
        private Double exposureTime = null;
        private Double focalLength = null;
        private DrawingImageOrientation imageOrientation = null;
        private Double aperture = null;
        private Double shutterSpeed = null;
        private Double latitude = null;
        private Double longitude = null;
        private Double altitude = null;
        private Integer isoSpeedRating = null;
        private String seriesTimerId = null;
        private String channelPrimaryImageTag = null;
        private OffsetDateTime startDate = null;
        private Double completionPercentage = null;
        private Boolean isRepeat = null;
        private Boolean isNew = null;
        private String episodeTitle = null;
        private Boolean isMovie = null;
        private Boolean isSports = null;
        private Boolean isSeries = null;
        private Boolean isLive = null;
        private Boolean isNews = null;
        private Boolean isKids = null;
        private Boolean isPremiere = null;
        private LiveTvTimerType timerType = null;
        private Boolean disabled = null;
        private String managementId = null;
        private String timerId = null;
        private BaseItemDto currentProgram = null;
        private Integer movieCount = null;
        private Integer seriesCount = null;
        private Integer albumCount = null;
        private Integer songCount = null;
        private Integer musicVideoCount = null;
        private List<String> subviews = null;
        private String listingsProviderId = null;
        private String listingsChannelId = null;
        private String listingsPath = null;
        private String listingsId = null;
        private String listingsChannelName = null;
        private String listingsChannelNumber = null;
        private String affiliateCallSign = null;
        private String imageUrl;
        private String filmTitle;
        private String primaryImageAspectRatioCount;
        private String embyItemUrl;
        private String backdropImageUrl;

        @Generated
        public ItemsDTO() {
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getOriginalTitle() {
            return this.originalTitle;
        }

        @Generated
        public String getServerId() {
            return this.serverId;
        }

        @Generated
        public String getId() {
            return this.id;
        }

        @Generated
        public String getGuid() {
            return this.guid;
        }

        @Generated
        public String getEtag() {
            return this.etag;
        }

        @Generated
        public String getPrefix() {
            return this.prefix;
        }

        @Generated
        public String getTunerName() {
            return this.tunerName;
        }

        @Generated
        public String getPlaylistItemId() {
            return this.playlistItemId;
        }

        @Generated
        public OffsetDateTime getDateCreated() {
            return this.dateCreated;
        }

        @Generated
        public String getExtraType() {
            return this.extraType;
        }

        @Generated
        public Integer getSortIndexNumber() {
            return this.sortIndexNumber;
        }

        @Generated
        public Integer getSortParentIndexNumber() {
            return this.sortParentIndexNumber;
        }

        @Generated
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        @Generated
        public Boolean getCanDownload() {
            return this.canDownload;
        }

        @Generated
        public Boolean getCanEditItems() {
            return this.canEditItems;
        }

        @Generated
        public Boolean getSupportsResume() {
            return this.supportsResume;
        }

        @Generated
        public String getPresentationUniqueKey() {
            return this.presentationUniqueKey;
        }

        @Generated
        public String getPreferredMetadataLanguage() {
            return this.preferredMetadataLanguage;
        }

        @Generated
        public String getPreferredMetadataCountryCode() {
            return this.preferredMetadataCountryCode;
        }

        @Generated
        public Boolean getSupportsSync() {
            return this.supportsSync;
        }

        @Generated
        public SyncJobItemStatus getSyncStatus() {
            return this.syncStatus;
        }

        @Generated
        public Boolean getCanManageAccess() {
            return this.canManageAccess;
        }

        @Generated
        public Boolean getCanLeaveContent() {
            return this.canLeaveContent;
        }

        @Generated
        public Boolean getCanMakePublic() {
            return this.canMakePublic;
        }

        @Generated
        public String getContainer() {
            return this.container;
        }

        @Generated
        public String getSortName() {
            return this.sortName;
        }

        @Generated
        public String getForcedSortName() {
            return this.forcedSortName;
        }

        @Generated
        public Video3DFormat getVideo3DFormat() {
            return this.video3DFormat;
        }

        @Generated
        public OffsetDateTime getPremiereDate() {
            return this.premiereDate;
        }

        @Generated
        public List<ExternalUrl> getExternalUrls() {
            return this.externalUrls;
        }

        @Generated
        public List<MediaSourceInfo> getMediaSources() {
            return this.mediaSources;
        }

        @Generated
        public Float getCriticRating() {
            return this.criticRating;
        }

        @Generated
        public Long getGameSystemId() {
            return this.gameSystemId;
        }

        @Generated
        public Boolean getAsSeries() {
            return this.asSeries;
        }

        @Generated
        public String getGameSystem() {
            return this.gameSystem;
        }

        @Generated
        public List<String> getProductionLocations() {
            return this.productionLocations;
        }

        @Generated
        public String getPath() {
            return this.path;
        }

        @Generated
        public String getOfficialRating() {
            return this.officialRating;
        }

        @Generated
        public String getCustomRating() {
            return this.customRating;
        }

        @Generated
        public String getChannelId() {
            return this.channelId;
        }

        @Generated
        public String getChannelName() {
            return this.channelName;
        }

        @Generated
        public String getOverview() {
            return this.overview;
        }

        @Generated
        public List<String> getTaglines() {
            return this.taglines;
        }

        @Generated
        public List<String> getGenres() {
            return this.genres;
        }

        @Generated
        public Float getCommunityRating() {
            return this.communityRating;
        }

        @Generated
        public Long getRunTimeTicks() {
            return this.runTimeTicks;
        }

        @Generated
        public Long getSize() {
            return this.size;
        }

        @Generated
        public String getFileName() {
            return this.fileName;
        }

        @Generated
        public Integer getBitrate() {
            return this.bitrate;
        }

        @Generated
        public Integer getProductionYear() {
            return this.productionYear;
        }

        @Generated
        public String getNumber() {
            return this.number;
        }

        @Generated
        public String getChannelNumber() {
            return this.channelNumber;
        }

        @Generated
        public Integer getIndexNumber() {
            return this.indexNumber;
        }

        @Generated
        public Integer getIndexNumberEnd() {
            return this.indexNumberEnd;
        }

        @Generated
        public Integer getParentIndexNumber() {
            return this.parentIndexNumber;
        }

        @Generated
        public List<MediaUrl> getRemoteTrailers() {
            return this.remoteTrailers;
        }

        @Generated
        public ProviderIdDictionary getProviderIds() {
            return this.providerIds;
        }

        @Generated
        public Boolean getIsFolder() {
            return this.isFolder;
        }

        @Generated
        public String getParentId() {
            return this.parentId;
        }

        @Generated
        public String getType() {
            return this.type;
        }

        @Generated
        public List<BaseItemPerson> getPeople() {
            return this.people;
        }

        @Generated
        public List<NameLongIdPair> getStudios() {
            return this.studios;
        }

        @Generated
        public List<NameLongIdPair> getGenreItems() {
            return this.genreItems;
        }

        @Generated
        public List<NameLongIdPair> getTagItems() {
            return this.tagItems;
        }

        @Generated
        public String getParentLogoItemId() {
            return this.parentLogoItemId;
        }

        @Generated
        public String getParentBackdropItemId() {
            return this.parentBackdropItemId;
        }

        @Generated
        public List<String> getParentBackdropImageTags() {
            return this.parentBackdropImageTags;
        }

        @Generated
        public Integer getLocalTrailerCount() {
            return this.localTrailerCount;
        }

        @Generated
        public UserItemDataDto getUserData() {
            return this.userData;
        }

        @Generated
        public Integer getRecursiveItemCount() {
            return this.recursiveItemCount;
        }

        @Generated
        public Integer getChildCount() {
            return this.childCount;
        }

        @Generated
        public Integer getSeasonCount() {
            return this.seasonCount;
        }

        @Generated
        public String getSeriesName() {
            return this.seriesName;
        }

        @Generated
        public String getSeriesId() {
            return this.seriesId;
        }

        @Generated
        public String getSeasonId() {
            return this.seasonId;
        }

        @Generated
        public Integer getSpecialFeatureCount() {
            return this.specialFeatureCount;
        }

        @Generated
        public String getDisplayPreferencesId() {
            return this.displayPreferencesId;
        }

        @Generated
        public String getStatus() {
            return this.status;
        }

        @Generated
        public List<DayOfWeek> getAirDays() {
            return this.airDays;
        }

        @Generated
        public List<String> getTags() {
            return this.tags;
        }

        @Generated
        public Double getPrimaryImageAspectRatio() {
            return this.primaryImageAspectRatio;
        }

        @Generated
        public List<String> getArtists() {
            return this.artists;
        }

        @Generated
        public List<NameIdPair> getArtistItems() {
            return this.artistItems;
        }

        @Generated
        public List<NameIdPair> getComposers() {
            return this.composers;
        }

        @Generated
        public String getAlbum() {
            return this.album;
        }

        @Generated
        public String getCollectionType() {
            return this.collectionType;
        }

        @Generated
        public String getDisplayOrder() {
            return this.displayOrder;
        }

        @Generated
        public String getAlbumId() {
            return this.albumId;
        }

        @Generated
        public String getAlbumPrimaryImageTag() {
            return this.albumPrimaryImageTag;
        }

        @Generated
        public String getSeriesPrimaryImageTag() {
            return this.seriesPrimaryImageTag;
        }

        @Generated
        public String getAlbumArtist() {
            return this.albumArtist;
        }

        @Generated
        public List<NameIdPair> getAlbumArtists() {
            return this.albumArtists;
        }

        @Generated
        public String getSeasonName() {
            return this.seasonName;
        }

        @Generated
        public List<MediaStream> getMediaStreams() {
            return this.mediaStreams;
        }

        @Generated
        public Integer getPartCount() {
            return this.partCount;
        }

        @Generated
        public Map<String, String> getImageTags() {
            return this.imageTags;
        }

        @Generated
        public List<String> getBackdropImageTags() {
            return this.backdropImageTags;
        }

        @Generated
        public String getParentLogoImageTag() {
            return this.parentLogoImageTag;
        }

        @Generated
        public String getSeriesStudio() {
            return this.seriesStudio;
        }

        @Generated
        public String getPrimaryImageItemId() {
            return this.primaryImageItemId;
        }

        @Generated
        public String getPrimaryImageTag() {
            return this.primaryImageTag;
        }

        @Generated
        public String getParentThumbItemId() {
            return this.parentThumbItemId;
        }

        @Generated
        public String getParentThumbImageTag() {
            return this.parentThumbImageTag;
        }

        @Generated
        public List<ChapterInfo> getChapters() {
            return this.chapters;
        }

        @Generated
        public LocationType getLocationType() {
            return this.locationType;
        }

        @Generated
        public String getMediaType() {
            return this.mediaType;
        }

        @Generated
        public OffsetDateTime getEndDate() {
            return this.endDate;
        }

        @Generated
        public List<MetadataFields> getLockedFields() {
            return this.lockedFields;
        }

        @Generated
        public Boolean getLockData() {
            return this.lockData;
        }

        @Generated
        public Integer getWidth() {
            return this.width;
        }

        @Generated
        public Integer getHeight() {
            return this.height;
        }

        @Generated
        public String getCameraMake() {
            return this.cameraMake;
        }

        @Generated
        public String getCameraModel() {
            return this.cameraModel;
        }

        @Generated
        public String getSoftware() {
            return this.software;
        }

        @Generated
        public Double getExposureTime() {
            return this.exposureTime;
        }

        @Generated
        public Double getFocalLength() {
            return this.focalLength;
        }

        @Generated
        public DrawingImageOrientation getImageOrientation() {
            return this.imageOrientation;
        }

        @Generated
        public Double getAperture() {
            return this.aperture;
        }

        @Generated
        public Double getShutterSpeed() {
            return this.shutterSpeed;
        }

        @Generated
        public Double getLatitude() {
            return this.latitude;
        }

        @Generated
        public Double getLongitude() {
            return this.longitude;
        }

        @Generated
        public Double getAltitude() {
            return this.altitude;
        }

        @Generated
        public Integer getIsoSpeedRating() {
            return this.isoSpeedRating;
        }

        @Generated
        public String getSeriesTimerId() {
            return this.seriesTimerId;
        }

        @Generated
        public String getChannelPrimaryImageTag() {
            return this.channelPrimaryImageTag;
        }

        @Generated
        public OffsetDateTime getStartDate() {
            return this.startDate;
        }

        @Generated
        public Double getCompletionPercentage() {
            return this.completionPercentage;
        }

        @Generated
        public Boolean getIsRepeat() {
            return this.isRepeat;
        }

        @Generated
        public Boolean getIsNew() {
            return this.isNew;
        }

        @Generated
        public String getEpisodeTitle() {
            return this.episodeTitle;
        }

        @Generated
        public Boolean getIsMovie() {
            return this.isMovie;
        }

        @Generated
        public Boolean getIsSports() {
            return this.isSports;
        }

        @Generated
        public Boolean getIsSeries() {
            return this.isSeries;
        }

        @Generated
        public Boolean getIsLive() {
            return this.isLive;
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
        public Boolean getIsPremiere() {
            return this.isPremiere;
        }

        @Generated
        public LiveTvTimerType getTimerType() {
            return this.timerType;
        }

        @Generated
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Generated
        public String getManagementId() {
            return this.managementId;
        }

        @Generated
        public String getTimerId() {
            return this.timerId;
        }

        @Generated
        public BaseItemDto getCurrentProgram() {
            return this.currentProgram;
        }

        @Generated
        public Integer getMovieCount() {
            return this.movieCount;
        }

        @Generated
        public Integer getSeriesCount() {
            return this.seriesCount;
        }

        @Generated
        public Integer getAlbumCount() {
            return this.albumCount;
        }

        @Generated
        public Integer getSongCount() {
            return this.songCount;
        }

        @Generated
        public Integer getMusicVideoCount() {
            return this.musicVideoCount;
        }

        @Generated
        public List<String> getSubviews() {
            return this.subviews;
        }

        @Generated
        public String getListingsProviderId() {
            return this.listingsProviderId;
        }

        @Generated
        public String getListingsChannelId() {
            return this.listingsChannelId;
        }

        @Generated
        public String getListingsPath() {
            return this.listingsPath;
        }

        @Generated
        public String getListingsId() {
            return this.listingsId;
        }

        @Generated
        public String getListingsChannelName() {
            return this.listingsChannelName;
        }

        @Generated
        public String getListingsChannelNumber() {
            return this.listingsChannelNumber;
        }

        @Generated
        public String getAffiliateCallSign() {
            return this.affiliateCallSign;
        }

        @Generated
        public String getImageUrl() {
            return this.imageUrl;
        }

        @Generated
        public String getFilmTitle() {
            return this.filmTitle;
        }

        @Generated
        public String getPrimaryImageAspectRatioCount() {
            return this.primaryImageAspectRatioCount;
        }

        @Generated
        public String getEmbyItemUrl() {
            return this.embyItemUrl;
        }

        @Generated
        public String getBackdropImageUrl() {
            return this.backdropImageUrl;
        }

        @Generated
        public void setName(String name) {
            this.name = name;
        }

        @Generated
        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        @Generated
        public void setServerId(String serverId) {
            this.serverId = serverId;
        }

        @Generated
        public void setId(String id) {
            this.id = id;
        }

        @Generated
        public void setGuid(String guid) {
            this.guid = guid;
        }

        @Generated
        public void setEtag(String etag) {
            this.etag = etag;
        }

        @Generated
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        @Generated
        public void setTunerName(String tunerName) {
            this.tunerName = tunerName;
        }

        @Generated
        public void setPlaylistItemId(String playlistItemId) {
            this.playlistItemId = playlistItemId;
        }

        @Generated
        public void setDateCreated(OffsetDateTime dateCreated) {
            this.dateCreated = dateCreated;
        }

        @Generated
        public void setExtraType(String extraType) {
            this.extraType = extraType;
        }

        @Generated
        public void setSortIndexNumber(Integer sortIndexNumber) {
            this.sortIndexNumber = sortIndexNumber;
        }

        @Generated
        public void setSortParentIndexNumber(Integer sortParentIndexNumber) {
            this.sortParentIndexNumber = sortParentIndexNumber;
        }

        @Generated
        public void setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
        }

        @Generated
        public void setCanDownload(Boolean canDownload) {
            this.canDownload = canDownload;
        }

        @Generated
        public void setCanEditItems(Boolean canEditItems) {
            this.canEditItems = canEditItems;
        }

        @Generated
        public void setSupportsResume(Boolean supportsResume) {
            this.supportsResume = supportsResume;
        }

        @Generated
        public void setPresentationUniqueKey(String presentationUniqueKey) {
            this.presentationUniqueKey = presentationUniqueKey;
        }

        @Generated
        public void setPreferredMetadataLanguage(String preferredMetadataLanguage) {
            this.preferredMetadataLanguage = preferredMetadataLanguage;
        }

        @Generated
        public void setPreferredMetadataCountryCode(String preferredMetadataCountryCode) {
            this.preferredMetadataCountryCode = preferredMetadataCountryCode;
        }

        @Generated
        public void setSupportsSync(Boolean supportsSync) {
            this.supportsSync = supportsSync;
        }

        @Generated
        public void setSyncStatus(SyncJobItemStatus syncStatus) {
            this.syncStatus = syncStatus;
        }

        @Generated
        public void setCanManageAccess(Boolean canManageAccess) {
            this.canManageAccess = canManageAccess;
        }

        @Generated
        public void setCanLeaveContent(Boolean canLeaveContent) {
            this.canLeaveContent = canLeaveContent;
        }

        @Generated
        public void setCanMakePublic(Boolean canMakePublic) {
            this.canMakePublic = canMakePublic;
        }

        @Generated
        public void setContainer(String container) {
            this.container = container;
        }

        @Generated
        public void setSortName(String sortName) {
            this.sortName = sortName;
        }

        @Generated
        public void setForcedSortName(String forcedSortName) {
            this.forcedSortName = forcedSortName;
        }

        @Generated
        public void setVideo3DFormat(Video3DFormat video3DFormat) {
            this.video3DFormat = video3DFormat;
        }

        @Generated
        public void setPremiereDate(OffsetDateTime premiereDate) {
            this.premiereDate = premiereDate;
        }

        @Generated
        public void setExternalUrls(List<ExternalUrl> externalUrls) {
            this.externalUrls = externalUrls;
        }

        @Generated
        public void setMediaSources(List<MediaSourceInfo> mediaSources) {
            this.mediaSources = mediaSources;
        }

        @Generated
        public void setCriticRating(Float criticRating) {
            this.criticRating = criticRating;
        }

        @Generated
        public void setGameSystemId(Long gameSystemId) {
            this.gameSystemId = gameSystemId;
        }

        @Generated
        public void setAsSeries(Boolean asSeries) {
            this.asSeries = asSeries;
        }

        @Generated
        public void setGameSystem(String gameSystem) {
            this.gameSystem = gameSystem;
        }

        @Generated
        public void setProductionLocations(List<String> productionLocations) {
            this.productionLocations = productionLocations;
        }

        @Generated
        public void setPath(String path) {
            this.path = path;
        }

        @Generated
        public void setOfficialRating(String officialRating) {
            this.officialRating = officialRating;
        }

        @Generated
        public void setCustomRating(String customRating) {
            this.customRating = customRating;
        }

        @Generated
        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        @Generated
        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        @Generated
        public void setOverview(String overview) {
            this.overview = overview;
        }

        @Generated
        public void setTaglines(List<String> taglines) {
            this.taglines = taglines;
        }

        @Generated
        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        @Generated
        public void setCommunityRating(Float communityRating) {
            this.communityRating = communityRating;
        }

        @Generated
        public void setRunTimeTicks(Long runTimeTicks) {
            this.runTimeTicks = runTimeTicks;
        }

        @Generated
        public void setSize(Long size) {
            this.size = size;
        }

        @Generated
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        @Generated
        public void setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
        }

        @Generated
        public void setProductionYear(Integer productionYear) {
            this.productionYear = productionYear;
        }

        @Generated
        public void setNumber(String number) {
            this.number = number;
        }

        @Generated
        public void setChannelNumber(String channelNumber) {
            this.channelNumber = channelNumber;
        }

        @Generated
        public void setIndexNumber(Integer indexNumber) {
            this.indexNumber = indexNumber;
        }

        @Generated
        public void setIndexNumberEnd(Integer indexNumberEnd) {
            this.indexNumberEnd = indexNumberEnd;
        }

        @Generated
        public void setParentIndexNumber(Integer parentIndexNumber) {
            this.parentIndexNumber = parentIndexNumber;
        }

        @Generated
        public void setRemoteTrailers(List<MediaUrl> remoteTrailers) {
            this.remoteTrailers = remoteTrailers;
        }

        @Generated
        public void setProviderIds(ProviderIdDictionary providerIds) {
            this.providerIds = providerIds;
        }

        @Generated
        public void setIsFolder(Boolean isFolder) {
            this.isFolder = isFolder;
        }

        @Generated
        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        @Generated
        public void setType(String type) {
            this.type = type;
        }

        @Generated
        public void setPeople(List<BaseItemPerson> people) {
            this.people = people;
        }

        @Generated
        public void setStudios(List<NameLongIdPair> studios) {
            this.studios = studios;
        }

        @Generated
        public void setGenreItems(List<NameLongIdPair> genreItems) {
            this.genreItems = genreItems;
        }

        @Generated
        public void setTagItems(List<NameLongIdPair> tagItems) {
            this.tagItems = tagItems;
        }

        @Generated
        public void setParentLogoItemId(String parentLogoItemId) {
            this.parentLogoItemId = parentLogoItemId;
        }

        @Generated
        public void setParentBackdropItemId(String parentBackdropItemId) {
            this.parentBackdropItemId = parentBackdropItemId;
        }

        @Generated
        public void setParentBackdropImageTags(List<String> parentBackdropImageTags) {
            this.parentBackdropImageTags = parentBackdropImageTags;
        }

        @Generated
        public void setLocalTrailerCount(Integer localTrailerCount) {
            this.localTrailerCount = localTrailerCount;
        }

        @Generated
        public void setUserData(UserItemDataDto userData) {
            this.userData = userData;
        }

        @Generated
        public void setRecursiveItemCount(Integer recursiveItemCount) {
            this.recursiveItemCount = recursiveItemCount;
        }

        @Generated
        public void setChildCount(Integer childCount) {
            this.childCount = childCount;
        }

        @Generated
        public void setSeasonCount(Integer seasonCount) {
            this.seasonCount = seasonCount;
        }

        @Generated
        public void setSeriesName(String seriesName) {
            this.seriesName = seriesName;
        }

        @Generated
        public void setSeriesId(String seriesId) {
            this.seriesId = seriesId;
        }

        @Generated
        public void setSeasonId(String seasonId) {
            this.seasonId = seasonId;
        }

        @Generated
        public void setSpecialFeatureCount(Integer specialFeatureCount) {
            this.specialFeatureCount = specialFeatureCount;
        }

        @Generated
        public void setDisplayPreferencesId(String displayPreferencesId) {
            this.displayPreferencesId = displayPreferencesId;
        }

        @Generated
        public void setStatus(String status) {
            this.status = status;
        }

        @Generated
        public void setAirDays(List<DayOfWeek> airDays) {
            this.airDays = airDays;
        }

        @Generated
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @Generated
        public void setPrimaryImageAspectRatio(Double primaryImageAspectRatio) {
            this.primaryImageAspectRatio = primaryImageAspectRatio;
        }

        @Generated
        public void setArtists(List<String> artists) {
            this.artists = artists;
        }

        @Generated
        public void setArtistItems(List<NameIdPair> artistItems) {
            this.artistItems = artistItems;
        }

        @Generated
        public void setComposers(List<NameIdPair> composers) {
            this.composers = composers;
        }

        @Generated
        public void setAlbum(String album) {
            this.album = album;
        }

        @Generated
        public void setCollectionType(String collectionType) {
            this.collectionType = collectionType;
        }

        @Generated
        public void setDisplayOrder(String displayOrder) {
            this.displayOrder = displayOrder;
        }

        @Generated
        public void setAlbumId(String albumId) {
            this.albumId = albumId;
        }

        @Generated
        public void setAlbumPrimaryImageTag(String albumPrimaryImageTag) {
            this.albumPrimaryImageTag = albumPrimaryImageTag;
        }

        @Generated
        public void setSeriesPrimaryImageTag(String seriesPrimaryImageTag) {
            this.seriesPrimaryImageTag = seriesPrimaryImageTag;
        }

        @Generated
        public void setAlbumArtist(String albumArtist) {
            this.albumArtist = albumArtist;
        }

        @Generated
        public void setAlbumArtists(List<NameIdPair> albumArtists) {
            this.albumArtists = albumArtists;
        }

        @Generated
        public void setSeasonName(String seasonName) {
            this.seasonName = seasonName;
        }

        @Generated
        public void setMediaStreams(List<MediaStream> mediaStreams) {
            this.mediaStreams = mediaStreams;
        }

        @Generated
        public void setPartCount(Integer partCount) {
            this.partCount = partCount;
        }

        @Generated
        public void setImageTags(Map<String, String> imageTags) {
            this.imageTags = imageTags;
        }

        @Generated
        public void setBackdropImageTags(List<String> backdropImageTags) {
            this.backdropImageTags = backdropImageTags;
        }

        @Generated
        public void setParentLogoImageTag(String parentLogoImageTag) {
            this.parentLogoImageTag = parentLogoImageTag;
        }

        @Generated
        public void setSeriesStudio(String seriesStudio) {
            this.seriesStudio = seriesStudio;
        }

        @Generated
        public void setPrimaryImageItemId(String primaryImageItemId) {
            this.primaryImageItemId = primaryImageItemId;
        }

        @Generated
        public void setPrimaryImageTag(String primaryImageTag) {
            this.primaryImageTag = primaryImageTag;
        }

        @Generated
        public void setParentThumbItemId(String parentThumbItemId) {
            this.parentThumbItemId = parentThumbItemId;
        }

        @Generated
        public void setParentThumbImageTag(String parentThumbImageTag) {
            this.parentThumbImageTag = parentThumbImageTag;
        }

        @Generated
        public void setChapters(List<ChapterInfo> chapters) {
            this.chapters = chapters;
        }

        @Generated
        public void setLocationType(LocationType locationType) {
            this.locationType = locationType;
        }

        @Generated
        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        @Generated
        public void setEndDate(OffsetDateTime endDate) {
            this.endDate = endDate;
        }

        @Generated
        public void setLockedFields(List<MetadataFields> lockedFields) {
            this.lockedFields = lockedFields;
        }

        @Generated
        public void setLockData(Boolean lockData) {
            this.lockData = lockData;
        }

        @Generated
        public void setWidth(Integer width) {
            this.width = width;
        }

        @Generated
        public void setHeight(Integer height) {
            this.height = height;
        }

        @Generated
        public void setCameraMake(String cameraMake) {
            this.cameraMake = cameraMake;
        }

        @Generated
        public void setCameraModel(String cameraModel) {
            this.cameraModel = cameraModel;
        }

        @Generated
        public void setSoftware(String software) {
            this.software = software;
        }

        @Generated
        public void setExposureTime(Double exposureTime) {
            this.exposureTime = exposureTime;
        }

        @Generated
        public void setFocalLength(Double focalLength) {
            this.focalLength = focalLength;
        }

        @Generated
        public void setImageOrientation(DrawingImageOrientation imageOrientation) {
            this.imageOrientation = imageOrientation;
        }

        @Generated
        public void setAperture(Double aperture) {
            this.aperture = aperture;
        }

        @Generated
        public void setShutterSpeed(Double shutterSpeed) {
            this.shutterSpeed = shutterSpeed;
        }

        @Generated
        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        @Generated
        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        @Generated
        public void setAltitude(Double altitude) {
            this.altitude = altitude;
        }

        @Generated
        public void setIsoSpeedRating(Integer isoSpeedRating) {
            this.isoSpeedRating = isoSpeedRating;
        }

        @Generated
        public void setSeriesTimerId(String seriesTimerId) {
            this.seriesTimerId = seriesTimerId;
        }

        @Generated
        public void setChannelPrimaryImageTag(String channelPrimaryImageTag) {
            this.channelPrimaryImageTag = channelPrimaryImageTag;
        }

        @Generated
        public void setStartDate(OffsetDateTime startDate) {
            this.startDate = startDate;
        }

        @Generated
        public void setCompletionPercentage(Double completionPercentage) {
            this.completionPercentage = completionPercentage;
        }

        @Generated
        public void setIsRepeat(Boolean isRepeat) {
            this.isRepeat = isRepeat;
        }

        @Generated
        public void setIsNew(Boolean isNew) {
            this.isNew = isNew;
        }

        @Generated
        public void setEpisodeTitle(String episodeTitle) {
            this.episodeTitle = episodeTitle;
        }

        @Generated
        public void setIsMovie(Boolean isMovie) {
            this.isMovie = isMovie;
        }

        @Generated
        public void setIsSports(Boolean isSports) {
            this.isSports = isSports;
        }

        @Generated
        public void setIsSeries(Boolean isSeries) {
            this.isSeries = isSeries;
        }

        @Generated
        public void setIsLive(Boolean isLive) {
            this.isLive = isLive;
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
        public void setIsPremiere(Boolean isPremiere) {
            this.isPremiere = isPremiere;
        }

        @Generated
        public void setTimerType(LiveTvTimerType timerType) {
            this.timerType = timerType;
        }

        @Generated
        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }

        @Generated
        public void setManagementId(String managementId) {
            this.managementId = managementId;
        }

        @Generated
        public void setTimerId(String timerId) {
            this.timerId = timerId;
        }

        @Generated
        public void setCurrentProgram(BaseItemDto currentProgram) {
            this.currentProgram = currentProgram;
        }

        @Generated
        public void setMovieCount(Integer movieCount) {
            this.movieCount = movieCount;
        }

        @Generated
        public void setSeriesCount(Integer seriesCount) {
            this.seriesCount = seriesCount;
        }

        @Generated
        public void setAlbumCount(Integer albumCount) {
            this.albumCount = albumCount;
        }

        @Generated
        public void setSongCount(Integer songCount) {
            this.songCount = songCount;
        }

        @Generated
        public void setMusicVideoCount(Integer musicVideoCount) {
            this.musicVideoCount = musicVideoCount;
        }

        @Generated
        public void setSubviews(List<String> subviews) {
            this.subviews = subviews;
        }

        @Generated
        public void setListingsProviderId(String listingsProviderId) {
            this.listingsProviderId = listingsProviderId;
        }

        @Generated
        public void setListingsChannelId(String listingsChannelId) {
            this.listingsChannelId = listingsChannelId;
        }

        @Generated
        public void setListingsPath(String listingsPath) {
            this.listingsPath = listingsPath;
        }

        @Generated
        public void setListingsId(String listingsId) {
            this.listingsId = listingsId;
        }

        @Generated
        public void setListingsChannelName(String listingsChannelName) {
            this.listingsChannelName = listingsChannelName;
        }

        @Generated
        public void setListingsChannelNumber(String listingsChannelNumber) {
            this.listingsChannelNumber = listingsChannelNumber;
        }

        @Generated
        public void setAffiliateCallSign(String affiliateCallSign) {
            this.affiliateCallSign = affiliateCallSign;
        }

        @Generated
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        @Generated
        public void setFilmTitle(String filmTitle) {
            this.filmTitle = filmTitle;
        }

        @Generated
        public void setPrimaryImageAspectRatioCount(String primaryImageAspectRatioCount) {
            this.primaryImageAspectRatioCount = primaryImageAspectRatioCount;
        }

        @Generated
        public void setEmbyItemUrl(String embyItemUrl) {
            this.embyItemUrl = embyItemUrl;
        }

        @Generated
        public void setBackdropImageUrl(String backdropImageUrl) {
            this.backdropImageUrl = backdropImageUrl;
        }

        /*
         * WARNING - void declaration
         */
        @Generated
        public boolean equals(Object o) {
            void other$backdropImageUrl;
            void this$backdropImageUrl;
            void other$embyItemUrl;
            void this$embyItemUrl;
            void other$primaryImageAspectRatioCount;
            void this$primaryImageAspectRatioCount;
            void other$filmTitle;
            void this$filmTitle;
            void other$imageUrl;
            void this$imageUrl;
            void other$affiliateCallSign;
            void this$affiliateCallSign;
            void other$listingsChannelNumber;
            void this$listingsChannelNumber;
            void other$listingsChannelName;
            void this$listingsChannelName;
            void other$listingsId;
            void this$listingsId;
            void other$listingsPath;
            void this$listingsPath;
            void other$listingsChannelId;
            void this$listingsChannelId;
            void other$listingsProviderId;
            void this$listingsProviderId;
            void other$subviews;
            void this$subviews;
            void other$currentProgram;
            void this$currentProgram;
            void other$timerId;
            void this$timerId;
            void other$managementId;
            void this$managementId;
            void other$timerType;
            void this$timerType;
            void other$episodeTitle;
            void this$episodeTitle;
            void other$startDate;
            void this$startDate;
            void other$channelPrimaryImageTag;
            void this$channelPrimaryImageTag;
            void other$seriesTimerId;
            void this$seriesTimerId;
            void other$imageOrientation;
            void this$imageOrientation;
            void other$software;
            void this$software;
            void other$cameraModel;
            void this$cameraModel;
            void other$cameraMake;
            void this$cameraMake;
            void other$lockedFields;
            void this$lockedFields;
            void other$endDate;
            void this$endDate;
            void other$mediaType;
            void this$mediaType;
            void other$locationType;
            void this$locationType;
            void other$chapters;
            void this$chapters;
            void other$parentThumbImageTag;
            void this$parentThumbImageTag;
            void other$parentThumbItemId;
            void this$parentThumbItemId;
            void other$primaryImageTag;
            void this$primaryImageTag;
            void other$primaryImageItemId;
            void this$primaryImageItemId;
            void other$seriesStudio;
            if (o == this) {
                return true;
            }
            if (!(o instanceof ItemsDTO)) {
                return false;
            }
            ItemsDTO other = (ItemsDTO)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Integer this$sortIndexNumber = this.getSortIndexNumber();
            Integer other$sortIndexNumber = other.getSortIndexNumber();
            if (this$sortIndexNumber == null ? other$sortIndexNumber != null : !((Object)this$sortIndexNumber).equals(other$sortIndexNumber)) {
                return false;
            }
            Integer this$sortParentIndexNumber = this.getSortParentIndexNumber();
            Integer other$sortParentIndexNumber = other.getSortParentIndexNumber();
            if (this$sortParentIndexNumber == null ? other$sortParentIndexNumber != null : !((Object)this$sortParentIndexNumber).equals(other$sortParentIndexNumber)) {
                return false;
            }
            Boolean this$canDelete = this.getCanDelete();
            Boolean other$canDelete = other.getCanDelete();
            if (this$canDelete == null ? other$canDelete != null : !((Object)this$canDelete).equals(other$canDelete)) {
                return false;
            }
            Boolean this$canDownload = this.getCanDownload();
            Boolean other$canDownload = other.getCanDownload();
            if (this$canDownload == null ? other$canDownload != null : !((Object)this$canDownload).equals(other$canDownload)) {
                return false;
            }
            Boolean this$canEditItems = this.getCanEditItems();
            Boolean other$canEditItems = other.getCanEditItems();
            if (this$canEditItems == null ? other$canEditItems != null : !((Object)this$canEditItems).equals(other$canEditItems)) {
                return false;
            }
            Boolean this$supportsResume = this.getSupportsResume();
            Boolean other$supportsResume = other.getSupportsResume();
            if (this$supportsResume == null ? other$supportsResume != null : !((Object)this$supportsResume).equals(other$supportsResume)) {
                return false;
            }
            Boolean this$supportsSync = this.getSupportsSync();
            Boolean other$supportsSync = other.getSupportsSync();
            if (this$supportsSync == null ? other$supportsSync != null : !((Object)this$supportsSync).equals(other$supportsSync)) {
                return false;
            }
            Boolean this$canManageAccess = this.getCanManageAccess();
            Boolean other$canManageAccess = other.getCanManageAccess();
            if (this$canManageAccess == null ? other$canManageAccess != null : !((Object)this$canManageAccess).equals(other$canManageAccess)) {
                return false;
            }
            Boolean this$canLeaveContent = this.getCanLeaveContent();
            Boolean other$canLeaveContent = other.getCanLeaveContent();
            if (this$canLeaveContent == null ? other$canLeaveContent != null : !((Object)this$canLeaveContent).equals(other$canLeaveContent)) {
                return false;
            }
            Boolean this$canMakePublic = this.getCanMakePublic();
            Boolean other$canMakePublic = other.getCanMakePublic();
            if (this$canMakePublic == null ? other$canMakePublic != null : !((Object)this$canMakePublic).equals(other$canMakePublic)) {
                return false;
            }
            Float this$criticRating = this.getCriticRating();
            Float other$criticRating = other.getCriticRating();
            if (this$criticRating == null ? other$criticRating != null : !((Object)this$criticRating).equals(other$criticRating)) {
                return false;
            }
            Long this$gameSystemId = this.getGameSystemId();
            Long other$gameSystemId = other.getGameSystemId();
            if (this$gameSystemId == null ? other$gameSystemId != null : !((Object)this$gameSystemId).equals(other$gameSystemId)) {
                return false;
            }
            Boolean this$asSeries = this.getAsSeries();
            Boolean other$asSeries = other.getAsSeries();
            if (this$asSeries == null ? other$asSeries != null : !((Object)this$asSeries).equals(other$asSeries)) {
                return false;
            }
            Float this$communityRating = this.getCommunityRating();
            Float other$communityRating = other.getCommunityRating();
            if (this$communityRating == null ? other$communityRating != null : !((Object)this$communityRating).equals(other$communityRating)) {
                return false;
            }
            Long this$runTimeTicks = this.getRunTimeTicks();
            Long other$runTimeTicks = other.getRunTimeTicks();
            if (this$runTimeTicks == null ? other$runTimeTicks != null : !((Object)this$runTimeTicks).equals(other$runTimeTicks)) {
                return false;
            }
            Long this$size = this.getSize();
            Long other$size = other.getSize();
            if (this$size == null ? other$size != null : !((Object)this$size).equals(other$size)) {
                return false;
            }
            Integer this$bitrate = this.getBitrate();
            Integer other$bitrate = other.getBitrate();
            if (this$bitrate == null ? other$bitrate != null : !((Object)this$bitrate).equals(other$bitrate)) {
                return false;
            }
            Integer this$productionYear = this.getProductionYear();
            Integer other$productionYear = other.getProductionYear();
            if (this$productionYear == null ? other$productionYear != null : !((Object)this$productionYear).equals(other$productionYear)) {
                return false;
            }
            Integer this$indexNumber = this.getIndexNumber();
            Integer other$indexNumber = other.getIndexNumber();
            if (this$indexNumber == null ? other$indexNumber != null : !((Object)this$indexNumber).equals(other$indexNumber)) {
                return false;
            }
            Integer this$indexNumberEnd = this.getIndexNumberEnd();
            Integer other$indexNumberEnd = other.getIndexNumberEnd();
            if (this$indexNumberEnd == null ? other$indexNumberEnd != null : !((Object)this$indexNumberEnd).equals(other$indexNumberEnd)) {
                return false;
            }
            Integer this$parentIndexNumber = this.getParentIndexNumber();
            Integer other$parentIndexNumber = other.getParentIndexNumber();
            if (this$parentIndexNumber == null ? other$parentIndexNumber != null : !((Object)this$parentIndexNumber).equals(other$parentIndexNumber)) {
                return false;
            }
            Boolean this$isFolder = this.getIsFolder();
            Boolean other$isFolder = other.getIsFolder();
            if (this$isFolder == null ? other$isFolder != null : !((Object)this$isFolder).equals(other$isFolder)) {
                return false;
            }
            Integer this$localTrailerCount = this.getLocalTrailerCount();
            Integer other$localTrailerCount = other.getLocalTrailerCount();
            if (this$localTrailerCount == null ? other$localTrailerCount != null : !((Object)this$localTrailerCount).equals(other$localTrailerCount)) {
                return false;
            }
            Integer this$recursiveItemCount = this.getRecursiveItemCount();
            Integer other$recursiveItemCount = other.getRecursiveItemCount();
            if (this$recursiveItemCount == null ? other$recursiveItemCount != null : !((Object)this$recursiveItemCount).equals(other$recursiveItemCount)) {
                return false;
            }
            Integer this$childCount = this.getChildCount();
            Integer other$childCount = other.getChildCount();
            if (this$childCount == null ? other$childCount != null : !((Object)this$childCount).equals(other$childCount)) {
                return false;
            }
            Integer this$seasonCount = this.getSeasonCount();
            Integer other$seasonCount = other.getSeasonCount();
            if (this$seasonCount == null ? other$seasonCount != null : !((Object)this$seasonCount).equals(other$seasonCount)) {
                return false;
            }
            Integer this$specialFeatureCount = this.getSpecialFeatureCount();
            Integer other$specialFeatureCount = other.getSpecialFeatureCount();
            if (this$specialFeatureCount == null ? other$specialFeatureCount != null : !((Object)this$specialFeatureCount).equals(other$specialFeatureCount)) {
                return false;
            }
            Double this$primaryImageAspectRatio = this.getPrimaryImageAspectRatio();
            Double other$primaryImageAspectRatio = other.getPrimaryImageAspectRatio();
            if (this$primaryImageAspectRatio == null ? other$primaryImageAspectRatio != null : !((Object)this$primaryImageAspectRatio).equals(other$primaryImageAspectRatio)) {
                return false;
            }
            Integer this$partCount = this.getPartCount();
            Integer other$partCount = other.getPartCount();
            if (this$partCount == null ? other$partCount != null : !((Object)this$partCount).equals(other$partCount)) {
                return false;
            }
            Boolean this$lockData = this.getLockData();
            Boolean other$lockData = other.getLockData();
            if (this$lockData == null ? other$lockData != null : !((Object)this$lockData).equals(other$lockData)) {
                return false;
            }
            Integer this$width = this.getWidth();
            Integer other$width = other.getWidth();
            if (this$width == null ? other$width != null : !((Object)this$width).equals(other$width)) {
                return false;
            }
            Integer this$height = this.getHeight();
            Integer other$height = other.getHeight();
            if (this$height == null ? other$height != null : !((Object)this$height).equals(other$height)) {
                return false;
            }
            Double this$exposureTime = this.getExposureTime();
            Double other$exposureTime = other.getExposureTime();
            if (this$exposureTime == null ? other$exposureTime != null : !((Object)this$exposureTime).equals(other$exposureTime)) {
                return false;
            }
            Double this$focalLength = this.getFocalLength();
            Double other$focalLength = other.getFocalLength();
            if (this$focalLength == null ? other$focalLength != null : !((Object)this$focalLength).equals(other$focalLength)) {
                return false;
            }
            Double this$aperture = this.getAperture();
            Double other$aperture = other.getAperture();
            if (this$aperture == null ? other$aperture != null : !((Object)this$aperture).equals(other$aperture)) {
                return false;
            }
            Double this$shutterSpeed = this.getShutterSpeed();
            Double other$shutterSpeed = other.getShutterSpeed();
            if (this$shutterSpeed == null ? other$shutterSpeed != null : !((Object)this$shutterSpeed).equals(other$shutterSpeed)) {
                return false;
            }
            Double this$latitude = this.getLatitude();
            Double other$latitude = other.getLatitude();
            if (this$latitude == null ? other$latitude != null : !((Object)this$latitude).equals(other$latitude)) {
                return false;
            }
            Double this$longitude = this.getLongitude();
            Double other$longitude = other.getLongitude();
            if (this$longitude == null ? other$longitude != null : !((Object)this$longitude).equals(other$longitude)) {
                return false;
            }
            Double this$altitude = this.getAltitude();
            Double other$altitude = other.getAltitude();
            if (this$altitude == null ? other$altitude != null : !((Object)this$altitude).equals(other$altitude)) {
                return false;
            }
            Integer this$isoSpeedRating = this.getIsoSpeedRating();
            Integer other$isoSpeedRating = other.getIsoSpeedRating();
            if (this$isoSpeedRating == null ? other$isoSpeedRating != null : !((Object)this$isoSpeedRating).equals(other$isoSpeedRating)) {
                return false;
            }
            Double this$completionPercentage = this.getCompletionPercentage();
            Double other$completionPercentage = other.getCompletionPercentage();
            if (this$completionPercentage == null ? other$completionPercentage != null : !((Object)this$completionPercentage).equals(other$completionPercentage)) {
                return false;
            }
            Boolean this$isRepeat = this.getIsRepeat();
            Boolean other$isRepeat = other.getIsRepeat();
            if (this$isRepeat == null ? other$isRepeat != null : !((Object)this$isRepeat).equals(other$isRepeat)) {
                return false;
            }
            Boolean this$isNew = this.getIsNew();
            Boolean other$isNew = other.getIsNew();
            if (this$isNew == null ? other$isNew != null : !((Object)this$isNew).equals(other$isNew)) {
                return false;
            }
            Boolean this$isMovie = this.getIsMovie();
            Boolean other$isMovie = other.getIsMovie();
            if (this$isMovie == null ? other$isMovie != null : !((Object)this$isMovie).equals(other$isMovie)) {
                return false;
            }
            Boolean this$isSports = this.getIsSports();
            Boolean other$isSports = other.getIsSports();
            if (this$isSports == null ? other$isSports != null : !((Object)this$isSports).equals(other$isSports)) {
                return false;
            }
            Boolean this$isSeries = this.getIsSeries();
            Boolean other$isSeries = other.getIsSeries();
            if (this$isSeries == null ? other$isSeries != null : !((Object)this$isSeries).equals(other$isSeries)) {
                return false;
            }
            Boolean this$isLive = this.getIsLive();
            Boolean other$isLive = other.getIsLive();
            if (this$isLive == null ? other$isLive != null : !((Object)this$isLive).equals(other$isLive)) {
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
            Boolean this$isPremiere = this.getIsPremiere();
            Boolean other$isPremiere = other.getIsPremiere();
            if (this$isPremiere == null ? other$isPremiere != null : !((Object)this$isPremiere).equals(other$isPremiere)) {
                return false;
            }
            Boolean this$disabled = this.getDisabled();
            Boolean other$disabled = other.getDisabled();
            if (this$disabled == null ? other$disabled != null : !((Object)this$disabled).equals(other$disabled)) {
                return false;
            }
            Integer this$movieCount = this.getMovieCount();
            Integer other$movieCount = other.getMovieCount();
            if (this$movieCount == null ? other$movieCount != null : !((Object)this$movieCount).equals(other$movieCount)) {
                return false;
            }
            Integer this$seriesCount = this.getSeriesCount();
            Integer other$seriesCount = other.getSeriesCount();
            if (this$seriesCount == null ? other$seriesCount != null : !((Object)this$seriesCount).equals(other$seriesCount)) {
                return false;
            }
            Integer this$albumCount = this.getAlbumCount();
            Integer other$albumCount = other.getAlbumCount();
            if (this$albumCount == null ? other$albumCount != null : !((Object)this$albumCount).equals(other$albumCount)) {
                return false;
            }
            Integer this$songCount = this.getSongCount();
            Integer other$songCount = other.getSongCount();
            if (this$songCount == null ? other$songCount != null : !((Object)this$songCount).equals(other$songCount)) {
                return false;
            }
            Integer this$musicVideoCount = this.getMusicVideoCount();
            Integer other$musicVideoCount = other.getMusicVideoCount();
            if (this$musicVideoCount == null ? other$musicVideoCount != null : !((Object)this$musicVideoCount).equals(other$musicVideoCount)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            String this$originalTitle = this.getOriginalTitle();
            String other$originalTitle = other.getOriginalTitle();
            if (this$originalTitle == null ? other$originalTitle != null : !this$originalTitle.equals(other$originalTitle)) {
                return false;
            }
            String this$serverId = this.getServerId();
            String other$serverId = other.getServerId();
            if (this$serverId == null ? other$serverId != null : !this$serverId.equals(other$serverId)) {
                return false;
            }
            String this$id = this.getId();
            String other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
                return false;
            }
            String this$guid = this.getGuid();
            String other$guid = other.getGuid();
            if (this$guid == null ? other$guid != null : !this$guid.equals(other$guid)) {
                return false;
            }
            String this$etag = this.getEtag();
            String other$etag = other.getEtag();
            if (this$etag == null ? other$etag != null : !this$etag.equals(other$etag)) {
                return false;
            }
            String this$prefix = this.getPrefix();
            String other$prefix = other.getPrefix();
            if (this$prefix == null ? other$prefix != null : !this$prefix.equals(other$prefix)) {
                return false;
            }
            String this$tunerName = this.getTunerName();
            String other$tunerName = other.getTunerName();
            if (this$tunerName == null ? other$tunerName != null : !this$tunerName.equals(other$tunerName)) {
                return false;
            }
            String this$playlistItemId = this.getPlaylistItemId();
            String other$playlistItemId = other.getPlaylistItemId();
            if (this$playlistItemId == null ? other$playlistItemId != null : !this$playlistItemId.equals(other$playlistItemId)) {
                return false;
            }
            OffsetDateTime this$dateCreated = this.getDateCreated();
            OffsetDateTime other$dateCreated = other.getDateCreated();
            if (this$dateCreated == null ? other$dateCreated != null : !((Object)this$dateCreated).equals(other$dateCreated)) {
                return false;
            }
            String this$extraType = this.getExtraType();
            String other$extraType = other.getExtraType();
            if (this$extraType == null ? other$extraType != null : !this$extraType.equals(other$extraType)) {
                return false;
            }
            String this$presentationUniqueKey = this.getPresentationUniqueKey();
            String other$presentationUniqueKey = other.getPresentationUniqueKey();
            if (this$presentationUniqueKey == null ? other$presentationUniqueKey != null : !this$presentationUniqueKey.equals(other$presentationUniqueKey)) {
                return false;
            }
            String this$preferredMetadataLanguage = this.getPreferredMetadataLanguage();
            String other$preferredMetadataLanguage = other.getPreferredMetadataLanguage();
            if (this$preferredMetadataLanguage == null ? other$preferredMetadataLanguage != null : !this$preferredMetadataLanguage.equals(other$preferredMetadataLanguage)) {
                return false;
            }
            String this$preferredMetadataCountryCode = this.getPreferredMetadataCountryCode();
            String other$preferredMetadataCountryCode = other.getPreferredMetadataCountryCode();
            if (this$preferredMetadataCountryCode == null ? other$preferredMetadataCountryCode != null : !this$preferredMetadataCountryCode.equals(other$preferredMetadataCountryCode)) {
                return false;
            }
            SyncJobItemStatus this$syncStatus = this.getSyncStatus();
            SyncJobItemStatus other$syncStatus = other.getSyncStatus();
            if (this$syncStatus == null ? other$syncStatus != null : !this$syncStatus.equals(other$syncStatus)) {
                return false;
            }
            String this$container = this.getContainer();
            String other$container = other.getContainer();
            if (this$container == null ? other$container != null : !this$container.equals(other$container)) {
                return false;
            }
            String this$sortName = this.getSortName();
            String other$sortName = other.getSortName();
            if (this$sortName == null ? other$sortName != null : !this$sortName.equals(other$sortName)) {
                return false;
            }
            String this$forcedSortName = this.getForcedSortName();
            String other$forcedSortName = other.getForcedSortName();
            if (this$forcedSortName == null ? other$forcedSortName != null : !this$forcedSortName.equals(other$forcedSortName)) {
                return false;
            }
            Video3DFormat this$video3DFormat = this.getVideo3DFormat();
            Video3DFormat other$video3DFormat = other.getVideo3DFormat();
            if (this$video3DFormat == null ? other$video3DFormat != null : !this$video3DFormat.equals(other$video3DFormat)) {
                return false;
            }
            OffsetDateTime this$premiereDate = this.getPremiereDate();
            OffsetDateTime other$premiereDate = other.getPremiereDate();
            if (this$premiereDate == null ? other$premiereDate != null : !((Object)this$premiereDate).equals(other$premiereDate)) {
                return false;
            }
            List<ExternalUrl> this$externalUrls = this.getExternalUrls();
            List<ExternalUrl> other$externalUrls = other.getExternalUrls();
            if (this$externalUrls == null ? other$externalUrls != null : !((Object)this$externalUrls).equals(other$externalUrls)) {
                return false;
            }
            List<MediaSourceInfo> this$mediaSources = this.getMediaSources();
            List<MediaSourceInfo> other$mediaSources = other.getMediaSources();
            if (this$mediaSources == null ? other$mediaSources != null : !((Object)this$mediaSources).equals(other$mediaSources)) {
                return false;
            }
            String this$gameSystem = this.getGameSystem();
            String other$gameSystem = other.getGameSystem();
            if (this$gameSystem == null ? other$gameSystem != null : !this$gameSystem.equals(other$gameSystem)) {
                return false;
            }
            List<String> this$productionLocations = this.getProductionLocations();
            List<String> other$productionLocations = other.getProductionLocations();
            if (this$productionLocations == null ? other$productionLocations != null : !((Object)this$productionLocations).equals(other$productionLocations)) {
                return false;
            }
            String this$path = this.getPath();
            String other$path = other.getPath();
            if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
                return false;
            }
            String this$officialRating = this.getOfficialRating();
            String other$officialRating = other.getOfficialRating();
            if (this$officialRating == null ? other$officialRating != null : !this$officialRating.equals(other$officialRating)) {
                return false;
            }
            String this$customRating = this.getCustomRating();
            String other$customRating = other.getCustomRating();
            if (this$customRating == null ? other$customRating != null : !this$customRating.equals(other$customRating)) {
                return false;
            }
            String this$channelId = this.getChannelId();
            String other$channelId = other.getChannelId();
            if (this$channelId == null ? other$channelId != null : !this$channelId.equals(other$channelId)) {
                return false;
            }
            String this$channelName = this.getChannelName();
            String other$channelName = other.getChannelName();
            if (this$channelName == null ? other$channelName != null : !this$channelName.equals(other$channelName)) {
                return false;
            }
            String this$overview = this.getOverview();
            String other$overview = other.getOverview();
            if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
                return false;
            }
            List<String> this$taglines = this.getTaglines();
            List<String> other$taglines = other.getTaglines();
            if (this$taglines == null ? other$taglines != null : !((Object)this$taglines).equals(other$taglines)) {
                return false;
            }
            List<String> this$genres = this.getGenres();
            List<String> other$genres = other.getGenres();
            if (this$genres == null ? other$genres != null : !((Object)this$genres).equals(other$genres)) {
                return false;
            }
            String this$fileName = this.getFileName();
            String other$fileName = other.getFileName();
            if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) {
                return false;
            }
            String this$number = this.getNumber();
            String other$number = other.getNumber();
            if (this$number == null ? other$number != null : !this$number.equals(other$number)) {
                return false;
            }
            String this$channelNumber = this.getChannelNumber();
            String other$channelNumber = other.getChannelNumber();
            if (this$channelNumber == null ? other$channelNumber != null : !this$channelNumber.equals(other$channelNumber)) {
                return false;
            }
            List<MediaUrl> this$remoteTrailers = this.getRemoteTrailers();
            List<MediaUrl> other$remoteTrailers = other.getRemoteTrailers();
            if (this$remoteTrailers == null ? other$remoteTrailers != null : !((Object)this$remoteTrailers).equals(other$remoteTrailers)) {
                return false;
            }
            ProviderIdDictionary this$providerIds = this.getProviderIds();
            ProviderIdDictionary other$providerIds = other.getProviderIds();
            if (this$providerIds == null ? other$providerIds != null : !this$providerIds.equals(other$providerIds)) {
                return false;
            }
            String this$parentId = this.getParentId();
            String other$parentId = other.getParentId();
            if (this$parentId == null ? other$parentId != null : !this$parentId.equals(other$parentId)) {
                return false;
            }
            String this$type = this.getType();
            String other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
                return false;
            }
            List<BaseItemPerson> this$people = this.getPeople();
            List<BaseItemPerson> other$people = other.getPeople();
            if (this$people == null ? other$people != null : !((Object)this$people).equals(other$people)) {
                return false;
            }
            List<NameLongIdPair> this$studios = this.getStudios();
            List<NameLongIdPair> other$studios = other.getStudios();
            if (this$studios == null ? other$studios != null : !((Object)this$studios).equals(other$studios)) {
                return false;
            }
            List<NameLongIdPair> this$genreItems = this.getGenreItems();
            List<NameLongIdPair> other$genreItems = other.getGenreItems();
            if (this$genreItems == null ? other$genreItems != null : !((Object)this$genreItems).equals(other$genreItems)) {
                return false;
            }
            List<NameLongIdPair> this$tagItems = this.getTagItems();
            List<NameLongIdPair> other$tagItems = other.getTagItems();
            if (this$tagItems == null ? other$tagItems != null : !((Object)this$tagItems).equals(other$tagItems)) {
                return false;
            }
            String this$parentLogoItemId = this.getParentLogoItemId();
            String other$parentLogoItemId = other.getParentLogoItemId();
            if (this$parentLogoItemId == null ? other$parentLogoItemId != null : !this$parentLogoItemId.equals(other$parentLogoItemId)) {
                return false;
            }
            String this$parentBackdropItemId = this.getParentBackdropItemId();
            String other$parentBackdropItemId = other.getParentBackdropItemId();
            if (this$parentBackdropItemId == null ? other$parentBackdropItemId != null : !this$parentBackdropItemId.equals(other$parentBackdropItemId)) {
                return false;
            }
            List<String> this$parentBackdropImageTags = this.getParentBackdropImageTags();
            List<String> other$parentBackdropImageTags = other.getParentBackdropImageTags();
            if (this$parentBackdropImageTags == null ? other$parentBackdropImageTags != null : !((Object)this$parentBackdropImageTags).equals(other$parentBackdropImageTags)) {
                return false;
            }
            UserItemDataDto this$userData = this.getUserData();
            UserItemDataDto other$userData = other.getUserData();
            if (this$userData == null ? other$userData != null : !this$userData.equals(other$userData)) {
                return false;
            }
            String this$seriesName = this.getSeriesName();
            String other$seriesName = other.getSeriesName();
            if (this$seriesName == null ? other$seriesName != null : !this$seriesName.equals(other$seriesName)) {
                return false;
            }
            String this$seriesId = this.getSeriesId();
            String other$seriesId = other.getSeriesId();
            if (this$seriesId == null ? other$seriesId != null : !this$seriesId.equals(other$seriesId)) {
                return false;
            }
            String this$seasonId = this.getSeasonId();
            String other$seasonId = other.getSeasonId();
            if (this$seasonId == null ? other$seasonId != null : !this$seasonId.equals(other$seasonId)) {
                return false;
            }
            String this$displayPreferencesId = this.getDisplayPreferencesId();
            String other$displayPreferencesId = other.getDisplayPreferencesId();
            if (this$displayPreferencesId == null ? other$displayPreferencesId != null : !this$displayPreferencesId.equals(other$displayPreferencesId)) {
                return false;
            }
            String this$status = this.getStatus();
            String other$status = other.getStatus();
            if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
                return false;
            }
            List<DayOfWeek> this$airDays = this.getAirDays();
            List<DayOfWeek> other$airDays = other.getAirDays();
            if (this$airDays == null ? other$airDays != null : !((Object)this$airDays).equals(other$airDays)) {
                return false;
            }
            List<String> this$tags = this.getTags();
            List<String> other$tags = other.getTags();
            if (this$tags == null ? other$tags != null : !((Object)this$tags).equals(other$tags)) {
                return false;
            }
            List<String> this$artists = this.getArtists();
            List<String> other$artists = other.getArtists();
            if (this$artists == null ? other$artists != null : !((Object)this$artists).equals(other$artists)) {
                return false;
            }
            List<NameIdPair> this$artistItems = this.getArtistItems();
            List<NameIdPair> other$artistItems = other.getArtistItems();
            if (this$artistItems == null ? other$artistItems != null : !((Object)this$artistItems).equals(other$artistItems)) {
                return false;
            }
            List<NameIdPair> this$composers = this.getComposers();
            List<NameIdPair> other$composers = other.getComposers();
            if (this$composers == null ? other$composers != null : !((Object)this$composers).equals(other$composers)) {
                return false;
            }
            String this$album = this.getAlbum();
            String other$album = other.getAlbum();
            if (this$album == null ? other$album != null : !this$album.equals(other$album)) {
                return false;
            }
            String this$collectionType = this.getCollectionType();
            String other$collectionType = other.getCollectionType();
            if (this$collectionType == null ? other$collectionType != null : !this$collectionType.equals(other$collectionType)) {
                return false;
            }
            String this$displayOrder = this.getDisplayOrder();
            String other$displayOrder = other.getDisplayOrder();
            if (this$displayOrder == null ? other$displayOrder != null : !this$displayOrder.equals(other$displayOrder)) {
                return false;
            }
            String this$albumId = this.getAlbumId();
            String other$albumId = other.getAlbumId();
            if (this$albumId == null ? other$albumId != null : !this$albumId.equals(other$albumId)) {
                return false;
            }
            String this$albumPrimaryImageTag = this.getAlbumPrimaryImageTag();
            String other$albumPrimaryImageTag = other.getAlbumPrimaryImageTag();
            if (this$albumPrimaryImageTag == null ? other$albumPrimaryImageTag != null : !this$albumPrimaryImageTag.equals(other$albumPrimaryImageTag)) {
                return false;
            }
            String this$seriesPrimaryImageTag = this.getSeriesPrimaryImageTag();
            String other$seriesPrimaryImageTag = other.getSeriesPrimaryImageTag();
            if (this$seriesPrimaryImageTag == null ? other$seriesPrimaryImageTag != null : !this$seriesPrimaryImageTag.equals(other$seriesPrimaryImageTag)) {
                return false;
            }
            String this$albumArtist = this.getAlbumArtist();
            String other$albumArtist = other.getAlbumArtist();
            if (this$albumArtist == null ? other$albumArtist != null : !this$albumArtist.equals(other$albumArtist)) {
                return false;
            }
            List<NameIdPair> this$albumArtists = this.getAlbumArtists();
            List<NameIdPair> other$albumArtists = other.getAlbumArtists();
            if (this$albumArtists == null ? other$albumArtists != null : !((Object)this$albumArtists).equals(other$albumArtists)) {
                return false;
            }
            String this$seasonName = this.getSeasonName();
            String other$seasonName = other.getSeasonName();
            if (this$seasonName == null ? other$seasonName != null : !this$seasonName.equals(other$seasonName)) {
                return false;
            }
            List<MediaStream> this$mediaStreams = this.getMediaStreams();
            List<MediaStream> other$mediaStreams = other.getMediaStreams();
            if (this$mediaStreams == null ? other$mediaStreams != null : !((Object)this$mediaStreams).equals(other$mediaStreams)) {
                return false;
            }
            Map<String, String> this$imageTags = this.getImageTags();
            Map<String, String> other$imageTags = other.getImageTags();
            if (this$imageTags == null ? other$imageTags != null : !((Object)this$imageTags).equals(other$imageTags)) {
                return false;
            }
            List<String> this$backdropImageTags = this.getBackdropImageTags();
            List<String> other$backdropImageTags = other.getBackdropImageTags();
            if (this$backdropImageTags == null ? other$backdropImageTags != null : !((Object)this$backdropImageTags).equals(other$backdropImageTags)) {
                return false;
            }
            String this$parentLogoImageTag = this.getParentLogoImageTag();
            String other$parentLogoImageTag = other.getParentLogoImageTag();
            if (this$parentLogoImageTag == null ? other$parentLogoImageTag != null : !this$parentLogoImageTag.equals(other$parentLogoImageTag)) {
                return false;
            }
            String this$seriesStudio = this.getSeriesStudio();
            String string = other.getSeriesStudio();
            if (this$seriesStudio == null ? other$seriesStudio != null : !this$seriesStudio.equals(other$seriesStudio)) {
                return false;
            }
            String string2 = this.getPrimaryImageItemId();
            String string3 = other.getPrimaryImageItemId();
            if (this$primaryImageItemId == null ? other$primaryImageItemId != null : !this$primaryImageItemId.equals(other$primaryImageItemId)) {
                return false;
            }
            String string4 = this.getPrimaryImageTag();
            String string5 = other.getPrimaryImageTag();
            if (this$primaryImageTag == null ? other$primaryImageTag != null : !this$primaryImageTag.equals(other$primaryImageTag)) {
                return false;
            }
            String string6 = this.getParentThumbItemId();
            String string7 = other.getParentThumbItemId();
            if (this$parentThumbItemId == null ? other$parentThumbItemId != null : !this$parentThumbItemId.equals(other$parentThumbItemId)) {
                return false;
            }
            String string8 = this.getParentThumbImageTag();
            String string9 = other.getParentThumbImageTag();
            if (this$parentThumbImageTag == null ? other$parentThumbImageTag != null : !this$parentThumbImageTag.equals(other$parentThumbImageTag)) {
                return false;
            }
            List<ChapterInfo> list = this.getChapters();
            List<ChapterInfo> list2 = other.getChapters();
            if (this$chapters == null ? other$chapters != null : !this$chapters.equals(other$chapters)) {
                return false;
            }
            LocationType locationType = this.getLocationType();
            LocationType locationType2 = other.getLocationType();
            if (this$locationType == null ? other$locationType != null : !this$locationType.equals(other$locationType)) {
                return false;
            }
            String string10 = this.getMediaType();
            String string11 = other.getMediaType();
            if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
                return false;
            }
            OffsetDateTime offsetDateTime = this.getEndDate();
            OffsetDateTime offsetDateTime2 = other.getEndDate();
            if (this$endDate == null ? other$endDate != null : !this$endDate.equals(other$endDate)) {
                return false;
            }
            List<MetadataFields> list3 = this.getLockedFields();
            List<MetadataFields> list4 = other.getLockedFields();
            if (this$lockedFields == null ? other$lockedFields != null : !this$lockedFields.equals(other$lockedFields)) {
                return false;
            }
            String string12 = this.getCameraMake();
            String string13 = other.getCameraMake();
            if (this$cameraMake == null ? other$cameraMake != null : !this$cameraMake.equals(other$cameraMake)) {
                return false;
            }
            String string14 = this.getCameraModel();
            String string15 = other.getCameraModel();
            if (this$cameraModel == null ? other$cameraModel != null : !this$cameraModel.equals(other$cameraModel)) {
                return false;
            }
            String string16 = this.getSoftware();
            String string17 = other.getSoftware();
            if (this$software == null ? other$software != null : !this$software.equals(other$software)) {
                return false;
            }
            DrawingImageOrientation drawingImageOrientation = this.getImageOrientation();
            DrawingImageOrientation drawingImageOrientation2 = other.getImageOrientation();
            if (this$imageOrientation == null ? other$imageOrientation != null : !this$imageOrientation.equals(other$imageOrientation)) {
                return false;
            }
            String string18 = this.getSeriesTimerId();
            String string19 = other.getSeriesTimerId();
            if (this$seriesTimerId == null ? other$seriesTimerId != null : !this$seriesTimerId.equals(other$seriesTimerId)) {
                return false;
            }
            String string20 = this.getChannelPrimaryImageTag();
            String string21 = other.getChannelPrimaryImageTag();
            if (this$channelPrimaryImageTag == null ? other$channelPrimaryImageTag != null : !this$channelPrimaryImageTag.equals(other$channelPrimaryImageTag)) {
                return false;
            }
            OffsetDateTime offsetDateTime3 = this.getStartDate();
            OffsetDateTime offsetDateTime4 = other.getStartDate();
            if (this$startDate == null ? other$startDate != null : !this$startDate.equals(other$startDate)) {
                return false;
            }
            String string22 = this.getEpisodeTitle();
            String string23 = other.getEpisodeTitle();
            if (this$episodeTitle == null ? other$episodeTitle != null : !this$episodeTitle.equals(other$episodeTitle)) {
                return false;
            }
            LiveTvTimerType liveTvTimerType = this.getTimerType();
            LiveTvTimerType liveTvTimerType2 = other.getTimerType();
            if (this$timerType == null ? other$timerType != null : !this$timerType.equals(other$timerType)) {
                return false;
            }
            String string24 = this.getManagementId();
            String string25 = other.getManagementId();
            if (this$managementId == null ? other$managementId != null : !this$managementId.equals(other$managementId)) {
                return false;
            }
            String string26 = this.getTimerId();
            String string27 = other.getTimerId();
            if (this$timerId == null ? other$timerId != null : !this$timerId.equals(other$timerId)) {
                return false;
            }
            BaseItemDto baseItemDto = this.getCurrentProgram();
            BaseItemDto baseItemDto2 = other.getCurrentProgram();
            if (this$currentProgram == null ? other$currentProgram != null : !this$currentProgram.equals(other$currentProgram)) {
                return false;
            }
            List<String> list5 = this.getSubviews();
            List<String> list6 = other.getSubviews();
            if (this$subviews == null ? other$subviews != null : !this$subviews.equals(other$subviews)) {
                return false;
            }
            String string28 = this.getListingsProviderId();
            String string29 = other.getListingsProviderId();
            if (this$listingsProviderId == null ? other$listingsProviderId != null : !this$listingsProviderId.equals(other$listingsProviderId)) {
                return false;
            }
            String string30 = this.getListingsChannelId();
            String string31 = other.getListingsChannelId();
            if (this$listingsChannelId == null ? other$listingsChannelId != null : !this$listingsChannelId.equals(other$listingsChannelId)) {
                return false;
            }
            String string32 = this.getListingsPath();
            String string33 = other.getListingsPath();
            if (this$listingsPath == null ? other$listingsPath != null : !this$listingsPath.equals(other$listingsPath)) {
                return false;
            }
            String string34 = this.getListingsId();
            String string35 = other.getListingsId();
            if (this$listingsId == null ? other$listingsId != null : !this$listingsId.equals(other$listingsId)) {
                return false;
            }
            String string36 = this.getListingsChannelName();
            String string37 = other.getListingsChannelName();
            if (this$listingsChannelName == null ? other$listingsChannelName != null : !this$listingsChannelName.equals(other$listingsChannelName)) {
                return false;
            }
            String string38 = this.getListingsChannelNumber();
            String string39 = other.getListingsChannelNumber();
            if (this$listingsChannelNumber == null ? other$listingsChannelNumber != null : !this$listingsChannelNumber.equals(other$listingsChannelNumber)) {
                return false;
            }
            String string40 = this.getAffiliateCallSign();
            String string41 = other.getAffiliateCallSign();
            if (this$affiliateCallSign == null ? other$affiliateCallSign != null : !this$affiliateCallSign.equals(other$affiliateCallSign)) {
                return false;
            }
            String string42 = this.getImageUrl();
            String string43 = other.getImageUrl();
            if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) {
                return false;
            }
            String string44 = this.getFilmTitle();
            String string45 = other.getFilmTitle();
            if (this$filmTitle == null ? other$filmTitle != null : !this$filmTitle.equals(other$filmTitle)) {
                return false;
            }
            String string46 = this.getPrimaryImageAspectRatioCount();
            String string47 = other.getPrimaryImageAspectRatioCount();
            if (this$primaryImageAspectRatioCount == null ? other$primaryImageAspectRatioCount != null : !this$primaryImageAspectRatioCount.equals(other$primaryImageAspectRatioCount)) {
                return false;
            }
            String string48 = this.getEmbyItemUrl();
            String string49 = other.getEmbyItemUrl();
            if (this$embyItemUrl == null ? other$embyItemUrl != null : !this$embyItemUrl.equals(other$embyItemUrl)) {
                return false;
            }
            String string50 = this.getBackdropImageUrl();
            String string51 = other.getBackdropImageUrl();
            return !(this$backdropImageUrl == null ? other$backdropImageUrl != null : !this$backdropImageUrl.equals(other$backdropImageUrl));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof ItemsDTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Integer $sortIndexNumber = this.getSortIndexNumber();
            result = result * 59 + ($sortIndexNumber == null ? 43 : ((Object)$sortIndexNumber).hashCode());
            Integer $sortParentIndexNumber = this.getSortParentIndexNumber();
            result = result * 59 + ($sortParentIndexNumber == null ? 43 : ((Object)$sortParentIndexNumber).hashCode());
            Boolean $canDelete = this.getCanDelete();
            result = result * 59 + ($canDelete == null ? 43 : ((Object)$canDelete).hashCode());
            Boolean $canDownload = this.getCanDownload();
            result = result * 59 + ($canDownload == null ? 43 : ((Object)$canDownload).hashCode());
            Boolean $canEditItems = this.getCanEditItems();
            result = result * 59 + ($canEditItems == null ? 43 : ((Object)$canEditItems).hashCode());
            Boolean $supportsResume = this.getSupportsResume();
            result = result * 59 + ($supportsResume == null ? 43 : ((Object)$supportsResume).hashCode());
            Boolean $supportsSync = this.getSupportsSync();
            result = result * 59 + ($supportsSync == null ? 43 : ((Object)$supportsSync).hashCode());
            Boolean $canManageAccess = this.getCanManageAccess();
            result = result * 59 + ($canManageAccess == null ? 43 : ((Object)$canManageAccess).hashCode());
            Boolean $canLeaveContent = this.getCanLeaveContent();
            result = result * 59 + ($canLeaveContent == null ? 43 : ((Object)$canLeaveContent).hashCode());
            Boolean $canMakePublic = this.getCanMakePublic();
            result = result * 59 + ($canMakePublic == null ? 43 : ((Object)$canMakePublic).hashCode());
            Float $criticRating = this.getCriticRating();
            result = result * 59 + ($criticRating == null ? 43 : ((Object)$criticRating).hashCode());
            Long $gameSystemId = this.getGameSystemId();
            result = result * 59 + ($gameSystemId == null ? 43 : ((Object)$gameSystemId).hashCode());
            Boolean $asSeries = this.getAsSeries();
            result = result * 59 + ($asSeries == null ? 43 : ((Object)$asSeries).hashCode());
            Float $communityRating = this.getCommunityRating();
            result = result * 59 + ($communityRating == null ? 43 : ((Object)$communityRating).hashCode());
            Long $runTimeTicks = this.getRunTimeTicks();
            result = result * 59 + ($runTimeTicks == null ? 43 : ((Object)$runTimeTicks).hashCode());
            Long $size = this.getSize();
            result = result * 59 + ($size == null ? 43 : ((Object)$size).hashCode());
            Integer $bitrate = this.getBitrate();
            result = result * 59 + ($bitrate == null ? 43 : ((Object)$bitrate).hashCode());
            Integer $productionYear = this.getProductionYear();
            result = result * 59 + ($productionYear == null ? 43 : ((Object)$productionYear).hashCode());
            Integer $indexNumber = this.getIndexNumber();
            result = result * 59 + ($indexNumber == null ? 43 : ((Object)$indexNumber).hashCode());
            Integer $indexNumberEnd = this.getIndexNumberEnd();
            result = result * 59 + ($indexNumberEnd == null ? 43 : ((Object)$indexNumberEnd).hashCode());
            Integer $parentIndexNumber = this.getParentIndexNumber();
            result = result * 59 + ($parentIndexNumber == null ? 43 : ((Object)$parentIndexNumber).hashCode());
            Boolean $isFolder = this.getIsFolder();
            result = result * 59 + ($isFolder == null ? 43 : ((Object)$isFolder).hashCode());
            Integer $localTrailerCount = this.getLocalTrailerCount();
            result = result * 59 + ($localTrailerCount == null ? 43 : ((Object)$localTrailerCount).hashCode());
            Integer $recursiveItemCount = this.getRecursiveItemCount();
            result = result * 59 + ($recursiveItemCount == null ? 43 : ((Object)$recursiveItemCount).hashCode());
            Integer $childCount = this.getChildCount();
            result = result * 59 + ($childCount == null ? 43 : ((Object)$childCount).hashCode());
            Integer $seasonCount = this.getSeasonCount();
            result = result * 59 + ($seasonCount == null ? 43 : ((Object)$seasonCount).hashCode());
            Integer $specialFeatureCount = this.getSpecialFeatureCount();
            result = result * 59 + ($specialFeatureCount == null ? 43 : ((Object)$specialFeatureCount).hashCode());
            Double $primaryImageAspectRatio = this.getPrimaryImageAspectRatio();
            result = result * 59 + ($primaryImageAspectRatio == null ? 43 : ((Object)$primaryImageAspectRatio).hashCode());
            Integer $partCount = this.getPartCount();
            result = result * 59 + ($partCount == null ? 43 : ((Object)$partCount).hashCode());
            Boolean $lockData = this.getLockData();
            result = result * 59 + ($lockData == null ? 43 : ((Object)$lockData).hashCode());
            Integer $width = this.getWidth();
            result = result * 59 + ($width == null ? 43 : ((Object)$width).hashCode());
            Integer $height = this.getHeight();
            result = result * 59 + ($height == null ? 43 : ((Object)$height).hashCode());
            Double $exposureTime = this.getExposureTime();
            result = result * 59 + ($exposureTime == null ? 43 : ((Object)$exposureTime).hashCode());
            Double $focalLength = this.getFocalLength();
            result = result * 59 + ($focalLength == null ? 43 : ((Object)$focalLength).hashCode());
            Double $aperture = this.getAperture();
            result = result * 59 + ($aperture == null ? 43 : ((Object)$aperture).hashCode());
            Double $shutterSpeed = this.getShutterSpeed();
            result = result * 59 + ($shutterSpeed == null ? 43 : ((Object)$shutterSpeed).hashCode());
            Double $latitude = this.getLatitude();
            result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
            Double $longitude = this.getLongitude();
            result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
            Double $altitude = this.getAltitude();
            result = result * 59 + ($altitude == null ? 43 : ((Object)$altitude).hashCode());
            Integer $isoSpeedRating = this.getIsoSpeedRating();
            result = result * 59 + ($isoSpeedRating == null ? 43 : ((Object)$isoSpeedRating).hashCode());
            Double $completionPercentage = this.getCompletionPercentage();
            result = result * 59 + ($completionPercentage == null ? 43 : ((Object)$completionPercentage).hashCode());
            Boolean $isRepeat = this.getIsRepeat();
            result = result * 59 + ($isRepeat == null ? 43 : ((Object)$isRepeat).hashCode());
            Boolean $isNew = this.getIsNew();
            result = result * 59 + ($isNew == null ? 43 : ((Object)$isNew).hashCode());
            Boolean $isMovie = this.getIsMovie();
            result = result * 59 + ($isMovie == null ? 43 : ((Object)$isMovie).hashCode());
            Boolean $isSports = this.getIsSports();
            result = result * 59 + ($isSports == null ? 43 : ((Object)$isSports).hashCode());
            Boolean $isSeries = this.getIsSeries();
            result = result * 59 + ($isSeries == null ? 43 : ((Object)$isSeries).hashCode());
            Boolean $isLive = this.getIsLive();
            result = result * 59 + ($isLive == null ? 43 : ((Object)$isLive).hashCode());
            Boolean $isNews = this.getIsNews();
            result = result * 59 + ($isNews == null ? 43 : ((Object)$isNews).hashCode());
            Boolean $isKids = this.getIsKids();
            result = result * 59 + ($isKids == null ? 43 : ((Object)$isKids).hashCode());
            Boolean $isPremiere = this.getIsPremiere();
            result = result * 59 + ($isPremiere == null ? 43 : ((Object)$isPremiere).hashCode());
            Boolean $disabled = this.getDisabled();
            result = result * 59 + ($disabled == null ? 43 : ((Object)$disabled).hashCode());
            Integer $movieCount = this.getMovieCount();
            result = result * 59 + ($movieCount == null ? 43 : ((Object)$movieCount).hashCode());
            Integer $seriesCount = this.getSeriesCount();
            result = result * 59 + ($seriesCount == null ? 43 : ((Object)$seriesCount).hashCode());
            Integer $albumCount = this.getAlbumCount();
            result = result * 59 + ($albumCount == null ? 43 : ((Object)$albumCount).hashCode());
            Integer $songCount = this.getSongCount();
            result = result * 59 + ($songCount == null ? 43 : ((Object)$songCount).hashCode());
            Integer $musicVideoCount = this.getMusicVideoCount();
            result = result * 59 + ($musicVideoCount == null ? 43 : ((Object)$musicVideoCount).hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            String $originalTitle = this.getOriginalTitle();
            result = result * 59 + ($originalTitle == null ? 43 : $originalTitle.hashCode());
            String $serverId = this.getServerId();
            result = result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
            String $id = this.getId();
            result = result * 59 + ($id == null ? 43 : $id.hashCode());
            String $guid = this.getGuid();
            result = result * 59 + ($guid == null ? 43 : $guid.hashCode());
            String $etag = this.getEtag();
            result = result * 59 + ($etag == null ? 43 : $etag.hashCode());
            String $prefix = this.getPrefix();
            result = result * 59 + ($prefix == null ? 43 : $prefix.hashCode());
            String $tunerName = this.getTunerName();
            result = result * 59 + ($tunerName == null ? 43 : $tunerName.hashCode());
            String $playlistItemId = this.getPlaylistItemId();
            result = result * 59 + ($playlistItemId == null ? 43 : $playlistItemId.hashCode());
            OffsetDateTime $dateCreated = this.getDateCreated();
            result = result * 59 + ($dateCreated == null ? 43 : ((Object)$dateCreated).hashCode());
            String $extraType = this.getExtraType();
            result = result * 59 + ($extraType == null ? 43 : $extraType.hashCode());
            String $presentationUniqueKey = this.getPresentationUniqueKey();
            result = result * 59 + ($presentationUniqueKey == null ? 43 : $presentationUniqueKey.hashCode());
            String $preferredMetadataLanguage = this.getPreferredMetadataLanguage();
            result = result * 59 + ($preferredMetadataLanguage == null ? 43 : $preferredMetadataLanguage.hashCode());
            String $preferredMetadataCountryCode = this.getPreferredMetadataCountryCode();
            result = result * 59 + ($preferredMetadataCountryCode == null ? 43 : $preferredMetadataCountryCode.hashCode());
            SyncJobItemStatus $syncStatus = this.getSyncStatus();
            result = result * 59 + ($syncStatus == null ? 43 : $syncStatus.hashCode());
            String $container = this.getContainer();
            result = result * 59 + ($container == null ? 43 : $container.hashCode());
            String $sortName = this.getSortName();
            result = result * 59 + ($sortName == null ? 43 : $sortName.hashCode());
            String $forcedSortName = this.getForcedSortName();
            result = result * 59 + ($forcedSortName == null ? 43 : $forcedSortName.hashCode());
            Video3DFormat $video3DFormat = this.getVideo3DFormat();
            result = result * 59 + ($video3DFormat == null ? 43 : $video3DFormat.hashCode());
            OffsetDateTime $premiereDate = this.getPremiereDate();
            result = result * 59 + ($premiereDate == null ? 43 : ((Object)$premiereDate).hashCode());
            List<ExternalUrl> $externalUrls = this.getExternalUrls();
            result = result * 59 + ($externalUrls == null ? 43 : ((Object)$externalUrls).hashCode());
            List<MediaSourceInfo> $mediaSources = this.getMediaSources();
            result = result * 59 + ($mediaSources == null ? 43 : ((Object)$mediaSources).hashCode());
            String $gameSystem = this.getGameSystem();
            result = result * 59 + ($gameSystem == null ? 43 : $gameSystem.hashCode());
            List<String> $productionLocations = this.getProductionLocations();
            result = result * 59 + ($productionLocations == null ? 43 : ((Object)$productionLocations).hashCode());
            String $path = this.getPath();
            result = result * 59 + ($path == null ? 43 : $path.hashCode());
            String $officialRating = this.getOfficialRating();
            result = result * 59 + ($officialRating == null ? 43 : $officialRating.hashCode());
            String $customRating = this.getCustomRating();
            result = result * 59 + ($customRating == null ? 43 : $customRating.hashCode());
            String $channelId = this.getChannelId();
            result = result * 59 + ($channelId == null ? 43 : $channelId.hashCode());
            String $channelName = this.getChannelName();
            result = result * 59 + ($channelName == null ? 43 : $channelName.hashCode());
            String $overview = this.getOverview();
            result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
            List<String> $taglines = this.getTaglines();
            result = result * 59 + ($taglines == null ? 43 : ((Object)$taglines).hashCode());
            List<String> $genres = this.getGenres();
            result = result * 59 + ($genres == null ? 43 : ((Object)$genres).hashCode());
            String $fileName = this.getFileName();
            result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
            String $number = this.getNumber();
            result = result * 59 + ($number == null ? 43 : $number.hashCode());
            String $channelNumber = this.getChannelNumber();
            result = result * 59 + ($channelNumber == null ? 43 : $channelNumber.hashCode());
            List<MediaUrl> $remoteTrailers = this.getRemoteTrailers();
            result = result * 59 + ($remoteTrailers == null ? 43 : ((Object)$remoteTrailers).hashCode());
            ProviderIdDictionary $providerIds = this.getProviderIds();
            result = result * 59 + ($providerIds == null ? 43 : $providerIds.hashCode());
            String $parentId = this.getParentId();
            result = result * 59 + ($parentId == null ? 43 : $parentId.hashCode());
            String $type = this.getType();
            result = result * 59 + ($type == null ? 43 : $type.hashCode());
            List<BaseItemPerson> $people = this.getPeople();
            result = result * 59 + ($people == null ? 43 : ((Object)$people).hashCode());
            List<NameLongIdPair> $studios = this.getStudios();
            result = result * 59 + ($studios == null ? 43 : ((Object)$studios).hashCode());
            List<NameLongIdPair> $genreItems = this.getGenreItems();
            result = result * 59 + ($genreItems == null ? 43 : ((Object)$genreItems).hashCode());
            List<NameLongIdPair> $tagItems = this.getTagItems();
            result = result * 59 + ($tagItems == null ? 43 : ((Object)$tagItems).hashCode());
            String $parentLogoItemId = this.getParentLogoItemId();
            result = result * 59 + ($parentLogoItemId == null ? 43 : $parentLogoItemId.hashCode());
            String $parentBackdropItemId = this.getParentBackdropItemId();
            result = result * 59 + ($parentBackdropItemId == null ? 43 : $parentBackdropItemId.hashCode());
            List<String> $parentBackdropImageTags = this.getParentBackdropImageTags();
            result = result * 59 + ($parentBackdropImageTags == null ? 43 : ((Object)$parentBackdropImageTags).hashCode());
            UserItemDataDto $userData = this.getUserData();
            result = result * 59 + ($userData == null ? 43 : $userData.hashCode());
            String $seriesName = this.getSeriesName();
            result = result * 59 + ($seriesName == null ? 43 : $seriesName.hashCode());
            String $seriesId = this.getSeriesId();
            result = result * 59 + ($seriesId == null ? 43 : $seriesId.hashCode());
            String $seasonId = this.getSeasonId();
            result = result * 59 + ($seasonId == null ? 43 : $seasonId.hashCode());
            String $displayPreferencesId = this.getDisplayPreferencesId();
            result = result * 59 + ($displayPreferencesId == null ? 43 : $displayPreferencesId.hashCode());
            String $status = this.getStatus();
            result = result * 59 + ($status == null ? 43 : $status.hashCode());
            List<DayOfWeek> $airDays = this.getAirDays();
            result = result * 59 + ($airDays == null ? 43 : ((Object)$airDays).hashCode());
            List<String> $tags = this.getTags();
            result = result * 59 + ($tags == null ? 43 : ((Object)$tags).hashCode());
            List<String> $artists = this.getArtists();
            result = result * 59 + ($artists == null ? 43 : ((Object)$artists).hashCode());
            List<NameIdPair> $artistItems = this.getArtistItems();
            result = result * 59 + ($artistItems == null ? 43 : ((Object)$artistItems).hashCode());
            List<NameIdPair> $composers = this.getComposers();
            result = result * 59 + ($composers == null ? 43 : ((Object)$composers).hashCode());
            String $album = this.getAlbum();
            result = result * 59 + ($album == null ? 43 : $album.hashCode());
            String $collectionType = this.getCollectionType();
            result = result * 59 + ($collectionType == null ? 43 : $collectionType.hashCode());
            String $displayOrder = this.getDisplayOrder();
            result = result * 59 + ($displayOrder == null ? 43 : $displayOrder.hashCode());
            String $albumId = this.getAlbumId();
            result = result * 59 + ($albumId == null ? 43 : $albumId.hashCode());
            String $albumPrimaryImageTag = this.getAlbumPrimaryImageTag();
            result = result * 59 + ($albumPrimaryImageTag == null ? 43 : $albumPrimaryImageTag.hashCode());
            String $seriesPrimaryImageTag = this.getSeriesPrimaryImageTag();
            result = result * 59 + ($seriesPrimaryImageTag == null ? 43 : $seriesPrimaryImageTag.hashCode());
            String $albumArtist = this.getAlbumArtist();
            result = result * 59 + ($albumArtist == null ? 43 : $albumArtist.hashCode());
            List<NameIdPair> $albumArtists = this.getAlbumArtists();
            result = result * 59 + ($albumArtists == null ? 43 : ((Object)$albumArtists).hashCode());
            String $seasonName = this.getSeasonName();
            result = result * 59 + ($seasonName == null ? 43 : $seasonName.hashCode());
            List<MediaStream> $mediaStreams = this.getMediaStreams();
            result = result * 59 + ($mediaStreams == null ? 43 : ((Object)$mediaStreams).hashCode());
            Map<String, String> $imageTags = this.getImageTags();
            result = result * 59 + ($imageTags == null ? 43 : ((Object)$imageTags).hashCode());
            List<String> $backdropImageTags = this.getBackdropImageTags();
            result = result * 59 + ($backdropImageTags == null ? 43 : ((Object)$backdropImageTags).hashCode());
            String $parentLogoImageTag = this.getParentLogoImageTag();
            result = result * 59 + ($parentLogoImageTag == null ? 43 : $parentLogoImageTag.hashCode());
            String $seriesStudio = this.getSeriesStudio();
            result = result * 59 + ($seriesStudio == null ? 43 : $seriesStudio.hashCode());
            String $primaryImageItemId = this.getPrimaryImageItemId();
            result = result * 59 + ($primaryImageItemId == null ? 43 : $primaryImageItemId.hashCode());
            String $primaryImageTag = this.getPrimaryImageTag();
            result = result * 59 + ($primaryImageTag == null ? 43 : $primaryImageTag.hashCode());
            String $parentThumbItemId = this.getParentThumbItemId();
            result = result * 59 + ($parentThumbItemId == null ? 43 : $parentThumbItemId.hashCode());
            String $parentThumbImageTag = this.getParentThumbImageTag();
            result = result * 59 + ($parentThumbImageTag == null ? 43 : $parentThumbImageTag.hashCode());
            List<ChapterInfo> $chapters = this.getChapters();
            result = result * 59 + ($chapters == null ? 43 : ((Object)$chapters).hashCode());
            LocationType $locationType = this.getLocationType();
            result = result * 59 + ($locationType == null ? 43 : $locationType.hashCode());
            String $mediaType = this.getMediaType();
            result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
            OffsetDateTime $endDate = this.getEndDate();
            result = result * 59 + ($endDate == null ? 43 : ((Object)$endDate).hashCode());
            List<MetadataFields> $lockedFields = this.getLockedFields();
            result = result * 59 + ($lockedFields == null ? 43 : ((Object)$lockedFields).hashCode());
            String $cameraMake = this.getCameraMake();
            result = result * 59 + ($cameraMake == null ? 43 : $cameraMake.hashCode());
            String $cameraModel = this.getCameraModel();
            result = result * 59 + ($cameraModel == null ? 43 : $cameraModel.hashCode());
            String $software = this.getSoftware();
            result = result * 59 + ($software == null ? 43 : $software.hashCode());
            DrawingImageOrientation $imageOrientation = this.getImageOrientation();
            result = result * 59 + ($imageOrientation == null ? 43 : $imageOrientation.hashCode());
            String $seriesTimerId = this.getSeriesTimerId();
            result = result * 59 + ($seriesTimerId == null ? 43 : $seriesTimerId.hashCode());
            String $channelPrimaryImageTag = this.getChannelPrimaryImageTag();
            result = result * 59 + ($channelPrimaryImageTag == null ? 43 : $channelPrimaryImageTag.hashCode());
            OffsetDateTime $startDate = this.getStartDate();
            result = result * 59 + ($startDate == null ? 43 : ((Object)$startDate).hashCode());
            String $episodeTitle = this.getEpisodeTitle();
            result = result * 59 + ($episodeTitle == null ? 43 : $episodeTitle.hashCode());
            LiveTvTimerType $timerType = this.getTimerType();
            result = result * 59 + ($timerType == null ? 43 : $timerType.hashCode());
            String $managementId = this.getManagementId();
            result = result * 59 + ($managementId == null ? 43 : $managementId.hashCode());
            String $timerId = this.getTimerId();
            result = result * 59 + ($timerId == null ? 43 : $timerId.hashCode());
            BaseItemDto $currentProgram = this.getCurrentProgram();
            result = result * 59 + ($currentProgram == null ? 43 : $currentProgram.hashCode());
            List<String> $subviews = this.getSubviews();
            result = result * 59 + ($subviews == null ? 43 : ((Object)$subviews).hashCode());
            String $listingsProviderId = this.getListingsProviderId();
            result = result * 59 + ($listingsProviderId == null ? 43 : $listingsProviderId.hashCode());
            String $listingsChannelId = this.getListingsChannelId();
            result = result * 59 + ($listingsChannelId == null ? 43 : $listingsChannelId.hashCode());
            String $listingsPath = this.getListingsPath();
            result = result * 59 + ($listingsPath == null ? 43 : $listingsPath.hashCode());
            String $listingsId = this.getListingsId();
            result = result * 59 + ($listingsId == null ? 43 : $listingsId.hashCode());
            String $listingsChannelName = this.getListingsChannelName();
            result = result * 59 + ($listingsChannelName == null ? 43 : $listingsChannelName.hashCode());
            String $listingsChannelNumber = this.getListingsChannelNumber();
            result = result * 59 + ($listingsChannelNumber == null ? 43 : $listingsChannelNumber.hashCode());
            String $affiliateCallSign = this.getAffiliateCallSign();
            result = result * 59 + ($affiliateCallSign == null ? 43 : $affiliateCallSign.hashCode());
            String $imageUrl = this.getImageUrl();
            result = result * 59 + ($imageUrl == null ? 43 : $imageUrl.hashCode());
            String $filmTitle = this.getFilmTitle();
            result = result * 59 + ($filmTitle == null ? 43 : $filmTitle.hashCode());
            String $primaryImageAspectRatioCount = this.getPrimaryImageAspectRatioCount();
            result = result * 59 + ($primaryImageAspectRatioCount == null ? 43 : $primaryImageAspectRatioCount.hashCode());
            String $embyItemUrl = this.getEmbyItemUrl();
            result = result * 59 + ($embyItemUrl == null ? 43 : $embyItemUrl.hashCode());
            String $backdropImageUrl = this.getBackdropImageUrl();
            result = result * 59 + ($backdropImageUrl == null ? 43 : $backdropImageUrl.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "QueryResultBaseItemResponse.ItemsDTO(name=" + this.getName() + ", originalTitle=" + this.getOriginalTitle() + ", serverId=" + this.getServerId() + ", id=" + this.getId() + ", guid=" + this.getGuid() + ", etag=" + this.getEtag() + ", prefix=" + this.getPrefix() + ", tunerName=" + this.getTunerName() + ", playlistItemId=" + this.getPlaylistItemId() + ", dateCreated=" + String.valueOf(this.getDateCreated()) + ", extraType=" + this.getExtraType() + ", sortIndexNumber=" + this.getSortIndexNumber() + ", sortParentIndexNumber=" + this.getSortParentIndexNumber() + ", canDelete=" + this.getCanDelete() + ", canDownload=" + this.getCanDownload() + ", canEditItems=" + this.getCanEditItems() + ", supportsResume=" + this.getSupportsResume() + ", presentationUniqueKey=" + this.getPresentationUniqueKey() + ", preferredMetadataLanguage=" + this.getPreferredMetadataLanguage() + ", preferredMetadataCountryCode=" + this.getPreferredMetadataCountryCode() + ", supportsSync=" + this.getSupportsSync() + ", syncStatus=" + String.valueOf(this.getSyncStatus()) + ", canManageAccess=" + this.getCanManageAccess() + ", canLeaveContent=" + this.getCanLeaveContent() + ", canMakePublic=" + this.getCanMakePublic() + ", container=" + this.getContainer() + ", sortName=" + this.getSortName() + ", forcedSortName=" + this.getForcedSortName() + ", video3DFormat=" + String.valueOf(this.getVideo3DFormat()) + ", premiereDate=" + String.valueOf(this.getPremiereDate()) + ", externalUrls=" + String.valueOf(this.getExternalUrls()) + ", mediaSources=" + String.valueOf(this.getMediaSources()) + ", criticRating=" + this.getCriticRating() + ", gameSystemId=" + this.getGameSystemId() + ", asSeries=" + this.getAsSeries() + ", gameSystem=" + this.getGameSystem() + ", productionLocations=" + String.valueOf(this.getProductionLocations()) + ", path=" + this.getPath() + ", officialRating=" + this.getOfficialRating() + ", customRating=" + this.getCustomRating() + ", channelId=" + this.getChannelId() + ", channelName=" + this.getChannelName() + ", overview=" + this.getOverview() + ", taglines=" + String.valueOf(this.getTaglines()) + ", genres=" + String.valueOf(this.getGenres()) + ", communityRating=" + this.getCommunityRating() + ", runTimeTicks=" + this.getRunTimeTicks() + ", size=" + this.getSize() + ", fileName=" + this.getFileName() + ", bitrate=" + this.getBitrate() + ", productionYear=" + this.getProductionYear() + ", number=" + this.getNumber() + ", channelNumber=" + this.getChannelNumber() + ", indexNumber=" + this.getIndexNumber() + ", indexNumberEnd=" + this.getIndexNumberEnd() + ", parentIndexNumber=" + this.getParentIndexNumber() + ", remoteTrailers=" + String.valueOf(this.getRemoteTrailers()) + ", providerIds=" + String.valueOf(this.getProviderIds()) + ", isFolder=" + this.getIsFolder() + ", parentId=" + this.getParentId() + ", type=" + this.getType() + ", people=" + String.valueOf(this.getPeople()) + ", studios=" + String.valueOf(this.getStudios()) + ", genreItems=" + String.valueOf(this.getGenreItems()) + ", tagItems=" + String.valueOf(this.getTagItems()) + ", parentLogoItemId=" + this.getParentLogoItemId() + ", parentBackdropItemId=" + this.getParentBackdropItemId() + ", parentBackdropImageTags=" + String.valueOf(this.getParentBackdropImageTags()) + ", localTrailerCount=" + this.getLocalTrailerCount() + ", userData=" + String.valueOf(this.getUserData()) + ", recursiveItemCount=" + this.getRecursiveItemCount() + ", childCount=" + this.getChildCount() + ", seasonCount=" + this.getSeasonCount() + ", seriesName=" + this.getSeriesName() + ", seriesId=" + this.getSeriesId() + ", seasonId=" + this.getSeasonId() + ", specialFeatureCount=" + this.getSpecialFeatureCount() + ", displayPreferencesId=" + this.getDisplayPreferencesId() + ", status=" + this.getStatus() + ", airDays=" + String.valueOf(this.getAirDays()) + ", tags=" + String.valueOf(this.getTags()) + ", primaryImageAspectRatio=" + this.getPrimaryImageAspectRatio() + ", artists=" + String.valueOf(this.getArtists()) + ", artistItems=" + String.valueOf(this.getArtistItems()) + ", composers=" + String.valueOf(this.getComposers()) + ", album=" + this.getAlbum() + ", collectionType=" + this.getCollectionType() + ", displayOrder=" + this.getDisplayOrder() + ", albumId=" + this.getAlbumId() + ", albumPrimaryImageTag=" + this.getAlbumPrimaryImageTag() + ", seriesPrimaryImageTag=" + this.getSeriesPrimaryImageTag() + ", albumArtist=" + this.getAlbumArtist() + ", albumArtists=" + String.valueOf(this.getAlbumArtists()) + ", seasonName=" + this.getSeasonName() + ", mediaStreams=" + String.valueOf(this.getMediaStreams()) + ", partCount=" + this.getPartCount() + ", imageTags=" + String.valueOf(this.getImageTags()) + ", backdropImageTags=" + String.valueOf(this.getBackdropImageTags()) + ", parentLogoImageTag=" + this.getParentLogoImageTag() + ", seriesStudio=" + (this.getSeriesStudio() + ", primaryImageItemId=" + this.getPrimaryImageItemId() + ", primaryImageTag=" + this.getPrimaryImageTag() + ", parentThumbItemId=" + this.getParentThumbItemId() + ", parentThumbImageTag=" + this.getParentThumbImageTag() + ", chapters=" + String.valueOf(this.getChapters()) + ", locationType=" + String.valueOf(this.getLocationType()) + ", mediaType=" + this.getMediaType() + ", endDate=" + String.valueOf(this.getEndDate()) + ", lockedFields=" + String.valueOf(this.getLockedFields()) + ", lockData=" + this.getLockData() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", cameraMake=" + this.getCameraMake() + ", cameraModel=" + this.getCameraModel() + ", software=" + this.getSoftware() + ", exposureTime=" + this.getExposureTime() + ", focalLength=" + this.getFocalLength() + ", imageOrientation=" + String.valueOf(this.getImageOrientation()) + ", aperture=" + this.getAperture() + ", shutterSpeed=" + this.getShutterSpeed() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", altitude=" + this.getAltitude() + ", isoSpeedRating=" + this.getIsoSpeedRating() + ", seriesTimerId=" + this.getSeriesTimerId() + ", channelPrimaryImageTag=" + this.getChannelPrimaryImageTag() + ", startDate=" + String.valueOf(this.getStartDate()) + ", completionPercentage=" + this.getCompletionPercentage() + ", isRepeat=" + this.getIsRepeat() + ", isNew=" + this.getIsNew() + ", episodeTitle=" + this.getEpisodeTitle() + ", isMovie=" + this.getIsMovie() + ", isSports=" + this.getIsSports() + ", isSeries=" + this.getIsSeries() + ", isLive=" + this.getIsLive() + ", isNews=" + this.getIsNews() + ", isKids=" + this.getIsKids() + ", isPremiere=" + this.getIsPremiere() + ", timerType=" + String.valueOf(this.getTimerType()) + ", disabled=" + this.getDisabled() + ", managementId=" + this.getManagementId() + ", timerId=" + this.getTimerId() + ", currentProgram=" + String.valueOf(this.getCurrentProgram()) + ", movieCount=" + this.getMovieCount() + ", seriesCount=" + this.getSeriesCount() + ", albumCount=" + this.getAlbumCount() + ", songCount=" + this.getSongCount() + ", musicVideoCount=" + this.getMusicVideoCount() + ", subviews=" + String.valueOf(this.getSubviews()) + ", listingsProviderId=" + this.getListingsProviderId() + ", listingsChannelId=" + this.getListingsChannelId() + ", listingsPath=" + this.getListingsPath() + ", listingsId=" + this.getListingsId() + ", listingsChannelName=" + this.getListingsChannelName() + ", listingsChannelNumber=" + this.getListingsChannelNumber() + ", affiliateCallSign=" + this.getAffiliateCallSign() + ", imageUrl=" + this.getImageUrl() + ", filmTitle=" + this.getFilmTitle() + ", primaryImageAspectRatioCount=" + this.getPrimaryImageAspectRatioCount() + ", embyItemUrl=" + this.getEmbyItemUrl() + ", backdropImageUrl=" + this.getBackdropImageUrl() + ")");
        }

        public static class ImageTagsDTO {
            private String primary;
            private String logo;

            @Generated
            public ImageTagsDTO() {
            }

            @Generated
            public String getPrimary() {
                return this.primary;
            }

            @Generated
            public String getLogo() {
                return this.logo;
            }

            @Generated
            public void setPrimary(String primary) {
                this.primary = primary;
            }

            @Generated
            public void setLogo(String logo) {
                this.logo = logo;
            }

            @Generated
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof ImageTagsDTO)) {
                    return false;
                }
                ImageTagsDTO other = (ImageTagsDTO)o;
                if (!other.canEqual(this)) {
                    return false;
                }
                String this$primary = this.getPrimary();
                String other$primary = other.getPrimary();
                if (this$primary == null ? other$primary != null : !this$primary.equals(other$primary)) {
                    return false;
                }
                String this$logo = this.getLogo();
                String other$logo = other.getLogo();
                return !(this$logo == null ? other$logo != null : !this$logo.equals(other$logo));
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof ImageTagsDTO;
            }

            @Generated
            public int hashCode() {
                int PRIME = 59;
                int result = 1;
                String $primary = this.getPrimary();
                result = result * 59 + ($primary == null ? 43 : $primary.hashCode());
                String $logo = this.getLogo();
                result = result * 59 + ($logo == null ? 43 : $logo.hashCode());
                return result;
            }

            @Generated
            public String toString() {
                return "QueryResultBaseItemResponse.ItemsDTO.ImageTagsDTO(primary=" + this.getPrimary() + ", logo=" + this.getLogo() + ")";
            }
        }
    }
}
