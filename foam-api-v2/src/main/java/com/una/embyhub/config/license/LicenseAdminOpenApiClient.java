/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.http.HttpRequest
 *  cn.hutool.http.HttpResponse
 *  cn.hutool.json.JSONObject
 *  cn.hutool.json.JSONUtil
 *  lombok.Generated
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.license;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.license.LicenseAdminProperties;
import com.una.embyhub.model.dto.response.license.LicenseAdminVerifyResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.HexFormat;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class LicenseAdminOpenApiClient {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final String PUBLIC_SERVICE_NAME = "\u6388\u6743\u670d\u52a1";
    private final LicenseAdminProperties properties;

    public LicenseAdminVerifyResponse verifyLicense(Map<String, Object> body) {
        return this.post(this.properties.getVerifyPath(), body, LicenseAdminVerifyResponse.class);
    }

    public void unbindLicense(Map<String, Object> body) {
        this.post(this.properties.getUnbindPath(), body, Object.class);
    }

    public void registerUser(Map<String, Object> body) {
        this.post(this.properties.getRegisterPath(), body, Object.class);
    }

    public void activateUser(Map<String, Object> body) {
        this.post(this.properties.getActivatePath(), body, Object.class);
    }

    private <T> T post(String path, Map<String, Object> body, Class<T> dataType) {
        String bodyJson = JSONUtil.toJsonStr(body);
        String timestamp = String.valueOf(Instant.now().getEpochSecond());
        String nonce = this.randomNonce();
        String signature = this.sign("POST", path, timestamp, nonce, bodyJson);
        String url = this.normalizeBaseUrl(this.properties.getBaseUrl()) + path;
        try (HttpResponse response = ((HttpRequest)((HttpRequest)((HttpRequest)((HttpRequest)((HttpRequest)HttpRequest.post((String)url).timeout(this.properties.getTimeoutMs()).header("Content-Type", "application/json;charset=UTF-8")).header("X-Client-Id", this.requireText(this.properties.getClientId(), "\u6388\u6743\u670d\u52a1\u5ba2\u6237\u7aef ID \u672a\u914d\u7f6e"))).header("X-Timestamp", timestamp)).header("X-Nonce", nonce)).header("X-Signature", signature)).body(bodyJson).execute();){
            String responseBody = response.body();
            if (!StringUtils.hasText((String)responseBody) || !JSONUtil.isTypeJSON((String)responseBody)) {
                throw new BizException(ResponseStatusEnum.LICENSE_ERROR.getCode(), "\u6388\u6743\u670d\u52a1\u54cd\u5e94\u5f02\u5e38");
            }
            JSONObject json = JSONUtil.parseObj((String)responseBody);
            boolean success = Boolean.TRUE.equals(json.getBool((Object)"success"));
            if (!response.isOk() || !success) {
                String message = json.getStr((Object)"message", "\u6388\u6743\u670d\u52a1\u8c03\u7528\u5931\u8d25");
                throw new BizException(ResponseStatusEnum.LICENSE_ERROR.getCode(), this.publicMessage(message));
            }
            Object data = json.get((Object)"data");
            if (dataType == Object.class || data == null) {
                T t = null;
                return t;
            }
            Object object = JSONUtil.toBean((JSONObject)JSONUtil.parseObj((Object)data), dataType);
            return (T)object;
        }
    }

    private String sign(String method, String path, String timestamp, String nonce, String bodyJson) {
        String bodyHash = this.sha256Hex(bodyJson);
        String signText = method.toUpperCase() + "\n" + path + "\n" + timestamp + "\n" + nonce + "\n" + bodyHash;
        return this.hmacSha256Hex(this.requireText(this.properties.getClientSecret(), "\u6388\u6743\u670d\u52a1\u5ba2\u6237\u7aef\u5bc6\u94a5\u672a\u914d\u7f6e"), signText);
    }

    private String sha256Hex(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return HexFormat.of().formatHex(digest.digest(value.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception e) {
            throw new BizException(ResponseStatusEnum.LICENSE_ERROR.getCode(), "\u6388\u6743\u8bf7\u6c42\u7b7e\u540d\u5931\u8d25");
        }
    }

    private String hmacSha256Hex(String secret, String value) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return HexFormat.of().formatHex(mac.doFinal(value.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception e) {
            throw new BizException(ResponseStatusEnum.LICENSE_ERROR.getCode(), "\u6388\u6743\u8bf7\u6c42\u7b7e\u540d\u5931\u8d25");
        }
    }

    private String randomNonce() {
        byte[] bytes = new byte[16];
        RANDOM.nextBytes(bytes);
        return HexFormat.of().formatHex(bytes);
    }

    private String normalizeBaseUrl(String baseUrl) {
        String normalized = this.requireText(baseUrl, "\u6388\u6743\u670d\u52a1\u5730\u5740\u672a\u914d\u7f6e").trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private String requireText(String value, String message) {
        if (!StringUtils.hasText((String)value)) {
            throw new BizException(ResponseStatusEnum.LICENSE_ERROR.getCode(), message);
        }
        return value.trim();
    }

    private String publicMessage(String message) {
        if (!StringUtils.hasText((String)message)) {
            return "\u6388\u6743\u670d\u52a1\u8c03\u7528\u5931\u8d25";
        }
        return message.replace("license-admin", PUBLIC_SERVICE_NAME);
    }

    @Generated
    public LicenseAdminOpenApiClient(LicenseAdminProperties properties) {
        this.properties = properties;
    }
}
