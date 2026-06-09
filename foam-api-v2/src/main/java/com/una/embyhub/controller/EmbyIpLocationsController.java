/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.embyiplocations.EmbyIpLocationsRequest;
import com.una.embyhub.model.dto.request.embyiplocations.ThresholdUserRequest;
import com.una.embyhub.model.dto.response.embyiplocations.EmbyIpLocationMapResponse;
import com.una.embyhub.model.dto.response.embyiplocations.EmbyIpLocationsResponse;
import com.una.embyhub.model.dto.response.embyiplocations.ThresholdUserResponse;
import com.una.embyhub.service.EmbyIpLocationsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyIpLocations"})
public class EmbyIpLocationsController {
    @Autowired
    private EmbyIpLocationsService embyIpLocationsService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    public Page<EmbyIpLocationsResponse> select(@RequestBody MybatisPlusPage<EmbyIpLocationsRequest> page) {
        return this.embyIpLocationsService.select(page);
    }

    @PostMapping(value={"thresholdUser"})
    @SaCheckPermission(value={"admin"})
    public Page<ThresholdUserResponse> thresholdUser(@RequestBody MybatisPlusPage<ThresholdUserRequest> page) {
        return this.embyIpLocationsService.thresholdUser(page);
    }

    @GetMapping(value={"mapSummary"})
    @SaCheckPermission(value={"admin"})
    public List<EmbyIpLocationMapResponse> mapSummary(Long embyInfoId) {
        return this.embyIpLocationsService.mapSummary(embyInfoId);
    }
}