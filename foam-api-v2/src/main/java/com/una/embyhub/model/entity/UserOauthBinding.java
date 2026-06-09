/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import lombok.Generated;

@TableName(value="user_oauth_binding")
public class UserOauthBinding
extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="provider")
    private String provider;
    @TableField(value="provider_user_id")
    private String providerUserId;
    @TableField(value="provider_username")
    private String providerUsername;
    @TableField(value="provider_avatar")
    private String providerAvatar;
    @TableField(value="extra_data")
    private String extraData;
    public static final String PROVIDER_TELEGRAM = "telegram";
    public static final String PROVIDER_WECHAT = "wechat";
    public static final String PROVIDER_GOOGLE = "google";
    public static final String COL_ID = "id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_PROVIDER = "provider";
    public static final String COL_PROVIDER_USER_ID = "provider_user_id";

    @Generated
    public UserOauthBinding() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
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
    public String getExtraData() {
        return this.extraData;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
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
    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    @Override
    @Generated
    public String toString() {
        return "UserOauthBinding(id=" + this.getId() + ", userId=" + this.getUserId() + ", provider=" + this.getProvider() + ", providerUserId=" + this.getProviderUserId() + ", providerUsername=" + this.getProviderUsername() + ", providerAvatar=" + this.getProviderAvatar() + ", extraData=" + this.getExtraData() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserOauthBinding)) {
            return false;
        }
        UserOauthBinding other = (UserOauthBinding)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
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
        String this$extraData = this.getExtraData();
        String other$extraData = other.getExtraData();
        return !(this$extraData == null ? other$extraData != null : !this$extraData.equals(other$extraData));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserOauthBinding;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        String $provider = this.getProvider();
        result = result * 59 + ($provider == null ? 43 : $provider.hashCode());
        String $providerUserId = this.getProviderUserId();
        result = result * 59 + ($providerUserId == null ? 43 : $providerUserId.hashCode());
        String $providerUsername = this.getProviderUsername();
        result = result * 59 + ($providerUsername == null ? 43 : $providerUsername.hashCode());
        String $providerAvatar = this.getProviderAvatar();
        result = result * 59 + ($providerAvatar == null ? 43 : $providerAvatar.hashCode());
        String $extraData = this.getExtraData();
        result = result * 59 + ($extraData == null ? 43 : $extraData.hashCode());
        return result;
    }
}
