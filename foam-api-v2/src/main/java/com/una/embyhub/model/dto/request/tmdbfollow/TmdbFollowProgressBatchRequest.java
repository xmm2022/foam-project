/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.Valid
 *  jakarta.validation.constraints.NotEmpty
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.tmdbfollow;

import com.una.embyhub.model.dto.request.tmdbfollow.TmdbFollowProgressRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class TmdbFollowProgressBatchRequest
implements Serializable {
    @NotNull(message="\u8fdb\u5ea6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a")
    @NotEmpty(message="\u8fdb\u5ea6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a")
    @Valid
    private @NotNull(message="\u8fdb\u5ea6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a") @NotEmpty(message="\u8fdb\u5ea6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a") @Valid List<TmdbFollowProgressRequest> progressList;

    @Generated
    public TmdbFollowProgressBatchRequest() {
    }

    @Generated
    public List<TmdbFollowProgressRequest> getProgressList() {
        return this.progressList;
    }

    @Generated
    public void setProgressList(List<TmdbFollowProgressRequest> progressList) {
        this.progressList = progressList;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TmdbFollowProgressBatchRequest)) {
            return false;
        }
        TmdbFollowProgressBatchRequest other = (TmdbFollowProgressBatchRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<TmdbFollowProgressRequest> this$progressList = this.getProgressList();
        List<TmdbFollowProgressRequest> other$progressList = other.getProgressList();
        return !(this$progressList == null ? other$progressList != null : !((Object)this$progressList).equals(other$progressList));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TmdbFollowProgressBatchRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<TmdbFollowProgressRequest> $progressList = this.getProgressList();
        result = result * 59 + ($progressList == null ? 43 : ((Object)$progressList).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TmdbFollowProgressBatchRequest(progressList=" + String.valueOf(this.getProgressList()) + ")";
    }
}
