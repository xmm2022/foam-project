/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.invitation;

import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class InvitationCodeResponse
implements Serializable {
    private Long id;
    private String code;
    private Long embyInfoId;
    private String serverName;
    private Integer hostLineType;
    private String hostLineTypeName;
    private Integer status;
    private Integer usageLimit;
    private Integer usedCount;
    private Date expireDatetime;
    private String usedBy;
    private Date usedDatetime;
    private Date createDatetime;

    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = HostLineTypeEnum.normalize(hostLineType);
        this.hostLineTypeName = HostLineTypeEnum.resolveLabel(hostLineType);
    }

    @Generated
    public InvitationCodeResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
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
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public String getHostLineTypeName() {
        return this.hostLineTypeName;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Integer getUsageLimit() {
        return this.usageLimit;
    }

    @Generated
    public Integer getUsedCount() {
        return this.usedCount;
    }

    @Generated
    public Date getExpireDatetime() {
        return this.expireDatetime;
    }

    @Generated
    public String getUsedBy() {
        return this.usedBy;
    }

    @Generated
    public Date getUsedDatetime() {
        return this.usedDatetime;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
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
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setHostLineTypeName(String hostLineTypeName) {
        this.hostLineTypeName = hostLineTypeName;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setUsageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
    }

    @Generated
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    @Generated
    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    @Generated
    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

    @Generated
    public void setUsedDatetime(Date usedDatetime) {
        this.usedDatetime = usedDatetime;
    }

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvitationCodeResponse)) {
            return false;
        }
        InvitationCodeResponse other = (InvitationCodeResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        Integer this$usageLimit = this.getUsageLimit();
        Integer other$usageLimit = other.getUsageLimit();
        if (this$usageLimit == null ? other$usageLimit != null : !((Object)this$usageLimit).equals(other$usageLimit)) {
            return false;
        }
        Integer this$usedCount = this.getUsedCount();
        Integer other$usedCount = other.getUsedCount();
        if (this$usedCount == null ? other$usedCount != null : !((Object)this$usedCount).equals(other$usedCount)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$hostLineTypeName = this.getHostLineTypeName();
        String other$hostLineTypeName = other.getHostLineTypeName();
        if (this$hostLineTypeName == null ? other$hostLineTypeName != null : !this$hostLineTypeName.equals(other$hostLineTypeName)) {
            return false;
        }
        Date this$expireDatetime = this.getExpireDatetime();
        Date other$expireDatetime = other.getExpireDatetime();
        if (this$expireDatetime == null ? other$expireDatetime != null : !((Object)this$expireDatetime).equals(other$expireDatetime)) {
            return false;
        }
        String this$usedBy = this.getUsedBy();
        String other$usedBy = other.getUsedBy();
        if (this$usedBy == null ? other$usedBy != null : !this$usedBy.equals(other$usedBy)) {
            return false;
        }
        Date this$usedDatetime = this.getUsedDatetime();
        Date other$usedDatetime = other.getUsedDatetime();
        if (this$usedDatetime == null ? other$usedDatetime != null : !((Object)this$usedDatetime).equals(other$usedDatetime)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof InvitationCodeResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $usageLimit = this.getUsageLimit();
        result = result * 59 + ($usageLimit == null ? 43 : ((Object)$usageLimit).hashCode());
        Integer $usedCount = this.getUsedCount();
        result = result * 59 + ($usedCount == null ? 43 : ((Object)$usedCount).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $hostLineTypeName = this.getHostLineTypeName();
        result = result * 59 + ($hostLineTypeName == null ? 43 : $hostLineTypeName.hashCode());
        Date $expireDatetime = this.getExpireDatetime();
        result = result * 59 + ($expireDatetime == null ? 43 : ((Object)$expireDatetime).hashCode());
        String $usedBy = this.getUsedBy();
        result = result * 59 + ($usedBy == null ? 43 : $usedBy.hashCode());
        Date $usedDatetime = this.getUsedDatetime();
        result = result * 59 + ($usedDatetime == null ? 43 : ((Object)$usedDatetime).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "InvitationCodeResponse(id=" + this.getId() + ", code=" + this.getCode() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", hostLineType=" + this.getHostLineType() + ", hostLineTypeName=" + this.getHostLineTypeName() + ", status=" + this.getStatus() + ", usageLimit=" + this.getUsageLimit() + ", usedCount=" + this.getUsedCount() + ", expireDatetime=" + String.valueOf(this.getExpireDatetime()) + ", usedBy=" + this.getUsedBy() + ", usedDatetime=" + String.valueOf(this.getUsedDatetime()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
