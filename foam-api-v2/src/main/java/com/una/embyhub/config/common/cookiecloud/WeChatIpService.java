/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.web.client.RestTemplate
 */
package com.una.embyhub.config.common.cookiecloud;

import com.una.embyhub.config.common.cookiecloud.CookieCloudService;
import com.una.embyhub.config.common.cookiecloud.QrCodePushService;
import com.una.embyhub.config.common.cookiecloud.WeChatBrowserService;
import com.una.embyhub.config.common.cookiecloud.WeChatIpProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class WeChatIpService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WeChatIpService.class);
    private static final Pattern IP_PATTERN = Pattern.compile("\\b(?:[0-9]{1,3}\\.){3}[0-9]{1,3}\\b");
    private static final String WEWORK_COOKIE_DOMAIN = ".work.weixin.qq.com";
    private final WeChatIpProperties properties;
    private final CookieCloudService cookieCloudService;
    private final QrCodePushService qrCodePushService;
    private final RestTemplate restTemplate;
    private String currentIpAddress = "0.0.0.0";
    private boolean ipChanged = true;
    private String lastVerificationCode;

    public WeChatIpService(WeChatIpProperties properties) {
        this.properties = properties;
        this.restTemplate = new RestTemplate();
        this.cookieCloudService = properties.isUseCookieCloud() && properties.getCookieCloud() != null ? new CookieCloudService(properties.getCookieCloud()) : null;
        this.qrCodePushService = new QrCodePushService(properties);
    }

    public boolean checkAndChangeIp() {
        log.info("\u5f00\u59cb\u68c0\u6d4b\u516c\u7f51IP...");
        if (this.checkIp()) {
            return this.changeIp();
        }
        log.info("IP\u672a\u53d8\u5316\uff0c\u65e0\u9700\u4fee\u6539");
        return true;
    }

    public boolean checkIp() {
        String newIp = this.getPublicIp();
        if (newIp == null) {
            log.error("\u83b7\u53d6\u516c\u7f51IP\u5931\u8d25");
            return false;
        }
        log.info("\u5f53\u524d\u516c\u7f51IP: {}", (Object)newIp);
        if (!this.ipChanged) {
            log.info("\u4e0a\u6b21IP\u4fee\u6539\u672a\u6210\u529f\uff0c\u7ee7\u7eed\u5c1d\u8bd5");
            this.currentIpAddress = newIp;
            return true;
        }
        if (!newIp.equals(this.currentIpAddress)) {
            log.info("\u68c0\u6d4b\u5230IP\u53d8\u5316: {} -> {}", (Object)this.currentIpAddress, (Object)newIp);
            this.currentIpAddress = newIp;
            return true;
        }
        return false;
    }

    public boolean forceChangeIp() {
        String newIp = this.getPublicIp();
        if (newIp != null) {
            this.currentIpAddress = newIp;
        }
        return this.changeIp();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean changeIp() {
        log.info("\u5f00\u59cb\u4fee\u6539\u4f01\u4e1a\u5fae\u4fe1\u53ef\u4fe1IP...");
        this.ipChanged = false;
        try (WeChatBrowserService browser = new WeChatBrowserService(this.properties);){
            browser.init();
            List<Map<String, Object>> cookies = this.getCookies();
            if (cookies != null && !cookies.isEmpty()) {
                browser.injectCookies(cookies);
            }
            browser.openLoginPage();
            byte[] qrCode = browser.findQrCode();
            if (qrCode != null) {
                if (!this.properties.hasQrCodePush()) {
                    log.error("Cookie\u5df2\u5931\u6548\uff0c\u4f46\u672a\u914d\u7f6e\u4e8c\u7ef4\u7801\u63a8\u9001\u529f\u80fd");
                    boolean bl = false;
                    return bl;
                }
                log.info("Cookie\u5df2\u5931\u6548\uff0c\u63a8\u9001\u767b\u5f55\u4e8c\u7ef4\u7801...");
                this.qrCodePushService.pushQrCode(qrCode);
                log.info("\u8bf7\u572890\u79d2\u5185\u626b\u7801\u767b\u5f55");
                log.info("\u5982\u6536\u5230\u77ed\u4fe1\u9a8c\u8bc1\u7801\uff0c\u8bf7\u4ee5?\u7ed3\u5c3e\u53d1\u9001\u5230\u4f01\u4e1a\u5fae\u4fe1\u5e94\u7528\uff0c\u5982\uff1a110301?");
                Thread.sleep(90000L);
                if (browser.checkLoginStatus()) {
                    this.saveCookies(browser.extractCookies());
                    boolean bl = browser.modifyTrustedIp(this.currentIpAddress);
                    return bl;
                }
                log.error("\u626b\u7801\u767b\u5f55\u8d85\u65f6\u6216\u5931\u8d25");
                boolean bl = false;
                return bl;
            }
            if (browser.checkLoginStatus()) {
                log.info("Cookie\u767b\u5f55\u6210\u529f");
                boolean bl = this.ipChanged = browser.modifyTrustedIp(this.currentIpAddress);
                return bl;
            }
            log.error("\u767b\u5f55\u5931\u8d25");
            boolean bl = false;
            return bl;
        }
        catch (Exception e) {
            log.error("\u4fee\u6539\u53ef\u4fe1IP\u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
            return false;
        }
    }

    public void refreshCookie() {
        log.info("\u5f00\u59cb\u5237\u65b0Cookie...");
        try (WeChatBrowserService browser = new WeChatBrowserService(this.properties);){
            browser.init();
            List<Map<String, Object>> cookies = this.getCookies();
            if (cookies != null && !cookies.isEmpty()) {
                browser.injectCookies(cookies);
            }
            browser.openLoginPage();
            if (browser.checkLoginStatus()) {
                log.info("Cookie\u5237\u65b0\u6210\u529f\uff0c\u4ecd\u7136\u6709\u6548");
            } else {
                log.warn("Cookie\u5df2\u5931\u6548\uff0c\u4e0b\u6b21IP\u53d8\u52a8\u65f6\u5c06\u63a8\u9001\u4e8c\u7ef4\u7801");
            }
        }
        catch (Exception e) {
            log.error("\u5237\u65b0Cookie\u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
        }
    }

    public void setVerificationCode(String code) {
        if (code != null && code.length() >= 6) {
            this.lastVerificationCode = code.substring(0, 6);
            log.info("\u6536\u5230\u77ed\u4fe1\u9a8c\u8bc1\u7801: {}", (Object)this.lastVerificationCode);
        }
    }

    public void pushQrCodeRemote() {
        log.info("\u8fdc\u7a0b\u63a8\u9001\u767b\u5f55\u4e8c\u7ef4\u7801...");
        try (WeChatBrowserService browser = new WeChatBrowserService(this.properties);){
            browser.init();
            browser.openLoginPage();
            byte[] qrCode = browser.findQrCode();
            if (qrCode != null) {
                this.qrCodePushService.pushQrCode(qrCode);
                Thread.sleep(90000L);
                if (browser.checkLoginStatus()) {
                    this.saveCookies(browser.extractCookies());
                    log.info("\u626b\u7801\u767b\u5f55\u6210\u529f\uff0cCookie\u5df2\u4fdd\u5b58");
                }
            } else {
                log.info("Cookie\u4ecd\u7136\u6709\u6548\uff0c\u65e0\u9700\u626b\u7801");
            }
        }
        catch (Exception e) {
            log.error("\u8fdc\u7a0b\u63a8\u9001\u4e8c\u7ef4\u7801\u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
        }
    }

    public String getPublicIp() {
        for (String url : this.properties.getIpUrls()) {
            try {
                Matcher matcher;
                String response = (String)this.restTemplate.getForObject(url, String.class, new Object[0]);
                if (response == null || !(matcher = IP_PATTERN.matcher(response)).find()) continue;
                String ip = matcher.group();
                log.debug("\u4ece {} \u83b7\u53d6IP\u6210\u529f: {}", (Object)url, (Object)ip);
                return ip;
            }
            catch (Exception e) {
                log.debug("\u4ece {} \u83b7\u53d6IP\u5931\u8d25: {}", (Object)url, (Object)e.getMessage());
            }
        }
        return null;
    }

    private List<Map<String, Object>> getCookies() {
        String cookieHeader;
        if (this.properties.isUseCookieCloud() && this.cookieCloudService != null) {
            try {
                Map data;
                Map<String, Object> cookieData = this.cookieCloudService.getCookie();
                if (cookieData != null && cookieData.containsKey("cookie_data") && (data = (Map)cookieData.get("cookie_data")).containsKey(WEWORK_COOKIE_DOMAIN)) {
                    List cookies = (List)data.get(WEWORK_COOKIE_DOMAIN);
                    log.info("\u4eceCookieCloud\u83b7\u53d6\u5230 {} \u4e2aCookie", (Object)cookies.size());
                    return cookies;
                }
            }
            catch (Exception e) {
                log.warn("\u4eceCookieCloud\u83b7\u53d6Cookie\u5931\u8d25: {}", (Object)e.getMessage());
            }
        }
        if ((cookieHeader = this.properties.getCookieHeader()) != null && !cookieHeader.isEmpty()) {
            return this.parseCookieHeader(cookieHeader);
        }
        return null;
    }

    private void saveCookies(List<Map<String, Object>> cookies) {
        if (!this.properties.isUseCookieCloud() || this.cookieCloudService == null) {
            return;
        }
        try {
            HashMap<String, List> grouped = new HashMap<String, List>();
            for (Map<String, Object> cookie : cookies) {
                String domain = (String)cookie.get("domain");
                grouped.computeIfAbsent(domain, k -> new ArrayList()).add(cookie);
            }
            HashMap<String, Object> cookieData = new HashMap<String, Object>();
            cookieData.put("cookie_data", grouped);
            if (this.cookieCloudService.updateCookie(cookieData)) {
                log.info("Cookie\u5df2\u4fdd\u5b58\u5230CookieCloud");
            }
        }
        catch (Exception e) {
            log.error("\u4fdd\u5b58Cookie\u5230CookieCloud\u5931\u8d25: {}", (Object)e.getMessage());
        }
    }

    private List<Map<String, Object>> parseCookieHeader(String cookieHeader) {
        ArrayList<Map<String, Object>> cookies = new ArrayList<Map<String, Object>>();
        for (String part : cookieHeader.split(";")) {
            String[] kv = part.trim().split("=", 2);
            if (kv.length != 2) continue;
            HashMap<String, String> cookie = new HashMap<String, String>();
            cookie.put("name", kv[0].trim());
            cookie.put("value", kv[1].trim());
            cookie.put("domain", WEWORK_COOKIE_DOMAIN);
            cookie.put("path", "/");
            cookies.add(cookie);
        }
        return cookies;
    }

    public String getCurrentIpAddress() {
        return this.currentIpAddress;
    }

    public boolean isIpChanged() {
        return this.ipChanged;
    }
}
