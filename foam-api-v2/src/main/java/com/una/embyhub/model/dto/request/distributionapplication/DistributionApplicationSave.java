/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distributionapplication;

import java.io.Serializable;
import lombok.Generated;

public class DistributionApplicationSave
implements Serializable {
    private Integer cardCount;
    private Integer cardDays;
    private Long embyInfoId;

    @Generated
    public DistributionApplicationSave() {
    }

    @Generated
    public Integer getCardCount() {
        return this.cardCount;
    }

    @Generated
    public Integer getCardDays() {
        return this.cardDays;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    @Generated
    public void setCardDays(Integer cardDays) {
        this.cardDays = cardDays;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DistributionApplicationSave)) {
            return false;
        }
        DistributionApplicationSave other = (DistributionApplicationSave)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$cardCount = this.getCardCount();
        Integer other$cardCount = other.getCardCount();
        if (this$cardCount == null ? other$cardCount != null : !((Object)this$cardCount).equals(other$cardCount)) {
            return false;
        }
        Integer this$cardDays = this.getCardDays();
        Integer other$cardDays = other.getCardDays();
        if (this$cardDays == null ? other$cardDays != null : !((Object)this$cardDays).equals(other$cardDays)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        return !(this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DistributionApplicationSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $cardCount = this.getCardCount();
        result = result * 59 + ($cardCount == null ? 43 : ((Object)$cardCount).hashCode());
        Integer $cardDays = this.getCardDays();
        result = result * 59 + ($cardDays == null ? 43 : ((Object)$cardDays).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DistributionApplicationSave(cardCount=" + this.getCardCount() + ", cardDays=" + this.getCardDays() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
