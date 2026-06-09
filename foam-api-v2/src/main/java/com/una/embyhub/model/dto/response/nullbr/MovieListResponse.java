/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.nullbr;

import com.alibaba.fastjson2.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class MovieListResponse {
    @JSONField(name="115")
    private List<MovieList115DTO> movieList115DTOList;
    private Integer id;
    private Integer page;
    @JSONField(name="total_page")
    private Integer totalPage;
    @JSONField(name="media_type")
    private String mediaType;
    private List<CreditsDTO> creditsDTOList = new ArrayList<CreditsDTO>();

    @Generated
    public MovieListResponse() {
    }

    @Generated
    public List<MovieList115DTO> getMovieList115DTOList() {
        return this.movieList115DTOList;
    }

    @Generated
    public Integer getId() {
        return this.id;
    }

    @Generated
    public Integer getPage() {
        return this.page;
    }

    @Generated
    public Integer getTotalPage() {
        return this.totalPage;
    }

    @Generated
    public String getMediaType() {
        return this.mediaType;
    }

    @Generated
    public List<CreditsDTO> getCreditsDTOList() {
        return this.creditsDTOList;
    }

    @Generated
    public void setMovieList115DTOList(List<MovieList115DTO> movieList115DTOList) {
        this.movieList115DTOList = movieList115DTOList;
    }

    @Generated
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated
    public void setPage(Integer page) {
        this.page = page;
    }

    @Generated
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Generated
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Generated
    public void setCreditsDTOList(List<CreditsDTO> creditsDTOList) {
        this.creditsDTOList = creditsDTOList;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MovieListResponse)) {
            return false;
        }
        MovieListResponse other = (MovieListResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$id = this.getId();
        Integer other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$page = this.getPage();
        Integer other$page = other.getPage();
        if (this$page == null ? other$page != null : !((Object)this$page).equals(other$page)) {
            return false;
        }
        Integer this$totalPage = this.getTotalPage();
        Integer other$totalPage = other.getTotalPage();
        if (this$totalPage == null ? other$totalPage != null : !((Object)this$totalPage).equals(other$totalPage)) {
            return false;
        }
        List<MovieList115DTO> this$movieList115DTOList = this.getMovieList115DTOList();
        List<MovieList115DTO> other$movieList115DTOList = other.getMovieList115DTOList();
        if (this$movieList115DTOList == null ? other$movieList115DTOList != null : !((Object)this$movieList115DTOList).equals(other$movieList115DTOList)) {
            return false;
        }
        String this$mediaType = this.getMediaType();
        String other$mediaType = other.getMediaType();
        if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
            return false;
        }
        List<CreditsDTO> this$creditsDTOList = this.getCreditsDTOList();
        List<CreditsDTO> other$creditsDTOList = other.getCreditsDTOList();
        return !(this$creditsDTOList == null ? other$creditsDTOList != null : !((Object)this$creditsDTOList).equals(other$creditsDTOList));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MovieListResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : ((Object)$page).hashCode());
        Integer $totalPage = this.getTotalPage();
        result = result * 59 + ($totalPage == null ? 43 : ((Object)$totalPage).hashCode());
        List<MovieList115DTO> $movieList115DTOList = this.getMovieList115DTOList();
        result = result * 59 + ($movieList115DTOList == null ? 43 : ((Object)$movieList115DTOList).hashCode());
        String $mediaType = this.getMediaType();
        result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
        List<CreditsDTO> $creditsDTOList = this.getCreditsDTOList();
        result = result * 59 + ($creditsDTOList == null ? 43 : ((Object)$creditsDTOList).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MovieListResponse(movieList115DTOList=" + String.valueOf(this.getMovieList115DTOList()) + ", id=" + this.getId() + ", page=" + this.getPage() + ", totalPage=" + this.getTotalPage() + ", mediaType=" + this.getMediaType() + ", creditsDTOList=" + String.valueOf(this.getCreditsDTOList()) + ")";
    }

    public static class CreditsDTO {
        private String name;
        private String profilePath;

        @Generated
        public CreditsDTO() {
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getProfilePath() {
            return this.profilePath;
        }

        @Generated
        public void setName(String name) {
            this.name = name;
        }

        @Generated
        public void setProfilePath(String profilePath) {
            this.profilePath = profilePath;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof CreditsDTO)) {
                return false;
            }
            CreditsDTO other = (CreditsDTO)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            String this$profilePath = this.getProfilePath();
            String other$profilePath = other.getProfilePath();
            return !(this$profilePath == null ? other$profilePath != null : !this$profilePath.equals(other$profilePath));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof CreditsDTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            String $profilePath = this.getProfilePath();
            result = result * 59 + ($profilePath == null ? 43 : $profilePath.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "MovieListResponse.CreditsDTO(name=" + this.getName() + ", profilePath=" + this.getProfilePath() + ")";
        }
    }

    public static class MovieList115DTO {
        private String title;
        private String size;
        @JSONField(name="share_link")
        private String shareLink;
        private String resolution;
        private String quality;

        @Generated
        public MovieList115DTO() {
        }

        @Generated
        public String getTitle() {
            return this.title;
        }

        @Generated
        public String getSize() {
            return this.size;
        }

        @Generated
        public String getShareLink() {
            return this.shareLink;
        }

        @Generated
        public String getResolution() {
            return this.resolution;
        }

        @Generated
        public String getQuality() {
            return this.quality;
        }

        @Generated
        public void setTitle(String title) {
            this.title = title;
        }

        @Generated
        public void setSize(String size) {
            this.size = size;
        }

        @Generated
        public void setShareLink(String shareLink) {
            this.shareLink = shareLink;
        }

        @Generated
        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        @Generated
        public void setQuality(String quality) {
            this.quality = quality;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof MovieList115DTO)) {
                return false;
            }
            MovieList115DTO other = (MovieList115DTO)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$title = this.getTitle();
            String other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
                return false;
            }
            String this$size = this.getSize();
            String other$size = other.getSize();
            if (this$size == null ? other$size != null : !this$size.equals(other$size)) {
                return false;
            }
            String this$shareLink = this.getShareLink();
            String other$shareLink = other.getShareLink();
            if (this$shareLink == null ? other$shareLink != null : !this$shareLink.equals(other$shareLink)) {
                return false;
            }
            String this$resolution = this.getResolution();
            String other$resolution = other.getResolution();
            if (this$resolution == null ? other$resolution != null : !this$resolution.equals(other$resolution)) {
                return false;
            }
            String this$quality = this.getQuality();
            String other$quality = other.getQuality();
            return !(this$quality == null ? other$quality != null : !this$quality.equals(other$quality));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof MovieList115DTO;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $title = this.getTitle();
            result = result * 59 + ($title == null ? 43 : $title.hashCode());
            String $size = this.getSize();
            result = result * 59 + ($size == null ? 43 : $size.hashCode());
            String $shareLink = this.getShareLink();
            result = result * 59 + ($shareLink == null ? 43 : $shareLink.hashCode());
            String $resolution = this.getResolution();
            result = result * 59 + ($resolution == null ? 43 : $resolution.hashCode());
            String $quality = this.getQuality();
            result = result * 59 + ($quality == null ? 43 : $quality.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "MovieListResponse.MovieList115DTO(title=" + this.getTitle() + ", size=" + this.getSize() + ", shareLink=" + this.getShareLink() + ", resolution=" + this.getResolution() + ", quality=" + this.getQuality() + ")";
        }
    }
}
