/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.cookiecloud;

import com.una.embyhub.config.common.cookiecloud.CookieCloudProperties;
import java.util.Arrays;
import java.util.List;
import lombok.Generated;

public class WeChatIpProperties {
    private String wechatUrl;
    private String appIds;
    private CookieCloudProperties cookieCloud;
    private String pushplusToken;
    private String helloimgToken;
    private String checkCron;
    private String refreshCron;
    private List<String> ipUrls;
    private boolean headless;
    private boolean useCookieCloud;
    private String cookieHeader;

    public List<String> getAppIdList() {
        if (this.appIds == null || this.appIds.isEmpty()) {
            return List.of();
        }
        return Arrays.stream(this.appIds.split(",")).map(String::trim).filter(s -> !s.isEmpty()).toList();
    }

    public boolean hasQrCodePush() {
        return this.pushplusToken != null && !this.pushplusToken.isEmpty() && this.helloimgToken != null && !this.helloimgToken.isEmpty();
    }

    @Generated
    private static String $default$wechatUrl() {
        return "https://work.weixin.qq.com/wework_admin/loginpage_wx?from=myhome";
    }

    @Generated
    private static String $default$checkCron() {
        return "*/20 * * * *";
    }

    @Generated
    private static String $default$refreshCron() {
        return "*/20 * * * *";
    }

    @Generated
    private static List<String> $default$ipUrls() {
        return Arrays.asList("https://myip.ipip.net", "https://ddns.oray.com/checkip", "https://ip.3322.net", "https://4.ipw.cn");
    }

    @Generated
    private static boolean $default$headless() {
        return true;
    }

    @Generated
    private static boolean $default$useCookieCloud() {
        return true;
    }

    @Generated
    public static WeChatIpPropertiesBuilder builder() {
        return new WeChatIpPropertiesBuilder();
    }

    @Generated
    public String getWechatUrl() {
        return this.wechatUrl;
    }

    @Generated
    public String getAppIds() {
        return this.appIds;
    }

    @Generated
    public CookieCloudProperties getCookieCloud() {
        return this.cookieCloud;
    }

    @Generated
    public String getPushplusToken() {
        return this.pushplusToken;
    }

    @Generated
    public String getHelloimgToken() {
        return this.helloimgToken;
    }

    @Generated
    public String getCheckCron() {
        return this.checkCron;
    }

    @Generated
    public String getRefreshCron() {
        return this.refreshCron;
    }

    @Generated
    public List<String> getIpUrls() {
        return this.ipUrls;
    }

    @Generated
    public boolean isHeadless() {
        return this.headless;
    }

    @Generated
    public boolean isUseCookieCloud() {
        return this.useCookieCloud;
    }

    @Generated
    public String getCookieHeader() {
        return this.cookieHeader;
    }

    @Generated
    public void setWechatUrl(String wechatUrl) {
        this.wechatUrl = wechatUrl;
    }

    @Generated
    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    @Generated
    public void setCookieCloud(CookieCloudProperties cookieCloud) {
        this.cookieCloud = cookieCloud;
    }

    @Generated
    public void setPushplusToken(String pushplusToken) {
        this.pushplusToken = pushplusToken;
    }

    @Generated
    public void setHelloimgToken(String helloimgToken) {
        this.helloimgToken = helloimgToken;
    }

    @Generated
    public void setCheckCron(String checkCron) {
        this.checkCron = checkCron;
    }

    @Generated
    public void setRefreshCron(String refreshCron) {
        this.refreshCron = refreshCron;
    }

    @Generated
    public void setIpUrls(List<String> ipUrls) {
        this.ipUrls = ipUrls;
    }

    @Generated
    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    @Generated
    public void setUseCookieCloud(boolean useCookieCloud) {
        this.useCookieCloud = useCookieCloud;
    }

    @Generated
    public void setCookieHeader(String cookieHeader) {
        this.cookieHeader = cookieHeader;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WeChatIpProperties)) {
            return false;
        }
        WeChatIpProperties other = (WeChatIpProperties)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isHeadless() != other.isHeadless()) {
            return false;
        }
        if (this.isUseCookieCloud() != other.isUseCookieCloud()) {
            return false;
        }
        String this$wechatUrl = this.getWechatUrl();
        String other$wechatUrl = other.getWechatUrl();
        if (this$wechatUrl == null ? other$wechatUrl != null : !this$wechatUrl.equals(other$wechatUrl)) {
            return false;
        }
        String this$appIds = this.getAppIds();
        String other$appIds = other.getAppIds();
        if (this$appIds == null ? other$appIds != null : !this$appIds.equals(other$appIds)) {
            return false;
        }
        CookieCloudProperties this$cookieCloud = this.getCookieCloud();
        CookieCloudProperties other$cookieCloud = other.getCookieCloud();
        if (this$cookieCloud == null ? other$cookieCloud != null : !((Object)this$cookieCloud).equals(other$cookieCloud)) {
            return false;
        }
        String this$pushplusToken = this.getPushplusToken();
        String other$pushplusToken = other.getPushplusToken();
        if (this$pushplusToken == null ? other$pushplusToken != null : !this$pushplusToken.equals(other$pushplusToken)) {
            return false;
        }
        String this$helloimgToken = this.getHelloimgToken();
        String other$helloimgToken = other.getHelloimgToken();
        if (this$helloimgToken == null ? other$helloimgToken != null : !this$helloimgToken.equals(other$helloimgToken)) {
            return false;
        }
        String this$checkCron = this.getCheckCron();
        String other$checkCron = other.getCheckCron();
        if (this$checkCron == null ? other$checkCron != null : !this$checkCron.equals(other$checkCron)) {
            return false;
        }
        String this$refreshCron = this.getRefreshCron();
        String other$refreshCron = other.getRefreshCron();
        if (this$refreshCron == null ? other$refreshCron != null : !this$refreshCron.equals(other$refreshCron)) {
            return false;
        }
        List<String> this$ipUrls = this.getIpUrls();
        List<String> other$ipUrls = other.getIpUrls();
        if (this$ipUrls == null ? other$ipUrls != null : !((Object)this$ipUrls).equals(other$ipUrls)) {
            return false;
        }
        String this$cookieHeader = this.getCookieHeader();
        String other$cookieHeader = other.getCookieHeader();
        return !(this$cookieHeader == null ? other$cookieHeader != null : !this$cookieHeader.equals(other$cookieHeader));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WeChatIpProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isHeadless() ? 79 : 97);
        result = result * 59 + (this.isUseCookieCloud() ? 79 : 97);
        String $wechatUrl = this.getWechatUrl();
        result = result * 59 + ($wechatUrl == null ? 43 : $wechatUrl.hashCode());
        String $appIds = this.getAppIds();
        result = result * 59 + ($appIds == null ? 43 : $appIds.hashCode());
        CookieCloudProperties $cookieCloud = this.getCookieCloud();
        result = result * 59 + ($cookieCloud == null ? 43 : ((Object)$cookieCloud).hashCode());
        String $pushplusToken = this.getPushplusToken();
        result = result * 59 + ($pushplusToken == null ? 43 : $pushplusToken.hashCode());
        String $helloimgToken = this.getHelloimgToken();
        result = result * 59 + ($helloimgToken == null ? 43 : $helloimgToken.hashCode());
        String $checkCron = this.getCheckCron();
        result = result * 59 + ($checkCron == null ? 43 : $checkCron.hashCode());
        String $refreshCron = this.getRefreshCron();
        result = result * 59 + ($refreshCron == null ? 43 : $refreshCron.hashCode());
        List<String> $ipUrls = this.getIpUrls();
        result = result * 59 + ($ipUrls == null ? 43 : ((Object)$ipUrls).hashCode());
        String $cookieHeader = this.getCookieHeader();
        result = result * 59 + ($cookieHeader == null ? 43 : $cookieHeader.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WeChatIpProperties(wechatUrl=" + this.getWechatUrl() + ", appIds=" + this.getAppIds() + ", cookieCloud=" + String.valueOf(this.getCookieCloud()) + ", pushplusToken=" + this.getPushplusToken() + ", helloimgToken=" + this.getHelloimgToken() + ", checkCron=" + this.getCheckCron() + ", refreshCron=" + this.getRefreshCron() + ", ipUrls=" + String.valueOf(this.getIpUrls()) + ", headless=" + this.isHeadless() + ", useCookieCloud=" + this.isUseCookieCloud() + ", cookieHeader=" + this.getCookieHeader() + ")";
    }

    @Generated
    public WeChatIpProperties() {
        this.wechatUrl = WeChatIpProperties.$default$wechatUrl();
        this.checkCron = WeChatIpProperties.$default$checkCron();
        this.refreshCron = WeChatIpProperties.$default$refreshCron();
        this.ipUrls = WeChatIpProperties.$default$ipUrls();
        this.headless = WeChatIpProperties.$default$headless();
        this.useCookieCloud = WeChatIpProperties.$default$useCookieCloud();
    }

    @Generated
    public WeChatIpProperties(String wechatUrl, String appIds, CookieCloudProperties cookieCloud, String pushplusToken, String helloimgToken, String checkCron, String refreshCron, List<String> ipUrls, boolean headless, boolean useCookieCloud, String cookieHeader) {
        this.wechatUrl = wechatUrl;
        this.appIds = appIds;
        this.cookieCloud = cookieCloud;
        this.pushplusToken = pushplusToken;
        this.helloimgToken = helloimgToken;
        this.checkCron = checkCron;
        this.refreshCron = refreshCron;
        this.ipUrls = ipUrls;
        this.headless = headless;
        this.useCookieCloud = useCookieCloud;
        this.cookieHeader = cookieHeader;
    }

    @Generated
    public static class WeChatIpPropertiesBuilder {
        @Generated
        private boolean wechatUrl$set;
        @Generated
        private String wechatUrl$value;
        @Generated
        private String appIds;
        @Generated
        private CookieCloudProperties cookieCloud;
        @Generated
        private String pushplusToken;
        @Generated
        private String helloimgToken;
        @Generated
        private boolean checkCron$set;
        @Generated
        private String checkCron$value;
        @Generated
        private boolean refreshCron$set;
        @Generated
        private String refreshCron$value;
        @Generated
        private boolean ipUrls$set;
        @Generated
        private List<String> ipUrls$value;
        @Generated
        private boolean headless$set;
        @Generated
        private boolean headless$value;
        @Generated
        private boolean useCookieCloud$set;
        @Generated
        private boolean useCookieCloud$value;
        @Generated
        private String cookieHeader;

        @Generated
        WeChatIpPropertiesBuilder() {
        }

        @Generated
        public WeChatIpPropertiesBuilder wechatUrl(String wechatUrl) {
            this.wechatUrl$value = wechatUrl;
            this.wechatUrl$set = true;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder appIds(String appIds) {
            this.appIds = appIds;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder cookieCloud(CookieCloudProperties cookieCloud) {
            this.cookieCloud = cookieCloud;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder pushplusToken(String pushplusToken) {
            this.pushplusToken = pushplusToken;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder helloimgToken(String helloimgToken) {
            this.helloimgToken = helloimgToken;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder checkCron(String checkCron) {
            this.checkCron$value = checkCron;
            this.checkCron$set = true;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder refreshCron(String refreshCron) {
            this.refreshCron$value = refreshCron;
            this.refreshCron$set = true;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder ipUrls(List<String> ipUrls) {
            this.ipUrls$value = ipUrls;
            this.ipUrls$set = true;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder headless(boolean headless) {
            this.headless$value = headless;
            this.headless$set = true;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder useCookieCloud(boolean useCookieCloud) {
            this.useCookieCloud$value = useCookieCloud;
            this.useCookieCloud$set = true;
            return this;
        }

        @Generated
        public WeChatIpPropertiesBuilder cookieHeader(String cookieHeader) {
            this.cookieHeader = cookieHeader;
            return this;
        }

        @Generated
        public WeChatIpProperties build() {
            String wechatUrl$value = this.wechatUrl$value;
            if (!this.wechatUrl$set) {
                wechatUrl$value = WeChatIpProperties.$default$wechatUrl();
            }
            String checkCron$value = this.checkCron$value;
            if (!this.checkCron$set) {
                checkCron$value = WeChatIpProperties.$default$checkCron();
            }
            String refreshCron$value = this.refreshCron$value;
            if (!this.refreshCron$set) {
                refreshCron$value = WeChatIpProperties.$default$refreshCron();
            }
            List<String> ipUrls$value = this.ipUrls$value;
            if (!this.ipUrls$set) {
                ipUrls$value = WeChatIpProperties.$default$ipUrls();
            }
            boolean headless$value = this.headless$value;
            if (!this.headless$set) {
                headless$value = WeChatIpProperties.$default$headless();
            }
            boolean useCookieCloud$value = this.useCookieCloud$value;
            if (!this.useCookieCloud$set) {
                useCookieCloud$value = WeChatIpProperties.$default$useCookieCloud();
            }
            return new WeChatIpProperties(wechatUrl$value, this.appIds, this.cookieCloud, this.pushplusToken, this.helloimgToken, checkCron$value, refreshCron$value, ipUrls$value, headless$value, useCookieCloud$value, this.cookieHeader);
        }

        @Generated
        public String toString() {
            return "WeChatIpProperties.WeChatIpPropertiesBuilder(wechatUrl$value=" + this.wechatUrl$value + ", appIds=" + this.appIds + ", cookieCloud=" + String.valueOf(this.cookieCloud) + ", pushplusToken=" + this.pushplusToken + ", helloimgToken=" + this.helloimgToken + ", checkCron$value=" + this.checkCron$value + ", refreshCron$value=" + this.refreshCron$value + ", ipUrls$value=" + String.valueOf(this.ipUrls$value) + ", headless$value=" + this.headless$value + ", useCookieCloud$value=" + this.useCookieCloud$value + ", cookieHeader=" + this.cookieHeader + ")";
        }
    }
}
