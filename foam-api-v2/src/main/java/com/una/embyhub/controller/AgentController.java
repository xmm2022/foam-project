/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.config.license.RequireProduct;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.agent.AgentRunRequest;
import com.una.embyhub.model.dto.request.agent.AgentTaskHistoryRequest;
import com.una.embyhub.model.dto.request.agent.AgentTaskItemManualOrganizeRequest;
import com.una.embyhub.model.dto.request.agent.AgentTaskItemQueryRequest;
import com.una.embyhub.model.dto.response.agent.AgentRunResponse;
import com.una.embyhub.model.dto.response.agent.AgentTaskHistoryResponse;
import com.una.embyhub.model.dto.response.agent.AgentTaskItemDetailResponse;
import com.una.embyhub.service.AgentTaskService;
import jakarta.validation.Valid;
import lombok.Generated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping(value={"agent"})
public class AgentController {
    private final AgentTaskService agentTaskService;

    @PostMapping(value={"/run"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    @OperationLog(value=OperationLogDesc.AGENT_RUN, type=OperationType.AI)
    public AgentRunResponse run(@Valid @RequestBody AgentRunRequest request) {
        return this.agentTaskService.createTask(request);
    }

    @GetMapping(value={"/task/active"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public AgentRunResponse activeTask() {
        return this.agentTaskService.getActiveTask();
    }

    @PostMapping(value={"/task/history"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    public Page<AgentTaskHistoryResponse> taskHistory(@RequestBody(required=false) MybatisPlusPage<AgentTaskHistoryRequest> page) {
        return this.agentTaskService.pageTaskHistory(page);
    }

    @DeleteMapping(value={"/task/{taskId}"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    @OperationLog(value=OperationLogDesc.AGENT_TASK_CANCEL, type=OperationType.AI)
    public AgentRunResponse cancelTask(@PathVariable(value="taskId") Long taskId) {
        return this.agentTaskService.cancelTask(taskId);
    }