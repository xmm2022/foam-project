/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyinfo;

import java.io.Serializable;
import lombok.Generated;

public class EmbyInfoEnabledResponse
implements Serializable {
    private String embyUrl;
    private String serverName;
    private String protocol;
    private String host;
    private int port;

    @Generated
    public EmbyInfoEnabledResponse() {
    }

    @Generated
    public String getEmbyUrl() {
        return this.embyUrl;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getProtocol() {
        return this.protocol;
    }

    @Generated
    public String getHost() {
        return this.host;
    }

    @Generated
    public int getPort() {
        return this.port;
    }

    @Generated
    public void setEmbyUrl(String embyUrl) {
        this.embyUrl = embyUrl;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Generated
    public void setHost(String host) {
        this.host = host;
    }

    @Generated
    public void setPort(int port) {
        this.port = port;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyInfoEnabledResponse)) {
            return false;
        }
        EmbyInfoEnabledResponse other = (EmbyInfoEnabledResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getPort() != other.getPort()) {
            return false;
        }
        String this$embyUrl = this.getEmbyUrl();
        String other$embyUrl = other.getEmbyUrl();
        if (this$embyUrl == null ? other$embyUrl != null : !this$embyUrl.equals(other$embyUrl)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$protocol = this.getProtocol();
        String other$protocol = other.getProtocol();
        if (this$protocol == null ? other$protocol != null : !this$protocol.equals(other$protocol)) {
            return false;
        }
        String this$host = this.getHost();
        String other$host = other.getHost();
        return !(this$host == null ? other$host != null : !this$host.equals(other$host));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyInfoEnabledResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getPort();
        String $embyUrl = this.getEmbyUrl();
        result = result * 59 + ($embyUrl == null ? 43 : $embyUrl.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $protocol = this.getProtocol();
        result = result * 59 + ($protocol == null ? 43 : $protocol.hashCode());
        String $host = this.getHost();
        result = result * 59 + ($host == null ? 43 : $host.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyInfoEnabledResponse(embyUrl=" + this.getEmbyUrl() + ", serverName=" + this.getServerName() + ", protocol=" + this.getProtocol() + ", host=" + this.getHost() + ", port=" + this.getPort() + ")";
    }
}
