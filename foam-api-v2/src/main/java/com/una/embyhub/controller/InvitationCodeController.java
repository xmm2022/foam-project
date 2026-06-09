/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.model.dto.request.invitation.InvitationCodeGenerateRequest;
import com.una.embyhub.model.dto.request.invitation.InvitationCodeQueryRequest;
import com.una.embyhub.model.dto.response.invitation.InvitationCodeResponse;
import com.una.embyhub.model.dto.response.invitation.InvitationCodeStatusResponse;
import com.una.embyhub.service.InvitationCodeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"invitationCode"})
public class InvitationCodeController {
    @Autowired
    private InvitationCodeService invitationCodeService;

    @PostMapping(value={"generate"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.GENERATE_INVITATION_CODE, type=OperationType.ADD)
    public List<InvitationCodeResponse> generate(@RequestBody @Validated InvitationCodeGenerateRequest request) {
        return this.invitationCodeService.generate(request);
    }

    @PostMapping(value={"list"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.QUERY_INVITATION_CODE, type=OperationType.QUERY)
    public Page<InvitationCodeResponse> list(@RequestBody(required=false) InvitationCodeQueryRequest request) {
        return this.invitationCodeService.query(request);
    }

    @PostMapping(value={"delete"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.DELETE_INVITATION_CODE, type=OperationType.DELETE)
    public void delete(@RequestParam Long id) {
        this.invitationCodeService.deleteById(id);
    }

    @PostMapping(value={"status"})
    @SaCheckPermission(value={"admin"})
    public InvitationCodeStatusResponse status() {
        return this.invitationCodeService.status();
    }
}