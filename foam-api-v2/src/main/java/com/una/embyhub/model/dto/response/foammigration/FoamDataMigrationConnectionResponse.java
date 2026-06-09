/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.foammigration;

import java.io.Serializable;
import lombok.Generated;

public class FoamDataMigrationConnectionResponse
implements Serializable {
    private String productName;
    private String productVersion;
    private String catalog;
    private Integer supportedTableCount;
    private Integer availableTableCount;
    private Integer missingTableCount;

    @Generated
    public FoamDataMigrationConnectionResponse() {
    }

    @Generated
    public String getProductName() {
        return this.productName;
    }

    @Generated
    public String getProductVersion() {
        return this.productVersion;
    }

    @Generated
    public String getCatalog() {
        return this.catalog;
    }

    @Generated
    public Integer getSupportedTableCount() {
        return this.supportedTableCount;
    }

    @Generated
    public Integer getAvailableTableCount() {
        return this.availableTableCount;
    }

    @Generated
    public Integer getMissingTableCount() {
        return this.missingTableCount;
    }

    @Generated
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    @Generated
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Generated
    public void setSupportedTableCount(Integer supportedTableCount) {
        this.supportedTableCount = supportedTableCount;
    }

    @Generated
    public void setAvailableTableCount(Integer availableTableCount) {
        this.availableTableCount = availableTableCount;
    }

    @Generated
    public void setMissingTableCount(Integer missingTableCount) {
        this.missingTableCount = missingTableCount;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationConnectionResponse)) {
            return false;
        }
        FoamDataMigrationConnectionResponse other = (FoamDataMigrationConnectionResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$supportedTableCount = this.getSupportedTableCount();
        Integer other$supportedTableCount = other.getSupportedTableCount();
        if (this$supportedTableCount == null ? other$supportedTableCount != null : !((Object)this$supportedTableCount).equals(other$supportedTableCount)) {
            return false;
        }
        Integer this$availableTableCount = this.getAvailableTableCount();
        Integer other$availableTableCount = other.getAvailableTableCount();
        if (this$availableTableCount == null ? other$availableTableCount != null : !((Object)this$availableTableCount).equals(other$availableTableCount)) {
            return false;
        }
        Integer this$missingTableCount = this.getMissingTableCount();
        Integer other$missingTableCount = other.getMissingTableCount();
        if (this$missingTableCount == null ? other$missingTableCount != null : !((Object)this$missingTableCount).equals(other$missingTableCount)) {
            return false;
        }
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        String this$productVersion = this.getProductVersion();
        String other$productVersion = other.getProductVersion();
        if (this$productVersion == null ? other$productVersion != null : !this$productVersion.equals(other$productVersion)) {
            return false;
        }
        String this$catalog = this.getCatalog();
        String other$catalog = other.getCatalog();
        return !(this$catalog == null ? other$catalog != null : !this$catalog.equals(other$catalog));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationConnectionResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $supportedTableCount = this.getSupportedTableCount();
        result = result * 59 + ($supportedTableCount == null ? 43 : ((Object)$supportedTableCount).hashCode());
        Integer $availableTableCount = this.getAvailableTableCount();
        result = result * 59 + ($availableTableCount == null ? 43 : ((Object)$availableTableCount).hashCode());
        Integer $missingTableCount = this.getMissingTableCount();
        result = result * 59 + ($missingTableCount == null ? 43 : ((Object)$missingTableCount).hashCode());
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        String $productVersion = this.getProductVersion();
        result = result * 59 + ($productVersion == null ? 43 : $productVersion.hashCode());
        String $catalog = this.getCatalog();
        result = result * 59 + ($catalog == null ? 43 : $catalog.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationConnectionResponse(productName=" + this.getProductName() + ", productVersion=" + this.getProductVersion() + ", catalog=" + this.getCatalog() + ", supportedTableCount=" + this.getSupportedTableCount() + ", availableTableCount=" + this.getAvailableTableCount() + ", missingTableCount=" + this.getMissingTableCount() + ")";
    }
}
