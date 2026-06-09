/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distributionapplication;

import java.io.Serializable;
import lombok.Generated;

public class ProductListRequest
implements Serializable {
    private String name;
    private Integer isEnabled;
    private String productType;

    @Generated
    public ProductListRequest() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public Integer getIsEnabled() {
        return this.isEnabled;
    }

    @Generated
    public String getProductType() {
        return this.productType;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Generated
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductListRequest)) {
            return false;
        }
        ProductListRequest other = (ProductListRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$isEnabled = this.getIsEnabled();
        Integer other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$productType = this.getProductType();
        String other$productType = other.getProductType();
        return !(this$productType == null ? other$productType != null : !this$productType.equals(other$productType));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ProductListRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $productType = this.getProductType();
        result = result * 59 + ($productType == null ? 43 : $productType.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ProductListRequest(name=" + this.getName() + ", isEnabled=" + this.getIsEnabled() + ", productType=" + this.getProductType() + ")";
    }
}
