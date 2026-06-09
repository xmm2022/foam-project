/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.annotation.PreDestroy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.util.StringUtils
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.common.cookiecloud.WeChatBrowserService;
import com.una.embyhub.config.common.cookiecloud.WeChatIpProperties;
import com.una.embyhub.config.common.cookiecloud.WeChatIpService;
import com.una.embyhub.model.dto.request.wechatipconfig.WeChatIpConfigSave;
import com.una.embyhub.model.dto.request.wechatipconfig.WeChatIpConfigUpdate;
import com.una.embyhub.model.dto.response.wechatipconfig.WeChatIpConfigResponse;
import com.una.embyhub.model.entity.WeChatIpConfig;
import com.una.embyhub.service.WeChatIpConfigService;
import jakarta.annotation.PreDestroy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/wechat-ip"})
public class WeChatIpController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WeChatIpController.class);
    private static final long SESSION_IDLE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(20L);
    @Autowired
    private WeChatIpConfigService weChatIpConfigService;
    private final Map<String, SessionData> sessions = new ConcurrentHashMap<String, SessionData>();
    private final Map<Long, SessionData> configSessions = new ConcurrentHashMap<Long, SessionData>();
    private WeChatIpProperties properties;
    private Long currentConfigId;

    public WeChatIpProperties getProperties() {
        return this.properties;
    }

    public Long getCurrentConfigId() {
        return this.currentConfigId;
    }

    public WeChatBrowserService getLoggedInBrowser(Long configId) {
        this.cleanupExpiredSessions();
        SessionData session = this.configSessions.get(configId);
        if (session != null && session.loggedIn) {
            session.touch();
            return session.browser;