/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.core.io.resource.ResourceUtil
 *  cn.hutool.core.util.NumberUtil
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.scheduling.annotation.Async
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 *  org.telegram.telegrambots.meta.exceptions.TelegramApiException
 */
package com.una.embyhub.config.common.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.NumberUtil;
import com.una.embyhub.config.common.constants.NotifyMessageType;
import com.una.embyhub.config.common.utils.NotifyUtils;
import com.una.embyhub.config.common.utils.TelegramClientUtils;
import com.una.embyhub.model.dto.request.requestlist.RequestListSave;
import com.una.embyhub.model.dto.request.telegram.SearchRequest;
import com.una.embyhub.model.dto.request.telegram.SendPhotoRequest;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import com.una.embyhub.model.dto.response.telegram.SearchResponse;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.RequestList;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.SearchService;
import com.una.embyhub.service.TelegramPanService;
import java.util.Date;
import java.util.HashMap;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class PushUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(PushUtils.class);
    @Autowired
    private TelegramPanService telegramPanService;
    @Autowired
    private SearchService searchService;
    @Autowired
    private TelegramClientUtils telegramClientUtils;
    @Autowired
    private NotifyUtils notifyUtils;
    @Autowired
    private EmbyInfoService embyInfoService;

    @Async
    public void pushAsync(RequestListSave requestListSave, RequestList requestList, EmbyUser embyUser) {
        SendPhotoRequest sendPhotoRequest = new SendPhotoRequest();
        Object season = "";
        if ("tv".equals(requestList.getType())) {
            season = " S" + NumberUtil.decimalFormat((String)"00", (Object)requestList.getSeason());
        }
        HashMap<String, String> extras = new HashMap<String, String>();
        extras.put("requestName", requestList.getName());
        extras.put("year", DateUtil.format((Date)requestList.getReleaseDate(), (String)"yyyy"));
        extras.put("season", (String)season);
        extras.put("userName", embyUser.getEmbyUserName());
        sendPhotoRequest.setName(requestList.getName());
        sendPhotoRequest.setOverview(requestList.getOverview());
        sendPhotoRequest.setTmdbUrl(requestList.getTmdbUrl());
        sendPhotoRequest.setImgUrlInputStream(ResourceUtil.getStream((String)"img/default.jpg"));
        sendPhotoRequest.setImgUrl(requestList.getImageUrl());
        sendPhotoRequest.setParseMode("Markdown");
        sendPhotoRequest.setProductionYear(Integer.valueOf(DateUtil.format((Date)requestList.getReleaseDate(), (String)"yyyy")));
        sendPhotoRequest.setGenres("#\u7528\u6237\u63d0\u4ea4\u6c42\u7247#" + requestList.getRemark());
        sendPhotoRequest.setType(requestList.getType());
        sendPhotoRequest.setBackdropPath(requestListSave.getBackdropPath());
        if (StringUtils.hasText((String)requestList.getScore())) {
            try {
                sendPhotoRequest.setVoteAverage(Double.parseDouble(requestList.getScore()));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if ("tv".equals(requestList.getType())) {
            if (requestList.getSeason() != null) {
                sendPhotoRequest.setSeasonNumber(requestList.getSeason());
            }
            if (requestList.getEpisode() != null) {
                sendPhotoRequest.setEpisodeNumber(requestList.getEpisode());
            }
        }
        sendPhotoRequest.setRuntime(requestList.getRuntime());
        sendPhotoRequest.setProductionCountries(requestList.getProductionCountries());
        if (requestList.getReleaseDate() != null) {
            sendPhotoRequest.setReleaseDate(DateUtil.format((Date)requestList.getReleaseDate(), (String)"yyyy-MM-dd"));
        }
        Long targetEmbyInfoId = requestList.getEmbyInfoId() != null ? requestList.getEmbyInfoId() : requestListSave.getEmbyInfoId();
        EmbyInfo embyInfo = targetEmbyInfoId != null ? (EmbyInfo)this.embyInfoService.getById(targetEmbyInfoId) : null;
        String serverName = embyInfo != null ? embyInfo.getServerName() : null;
        sendPhotoRequest.setServerUrl(this.buildServerUrl(embyInfo));
        sendPhotoRequest.setServerName(serverName);
        extras.put("serverName", serverName);
        sendPhotoRequest.setExtraVariables(extras);
        try {
            this.notifyUtils.sendMultiChannel(sendPhotoRequest, "request_submitted", NotifyMessageType.PHOTO_DETAIL, false, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
        }
        catch (TelegramApiException e) {
            log.error("\u65b0\u589e\u6c42\u7247\u5217\u8868\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
        TelegramResponse telegramResponse = this.telegramClientUtils.getTelegramResponse();
        if (telegramResponse != null) {
            try {
                SearchRequest searchRequest = new SearchRequest();
                searchRequest.setKw(requestList.getName());
                searchRequest.setRes("results");
                SearchResponse searchResponse = this.searchService.search(searchRequest);
                if (!CollectionUtils.isEmpty(searchResponse.getData().getResults())) {
                    this.telegramPanService.pushHome(telegramResponse.getBotChatId(), searchResponse, telegramResponse.getBotToken(), requestList.getName(), sendPhotoRequest.getName());
                }
            }
            catch (Exception e) {
                log.error("\u65b0\u589e\u6c42\u7247\u5217\u8868\u641c\u7d22\u8d44\u6e90\u5217\u8868\u901a\u77e5\u63a8\u9001\u5931\u8d25", (Throwable)e);
            }
        }
    }

    private String buildServerUrl(EmbyInfo embyInfo) {
        if (embyInfo == null) {
            return null;
        }
        String embyUrl = embyInfo.getEmbyUrl();
        if (StringUtils.hasText((String)embyUrl) && (embyUrl.startsWith("http://") || embyUrl.startsWith("https://"))) {
            return embyUrl;
        }
        StringBuilder baseUrl = new StringBuilder();
        if (StringUtils.hasText((String)embyInfo.getEmbyAgreement())) {
            baseUrl.append(embyInfo.getEmbyAgreement()).append("://");
        }
        if (StringUtils.hasText((String)embyInfo.getEmbyUrl())) {
            baseUrl.append(embyInfo.getEmbyUrl());
        }
        if (StringUtils.hasText((String)embyInfo.getEmbyPort())) {
            if (embyInfo.getEmbyUrl() != null && !embyInfo.getEmbyUrl().contains(":")) {
                baseUrl.append(":");
            }
            baseUrl.append(embyInfo.getEmbyPort());
        }
        return baseUrl.length() > 0 ? baseUrl.toString() : null;
    }

    @Async
    public void pushCompletedAsync(RequestList requestList, String serverUrl, String serverName) {
        SendPhotoRequest sendPhotoRequest = new SendPhotoRequest();
        Object season = "";
        if ("tv".equals(requestList.getType())) {
            season = " S" + NumberUtil.decimalFormat((String)"00", (Object)requestList.getSeason());
        }
        HashMap<String, String> extras = new HashMap<String, String>();
        extras.put("requestName", requestList.getName());
        extras.put("year", DateUtil.format((Date)requestList.getReleaseDate(), (String)"yyyy"));
        extras.put("season", (String)season);
        extras.put("serverName", serverName);
        sendPhotoRequest.setName(requestList.getName());
        sendPhotoRequest.setOverview(requestList.getOverview());
        sendPhotoRequest.setTmdbUrl(requestList.getTmdbUrl());
        sendPhotoRequest.setImgUrlInputStream(ResourceUtil.getStream((String)"img/default.jpg"));
        sendPhotoRequest.setImgUrl(requestList.getImageUrl());
        sendPhotoRequest.setParseMode("Markdown");
        sendPhotoRequest.setProductionYear(Integer.valueOf(DateUtil.format((Date)requestList.getReleaseDate(), (String)"yyyy")));
        sendPhotoRequest.setGenres("#\u6c42\u7247\u5165\u5e93");
        sendPhotoRequest.setType(requestList.getType());
        sendPhotoRequest.setBackdropPath(requestList.getBackdropPath());
        if (StringUtils.hasText((String)requestList.getScore())) {
            try {
                sendPhotoRequest.setVoteAverage(Double.parseDouble(requestList.getScore()));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if ("tv".equals(requestList.getType())) {
            if (requestList.getSeason() != null) {
                sendPhotoRequest.setSeasonNumber(requestList.getSeason());
            }
            if (requestList.getEpisode() != null) {
                sendPhotoRequest.setEpisodeNumber(requestList.getEpisode());
            }
        }
        sendPhotoRequest.setRuntime(requestList.getRuntime());
        sendPhotoRequest.setProductionCountries(requestList.getProductionCountries());
        if (requestList.getReleaseDate() != null) {
            sendPhotoRequest.setReleaseDate(DateUtil.format((Date)requestList.getReleaseDate(), (String)"yyyy-MM-dd"));
        }
        sendPhotoRequest.setServerUrl(serverUrl);
        sendPhotoRequest.setServerName(serverName);
        sendPhotoRequest.setExtraVariables(extras);
        try {
            this.notifyUtils.sendMultiChannel(sendPhotoRequest, "request_completed", NotifyMessageType.PHOTO_DETAIL, true, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
        }
        catch (TelegramApiException e) {
            log.error("\u6c42\u7247\u5165\u5e93\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }
}
