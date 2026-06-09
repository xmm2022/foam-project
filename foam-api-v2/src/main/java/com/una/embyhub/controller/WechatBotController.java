/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.util.StringUtils
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.config.common.wechatbot.WechatBotCrypto;
import com.una.embyhub.config.common.wechatbot.WechatBotMenuService;
import com.una.embyhub.config.common.wechatbot.WechatBotService;
import com.una.embyhub.config.common.wechatbot.WechatMessageParser;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.wechat.WechatBotMessage;
import java.util.List;
import java.util.Optional;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/wechat/bot"})
public class WechatBotController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatBotController.class);
    private final WechatBotService wechatBotService;
    private final WechatBotCrypto wechatBotCrypto;
    private final WechatBotMenuService wechatBotMenuService;

    public WechatBotController(WechatBotService wechatBotService, WechatBotCrypto wechatBotCrypto, WechatBotMenuService wechatBotMenuService) {
        this.wechatBotService = wechatBotService;
        this.wechatBotCrypto = wechatBotCrypto;
        this.wechatBotMenuService = wechatBotMenuService;
    }

    @GetMapping
    public String echo(@RequestParam(value="echostr", required=false) String echo, @RequestParam(value="msg_signature", required=false) String msgSignature, @RequestParam(value="timestamp", required=false) String timestamp, @RequestParam(value="nonce", required=false) String nonce) {
        log.info("===== \u4f01\u4e1a\u5fae\u4fe1\u56de\u8c03\u9a8c\u8bc1\u5f00\u59cb =====");
        log.info("\u6536\u5230\u53c2\u6570: echostr={}, msg_signature={}, timestamp={}, nonce={}", new Object[]{echo, msgSignature, timestamp, nonce});
        log.info("\u52a0\u5bc6\u6a21\u5f0f\u72b6\u6001: isEnabled={}", (Object)this.wechatBotCrypto.isEnabled());
        log.info("\u7b7e\u540d\u53c2\u6570\u68c0\u67e5: hasSignatureParams={}", (Object)this.wechatBotCrypto.hasSignatureParams(msgSignature, timestamp, nonce));
        if (this.wechatBotCrypto.isEnabled() && StringUtils.hasText((String)echo) && this.wechatBotCrypto.hasSignatureParams(msgSignature, timestamp, nonce)) {
            log.info("\u8fdb\u5165\u52a0\u5bc6\u6a21\u5f0f\u89e3\u5bc6\u6d41\u7a0b...");
            String result = this.wechatBotCrypto.decryptEcho(echo, msgSignature, timestamp, nonce).orElse("");
            log.info("\u89e3\u5bc6\u7ed3\u679c: {}", StringUtils.hasText((String)result) ? "\u6210\u529f\uff0c\u957f\u5ea6=" + result.length() : "\u5931\u8d25\uff0c\u8fd4\u56de\u7a7a");
            log.info("===== \u4f01\u4e1a\u5fae\u4fe1\u56de\u8c03\u9a8c\u8bc1\u7ed3\u675f =====");
            return result;
        }
        String result = echo == null ? "ok" : echo;
        log.info("\u660e\u6587\u6a21\u5f0f\u8fd4\u56de: {}", (Object)result);
        log.info("===== \u4f01\u4e1a\u5fae\u4fe1\u56de\u8c03\u9a8c\u8bc1\u7ed3\u675f =====");
        return result;
    }

    @PostMapping(consumes={"text/xml", "application/xml"}, produces={"text/xml"})
    @SkipLicense
    public String onMessage(@RequestBody String rawXml, @RequestParam(value="msg_signature", required=false) String msgSignature, @RequestParam(value="timestamp", required=false) String timestamp, @RequestParam(value="nonce", required=false) String nonce) {
        List<WechatMessageParser.NewsArticle> articles;
        String query;
        List<WechatMessageParser.NewsArticle> articles2;
        boolean encrypted = this.wechatBotCrypto.isEnabled() && this.wechatBotCrypto.hasSignatureParams(msgSignature, timestamp, nonce) && this.wechatBotCrypto.containsEncryptTag(rawXml);
        String plainXml = rawXml;
        if (encrypted && !StringUtils.hasText((String)(plainXml = this.wechatBotCrypto.decryptMessage(rawXml, msgSignature, timestamp, nonce).orElse("")))) {
            return "";