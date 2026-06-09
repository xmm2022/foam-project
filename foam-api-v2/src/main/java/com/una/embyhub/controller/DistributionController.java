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
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.config.license.RequireProduct;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.distribution.DistributionCustomExchangeRequest;
import com.una.embyhub.model.dto.request.distribution.DistributionCustomExchangeReviewRequest;
import com.una.embyhub.model.dto.request.distributionapplication.DistributionApplicationDeleteRequest;
import com.una.embyhub.model.dto.request.distributionapplication.DistributionApplicationRequest;
import com.una.embyhub.model.dto.request.distributionapplication.DistributionApplicationReviewRequest;
import com.una.embyhub.model.dto.request.distributionapplication.DistributionApplicationSave;
import com.una.embyhub.model.dto.request.distributionapplication.ExchangeRequest;
import com.una.embyhub.model.dto.request.distributionapplication.ProductListRequest;
import com.una.embyhub.model.dto.request.distributionapplication.ProductSaveRequest;
import com.una.embyhub.model.dto.request.pointsrecord.PointsRecordRequest;
import com.una.embyhub.model.dto.response.distribution.DistributionCustomExchangeResponse;
import com.una.embyhub.model.dto.response.distributionapplication.DistributionApplicationResponse;
import com.una.embyhub.model.dto.response.distributionapplication.DistributionApplicationStatisticsResponse;
import com.una.embyhub.model.dto.response.pointsrecord.PointsRecordResponse;
import com.una.embyhub.model.entity.PointsExchangeProduct;
import com.una.embyhub.model.entity.UserPoints;
import com.una.embyhub.service.DistributionApplicationService;
import com.una.embyhub.service.DistributionCustomExchangeService;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.PointsExchangeProductService;
import com.una.embyhub.service.PointsRecordService;
import com.una.embyhub.service.UserPointsService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"distribution"})
@RequireProduct(value=LicenseProductEnum.PLUS)
public class DistributionController {
    @Autowired
    private PointsExchangeProductService pointsExchangeProductService;
    @Autowired
    private UserPointsService userPointsService;
    @Autowired
    private DistributionApplicationService distributionApplicationService;
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private PointsRecordService pointsRecordService;
    @Autowired
    private DistributionCustomExchangeService distributionCustomExchangeService;

    @PostMapping(value={"product/list"})
    public List<PointsExchangeProduct> listProducts(@RequestBody(required=false) ProductListRequest request) {
        return this.pointsExchangeProductService.listProducts(request);
    }

    @PostMapping(value={"product/save"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.SAVE_DISTRIBUTION_PRODUCT, type=OperationType.ADD)
    public void saveProduct(@RequestBody ProductSaveRequest request) {