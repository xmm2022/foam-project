/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  embyclient.ApiException
 *  jakarta.servlet.http.HttpServletRequest
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.http.ResponseEntity$BodyBuilder
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.multipart.MultipartFile
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.common.config.OperationLogAspect;
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.config.license.RequireProduct;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.embyuser.DisableUserRequest;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserAdminUpdate;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserProfileUpdate;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserRequest;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserSave;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserUpdate;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserUpdateData;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserUpdatePassword;
import com.una.embyhub.model.dto.request.embyuser.InsertUserCardRequest;
import com.una.embyhub.model.dto.request.embyuser.LoginRequest;
import com.una.embyhub.model.dto.request.embyuser.RegisteredUserSave;
import com.una.embyhub.model.dto.request.embyuser.SyncEmbyUserRequest;
import com.una.embyhub.model.dto.request.invitation.InvitationRegisterRequest;
import com.una.embyhub.model.dto.response.embyuser.EmbyServerUserStatsResponse;
import com.una.embyhub.model.dto.response.embyuser.EmbyUserCustomResponse;
import com.una.embyhub.model.dto.response.embyuser.EmbyUserDiffResponse;
import com.una.embyhub.model.dto.response.embyuser.EmbyUserResponse;
import com.una.embyhub.model.dto.response.embyuser.InsertUserResponse;
import com.una.embyhub.model.dto.response.embyuser.RegisteredUserResponse;
import com.una.embyhub.model.dto.response.embyuser.UserStatsResponse;
import com.una.embyhub.service.EmbyUserService;
import embyclient.ApiException;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value={"embyUser"})
public class EmbyUserController {
    @Autowired
    private EmbyUserService embyUserService;

    @PostMapping(value={"login"})
    @OperationLog(value=OperationLogDesc.USER_LOGIN, type=OperationType.QUERY)
    @SkipLicense
    public EmbyUserCustomResponse login(@RequestBody LoginRequest loginRequest) {
        return this.embyUserService.login(loginRequest);
    }