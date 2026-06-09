/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.stp.StpUtil
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.core.util.IdUtil
 *  com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
 *  com.diboot.core.binding.QueryBuilder
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diboot.core.binding.QueryBuilder;
import com.una.embyhub.config.common.MpConvert;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.mapper.RequestPackagesCardSecurityManagementMapper;
import com.una.embyhub.model.dto.request.requestpackagescardsecuritymanagement.RequestPackagesCardSecurityManagementRequest;
import com.una.embyhub.model.dto.response.requestpackagescardsecuritymanagement.RequestPackagesCardSecurityManagementResponse;
import com.una.embyhub.model.dto.response.requestpackagescardsecuritymanagement.RequestPackagesCardSecurityManagementStatusResponse;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.RequestPackagesCardSecurityManagement;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.RequestPackagesCardSecurityManagementService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class RequestPackagesCardSecurityManagementServiceImpl
extends ServiceImpl<RequestPackagesCardSecurityManagementMapper, RequestPackagesCardSecurityManagement>
implements RequestPackagesCardSecurityManagementService {
    @Autowired
    private EmbyUserService embyUserService;

    @Override
    public Page<RequestPackagesCardSecurityManagementResponse> select(MybatisPlusPage<RequestPackagesCardSecurityManagementRequest> page) {
        EmbyUser embyUserData = (EmbyUser)StpUtil.getSession().get("user");
        QueryWrapper queryWrapper = QueryBuilder.toQueryWrapper((Object)page.getObject());
        if (StringUtils.hasText((String)page.getObject().getEmbyUserName())) {
            EmbyUser embyUser = (EmbyUser)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getEmbyUserName, (Object)page.getObject().getEmbyUserName())).one();
            if (embyUser == null) {
                queryWrapper.eq((Object)"user_id", (Object)0);
            } else {
                queryWrapper.eq((Object)"user_id", (Object)embyUser.getId());
            }
        }
        if (embyUserData.getIsAdmin() != 1) {
            queryWrapper.eq((Object)"user_id", (Object)embyUserData.getId());
        }
        queryWrapper.orderByDesc((Object)"id");
        Page<RequestPackagesCardSecurityManagementResponse> requestPackagesCardSecurityManagementResponsePage = MpConvert.page(queryWrapper, this.getBaseMapper(), RequestPackagesCardSecurityManagementResponse.class, page.getCurrent(), page.getSize(), page.getOrders());
        return requestPackagesCardSecurityManagementResponsePage;
    }

    @Override
    public void verification(String cardPassword) {
        RequestPackagesCardSecurityManagement requestPackagesCardSecurityManagement = (RequestPackagesCardSecurityManagement)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.getBaseMapper()).eq(RequestPackagesCardSecurityManagement::getCardPassword, (Object)cardPassword)).eq(RequestPackagesCardSecurityManagement::getCardStatus, (Object)0)).one();
        if (requestPackagesCardSecurityManagement == null) {
            throw new BizException(ResponseStatusEnum.BIZ_REQUEST_PACKAGES_CARD_PASSWORD_ERROR);
        }
        EmbyUser embyUser = (EmbyUser)StpUtil.getSession().get("user");
        EmbyUser embyUserData = (EmbyUser)this.embyUserService.getById(embyUser.getId());
        embyUserData.setRequestPackagesCount(embyUserData.getRequestPackagesCount() + requestPackagesCardSecurityManagement.getCardCount());
        this.embyUserService.updateById(embyUserData);
        requestPackagesCardSecurityManagement.setCardStatus(1);
        requestPackagesCardSecurityManagement.setEmbyUserName(embyUserData.getEmbyUserName());
        requestPackagesCardSecurityManagement.setUserId(embyUserData.getId());
        this.updateById(requestPackagesCardSecurityManagement);
        StpUtil.getSession().set("user", (Object)embyUserData);
    }

    @Override
    public List<String> add(Integer count, Integer num) {
        ArrayList<RequestPackagesCardSecurityManagement> requestPackagesCardSecurityManagementList = new ArrayList<RequestPackagesCardSecurityManagement>();
        ArrayList<String> cardPasswordList = new ArrayList<String>();
        for (int i = 0; i < count; ++i) {
            String cardPassword = IdUtil.fastSimpleUUID();
            RequestPackagesCardSecurityManagement requestPackagesCardSecurityManagement = new RequestPackagesCardSecurityManagement();
            requestPackagesCardSecurityManagement.setCardPassword(cardPassword);
            requestPackagesCardSecurityManagement.setCardCount(num);
            cardPasswordList.add(cardPassword);