/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.http.HttpEntity
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.util.MultiValueMap
 *  org.springframework.web.client.RestTemplate
 */
package com.una.embyhub.config.common.cookiecloud;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.cookiecloud.CookieCloudProperties;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class CookieCloudService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(CookieCloudService.class);
    private static final int BLOCK_SIZE = 16;
    private static final String SALTED_PREFIX = "Salted__";
    private static final String AES_ALGORITHM = "AES/CBC/NoPadding";
    private final CookieCloudProperties properties;
    private final RestTemplate restTemplate;

    public CookieCloudService(CookieCloudProperties properties) {
        this.properties = properties;
        this.restTemplate = new RestTemplate();
    }

    public CookieCloudService(CookieCloudProperties properties, RestTemplate restTemplate) {
        this.properties = properties;
        this.restTemplate = restTemplate;
    }

    public boolean checkConnection() {
        try {
            ResponseEntity response = this.restTemplate.getForEntity(this.properties.getUrl(), String.class, new Object[0]);
            return response.getStatusCode().is2xxSuccessful();
        }
        catch (Exception e) {
            log.warn("CookieCloud \u8fde\u63a5\u68c0\u67e5\u5931\u8d25: {}", (Object)e.getMessage());
            return false;
        }
    }

    public boolean updateCookie(Map<String, Object> cookieData) {
        try {
            JSONObject jsonResponse;
            String action;
            Map<String, Object> dataToEncrypt;
            if (!cookieData.containsKey("cookie_data")) {
                dataToEncrypt = new HashMap<String, Object>();
                dataToEncrypt.put("cookie_data", cookieData);
            } else {
                dataToEncrypt = cookieData;
            }
            String rawData = JSON.toJSONString(dataToEncrypt);
            String encryptedData = this.encrypt(rawData, this.getTheKey());
            String updateUrl = this.properties.getUrl() + "/update";
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HashMap<String, String> requestBody = new HashMap<String, String>();
            requestBody.put("uuid", this.properties.getUuid());
            requestBody.put("encrypted", encryptedData);
            HttpEntity entity = new HttpEntity(requestBody, (MultiValueMap)headers);
            ResponseEntity response = this.restTemplate.postForEntity(updateUrl, (Object)entity, String.class, new Object[0]);
            if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null && "done".equals(action = (jsonResponse = JSON.parseObject((String)((String)response.getBody()))).getString("action"))) {
                log.info("CookieCloud Cookie \u4e0a\u4f20\u6210\u529f");
                return true;
            }
            log.warn("CookieCloud Cookie \u4e0a\u4f20\u5931\u8d25: {}", response.getBody());
            return false;
        }
        catch (Exception e) {
            log.error("CookieCloud Cookie \u4e0a\u4f20\u5f02\u5e38: {}", (Object)e.getMessage(), (Object)e);
            return false;
        }
    }

    public Map<String, Object> getCookie() {
        try {
            JSONObject jsonResponse;
            String encrypted;
            String getUrl = this.properties.getUrl() + "/get/" + this.properties.getUuid();
            ResponseEntity response = this.restTemplate.getForEntity(getUrl, String.class, new Object[0]);
            if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null && (encrypted = (jsonResponse = JSON.parseObject((String)((String)response.getBody()))).getString("encrypted")) != null && !encrypted.isEmpty()) {
                String decrypted = this.decrypt(encrypted, this.getTheKey());
                JSONObject cookieJson = JSON.parseObject((String)decrypted);
                return (Map)JSON.toJavaObject((Object)cookieJson, Map.class);
            }
            log.warn("CookieCloud Cookie \u83b7\u53d6\u5931\u8d25: {}", response.getBody());
            return null;
        }
        catch (Exception e) {
            log.error("CookieCloud Cookie \u83b7\u53d6\u5f02\u5e38: {}", (Object)e.getMessage(), (Object)e);
            return null;
        }
    }

    public String getTheKey() {
        return CookieCloudService.getTheKey(this.properties.getUuid(), this.properties.getPassword());
    }

    public static String getTheKey(String uuid, String password) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest((uuid + "-" + password).getBytes(StandardCharsets.UTF_8));
            return CookieCloudService.bytesToHex(digest).substring(0, 16);
        }
        catch (Exception e) {
            throw new RuntimeException("\u751f\u6210\u5bc6\u94a5\u5931\u8d25", e);
        }
    }

    public String encrypt(String message, String passphrase) {
        try {
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[8];
            random.nextBytes(salt);
            byte[] keyIv = this.bytesToKey(passphrase.getBytes(StandardCharsets.UTF_8), salt, 48);
            byte[] key = Arrays.copyOfRange(keyIv, 0, 32);
            byte[] iv = Arrays.copyOfRange(keyIv, 32, 48);
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(1, (Key)secretKey, ivSpec);
            byte[] paddedMessage = this.applyPadding(message.getBytes(StandardCharsets.UTF_8));
            byte[] encrypted = cipher.doFinal(paddedMessage);
            byte[] result = new byte[16 + encrypted.length];
            System.arraycopy(SALTED_PREFIX.getBytes(StandardCharsets.US_ASCII), 0, result, 0, 8);
            System.arraycopy(salt, 0, result, 8, 8);
            System.arraycopy(encrypted, 0, result, 16, encrypted.length);
            return Base64.getEncoder().encodeToString(result);
        }
        catch (Exception e) {
            throw new RuntimeException("\u52a0\u5bc6\u5931\u8d25", e);
        }
    }

    public String decrypt(String encrypted, String passphrase) {
        try {
            byte[] data = Base64.getDecoder().decode(encrypted);
            String prefix = new String(data, 0, 8, StandardCharsets.US_ASCII);
            if (!SALTED_PREFIX.equals(prefix)) {
                throw new IllegalArgumentException("\u65e0\u6548\u7684\u52a0\u5bc6\u6570\u636e\u683c\u5f0f\uff1a\u7f3a\u5c11 Salted__ \u524d\u7f00");
            }
            byte[] salt = Arrays.copyOfRange(data, 8, 16);
            byte[] ciphertext = Arrays.copyOfRange(data, 16, data.length);
            byte[] keyIv = this.bytesToKey(passphrase.getBytes(StandardCharsets.UTF_8), salt, 48);
            byte[] key = Arrays.copyOfRange(keyIv, 0, 32);
            byte[] iv = Arrays.copyOfRange(keyIv, 32, 48);
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(2, (Key)secretKey, ivSpec);
            byte[] decrypted = cipher.doFinal(ciphertext);
            byte[] unpadded = this.removePadding(decrypted);
            return new String(unpadded, StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            throw new RuntimeException("\u89e3\u5bc6\u5931\u8d25", e);
        }
    }

    private byte[] bytesToKey(byte[] data, byte[] salt, int output) {
        try {
            if (salt.length != 8) {
                throw new IllegalArgumentException("Salt \u5fc5\u987b\u662f 8 \u5b57\u8282");
            }
            byte[] dataAndSalt = new byte[data.length + salt.length];
            System.arraycopy(data, 0, dataAndSalt, 0, data.length);
            System.arraycopy(salt, 0, dataAndSalt, data.length, salt.length);
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] key = md5.digest(dataAndSalt);
            byte[] finalKey = Arrays.copyOf(key, key.length);
            while (finalKey.length < output) {
                byte[] combined = new byte[key.length + dataAndSalt.length];
                System.arraycopy(key, 0, combined, 0, key.length);
                System.arraycopy(dataAndSalt, 0, combined, key.length, dataAndSalt.length);
                key = md5.digest(combined);
                byte[] newFinalKey = new byte[finalKey.length + key.length];
                System.arraycopy(finalKey, 0, newFinalKey, 0, finalKey.length);
                System.arraycopy(key, 0, newFinalKey, finalKey.length, key.length);
                finalKey = newFinalKey;
            }
            return Arrays.copyOf(finalKey, output);
        }
        catch (Exception e) {
            throw new RuntimeException("\u5bc6\u94a5\u6d3e\u751f\u5931\u8d25", e);
        }
    }

    private byte[] applyPadding(byte[] data) {
        int padding = 16 - data.length % 16;
        byte[] padded = new byte[data.length + padding];
        System.arraycopy(data, 0, padded, 0, data.length);
        Arrays.fill(padded, data.length, padded.length, (byte)padding);
        return padded;
    }

    private byte[] removePadding(byte[] data) {
        int padding = data[data.length - 1] & 0xFF;
        if (padding < 1 || padding > 16) {
            throw new IllegalArgumentException("\u65e0\u6548\u7684 PKCS7 \u586b\u5145");
        }
        return Arrays.copyOf(data, data.length - padding);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
