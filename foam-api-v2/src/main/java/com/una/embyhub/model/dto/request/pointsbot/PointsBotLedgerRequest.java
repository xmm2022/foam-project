/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import java.io.Serializable;
import lombok.Generated;

public class PointsBotLedgerRequest
implements Serializable {
    private Long chatId;
    private Long userId;
    private String reason;

    @Generated
    public PointsBotLedgerRequest() {
    }

    @Generated
    public Long getChatId() {
        return this.chatId;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getReason() {
        return this.reason;
    }

    @Generated
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLedgerRequest)) {
            return false;
        }
        PointsBotLedgerRequest other = (PointsBotLedgerRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$chatId = this.getChatId();
        Long other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !((Object)this$chatId).equals(other$chatId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        String this$reason = this.getReason();
        String other$reason = other.getReason();
        return !(this$reason == null ? other$reason != null : !this$reason.equals(other$reason));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLedgerRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        String $reason = this.getReason();
        result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLedgerRequest(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", reason=" + this.getReason() + ")";
    }
}
