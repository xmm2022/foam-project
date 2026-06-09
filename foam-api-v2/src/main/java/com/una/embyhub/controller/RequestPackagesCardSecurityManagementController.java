/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
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
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.requestpackagescardsecuritymanagement.RequestPackagesCardSecurityManagementRequest;
import com.una.embyhub.model.dto.response.requestpackagescardsecuritymanagement.RequestPackagesCardSecurityManagementResponse;
import com.una.embyhub.model.dto.response.requestpackagescardsecuritymanagement.RequestPackagesCardSecurityManagementStatusResponse;
import com.una.embyhub.service.RequestPackagesCardSecurityManagementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"requestPackagesCardSecurityManagement"})
public class RequestPackagesCardSecurityManagementController {
    @Autowired
    private RequestPackagesCardSecurityManagementService requestPackagesCardSecurityManagementService;

    @PostMapping(value={"select"})
    @OperationLog(value=OperationLogDesc.QUERY_REQUEST_PACKAGES_CARD_MANAGEMENT, type=OperationType.QUERY)
    public Page<RequestPackagesCardSecurityManagementResponse> select(@RequestBody MybatisPlusPage<RequestPackagesCardSecurityManagementRequest> page) {
        return this.requestPackagesCardSecurityManagementService.select(page);
    }

    @PostMapping(value={"verification"})
    @OperationLog(value=OperationLogDesc.VERIFY_REQUEST_PACKAGES_CARD, type=OperationType.QUERY)
    public void verification(@RequestParam String cardPassword) {
        this.requestPackagesCardSecurityManagementService.verification(cardPassword);
    }

    @PostMapping(value={"add"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.BATCH_ADD_REQUEST_PACKAGES_CARD, type=OperationType.ADD)
    public List<String> add(@RequestParam Integer count, @RequestParam Integer num) {
        return this.requestPackagesCardSecurityManagementService.add(count, num);
    }

    @PostMapping(value={"delete"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.BATCH_DELETE_REQUEST_PACKAGES_CARD, type=OperationType.DELETE)
    public void delete(@RequestBody List<Long> idList) {
        this.requestPackagesCardSecurityManagementService.delete(idList);
    }

    @PostMapping(value={"status"})
    @SaCheckPermission(value={"admin"})
    public RequestPackagesCardSecurityManagementStatusResponse status() {
        return this.requestPackagesCardSecurityManagementService.status();
    }
}