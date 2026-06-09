/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.util.List;
import lombok.Generated;

public class GetEpisodesByIdResponse {
    private List<ItemsDTO> Items;
    private Integer TotalRecordCount;

    @Generated
    public GetEpisodesByIdResponse() {
    }

    @Generated
    public List<ItemsDTO> getItems() {
        return this.Items;
    }

    @Generated
    public Integer getTotalRecordCount() {
        return this.TotalRecordCount;
    }

    @Generated
    public void setItems(List<ItemsDTO> Items) {
        this.Items = Items;
    }

    @Generated
    public void setTotalRecordCount(Integer TotalRecordCount) {
        this.TotalRecordCount = TotalRecordCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetEpisodesByIdResponse)) {
            return false;
        }
        GetEpisodesByIdResponse other = (GetEpisodesByIdResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$TotalRecordCount = this.getTotalRecordCount();
        Integer other$TotalRecordCount = other.getTotalRecordCount();
        if (this$TotalRecordCount == null ? other$TotalRecordCount != null : !((Object)this$TotalRecordCount).equals(other$TotalRecordCount)) {
            return false;
        }
        List<ItemsDTO> this$Items = this.getItems();
        List<ItemsDTO> other$Items = other.getItems();
        return !(this$Items == null ? other$Items != null : !((Object)this$Items).equals(other$Items));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof GetEpisodesByIdResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $TotalRecordCount = this.getTotalRecordCount();
        result = result * 59 + ($TotalRecordCount == null ? 43 : ((Object)$TotalRecordCount).hashCode());
        List<ItemsDTO> $Items = this.getItems();
        result = result * 59 + ($Items == null ? 43 : ((Object)$Items).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "GetEpisodesByIdResponse(Items=" + String.valueOf(this.getItems()) + ", TotalRecordCount=" + this.getTotalRecordCount() + ")";
    }

    public static class ItemsDTO {
        private String Name;
        private String ServerId;
        private String Id;
        private String PremiereDate;
        private Long RunTimeTicks;
        private Integer IndexNumber;
        private Integer ParentIndexNumber;
        private Boolean IsFolder;
        private String Type;
        private String ParentLogoItemId;
        private String ParentBackdropItemId;
        private List<String> ParentBackdropImageTags;
        private String SeriesName;
        private String SeriesId;
        private String SeasonId;
        private String SeriesPrimaryImageTag;
        private String SeasonName;
        private ImageTagsDTO ImageTags;
        private List<?> BackdropImageTags;
        private String ParentLogoImageTag;
        private String ParentThumbItemId;
        private String ParentThumbImageTag;
        private String MediaType;
        private String embyEpisodeUrl;

        @Generated
        public ItemsDTO() {
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
        public String getPremiereDate() {
            return this.PremiereDate;
        }

        @Generated
        public Long getRunTimeTicks() {
            return this.RunTimeTicks;
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
        public Boolean getIsFolder() {
            return this.IsFolder;
        }

        @Generated
        public String getType() {
            return this.Type;
        }

        @Generated
        public String getParentLogoItemId() {
            return this.ParentLogoItemId;
        }

        @Generated
        public String getParentBackdropItemId() {
            return this.ParentBackdropItemId;
        }

        @Generated
        public List<String> getParentBackdropImageTags() {
            return this.ParentBackdropImageTags;
        }

        @Generated
        public String getSeriesName() {
            return this.SeriesName;
        }

        @Generated
        public String getSeriesId() {
            return this.SeriesId;
        }

        @Generated
        public String getSeasonId() {
            return this.SeasonId;
        }

        @Generated
        public String getSeriesPrimaryImageTag() {
            return this.SeriesPrimaryImageTag;
        }

        @Generated
        public String getSeasonName() {
            return this.SeasonName;
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
        public String getParentLogoImageTag() {
            return this.ParentLogoImageTag;
        }

        @Generated
        public String getParentThumbItemId() {
            return this.ParentThumbItemId;
        }

        @Generated
        public String getParentThumbImageTag() {
            return this.ParentThumbImageTag;
        }

        @Generated
        public String getMediaType() {
            return this.MediaType;
        }

        @Generated
        public String getEmbyEpisodeUrl() {
            return this.embyEpisodeUrl;
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
        public void setPremiereDate(String PremiereDate) {
            this.PremiereDate = PremiereDate;
        }

        @Generated
        public void setRunTimeTicks(Long RunTimeTicks) {
            this.RunTimeTicks = RunTimeTicks;
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
        public void setIsFolder(Boolean IsFolder) {
            this.IsFolder = IsFolder;
        }

        @Generated
        public void setType(String Type) {
            this.Type = Type;
        }

        @Generated
        public void setParentLogoItemId(String ParentLogoItemId) {
            this.ParentLogoItemId = ParentLogoItemId;
        }

        @Generated
        public void setParentBackdropItemId(String ParentBackdropItemId) {
            this.ParentBackdropItemId = ParentBackdropItemId;
        }

        @Generated
        public void setParentBackdropImageTags(List<String> ParentBackdropImageTags) {
            this.ParentBackdropImageTags = ParentBackdropImageTags;
        }

        @Generated
        public void setSeriesName(String SeriesName) {
            this.SeriesName = SeriesName;
        }

        @Generated
        public void setSeriesId(String SeriesId) {
            this.SeriesId = SeriesId;
        }

        @Generated
        public void setSeasonId(String SeasonId) {
            this.SeasonId = SeasonId;
        }

        @Generated
        public void setSeriesPrimaryImageTag(String SeriesPrimaryImageTag) {
            this.SeriesPrimaryImageTag = SeriesPrimaryImageTag;
        }

        @Generated
        public void setSeasonName(String SeasonName) {
            this.SeasonName = SeasonName;
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
        public void setParentLogoImageTag(String ParentLogoImageTag) {
            this.ParentLogoImageTag = ParentLogoImageTag;
        }

        @Generated
        public void setParentThumbItemId(String ParentThumbItemId) {
            this.ParentThumbItemId = ParentThumbItemId;
        }

        @Generated
        public void setParentThumbImageTag(String ParentThumbImageTag) {
            this.ParentThumbImageTag = ParentThumbImageTag;
        }

        @Generated
        public void setMediaType(String MediaType) {
            this.MediaType = MediaType;
        }

        @Generated
        public void setEmbyEpisodeUrl(String embyEpisodeUrl) {
            this.embyEpisodeUrl = embyEpisodeUrl;
        }

        @Generated
        public boolean equals(Object o) {
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
            Long this$RunTimeTicks = this.getRunTimeTicks();
            Long other$RunTimeTicks = other.getRunTimeTicks();
            if (this$RunTimeTicks == null ? other$RunTimeTicks != null : !((Object)this$RunTimeTicks).equals(other$RunTimeTicks)) {
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
            Boolean this$IsFolder = this.getIsFolder();
            Boolean other$IsFolder = other.getIsFolder();
            if (this$IsFolder == null ? other$IsFolder != null : !((Object)this$IsFolder).equals(other$IsFolder)) {
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
            String this$PremiereDate = this.getPremiereDate();
            String other$PremiereDate = other.getPremiereDate();
            if (this$PremiereDate == null ? other$PremiereDate != null : !this$PremiereDate.equals(other$PremiereDate)) {
                return false;
            }
            String this$Type = this.getType();
            String other$Type = other.getType();
            if (this$Type == null ? other$Type != null : !this$Type.equals(other$Type)) {
                return false;
            }
            String this$ParentLogoItemId = this.getParentLogoItemId();
            String other$ParentLogoItemId = other.getParentLogoItemId();
            if (this$ParentLogoItemId == null ? other$ParentLogoItemId != null : !this$ParentLogoItemId.equals(other$ParentLogoItemId)) {
                return false;
            }
            String this$ParentBackdropItemId = this.getParentBackdropItemId();
            String other$ParentBackdropItemId = other.getParentBackdropItemId();
            if (this$ParentBackdropItemId == null ? other$ParentBackdropItemId != null : !this$ParentBackdropItemId.equals(other$ParentBackdropItemId)) {
                return false;
            }
            List<String> this$ParentBackdropImageTags = this.getParentBackdropImageTags();
            List<String> other$ParentBackdropImageTags = other.getParentBackdropImageTags();
            if (this$ParentBackdropImageTags == null ? other$ParentBackdropImageTags != null : !((Object)this$ParentBackdropImageTags).equals(other$ParentBackdropImageTags)) {
                return false;
            }
            String this$SeriesName = this.getSeriesName();
            String other$SeriesName = other.getSeriesName();
            if (this$SeriesName == null ? other$SeriesName != null : !this$SeriesName.equals(other$SeriesName)) {
                return false;
            }
            String this$SeriesId = this.getSeriesId();
            String other$SeriesId = other.getSeriesId();
            if (this$SeriesId == null ? other$SeriesId != null : !this$SeriesId.equals(other$SeriesId)) {
                return false;
            }
            String this$SeasonId = this.getSeasonId();
            String other$SeasonId = other.getSeasonId();
            if (this$SeasonId == null ? other$SeasonId != null : !this$SeasonId.equals(other$SeasonId)) {
                return false;
            }
            String this$SeriesPrimaryImageTag = this.getSeriesPrimaryImageTag();
            String other$SeriesPrimaryImageTag = other.getSeriesPrimaryImageTag();
            if (this$SeriesPrimaryImageTag == null ? other$SeriesPrimaryImageTag != null : !this$SeriesPrimaryImageTag.equals(other$SeriesPrimaryImageTag)) {
                return false;
            }
            String this$SeasonName = this.getSeasonName();
            String other$SeasonName = other.getSeasonName();
            if (this$SeasonName == null ? other$SeasonName != null : !this$SeasonName.equals(other$SeasonName)) {
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
            String this$ParentLogoImageTag = this.getParentLogoImageTag();
            String other$ParentLogoImageTag = other.getParentLogoImageTag();
            if (this$ParentLogoImageTag == null ? other$ParentLogoImageTag != null : !this$ParentLogoImageTag.equals(other$ParentLogoImageTag)) {
                return false;
            }
            String this$ParentThumbItemId = this.getParentThumbItemId();
            String other$ParentThumbItemId = other.getParentThumbItemId();
            if (this$ParentThumbItemId == null ? other$ParentThumbItemId != null : !this$ParentThumbItemId.equals(other$ParentThumbItemId)) {
                return false;
            }
            String this$ParentThumbImageTag = this.getParentThumbImageTag();
            String other$ParentThumbImageTag = other.getParentThumbImageTag();
            if (this$ParentThumbImageTag == null ? other$ParentThumbImageTag != null : !this$ParentThumbImageTag.equals(other$ParentThumbImageTag)) {
                return false;
            }
            String this$MediaType = this.getMediaType();
            String other$MediaType = other.getMediaType();
            if (this$MediaType == null ? other$MediaType != null : !this$MediaType.equals(other$MediaType)) {
                return false;
            }
            String this$embyEpisodeUrl = this.getEmbyEpisodeUrl();
            String other$embyEpisodeUrl = other.getEmbyEpisodeUrl();
            return !(this$embyEpisodeUrl == null ? other$embyEpisodeUrl != null : !this$embyEpisodeUrl.equals(other$embyEpisodeUrl));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof ItemsDTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $RunTimeTicks = this.getRunTimeTicks();
            result = result * 59 + ($RunTimeTicks == null ? 43 : ((Object)$RunTimeTicks).hashCode());
            Integer $IndexNumber = this.getIndexNumber();
            result = result * 59 + ($IndexNumber == null ? 43 : ((Object)$IndexNumber).hashCode());
            Integer $ParentIndexNumber = this.getParentIndexNumber();
            result = result * 59 + ($ParentIndexNumber == null ? 43 : ((Object)$ParentIndexNumber).hashCode());
            Boolean $IsFolder = this.getIsFolder();
            result = result * 59 + ($IsFolder == null ? 43 : ((Object)$IsFolder).hashCode());
            String $Name = this.getName();
            result = result * 59 + ($Name == null ? 43 : $Name.hashCode());
            String $ServerId = this.getServerId();
            result = result * 59 + ($ServerId == null ? 43 : $ServerId.hashCode());
            String $Id = this.getId();
            result = result * 59 + ($Id == null ? 43 : $Id.hashCode());
            String $PremiereDate = this.getPremiereDate();
            result = result * 59 + ($PremiereDate == null ? 43 : $PremiereDate.hashCode());
            String $Type = this.getType();
            result = result * 59 + ($Type == null ? 43 : $Type.hashCode());
            String $ParentLogoItemId = this.getParentLogoItemId();
            result = result * 59 + ($ParentLogoItemId == null ? 43 : $ParentLogoItemId.hashCode());
            String $ParentBackdropItemId = this.getParentBackdropItemId();
            result = result * 59 + ($ParentBackdropItemId == null ? 43 : $ParentBackdropItemId.hashCode());
            List<String> $ParentBackdropImageTags = this.getParentBackdropImageTags();
            result = result * 59 + ($ParentBackdropImageTags == null ? 43 : ((Object)$ParentBackdropImageTags).hashCode());
            String $SeriesName = this.getSeriesName();
            result = result * 59 + ($SeriesName == null ? 43 : $SeriesName.hashCode());
            String $SeriesId = this.getSeriesId();
            result = result * 59 + ($SeriesId == null ? 43 : $SeriesId.hashCode());
            String $SeasonId = this.getSeasonId();
            result = result * 59 + ($SeasonId == null ? 43 : $SeasonId.hashCode());
            String $SeriesPrimaryImageTag = this.getSeriesPrimaryImageTag();
            result = result * 59 + ($SeriesPrimaryImageTag == null ? 43 : $SeriesPrimaryImageTag.hashCode());
            String $SeasonName = this.getSeasonName();
            result = result * 59 + ($SeasonName == null ? 43 : $SeasonName.hashCode());
            ImageTagsDTO $ImageTags = this.getImageTags();
            result = result * 59 + ($ImageTags == null ? 43 : ((Object)$ImageTags).hashCode());
            List<?> $BackdropImageTags = this.getBackdropImageTags();
            result = result * 59 + ($BackdropImageTags == null ? 43 : ((Object)$BackdropImageTags).hashCode());
            String $ParentLogoImageTag = this.getParentLogoImageTag();
            result = result * 59 + ($ParentLogoImageTag == null ? 43 : $ParentLogoImageTag.hashCode());
            String $ParentThumbItemId = this.getParentThumbItemId();
            result = result * 59 + ($ParentThumbItemId == null ? 43 : $ParentThumbItemId.hashCode());
            String $ParentThumbImageTag = this.getParentThumbImageTag();
            result = result * 59 + ($ParentThumbImageTag == null ? 43 : $ParentThumbImageTag.hashCode());
            String $MediaType = this.getMediaType();
            result = result * 59 + ($MediaType == null ? 43 : $MediaType.hashCode());
            String $embyEpisodeUrl = this.getEmbyEpisodeUrl();
            result = result * 59 + ($embyEpisodeUrl == null ? 43 : $embyEpisodeUrl.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "GetEpisodesByIdResponse.ItemsDTO(Name=" + this.getName() + ", ServerId=" + this.getServerId() + ", Id=" + this.getId() + ", PremiereDate=" + this.getPremiereDate() + ", RunTimeTicks=" + this.getRunTimeTicks() + ", IndexNumber=" + this.getIndexNumber() + ", ParentIndexNumber=" + this.getParentIndexNumber() + ", IsFolder=" + this.getIsFolder() + ", Type=" + this.getType() + ", ParentLogoItemId=" + this.getParentLogoItemId() + ", ParentBackdropItemId=" + this.getParentBackdropItemId() + ", ParentBackdropImageTags=" + String.valueOf(this.getParentBackdropImageTags()) + ", SeriesName=" + this.getSeriesName() + ", SeriesId=" + this.getSeriesId() + ", SeasonId=" + this.getSeasonId() + ", SeriesPrimaryImageTag=" + this.getSeriesPrimaryImageTag() + ", SeasonName=" + this.getSeasonName() + ", ImageTags=" + String.valueOf(this.getImageTags()) + ", BackdropImageTags=" + String.valueOf(this.getBackdropImageTags()) + ", ParentLogoImageTag=" + this.getParentLogoImageTag() + ", ParentThumbItemId=" + this.getParentThumbItemId() + ", ParentThumbImageTag=" + this.getParentThumbImageTag() + ", MediaType=" + this.getMediaType() + ", embyEpisodeUrl=" + this.getEmbyEpisodeUrl() + ")";
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
                return "GetEpisodesByIdResponse.ItemsDTO.ImageTagsDTO(Primary=" + this.getPrimary() + ")";
            }
        }
    }
}
