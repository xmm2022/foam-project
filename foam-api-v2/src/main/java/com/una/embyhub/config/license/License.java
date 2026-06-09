/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.license;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class License
implements Serializable {
    private String uuid;
    private String licenseKey;
    private Date issueDate;
    private Date expiryDate;
    private boolean valid;
    private String product;

    @Generated
    public License() {
    }

    @Generated
    public String getUuid() {
        return this.uuid;
    }

    @Generated
    public String getLicenseKey() {
        return this.licenseKey;
    }

    @Generated
    public Date getIssueDate() {
        return this.issueDate;
    }

    @Generated
    public Date getExpiryDate() {
        return this.expiryDate;
    }

    @Generated
    public boolean isValid() {
        return this.valid;
    }

    @Generated
    public String getProduct() {
        return this.product;
    }

    @Generated
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Generated
    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    @Generated
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Generated
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Generated
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Generated
    public void setProduct(String product) {
        this.product = product;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof License)) {
            return false;
        }
        License other = (License)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isValid() != other.isValid()) {
            return false;
        }
        String this$uuid = this.getUuid();
        String other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) {
            return false;
        }
        String this$licenseKey = this.getLicenseKey();
        String other$licenseKey = other.getLicenseKey();
        if (this$licenseKey == null ? other$licenseKey != null : !this$licenseKey.equals(other$licenseKey)) {
            return false;
        }
        Date this$issueDate = this.getIssueDate();
        Date other$issueDate = other.getIssueDate();
        if (this$issueDate == null ? other$issueDate != null : !((Object)this$issueDate).equals(other$issueDate)) {
            return false;
        }
        Date this$expiryDate = this.getExpiryDate();
        Date other$expiryDate = other.getExpiryDate();
        if (this$expiryDate == null ? other$expiryDate != null : !((Object)this$expiryDate).equals(other$expiryDate)) {
            return false;
        }
        String this$product = this.getProduct();
        String other$product = other.getProduct();
        return !(this$product == null ? other$product != null : !this$product.equals(other$product));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof License;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isValid() ? 79 : 97);
        String $uuid = this.getUuid();
        result = result * 59 + ($uuid == null ? 43 : $uuid.hashCode());
        String $licenseKey = this.getLicenseKey();
        result = result * 59 + ($licenseKey == null ? 43 : $licenseKey.hashCode());
        Date $issueDate = this.getIssueDate();
        result = result * 59 + ($issueDate == null ? 43 : ((Object)$issueDate).hashCode());
        Date $expiryDate = this.getExpiryDate();
        result = result * 59 + ($expiryDate == null ? 43 : ((Object)$expiryDate).hashCode());
        String $product = this.getProduct();
        result = result * 59 + ($product == null ? 43 : $product.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "License(uuid=" + this.getUuid() + ", licenseKey=" + this.getLicenseKey() + ", issueDate=" + String.valueOf(this.getIssueDate()) + ", expiryDate=" + String.valueOf(this.getExpiryDate()) + ", valid=" + this.isValid() + ", product=" + this.getProduct() + ")";
    }
}
