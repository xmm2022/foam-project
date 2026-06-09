/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.StringUtils
 *  org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod
 *  org.telegram.telegrambots.meta.api.methods.send.SendMessage
 *  org.telegram.telegrambots.meta.api.methods.send.SendMessage$SendMessageBuilder
 *  org.telegram.telegrambots.meta.api.methods.send.SendPhoto
 *  org.telegram.telegrambots.meta.api.methods.send.SendPhoto$SendPhotoBuilder
 *  org.telegram.telegrambots.meta.api.objects.InputFile
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow
 *  org.telegram.telegrambots.meta.exceptions.TelegramApiException
 */
package com.una.embyhub.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.una.embyhub.model.dto.request.telegram.SendMessageRequest;
import com.una.embyhub.model.dto.request.telegram.SendPhotoRequest;
import com.una.embyhub.service.TelegramService;
import java.util.ArrayList;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class TelegramServiceImpl
implements TelegramService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(TelegramServiceImpl.class);

    @Override
    public boolean sendPhoto(SendPhotoRequest sendPhotoRequest) throws TelegramApiException {
        if (sendPhotoRequest.getTelegramClient() == null) {
            log.info("Telegram Bot\u672a\u542f\u7528\uff0c\u4e0d\u53d1\u9001\u56fe\u7247\u6d88\u606f");
        }
        log.info("Telegram\u53d1\u9001\u56fe\u7247\u6d88\u606f:{}", (Object)JSONObject.toJSONString((Object)sendPhotoRequest, (JSONWriter.Feature[])new JSONWriter.Feature[0]));
        String caption = sendPhotoRequest.getCaption();
        if (!StringUtils.hasText((String)caption)) {
            StringBuilder sb = new StringBuilder();
            if ("Movie".equals(sendPhotoRequest.getType()) || "movie".equals(sendPhotoRequest.getType())) {
                sb.append("\u540d\u79f0\uff1a" + sendPhotoRequest.getName());
                sb.append("\n\n");
            } else {
                sb.append("\u540d\u79f0\uff1a" + sendPhotoRequest.getName());
                sb.append("\n\n");
                if (StringUtils.hasText((String)sendPhotoRequest.getTvInfo())) {
                    sb.append(sendPhotoRequest.getTvInfo());
                    sb.append("\n\n");
                }
            }
            if (StringUtils.hasText((String)sendPhotoRequest.getDisplayTitle())) {
                sb.append("\ud83d\udcfa \u5206\u8fa8\u7387\uff1a" + sendPhotoRequest.getDisplayTitle());
                sb.append("\n");
            }
            if (StringUtils.hasText((String)sendPhotoRequest.getGenres())) {
                sb.append("\ud83c\udff7 \u6807\u7b7e\uff1a" + sendPhotoRequest.getGenres());
                sb.append("\n");
            }
            sb.append("\ud83d\uddc2 \u7c7b\u578b\uff1a" + ("Movie".equals(sendPhotoRequest.getType()) || "movie".equals(sendPhotoRequest.getType()) ? "#\u7535\u5f71" : "#\u5267\u96c6"));
            sb.append("\n");
            if (sendPhotoRequest.getSize() != null && !"0".equals(sendPhotoRequest.getSize())) {
                sb.append("\ud83d\udce6 \u6587\u4ef6\u5927\u5c0f\uff1a" + sendPhotoRequest.getSize());
                sb.append("\n");
            }
            sb.append("\n");
            sb.append("\u7b80\u4ecb\uff1a" + sendPhotoRequest.getOverview());
            caption = sb.toString();
        }
        SendPhoto.SendPhotoBuilder sendPhotoBuilder = SendPhoto.builder();
        ArrayList<InlineKeyboardRow> inlineKeyboardRowList = new ArrayList<InlineKeyboardRow>();
        if (StringUtils.hasText((String)sendPhotoRequest.getTmdbUrl())) {
            InlineKeyboardRow tmdbRow = new InlineKeyboardRow();
            InlineKeyboardButton tmdbButton = new InlineKeyboardButton("");
            tmdbButton.setText("TMDB\u94fe\u63a5");
            tmdbButton.setUrl(sendPhotoRequest.getTmdbUrl());
            tmdbRow.add((Object)tmdbButton);
            inlineKeyboardRowList.add(tmdbRow);
        }