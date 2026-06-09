/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.telegram.TelegramLoginRequest;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import com.una.embyhub.model.dto.response.embyuser.EmbyUserCustomResponse;
import com.una.embyhub.service.TelegramAuthService;
import lombok.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"telegramAuth"})
public class TelegramAuthController {
    private final TelegramAuthService telegramAuthService;

    @PostMapping(value={"bind"})
    @OperationLog(value=OperationLogDesc.TELEGRAM_BIND, type=OperationType.ADD)
    @SkipLicense
    public void bind(@RequestBody TelegramLoginRequest request) {
        this.telegramAuthService.bind(request);
    }

    @PostMapping(value={"login"})
    @OperationLog(value=OperationLogDesc.TELEGRAM_LOGIN, type=OperationType.QUERY)
    @SkipLicense
    public EmbyUserCustomResponse login(@RequestBody TelegramLoginRequest request) {
        return this.telegramAuthService.login(request);
    }

    @PostMapping(value={"unbind"})
    @OperationLog(value=OperationLogDesc.TELEGRAM_UNBIND, type=OperationType.DELETE)
    @SkipLicense
    public void unbind() {
        this.telegramAuthService.unbind();
    }

    @GetMapping(value={"loginSession"})
    @SkipLicense
    public String generateLoginSession() {
        return this.telegramAuthService.generateLoginSession();
    }

    @GetMapping(value={"bindSession"})
    @SkipLicense
    public String generateBindSession() {
        return this.telegramAuthService.generateBindSession();
    }

    @GetMapping(value={"checkLogin"})
    @SkipLicense
    public EmbyUserCustomResponse checkLoginStatus(@RequestParam String sessionId) {
        return this.telegramAuthService.checkLoginStatus(sessionId);
    }

    @GetMapping(value={"getBotInfo"})
    @SkipLicense
    public TelegramResponse getBotInfo() {
        return this.telegramAuthService.getBotInfo();
    }