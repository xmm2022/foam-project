/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 *  org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient
 *  org.telegram.telegrambots.meta.generics.TelegramClient
 */
package com.una.embyhub.config.common.utils;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.meta.generics.TelegramClient;

@Component
public class TelegramClientUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(TelegramClientUtils.class);
    @Autowired
    private NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;

    public TelegramClient getTelegramClient() {
        OkHttpTelegramClient telegramClient = null;
        String notifyChannelValue = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("telegram");
        if (StringUtils.hasText((String)notifyChannelValue)) {
            TelegramResponse telegramResponse = (TelegramResponse)JSONObject.parseObject((String)notifyChannelValue, TelegramResponse.class);
            telegramClient = new OkHttpTelegramClient(telegramResponse.getBotToken());
        }
        return telegramClient;
    }

    public TelegramResponse getTelegramResponse() {
        String notifyChannelValue = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("telegram");
        if (!StringUtils.hasText((String)notifyChannelValue)) {
            log.info("Telegram\u914d\u7f6e\u672a\u5f00\u542f ,\u4e0d\u53d1\u9001\u56fe\u7247\u6d88\u606f");
            return null;
        }
        TelegramResponse telegramResponse = (TelegramResponse)JSONObject.parseObject((String)notifyChannelValue, TelegramResponse.class);
        return telegramResponse;
    }
}
