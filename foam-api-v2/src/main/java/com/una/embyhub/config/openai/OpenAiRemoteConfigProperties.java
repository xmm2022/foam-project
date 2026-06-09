/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.springframework.boot.context.properties.ConfigurationProperties
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.openai;

import lombok.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="foam.openai.remote")
public class OpenAiRemoteConfigProperties {
    private String configPath = "/api/ai/config";
    private String privateKeyLocation = "classpath:keys/ai-private-key.pem";
    private int timeoutMs = 10000;

    @Generated
    public OpenAiRemoteConfigProperties() {
    }

    @Generated
    public String getConfigPath() {
        return this.configPath;
    }

    @Generated
    public String getPrivateKeyLocation() {
        return this.privateKeyLocation;
    }

    @Generated
    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    @Generated
    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }

    @Generated
    public void setPrivateKeyLocation(String privateKeyLocation) {
        this.privateKeyLocation = privateKeyLocation;
    }

    @Generated
    public void setTimeoutMs(int timeoutMs) {
        this.timeoutMs = timeoutMs;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenAiRemoteConfigProperties)) {
            return false;
        }
        OpenAiRemoteConfigProperties other = (OpenAiRemoteConfigProperties)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getTimeoutMs() != other.getTimeoutMs()) {
            return false;
        }
        String this$configPath = this.getConfigPath();
        String other$configPath = other.getConfigPath();
        if (this$configPath == null ? other$configPath != null : !this$configPath.equals(other$configPath)) {
            return false;
        }
        String this$privateKeyLocation = this.getPrivateKeyLocation();
        String other$privateKeyLocation = other.getPrivateKeyLocation();
        return !(this$privateKeyLocation == null ? other$privateKeyLocation != null : !this$privateKeyLocation.equals(other$privateKeyLocation));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof OpenAiRemoteConfigProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getTimeoutMs();
        String $configPath = this.getConfigPath();
        result = result * 59 + ($configPath == null ? 43 : $configPath.hashCode());
        String $privateKeyLocation = this.getPrivateKeyLocation();
        result = result * 59 + ($privateKeyLocation == null ? 43 : $privateKeyLocation.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "OpenAiRemoteConfigProperties(configPath=" + this.getConfigPath() + ", privateKeyLocation=" + this.getPrivateKeyLocation() + ", timeoutMs=" + this.getTimeoutMs() + ")";
    }
}
