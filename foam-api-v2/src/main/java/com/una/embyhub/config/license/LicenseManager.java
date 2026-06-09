/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.license;

import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.license.License;
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.model.dto.response.license.LicenseStatusResponse;
import com.una.embyhub.service.LicenseService;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import lombok.Generated;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class LicenseManager {
    private final LicenseService licenseService;

    public License generateLicense(String uuid, Date expiryDate, String product) {
        License license = new License();
        license.setUuid(uuid);
        license.setIssueDate(new Date());
        license.setExpiryDate(expiryDate);
        license.setProduct(product);
        license.setValid(true);
        return license;
    }

    public void saveLicense(License license) {
    }

    public License loadLicense() throws IOException, ClassNotFoundException {
        LicenseStatusResponse status = this.licenseService.getLicenseStatus();
        if (!status.isActivated()) {
            return null;
        }
        License license = new License();
        license.setUuid(status.getDeviceFingerprint());
        license.setLicenseKey(status.getLicenseCode());
        license.setIssueDate(new Date());
        license.setProduct(StringUtils.hasText((String)status.getStatus()) ? status.getStatus() : "foam");
        license.setValid(status.isValid());
        return license;
    }

    public License loadLicense(byte[] encryptedData) throws IOException, ClassNotFoundException {
        String licenseCode = new String(encryptedData, StandardCharsets.UTF_8).trim();
        this.licenseService.activateLicenseCode(licenseCode);
        return this.licenseService.getLocalLicense();
    }

    public boolean validateLicense(License license) {
        return license != null && license.isValid();
    }

    public void checkLicenseAndProduct(LicenseProductEnum requiredProduct) {
        try {
            this.licenseService.verifyOrThrow(requiredProduct == null ? "system" : requiredProduct.getValue());
        }
        catch (BizException e) {
            throw e;
        }
        catch (Exception e) {
            throw new BizException(ResponseStatusEnum.LICENSE_ERROR);
        }
    }

    @Generated
    public LicenseManager(LicenseService licenseService) {
        this.licenseService = licenseService;
    }
}
