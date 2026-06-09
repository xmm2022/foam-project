/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import jakarta.validation.constraints.NotNull;
import lombok.Generated;

public class SyncEmbyUserRequest {
    @NotNull(message="\u6e90\u670d\u52a1\u5668\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u6e90\u670d\u52a1\u5668\u4e0d\u80fd\u4e3a\u7a7a") Long sourceEmbyInfoId;
    @NotNull(message="\u76ee\u6807\u670d\u52a1\u5668\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u76ee\u6807\u670d\u52a1\u5668\u4e0d\u80fd\u4e3a\u7a7a") Long targetEmbyInfoId;
    private String defaultPassword;

    @Generated
    public SyncEmbyUserRequest() {
    }

    @Generated
    public Long getSourceEmbyInfoId() {
        return this.sourceEmbyInfoId;
    }

    @Generated
    public Long getTargetEmbyInfoId() {
        return this.targetEmbyInfoId;
    }

    @Generated
    public String getDefaultPassword() {
        return this.defaultPassword;
    }

    @Generated
    public void setSourceEmbyInfoId(Long sourceEmbyInfoId) {
        this.sourceEmbyInfoId = sourceEmbyInfoId;
    }

    @Generated
    public void setTargetEmbyInfoId(Long targetEmbyInfoId) {
        this.targetEmbyInfoId = targetEmbyInfoId;
    }

    @Generated
    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SyncEmbyUserRequest)) {
            return false;
        }
        SyncEmbyUserRequest other = (SyncEmbyUserRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$sourceEmbyInfoId = this.getSourceEmbyInfoId();
        Long other$sourceEmbyInfoId = other.getSourceEmbyInfoId();
        if (this$sourceEmbyInfoId == null ? other$sourceEmbyInfoId != null : !((Object)this$sourceEmbyInfoId).equals(other$sourceEmbyInfoId)) {
            return false;
        }
        Long this$targetEmbyInfoId = this.getTargetEmbyInfoId();
        Long other$targetEmbyInfoId = other.getTargetEmbyInfoId();
        if (this$targetEmbyInfoId == null ? other$targetEmbyInfoId != null : !((Object)this$targetEmbyInfoId).equals(other$targetEmbyInfoId)) {
            return false;
        }
        String this$defaultPassword = this.getDefaultPassword();
        String other$defaultPassword = other.getDefaultPassword();
        return !(this$defaultPassword == null ? other$defaultPassword != null : !this$defaultPassword.equals(other$defaultPassword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SyncEmbyUserRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $sourceEmbyInfoId = this.getSourceEmbyInfoId();
        result = result * 59 + ($sourceEmbyInfoId == null ? 43 : ((Object)$sourceEmbyInfoId).hashCode());
        Long $targetEmbyInfoId = this.getTargetEmbyInfoId();
        result = result * 59 + ($targetEmbyInfoId == null ? 43 : ((Object)$targetEmbyInfoId).hashCode());
        String $defaultPassword = this.getDefaultPassword();
        result = result * 59 + ($defaultPassword == null ? 43 : $defaultPassword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SyncEmbyUserRequest(sourceEmbyInfoId=" + this.getSourceEmbyInfoId() + ", targetEmbyInfoId=" + this.getTargetEmbyInfoId() + ", defaultPassword=" + this.getDefaultPassword() + ")";
    }
}
