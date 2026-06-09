/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.http.HttpEntity
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.util.MultiValueMap
 *  org.springframework.util.StringUtils
 *  org.springframework.web.client.RestTemplate
 */
package com.una.embyhub.config.common.utils;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

public class WechatWorkUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatWorkUtils.class);
    private static final String WEBHOOK_BASE = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=";

    private WechatWorkUtils() {
    }

    public static void sendMarkdownMessage(String webhookUrl, String content) {
        HashMap<String, Object> payload = new HashMap<String, Object>();
        payload.put("msgtype", "markdown");
        payload.put("markdown", Collections.singletonMap("content", content));
        WechatWorkUtils.post(webhookUrl, payload);
    }

    public static void sendNewsMessage(String webhookUrl, String title, String description, String url, String picUrl) {
        HashMap<String, Object> payload = new HashMap<String, Object>();
        payload.put("msgtype", "news");
        HashMap<String, String> article = new HashMap<String, String>();
        article.put("title", StringUtils.hasText((String)title) ? title : "");
        article.put("description", StringUtils.hasText((String)description) ? description : "");
        if (StringUtils.hasText((String)url)) {
            article.put("url", url);
        }
        if (StringUtils.hasText((String)picUrl)) {
            article.put("picurl", picUrl);
        }
        HashMap news = new HashMap();
        news.put("articles", Collections.singletonList(article));
        payload.put("news", news);
        WechatWorkUtils.post(webhookUrl, payload);
    }

    public static void sendImageMessage(String webhookUrl, byte[] imageBytes) {
        if (imageBytes == null || imageBytes.length == 0) {
            log.warn("\u56fe\u7247\u6570\u636e\u4e3a\u7a7a\uff0c\u53d6\u6d88\u4f01\u4e1a\u5fae\u4fe1\u56fe\u7247\u63a8\u9001");
            return;
        }
        HashMap<String, Object> payload = new HashMap<String, Object>();
        payload.put("msgtype", "image");
        HashMap<String, String> image = new HashMap<String, String>();
        image.put("base64", Base64.getEncoder().encodeToString(imageBytes));
        image.put("md5", WechatWorkUtils.md5Hex(imageBytes));
        payload.put("image", image);
        WechatWorkUtils.post(webhookUrl, payload);
    }

    private static void post(String webhookUrl, Map<String, Object> payload) {
        String resolvedWebhook = WechatWorkUtils.resolveWebhook(webhookUrl);
        if (!StringUtils.hasText((String)resolvedWebhook)) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1 Webhook \u5730\u5740\u4e3a\u7a7a\uff0c\u53d6\u6d88\u63a8\u9001");
            return;
        }
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity requestEntity = new HttpEntity(payload, (MultiValueMap)headers);
        ResponseEntity response = restTemplate.postForEntity(resolvedWebhook, (Object)requestEntity, String.class, new Object[0]);
        if (!response.getStatusCode().is2xxSuccessful()) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u6d88\u606f\u53d1\u9001\u5931\u8d25\uff0c\u72b6\u6001\u7801\uff1a{}\uff0c\u54cd\u5e94\uff1a{}", (Object)response.getStatusCode(), response.getBody());
            throw new RuntimeException("\u4f01\u4e1a\u5fae\u4fe1\u6d88\u606f\u53d1\u9001\u5931\u8d25");
        }
        log.info("\u4f01\u4e1a\u5fae\u4fe1\u6d88\u606f\u53d1\u9001\u6210\u529f");
    }

    private static String resolveWebhook(String webhookUrlOrKey) {
        if (!StringUtils.hasText((String)webhookUrlOrKey)) {
            return webhookUrlOrKey;
        }
        if (webhookUrlOrKey.startsWith("http")) {
            return webhookUrlOrKey;
        }
        return WEBHOOK_BASE + webhookUrlOrKey;
    }

    private static String md5Hex(byte[] data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(data);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
        catch (Exception e) {
            throw new RuntimeException("\u8ba1\u7b97\u56fe\u7247 MD5 \u5931\u8d25", e);
        }
    }
}
