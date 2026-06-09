/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.douban;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class DoubanSimpleSubjectResponse
implements Serializable {
    private String doubanId;
    private String title;
    private String originalTitle;
    private String releaseYear;
    private String rate;
    private String cover;
    private String background;
    private String url;
    private Boolean playable;
    private Boolean isNew;
    private List<String> types;
    private Integer tmdbId;
    private Boolean inLibrary;

    @Generated
    public DoubanSimpleSubjectResponse() {
    }

    @Generated
    public String getDoubanId() {
        return this.doubanId;
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public String getOriginalTitle() {
        return this.originalTitle;
    }

    @Generated
    public String getReleaseYear() {
        return this.releaseYear;
    }

    @Generated
    public String getRate() {
        return this.rate;
    }

    @Generated
    public String getCover() {
        return this.cover;
    }

    @Generated
    public String getBackground() {
        return this.background;
    }

    @Generated
    public String getUrl() {
        return this.url;
    }

    @Generated
    public Boolean getPlayable() {
        return this.playable;
    }

    @Generated
    public Boolean getIsNew() {
        return this.isNew;
    }

    @Generated
    public List<String> getTypes() {
        return this.types;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public Boolean getInLibrary() {
        return this.inLibrary;
    }

    @Generated
    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    @Generated
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    @Generated
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Generated
    public void setRate(String rate) {
        this.rate = rate;
    }

    @Generated
    public void setCover(String cover) {
        this.cover = cover;
    }

    @Generated
    public void setBackground(String background) {
        this.background = background;
    }

    @Generated
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated
    public void setPlayable(Boolean playable) {
        this.playable = playable;
    }

    @Generated
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    @Generated
    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setInLibrary(Boolean inLibrary) {
        this.inLibrary = inLibrary;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DoubanSimpleSubjectResponse)) {
            return false;
        }
        DoubanSimpleSubjectResponse other = (DoubanSimpleSubjectResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$playable = this.getPlayable();
        Boolean other$playable = other.getPlayable();
        if (this$playable == null ? other$playable != null : !((Object)this$playable).equals(other$playable)) {
            return false;
        }
        Boolean this$isNew = this.getIsNew();
        Boolean other$isNew = other.getIsNew();
        if (this$isNew == null ? other$isNew != null : !((Object)this$isNew).equals(other$isNew)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Boolean this$inLibrary = this.getInLibrary();
        Boolean other$inLibrary = other.getInLibrary();
        if (this$inLibrary == null ? other$inLibrary != null : !((Object)this$inLibrary).equals(other$inLibrary)) {
            return false;
        }
        String this$doubanId = this.getDoubanId();
        String other$doubanId = other.getDoubanId();
        if (this$doubanId == null ? other$doubanId != null : !this$doubanId.equals(other$doubanId)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$originalTitle = this.getOriginalTitle();
        String other$originalTitle = other.getOriginalTitle();
        if (this$originalTitle == null ? other$originalTitle != null : !this$originalTitle.equals(other$originalTitle)) {
            return false;
        }
        String this$releaseYear = this.getReleaseYear();
        String other$releaseYear = other.getReleaseYear();
        if (this$releaseYear == null ? other$releaseYear != null : !this$releaseYear.equals(other$releaseYear)) {
            return false;
        }
        String this$rate = this.getRate();
        String other$rate = other.getRate();
        if (this$rate == null ? other$rate != null : !this$rate.equals(other$rate)) {
            return false;
        }
        String this$cover = this.getCover();
        String other$cover = other.getCover();
        if (this$cover == null ? other$cover != null : !this$cover.equals(other$cover)) {
            return false;
        }
        String this$background = this.getBackground();
        String other$background = other.getBackground();
        if (this$background == null ? other$background != null : !this$background.equals(other$background)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        List<String> this$types = this.getTypes();
        List<String> other$types = other.getTypes();
        return !(this$types == null ? other$types != null : !((Object)this$types).equals(other$types));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DoubanSimpleSubjectResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $playable = this.getPlayable();
        result = result * 59 + ($playable == null ? 43 : ((Object)$playable).hashCode());
        Boolean $isNew = this.getIsNew();
        result = result * 59 + ($isNew == null ? 43 : ((Object)$isNew).hashCode());
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Boolean $inLibrary = this.getInLibrary();
        result = result * 59 + ($inLibrary == null ? 43 : ((Object)$inLibrary).hashCode());
        String $doubanId = this.getDoubanId();
        result = result * 59 + ($doubanId == null ? 43 : $doubanId.hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $originalTitle = this.getOriginalTitle();
        result = result * 59 + ($originalTitle == null ? 43 : $originalTitle.hashCode());
        String $releaseYear = this.getReleaseYear();
        result = result * 59 + ($releaseYear == null ? 43 : $releaseYear.hashCode());
        String $rate = this.getRate();
        result = result * 59 + ($rate == null ? 43 : $rate.hashCode());
        String $cover = this.getCover();
        result = result * 59 + ($cover == null ? 43 : $cover.hashCode());
        String $background = this.getBackground();
        result = result * 59 + ($background == null ? 43 : $background.hashCode());
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        List<String> $types = this.getTypes();
        result = result * 59 + ($types == null ? 43 : ((Object)$types).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DoubanSimpleSubjectResponse(doubanId=" + this.getDoubanId() + ", title=" + this.getTitle() + ", originalTitle=" + this.getOriginalTitle() + ", releaseYear=" + this.getReleaseYear() + ", rate=" + this.getRate() + ", cover=" + this.getCover() + ", background=" + this.getBackground() + ", url=" + this.getUrl() + ", playable=" + this.getPlayable() + ", isNew=" + this.getIsNew() + ", types=" + String.valueOf(this.getTypes()) + ", tmdbId=" + this.getTmdbId() + ", inLibrary=" + this.getInLibrary() + ")";
    }
}
