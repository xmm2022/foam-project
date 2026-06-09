/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotEmpty
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdbfollow;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class TmdbFollowSubscribeRequest
implements Serializable {
    @NotNull(message="TMDB \u5267\u96c6ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="TMDB \u5267\u96c6ID\u4e0d\u80fd\u4e3a\u7a7a") Integer tmdbId;
    private String mediaType = "tv";
    private String language = "zh-CN";
    @NotEmpty(message="\u81f3\u5c11\u9009\u62e9\u4e00\u4e2a\u901a\u77e5\u6e20\u9053")
    private @NotEmpty(message="\u81f3\u5c11\u9009\u62e9\u4e00\u4e2a\u901a\u77e5\u6e20\u9053") List<String> notifyChannels;
    @NotBlank(message="\u8ba2\u9605\u4eba\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u8ba2\u9605\u4eba\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a") String subscriberName;

    @Generated
    public TmdbFollowSubscribeRequest() {
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public String getMediaType() {
        return this.mediaType;
    }

    @Generated
    public String getLanguage() {
        return this.language;
    }

    @Generated
    public List<String> getNotifyChannels() {
        return this.notifyChannels;
    }

    @Generated
    public String getSubscriberName() {
        return this.subscriberName;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Generated
    public void setLanguage(String language) {
        this.language = language;
    }

    @Generated
    public void setNotifyChannels(List<String> notifyChannels) {
        this.notifyChannels = notifyChannels;
    }

    @Generated
    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollowSubscribeRequest)) {
            return false;
        }
        TmdbFollowSubscribeRequest other = (TmdbFollowSubscribeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        String this$mediaType = this.getMediaType();
        String other$mediaType = other.getMediaType();
        if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) {
            return false;
        }
        String this$language = this.getLanguage();
        String other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) {
            return false;
        }
        List<String> this$notifyChannels = this.getNotifyChannels();
        List<String> other$notifyChannels = other.getNotifyChannels();
        if (this$notifyChannels == null ? other$notifyChannels != null : !((Object)this$notifyChannels).equals(other$notifyChannels)) {
            return false;
        }
        String this$subscriberName = this.getSubscriberName();
        String other$subscriberName = other.getSubscriberName();
        return !(this$subscriberName == null ? other$subscriberName != null : !this$subscriberName.equals(other$subscriberName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowSubscribeRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        String $mediaType = this.getMediaType();
        result = result * 59 + ($mediaType == null ? 43 : $mediaType.hashCode());
        String $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        List<String> $notifyChannels = this.getNotifyChannels();
        result = result * 59 + ($notifyChannels == null ? 43 : ((Object)$notifyChannels).hashCode());
        String $subscriberName = this.getSubscriberName();
        result = result * 59 + ($subscriberName == null ? 43 : $subscriberName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowSubscribeRequest(tmdbId=" + this.getTmdbId() + ", mediaType=" + this.getMediaType() + ", language=" + this.getLanguage() + ", notifyChannels=" + String.valueOf(this.getNotifyChannels()) + ", subscriberName=" + this.getSubscriberName() + ")";
    }
}
