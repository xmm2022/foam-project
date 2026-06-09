/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  cn.dev33.satoken.stp.StpUtil
 *  cn.hutool.core.util.URLUtil
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  com.diboot.core.util.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.URLUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diboot.core.util.BeanUtils;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.embyinfo.EmbyInfoRequest;
import com.una.embyhub.model.dto.request.embyinfo.EmbyInfoSave;
import com.una.embyhub.model.dto.request.embyinfo.EmbyInfoUpdate;
import com.una.embyhub.model.dto.request.embyinfo.EmbyInfoUserOptionsRequest;
import com.una.embyhub.model.dto.response.embyinfo.EmbyInfoEnabledResponse;
import com.una.embyhub.model.dto.response.embyinfo.EmbyInfoResponse;
import com.una.embyhub.model.dto.response.embyinfo.EmbyInfoUserOptionResponse;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.service.EmbyInfoService;
import java.net.URL;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyInfo"})
@SkipLicense
public class EmbyInfoController {
    @Autowired
    private EmbyInfoService embyInfoService;

    @PostMapping(value={"select"})
    public Page<EmbyInfoResponse> select(@RequestBody MybatisPlusPage<EmbyInfoRequest> page) {
        boolean isDistributor;
        boolean isAdmin = StpUtil.hasPermission((String)"admin");
        EmbyUser user = (EmbyUser)StpUtil.getSession().get("user");
        boolean bl = isDistributor = user != null && user.getIsDistributor() != null && user.getIsDistributor() == 1;
        if (!isAdmin && !isDistributor) {
            throw new BizException(ResponseStatusEnum.PERMISSION_DENIED);
        }
        return this.embyInfoService.select(page);
    }

    @PostMapping(value={"deleteByEmbyInfoId"})
    @SaCheckPermission(value={"admin"})
    public void deleteByUserId(@RequestParam List<Long> embyInfoIds) {
        this.embyInfoService.deleteByUserId(embyInfoIds);
    }

    @PostMapping(value={"insertEmbyInfo"})
    @SaCheckPermission(value={"admin"})
    public void insertEmbyInfo(@RequestBody EmbyInfoSave embyInfoSave) {
        this.embyInfoService.insertEmbyInfo(embyInfoSave);
    }

    @PostMapping(value={"updateEmbyInfo"})
    @SaCheckPermission(value={"admin"})
    public void updateEmbyInfo(@RequestBody EmbyInfoUpdate embyUserUpdate) {