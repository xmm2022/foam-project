/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotEmpty
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.requestlist;

import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class RequestListAudit
implements Serializable {
    @NotEmpty(message="\u6c42\u7247\u5217\u8868id\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u6c42\u7247\u5217\u8868id\u4e0d\u80fd\u4e3a\u7a7a") List<Long> requestListIdList;
    private Long embyInfoId;

    @Generated
    public RequestListAudit() {
    }

    @Generated
    public List<Long> getRequestListIdList() {
        return this.requestListIdList;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public void setRequestListIdList(List<Long> requestListIdList) {
        this.requestListIdList = requestListIdList;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestListAudit)) {
            return false;
        }
        RequestListAudit other = (RequestListAudit)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        List<Long> this$requestListIdList = this.getRequestListIdList();
        List<Long> other$requestListIdList = other.getRequestListIdList();
        return !(this$requestListIdList == null ? other$requestListIdList != null : !((Object)this$requestListIdList).equals(other$requestListIdList));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestListAudit;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        List<Long> $requestListIdList = this.getRequestListIdList();
        result = result * 59 + ($requestListIdList == null ? 43 : ((Object)$requestListIdList).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestListAudit(requestListIdList=" + String.valueOf(this.getRequestListIdList()) + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
