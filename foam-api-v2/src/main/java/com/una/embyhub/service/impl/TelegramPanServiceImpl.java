/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  lombok.Generated
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery
 *  org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod
 *  org.telegram.telegrambots.meta.api.methods.send.SendMessage
 *  org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText
 *  org.telegram.telegrambots.meta.api.objects.CallbackQuery
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow
 *  org.telegram.telegrambots.meta.exceptions.TelegramApiException
 *  org.telegram.telegrambots.meta.generics.TelegramClient
 */
package com.una.embyhub.service.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.una.embyhub.config.common.utils.TelegramClientUtils;
import com.una.embyhub.model.dto.response.telegram.SearchResponse;
import com.una.embyhub.service.TelegramPanService;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

@Service
public class TelegramPanServiceImpl
implements TelegramPanService {
    @Autowired
    private TelegramClientUtils telegramClientUtils;
    private String defaultChatId;
    private static final int TG_TEXT_LIMIT = 4096;
    private static final boolean DISABLE_WEB_PREVIEW = true;
    private static final int CATEGORY_PAGE_SIZE = 8;
    private static final int ENTRY_PAGE_SIZE = 12;
    private Map<String, List<LinkEntry>> categoryMap = new LinkedHashMap<String, List<LinkEntry>>();
    private List<String> categoryOrder = new ArrayList<String>();
    private final Map<String, String> tipByChat = new ConcurrentHashMap<String, String>();

    @Override
    public void pushHome(String chatId, SearchResponse payload, String ignoredBotToken, String name, String tip) {
        try {
            JSONObject root = JSON.parseObject((String)JSONObject.toJSONString((Object)payload, (JSONWriter.Feature[])new JSONWriter.Feature[0]));
            JSONArray results = root.getJSONObject("data").getJSONArray("results");
            this.buildCategories(results);
        }
        catch (Exception e) {
            System.err.println("[TG] JSON \u7ed3\u6784\u89e3\u6790\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5 data.results\uff1a" + e.getMessage());
            return;
        }
        if (chatId != null) {
            this.tipByChat.put(chatId, tip == null ? "" : tip);
        }
        int page = 0;
        String storedTip = this.tipByChat.getOrDefault(chatId, "");
        String text = this.renderHomeText(page, storedTip);
        InlineKeyboardMarkup kb = this.buildCategoryKeyboard(page);
        this.sendOrChunk(chatId, text, kb, true);
    }

    public void onCallback(CallbackQuery cb) {
        if (cb == null) {
            return;
        }
        String data = cb.getData();
        if (data == null) {
            return;
        }
        String chatId = String.valueOf(cb.getMessage().getChatId());
        Integer messageId = cb.getMessage().getMessageId();