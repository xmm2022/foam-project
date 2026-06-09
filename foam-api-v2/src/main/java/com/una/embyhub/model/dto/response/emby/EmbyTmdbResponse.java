/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class EmbyTmdbResponse
implements Serializable {
    private String Name;
    private String ServerId;
    private String Id;
    private Long RunTimeTicks;
    private ProviderIdsDTO ProviderIds;
    private Boolean IsFolder;
    private String Type;
    private ImageTagsDTO ImageTags;
    private List<String> BackdropImageTags;
    private String MediaType;
    private List<?> AirDays;

    @Generated
    public EmbyTmdbResponse() {
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
    public Long getRunTimeTicks() {
        return this.RunTimeTicks;
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
    public String getType() {
        return this.Type;
    }

    @Generated
    public ImageTagsDTO getImageTags() {
        return this.ImageTags;
    }

    @Generated
    public List<String> getBackdropImageTags() {
        return this.BackdropImageTags;
    }

    @Generated
    public String getMediaType() {
        return this.MediaType;
    }

    @Generated
    public List<?> getAirDays() {
        return this.AirDays;
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
    public void setRunTimeTicks(Long RunTimeTicks) {
        this.RunTimeTicks = RunTimeTicks;
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
    public void setType(String Type) {
        this.Type = Type;
    }

    @Generated
    public void setImageTags(ImageTagsDTO ImageTags) {
        this.ImageTags = ImageTags;
    }

    @Generated
    public void setBackdropImageTags(List<String> BackdropImageTags) {
        this.BackdropImageTags = BackdropImageTags;
    }

    @Generated
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    @Generated
    public void setAirDays(List<?> AirDays) {
        this.AirDays = AirDays;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyTmdbResponse)) {
            return false;
        }
        EmbyTmdbResponse other = (EmbyTmdbResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$RunTimeTicks = this.getRunTimeTicks();
        Long other$RunTimeTicks = other.getRunTimeTicks();
        if (this$RunTimeTicks == null ? other$RunTimeTicks != null : !((Object)this$RunTimeTicks).equals(other$RunTimeTicks)) {
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
        ProviderIdsDTO this$ProviderIds = this.getProviderIds();
        ProviderIdsDTO other$ProviderIds = other.getProviderIds();
        if (this$ProviderIds == null ? other$ProviderIds != null : !((Object)this$ProviderIds).equals(other$ProviderIds)) {
            return false;
        }
        String this$Type = this.getType();
        String other$Type = other.getType();
        if (this$Type == null ? other$Type != null : !this$Type.equals(other$Type)) {
            return false;
        }
        ImageTagsDTO this$ImageTags = this.getImageTags();
        ImageTagsDTO other$ImageTags = other.getImageTags();
        if (this$ImageTags == null ? other$ImageTags != null : !((Object)this$ImageTags).equals(other$ImageTags)) {
            return false;
        }
        List<String> this$BackdropImageTags = this.getBackdropImageTags();
        List<String> other$BackdropImageTags = other.getBackdropImageTags();
        if (this$BackdropImageTags == null ? other$BackdropImageTags != null : !((Object)this$BackdropImageTags).equals(other$BackdropImageTags)) {
            return false;
        }
        String this$MediaType = this.getMediaType();
        String other$MediaType = other.getMediaType();
        if (this$MediaType == null ? other$MediaType != null : !this$MediaType.equals(other$MediaType)) {
            return false;
        }
        List<?> this$AirDays = this.getAirDays();
        List<?> other$AirDays = other.getAirDays();
        return !(this$AirDays == null ? other$AirDays != null : !((Object)this$AirDays).equals(other$AirDays));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyTmdbResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $RunTimeTicks = this.getRunTimeTicks();
        result = result * 59 + ($RunTimeTicks == null ? 43 : ((Object)$RunTimeTicks).hashCode());
        Boolean $IsFolder = this.getIsFolder();
        result = result * 59 + ($IsFolder == null ? 43 : ((Object)$IsFolder).hashCode());
        String $Name = this.getName();
        result = result * 59 + ($Name == null ? 43 : $Name.hashCode());
        String $ServerId = this.getServerId();
        result = result * 59 + ($ServerId == null ? 43 : $ServerId.hashCode());
        String $Id = this.getId();
        result = result * 59 + ($Id == null ? 43 : $Id.hashCode());
        ProviderIdsDTO $ProviderIds = this.getProviderIds();
        result = result * 59 + ($ProviderIds == null ? 43 : ((Object)$ProviderIds).hashCode());
        String $Type = this.getType();
        result = result * 59 + ($Type == null ? 43 : $Type.hashCode());
        ImageTagsDTO $ImageTags = this.getImageTags();
        result = result * 59 + ($ImageTags == null ? 43 : ((Object)$ImageTags).hashCode());
        List<String> $BackdropImageTags = this.getBackdropImageTags();
        result = result * 59 + ($BackdropImageTags == null ? 43 : ((Object)$BackdropImageTags).hashCode());
        String $MediaType = this.getMediaType();
        result = result * 59 + ($MediaType == null ? 43 : $MediaType.hashCode());
        List<?> $AirDays = this.getAirDays();
        result = result * 59 + ($AirDays == null ? 43 : ((Object)$AirDays).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyTmdbResponse(Name=" + this.getName() + ", ServerId=" + this.getServerId() + ", Id=" + this.getId() + ", RunTimeTicks=" + this.getRunTimeTicks() + ", ProviderIds=" + String.valueOf(this.getProviderIds()) + ", IsFolder=" + this.getIsFolder() + ", Type=" + this.getType() + ", ImageTags=" + String.valueOf(this.getImageTags()) + ", BackdropImageTags=" + String.valueOf(this.getBackdropImageTags()) + ", MediaType=" + this.getMediaType() + ", AirDays=" + String.valueOf(this.getAirDays()) + ")";
    }

    public static class ProviderIdsDTO
    implements Serializable {
        private String Tmdb;
        private String Imdb;
        private String Tvdb;

        @Generated
        public ProviderIdsDTO() {
        }

        @Generated
        public String getTmdb() {
            return this.Tmdb;
        }

        @Generated
        public String getImdb() {
            return this.Imdb;
        }

        @Generated
        public String getTvdb() {
            return this.Tvdb;
        }

        @Generated
        public void setTmdb(String Tmdb) {
            this.Tmdb = Tmdb;
        }

        @Generated
        public void setImdb(String Imdb) {
            this.Imdb = Imdb;
        }

        @Generated
        public void setTvdb(String Tvdb) {
            this.Tvdb = Tvdb;
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
            if (!other.canEqual(this)) {
                return false;
            }
            String this$Tmdb = this.getTmdb();
            String other$Tmdb = other.getTmdb();
            if (this$Tmdb == null ? other$Tmdb != null : !this$Tmdb.equals(other$Tmdb)) {
                return false;
            }
            String this$Imdb = this.getImdb();
            String other$Imdb = other.getImdb();
            if (this$Imdb == null ? other$Imdb != null : !this$Imdb.equals(other$Imdb)) {
                return false;
            }
            String this$Tvdb = this.getTvdb();
            String other$Tvdb = other.getTvdb();
            return !(this$Tvdb == null ? other$Tvdb != null : !this$Tvdb.equals(other$Tvdb));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof ProviderIdsDTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $Tmdb = this.getTmdb();
            result = result * 59 + ($Tmdb == null ? 43 : $Tmdb.hashCode());
            String $Imdb = this.getImdb();
            result = result * 59 + ($Imdb == null ? 43 : $Imdb.hashCode());
            String $Tvdb = this.getTvdb();
            result = result * 59 + ($Tvdb == null ? 43 : $Tvdb.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "EmbyTmdbResponse.ProviderIdsDTO(Tmdb=" + this.getTmdb() + ", Imdb=" + this.getImdb() + ", Tvdb=" + this.getTvdb() + ")";
        }
    }

    public static class ImageTagsDTO
    implements Serializable {
        private String Primary;
        private String Logo;
        private String Thumb;
        private String Banner;
        private String Disc;

        @Generated
        public ImageTagsDTO() {
        }

        @Generated
        public String getPrimary() {
            return this.Primary;
        }

        @Generated
        public String getLogo() {
            return this.Logo;
        }

        @Generated
        public String getThumb() {
            return this.Thumb;
        }

        @Generated
        public String getBanner() {
            return this.Banner;
        }

        @Generated
        public String getDisc() {
            return this.Disc;
        }

        @Generated
        public void setPrimary(String Primary) {
            this.Primary = Primary;
        }

        @Generated
        public void setLogo(String Logo) {
            this.Logo = Logo;
        }

        @Generated
        public void setThumb(String Thumb) {
            this.Thumb = Thumb;
        }

        @Generated
        public void setBanner(String Banner) {
            this.Banner = Banner;
        }

        @Generated
        public void setDisc(String Disc) {
            this.Disc = Disc;
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
            if (this$Primary == null ? other$Primary != null : !this$Primary.equals(other$Primary)) {
                return false;
            }
            String this$Logo = this.getLogo();
            String other$Logo = other.getLogo();
            if (this$Logo == null ? other$Logo != null : !this$Logo.equals(other$Logo)) {
                return false;
            }
            String this$Thumb = this.getThumb();
            String other$Thumb = other.getThumb();
            if (this$Thumb == null ? other$Thumb != null : !this$Thumb.equals(other$Thumb)) {
                return false;
            }
            String this$Banner = this.getBanner();
            String other$Banner = other.getBanner();
            if (this$Banner == null ? other$Banner != null : !this$Banner.equals(other$Banner)) {
                return false;
            }
            String this$Disc = this.getDisc();
            String other$Disc = other.getDisc();
            return !(this$Disc == null ? other$Disc != null : !this$Disc.equals(other$Disc));
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
            String $Logo = this.getLogo();
            result = result * 59 + ($Logo == null ? 43 : $Logo.hashCode());
            String $Thumb = this.getThumb();
            result = result * 59 + ($Thumb == null ? 43 : $Thumb.hashCode());
            String $Banner = this.getBanner();
            result = result * 59 + ($Banner == null ? 43 : $Banner.hashCode());
            String $Disc = this.getDisc();
            result = result * 59 + ($Disc == null ? 43 : $Disc.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "EmbyTmdbResponse.ImageTagsDTO(Primary=" + this.getPrimary() + ", Logo=" + this.getLogo() + ", Thumb=" + this.getThumb() + ", Banner=" + this.getBanner() + ", Disc=" + this.getDisc() + ")";
        }
    }
}
