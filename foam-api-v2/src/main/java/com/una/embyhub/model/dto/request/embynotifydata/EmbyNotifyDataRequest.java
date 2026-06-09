/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embynotifydata;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import lombok.Generated;

public class EmbyNotifyDataRequest
implements Serializable {
    @BindQuery(comparison=Comparison.CONTAINS)
    private String name;
    @BindQuery(comparison=Comparison.EQ)
    private String productionYear;
    @BindQuery(comparison=Comparison.EQ)
    private String type;
    @BindQuery(comparison=Comparison.EQ)
    private Integer status;
    @BindQuery(comparison=Comparison.EQ)
    private Long embyInfoId;
    @BindQuery(comparison=Comparison.CONTAINS)
    private String productionCountries;

    @Generated
    public EmbyNotifyDataRequest() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getProductionYear() {
        return this.productionYear;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getProductionCountries() {
        return this.productionCountries;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setProductionCountries(String productionCountries) {
        this.productionCountries = productionCountries;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyNotifyDataRequest)) {
            return false;
        }
        EmbyNotifyDataRequest other = (EmbyNotifyDataRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$productionYear = this.getProductionYear();
        String other$productionYear = other.getProductionYear();
        if (this$productionYear == null ? other$productionYear != null : !this$productionYear.equals(other$productionYear)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$productionCountries = this.getProductionCountries();
        String other$productionCountries = other.getProductionCountries();
        return !(this$productionCountries == null ? other$productionCountries != null : !this$productionCountries.equals(other$productionCountries));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyNotifyDataRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $productionYear = this.getProductionYear();
        result = result * 59 + ($productionYear == null ? 43 : $productionYear.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $productionCountries = this.getProductionCountries();
        result = result * 59 + ($productionCountries == null ? 43 : $productionCountries.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyNotifyDataRequest(name=" + this.getName() + ", productionYear=" + this.getProductionYear() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", embyInfoId=" + this.getEmbyInfoId() + ", productionCountries=" + this.getProductionCountries() + ")";
    }
}
