/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import com.una.embyhub.model.dto.response.emby.SessionSessionInfoResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class NowPlayingGroupedResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long serverId;
    private String serverName;
    private List<SessionSessionInfoResponse> sessions = new ArrayList<SessionSessionInfoResponse>();

    @Generated
    public NowPlayingGroupedResponse() {
    }

    @Generated
    public Long getServerId() {
        return this.serverId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public List<SessionSessionInfoResponse> getSessions() {
        return this.sessions;
    }

    @Generated
    public NowPlayingGroupedResponse setServerId(Long serverId) {
        this.serverId = serverId;
        return this;
    }

    @Generated
    public NowPlayingGroupedResponse setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    @Generated
    public NowPlayingGroupedResponse setSessions(List<SessionSessionInfoResponse> sessions) {
        this.sessions = sessions;
        return this;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NowPlayingGroupedResponse)) {
            return false;
        }
        NowPlayingGroupedResponse other = (NowPlayingGroupedResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$serverId = this.getServerId();
        Long other$serverId = other.getServerId();
        if (this$serverId == null ? other$serverId != null : !((Object)this$serverId).equals(other$serverId)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        List<SessionSessionInfoResponse> this$sessions = this.getSessions();
        List<SessionSessionInfoResponse> other$sessions = other.getSessions();
        return !(this$sessions == null ? other$sessions != null : !((Object)this$sessions).equals(other$sessions));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof NowPlayingGroupedResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $serverId = this.getServerId();
        result = result * 59 + ($serverId == null ? 43 : ((Object)$serverId).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        List<SessionSessionInfoResponse> $sessions = this.getSessions();
        result = result * 59 + ($sessions == null ? 43 : ((Object)$sessions).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "NowPlayingGroupedResponse(serverId=" + this.getServerId() + ", serverName=" + this.getServerName() + ", sessions=" + String.valueOf(this.getSessions()) + ")";
    }
}
