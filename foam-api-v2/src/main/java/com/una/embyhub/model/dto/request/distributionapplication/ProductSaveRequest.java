/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.distributionapplication;

import java.io.Serializable;
import lombok.Generated;

public class ProductSaveRequest
implements Serializable {
    private Long id;
    private String name;
    private String productType;
    private Integer pointsCost;
    private Integer productValue;
    private Long embyInfoId;
    private Integer isEnabled;
    private Integer sortOrder;

    @Generated
    public ProductSaveRequest() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getProductType() {
        return this.productType;
    }

    @Generated
    public Integer getPointsCost() {
        return this.pointsCost;
    }

    @Generated
    public Integer getProductValue() {
        return this.productValue;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getIsEnabled() {
        return this.isEnabled;
    }

    @Generated
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Generated
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    @Generated
    public void setProductValue(Integer productValue) {
        this.productValue = productValue;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Generated
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSaveRequest)) {
            return false;
        }
        ProductSaveRequest other = (ProductSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$pointsCost = this.getPointsCost();
        Integer other$pointsCost = other.getPointsCost();
        if (this$pointsCost == null ? other$pointsCost != null : !((Object)this$pointsCost).equals(other$pointsCost)) {
            return false;
        }
        Integer this$productValue = this.getProductValue();
        Integer other$productValue = other.getProductValue();
        if (this$productValue == null ? other$productValue != null : !((Object)this$productValue).equals(other$productValue)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$isEnabled = this.getIsEnabled();
        Integer other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        Integer this$sortOrder = this.getSortOrder();
        Integer other$sortOrder = other.getSortOrder();
        if (this$sortOrder == null ? other$sortOrder != null : !((Object)this$sortOrder).equals(other$sortOrder)) {
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
        return other instanceof ProductSaveRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $pointsCost = this.getPointsCost();
        result = result * 59 + ($pointsCost == null ? 43 : ((Object)$pointsCost).hashCode());
        Integer $productValue = this.getProductValue();
        result = result * 59 + ($productValue == null ? 43 : ((Object)$productValue).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        Integer $sortOrder = this.getSortOrder();
        result = result * 59 + ($sortOrder == null ? 43 : ((Object)$sortOrder).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $productType = this.getProductType();
        result = result * 59 + ($productType == null ? 43 : $productType.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ProductSaveRequest(id=" + this.getId() + ", name=" + this.getName() + ", productType=" + this.getProductType() + ", pointsCost=" + this.getPointsCost() + ", productValue=" + this.getProductValue() + ", embyInfoId=" + this.getEmbyInfoId() + ", isEnabled=" + this.getIsEnabled() + ", sortOrder=" + this.getSortOrder() + ")";
    }
}
