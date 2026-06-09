/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
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
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.model.dto.request.requestpackages.RequestPackagesSave;
import com.una.embyhub.model.dto.request.requestpackages.RequestPackagesUpdate;
import com.una.embyhub.model.dto.response.requestpackages.RequestPackagesResponse;
import com.una.embyhub.service.RequestPackagesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"requestPackages"})
public class RequestPackagesController {
    @Autowired
    private RequestPackagesService requestPackagesService;

    @PostMapping(value={"select"})
    public List<RequestPackagesResponse> list() {
        return this.requestPackagesService.select();
    }

    @PostMapping(value={"insertRequestPackages"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.ADD_REQUEST_PACKAGES, type=OperationType.ADD)
    public void insertRequestPackages(@RequestBody @Validated RequestPackagesSave requestPackagesSave) {
        this.requestPackagesService.insertRequestPackages(requestPackagesSave);
    }

    @PostMapping(value={"updateRequestPackages"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.UPDATE_REQUEST_PACKAGES, type=OperationType.MODIFY)
    public void updateRequestPackages(@RequestBody @Validated RequestPackagesUpdate requestPackagesUpdate) {
        this.requestPackagesService.updateRequestPackages(requestPackagesUpdate);
    }

    @PostMapping(value={"deleteByRequestPackagesId"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.DELETE_REQUEST_PACKAGES, type=OperationType.DELETE)
    public void deleteByRequestPackagesId(@RequestParam Long requestPackagesId) {
        this.requestPackagesService.deleteByRequestPackagesId(requestPackagesId);
    }
}