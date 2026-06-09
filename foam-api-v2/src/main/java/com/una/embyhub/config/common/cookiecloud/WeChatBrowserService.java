/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.openqa.selenium.By
 *  org.openqa.selenium.Capabilities
 *  org.openqa.selenium.Cookie$Builder
 *  org.openqa.selenium.JavascriptExecutor
 *  org.openqa.selenium.Keys
 *  org.openqa.selenium.NoSuchElementException
 *  org.openqa.selenium.TimeoutException
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.WebElement
 *  org.openqa.selenium.chrome.ChromeDriver
 *  org.openqa.selenium.chrome.ChromeOptions
 *  org.openqa.selenium.remote.RemoteWebDriver
 *  org.openqa.selenium.support.ui.ExpectedConditions
 *  org.openqa.selenium.support.ui.WebDriverWait
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.una.embyhub.config.common.cookiecloud;

import com.una.embyhub.config.common.cookiecloud.WeChatIpProperties;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.Generated;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeChatBrowserService
implements AutoCloseable {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WeChatBrowserService.class);
    private static final String WEWORK_BASE_URL = "https://work.weixin.qq.com";
    private static final String APP_MANAGEMENT_BASE = "https://work.weixin.qq.com/wework_admin/frame#apps/modApiApp/";
    private final WeChatIpProperties properties;
    private WebDriver driver;
    private boolean initialized = false;

    public WeChatBrowserService(WeChatIpProperties properties) {
        this.properties = properties;
    }

    public void init() {
        String seleniumRemoteUrl;
        if (this.initialized) {
            return;
        }
        log.info("\u521d\u59cb\u5316 Chrome WebDriver...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--lang=zh-CN"});
        options.addArguments(new String[]{"--disable-gpu"});
        options.addArguments(new String[]{"--no-sandbox"});
        options.addArguments(new String[]{"--disable-dev-shm-usage"});
        options.addArguments(new String[]{"--disable-extensions"});
        options.addArguments(new String[]{"--window-size=1920,1080"});
        if (this.properties.isHeadless()) {
            options.addArguments(new String[]{"--headless=new"});
        }
        if ((seleniumRemoteUrl = System.getenv("SELENIUM_REMOTE_URL")) != null && !seleniumRemoteUrl.isEmpty()) {
            try {
                log.info("\u4f7f\u7528\u8fdc\u7a0b Selenium Grid: {}", (Object)seleniumRemoteUrl);
                this.driver = new RemoteWebDriver(new URI(seleniumRemoteUrl).toURL(), (Capabilities)options);
            }
            catch (Exception e) {
                log.error("\u8fde\u63a5\u8fdc\u7a0b Selenium Grid \u5931\u8d25: {}", (Object)e.getMessage());
                throw new RuntimeException("\u65e0\u6cd5\u8fde\u63a5 Selenium Grid: " + seleniumRemoteUrl, e);
            }
        } else {
            log.info("\u4f7f\u7528\u672c\u5730 ChromeDriver");
            this.driver = new ChromeDriver(options);
        }
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        this.initialized = true;
        log.info("Chrome WebDriver \u521d\u59cb\u5316\u5b8c\u6210");
    }

    public void openLoginPage() {
        this.ensureInitialized();
        log.info("\u6253\u5f00\u4f01\u4e1a\u5fae\u4fe1\u767b\u5f55\u9875: {}", (Object)this.properties.getWechatUrl());
        this.driver.get(this.properties.getWechatUrl());
        this.sleep(3000L);
    }

    public byte[] findQrCode() {
        this.ensureInitialized();
        try {
            WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5L));
            WebElement iframe = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)By.tagName((String)"iframe")));
            this.driver.switchTo().frame(iframe);
            WebElement qrCodeImg = this.driver.findElement(By.cssSelector((String)"img.qrcode_login_img"));
            if (qrCodeImg != null) {
                Object qrCodeUrl = qrCodeImg.getAttribute("src");
                if (qrCodeUrl != null && ((String)qrCodeUrl).startsWith("/")) {
                    qrCodeUrl = WEWORK_BASE_URL + (String)qrCodeUrl;
                }
                byte[] qrCodeBytes = this.downloadImage((String)qrCodeUrl);
                this.driver.switchTo().defaultContent();
                return qrCodeBytes;
            }
            this.driver.switchTo().defaultContent();
            log.warn("\u672a\u627e\u5230\u4e8c\u7ef4\u7801\u56fe\u7247");
            return null;
        }
        catch (Exception e) {
            this.driver.switchTo().defaultContent();
            log.debug("\u67e5\u627e\u4e8c\u7ef4\u7801\u5931\u8d25: {}", (Object)e.getMessage());
            return null;
        }
    }

    public boolean checkLoginStatus() {
        this.ensureInitialized();
        try {
            this.driver.navigate().refresh();
            this.sleep(2000L);
            String currentUrl = this.driver.getCurrentUrl();
            log.debug("\u5f53\u524dURL: {}", (Object)currentUrl);
            if (currentUrl.contains("wework_admin/frame") || currentUrl.contains("wework_admin/index") || currentUrl.contains("#apps")) {
                log.info("\u767b\u5f55\u6210\u529f\uff01URL\u5df2\u8df3\u8f6c\u5230\u7ba1\u7406\u540e\u53f0");
                return true;
            }
            try {
                WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(3L));
                WebElement element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)By.id((String)"check_corp_info")));
                if (element != null) {
                    log.info("\u767b\u5f55\u6210\u529f\uff01\u68c0\u6d4b\u5230\u4f01\u4e1a\u4fe1\u606f\u5143\u7d20");
                    return true;
                }
            }
            catch (TimeoutException timeoutException) {
                // empty catch block
            }
            if (currentUrl.contains("loginpage_wx") || currentUrl.contains("login")) {
                log.debug("\u4ecd\u5728\u767b\u5f55\u9875\uff0c\u7b49\u5f85\u626b\u7801");
                return false;
            }
            return false;
        }
        catch (Exception e) {
            log.error("\u68c0\u67e5\u767b\u5f55\u72b6\u6001\u5f02\u5e38: {}", (Object)e.getMessage());
            return false;
        }
    }

    public boolean needsVerification() {
        this.ensureInitialized();
        try {
            WebElement captchaPanel = this.driver.findElement(By.cssSelector((String)".receive_captcha_panel"));
            if (captchaPanel != null && captchaPanel.isDisplayed()) {
                log.info("\u9700\u8981\u77ed\u4fe1\u9a8c\u8bc1");
                return true;
            }
        }
        catch (NoSuchElementException noSuchElementException) {
            // empty catch block
        }
        return false;
    }

    public boolean inputVerificationCode(String verificationCode) {
        this.ensureInitialized();
        if (verificationCode == null || verificationCode.length() != 6) {
            log.error("\u9a8c\u8bc1\u7801\u683c\u5f0f\u9519\u8bef\uff0c\u9700\u89816\u4f4d\u6570\u5b57\uff0c\u5b9e\u9645: {}", (Object)verificationCode);
            return false;
        }
        try {
            log.info("\u5f00\u59cb\u8f93\u5165\u9a8c\u8bc1\u7801: {}", (Object)verificationCode);
            WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
            JavascriptExecutor js = (JavascriptExecutor)this.driver;
            String[] inputSelectors = new String[]{".receive_captcha_panel input", ".captcha_input input", "input.captcha_input", "input[type='text']", "input[type='tel']", "input[placeholder*='\u9a8c\u8bc1\u7801']", ".js_captcha_input", ".input_captcha"};
            WebElement inputElement = null;
            for (String selector : inputSelectors) {
                try {
                    List inputs = this.driver.findElements(By.cssSelector((String)selector));
                    if (inputs.isEmpty() || !(inputElement = (WebElement)inputs.get(0)).isDisplayed()) continue;
                    log.info("\u627e\u5230\u9a8c\u8bc1\u7801\u8f93\u5165\u6846: {}", (Object)selector);
                    break;
                }
                catch (Exception inputs) {
                    // empty catch block
                }
            }
            if (inputElement != null) {
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{inputElement});
                this.sleep(500L);
                inputElement.clear();
                inputElement.sendKeys(new CharSequence[]{verificationCode});
                log.info("\u5df2\u8f93\u5165\u9a8c\u8bc1\u7801\u5230\u8f93\u5165\u6846");
            } else {
                log.warn("\u672a\u627e\u5230\u9a8c\u8bc1\u7801\u8f93\u5165\u6846\uff0c\u5c1d\u8bd5\u901a\u8fc7\u952e\u76d8\u8f93\u5165...");
                WebElement activeElement = this.driver.switchTo().activeElement();
                if (activeElement != null) {
                    activeElement.sendKeys(new CharSequence[]{verificationCode});
                    log.info("\u5df2\u901a\u8fc7\u6d3b\u52a8\u5143\u7d20\u8f93\u5165\u9a8c\u8bc1\u7801");
                } else {
                    for (char digit : verificationCode.toCharArray()) {
                        this.driver.findElement(By.tagName((String)"body")).sendKeys(new CharSequence[]{String.valueOf(digit)});
                        this.sleep(200L);
                    }
                    log.info("\u5df2\u901a\u8fc7body\u9010\u5b57\u7b26\u8f93\u5165\u9a8c\u8bc1\u7801");
                }
            }
            this.sleep(1000L);
            String[] confirmSelectors = new String[]{".confirm_btn", ".js_submit_captcha", ".captcha_confirm_btn", "button.confirm", "a.confirm_btn", ".submit_btn", "button[type='submit']", ".receive_captcha_panel .btn_primary", ".receive_captcha_panel button"};
            WebElement confirmBtn = null;
            for (String selector : confirmSelectors) {
                try {
                    List buttons = this.driver.findElements(By.cssSelector((String)selector));
                    for (WebElement btn : buttons) {
                        if (!btn.isDisplayed() || !btn.isEnabled()) continue;
                        confirmBtn = btn;
                        log.info("\u627e\u5230\u786e\u8ba4\u6309\u94ae: {}", (Object)selector);
                        break;
                    }
                    if (confirmBtn == null) continue;
                    break;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (confirmBtn != null) {
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{confirmBtn});
                this.sleep(500L);
                js.executeScript("arguments[0].click();", new Object[]{confirmBtn});
                log.info("\u5df2\u70b9\u51fb\u786e\u8ba4\u6309\u94ae");
            } else {
                log.warn("\u672a\u627e\u5230\u786e\u8ba4\u6309\u94ae\uff0c\u5c1d\u8bd5\u6309\u56de\u8f66\u952e\u63d0\u4ea4");
                if (inputElement != null) {
                    inputElement.sendKeys(new CharSequence[]{Keys.ENTER});
                } else {
                    this.driver.findElement(By.tagName((String)"body")).sendKeys(new CharSequence[]{Keys.ENTER});
                }
            }
            this.sleep(3000L);
            try {
                List errorElements = this.driver.findElements(By.cssSelector((String)".error_tips, .captcha_error, .tips_error"));
                for (WebElement errorEl : errorElements) {
                    if (!errorEl.isDisplayed()) continue;
                    String errorText = errorEl.getText();
                    log.error("\u9a8c\u8bc1\u7801\u9a8c\u8bc1\u5931\u8d25\uff0c\u9875\u9762\u9519\u8bef\u63d0\u793a: {}", (Object)errorText);
                    return false;
                }
            }
            catch (Exception errorElements) {
                // empty catch block
            }
            boolean result = this.checkLoginStatus();
            log.info("\u9a8c\u8bc1\u7801\u9a8c\u8bc1\u7ed3\u679c: {}", (Object)(result ? "\u6210\u529f" : "\u5931\u8d25"));
            return result;
        }
        catch (Exception e) {
            log.error("\u8f93\u5165\u9a8c\u8bc1\u7801\u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
            return false;
        }
    }

    public void injectCookies(List<Map<String, Object>> cookies) {
        this.ensureInitialized();
        if (cookies == null || cookies.isEmpty()) {
            return;
        }
        for (Map<String, Object> cookieData : cookies) {
            try {
                Cookie.Builder builder = new Cookie.Builder((String)cookieData.get("name"), (String)cookieData.get("value"));
                if (cookieData.containsKey("domain")) {
                    builder.domain((String)cookieData.get("domain"));
                }
                if (cookieData.containsKey("path")) {
                    builder.path((String)cookieData.get("path"));
                }
                this.driver.manage().addCookie(builder.build());
            }
            catch (Exception e) {
                log.warn("\u6ce8\u5165Cookie\u5931\u8d25: {}", (Object)e.getMessage());
            }
        }
        log.info("\u6ce8\u5165\u4e86 {} \u4e2aCookie", (Object)cookies.size());
    }

    public List<Map<String, Object>> extractCookies() {
        this.ensureInitialized();
        Set cookies = this.driver.manage().getCookies();
        return cookies.stream().map(cookie -> {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("name", cookie.getName());
            map.put("value", cookie.getValue());
            map.put("domain", cookie.getDomain());
            map.put("path", cookie.getPath());
            return map;
        }).collect(Collectors.toList());
    }

    public boolean modifyTrustedIp(String newIp) {
        this.ensureInitialized();
        List<String> appIds = this.properties.getAppIdList();
        if (appIds.isEmpty()) {
            log.error("\u672a\u914d\u7f6e\u5e94\u7528ID\uff0c\u65e0\u6cd5\u4fee\u6539IP");
            return false;
        }
        boolean allSuccess = true;
        for (String appId : appIds) {
            boolean success = this.modifyAppTrustedIp(appId, newIp);
            if (success) continue;
            allSuccess = false;
        }
        return allSuccess;
    }

    private boolean modifyAppTrustedIp(String appId, String newIp) {
        try {
            String[] selectors;
            String appUrl = APP_MANAGEMENT_BASE + appId.trim();
            log.info("\u6253\u5f00\u5e94\u7528\u9875\u9762: {}", (Object)appUrl);
            this.driver.get(appUrl);
            this.sleep(3000L);
            WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
            JavascriptExecutor js = (JavascriptExecutor)this.driver;
            WebElement configBtn = null;
            for (String xpath : selectors = new String[]{"//div[contains(@class, 'js_show_ipConfig_dialog')]//a[text()='\u914d\u7f6e']", "//a[contains(@class, 'js_show_ipConfig_dialog')]", "//span[text()='\u53ef\u4fe1IP']/following::a[text()='\u914d\u7f6e'][1]", "//a[text()='\u914d\u7f6e']"}) {
                try {
                    configBtn = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)By.xpath((String)xpath)));
                    if (configBtn == null || !configBtn.isDisplayed()) continue;
                    log.info("\u627e\u5230\u914d\u7f6e\u6309\u94ae: {}", (Object)xpath);
                    break;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (configBtn == null) {
                log.error("\u672a\u627e\u5230\u914d\u7f6e\u6309\u94ae");
                return false;
            }
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{configBtn});
            this.sleep(500L);
            js.executeScript("arguments[0].click();", new Object[]{configBtn});
            log.info("\u5df2\u70b9\u51fb\u914d\u7f6e\u6309\u94ae");
            this.sleep(1000L);
            WebElement textarea = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)By.cssSelector((String)"textarea.js_ipConfig_textarea")));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{textarea});
            this.sleep(500L);
            textarea.clear();
            textarea.sendKeys(new CharSequence[]{newIp});
            log.info("\u5df2\u8f93\u5165\u516c\u7f51IP: {}", (Object)newIp);
            WebElement confirmBtn = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)By.cssSelector((String)".js_ipConfig_confirmBtn")));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{confirmBtn});
            this.sleep(500L);
            js.executeScript("arguments[0].click();", new Object[]{confirmBtn});
            this.sleep(3000L);
            log.info("\u5e94\u7528 {} \u53ef\u4fe1IP\u4fee\u6539\u6210\u529f", (Object)appId);
            return true;
        }
        catch (Exception e) {
            log.error("\u4fee\u6539\u5e94\u7528 {} \u53ef\u4fe1IP\u5931\u8d25: {}", (Object)appId, (Object)e.getMessage());
            return false;
        }
    }

    public void refreshPage() {
        this.ensureInitialized();
        this.driver.navigate().refresh();
        this.sleep(2000L);
    }

    @Override
    public void close() {
        if (this.driver != null) {
            try {
                this.driver.quit();
                log.info("WebDriver \u5df2\u5173\u95ed");
            }
            catch (Exception e) {
                log.warn("\u5173\u95ed WebDriver \u5931\u8d25: {}", (Object)e.getMessage());
            }
            this.driver = null;
            this.initialized = false;
        }
    }

    private void ensureInitialized() {
        if (!this.initialized) {
            this.init();
        }
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private byte[] downloadImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            try (InputStream is = url.openStream();){
                byte[] byArray;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream();){
                    int bytesRead;
                    byte[] buffer = new byte[4096];
                    while ((bytesRead = is.read(buffer)) != -1) {
                        baos.write(buffer, 0, bytesRead);
                    }
                    byArray = baos.toByteArray();
                }
                return byArray;
            }
        }
        catch (Exception e) {
            log.error("\u4e0b\u8f7d\u56fe\u7247\u5931\u8d25: {}", (Object)e.getMessage());
            return null;
        }
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
