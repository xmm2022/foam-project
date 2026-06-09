/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.invitation;

import java.io.Serializable;
import lombok.Generated;

public class InvitationCodeQueryRequest
implements Serializable {
    private String code;
    private Long embyInfoId;
    private Integer hostLineType;
    private Integer status;
    private long current = 1L;
    private long size = 10L;

    @Generated
    public InvitationCodeQueryRequest() {
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public long getCurrent() {
        return this.current;
    }

    @Generated
    public long getSize() {
        return this.size;
    }

    @Generated
    public void setCode(String code) {
        this.code = code;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = hostLineType;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setCurrent(long current) {
        this.current = current;
    }

    @Generated
    public void setSize(long size) {
        this.size = size;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvitationCodeQueryRequest)) {
            return false;
        }
        InvitationCodeQueryRequest other = (InvitationCodeQueryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getCurrent() != other.getCurrent()) {
            return false;
        }
        if (this.getSize() != other.getSize()) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$hostLineType = this.getHostLineType();
        Integer other$hostLineType = other.getHostLineType();
        if (this$hostLineType == null ? other$hostLineType != null : !((Object)this$hostLineType).equals(other$hostLineType)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        return !(this$code == null ? other$code != null : !this$code.equals(other$code));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InvitationCodeQueryRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $current = this.getCurrent();
        result = result * 59 + (int)($current >>> 32 ^ $current);
        long $size = this.getSize();
        result = result * 59 + (int)($size >>> 32 ^ $size);
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "InvitationCodeQueryRequest(code=" + this.getCode() + ", embyInfoId=" + this.getEmbyInfoId() + ", hostLineType=" + this.getHostLineType() + ", status=" + this.getStatus() + ", current=" + this.getCurrent() + ", size=" + this.getSize() + ")";
    }
}
