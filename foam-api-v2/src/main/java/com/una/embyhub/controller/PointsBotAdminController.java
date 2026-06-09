/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  jakarta.validation.Valid
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotLedgerRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotLevelConfigRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotLevelConfigSave;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotLevelConfigUpdate;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotLotteryEntryRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotLotteryRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotPrizeConfigRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotPrizeConfigSave;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotPrizeConfigUpdate;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotRedeemConfigRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotRedeemConfigSave;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotRedeemConfigUpdate;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotUserRequest;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLedgerResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLedgerStatsResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLevelConfigResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLevelConfigStatsResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLotteryEntryResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLotteryEntryStatsResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLotteryResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotLotteryStatsResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotPrizeConfigResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotPrizeConfigStatsResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotRedeemConfigResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotRedeemConfigStatsResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotUserResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotUserStatsResponse;
import com.una.embyhub.pointsbot.config.PointsBotInitializer;
import com.una.embyhub.service.PointsBotLedgerManageService;
import com.una.embyhub.service.PointsBotLevelConfigService;
import com.una.embyhub.service.PointsBotLotteryEntryManageService;
import com.una.embyhub.service.PointsBotLotteryManageService;
import com.una.embyhub.service.PointsBotPrizeConfigService;
import com.una.embyhub.service.PointsBotRedeemConfigService;
import com.una.embyhub.service.PointsBotUserManageService;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"pointsBot"})
public class PointsBotAdminController {
    @Autowired
    private PointsBotUserManageService pointsBotUserManageService;
    @Autowired
    private PointsBotLedgerManageService pointsBotLedgerManageService;
    @Autowired
    private PointsBotLotteryManageService pointsBotLotteryManageService;
    @Autowired
    private PointsBotLotteryEntryManageService pointsBotLotteryEntryManageService;
    @Autowired
    private PointsBotRedeemConfigService pointsBotRedeemConfigService;
    @Autowired
    private PointsBotLevelConfigService pointsBotLevelConfigService;