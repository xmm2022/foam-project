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

public class RequestListReject
implements Serializable {
    @NotEmpty(message="\u6c42\u7247\u5217\u8868id\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u6c42\u7247\u5217\u8868id\u4e0d\u80fd\u4e3a\u7a7a") List<Long> requestListIdList;
    @NotEmpty(message="\u5907\u6ce8\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u5907\u6ce8\u4e0d\u80fd\u4e3a\u7a7a") String remark;
    private Long embyInfoId;

    @Generated
    public RequestListReject() {
    }

    @Generated
    public List<Long> getRequestListIdList() {
        return this.requestListIdList;
    }

    @Generated
    public String getRemark() {
        return this.remark;
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
    public void setRemark(String remark) {
        this.remark = remark;
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
        if (!(o instanceof RequestListReject)) {
            return false;
        }
        RequestListReject other = (RequestListReject)o;
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
        if (this$requestListIdList == null ? other$requestListIdList != null : !((Object)this$requestListIdList).equals(other$requestListIdList)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestListReject;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        List<Long> $requestListIdList = this.getRequestListIdList();
        result = result * 59 + ($requestListIdList == null ? 43 : ((Object)$requestListIdList).hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestListReject(requestListIdList=" + String.valueOf(this.getRequestListIdList()) + ", remark=" + this.getRemark() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }
}
