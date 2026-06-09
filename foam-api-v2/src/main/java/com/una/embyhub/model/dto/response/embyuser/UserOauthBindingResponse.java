/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyuser;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class UserOauthBindingResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String provider;
    private String providerUserId;
    private String providerUsername;
    private String providerAvatar;
    private Date createDatetime;

    @Generated
    public UserOauthBindingResponse() {
    }

    @Generated
    public String getProvider() {
        return this.provider;
    }

    @Generated
    public String getProviderUserId() {
        return this.providerUserId;
    }

    @Generated
    public String getProviderUsername() {
        return this.providerUsername;
    }

    @Generated
    public String getProviderAvatar() {
        return this.providerAvatar;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Generated
    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    @Generated
    public void setProviderUsername(String providerUsername) {
        this.providerUsername = providerUsername;
    }

    @Generated
    public void setProviderAvatar(String providerAvatar) {
        this.providerAvatar = providerAvatar;
    }

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserOauthBindingResponse)) {
            return false;
        }
        UserOauthBindingResponse other = (UserOauthBindingResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$provider = this.getProvider();
        String other$provider = other.getProvider();
        if (this$provider == null ? other$provider != null : !this$provider.equals(other$provider)) {
            return false;
        }
        String this$providerUserId = this.getProviderUserId();
        String other$providerUserId = other.getProviderUserId();
        if (this$providerUserId == null ? other$providerUserId != null : !this$providerUserId.equals(other$providerUserId)) {
            return false;
        }
        String this$providerUsername = this.getProviderUsername();
        String other$providerUsername = other.getProviderUsername();
        if (this$providerUsername == null ? other$providerUsername != null : !this$providerUsername.equals(other$providerUsername)) {
            return false;
        }
        String this$providerAvatar = this.getProviderAvatar();
        String other$providerAvatar = other.getProviderAvatar();
        if (this$providerAvatar == null ? other$providerAvatar != null : !this$providerAvatar.equals(other$providerAvatar)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserOauthBindingResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $provider = this.getProvider();
        result = result * 59 + ($provider == null ? 43 : $provider.hashCode());
        String $providerUserId = this.getProviderUserId();
        result = result * 59 + ($providerUserId == null ? 43 : $providerUserId.hashCode());
        String $providerUsername = this.getProviderUsername();
        result = result * 59 + ($providerUsername == null ? 43 : $providerUsername.hashCode());
        String $providerAvatar = this.getProviderAvatar();
        result = result * 59 + ($providerAvatar == null ? 43 : $providerAvatar.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserOauthBindingResponse(provider=" + this.getProvider() + ", providerUserId=" + this.getProviderUserId() + ", providerUsername=" + this.getProviderUsername() + ", providerAvatar=" + this.getProviderAvatar() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
