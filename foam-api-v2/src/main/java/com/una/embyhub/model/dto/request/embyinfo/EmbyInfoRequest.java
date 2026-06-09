/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyinfo;

import java.io.Serializable;
import lombok.Generated;

public class EmbyInfoRequest
implements Serializable {
    private Integer status;
    private Integer enabled;
    private Integer spread;
    private String serverName;

    @Generated
    public EmbyInfoRequest() {
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public Integer getSpread() {
        return this.spread;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setSpread(Integer spread) {
        this.spread = spread;
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
        if (!(o instanceof EmbyInfoRequest)) {
            return false;
        }
        EmbyInfoRequest other = (EmbyInfoRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Integer this$spread = this.getSpread();
        Integer other$spread = other.getSpread();
        if (this$spread == null ? other$spread != null : !((Object)this$spread).equals(other$spread)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        return !(this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyInfoRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $spread = this.getSpread();
        result = result * 59 + ($spread == null ? 43 : ((Object)$spread).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyInfoRequest(status=" + this.getStatus() + ", enabled=" + this.getEnabled() + ", spread=" + this.getSpread() + ", serverName=" + this.getServerName() + ")";
    }
}
