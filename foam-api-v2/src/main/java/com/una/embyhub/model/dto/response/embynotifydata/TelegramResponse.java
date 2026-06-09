/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydata;

import java.io.Serializable;
import lombok.Generated;

public class TelegramResponse
implements Serializable {
    private String botToken;
    private Integer apiId;
    private String apiHash;
    private String botChatId;
    private String botChatGroupId;
    private String botName;

    @Generated
    public TelegramResponse() {
    }

    @Generated
    public String getBotToken() {
        return this.botToken;
    }

    @Generated
    public Integer getApiId() {
        return this.apiId;
    }

    @Generated
    public String getApiHash() {
        return this.apiHash;
    }

    @Generated
    public String getBotChatId() {
        return this.botChatId;
    }

    @Generated
    public String getBotChatGroupId() {
        return this.botChatGroupId;
    }

    @Generated
    public String getBotName() {
        return this.botName;
    }

    @Generated
    public void setBotToken(String botToken) {
        this.botToken = botToken;
    }

    @Generated
    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    @Generated
    public void setApiHash(String apiHash) {
        this.apiHash = apiHash;
    }

    @Generated
    public void setBotChatId(String botChatId) {
        this.botChatId = botChatId;
    }

    @Generated
    public void setBotChatGroupId(String botChatGroupId) {
        this.botChatGroupId = botChatGroupId;
    }

    @Generated
    public void setBotName(String botName) {
        this.botName = botName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TelegramResponse)) {
            return false;
        }
        TelegramResponse other = (TelegramResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$apiId = this.getApiId();
        Integer other$apiId = other.getApiId();
        if (this$apiId == null ? other$apiId != null : !((Object)this$apiId).equals(other$apiId)) {
            return false;
        }
        String this$botToken = this.getBotToken();
        String other$botToken = other.getBotToken();
        if (this$botToken == null ? other$botToken != null : !this$botToken.equals(other$botToken)) {
            return false;
        }
        String this$apiHash = this.getApiHash();
        String other$apiHash = other.getApiHash();
        if (this$apiHash == null ? other$apiHash != null : !this$apiHash.equals(other$apiHash)) {
            return false;
        }
        String this$botChatId = this.getBotChatId();
        String other$botChatId = other.getBotChatId();
        if (this$botChatId == null ? other$botChatId != null : !this$botChatId.equals(other$botChatId)) {
            return false;
        }
        String this$botChatGroupId = this.getBotChatGroupId();
        String other$botChatGroupId = other.getBotChatGroupId();
        if (this$botChatGroupId == null ? other$botChatGroupId != null : !this$botChatGroupId.equals(other$botChatGroupId)) {
            return false;
        }
        String this$botName = this.getBotName();
        String other$botName = other.getBotName();
        return !(this$botName == null ? other$botName != null : !this$botName.equals(other$botName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TelegramResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $apiId = this.getApiId();
        result = result * 59 + ($apiId == null ? 43 : ((Object)$apiId).hashCode());
        String $botToken = this.getBotToken();
        result = result * 59 + ($botToken == null ? 43 : $botToken.hashCode());
        String $apiHash = this.getApiHash();
        result = result * 59 + ($apiHash == null ? 43 : $apiHash.hashCode());
        String $botChatId = this.getBotChatId();
        result = result * 59 + ($botChatId == null ? 43 : $botChatId.hashCode());
        String $botChatGroupId = this.getBotChatGroupId();
        result = result * 59 + ($botChatGroupId == null ? 43 : $botChatGroupId.hashCode());
        String $botName = this.getBotName();
        result = result * 59 + ($botName == null ? 43 : $botName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TelegramResponse(botToken=" + this.getBotToken() + ", apiId=" + this.getApiId() + ", apiHash=" + this.getApiHash() + ", botChatId=" + this.getBotChatId() + ", botChatGroupId=" + this.getBotChatGroupId() + ", botName=" + this.getBotName() + ")";
    }
}
