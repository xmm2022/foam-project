/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distributionapplication;

import java.io.Serializable;
import lombok.Generated;

public class ExchangeRequest
implements Serializable {
    private Long productId;

    @Generated
    public ExchangeRequest() {
    }

    @Generated
    public Long getProductId() {
        return this.productId;
    }

    @Generated
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ExchangeRequest)) {
            return false;
        }
        ExchangeRequest other = (ExchangeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        return !(this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ExchangeRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ExchangeRequest(productId=" + this.getProductId() + ")";
    }
}
