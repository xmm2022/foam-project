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
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.requestlist.RequestListAudit;
import com.una.embyhub.model.dto.request.requestlist.RequestListReject;
import com.una.embyhub.model.dto.request.requestlist.RequestListRequest;
import com.una.embyhub.model.dto.request.requestlist.RequestListSave;
import com.una.embyhub.model.dto.request.requestlist.RequestListUpdate;
import com.una.embyhub.model.dto.response.embyuser.EmbyUserResponse;
import com.una.embyhub.model.dto.response.requestlist.RequestListResponse;
import com.una.embyhub.service.RequestListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"requestList"})
@SkipLicense
public class RequestListController {
    @Autowired
    private RequestListService requestListService;

    @PostMapping(value={"select"})
    public Page<RequestListResponse> select(@RequestBody MybatisPlusPage<RequestListRequest> page) {
        return this.requestListService.select(page);
    }

    @PostMapping(value={"insertRequestList"})
    @OperationLog(value=OperationLogDesc.ADD_REQUEST, type=OperationType.ADD)
    public EmbyUserResponse insertRequestList(@RequestBody @Validated RequestListSave requestListSave) {
        return this.requestListService.insertRequestList(requestListSave);
    }

    @PostMapping(value={"updateRequestList"})
    @OperationLog(value=OperationLogDesc.UPDATE_REQUEST, type=OperationType.MODIFY)
    public void updateRequestList(@RequestBody @Validated RequestListUpdate requestListUpdate) {
        this.requestListService.updateRequestList(requestListUpdate);
    }

    @PostMapping(value={"deleteByRequestListId"})
    @OperationLog(value=OperationLogDesc.DELETE_REQUEST, type=OperationType.DELETE)
    public void deleteByRequestListId(@RequestParam Long requestListId) {
        this.requestListService.deleteByRequestListId(requestListId);
    }

    @PostMapping(value={"updateByRequestListId"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.UPDATE_REQUEST_STATUS, type=OperationType.MODIFY)
    public void updateByRequestListId(@RequestParam List<Long> requestListIdList, @RequestParam(required=false) Long embyInfoId) {
        this.requestListService.updateByRequestListId(requestListIdList, embyInfoId);
    }

    @PostMapping(value={"rejectRequestList"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.REJECT_REQUEST, type=OperationType.MODIFY)