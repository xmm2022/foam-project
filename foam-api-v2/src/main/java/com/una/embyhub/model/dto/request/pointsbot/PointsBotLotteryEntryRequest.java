/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsbot;

import java.io.Serializable;
import lombok.Generated;

public class PointsBotLotteryEntryRequest
implements Serializable {
    private Long lotteryId;
    private Long chatId;
    private Long userId;

    @Generated
    public PointsBotLotteryEntryRequest() {
    }

    @Generated
    public Long getLotteryId() {
        return this.lotteryId;
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
    public void setLotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLotteryEntryRequest)) {
            return false;
        }
        PointsBotLotteryEntryRequest other = (PointsBotLotteryEntryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$lotteryId = this.getLotteryId();
        Long other$lotteryId = other.getLotteryId();
        if (this$lotteryId == null ? other$lotteryId != null : !((Object)this$lotteryId).equals(other$lotteryId)) {
            return false;
        }
        Long this$chatId = this.getChatId();
        Long other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !((Object)this$chatId).equals(other$chatId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        return !(this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLotteryEntryRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $lotteryId = this.getLotteryId();
        result = result * 59 + ($lotteryId == null ? 43 : ((Object)$lotteryId).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLotteryEntryRequest(lotteryId=" + this.getLotteryId() + ", chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ")";
    }
}
