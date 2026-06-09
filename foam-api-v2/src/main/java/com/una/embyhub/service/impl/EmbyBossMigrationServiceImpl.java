/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.secure.SaSecureUtil
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  com.baomidou.mybatisplus.core.conditions.Wrapper
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.service.impl;

import cn.dev33.satoken.secure.SaSecureUtil;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.una.embyhub.config.common.enums.RegisterChannelEnum;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.mapper.EmbyUserMapper;
import com.una.embyhub.mapper.HostLineMapper;
import com.una.embyhub.mapper.NotifyChannelMapper;
import com.una.embyhub.mapper.PointsBotLedgerMapper;
import com.una.embyhub.mapper.PointsBotLevelConfigMapper;
import com.una.embyhub.mapper.PointsBotUserMapper;
import com.una.embyhub.mapper.UserOauthBindingMapper;
import com.una.embyhub.mapper.UserPointsMapper;
import com.una.embyhub.model.dto.request.embybossmigration.EmbyBossMigrationRequest;
import com.una.embyhub.model.dto.response.embybossmigration.EmbyBossMigrationResultResponse;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.HostLine;
import com.una.embyhub.model.entity.NotifyChannel;
import com.una.embyhub.model.entity.PointsBotLedger;
import com.una.embyhub.model.entity.PointsBotLevelConfig;
import com.una.embyhub.model.entity.PointsBotUser;
import com.una.embyhub.model.entity.UserOauthBinding;
import com.una.embyhub.model.entity.UserPoints;
import com.una.embyhub.pointsbot.service.PointsBotConfigService;
import com.una.embyhub.service.EmbyBossMigrationService;
import com.una.embyhub.service.EmbyInfoService;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class EmbyBossMigrationServiceImpl
implements EmbyBossMigrationService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyBossMigrationServiceImpl.class);
    private static final String DEFAULT_DATABASE_NAME = "embyboss";
    private static final String CONFIRMATION_TEXT = "IMPORT_EMBYBOSS";
    private static final String SOURCE_TAG = "EmbyBoss\u8fc1\u79fb";
    private static final String FIXED_LEVEL_REMARK_PREFIX = "embyboss:fixed:";
    private static final String TELEGRAM_PROVIDER = "telegram";
    private static final Pattern URL_PATTERN = Pattern.compile("(?i)https?://[^\\s`*_>)\\]}]+");
    private static final Pattern HOST_PATTERN = Pattern.compile("(?i)(?:\\b\\d{1,3}(?:\\.\\d{1,3}){3}|\\b[a-z0-9][a-z0-9.-]*\\.[a-z]{2,})(?::\\d{1,5})?(?:/[\\w./%?=&+#-]*)?");
    private final EmbyInfoService embyInfoService;
    private final EmbyUserMapper embyUserMapper;
    private final HostLineMapper hostLineMapper;
    private final NotifyChannelMapper notifyChannelMapper;
    private final PointsBotUserMapper pointsBotUserMapper;
    private final PointsBotLedgerMapper pointsBotLedgerMapper;
    private final PointsBotLevelConfigMapper pointsBotLevelConfigMapper;
    private final UserOauthBindingMapper userOauthBindingMapper;
    private final UserPointsMapper userPointsMapper;
    private final PointsBotConfigService pointsBotConfigService;