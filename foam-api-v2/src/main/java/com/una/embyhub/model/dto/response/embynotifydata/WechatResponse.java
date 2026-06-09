/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydata;

import java.io.Serializable;
import lombok.Generated;

public class WechatResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String webhookKey;
    private String webhookUrl;

    @Generated
    public WechatResponse() {
    }

    @Generated
    public String getWebhookKey() {
        return this.webhookKey;
    }

    @Generated
    public String getWebhookUrl() {
        return this.webhookUrl;
    }

    @Generated
    public void setWebhookKey(String webhookKey) {
        this.webhookKey = webhookKey;
    }

    @Generated
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WechatResponse)) {
            return false;
        }
        WechatResponse other = (WechatResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$webhookKey = this.getWebhookKey();
        String other$webhookKey = other.getWebhookKey();
        if (this$webhookKey == null ? other$webhookKey != null : !this$webhookKey.equals(other$webhookKey)) {
            return false;
        }
        String this$webhookUrl = this.getWebhookUrl();
        String other$webhookUrl = other.getWebhookUrl();
        return !(this$webhookUrl == null ? other$webhookUrl != null : !this$webhookUrl.equals(other$webhookUrl));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WechatResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $webhookKey = this.getWebhookKey();
        result = result * 59 + ($webhookKey == null ? 43 : $webhookKey.hashCode());
        String $webhookUrl = this.getWebhookUrl();
        result = result * 59 + ($webhookUrl == null ? 43 : $webhookUrl.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WechatResponse(webhookKey=" + this.getWebhookKey() + ", webhookUrl=" + this.getWebhookUrl() + ")";
    }
}
