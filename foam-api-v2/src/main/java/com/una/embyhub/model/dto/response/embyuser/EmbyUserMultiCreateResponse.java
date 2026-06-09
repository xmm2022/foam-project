/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class EmbyUserMultiCreateResponse
implements Serializable {
    private String username;
    private String password;
    private List<ServerInfo> servers;

    @Generated
    public EmbyUserMultiCreateResponse() {
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public List<ServerInfo> getServers() {
        return this.servers;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated
    public void setServers(List<ServerInfo> servers) {
        this.servers = servers;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserMultiCreateResponse)) {
            return false;
        }
        EmbyUserMultiCreateResponse other = (EmbyUserMultiCreateResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$password = this.getPassword();
        String other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) {
            return false;
        }
        List<ServerInfo> this$servers = this.getServers();
        List<ServerInfo> other$servers = other.getServers();
        return !(this$servers == null ? other$servers != null : !((Object)this$servers).equals(other$servers));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserMultiCreateResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        List<ServerInfo> $servers = this.getServers();
        result = result * 59 + ($servers == null ? 43 : ((Object)$servers).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyUserMultiCreateResponse(username=" + this.getUsername() + ", password=" + this.getPassword() + ", servers=" + String.valueOf(this.getServers()) + ")";
    }

    public static class ServerInfo
    implements Serializable {
        private String serverName;
        private String protocol;
        private String host;
        private Integer port;

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
        public Integer getPort() {
            return this.port;
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
        public void setPort(Integer port) {
            this.port = port;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ServerInfo)) {
                return false;
            }
            ServerInfo other = (ServerInfo)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Integer this$port = this.getPort();
            Integer other$port = other.getPort();
            if (this$port == null ? other$port != null : !((Object)this$port).equals(other$port)) {
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
            return other instanceof ServerInfo;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Integer $port = this.getPort();
            result = result * 59 + ($port == null ? 43 : ((Object)$port).hashCode());
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
            return "EmbyUserMultiCreateResponse.ServerInfo(serverName=" + this.getServerName() + ", protocol=" + this.getProtocol() + ", host=" + this.getHost() + ", port=" + this.getPort() + ")";
        }

        @Generated
        public ServerInfo() {
        }

        @Generated
        public ServerInfo(String serverName, String protocol, String host, Integer port) {
            this.serverName = serverName;
            this.protocol = protocol;
            this.host = host;
            this.port = port;
        }
    }
}
