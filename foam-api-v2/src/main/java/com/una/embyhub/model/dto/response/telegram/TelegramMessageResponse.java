/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.telegram;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class TelegramMessageResponse
implements Serializable {
    private String title;
    private String textContent;
    private String imageUrl;
    private String messageLink;
    private String time;
    private Integer messageId;
    private String channelName;
    private List<String> shareLinks;

    @Generated
    public TelegramMessageResponse() {
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public String getTextContent() {
        return this.textContent;
    }

    @Generated
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Generated
    public String getMessageLink() {
        return this.messageLink;
    }

    @Generated
    public String getTime() {
        return this.time;
    }

    @Generated
    public Integer getMessageId() {
        return this.messageId;
    }

    @Generated
    public String getChannelName() {
        return this.channelName;
    }

    @Generated
    public List<String> getShareLinks() {
        return this.shareLinks;
    }

    @Generated
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Generated
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Generated
    public void setMessageLink(String messageLink) {
        this.messageLink = messageLink;
    }

    @Generated
    public void setTime(String time) {
        this.time = time;
    }

    @Generated
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Generated
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated
    public void setShareLinks(List<String> shareLinks) {
        this.shareLinks = shareLinks;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TelegramMessageResponse)) {
            return false;
        }
        TelegramMessageResponse other = (TelegramMessageResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$messageId = this.getMessageId();
        Integer other$messageId = other.getMessageId();
        if (this$messageId == null ? other$messageId != null : !((Object)this$messageId).equals(other$messageId)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$textContent = this.getTextContent();
        String other$textContent = other.getTextContent();
        if (this$textContent == null ? other$textContent != null : !this$textContent.equals(other$textContent)) {
            return false;
        }
        String this$imageUrl = this.getImageUrl();
        String other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) {
            return false;
        }
        String this$messageLink = this.getMessageLink();
        String other$messageLink = other.getMessageLink();
        if (this$messageLink == null ? other$messageLink != null : !this$messageLink.equals(other$messageLink)) {
            return false;
        }
        String this$time = this.getTime();
        String other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) {
            return false;
        }
        String this$channelName = this.getChannelName();
        String other$channelName = other.getChannelName();
        if (this$channelName == null ? other$channelName != null : !this$channelName.equals(other$channelName)) {
            return false;
        }
        List<String> this$shareLinks = this.getShareLinks();
        List<String> other$shareLinks = other.getShareLinks();
        return !(this$shareLinks == null ? other$shareLinks != null : !((Object)this$shareLinks).equals(other$shareLinks));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TelegramMessageResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $messageId = this.getMessageId();
        result = result * 59 + ($messageId == null ? 43 : ((Object)$messageId).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $textContent = this.getTextContent();
        result = result * 59 + ($textContent == null ? 43 : $textContent.hashCode());
        String $imageUrl = this.getImageUrl();
        result = result * 59 + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        String $messageLink = this.getMessageLink();
        result = result * 59 + ($messageLink == null ? 43 : $messageLink.hashCode());
        String $time = this.getTime();
        result = result * 59 + ($time == null ? 43 : $time.hashCode());
        String $channelName = this.getChannelName();
        result = result * 59 + ($channelName == null ? 43 : $channelName.hashCode());
        List<String> $shareLinks = this.getShareLinks();
        result = result * 59 + ($shareLinks == null ? 43 : ((Object)$shareLinks).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TelegramMessageResponse(title=" + this.getTitle() + ", textContent=" + this.getTextContent() + ", imageUrl=" + this.getImageUrl() + ", messageLink=" + this.getMessageLink() + ", time=" + this.getTime() + ", messageId=" + this.getMessageId() + ", channelName=" + this.getChannelName() + ", shareLinks=" + String.valueOf(this.getShareLinks()) + ")";
    }
}
