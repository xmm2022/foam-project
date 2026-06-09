/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  cn.dev33.satoken.stp.StpUtil
 *  com.alibaba.fastjson2.JSONObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.http.CacheControl
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.http.ResponseEntity$BodyBuilder
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.dev33.satoken.stp.StpUtil;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.config.license.RequireProduct;
import com.una.embyhub.model.dto.request.rose.RoseAdminUnbindRequest;
import com.una.embyhub.model.dto.request.rose.RoseBindRequest;
import com.una.embyhub.model.dto.request.rose.RoseLibraryBrowseRequest;
import com.una.embyhub.model.dto.request.rose.RoseQrStartRequest;
import com.una.embyhub.model.dto.response.rose.RoseBindingResponse;
import com.una.embyhub.model.dto.response.rose.RoseProfileResponse;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.RoseUserBindingService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"rose"})
public class RoseController {
    @Autowired
    private RoseUserBindingService roseUserBindingService;
    @Autowired
    private EmbyUserService embyUserService;

    @GetMapping(value={"profile"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public RoseProfileResponse profile() {
        return this.roseUserBindingService.profile(this.currentUser(), true);
    }

    @PostMapping(value={"profile"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public RoseProfileResponse profilePost() {
        return this.profile();
    }

    @PostMapping(value={"qr/start"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public JSONObject startQr(@RequestBody RoseQrStartRequest request) {
        return this.roseUserBindingService.startQr(this.currentUser(), request);
    }

    @GetMapping(value={"qr/{sessionId}"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public JSONObject qrStatus(@PathVariable String sessionId) {
        return this.roseUserBindingService.qrStatus(this.currentUser(), sessionId);
    }