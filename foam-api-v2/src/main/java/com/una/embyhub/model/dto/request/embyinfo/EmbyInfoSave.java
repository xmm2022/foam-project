/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyinfo;

import java.io.Serializable;
import lombok.Generated;

public class EmbyInfoSave
implements Serializable {
    private String embyUrl;
    private String embyPort;
    private String embyAgreement;
    private String serverName;
    private String embyServerId;
    private String embyApikey;
    private Integer enabled;
    private String copyfromuserid;
    private Integer spread;
    private String adminQueryUserid;

    @Generated
    public EmbyInfoSave() {
    }

    @Generated
    public String getEmbyUrl() {
        return this.embyUrl;
    }

    @Generated
    public String getEmbyPort() {
        return this.embyPort;
    }

    @Generated
    public String getEmbyAgreement() {
        return this.embyAgreement;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getEmbyServerId() {
        return this.embyServerId;
    }

    @Generated
    public String getEmbyApikey() {
        return this.embyApikey;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public String getCopyfromuserid() {
        return this.copyfromuserid;
    }

    @Generated
    public Integer getSpread() {
        return this.spread;
    }

    @Generated
    public String getAdminQueryUserid() {
        return this.adminQueryUserid;
    }

    @Generated
    public void setEmbyUrl(String embyUrl) {
        this.embyUrl = embyUrl;
    }

    @Generated
    public void setEmbyPort(String embyPort) {
        this.embyPort = embyPort;
    }

    @Generated
    public void setEmbyAgreement(String embyAgreement) {
        this.embyAgreement = embyAgreement;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
    }

    @Generated
    public void setEmbyApikey(String embyApikey) {
        this.embyApikey = embyApikey;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setCopyfromuserid(String copyfromuserid) {
        this.copyfromuserid = copyfromuserid;
    }

    @Generated
    public void setSpread(Integer spread) {
        this.spread = spread;
    }

    @Generated
    public void setAdminQueryUserid(String adminQueryUserid) {
        this.adminQueryUserid = adminQueryUserid;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyInfoSave)) {
            return false;
        }
        EmbyInfoSave other = (EmbyInfoSave)o;
        if (!other.canEqual(this)) {
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
        String this$embyUrl = this.getEmbyUrl();
        String other$embyUrl = other.getEmbyUrl();
        if (this$embyUrl == null ? other$embyUrl != null : !this$embyUrl.equals(other$embyUrl)) {
            return false;
        }
        String this$embyPort = this.getEmbyPort();
        String other$embyPort = other.getEmbyPort();
        if (this$embyPort == null ? other$embyPort != null : !this$embyPort.equals(other$embyPort)) {
            return false;
        }
        String this$embyAgreement = this.getEmbyAgreement();
        String other$embyAgreement = other.getEmbyAgreement();
        if (this$embyAgreement == null ? other$embyAgreement != null : !this$embyAgreement.equals(other$embyAgreement)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
            return false;
        }
        String this$embyApikey = this.getEmbyApikey();
        String other$embyApikey = other.getEmbyApikey();
        if (this$embyApikey == null ? other$embyApikey != null : !this$embyApikey.equals(other$embyApikey)) {
            return false;
        }
        String this$copyfromuserid = this.getCopyfromuserid();
        String other$copyfromuserid = other.getCopyfromuserid();
        if (this$copyfromuserid == null ? other$copyfromuserid != null : !this$copyfromuserid.equals(other$copyfromuserid)) {
            return false;
        }
        String this$adminQueryUserid = this.getAdminQueryUserid();
        String other$adminQueryUserid = other.getAdminQueryUserid();
        return !(this$adminQueryUserid == null ? other$adminQueryUserid != null : !this$adminQueryUserid.equals(other$adminQueryUserid));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyInfoSave;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $spread = this.getSpread();
        result = result * 59 + ($spread == null ? 43 : ((Object)$spread).hashCode());
        String $embyUrl = this.getEmbyUrl();
        result = result * 59 + ($embyUrl == null ? 43 : $embyUrl.hashCode());
        String $embyPort = this.getEmbyPort();
        result = result * 59 + ($embyPort == null ? 43 : $embyPort.hashCode());
        String $embyAgreement = this.getEmbyAgreement();
        result = result * 59 + ($embyAgreement == null ? 43 : $embyAgreement.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        String $embyApikey = this.getEmbyApikey();
        result = result * 59 + ($embyApikey == null ? 43 : $embyApikey.hashCode());
        String $copyfromuserid = this.getCopyfromuserid();
        result = result * 59 + ($copyfromuserid == null ? 43 : $copyfromuserid.hashCode());
        String $adminQueryUserid = this.getAdminQueryUserid();
        result = result * 59 + ($adminQueryUserid == null ? 43 : $adminQueryUserid.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyInfoSave(embyUrl=" + this.getEmbyUrl() + ", embyPort=" + this.getEmbyPort() + ", embyAgreement=" + this.getEmbyAgreement() + ", serverName=" + this.getServerName() + ", embyServerId=" + this.getEmbyServerId() + ", embyApikey=" + this.getEmbyApikey() + ", enabled=" + this.getEnabled() + ", copyfromuserid=" + this.getCopyfromuserid() + ", spread=" + this.getSpread() + ", adminQueryUserid=" + this.getAdminQueryUserid() + ")";
    }
}
