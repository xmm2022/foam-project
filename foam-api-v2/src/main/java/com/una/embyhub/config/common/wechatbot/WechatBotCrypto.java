/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  jakarta.annotation.PostConstruct
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.wechatbot;

import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.config.common.wechatbot.WechatBotProperties;
import jakarta.annotation.PostConstruct;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

@Component
public class WechatBotCrypto {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatBotCrypto.class);
    private final NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;
    private final SecureRandom secureRandom = new SecureRandom();
    private byte[] aesKey;
    private boolean enabled;

    public WechatBotCrypto(NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils) {
        this.notifyChannelCacheLoaderUtils = notifyChannelCacheLoaderUtils;
    }

    @PostConstruct
    public void init() {
        WechatBotProperties properties = this.getProperties();
        if (properties == null) {
            log.warn("init: \u4f01\u4e1a\u5fae\u4fe1\u914d\u7f6e\u672a\u627e\u5230\uff0c\u7981\u7528\u52a0\u89e3\u5bc6\u652f\u6301");
            this.enabled = false;
            return;
        }
        boolean bl = this.enabled = StringUtils.hasText((String)properties.getToken()) && StringUtils.hasText((String)properties.getEncodingAesKey()) && StringUtils.hasText((String)properties.getCorpId());
        if (this.enabled) {
            try {
                this.aesKey = Base64.getDecoder().decode(properties.getEncodingAesKey() + "=");
            }
            catch (IllegalArgumentException e) {
                log.warn("\u4f01\u4e1a\u5fae\u4fe1 EncodingAESKey \u975e\u6cd5\uff0c\u7981\u7528\u52a0\u89e3\u5bc6\u652f\u6301", (Throwable)e);
                this.enabled = false;
            }
        }
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean hasSignatureParams(String msgSignature, String timestamp, String nonce) {
        return StringUtils.hasText((String)msgSignature) && StringUtils.hasText((String)timestamp) && StringUtils.hasText((String)nonce);
    }

    public Optional<String> decryptEcho(String echoStr, String msgSignature, String timestamp, String nonce) {
        log.info("decryptEcho: \u5f00\u59cb\u89e3\u5bc6 echoStr...");
        if (!this.enabled) {
            log.warn("decryptEcho: \u52a0\u5bc6\u6a21\u5f0f\u672a\u542f\u7528\uff0c\u76f4\u63a5\u8fd4\u56de\u539f\u59cb echoStr");
            return Optional.ofNullable(echoStr);
        }
        WechatBotProperties properties = this.getProperties();
        if (properties == null) {
            log.warn("decryptEcho: \u65e0\u6cd5\u83b7\u53d6\u914d\u7f6e");
            return Optional.empty();
        }
        log.info("decryptEcho: \u9a8c\u8bc1\u7b7e\u540d\u4e2d... token={}, timestamp={}, nonce={}", new Object[]{properties.getToken(), timestamp, nonce});
        if (!this.verifySignature(msgSignature, timestamp, nonce, echoStr, properties)) {
            log.warn("decryptEcho: \u4f01\u4e1a\u5fae\u4fe1 echoStr \u9a8c\u7b7e\u5931\u8d25! \u671f\u671b\u7b7e\u540d={}, \u6536\u5230\u7b7e\u540d={}", (Object)this.sign(timestamp, nonce, echoStr, properties), (Object)msgSignature);
            return Optional.empty();
        }
        log.info("decryptEcho: \u7b7e\u540d\u9a8c\u8bc1\u901a\u8fc7\uff0c\u5f00\u59cb\u89e3\u5bc6...");
        Optional<String> result = this.decrypt(echoStr, properties);
        log.info("decryptEcho: \u89e3\u5bc6\u7ed3\u679c={}", (Object)(result.isPresent() ? "\u6210\u529f" : "\u5931\u8d25"));
        return result;
    }

    public Optional<String> decryptMessage(String rawXml, String msgSignature, String timestamp, String nonce) {
        if (!this.enabled) {
            return Optional.of(rawXml);
        }
        String cipherText = this.extractEncrypt(rawXml);
        if (!StringUtils.hasText((String)cipherText)) {
            log.warn("\u672a\u53d1\u73b0\u4f01\u4e1a\u5fae\u4fe1 Encrypt \u5b57\u6bb5\uff0c\u6309\u660e\u6587\u5904\u7406");
            return Optional.of(rawXml);
        }
        WechatBotProperties properties = this.getProperties();
        if (properties == null) {
            log.warn("decryptMessage: \u65e0\u6cd5\u83b7\u53d6\u914d\u7f6e");
            return Optional.empty();
        }
        if (!this.verifySignature(msgSignature, timestamp, nonce, cipherText, properties)) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u6d88\u606f\u9a8c\u7b7e\u5931\u8d25");
            return Optional.empty();
        }
        return this.decrypt(cipherText, properties);
    }

    public String encryptResponse(String plainXml, String timestamp, String nonce) {
        if (!this.enabled) {
            return plainXml;
        }
        WechatBotProperties properties = this.getProperties();
        if (properties == null) {
            log.warn("encryptResponse: \u65e0\u6cd5\u83b7\u53d6\u914d\u7f6e\uff0c\u8fd4\u56de\u539f\u6587");
            return plainXml;
        }
        String realTimestamp = StringUtils.hasText((String)timestamp) ? timestamp : String.valueOf(System.currentTimeMillis() / 1000L);
        String realNonce = StringUtils.hasText((String)nonce) ? nonce : this.randomNonce();
        String cipher = this.encrypt(plainXml, properties);
        if (cipher == null) {
            return plainXml;
        }
        String signature = this.sign(realTimestamp, realNonce, cipher, properties);
        return "<xml>" + WechatBotCrypto.wrap("Encrypt", WechatBotCrypto.cdata(cipher)) + WechatBotCrypto.wrap("MsgSignature", WechatBotCrypto.cdata(signature)) + WechatBotCrypto.wrap("TimeStamp", realTimestamp) + WechatBotCrypto.wrap("Nonce", WechatBotCrypto.cdata(realNonce)) + "</xml>";
    }

    public boolean containsEncryptTag(String xml) {
        return xml != null && xml.contains("<Encrypt>");
    }

    private Optional<String> decrypt(String cipherText, WechatBotProperties properties) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keySpec = new SecretKeySpec(this.aesKey, "AES");
            IvParameterSpec iv = new IvParameterSpec(Arrays.copyOfRange(this.aesKey, 0, 16));
            cipher.init(2, (Key)keySpec, iv);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            byte[] bytes = this.removePadding(decrypted);
            byte[] networkOrder = Arrays.copyOfRange(bytes, 16, 20);
            int xmlLength = ByteBuffer.wrap(networkOrder).order(ByteOrder.BIG_ENDIAN).getInt();
            String xml = new String(Arrays.copyOfRange(bytes, 20, 20 + xmlLength), StandardCharsets.UTF_8);
            String corpId = new String(Arrays.copyOfRange(bytes, 20 + xmlLength, bytes.length), StandardCharsets.UTF_8);
            if (!properties.getCorpId().equals(corpId)) {
                log.warn("\u4f01\u4e1a\u5fae\u4fe1 corpId \u6821\u9a8c\u5931\u8d25");
                return Optional.empty();
            }
            return Optional.of(xml);
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u6d88\u606f\u89e3\u5bc6\u5931\u8d25", (Throwable)e);
            return Optional.empty();
        }
    }

    private String encrypt(String plainText, WechatBotProperties properties) {
        try {
            byte[] random16 = new byte[16];
            this.secureRandom.nextBytes(random16);
            byte[] plainBytes = plainText.getBytes(StandardCharsets.UTF_8);
            byte[] lengthBytes = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(plainBytes.length).array();
            byte[] corpIdBytes = properties.getCorpId().getBytes(StandardCharsets.UTF_8);
            byte[] unPadded = ByteBuffer.allocate(random16.length + lengthBytes.length + plainBytes.length + corpIdBytes.length).put(random16).put(lengthBytes).put(plainBytes).put(corpIdBytes).array();
            byte[] padded = this.applyPadding(unPadded);
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keySpec = new SecretKeySpec(this.aesKey, "AES");
            IvParameterSpec iv = new IvParameterSpec(Arrays.copyOfRange(this.aesKey, 0, 16));
            cipher.init(1, (Key)keySpec, iv);
            return Base64.getEncoder().encodeToString(cipher.doFinal(padded));
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u6d88\u606f\u52a0\u5bc6\u5931\u8d25", (Throwable)e);
            return null;
        }
    }

    private boolean verifySignature(String msgSignature, String timestamp, String nonce, String cipherText, WechatBotProperties properties) {
        if (!this.hasSignatureParams(msgSignature, timestamp, nonce)) {
            return false;
        }
        String calculated = this.sign(timestamp, nonce, cipherText, properties);
        return msgSignature.equals(calculated);
    }

    private String sign(String timestamp, String nonce, String cipherText, WechatBotProperties properties) {
        try {
            Object[] arr = new String[]{properties.getToken(), timestamp, nonce, cipherText};
            Arrays.sort(arr);
            String joined = String.join((CharSequence)"", (CharSequence[])arr);
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] digest = md.digest(joined.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
        catch (Exception e) {
            throw new IllegalStateException("\u8ba1\u7b97\u4f01\u4e1a\u5fae\u4fe1\u7b7e\u540d\u5931\u8d25", e);
        }
    }

    private String randomNonce() {
        byte[] nonce = new byte[8];
        this.secureRandom.nextBytes(nonce);
        StringBuilder sb = new StringBuilder();
        for (byte b : nonce) {
            sb.append(Integer.toHexString(b & 0xFF));
        }
        return sb.toString();
    }

    private String extractEncrypt(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));
            Node node = document.getElementsByTagName("Encrypt").item(0);
            return node == null ? null : node.getTextContent();
        }
        catch (Exception e) {
            log.error("\u89e3\u6790\u4f01\u4e1a\u5fae\u4fe1 Encrypt \u5931\u8d25", (Throwable)e);
            return null;
        }
    }

    private byte[] applyPadding(byte[] input) {
        int blockSize = 32;
        int padLength = blockSize - input.length % blockSize;
        if (padLength == 0) {
            padLength = blockSize;
        }
        byte pad = (byte)padLength;
        byte[] padding = new byte[padLength];
        Arrays.fill(padding, pad);
        byte[] output = Arrays.copyOf(input, input.length + padLength);
        System.arraycopy(padding, 0, output, input.length, padLength);
        return output;
    }

    private byte[] removePadding(byte[] decrypted) {
        byte pad = decrypted[decrypted.length - 1];
        if (pad < 1 || pad > 32) {
            pad = 0;
        }
        return Arrays.copyOfRange(decrypted, 0, decrypted.length - pad);
    }

    private static String wrap(String tag, String value) {
        return "<" + tag + ">" + value + "</" + tag + ">";
    }

    private static String cdata(String value) {
        return "<![CDATA[" + (value == null ? "" : value) + "]]>";
    }

    private WechatBotProperties getProperties() {
        String json = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("wechatBot");
        if (!StringUtils.hasText((String)json)) {
            return null;
        }
        return (WechatBotProperties)JSONObject.parseObject((String)json, WechatBotProperties.class);
    }
}
