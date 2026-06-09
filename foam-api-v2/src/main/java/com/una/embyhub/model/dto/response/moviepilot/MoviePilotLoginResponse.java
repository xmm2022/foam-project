/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.moviepilot;

import com.alibaba.fastjson2.annotation.JSONField;
import java.util.Map;
import lombok.Generated;

public class MoviePilotLoginResponse {
    @JSONField(name="access_token")
    private String accessToken;
    @JSONField(name="token_type")
    private String tokenType;
    @JSONField(name="super_user")
    private Boolean superUser;
    @JSONField(name="user_id")
    private Long userId;
    @JSONField(name="user_name")
    private String userName;
    private String avatar;
    private Integer level;
    private Map<String, Object> permissions;
    private Boolean widzard;

    @Generated
    public MoviePilotLoginResponse() {
    }

    @Generated
    public String getAccessToken() {
        return this.accessToken;
    }

    @Generated
    public String getTokenType() {
        return this.tokenType;
    }

    @Generated
    public Boolean getSuperUser() {
        return this.superUser;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public String getAvatar() {
        return this.avatar;
    }

    @Generated
    public Integer getLevel() {
        return this.level;
    }

    @Generated
    public Map<String, Object> getPermissions() {
        return this.permissions;
    }

    @Generated
    public Boolean getWidzard() {
        return this.widzard;
    }

    @Generated
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Generated
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Generated
    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Generated
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Generated
    public void setPermissions(Map<String, Object> permissions) {
        this.permissions = permissions;
    }

    @Generated
    public void setWidzard(Boolean widzard) {
        this.widzard = widzard;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MoviePilotLoginResponse)) {
            return false;
        }
        MoviePilotLoginResponse other = (MoviePilotLoginResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$superUser = this.getSuperUser();
        Boolean other$superUser = other.getSuperUser();
        if (this$superUser == null ? other$superUser != null : !((Object)this$superUser).equals(other$superUser)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Boolean this$widzard = this.getWidzard();
        Boolean other$widzard = other.getWidzard();
        if (this$widzard == null ? other$widzard != null : !((Object)this$widzard).equals(other$widzard)) {
            return false;
        }
        String this$accessToken = this.getAccessToken();
        String other$accessToken = other.getAccessToken();
        if (this$accessToken == null ? other$accessToken != null : !this$accessToken.equals(other$accessToken)) {
            return false;
        }
        String this$tokenType = this.getTokenType();
        String other$tokenType = other.getTokenType();
        if (this$tokenType == null ? other$tokenType != null : !this$tokenType.equals(other$tokenType)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        String this$avatar = this.getAvatar();
        String other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) {
            return false;
        }
        Map<String, Object> this$permissions = this.getPermissions();
        Map<String, Object> other$permissions = other.getPermissions();
        return !(this$permissions == null ? other$permissions != null : !((Object)this$permissions).equals(other$permissions));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MoviePilotLoginResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $superUser = this.getSuperUser();
        result = result * 59 + ($superUser == null ? 43 : ((Object)$superUser).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Boolean $widzard = this.getWidzard();
        result = result * 59 + ($widzard == null ? 43 : ((Object)$widzard).hashCode());
        String $accessToken = this.getAccessToken();
        result = result * 59 + ($accessToken == null ? 43 : $accessToken.hashCode());
        String $tokenType = this.getTokenType();
        result = result * 59 + ($tokenType == null ? 43 : $tokenType.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $avatar = this.getAvatar();
        result = result * 59 + ($avatar == null ? 43 : $avatar.hashCode());
        Map<String, Object> $permissions = this.getPermissions();
        result = result * 59 + ($permissions == null ? 43 : ((Object)$permissions).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MoviePilotLoginResponse(accessToken=" + this.getAccessToken() + ", tokenType=" + this.getTokenType() + ", superUser=" + this.getSuperUser() + ", userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", avatar=" + this.getAvatar() + ", level=" + this.getLevel() + ", permissions=" + String.valueOf(this.getPermissions()) + ", widzard=" + this.getWidzard() + ")";
    }
}
