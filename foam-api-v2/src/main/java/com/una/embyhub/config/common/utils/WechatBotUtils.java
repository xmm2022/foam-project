/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.core.io.ByteArrayResource
 *  org.springframework.http.HttpEntity
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.util.LinkedMultiValueMap
 *  org.springframework.util.MultiValueMap
 *  org.springframework.util.StringUtils
 *  org.springframework.web.client.RestTemplate
 */
package com.una.embyhub.config.common.utils;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.wechatbot.WechatBotProperties;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

public class WechatBotUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatBotUtils.class);
    private static final String TOKEN_API = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=%s&corpsecret=%s";
    private static final String MESSAGE_API = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=%s";
    private static final String MEDIA_UPLOAD_API = "https://qyapi.weixin.qq.com/cgi-bin/media/upload?access_token=%s&type=image";

    private WechatBotUtils() {
    }

    public static boolean sendMarkdownMessage(WechatBotProperties properties, String content) {
        return WechatBotUtils.sendMarkdownMessage(properties, content, "@all");
    }

    public static boolean sendMarkdownMessage(WechatBotProperties properties, String content, String toUser) {
        String accessToken = WechatBotUtils.fetchAccessToken(properties);
        if (!StringUtils.hasText((String)accessToken)) {
            return false;
        }
        Map<String, Object> payload = WechatBotUtils.basePayload(properties, toUser);
        payload.put("msgtype", "markdown");
        payload.put("markdown", Map.of("content", content));
        return WechatBotUtils.postMessage(accessToken, payload);
    }

    public static boolean sendNewsMessage(WechatBotProperties properties, String title, String description, String url, String picUrl) {
        String accessToken = WechatBotUtils.fetchAccessToken(properties);
        if (!StringUtils.hasText((String)accessToken)) {
            return false;
        }
        HashMap<String, String> article = new HashMap<String, String>();
        article.put("title", StringUtils.hasText((String)title) ? title : "");
        article.put("description", StringUtils.hasText((String)description) ? description : "");
        if (StringUtils.hasText((String)url)) {
            article.put("url", url);
        }
        if (StringUtils.hasText((String)picUrl)) {
            article.put("picurl", picUrl);
        }
        Map<String, Object> payload = WechatBotUtils.basePayload(properties, "@all");
        payload.put("msgtype", "news");
        payload.put("news", Map.of("articles", List.of(article)));
        return WechatBotUtils.postMessage(accessToken, payload);
    }

    public static boolean sendImageMessage(WechatBotProperties properties, byte[] imageBytes) {
        if (imageBytes == null || imageBytes.length == 0) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u5e94\u7528\u56fe\u7247\u4e3a\u7a7a\uff0c\u53d6\u6d88\u53d1\u9001");
            return false;
        }
        String accessToken = WechatBotUtils.fetchAccessToken(properties);
        if (!StringUtils.hasText((String)accessToken)) {
            return false;
        }
        String mediaId = WechatBotUtils.uploadImage(accessToken, imageBytes);
        if (!StringUtils.hasText((String)mediaId)) {
            return false;
        }
        Map<String, Object> payload = WechatBotUtils.basePayload(properties, "@all");
        payload.put("msgtype", "image");
        payload.put("image", Map.of("media_id", mediaId));
        return WechatBotUtils.postMessage(accessToken, payload);
    }

    private static String fetchAccessToken(WechatBotProperties properties) {
        if (properties == null || !StringUtils.hasText((String)properties.getCorpId()) || !StringUtils.hasText((String)properties.getAppSecret())) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u5e94\u7528\u7f3a\u5c11 corpId \u6216 appSecret\uff0c\u65e0\u6cd5\u83b7\u53d6 access_token");
            return null;
        }
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(TOKEN_API, properties.getCorpId(), properties.getAppSecret());
        ResponseEntity response = restTemplate.getForEntity(url, String.class, new Object[0]);
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

    private static Map<String, Object> basePayload(WechatBotProperties properties) {
        return WechatBotUtils.basePayload(properties, "@all");
    }

    private static Map<String, Object> basePayload(WechatBotProperties properties, String toUser) {
        HashMap<String, Object> payload = new HashMap<String, Object>();
        payload.put("touser", StringUtils.hasText((String)toUser) ? toUser : "@all");
        payload.put("agentid", properties.getAgentId());
        return payload;
    }

    private static boolean postMessage(String accessToken, Map<String, Object> payload) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity requestEntity = new HttpEntity(payload, (MultiValueMap)headers);
        String url = String.format(MESSAGE_API, accessToken);
        ResponseEntity response = restTemplate.postForEntity(url, (Object)requestEntity, String.class, new Object[0]);
        JSONObject body = JSONObject.parseObject((String)((String)response.getBody()));
        if (body == null) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u5e94\u7528\u53d1\u9001\u8fd4\u56de\u7a7a\u54cd\u5e94");
            return false;
        }
        Integer errCode = body.getInteger("errcode");
        if (errCode == null || errCode != 0) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u5e94\u7528\u53d1\u9001\u5931\u8d25\uff0cerrcode={}\uff0cerrmsg={}", (Object)errCode, (Object)body.getString("errmsg"));
            return false;
        }
        log.info("\u4f01\u4e1a\u5fae\u4fe1\u5e94\u7528\u6d88\u606f\u53d1\u9001\u6210\u529f");
        return true;
    }

    private static String uploadImage(String accessToken, byte[] imageBytes) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add((Object)"media", (Object)new ByteArrayResource(imageBytes){

            public String getFilename() {
                return "image.jpg";
            }
        });
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity requestEntity = new HttpEntity((Object)body, (MultiValueMap)headers);
        String url = String.format(MEDIA_UPLOAD_API, accessToken);
        ResponseEntity response = restTemplate.postForEntity(url, (Object)requestEntity, String.class, new Object[0]);
        JSONObject json = JSONObject.parseObject((String)((String)response.getBody()));
        if (json == null) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u56fe\u7247\u4e0a\u4f20\u8fd4\u56de\u7a7a\u54cd\u5e94");
            return null;
        }
        Integer errCode = json.getInteger("errcode");
        if (errCode != null && errCode == 0) {
            return json.getString("media_id");
        }
        log.warn("\u4f01\u4e1a\u5fae\u4fe1\u56fe\u7247\u4e0a\u4f20\u5931\u8d25\uff0cerrcode={}\uff0cerrmsg={}", (Object)errCode, (Object)json.getString("errmsg"));
        return null;
    }
}
