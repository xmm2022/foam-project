/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydata;

import java.io.Serializable;
import lombok.Generated;

public class MessagePushResponse
implements Serializable {
    private String userId;
    private String userKey;

    @Generated
    public MessagePushResponse() {
    }

    @Generated
    public String getUserId() {
        return this.userId;
    }

    @Generated
    public String getUserKey() {
        return this.userKey;
    }

    @Generated
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Generated
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MessagePushResponse)) {
            return false;
        }
        MessagePushResponse other = (MessagePushResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$userId = this.getUserId();
        String other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) {
            return false;
        }
        String this$userKey = this.getUserKey();
        String other$userKey = other.getUserKey();
        return !(this$userKey == null ? other$userKey != null : !this$userKey.equals(other$userKey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MessagePushResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        String $userKey = this.getUserKey();
        result = result * 59 + ($userKey == null ? 43 : $userKey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MessagePushResponse(userId=" + this.getUserId() + ", userKey=" + this.getUserKey() + ")";
    }
}
