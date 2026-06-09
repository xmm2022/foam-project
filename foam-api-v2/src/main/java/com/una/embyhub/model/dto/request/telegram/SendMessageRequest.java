/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.telegram.telegrambots.meta.generics.TelegramClient
 */
package com.una.embyhub.model.dto.request.telegram;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class SendMessageRequest
implements Serializable {
    private String chatId;
    private String name;
    private String overview;
    private String tmdbUrl;
    private String imgUrl;
    private String parseMode;
    private String serverUrl;
    private String serverName;
    private TelegramClient telegramClient;
    private Map<String, String> extraVariables = new HashMap<String, String>();

    @Generated
    public SendMessageRequest() {
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
    public String getParseMode() {
        return this.parseMode;
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
    public TelegramClient getTelegramClient() {
        return this.telegramClient;
    }

    @Generated
    public Map<String, String> getExtraVariables() {
        return this.extraVariables;
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
    public void setOverview(String overview) {
        this.overview = overview;
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
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
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
    public void setTelegramClient(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @Generated
    public void setExtraVariables(Map<String, String> extraVariables) {
        this.extraVariables = extraVariables;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SendMessageRequest)) {
            return false;
        }
        SendMessageRequest other = (SendMessageRequest)o;
        if (!other.canEqual(this)) {
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
        String this$parseMode = this.getParseMode();
        String other$parseMode = other.getParseMode();
        if (this$parseMode == null ? other$parseMode != null : !this$parseMode.equals(other$parseMode)) {
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
        TelegramClient this$telegramClient = this.getTelegramClient();
        TelegramClient other$telegramClient = other.getTelegramClient();
        if (this$telegramClient == null ? other$telegramClient != null : !this$telegramClient.equals(other$telegramClient)) {
            return false;
        }
        Map<String, String> this$extraVariables = this.getExtraVariables();
        Map<String, String> other$extraVariables = other.getExtraVariables();
        return !(this$extraVariables == null ? other$extraVariables != null : !((Object)this$extraVariables).equals(other$extraVariables));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SendMessageRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $tmdbUrl = this.getTmdbUrl();
        result = result * 59 + ($tmdbUrl == null ? 43 : $tmdbUrl.hashCode());
        String $imgUrl = this.getImgUrl();
        result = result * 59 + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        String $parseMode = this.getParseMode();
        result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
        String $serverUrl = this.getServerUrl();
        result = result * 59 + ($serverUrl == null ? 43 : $serverUrl.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        TelegramClient $telegramClient = this.getTelegramClient();
        result = result * 59 + ($telegramClient == null ? 43 : $telegramClient.hashCode());
        Map<String, String> $extraVariables = this.getExtraVariables();
        result = result * 59 + ($extraVariables == null ? 43 : ((Object)$extraVariables).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SendMessageRequest(chatId=" + this.getChatId() + ", name=" + this.getName() + ", overview=" + this.getOverview() + ", tmdbUrl=" + this.getTmdbUrl() + ", imgUrl=" + this.getImgUrl() + ", parseMode=" + this.getParseMode() + ", serverUrl=" + this.getServerUrl() + ", serverName=" + this.getServerName() + ", telegramClient=" + String.valueOf(this.getTelegramClient()) + ", extraVariables=" + String.valueOf(this.getExtraVariables()) + ")";
    }
}
