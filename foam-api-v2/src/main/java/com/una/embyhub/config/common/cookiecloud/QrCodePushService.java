/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  org.springframework.web.client.RestTemplate
 */
package com.una.embyhub.config.common.cookiecloud;

import com.una.embyhub.config.common.cookiecloud.WeChatIpProperties;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import org.springframework.web.client.RestTemplate;

public class QrCodePushService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(QrCodePushService.class);
    private static final String HELLOIMG_UPLOAD_URL = "https://www.helloimg.com/api/v1/upload";
    private static final String PUSHPLUS_SEND_URL = "http://www.pushplus.plus/send/";
    private final WeChatIpProperties properties;
    private final RestTemplate restTemplate;

    public QrCodePushService(WeChatIpProperties properties) {
        this.properties = properties;
        this.restTemplate = new RestTemplate();
    }

    public QrCodePushService(WeChatIpProperties properties, RestTemplate restTemplate) {
        this.properties = properties;
        this.restTemplate = restTemplate;
    }

    public boolean pushQrCode(byte[] qrCodeBytes) {
        if (!this.properties.hasQrCodePush()) {
            log.warn("\u672a\u914d\u7f6e\u4e8c\u7ef4\u7801\u63a8\u9001token\uff0c\u8df3\u8fc7\u63a8\u9001");
            return false;
        }
        try {
            UploadResult uploadResult = this.uploadToHelloImg(qrCodeBytes);
            if (uploadResult == null) {
                log.error("\u4e0a\u4f20\u4e8c\u7ef4\u7801\u5230\u56fe\u5e8a\u5931\u8d25");
                return false;
            }
            String title = uploadResult.expireTime;
            String content = String.format("\u4f01\u4e1a\u5fae\u4fe1\u767b\u5f55\u4e8c\u7ef4\u7801<br/><img src='%s' />", uploadResult.imageUrl);
            boolean sent = this.sendPushPlusMessage(title, content);
            if (sent) {
                log.info("\u4e8c\u7ef4\u7801\u63a8\u9001\u6210\u529f\uff0c\u8fc7\u671f\u65f6\u95f4: {}", (Object)uploadResult.expireTime);
            }
            return sent;
        }
        catch (Exception e) {
            log.error("\u63a8\u9001\u4e8c\u7ef4\u7801\u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
            return false;
        }
    }

    public UploadResult uploadToHelloImg(byte[] imageBytes) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
            headers.set("Authorization", "Bearer " + this.properties.getHelloimgToken());
            headers.set("Accept", "application/json");
            LinkedMultiValueMap body = new LinkedMultiValueMap();
            body.add((Object)"file", (Object)new ByteArrayResource(this, imageBytes){

                public String getFilename() {
                    return "qr_code.png";
                }
            });
            body.add((Object)"permission", (Object)"1");
            body.add((Object)"strategy_id", (Object)"1");
            body.add((Object)"album_id", (Object)"1");
            String expiredAt = LocalDateTime.now().plusHours(24L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            body.add((Object)"expired_at", (Object)expiredAt);
            HttpEntity entity = new HttpEntity((Object)body, (MultiValueMap)headers);
            ResponseEntity response = this.restTemplate.postForEntity(HELLOIMG_UPLOAD_URL, (Object)entity, String.class, new Object[0]);
            if (!response.getStatusCode().is2xxSuccessful() || response.getBody() == null) {
                log.error("HelloImg \u4e0a\u4f20\u5931\u8d25: {}", response.getBody());
                return null;
            }
            String responseBody = (String)response.getBody();
            if (responseBody.contains("\"status\":false")) {
                if (responseBody.contains("Unauthenticated")) {
                    log.error("HelloImg Token\u5931\u6548\uff0c\u8bf7\u68c0\u67e5token\u914d\u7f6e");
                } else {
                    log.error("HelloImg \u4e0a\u4f20\u5931\u8d25: {}", (Object)responseBody);
                }
                return null;
            }
            String imageUrl = this.extractImageUrl(responseBody);
            if (imageUrl == null) {
                log.error("\u65e0\u6cd5\u4ece\u54cd\u5e94\u4e2d\u63d0\u53d6\u56fe\u7247URL: {}", (Object)responseBody);
                return null;
            }
            String refuseTime = LocalDateTime.now().plusSeconds(110L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new UploadResult(imageUrl, refuseTime);
        }
        catch (Exception e) {
            log.error("\u4e0a\u4f20\u56fe\u7247\u5230 HelloImg \u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
            return null;
        }
    }

    public boolean sendPushPlusMessage(String title, String content) {
        try {
            String url = PUSHPLUS_SEND_URL + this.properties.getPushplusToken();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HashMap<String, String> body = new HashMap<String, String>();
            body.put("title", title);
            body.put("content", content);
            body.put("template", "html");
            HttpEntity entity = new HttpEntity(body, (MultiValueMap)headers);
            ResponseEntity response = this.restTemplate.postForEntity(url, (Object)entity, String.class, new Object[0]);
            if (response.getStatusCode().is2xxSuccessful()) {
                log.info("PushPlus \u6d88\u606f\u53d1\u9001\u6210\u529f");
                return true;
            }
            log.error("PushPlus \u6d88\u606f\u53d1\u9001\u5931\u8d25: {}", response.getBody());
            return false;
        }
        catch (Exception e) {
            log.error("\u53d1\u9001 PushPlus \u6d88\u606f\u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
            return false;
        }
    }

    private String extractImageUrl(String responseBody) {
        Pattern pattern = Pattern.compile("\"html\":\"<img src='([^']+)'");
        Matcher matcher = pattern.matcher(responseBody);
        if (matcher.find()) {
            return matcher.group(1);
        }
        pattern = Pattern.compile("\"url\":\"([^\"]+)\"");
        matcher = pattern.matcher(responseBody);
        if (matcher.find()) {
            return matcher.group(1).replace("\\/", "/");
        }
        return null;
    }

    public static class UploadResult {
        public final String imageUrl;
        public final String expireTime;

        public UploadResult(String imageUrl, String expireTime) {
            this.imageUrl = imageUrl;
            this.expireTime = expireTime;
        }
    }
}
