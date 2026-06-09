/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  jakarta.annotation.PostConstruct
 *  jakarta.annotation.PreDestroy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.telegrambot;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.telegrambot.DataQueryBot;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import com.una.embyhub.pointsbot.telegram.TelegramBotApiClient;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class BotInitializer {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(BotInitializer.class);
    @Autowired
    private DataQueryBot dataQueryBot;
    @Autowired
    private NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;
    private TelegramBotApiClient mtProtoClient;

    @PostConstruct
    public void start() {
        try {
            String notifyChannelValue = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("telegram");
            if (StringUtils.hasText((String)notifyChannelValue)) {
                TelegramResponse telegramResponse = (TelegramResponse)JSONObject.parseObject((String)notifyChannelValue, TelegramResponse.class);
                if (!StringUtils.hasText((String)telegramResponse.getBotToken()) || telegramResponse.getApiId() == null || telegramResponse.getApiId() <= 0 || !StringUtils.hasText((String)telegramResponse.getApiHash())) {
                    log.info("Telegram MTProto \u53c2\u6570\u672a\u914d\u7f6e\u5b8c\u6574\uff0c\u673a\u5668\u4eba\u4e0d\u542f\u52a8");
                    return;
                }
                this.mtProtoClient = new TelegramBotApiClient(telegramResponse.getBotToken(), telegramResponse.getApiId(), telegramResponse.getApiHash(), null, this.dataQueryBot::consume);
                this.mtProtoClient.start();
                this.dataQueryBot.attachMtProtoClient(this.mtProtoClient);
                log.info("Telegram MTProto \u673a\u5668\u4eba\u6210\u529f\u542f\u52a8\uff01");
            } else {
                log.info("Telegram\u914d\u7f6e\u672a\u5f00\u542f\uff0c\u673a\u5668\u4eba\u4e0d\u542f\u52a8");
            }
        }
        catch (Exception e) {
            log.error("\u542f\u52a8\u673a\u5668\u4eba\u5931\u8d25: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void stop() {
        if (this.mtProtoClient != null) {
            this.mtProtoClient.close();
        }
    }
}
