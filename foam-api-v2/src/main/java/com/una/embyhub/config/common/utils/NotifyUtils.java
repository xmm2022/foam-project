/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 *  org.telegram.telegrambots.meta.exceptions.TelegramApiException
 */
package com.una.embyhub.config.common.utils;

import com.una.embyhub.config.common.constants.NotifyMessageType;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.NotifyTemplateCacheLoaderUtils;
import com.una.embyhub.config.common.utils.TelegramClientUtils;
import com.una.embyhub.config.common.utils.TemplateRenderUtils;
import com.una.embyhub.model.dto.request.telegram.SendMessageRequest;
import com.una.embyhub.model.dto.request.telegram.SendPhotoRequest;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import com.una.embyhub.service.DingDingService;
import com.una.embyhub.service.MessagePushService;
import com.una.embyhub.service.TelegramService;
import com.una.embyhub.service.WechatService;
import com.una.embyhub.util.MovieCardRenderer;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class NotifyUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(NotifyUtils.class);
    @Autowired
    private TelegramService telegramService;
    @Autowired
    private DingDingService dingDingService;
    @Autowired
    private TelegramClientUtils telegramClientUtils;
    @Autowired
    private WechatService wechatService;
    @Autowired
    private MessagePushService messagePushService;
    @Autowired
    private NotifyTemplateCacheLoaderUtils notifyTemplateCacheLoaderUtils;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;
    private static final String DATA_URL_PREFIX = "data:image/jpeg;base64,";

    public void sendTelegram(SendPhotoRequest sendPhotoRequest, String templateCode, NotifyMessageType messageType, boolean toGroup) throws TelegramApiException {
        if (!this.prepareTelegramPhotoRequest(sendPhotoRequest, toGroup)) {
            log.info("Telegram Bot\u672a\u542f\u7528\uff0c\u4e0d\u53d1\u9001\u56fe\u7247\u901a\u77e5");
            return;
        }
        String caption = this.renderPhotoTemplate(sendPhotoRequest, templateCode, "telegram", messageType);
        if (!StringUtils.hasText((String)caption)) {
            return;
        }
        sendPhotoRequest.setCaption(caption);
        try {
            if (messageType == NotifyMessageType.PHOTO_MESSAGE) {
                this.telegramService.sendPhotoMessage(sendPhotoRequest);
            } else {
                this.telegramService.sendPhoto(sendPhotoRequest);
            }
        }
        catch (Exception e) {
            log.error("Telegram\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
            throw e instanceof TelegramApiException ? (TelegramApiException)e : new TelegramApiException((Throwable)e);
        }
    }

    public void sendTelegram(SendMessageRequest sendMessageRequest, String templateCode, boolean toGroup) {
        if (!this.prepareTelegramMessageRequest(sendMessageRequest, toGroup)) {
            log.info("Telegram Bot\u672a\u542f\u7528\uff0c\u4e0d\u53d1\u9001\u6587\u672c\u901a\u77e5");
            return;
        }
        String content = this.renderTextTemplate(sendMessageRequest, templateCode, "telegram");
        if (!StringUtils.hasText((String)content)) {
            return;
        }
        sendMessageRequest.setOverview(content);
        try {
            this.telegramService.sendMessage(sendMessageRequest);
        }
        catch (Exception e) {
            log.error("Telegram\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    public void sendDingDing(SendPhotoRequest sendPhotoRequest, String templateCode, NotifyMessageType messageType) {
        String caption = this.renderPhotoTemplate(sendPhotoRequest, templateCode, "dingding", messageType);
        if (!StringUtils.hasText((String)caption)) {
            return;
        }
        sendPhotoRequest.setCaption(caption);
        try {
            if (messageType == NotifyMessageType.PHOTO_MESSAGE) {
                this.dingDingService.sendPhotoMessage(sendPhotoRequest);
            } else {
                this.dingDingService.sendPhoto(sendPhotoRequest);
            }
        }
        catch (Exception e) {
            log.error("\u9489\u9489\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    public void sendDingDing(SendMessageRequest sendMessageRequest, String templateCode) {
        String content = this.renderTextTemplate(sendMessageRequest, templateCode, "dingding");
        if (!StringUtils.hasText((String)content)) {
            return;
        }
        sendMessageRequest.setOverview(content);
        try {
            this.dingDingService.sendMessage(sendMessageRequest);
        }
        catch (Exception e) {
            log.error("\u9489\u9489\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    public void sendMultiChannel(SendPhotoRequest sendPhotoRequest, String templateCode, NotifyMessageType messageType, boolean toGroup, String ... channels) throws TelegramApiException {
        List<String> channelList = Arrays.asList(channels);
        CustomPoster customPoster = this.buildCustomPoster(sendPhotoRequest, messageType);
        if (channelList.contains("telegram")) {
            try {
                SendPhotoRequest telegramRequest = this.cloneSendPhotoRequest(sendPhotoRequest);
                this.applyVerticalPoster(telegramRequest, customPoster);
                this.sendTelegram(telegramRequest, templateCode, messageType, toGroup);
            }
            catch (TelegramApiException e) {
                log.error("Telegram\u6e20\u9053\u53d1\u9001\u5931\u8d25", (Throwable)e);
            }
        }
        if (channelList.contains("wechat")) {
            SendPhotoRequest wechatRequest = this.cloneSendPhotoRequest(sendPhotoRequest);
            this.applyHorizontalPoster(wechatRequest, customPoster);
            this.sendWechat(wechatRequest, templateCode, messageType, "wechat");
        }
        if (channelList.contains("wechatBot")) {
            SendPhotoRequest wechatBotRequest = this.cloneSendPhotoRequest(sendPhotoRequest);
            this.applyHorizontalPoster(wechatBotRequest, customPoster);
            this.sendWechat(wechatBotRequest, templateCode, messageType, "wechatBot");
        }
        if (channelList.contains("dingding")) {
            SendPhotoRequest dingDingRequest = this.cloneSendPhotoRequest(sendPhotoRequest);
            this.applyHorizontalPoster(dingDingRequest, customPoster);
            this.sendDingDing(dingDingRequest, templateCode, messageType);
        }
        if (channelList.contains("messagepush")) {
            SendPhotoRequest messagePushRequest = this.cloneSendPhotoRequest(sendPhotoRequest);
            this.sendMessagePush(messagePushRequest, templateCode, messageType);
        }
    }

    private CustomPoster buildCustomPoster(SendPhotoRequest sendPhotoRequest, NotifyMessageType messageType) {
        if (messageType != NotifyMessageType.PHOTO_DETAIL) {
            return null;
        }
        String customPosterEnabled = this.configCacheLoaderUtils.getConfigValue("custom_poster_enabled");
        if (!"true".equalsIgnoreCase(customPosterEnabled)) {
            return null;
        }
        try {
            MovieCardRenderer.MovieDetail movieDetail = this.buildMovieDetail(sendPhotoRequest);
            BufferedImage posterImage = this.resolvePosterImage(sendPhotoRequest);
            if (movieDetail == null || posterImage == null) {
                return null;
            }
            byte[] horizontal = MovieCardRenderer.generateHorizontalCardToBytes(movieDetail, posterImage);
            byte[] vertical = MovieCardRenderer.generateVerticalCardToBytes(movieDetail, posterImage);
            return new CustomPoster(horizontal, vertical);
        }
        catch (Exception e) {
            log.warn("\u751f\u6210\u81ea\u5b9a\u4e49\u5165\u5e93\u6d77\u62a5\u5931\u8d25\uff0c\u4f7f\u7528\u9ed8\u8ba4\u6d77\u62a5", (Throwable)e);
            return null;
        }
    }

    private MovieCardRenderer.MovieDetail buildMovieDetail(SendPhotoRequest sendPhotoRequest) {
        List<String> genres = this.parseGenres(sendPhotoRequest.getGenres());
        String releaseDate = StringUtils.hasText((String)sendPhotoRequest.getReleaseDate()) ? sendPhotoRequest.getReleaseDate() : (sendPhotoRequest.getProductionYear() != null ? sendPhotoRequest.getProductionYear() + "-01-01" : null);
        boolean tvSeries = "episode".equalsIgnoreCase(sendPhotoRequest.getType()) || "tv".equalsIgnoreCase(sendPhotoRequest.getType()) || "series".equalsIgnoreCase(sendPhotoRequest.getType());
        double voteAverage = sendPhotoRequest.getVoteAverage() != null ? sendPhotoRequest.getVoteAverage() : 0.0;
        int voteCount = sendPhotoRequest.getVoteCount() != null ? sendPhotoRequest.getVoteCount() : 0;
        int runtime = sendPhotoRequest.getRuntime() != null ? sendPhotoRequest.getRuntime() : 0;
        List<String> productionCountries = this.parseProductionCountries(sendPhotoRequest.getProductionCountries());
        Map<String, String> extras = sendPhotoRequest.getExtraVariables();
        String downloadCurrent = extras != null ? extras.get("downloadTitle") : null;
        String downloadStatus = extras != null ? extras.get("downloadStatus") : null;
        String downloadError = extras != null ? extras.get("errorMessage") : null;
        Boolean success = extras != null && extras.containsKey("isSuccess") ? Boolean.valueOf(extras.get("isSuccess")) : null;
        return new MovieCardRenderer.MovieDetail(this.safe(sendPhotoRequest.getName()), this.safe(sendPhotoRequest.getName()), this.safe(sendPhotoRequest.getDisplayTitle()), this.safe(sendPhotoRequest.getOverview()), runtime, genres, releaseDate, productionCountries, voteAverage, voteCount, this.safe(sendPhotoRequest.getServerUrl()), tvSeries, sendPhotoRequest.getSeasonNumber(), sendPhotoRequest.getEpisodeNumber(), downloadCurrent, downloadStatus, downloadError, success);
    }

    private List<String> parseProductionCountries(String countriesStr) {
        if (!StringUtils.hasText((String)countriesStr)) {
            return new ArrayList<String>();
        }
        String[] parts = countriesStr.split("[,\uff0c/|]+");
        ArrayList<String> countries = new ArrayList<String>();
        for (String part : parts) {
            if (!StringUtils.hasText((String)part)) continue;
            countries.add(part.trim());
        }
        return countries;
    }

    private BufferedImage resolvePosterImage(SendPhotoRequest sendPhotoRequest) throws Exception {
        BufferedImage img;
        String fallbackUrl;
        String imageSource = this.configCacheLoaderUtils.getConfigValue("custom_poster_image_source");
        boolean preferBackdrop = "backdrop".equalsIgnoreCase(imageSource);
        String primaryUrl = preferBackdrop ? sendPhotoRequest.getBackdropPath() : sendPhotoRequest.getImgUrl();
        String string = fallbackUrl = preferBackdrop ? sendPhotoRequest.getImgUrl() : sendPhotoRequest.getBackdropPath();
        if (StringUtils.hasText((String)primaryUrl)) {
            try {
                img = MovieCardRenderer.downloadPosterFromUrl(primaryUrl);
                if (img != null) {
                    return img;
                }
            }
            catch (Exception e) {
                log.warn("\u4e0b\u8f7d{}\u56fe\u7247\u5931\u8d25\uff0c\u5c1d\u8bd5\u4f7f\u7528{}\u56fe\u7247: {}", new Object[]{preferBackdrop ? "\u58c1\u7eb8" : "\u6d77\u62a5", preferBackdrop ? "\u6d77\u62a5" : "\u58c1\u7eb8", e.getMessage()});
            }
        }
        if (StringUtils.hasText((String)fallbackUrl)) {
            try {
                img = MovieCardRenderer.downloadPosterFromUrl(fallbackUrl);
                if (img != null) {
                    return img;
                }
            }
            catch (Exception e) {
                log.warn("\u4e0b\u8f7d{}\u56fe\u7247\u4e5f\u5931\u8d25: {}", (Object)(preferBackdrop ? "\u6d77\u62a5" : "\u58c1\u7eb8"), (Object)e.getMessage());
            }
        }
        if (sendPhotoRequest.getImgUrlInputStream() != null) {
            return ImageIO.read(sendPhotoRequest.getImgUrlInputStream());
        }
        return null;
    }

    private SendPhotoRequest cloneSendPhotoRequest(SendPhotoRequest source) {
        SendPhotoRequest target = new SendPhotoRequest();
        target.setChatId(source.getChatId());
        target.setName(source.getName());
        target.setTvInfo(source.getTvInfo());
        target.setOverview(source.getOverview());
        target.setTmdbUrl(source.getTmdbUrl());
        target.setImgUrl(source.getImgUrl());
        target.setImgUrlInputStream(source.getImgUrlInputStream());
        target.setParseMode(source.getParseMode());
        target.setProductionYear(source.getProductionYear());
        target.setGenres(source.getGenres());
        target.setType(source.getType());
        target.setDisplayTitle(source.getDisplayTitle());
        target.setSize(source.getSize());
        target.setVoteAverage(source.getVoteAverage());
        target.setVoteCount(source.getVoteCount());
        target.setEpisodeNumber(source.getEpisodeNumber());
        target.setSeriesName(source.getSeriesName());
        target.setSeasonNumber(source.getSeasonNumber());
        target.setEpisodeName(source.getEpisodeName());
        target.setBackdropPath(source.getBackdropPath());
        target.setServerUrl(source.getServerUrl());
        target.setServerName(source.getServerName());
        target.setPlayUser(source.getPlayUser());
        target.setPlayTitle(source.getPlayTitle());
        target.setUserLocation(source.getUserLocation());
        target.setPlayTime(source.getPlayTime());
        target.setPlayPosition(source.getPlayPosition());
        target.setClientInfo(source.getClientInfo());
        target.setTelegramClient(source.getTelegramClient());
        target.setCaption(source.getCaption());
        target.setExtraVariables((Map<String, String>)(source.getExtraVariables() != null ? new HashMap<String, String>(source.getExtraVariables()) : new HashMap()));
        target.setRuntime(source.getRuntime());
        target.setProductionCountries(source.getProductionCountries());
        target.setReleaseDate(source.getReleaseDate());
        return target;
    }

    private void applyHorizontalPoster(SendPhotoRequest request, CustomPoster poster) {
        if (poster == null || poster.horizontal() == null) {
            return;
        }
        String dataUrl = DATA_URL_PREFIX + Base64.getEncoder().encodeToString(poster.horizontal());
        request.setImgUrl(dataUrl);
        request.setBackdropPath(dataUrl);
        request.setImgUrlInputStream(null);
    }

    private void applyVerticalPoster(SendPhotoRequest request, CustomPoster poster) {
        if (poster == null || poster.vertical() == null) {
            return;
        }
        request.setImgUrlInputStream(new ByteArrayInputStream(poster.vertical()));
        request.setImgUrl(null);
        request.setBackdropPath(null);
    }

    private List<String> parseGenres(String genresStr) {
        if (!StringUtils.hasText((String)genresStr)) {
            return new ArrayList<String>();
        }
        String cleaned = genresStr.replace("#", " ");
        String[] parts = cleaned.split("[\u3001,\uff0c/|\\s]+");
        ArrayList<String> genres = new ArrayList<String>();
        for (String part : parts) {
            if (!StringUtils.hasText((String)part)) continue;
            genres.add(part.trim());
        }
        return genres;
    }

    public void sendMultiChannel(SendMessageRequest sendMessageRequest, String templateCode, boolean toGroup, String ... channels) {
        List<String> channelList = Arrays.asList(channels);
        if (channelList.contains("telegram")) {
            this.sendTelegram(sendMessageRequest, templateCode, toGroup);
        }
        if (channelList.contains("wechat")) {
            this.sendWechat(sendMessageRequest, templateCode, "wechat");
        }
        if (channelList.contains("wechatBot")) {
            this.sendWechat(sendMessageRequest, templateCode, "wechatBot");
        }
        if (channelList.contains("dingding")) {
            this.sendDingDing(sendMessageRequest, templateCode);
        }
        if (channelList.contains("messagepush")) {
            this.sendMessagePush(sendMessageRequest, templateCode);
        }
    }

    public void sendWechat(SendPhotoRequest sendPhotoRequest, String templateCode, NotifyMessageType messageType) {
        this.sendWechat(sendPhotoRequest, templateCode, messageType, "wechat");
    }

    public void sendWechat(SendPhotoRequest sendPhotoRequest, String templateCode, NotifyMessageType messageType, String channelType) {
        String channel = StringUtils.hasText((String)channelType) ? channelType : "wechat";
        String caption = this.renderPhotoTemplate(sendPhotoRequest, templateCode, channel, messageType);
        if (!StringUtils.hasText((String)caption)) {
            return;
        }
        sendPhotoRequest.setCaption(caption);
        try {
            boolean customPosterEnabled = "true".equalsIgnoreCase(this.configCacheLoaderUtils.getConfigValue("custom_poster_enabled"));
            if (customPosterEnabled && messageType == NotifyMessageType.PHOTO_DETAIL && this.wechatService.sendServerPhoto(sendPhotoRequest, channel)) {
                return;
            }
            if (messageType == NotifyMessageType.PHOTO_MESSAGE) {
                this.wechatService.sendPhotoMessage(sendPhotoRequest, channel);
            } else {
                this.wechatService.sendPhoto(sendPhotoRequest, channel);
            }
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    public void sendWechat(SendMessageRequest sendMessageRequest, String templateCode) {
        this.sendWechat(sendMessageRequest, templateCode, "wechat");
    }

    public void sendWechat(SendMessageRequest sendMessageRequest, String templateCode, String channelType) {
        String channel = StringUtils.hasText((String)channelType) ? channelType : "wechat";
        String content = this.renderTextTemplate(sendMessageRequest, templateCode, channel);
        if (!StringUtils.hasText((String)content)) {
            return;
        }
        sendMessageRequest.setOverview(content);
        try {
            this.wechatService.sendMessage(sendMessageRequest, channel);
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    public void sendMessagePush(SendPhotoRequest sendPhotoRequest, String templateCode, NotifyMessageType messageType) {
        String caption = this.renderPhotoTemplate(sendPhotoRequest, templateCode, "messagepush", messageType);
        if (!StringUtils.hasText((String)caption)) {
            return;
        }
        sendPhotoRequest.setCaption(caption);
        try {
            if (messageType == NotifyMessageType.PHOTO_MESSAGE) {
                this.messagePushService.sendPhotoMessage(sendPhotoRequest);
            } else {
                this.messagePushService.sendPhoto(sendPhotoRequest);
            }
        }
        catch (Exception e) {
            log.error("\u6d88\u606f\u63a8\u9001\u52a9\u624b\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    public void sendMessagePush(SendMessageRequest sendMessageRequest, String templateCode) {
        String content = this.renderTextTemplate(sendMessageRequest, templateCode, "messagepush");
        if (!StringUtils.hasText((String)content)) {
            return;
        }
        sendMessageRequest.setOverview(content);
        try {
            this.messagePushService.sendMessage(sendMessageRequest);
        }
        catch (Exception e) {
            log.error("\u6d88\u606f\u63a8\u9001\u52a9\u624b\u901a\u77e5\u53d1\u9001\u5931\u8d25", (Throwable)e);
        }
    }

    private boolean prepareTelegramPhotoRequest(SendPhotoRequest sendPhotoRequest, boolean toGroup) {
        TelegramResponse telegramResponse = this.telegramClientUtils.getTelegramResponse();
        sendPhotoRequest.setTelegramClient(this.telegramClientUtils.getTelegramClient());
        sendPhotoRequest.setParseMode("HTML");
        if (telegramResponse != null) {
            sendPhotoRequest.setChatId(toGroup ? telegramResponse.getBotChatGroupId() : telegramResponse.getBotChatId());
            return true;
        }
        return false;
    }

    private boolean prepareTelegramMessageRequest(SendMessageRequest sendMessageRequest, boolean toGroup) {
        TelegramResponse telegramResponse = this.telegramClientUtils.getTelegramResponse();
        sendMessageRequest.setTelegramClient(this.telegramClientUtils.getTelegramClient());
        if (telegramResponse != null) {
            sendMessageRequest.setChatId(toGroup ? telegramResponse.getBotChatGroupId() : telegramResponse.getBotChatId());
            return true;
        }
        return false;
    }

    private String renderPhotoTemplate(SendPhotoRequest sendPhotoRequest, String templateCode, String channelType, NotifyMessageType messageType) {
        Map<String, String> variables = this.buildPhotoVariables(sendPhotoRequest, channelType);
        String template = this.notifyTemplateCacheLoaderUtils.getTemplateContent(templateCode, channelType);
        if (!StringUtils.hasText((String)template)) {
            log.warn("\u672a\u83b7\u53d6\u5230\u6a21\u677f\uff1acode={}, channel={}, type={}", new Object[]{templateCode, channelType, messageType});
            return "";
        }
        return TemplateRenderUtils.render(template, variables);
    }

    private String renderTextTemplate(SendMessageRequest sendMessageRequest, String templateCode, String channelType) {
        Map<String, String> variables = this.buildTextVariables(sendMessageRequest, channelType);
        String template = this.notifyTemplateCacheLoaderUtils.getTemplateContent(templateCode, channelType);
        if (!StringUtils.hasText((String)template)) {
            log.warn("\u672a\u83b7\u53d6\u5230\u6a21\u677f\uff1acode={}, channel={}, type={}", new Object[]{templateCode, channelType, NotifyMessageType.TEXT});
            return "";
        }
        return TemplateRenderUtils.render(template, variables);
    }

    private Map<String, String> buildPhotoVariables(SendPhotoRequest sendPhotoRequest, String channelType) {
        HashMap<String, String> variables = new HashMap<String, String>();
        boolean hideServerUrl = "messagepush".equals(channelType);
        variables.put("name", this.safe(sendPhotoRequest.getName()));
        variables.put("overview", this.safe(sendPhotoRequest.getOverview()));
        variables.put("tvInfo", this.safe(sendPhotoRequest.getTvInfo()));
        variables.put("tvInfoBlock", (String)(StringUtils.hasText((String)sendPhotoRequest.getTvInfo()) ? sendPhotoRequest.getTvInfo() + "\n\n" : ""));
        variables.put("displayTitle", this.safe(sendPhotoRequest.getDisplayTitle()));
        variables.put("displayTitleBlock", (String)(StringUtils.hasText((String)sendPhotoRequest.getDisplayTitle()) ? "\ud83d\udcfa \u5206\u8fa8\u7387\uff1a" + sendPhotoRequest.getDisplayTitle() + "\n" : ""));
        variables.put("genres", this.safe(sendPhotoRequest.getGenres()));
        variables.put("genresBlock", (String)(StringUtils.hasText((String)sendPhotoRequest.getGenres()) ? "\ud83c\udff7 \u6807\u7b7e\uff1a" + sendPhotoRequest.getGenres() + "\n" : ""));
        variables.put("type", this.safe(sendPhotoRequest.getType()));
        variables.put("typeTag", this.buildTypeTag(sendPhotoRequest.getType()));
        variables.put("size", this.safe(sendPhotoRequest.getSize()));
        variables.put("sizeBlock", this.buildSizeBlock(sendPhotoRequest.getSize()));
        variables.put("backdropPath", this.safe(sendPhotoRequest.getBackdropPath()));
        Object backdropImageBlock = "";
        if (!"wechat".equals(channelType) && !"wechatBot".equals(channelType) && StringUtils.hasText((String)sendPhotoRequest.getBackdropPath())) {
            backdropImageBlock = "![\u5c01\u9762\u56fe](" + sendPhotoRequest.getBackdropPath() + ")\n";
        }
        variables.put("backdropImageBlock", (String)backdropImageBlock);
        variables.put("imgUrl", this.safe(sendPhotoRequest.getImgUrl()));
        variables.put("tmdbUrl", this.safe(sendPhotoRequest.getTmdbUrl()));
        variables.put("parseMode", this.safe(sendPhotoRequest.getParseMode()));
        variables.put("serverUrl", hideServerUrl ? "" : this.safe(sendPhotoRequest.getServerUrl()));
        variables.put("serverName", this.safe(sendPhotoRequest.getServerName()));
        variables.put("serverUrlBlock", (String)(!hideServerUrl && StringUtils.hasText((String)sendPhotoRequest.getServerUrl()) ? "\ud83c\udf10 \u670d\u52a1\u5668\uff1a" + sendPhotoRequest.getServerUrl() + "\n\n" : ""));
        variables.put("playUser", this.safe(sendPhotoRequest.getPlayUser()));
        variables.put("playTitle", this.safe(sendPhotoRequest.getPlayTitle()));
        variables.put("userLocation", this.safe(sendPhotoRequest.getUserLocation()));
        variables.put("playTime", this.safe(sendPhotoRequest.getPlayTime()));
        variables.put("playPosition", this.safe(sendPhotoRequest.getPlayPosition()));
        variables.put("clientInfo", this.safe(sendPhotoRequest.getClientInfo()));
        variables.put("productionYear", sendPhotoRequest.getProductionYear() != null ? String.valueOf(sendPhotoRequest.getProductionYear()) : "");
        variables.put("seriesName", this.safe(sendPhotoRequest.getSeriesName()));
        variables.put("seasonNumber", sendPhotoRequest.getSeasonNumber() > 0 ? String.valueOf(sendPhotoRequest.getSeasonNumber()) : "");
        variables.put("episodeNumber", sendPhotoRequest.getEpisodeNumber() > 0 ? String.valueOf(sendPhotoRequest.getEpisodeNumber()) : "");
        variables.put("doubleLineBreak", "\n\n");
        variables.put("lineBreak", "\n");
        variables.put("releaseDate", this.safe(sendPhotoRequest.getReleaseDate()));
        if (sendPhotoRequest.getExtraVariables() != null) {
            variables.putAll(sendPhotoRequest.getExtraVariables());
        }
        if (!StringUtils.hasText((String)((String)variables.get("mediaTypeLabel")))) {
            variables.put("mediaTypeLabel", "movie".equalsIgnoreCase(sendPhotoRequest.getType()) ? "\u7535\u5f71" : "\u5267\u96c6");
        }
        return variables;
    }

    private Map<String, String> buildTextVariables(SendMessageRequest sendMessageRequest, String channelType) {
        HashMap<String, String> variables = new HashMap<String, String>();
        boolean hideServerUrl = "messagepush".equals(channelType);
        variables.put("name", this.safe(sendMessageRequest.getName()));
        variables.put("overview", this.safe(sendMessageRequest.getOverview()));
        variables.put("tmdbUrl", this.safe(sendMessageRequest.getTmdbUrl()));
        variables.put("imgUrl", this.safe(sendMessageRequest.getImgUrl()));
        variables.put("parseMode", this.safe(sendMessageRequest.getParseMode()));
        variables.put("serverUrl", hideServerUrl ? "" : this.safe(sendMessageRequest.getServerUrl()));
        variables.put("serverName", this.safe(sendMessageRequest.getServerName()));
        variables.put("serverUrlBlock", (String)(!hideServerUrl && StringUtils.hasText((String)sendMessageRequest.getServerUrl()) ? "\ud83c\udf10 \u670d\u52a1\u5668\uff1a" + sendMessageRequest.getServerUrl() + "\n\n" : ""));
        variables.put("doubleLineBreak", "\n\n");
        variables.put("lineBreak", "\n");
        if (sendMessageRequest.getExtraVariables() != null) {
            variables.putAll(sendMessageRequest.getExtraVariables());
        }
        return variables;
    }

    private String buildTypeTag(String type) {
        if (!StringUtils.hasText((String)type)) {
            return "#\u7535\u5f71";
        }
        return "Movie".equalsIgnoreCase(type) ? "#\u7535\u5f71" : "#\u5267\u96c6";
    }

    private String buildSizeBlock(String size) {
        if (StringUtils.hasText((String)size) && !"0".equals(size)) {
            return "\ud83d\udce6 \u6587\u4ef6\u5927\u5c0f\uff1a" + size + "\n\n";
        }
        return "\n";
    }

    private String safe(String value) {
        return value == null ? "" : value;
    }

    private record CustomPoster(byte[] horizontal, byte[] vertical) {
    }
}
