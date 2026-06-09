/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.requestpackages;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Generated;

public class RequestPackagesSave
implements Serializable {
    private String title;
    private String description;
    private Integer count;
    private String icon;
    private BigDecimal amount;

    @Generated
    public RequestPackagesSave() {
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public String getIcon() {
        return this.icon;
    }

    @Generated
    public BigDecimal getAmount() {
        return this.amount;
    }

    @Generated
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Generated
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestPackagesSave)) {
            return false;
        }
        RequestPackagesSave other = (RequestPackagesSave)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$count = this.getCount();
        Integer other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$icon = this.getIcon();
        String other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) {
            return false;
        }
        BigDecimal this$amount = this.getAmount();
        BigDecimal other$amount = other.getAmount();
        return !(this$amount == null ? other$amount != null : !((Object)this$amount).equals(other$amount));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestPackagesSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $icon = this.getIcon();
        result = result * 59 + ($icon == null ? 43 : $icon.hashCode());
        BigDecimal $amount = this.getAmount();
        result = result * 59 + ($amount == null ? 43 : ((Object)$amount).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestPackagesSave(title=" + this.getTitle() + ", description=" + this.getDescription() + ", count=" + this.getCount() + ", icon=" + this.getIcon() + ", amount=" + String.valueOf(this.getAmount()) + ")";
    }
}
