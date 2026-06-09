/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.multipart.MultipartFile
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.license.License;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.license.LicenseCodeActivateRequest;
import com.una.embyhub.model.dto.response.license.LicenseStatusResponse;
import com.una.embyhub.service.LicenseService;
import jakarta.validation.Valid;
import java.io.IOException;
import lombok.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value={"/license"})
@SkipLicense
public class LicenseController {
    private final LicenseService licenseService;

    @GetMapping(value={"/info"})
    public String getLicenseInfo() {
        return this.licenseService.getLicenseInfo();
    }

    @GetMapping(value={"/status"})
    public LicenseStatusResponse status() {
        return this.licenseService.getLicenseStatus();
    }

    @PostMapping(value={"/activate"})
    public LicenseStatusResponse activateLicense(@Valid @RequestBody LicenseCodeActivateRequest request) {
        return this.licenseService.activateLicenseCode(request.getLicenseCode());
    }

    @PostMapping(value={"/unbind"})
    @SaCheckPermission(value={"admin"})
    public LicenseStatusResponse unbindLicense() {
        return this.licenseService.unbindLicense();
    }

    @PostMapping(value={"/activate-file"}, consumes={"multipart/form-data"})
    public String activateLicenseFile(@RequestParam(value="file") MultipartFile file) throws IOException, ClassNotFoundException {
        return this.licenseService.activateLicense(file);
    }

    @PostMapping(value={"/getLinceseStatus"})
    @SaCheckPermission(value={"admin"})
    public License getLinceseStatus() throws IOException, ClassNotFoundException {
        return this.licenseService.getLinceseStatus();
    }

    @GetMapping(value={"/local"})
    @SaCheckPermission(value={"admin"})
    public License getLocalLicense() throws IOException, ClassNotFoundException {
        return this.licenseService.getLocalLicense();
    }

    @GetMapping(value={"/localWithCustomException"})
    public License getLocalLicenseWithCustomException() throws IOException, ClassNotFoundException {