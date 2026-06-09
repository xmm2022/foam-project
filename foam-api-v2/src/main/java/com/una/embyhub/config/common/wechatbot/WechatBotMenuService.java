/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.context.event.ApplicationReadyEvent
 *  org.springframework.context.event.EventListener
 *  org.springframework.http.HttpEntity
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.stereotype.Service
 *  org.springframework.util.MultiValueMap
 *  org.springframework.util.StringUtils
 *  org.springframework.web.client.RestTemplate
 */
package com.una.embyhub.config.common.wechatbot;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.config.common.wechatbot.WechatBotProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Service
public class WechatBotMenuService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatBotMenuService.class);
    public static final String EVENT_KEY_HELP = "WECHAT_BOT_HELP";
    public static final String EVENT_KEY_STATS = "WECHAT_BOT_STATS";
    public static final String EVENT_KEY_CREATE_USER = "WECHAT_BOT_CREATE_USER";
    public static final String EVENT_KEY_EXTEND_USERS = "WECHAT_BOT_EXTEND_USERS";
    public static final String EVENT_KEY_GENERATE_CARDS = "WECHAT_BOT_GENERATE_CARDS";
    public static final String EVENT_KEY_SEARCH_GUIDE = "WECHAT_BOT_SEARCH_GUIDE";
    public static final String EVENT_KEY_SEARCH_SAMPLE = "WECHAT_BOT_SEARCH_SAMPLE";
    public static final String EVENT_KEY_EMBY_SEARCH = "WECHAT_BOT_EMBY_SEARCH";
    private static final String TOKEN_API = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=%s&corpsecret=%s";
    private static final String MENU_API = "https://qyapi.weixin.qq.com/cgi-bin/menu/create?access_token=%s&agentid=%s";
    private final NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;
    private final RestTemplate restTemplate = new RestTemplate();

    @EventListener(value={ApplicationReadyEvent.class})
    public void autoSyncMenu() {
        this.syncMenuInternal("\u5e94\u7528\u542f\u52a8\u81ea\u52a8\u5237\u65b0\u83dc\u5355");
    }

    public boolean syncMenu() {
        return this.syncMenuInternal("\u624b\u52a8\u89e6\u53d1\u83dc\u5355\u5237\u65b0");
    }

    private boolean syncMenuInternal(String scene) {
        WechatBotProperties properties = this.getProperties();
        if (properties == null || !properties.isMenuEnabled()) {
            log.info("\u4f01\u4e1a\u5fae\u4fe1\u83dc\u5355\u672a\u542f\u7528\uff0c\u8df3\u8fc7\u540c\u6b65");
            return false;
        }
        if (!this.hasMenuConfig(properties)) {
            log.warn("\u7f3a\u5c11\u83dc\u5355\u6240\u9700\u7684 corpId/agentId/appSecret\uff0c\u65e0\u6cd5\u540c\u6b65\u4f01\u4e1a\u5fae\u4fe1\u83dc\u5355");
            return false;
        }
        String token = this.fetchAccessToken(properties);
        if (!StringUtils.hasText((String)token)) {
            log.warn("{}\u5931\u8d25\uff1a\u83b7\u53d6 access_token \u4e3a\u7a7a", (Object)scene);
            return false;
        }
        boolean success = this.pushMenu(token, properties);
        if (success) {
            log.info("{}\u6210\u529f", (Object)scene);
        }
        return success;
    }

    private boolean hasMenuConfig(WechatBotProperties properties) {
        return properties != null && StringUtils.hasText((String)properties.getCorpId()) && StringUtils.hasText((String)properties.getAgentId()) && StringUtils.hasText((String)properties.getAppSecret());
    }

    private String fetchAccessToken(WechatBotProperties properties) {
        String url = String.format(TOKEN_API, properties.getCorpId(), properties.getAppSecret());
        ResponseEntity response = this.restTemplate.getForEntity(url, String.class, new Object[0]);
        JSONObject body = JSONObject.parseObject((String)((String)response.getBody()));
        if (body == null) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1 access_token \u54cd\u5e94\u4e3a\u7a7a");
            return null;
        }
        Integer errCode = body.getInteger("errcode");
        if (errCode != null && errCode != 0) {
            log.warn("\u83b7\u53d6\u4f01\u4e1a\u5fae\u4fe1 access_token \u5931\u8d25\uff0cerrcode={}\uff0cerrmsg={}", (Object)errCode, (Object)body.getString("errmsg"));
            return null;
        }
        return body.getString("access_token");
    }

    private boolean pushMenu(String accessToken, WechatBotProperties properties) {
        String url = String.format(MENU_API, accessToken, properties.getAgentId());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity request = new HttpEntity(this.buildMenuPayload(), (MultiValueMap)headers);
        ResponseEntity response = this.restTemplate.postForEntity(url, (Object)request, String.class, new Object[0]);
        JSONObject body = JSONObject.parseObject((String)((String)response.getBody()));
        if (body == null) {
            log.warn("\u521b\u5efa\u4f01\u4e1a\u5fae\u4fe1\u83dc\u5355\u8fd4\u56de\u7a7a\u54cd\u5e94");
            return false;
        }
        Integer errCode = body.getInteger("errcode");
        if (errCode != null && errCode == 0) {
            return true;
        }
        log.warn("\u521b\u5efa\u4f01\u4e1a\u5fae\u4fe1\u83dc\u5355\u5931\u8d25\uff0cerrcode={}\uff0cerrmsg={}", (Object)errCode, (Object)body.getString("errmsg"));
        return false;
    }

    private Map<String, Object> buildMenuPayload() {
        HashMap<String, Object> payload = new HashMap<String, Object>();
        ArrayList buttons = new ArrayList();
        HashMap<String, Object> userMenu = new HashMap<String, Object>();
        userMenu.put("name", "\u7528\u6237");
        userMenu.put("sub_button", List.of(this.clickButton("\u5f00\u59cb / \u5e2e\u52a9", EVENT_KEY_HELP), this.clickButton("\u521b\u5efa\u7528\u6237", EVENT_KEY_CREATE_USER), this.clickButton("\u6279\u91cf\u5ef6\u671f", EVENT_KEY_EXTEND_USERS), this.clickButton("\u7528\u6237\u7edf\u8ba1", EVENT_KEY_STATS)));
        HashMap<String, Object> cardMenu = new HashMap<String, Object>();
        cardMenu.put("name", "\u5361\u5bc6");
        cardMenu.put("sub_button", List.of(this.clickButton("\u751f\u6210\u5361\u5bc6", EVENT_KEY_GENERATE_CARDS)));
        HashMap<String, Object> searchMenu = new HashMap<String, Object>();
        searchMenu.put("name", "\u641c\u7d22");
        searchMenu.put("sub_button", List.of(this.clickButton("\u641c\u7d22\u8d44\u6e90\u5e93", EVENT_KEY_EMBY_SEARCH), this.clickButton("\u641c\u7d22TMDB", EVENT_KEY_SEARCH_GUIDE), this.clickButton("\u793a\u4f8b\u641c\u7d22", EVENT_KEY_SEARCH_SAMPLE)));
        buttons.add(userMenu);
        buttons.add(cardMenu);
        buttons.add(searchMenu);
        payload.put("button", buttons);
        return payload;
    }

    private Map<String, Object> clickButton(String name, String key) {
        HashMap<String, Object> button = new HashMap<String, Object>();
        button.put("type", "click");
        button.put("name", name);
        button.put("key", key);
        return button;
    }

    private WechatBotProperties getProperties() {
        String json = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("wechatBot");
        if (!StringUtils.hasText((String)json)) {
            return null;
        }
        return (WechatBotProperties)JSONObject.parseObject((String)json, WechatBotProperties.class);
    }

    @Generated
    public WechatBotMenuService(NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils) {
        this.notifyChannelCacheLoaderUtils = notifyChannelCacheLoaderUtils;
    }
}
