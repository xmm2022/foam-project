/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.servlet.http.HttpServletRequest
 *  jakarta.servlet.http.HttpServletResponse
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.web.servlet.HandlerInterceptor
 */
package com.una.embyhub.config.common.interceptor;

import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.license.License;
import com.una.embyhub.config.license.LicenseManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class UuidLicenseCheckInterceptor
implements HandlerInterceptor {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(UuidLicenseCheckInterceptor.class);
    private LicenseManager licenseManager;

    public UuidLicenseCheckInterceptor(LicenseManager licenseManager) {
        this.licenseManager = licenseManager;
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        License license = this.licenseManager.loadLicense();
        boolean isValid = this.licenseManager.validateLicense(license);
        if (isValid) {
            System.out.println("\u6388\u6743\u9a8c\u8bc1\u901a\u8fc7\uff0c\u6709\u6548\u671f\u81f3: " + String.valueOf(license.getExpiryDate()));
            return true;
        }
        System.out.println("\u6388\u6743\u9a8c\u8bc1\u5931\u8d25");
        throw new BizException(ResponseStatusEnum.LICENSE_ERROR);
    }
}
