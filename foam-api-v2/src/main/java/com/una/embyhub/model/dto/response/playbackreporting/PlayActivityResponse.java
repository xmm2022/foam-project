/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playbackreporting;

import com.alibaba.fastjson2.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import lombok.Generated;

public class PlayActivityResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    @JSONField(name="user_id")
    private String userId;
    @JSONField(name="user_name")
    private String userName;
    @JSONField(name="user_usage")
    private Map<String, Integer> userUsage;

    @Generated
    public PlayActivityResponse() {
    }

    @Generated
    public String getUserId() {
        return this.userId;
    }

    @Generated
    public String getUserName() {
        return this.userName;
    }

    @Generated
    public Map<String, Integer> getUserUsage() {
        return this.userUsage;
    }

    @Generated
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Generated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated
    public void setUserUsage(Map<String, Integer> userUsage) {
        this.userUsage = userUsage;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayActivityResponse)) {
            return false;
        }
        PlayActivityResponse other = (PlayActivityResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$userId = this.getUserId();
        String other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        Map<String, Integer> this$userUsage = this.getUserUsage();
        Map<String, Integer> other$userUsage = other.getUserUsage();
        return !(this$userUsage == null ? other$userUsage != null : !((Object)this$userUsage).equals(other$userUsage));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlayActivityResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        Map<String, Integer> $userUsage = this.getUserUsage();
        result = result * 59 + ($userUsage == null ? 43 : ((Object)$userUsage).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PlayActivityResponse(userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", userUsage=" + String.valueOf(this.getUserUsage()) + ")";
    }
}
