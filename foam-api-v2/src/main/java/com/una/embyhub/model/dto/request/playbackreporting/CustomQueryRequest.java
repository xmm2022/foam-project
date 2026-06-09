/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.playbackreporting;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Generated;

public class CustomQueryRequest {
    @JSONField(name="customQueryString")
    private String customQueryString;
    @JSONField(name="replaceUserId")
    private Boolean replaceUserId;

    @Generated
    public CustomQueryRequest() {
    }

    @Generated
    public String getCustomQueryString() {
        return this.customQueryString;
    }

    @Generated
    public Boolean getReplaceUserId() {
        return this.replaceUserId;
    }

    @Generated
    public void setCustomQueryString(String customQueryString) {
        this.customQueryString = customQueryString;
    }

    @Generated
    public void setReplaceUserId(Boolean replaceUserId) {
        this.replaceUserId = replaceUserId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomQueryRequest)) {
            return false;
        }
        CustomQueryRequest other = (CustomQueryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$replaceUserId = this.getReplaceUserId();
        Boolean other$replaceUserId = other.getReplaceUserId();
        if (this$replaceUserId == null ? other$replaceUserId != null : !((Object)this$replaceUserId).equals(other$replaceUserId)) {
            return false;
        }
        String this$customQueryString = this.getCustomQueryString();
        String other$customQueryString = other.getCustomQueryString();
        return !(this$customQueryString == null ? other$customQueryString != null : !this$customQueryString.equals(other$customQueryString));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CustomQueryRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $replaceUserId = this.getReplaceUserId();
        result = result * 59 + ($replaceUserId == null ? 43 : ((Object)$replaceUserId).hashCode());
        String $customQueryString = this.getCustomQueryString();
        result = result * 59 + ($customQueryString == null ? 43 : $customQueryString.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CustomQueryRequest(customQueryString=" + this.getCustomQueryString() + ", replaceUserId=" + this.getReplaceUserId() + ")";
    }
}
