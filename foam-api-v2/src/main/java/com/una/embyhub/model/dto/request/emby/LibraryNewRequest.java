/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.emby;

import com.alibaba.fastjson2.JSONObject;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class LibraryNewRequest
implements Serializable {
    private String Title;
    private String Description;
    private String Date;
    private String Event;
    private ItemDTO Item;
    private ServerDTO Server;

    @Generated
    public LibraryNewRequest() {
    }

    @Generated
    public String getTitle() {
        return this.Title;
    }

    @Generated
    public String getDescription() {
        return this.Description;
    }

    @Generated
    public String getDate() {
        return this.Date;
    }

    @Generated
    public String getEvent() {
        return this.Event;
    }

    @Generated
    public ItemDTO getItem() {
        return this.Item;
    }

    @Generated
    public ServerDTO getServer() {
        return this.Server;
    }

    @Generated
    public void setTitle(String Title) {
        this.Title = Title;
    }

    @Generated
    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Generated
    public void setDate(String Date) {
        this.Date = Date;
    }

    @Generated
    public void setEvent(String Event) {
        this.Event = Event;
    }

    @Generated
    public void setItem(ItemDTO Item) {
        this.Item = Item;
    }

    @Generated
    public void setServer(ServerDTO Server) {
        this.Server = Server;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LibraryNewRequest)) {
            return false;
        }
        LibraryNewRequest other = (LibraryNewRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$Title = this.getTitle();
        String other$Title = other.getTitle();
        if (this$Title == null ? other$Title != null : !this$Title.equals(other$Title)) {
            return false;
        }
        String this$Description = this.getDescription();
        String other$Description = other.getDescription();
        if (this$Description == null ? other$Description != null : !this$Description.equals(other$Description)) {
            return false;
        }
        String this$Date = this.getDate();
        String other$Date = other.getDate();
        if (this$Date == null ? other$Date != null : !this$Date.equals(other$Date)) {
            return false;
        }
        String this$Event = this.getEvent();
        String other$Event = other.getEvent();
        if (this$Event == null ? other$Event != null : !this$Event.equals(other$Event)) {
            return false;
        }
        ItemDTO this$Item = this.getItem();
        ItemDTO other$Item = other.getItem();
        if (this$Item == null ? other$Item != null : !((Object)this$Item).equals(other$Item)) {
            return false;
        }
        ServerDTO this$Server = this.getServer();
        ServerDTO other$Server = other.getServer();
        return !(this$Server == null ? other$Server != null : !((Object)this$Server).equals(other$Server));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LibraryNewRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $Title = this.getTitle();
        result = result * 59 + ($Title == null ? 43 : $Title.hashCode());
        String $Description = this.getDescription();
        result = result * 59 + ($Description == null ? 43 : $Description.hashCode());
        String $Date = this.getDate();
        result = result * 59 + ($Date == null ? 43 : $Date.hashCode());
        String $Event = this.getEvent();
        result = result * 59 + ($Event == null ? 43 : $Event.hashCode());
        ItemDTO $Item = this.getItem();
        result = result * 59 + ($Item == null ? 43 : ((Object)$Item).hashCode());
        ServerDTO $Server = this.getServer();
        result = result * 59 + ($Server == null ? 43 : ((Object)$Server).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LibraryNewRequest(Title=" + this.getTitle() + ", Description=" + this.getDescription() + ", Date=" + this.getDate() + ", Event=" + this.getEvent() + ", Item=" + String.valueOf(this.getItem()) + ", Server=" + String.valueOf(this.getServer()) + ")";
    }

    public static class ItemDTO {
        private String Name;
        private String ServerId;
        private String Id;
        private String DateCreated;
        private String Container;
        private String SortName;
        private List<JSONObject> ExternalUrls;
        private String Path;
        private String Overview;
        private List<?> Taglines;
        private List<String> Genres;
        private Long RunTimeTicks;
        private Long Size = 0L;
        private String FileName;
        private Integer Bitrate;
        private Integer ProductionYear;
        private List<?> RemoteTrailers;
        private ProviderIdsDTO ProviderIds;
        private Boolean IsFolder;
        private String ParentId;
        private String Type;
        private List<?> Studios;
        private List<GenreItemsDTO> GenreItems;
        private List<?> TagItems;
        private Double PrimaryImageAspectRatio;
        private ImageTagsDTO ImageTags;
        private List<?> BackdropImageTags;
        private String MediaType;
        private Integer Width;
        private Integer Height;
        private String SeriesName;
        private String OriginalTitle;
        private String PremiereDate;
        private String SeasonName;
        private Integer IndexNumber;
        private Integer ParentIndexNumber;

        @Generated
        public ItemDTO() {
        }

        @Generated
        public String getName() {
            return this.Name;
        }

        @Generated
        public String getServerId() {
            return this.ServerId;
        }

        @Generated
        public String getId() {
            return this.Id;
        }

        @Generated
        public String getDateCreated() {
            return this.DateCreated;
        }

        @Generated
        public String getContainer() {
            return this.Container;
        }

        @Generated
        public String getSortName() {
            return this.SortName;
        }

        @Generated
        public List<JSONObject> getExternalUrls() {
            return this.ExternalUrls;
        }

        @Generated
        public String getPath() {
            return this.Path;
        }

        @Generated
        public String getOverview() {
            return this.Overview;
        }

        @Generated
        public List<?> getTaglines() {
            return this.Taglines;
        }

        @Generated
        public List<String> getGenres() {
            return this.Genres;
        }

        @Generated
        public Long getRunTimeTicks() {
            return this.RunTimeTicks;
        }

        @Generated
        public Long getSize() {
            return this.Size;
        }

        @Generated
        public String getFileName() {
            return this.FileName;
        }

        @Generated
        public Integer getBitrate() {
            return this.Bitrate;
        }

        @Generated
        public Integer getProductionYear() {
            return this.ProductionYear;
        }

        @Generated
        public List<?> getRemoteTrailers() {
            return this.RemoteTrailers;
        }

        @Generated
        public ProviderIdsDTO getProviderIds() {
            return this.ProviderIds;
        }

        @Generated
        public Boolean getIsFolder() {
            return this.IsFolder;
        }

        @Generated
        public String getParentId() {
            return this.ParentId;
        }

        @Generated
        public String getType() {
            return this.Type;
        }

        @Generated
        public List<?> getStudios() {
            return this.Studios;
        }

        @Generated
        public List<GenreItemsDTO> getGenreItems() {
            return this.GenreItems;
        }

        @Generated
        public List<?> getTagItems() {
            return this.TagItems;
        }

        @Generated
        public Double getPrimaryImageAspectRatio() {
            return this.PrimaryImageAspectRatio;
        }

        @Generated
        public ImageTagsDTO getImageTags() {
            return this.ImageTags;
        }

        @Generated
        public List<?> getBackdropImageTags() {
            return this.BackdropImageTags;
        }

        @Generated
        public String getMediaType() {
            return this.MediaType;
        }

        @Generated
        public Integer getWidth() {
            return this.Width;
        }

        @Generated
        public Integer getHeight() {
            return this.Height;
        }

        @Generated
        public String getSeriesName() {
            return this.SeriesName;
        }

        @Generated
        public String getOriginalTitle() {
            return this.OriginalTitle;
        }

        @Generated
        public String getPremiereDate() {
            return this.PremiereDate;
        }

        @Generated
        public String getSeasonName() {
            return this.SeasonName;
        }

        @Generated
        public Integer getIndexNumber() {
            return this.IndexNumber;
        }

        @Generated
        public Integer getParentIndexNumber() {
            return this.ParentIndexNumber;
        }

        @Generated
        public void setName(String Name) {
            this.Name = Name;
        }

        @Generated
        public void setServerId(String ServerId) {
            this.ServerId = ServerId;
        }

        @Generated
        public void setId(String Id) {
            this.Id = Id;
        }

        @Generated
        public void setDateCreated(String DateCreated) {
            this.DateCreated = DateCreated;
        }

        @Generated
        public void setContainer(String Container) {
            this.Container = Container;
        }

        @Generated
        public void setSortName(String SortName) {
            this.SortName = SortName;
        }

        @Generated
        public void setExternalUrls(List<JSONObject> ExternalUrls) {
            this.ExternalUrls = ExternalUrls;
        }

        @Generated
        public void setPath(String Path) {
            this.Path = Path;
        }

        @Generated
        public void setOverview(String Overview) {
            this.Overview = Overview;
        }

        @Generated
        public void setTaglines(List<?> Taglines) {
            this.Taglines = Taglines;
        }

        @Generated
        public void setGenres(List<String> Genres) {
            this.Genres = Genres;
        }

        @Generated
        public void setRunTimeTicks(Long RunTimeTicks) {
            this.RunTimeTicks = RunTimeTicks;
        }

        @Generated
        public void setSize(Long Size) {
            this.Size = Size;
        }

        @Generated
        public void setFileName(String FileName) {
            this.FileName = FileName;
        }

        @Generated
        public void setBitrate(Integer Bitrate) {
            this.Bitrate = Bitrate;
        }

        @Generated
        public void setProductionYear(Integer ProductionYear) {
            this.ProductionYear = ProductionYear;
        }

        @Generated
        public void setRemoteTrailers(List<?> RemoteTrailers) {
            this.RemoteTrailers = RemoteTrailers;
        }

        @Generated
        public void setProviderIds(ProviderIdsDTO ProviderIds) {
            this.ProviderIds = ProviderIds;
        }

        @Generated
        public void setIsFolder(Boolean IsFolder) {
            this.IsFolder = IsFolder;
        }

        @Generated
        public void setParentId(String ParentId) {
            this.ParentId = ParentId;
        }

        @Generated
        public void setType(String Type) {
            this.Type = Type;
        }

        @Generated
        public void setStudios(List<?> Studios) {
            this.Studios = Studios;
        }

        @Generated
        public void setGenreItems(List<GenreItemsDTO> GenreItems) {
            this.GenreItems = GenreItems;
        }

        @Generated
        public void setTagItems(List<?> TagItems) {
            this.TagItems = TagItems;
        }

        @Generated
        public void setPrimaryImageAspectRatio(Double PrimaryImageAspectRatio) {
            this.PrimaryImageAspectRatio = PrimaryImageAspectRatio;
        }

        @Generated
        public void setImageTags(ImageTagsDTO ImageTags) {
            this.ImageTags = ImageTags;
        }

        @Generated
        public void setBackdropImageTags(List<?> BackdropImageTags) {
            this.BackdropImageTags = BackdropImageTags;
        }

        @Generated
        public void setMediaType(String MediaType) {
            this.MediaType = MediaType;
        }

        @Generated
        public void setWidth(Integer Width) {
            this.Width = Width;
        }

        @Generated
        public void setHeight(Integer Height) {
            this.Height = Height;
        }

        @Generated
        public void setSeriesName(String SeriesName) {
            this.SeriesName = SeriesName;
        }

        @Generated
        public void setOriginalTitle(String OriginalTitle) {
            this.OriginalTitle = OriginalTitle;
        }

        @Generated
        public void setPremiereDate(String PremiereDate) {
            this.PremiereDate = PremiereDate;
        }

        @Generated
        public void setSeasonName(String SeasonName) {
            this.SeasonName = SeasonName;
        }

        @Generated
        public void setIndexNumber(Integer IndexNumber) {
            this.IndexNumber = IndexNumber;
        }

        @Generated
        public void setParentIndexNumber(Integer ParentIndexNumber) {
            this.ParentIndexNumber = ParentIndexNumber;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ItemDTO)) {
                return false;
            }
            ItemDTO other = (ItemDTO)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Long this$RunTimeTicks = this.getRunTimeTicks();
            Long other$RunTimeTicks = other.getRunTimeTicks();
            if (this$RunTimeTicks == null ? other$RunTimeTicks != null : !((Object)this$RunTimeTicks).equals(other$RunTimeTicks)) {
                return false;
            }
            Long this$Size = this.getSize();
            Long other$Size = other.getSize();
            if (this$Size == null ? other$Size != null : !((Object)this$Size).equals(other$Size)) {
                return false;
            }
            Integer this$Bitrate = this.getBitrate();
            Integer other$Bitrate = other.getBitrate();
            if (this$Bitrate == null ? other$Bitrate != null : !((Object)this$Bitrate).equals(other$Bitrate)) {
                return false;
            }
            Integer this$ProductionYear = this.getProductionYear();
            Integer other$ProductionYear = other.getProductionYear();
            if (this$ProductionYear == null ? other$ProductionYear != null : !((Object)this$ProductionYear).equals(other$ProductionYear)) {
                return false;
            }
            Boolean this$IsFolder = this.getIsFolder();
            Boolean other$IsFolder = other.getIsFolder();
            if (this$IsFolder == null ? other$IsFolder != null : !((Object)this$IsFolder).equals(other$IsFolder)) {
                return false;
            }
            Double this$PrimaryImageAspectRatio = this.getPrimaryImageAspectRatio();
            Double other$PrimaryImageAspectRatio = other.getPrimaryImageAspectRatio();
            if (this$PrimaryImageAspectRatio == null ? other$PrimaryImageAspectRatio != null : !((Object)this$PrimaryImageAspectRatio).equals(other$PrimaryImageAspectRatio)) {
                return false;
            }
            Integer this$Width = this.getWidth();
            Integer other$Width = other.getWidth();
            if (this$Width == null ? other$Width != null : !((Object)this$Width).equals(other$Width)) {
                return false;
            }
            Integer this$Height = this.getHeight();
            Integer other$Height = other.getHeight();
            if (this$Height == null ? other$Height != null : !((Object)this$Height).equals(other$Height)) {
                return false;
            }
            Integer this$IndexNumber = this.getIndexNumber();
            Integer other$IndexNumber = other.getIndexNumber();
            if (this$IndexNumber == null ? other$IndexNumber != null : !((Object)this$IndexNumber).equals(other$IndexNumber)) {
                return false;
            }
            Integer this$ParentIndexNumber = this.getParentIndexNumber();
            Integer other$ParentIndexNumber = other.getParentIndexNumber();
            if (this$ParentIndexNumber == null ? other$ParentIndexNumber != null : !((Object)this$ParentIndexNumber).equals(other$ParentIndexNumber)) {
                return false;
            }
            String this$Name = this.getName();
            String other$Name = other.getName();
            if (this$Name == null ? other$Name != null : !this$Name.equals(other$Name)) {
                return false;
            }
            String this$ServerId = this.getServerId();
            String other$ServerId = other.getServerId();
            if (this$ServerId == null ? other$ServerId != null : !this$ServerId.equals(other$ServerId)) {
                return false;
            }
            String this$Id = this.getId();
            String other$Id = other.getId();
            if (this$Id == null ? other$Id != null : !this$Id.equals(other$Id)) {
                return false;
            }
            String this$DateCreated = this.getDateCreated();
            String other$DateCreated = other.getDateCreated();
            if (this$DateCreated == null ? other$DateCreated != null : !this$DateCreated.equals(other$DateCreated)) {
                return false;
            }
            String this$Container = this.getContainer();
            String other$Container = other.getContainer();
            if (this$Container == null ? other$Container != null : !this$Container.equals(other$Container)) {
                return false;
            }
            String this$SortName = this.getSortName();
            String other$SortName = other.getSortName();
            if (this$SortName == null ? other$SortName != null : !this$SortName.equals(other$SortName)) {
                return false;
            }
            List<JSONObject> this$ExternalUrls = this.getExternalUrls();
            List<JSONObject> other$ExternalUrls = other.getExternalUrls();
            if (this$ExternalUrls == null ? other$ExternalUrls != null : !((Object)this$ExternalUrls).equals(other$ExternalUrls)) {
                return false;
            }
            String this$Path = this.getPath();
            String other$Path = other.getPath();
            if (this$Path == null ? other$Path != null : !this$Path.equals(other$Path)) {
                return false;
            }
            String this$Overview = this.getOverview();
            String other$Overview = other.getOverview();
            if (this$Overview == null ? other$Overview != null : !this$Overview.equals(other$Overview)) {
                return false;
            }
            List<?> this$Taglines = this.getTaglines();
            List<?> other$Taglines = other.getTaglines();
            if (this$Taglines == null ? other$Taglines != null : !((Object)this$Taglines).equals(other$Taglines)) {
                return false;
            }
            List<String> this$Genres = this.getGenres();
            List<String> other$Genres = other.getGenres();
            if (this$Genres == null ? other$Genres != null : !((Object)this$Genres).equals(other$Genres)) {
                return false;
            }
            String this$FileName = this.getFileName();
            String other$FileName = other.getFileName();
            if (this$FileName == null ? other$FileName != null : !this$FileName.equals(other$FileName)) {
                return false;
            }
            List<?> this$RemoteTrailers = this.getRemoteTrailers();
            List<?> other$RemoteTrailers = other.getRemoteTrailers();
            if (this$RemoteTrailers == null ? other$RemoteTrailers != null : !((Object)this$RemoteTrailers).equals(other$RemoteTrailers)) {
                return false;
            }
            ProviderIdsDTO this$ProviderIds = this.getProviderIds();
            ProviderIdsDTO other$ProviderIds = other.getProviderIds();
            if (this$ProviderIds == null ? other$ProviderIds != null : !((Object)this$ProviderIds).equals(other$ProviderIds)) {
                return false;
            }
            String this$ParentId = this.getParentId();
            String other$ParentId = other.getParentId();
            if (this$ParentId == null ? other$ParentId != null : !this$ParentId.equals(other$ParentId)) {
                return false;
            }
            String this$Type = this.getType();
            String other$Type = other.getType();
            if (this$Type == null ? other$Type != null : !this$Type.equals(other$Type)) {
                return false;
            }
            List<?> this$Studios = this.getStudios();
            List<?> other$Studios = other.getStudios();
            if (this$Studios == null ? other$Studios != null : !((Object)this$Studios).equals(other$Studios)) {
                return false;
            }
            List<GenreItemsDTO> this$GenreItems = this.getGenreItems();
            List<GenreItemsDTO> other$GenreItems = other.getGenreItems();
            if (this$GenreItems == null ? other$GenreItems != null : !((Object)this$GenreItems).equals(other$GenreItems)) {
                return false;
            }
            List<?> this$TagItems = this.getTagItems();
            List<?> other$TagItems = other.getTagItems();
            if (this$TagItems == null ? other$TagItems != null : !((Object)this$TagItems).equals(other$TagItems)) {
                return false;
            }
            ImageTagsDTO this$ImageTags = this.getImageTags();
            ImageTagsDTO other$ImageTags = other.getImageTags();
            if (this$ImageTags == null ? other$ImageTags != null : !((Object)this$ImageTags).equals(other$ImageTags)) {
                return false;
            }
            List<?> this$BackdropImageTags = this.getBackdropImageTags();
            List<?> other$BackdropImageTags = other.getBackdropImageTags();
            if (this$BackdropImageTags == null ? other$BackdropImageTags != null : !((Object)this$BackdropImageTags).equals(other$BackdropImageTags)) {
                return false;
            }
            String this$MediaType = this.getMediaType();
            String other$MediaType = other.getMediaType();
            if (this$MediaType == null ? other$MediaType != null : !this$MediaType.equals(other$MediaType)) {
                return false;
            }
            String this$SeriesName = this.getSeriesName();
            String other$SeriesName = other.getSeriesName();
            if (this$SeriesName == null ? other$SeriesName != null : !this$SeriesName.equals(other$SeriesName)) {
                return false;
            }
            String this$OriginalTitle = this.getOriginalTitle();
            String other$OriginalTitle = other.getOriginalTitle();
            if (this$OriginalTitle == null ? other$OriginalTitle != null : !this$OriginalTitle.equals(other$OriginalTitle)) {
                return false;
            }
            String this$PremiereDate = this.getPremiereDate();
            String other$PremiereDate = other.getPremiereDate();
            if (this$PremiereDate == null ? other$PremiereDate != null : !this$PremiereDate.equals(other$PremiereDate)) {
                return false;
            }
            String this$SeasonName = this.getSeasonName();
            String other$SeasonName = other.getSeasonName();
            return !(this$SeasonName == null ? other$SeasonName != null : !this$SeasonName.equals(other$SeasonName));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof ItemDTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $RunTimeTicks = this.getRunTimeTicks();
            result = result * 59 + ($RunTimeTicks == null ? 43 : ((Object)$RunTimeTicks).hashCode());
            Long $Size = this.getSize();
            result = result * 59 + ($Size == null ? 43 : ((Object)$Size).hashCode());
            Integer $Bitrate = this.getBitrate();
            result = result * 59 + ($Bitrate == null ? 43 : ((Object)$Bitrate).hashCode());
            Integer $ProductionYear = this.getProductionYear();
            result = result * 59 + ($ProductionYear == null ? 43 : ((Object)$ProductionYear).hashCode());
            Boolean $IsFolder = this.getIsFolder();
            result = result * 59 + ($IsFolder == null ? 43 : ((Object)$IsFolder).hashCode());
            Double $PrimaryImageAspectRatio = this.getPrimaryImageAspectRatio();
            result = result * 59 + ($PrimaryImageAspectRatio == null ? 43 : ((Object)$PrimaryImageAspectRatio).hashCode());
            Integer $Width = this.getWidth();
            result = result * 59 + ($Width == null ? 43 : ((Object)$Width).hashCode());
            Integer $Height = this.getHeight();
            result = result * 59 + ($Height == null ? 43 : ((Object)$Height).hashCode());
            Integer $IndexNumber = this.getIndexNumber();
            result = result * 59 + ($IndexNumber == null ? 43 : ((Object)$IndexNumber).hashCode());
            Integer $ParentIndexNumber = this.getParentIndexNumber();
            result = result * 59 + ($ParentIndexNumber == null ? 43 : ((Object)$ParentIndexNumber).hashCode());
            String $Name = this.getName();
            result = result * 59 + ($Name == null ? 43 : $Name.hashCode());
            String $ServerId = this.getServerId();
            result = result * 59 + ($ServerId == null ? 43 : $ServerId.hashCode());
            String $Id = this.getId();
            result = result * 59 + ($Id == null ? 43 : $Id.hashCode());
            String $DateCreated = this.getDateCreated();
            result = result * 59 + ($DateCreated == null ? 43 : $DateCreated.hashCode());
            String $Container = this.getContainer();
            result = result * 59 + ($Container == null ? 43 : $Container.hashCode());
            String $SortName = this.getSortName();
            result = result * 59 + ($SortName == null ? 43 : $SortName.hashCode());
            List<JSONObject> $ExternalUrls = this.getExternalUrls();
            result = result * 59 + ($ExternalUrls == null ? 43 : ((Object)$ExternalUrls).hashCode());
            String $Path = this.getPath();
            result = result * 59 + ($Path == null ? 43 : $Path.hashCode());
            String $Overview = this.getOverview();
            result = result * 59 + ($Overview == null ? 43 : $Overview.hashCode());
            List<?> $Taglines = this.getTaglines();
            result = result * 59 + ($Taglines == null ? 43 : ((Object)$Taglines).hashCode());
            List<String> $Genres = this.getGenres();
            result = result * 59 + ($Genres == null ? 43 : ((Object)$Genres).hashCode());
            String $FileName = this.getFileName();
            result = result * 59 + ($FileName == null ? 43 : $FileName.hashCode());
            List<?> $RemoteTrailers = this.getRemoteTrailers();
            result = result * 59 + ($RemoteTrailers == null ? 43 : ((Object)$RemoteTrailers).hashCode());
            ProviderIdsDTO $ProviderIds = this.getProviderIds();
            result = result * 59 + ($ProviderIds == null ? 43 : ((Object)$ProviderIds).hashCode());
            String $ParentId = this.getParentId();
            result = result * 59 + ($ParentId == null ? 43 : $ParentId.hashCode());
            String $Type = this.getType();
            result = result * 59 + ($Type == null ? 43 : $Type.hashCode());
            List<?> $Studios = this.getStudios();
            result = result * 59 + ($Studios == null ? 43 : ((Object)$Studios).hashCode());
            List<GenreItemsDTO> $GenreItems = this.getGenreItems();
            result = result * 59 + ($GenreItems == null ? 43 : ((Object)$GenreItems).hashCode());
            List<?> $TagItems = this.getTagItems();
            result = result * 59 + ($TagItems == null ? 43 : ((Object)$TagItems).hashCode());
            ImageTagsDTO $ImageTags = this.getImageTags();
            result = result * 59 + ($ImageTags == null ? 43 : ((Object)$ImageTags).hashCode());
            List<?> $BackdropImageTags = this.getBackdropImageTags();
            result = result * 59 + ($BackdropImageTags == null ? 43 : ((Object)$BackdropImageTags).hashCode());
            String $MediaType = this.getMediaType();
            result = result * 59 + ($MediaType == null ? 43 : $MediaType.hashCode());
            String $SeriesName = this.getSeriesName();
            result = result * 59 + ($SeriesName == null ? 43 : $SeriesName.hashCode());
            String $OriginalTitle = this.getOriginalTitle();
            result = result * 59 + ($OriginalTitle == null ? 43 : $OriginalTitle.hashCode());
            String $PremiereDate = this.getPremiereDate();
            result = result * 59 + ($PremiereDate == null ? 43 : $PremiereDate.hashCode());
            String $SeasonName = this.getSeasonName();
            result = result * 59 + ($SeasonName == null ? 43 : $SeasonName.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "LibraryNewRequest.ItemDTO(Name=" + this.getName() + ", ServerId=" + this.getServerId() + ", Id=" + this.getId() + ", DateCreated=" + this.getDateCreated() + ", Container=" + this.getContainer() + ", SortName=" + this.getSortName() + ", ExternalUrls=" + String.valueOf(this.getExternalUrls()) + ", Path=" + this.getPath() + ", Overview=" + this.getOverview() + ", Taglines=" + String.valueOf(this.getTaglines()) + ", Genres=" + String.valueOf(this.getGenres()) + ", RunTimeTicks=" + this.getRunTimeTicks() + ", Size=" + this.getSize() + ", FileName=" + this.getFileName() + ", Bitrate=" + this.getBitrate() + ", ProductionYear=" + this.getProductionYear() + ", RemoteTrailers=" + String.valueOf(this.getRemoteTrailers()) + ", ProviderIds=" + String.valueOf(this.getProviderIds()) + ", IsFolder=" + this.getIsFolder() + ", ParentId=" + this.getParentId() + ", Type=" + this.getType() + ", Studios=" + String.valueOf(this.getStudios()) + ", GenreItems=" + String.valueOf(this.getGenreItems()) + ", TagItems=" + String.valueOf(this.getTagItems()) + ", PrimaryImageAspectRatio=" + this.getPrimaryImageAspectRatio() + ", ImageTags=" + String.valueOf(this.getImageTags()) + ", BackdropImageTags=" + String.valueOf(this.getBackdropImageTags()) + ", MediaType=" + this.getMediaType() + ", Width=" + this.getWidth() + ", Height=" + this.getHeight() + ", SeriesName=" + this.getSeriesName() + ", OriginalTitle=" + this.getOriginalTitle() + ", PremiereDate=" + this.getPremiereDate() + ", SeasonName=" + this.getSeasonName() + ", IndexNumber=" + this.getIndexNumber() + ", ParentIndexNumber=" + this.getParentIndexNumber() + ")";
        }

        public static class ProviderIdsDTO {
            @Generated
            public ProviderIdsDTO() {
            }

            @Generated
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof ProviderIdsDTO)) {
                    return false;
                }
                ProviderIdsDTO other = (ProviderIdsDTO)o;
                return other.canEqual(this);
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof ProviderIdsDTO;
            }

            @Generated
            public int hashCode() {
                boolean result = true;
                return 1;
            }

            @Generated
            public String toString() {
                return "LibraryNewRequest.ItemDTO.ProviderIdsDTO()";
            }
        }

        public static class ImageTagsDTO {
            private String Primary;

            @Generated
            public ImageTagsDTO() {
            }

            @Generated
            public String getPrimary() {
                return this.Primary;
            }

            @Generated
            public void setPrimary(String Primary) {
                this.Primary = Primary;
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
                String this$Primary = this.getPrimary();
                String other$Primary = other.getPrimary();
                return !(this$Primary == null ? other$Primary != null : !this$Primary.equals(other$Primary));
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof ImageTagsDTO;
            }

            @Generated
            public int hashCode() {
                int PRIME = 59;
                int result = 1;
                String $Primary = this.getPrimary();
                result = result * 59 + ($Primary == null ? 43 : $Primary.hashCode());
                return result;
            }

            @Generated
            public String toString() {
                return "LibraryNewRequest.ItemDTO.ImageTagsDTO(Primary=" + this.getPrimary() + ")";
            }
        }

        public static class GenreItemsDTO {
            private String Name;
            private Integer Id;

            @Generated
            public GenreItemsDTO() {
            }

            @Generated
            public String getName() {
                return this.Name;
            }

            @Generated
            public Integer getId() {
                return this.Id;
            }

            @Generated
            public void setName(String Name) {
                this.Name = Name;
            }

            @Generated
            public void setId(Integer Id) {
                this.Id = Id;
            }

            @Generated
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof GenreItemsDTO)) {
                    return false;
                }
                GenreItemsDTO other = (GenreItemsDTO)o;
                if (!other.canEqual(this)) {
                    return false;
                }
                Integer this$Id = this.getId();
                Integer other$Id = other.getId();
                if (this$Id == null ? other$Id != null : !((Object)this$Id).equals(other$Id)) {
                    return false;
                }
                String this$Name = this.getName();
                String other$Name = other.getName();
                return !(this$Name == null ? other$Name != null : !this$Name.equals(other$Name));
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof GenreItemsDTO;
            }

            @Generated
            public int hashCode() {
                int PRIME = 59;
                int result = 1;
                Integer $Id = this.getId();
                result = result * 59 + ($Id == null ? 43 : ((Object)$Id).hashCode());
                String $Name = this.getName();
                result = result * 59 + ($Name == null ? 43 : $Name.hashCode());
                return result;
            }

            @Generated
            public String toString() {
                return "LibraryNewRequest.ItemDTO.GenreItemsDTO(Name=" + this.getName() + ", Id=" + this.getId() + ")";
            }
        }
    }

    public static class ServerDTO {
        private String Name;
        private String Id;
        private String Version;

        @Generated
        public ServerDTO() {
        }

        @Generated
        public String getName() {
            return this.Name;
        }

        @Generated
        public String getId() {
            return this.Id;
        }

        @Generated
        public String getVersion() {
            return this.Version;
        }

        @Generated
        public void setName(String Name) {
            this.Name = Name;
        }

        @Generated
        public void setId(String Id) {
            this.Id = Id;
        }

        @Generated
        public void setVersion(String Version) {
            this.Version = Version;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ServerDTO)) {
                return false;
            }
            ServerDTO other = (ServerDTO)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$Name = this.getName();
            String other$Name = other.getName();
            if (this$Name == null ? other$Name != null : !this$Name.equals(other$Name)) {
                return false;
            }
            String this$Id = this.getId();
            String other$Id = other.getId();
            if (this$Id == null ? other$Id != null : !this$Id.equals(other$Id)) {
                return false;
            }
            String this$Version = this.getVersion();
            String other$Version = other.getVersion();
            return !(this$Version == null ? other$Version != null : !this$Version.equals(other$Version));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof ServerDTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $Name = this.getName();
            result = result * 59 + ($Name == null ? 43 : $Name.hashCode());
            String $Id = this.getId();
            result = result * 59 + ($Id == null ? 43 : $Id.hashCode());
            String $Version = this.getVersion();
            result = result * 59 + ($Version == null ? 43 : $Version.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "LibraryNewRequest.ServerDTO(Name=" + this.getName() + ", Id=" + this.getId() + ", Version=" + this.getVersion() + ")";
        }
    }
}
