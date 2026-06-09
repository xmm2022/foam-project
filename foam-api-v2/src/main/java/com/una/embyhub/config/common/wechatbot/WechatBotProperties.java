/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.wechatbot;

import lombok.Generated;

public class WechatBotProperties {
    private String token;
    private String encodingAesKey;
    private String corpId;
    private String agentId;
    private String appSecret;
    private boolean menuEnabled;

    @Generated
    public WechatBotProperties() {
    }

    @Generated
    public String getToken() {
        return this.token;
    }

    @Generated
    public String getEncodingAesKey() {
        return this.encodingAesKey;
    }

    @Generated
    public String getCorpId() {
        return this.corpId;
    }

    @Generated
    public String getAgentId() {
        return this.agentId;
    }

    @Generated
    public String getAppSecret() {
        return this.appSecret;
    }

    @Generated
    public boolean isMenuEnabled() {
        return this.menuEnabled;
    }

    @Generated
    public void setToken(String token) {
        this.token = token;
    }

    @Generated
    public void setEncodingAesKey(String encodingAesKey) {
        this.encodingAesKey = encodingAesKey;
    }

    @Generated
    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    @Generated
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @Generated
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Generated
    public void setMenuEnabled(boolean menuEnabled) {
        this.menuEnabled = menuEnabled;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WechatBotProperties)) {
            return false;
        }
        WechatBotProperties other = (WechatBotProperties)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isMenuEnabled() != other.isMenuEnabled()) {
            return false;
        }
        String this$token = this.getToken();
        String other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) {
            return false;
        }
        String this$encodingAesKey = this.getEncodingAesKey();
        String other$encodingAesKey = other.getEncodingAesKey();
        if (this$encodingAesKey == null ? other$encodingAesKey != null : !this$encodingAesKey.equals(other$encodingAesKey)) {
            return false;
        }
        String this$corpId = this.getCorpId();
        String other$corpId = other.getCorpId();
        if (this$corpId == null ? other$corpId != null : !this$corpId.equals(other$corpId)) {
            return false;
        }
        String this$agentId = this.getAgentId();
        String other$agentId = other.getAgentId();
        if (this$agentId == null ? other$agentId != null : !this$agentId.equals(other$agentId)) {
            return false;
        }
        String this$appSecret = this.getAppSecret();
        String other$appSecret = other.getAppSecret();
        return !(this$appSecret == null ? other$appSecret != null : !this$appSecret.equals(other$appSecret));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WechatBotProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isMenuEnabled() ? 79 : 97);
        String $token = this.getToken();
        result = result * 59 + ($token == null ? 43 : $token.hashCode());
        String $encodingAesKey = this.getEncodingAesKey();
        result = result * 59 + ($encodingAesKey == null ? 43 : $encodingAesKey.hashCode());
        String $corpId = this.getCorpId();
        result = result * 59 + ($corpId == null ? 43 : $corpId.hashCode());
        String $agentId = this.getAgentId();
        result = result * 59 + ($agentId == null ? 43 : $agentId.hashCode());
        String $appSecret = this.getAppSecret();
        result = result * 59 + ($appSecret == null ? 43 : $appSecret.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WechatBotProperties(token=" + this.getToken() + ", encodingAesKey=" + this.getEncodingAesKey() + ", corpId=" + this.getCorpId() + ", agentId=" + this.getAgentId() + ", appSecret=" + this.getAppSecret() + ", menuEnabled=" + this.isMenuEnabled() + ")";
    }
}
