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
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.cardsecuritymanagement.CardSecurityManagementRequest;
import com.una.embyhub.model.dto.response.cardsecuritymanagement.CardSecurityManagementResponse;
import com.una.embyhub.model.dto.response.cardsecuritymanagement.CardSecurityManagementStatusResponse;
import com.una.embyhub.service.CardSecurityManagementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"cardSecurityManagement"})
@SkipLicense
public class CardSecurityManagementController {
    @Autowired
    private CardSecurityManagementService cardSecurityManagementService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.QUERY_CARD_MANAGEMENT, type=OperationType.QUERY)
    public Page<CardSecurityManagementResponse> select(@RequestBody MybatisPlusPage<CardSecurityManagementRequest> page) {
        return this.cardSecurityManagementService.select(page);
    }

    @PostMapping(value={"selectDistributor"})
    @OperationLog(value=OperationLogDesc.QUERY_CARD_MANAGEMENT, type=OperationType.QUERY)
    public Page<CardSecurityManagementResponse> selectDistributor(@RequestBody MybatisPlusPage<CardSecurityManagementRequest> page) {
        return this.cardSecurityManagementService.selectDistributor(page);
    }

    @PostMapping(value={"cardPasswordVerification"})
    @OperationLog(value=OperationLogDesc.VERIFY_CARD, type=OperationType.QUERY)
    public CardSecurityManagementResponse cardPasswordVerification(@RequestParam String cardPassword) {
        return this.cardSecurityManagementService.cardPasswordVerification(cardPassword);
    }

    @PostMapping(value={"addCardSecurityManagementList"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.BATCH_ADD_CARD, type=OperationType.ADD)
    public List<String> addCardSecurityManagementList(@RequestParam Integer count, @RequestParam Integer day, @RequestParam Long embyInfoId, @RequestParam(required=false) Integer hostLineType) {
        return this.cardSecurityManagementService.addCardSecurityManagementList(count, day, embyInfoId, hostLineType);
    }

    @PostMapping(value={"deleteCardSecurityManagementList"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.BATCH_DELETE_CARD, type=OperationType.DELETE)
    public void deleteCardSecurityManagementList(@RequestBody List<Long> idList) {
        this.cardSecurityManagementService.deleteCardSecurityManagementList(idList);
    }

    @PostMapping(value={"cardSecurityManagementListStatus"})
    @SaCheckPermission(value={"admin"})
    public CardSecurityManagementStatusResponse cardSecurityManagementListStatus() {
        return this.cardSecurityManagementService.cardSecurityManagementListStatus();
    }