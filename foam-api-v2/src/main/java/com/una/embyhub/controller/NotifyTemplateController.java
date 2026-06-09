/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  org.springframework.beans.factory.annotation.Autowired
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
import com.una.embyhub.model.dto.request.notifytemplate.NotifyTemplateSave;
import com.una.embyhub.model.dto.request.notifytemplate.NotifyTemplateUpdate;
import com.una.embyhub.model.dto.response.notifytemplate.NotifyTemplateResponse;
import com.una.embyhub.model.dto.response.notifytemplate.NotifyTemplateVariableResponse;
import com.una.embyhub.service.NotifyTemplateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"notifyTemplate"})
public class NotifyTemplateController {
    @Autowired
    private NotifyTemplateService notifyTemplateService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_TEMPLATE_QUERY, type=OperationType.QUERY)
    public List<NotifyTemplateResponse> select() {
        return this.notifyTemplateService.select();
    }

    @PostMapping(value={"add"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_TEMPLATE_ADD, type=OperationType.ADD)
    public void add(@RequestBody NotifyTemplateSave notifyTemplateSave) {
        this.notifyTemplateService.add(notifyTemplateSave);
    }

    @PostMapping(value={"update"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_TEMPLATE_UPDATE, type=OperationType.MODIFY)
    public void update(@RequestBody NotifyTemplateUpdate notifyTemplateUpdate) {
        this.notifyTemplateService.update(notifyTemplateUpdate);
    }

    @PostMapping(value={"delete"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_TEMPLATE_DELETE, type=OperationType.DELETE)
    public void delete(@RequestParam Long id) {
        this.notifyTemplateService.delete(id);
    }

    @PostMapping(value={"variables"})
    @SaCheckPermission(value={"admin"})
    public List<NotifyTemplateVariableResponse> variables() {
        return this.notifyTemplateService.listTemplateVariables();
    }
}