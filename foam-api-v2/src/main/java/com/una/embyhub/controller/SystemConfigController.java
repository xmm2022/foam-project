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
import com.una.embyhub.model.dto.request.systemconfig.SystemConfigEnabledRequest;
import com.una.embyhub.model.dto.request.systemconfig.SystemConfigRequest;
import com.una.embyhub.model.dto.request.systemconfig.SystemConfigUpdate;
import com.una.embyhub.model.dto.response.systemconfig.SystemConfigResponse;
import com.una.embyhub.service.SystemConfigService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"systemConfig"})
@SkipLicense
public class SystemConfigController {
    @Autowired
    private SystemConfigService systemConfigService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.QUERY_SYSTEM_CONFIG, type=OperationType.QUERY)
    public Page<SystemConfigResponse> select(@RequestBody MybatisPlusPage<SystemConfigRequest> page) {
        return this.systemConfigService.select(page);
    }

    @PostMapping(value={"updateSystemConfig"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.UPDATE_SYSTEM_CONFIG, type=OperationType.MODIFY)
    public void updateSystemConfig(@RequestBody @Validated SystemConfigUpdate systemConfigUpdate) throws IOException, ClassNotFoundException {
        this.systemConfigService.updateSystemConfig(systemConfigUpdate);
    }

    @PostMapping(value={"isEnabled"})
    @SkipLicense
    public boolean isEnabled(@RequestBody @Validated SystemConfigEnabledRequest request) {
        return this.systemConfigService.isEnabled(request.getConfigKey());
    }

    @PostMapping(value={"getConfigValue"})
    @SkipLicense
    public String getConfigValue(@RequestBody @Validated SystemConfigEnabledRequest request) {
        return this.systemConfigService.getConfigValue(request.getConfigKey());
    }
}