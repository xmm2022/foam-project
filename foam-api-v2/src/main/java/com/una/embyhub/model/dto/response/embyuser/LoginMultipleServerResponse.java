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

public class LoginMultipleServerResponse
implements Serializable {
    private List<ServerOption> servers;

    @Generated
    public List<ServerOption> getServers() {
        return this.servers;
    }

    @Generated
    public void setServers(List<ServerOption> servers) {
        this.servers = servers;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LoginMultipleServerResponse)) {
            return false;
        }
        LoginMultipleServerResponse other = (LoginMultipleServerResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<ServerOption> this$servers = this.getServers();
        List<ServerOption> other$servers = other.getServers();
        return !(this$servers == null ? other$servers != null : !((Object)this$servers).equals(other$servers));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LoginMultipleServerResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<ServerOption> $servers = this.getServers();
        result = result * 59 + ($servers == null ? 43 : ((Object)$servers).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LoginMultipleServerResponse(servers=" + String.valueOf(this.getServers()) + ")";
    }

    @Generated
    public LoginMultipleServerResponse() {
    }

    @Generated
    public LoginMultipleServerResponse(List<ServerOption> servers) {
        this.servers = servers;
    }

    public static class ServerOption
    implements Serializable {
        private Long embyInfoId;
        private String serverName;

        @Generated
        public Long getEmbyInfoId() {
            return this.embyInfoId;
        }

        @Generated
        public String getServerName() {
            return this.serverName;
        }

        @Generated
        public void setEmbyInfoId(Long embyInfoId) {
            this.embyInfoId = embyInfoId;
        }

        @Generated
        public void setServerName(String serverName) {
            this.serverName = serverName;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ServerOption)) {
                return false;
            }
            ServerOption other = (ServerOption)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Long this$embyInfoId = this.getEmbyInfoId();
            Long other$embyInfoId = other.getEmbyInfoId();
            if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
                return false;
            }
            String this$serverName = this.getServerName();
            String other$serverName = other.getServerName();
            return !(this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof ServerOption;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $embyInfoId = this.getEmbyInfoId();
            result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
            String $serverName = this.getServerName();
            result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "LoginMultipleServerResponse.ServerOption(embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ")";
        }

        @Generated
        public ServerOption() {
        }

        @Generated
        public ServerOption(Long embyInfoId, String serverName) {
            this.embyInfoId = embyInfoId;
            this.serverName = serverName;
        }
    }
}
