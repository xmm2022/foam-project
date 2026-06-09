/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.hostline;

import com.una.embyhub.config.common.enums.HostLineTypeEnum;
import java.io.Serializable;
import lombok.Generated;

public class HostLineResponse
implements Serializable {
    private Long id;
    private Long embyInfoId;
    private String lineName;
    private Integer lineType;
    private String lineTypeName;
    private String protocol;
    private String domain;
    private Integer port;
    private Integer isDisplay;
    private Integer enabled;
    private Integer sortNo;
    private String remark;

    public void setLineType(Integer lineType) {
        this.lineType = HostLineTypeEnum.normalize(lineType);
        this.lineTypeName = HostLineTypeEnum.resolveLabel(lineType);
    }

    public String getLineAddress() {
        if (this.protocol == null || this.domain == null || this.port == null) {
            return null;
        }
        return String.format("%s://%s:%d", this.protocol, this.domain, this.port);
    }

    @Generated
    public HostLineResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getLineName() {
        return this.lineName;
    }

    @Generated
    public Integer getLineType() {
        return this.lineType;
    }

    @Generated
    public String getLineTypeName() {
        return this.lineTypeName;
    }

    @Generated
    public String getProtocol() {
        return this.protocol;
    }

    @Generated
    public String getDomain() {
        return this.domain;
    }

    @Generated
    public Integer getPort() {
        return this.port;
    }

    @Generated
    public Integer getIsDisplay() {
        return this.isDisplay;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public Integer getSortNo() {
        return this.sortNo;
    }

    @Generated
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    @Generated
    public void setLineTypeName(String lineTypeName) {
        this.lineTypeName = lineTypeName;
    }

    @Generated
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Generated
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Generated
    public void setPort(Integer port) {
        this.port = port;
    }

    @Generated
    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HostLineResponse)) {
            return false;
        }
        HostLineResponse other = (HostLineResponse)o;
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
        Integer this$lineType = this.getLineType();
        Integer other$lineType = other.getLineType();
        if (this$lineType == null ? other$lineType != null : !((Object)this$lineType).equals(other$lineType)) {
            return false;
        }
        Integer this$port = this.getPort();
        Integer other$port = other.getPort();
        if (this$port == null ? other$port != null : !((Object)this$port).equals(other$port)) {
            return false;
        }
        Integer this$isDisplay = this.getIsDisplay();
        Integer other$isDisplay = other.getIsDisplay();
        if (this$isDisplay == null ? other$isDisplay != null : !((Object)this$isDisplay).equals(other$isDisplay)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Integer this$sortNo = this.getSortNo();
        Integer other$sortNo = other.getSortNo();
        if (this$sortNo == null ? other$sortNo != null : !((Object)this$sortNo).equals(other$sortNo)) {
            return false;
        }
        String this$lineName = this.getLineName();
        String other$lineName = other.getLineName();
        if (this$lineName == null ? other$lineName != null : !this$lineName.equals(other$lineName)) {
            return false;
        }
        String this$lineTypeName = this.getLineTypeName();
        String other$lineTypeName = other.getLineTypeName();
        if (this$lineTypeName == null ? other$lineTypeName != null : !this$lineTypeName.equals(other$lineTypeName)) {
            return false;
        }
        String this$protocol = this.getProtocol();
        String other$protocol = other.getProtocol();
        if (this$protocol == null ? other$protocol != null : !this$protocol.equals(other$protocol)) {
            return false;
        }
        String this$domain = this.getDomain();
        String other$domain = other.getDomain();
        if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof HostLineResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $lineType = this.getLineType();
        result = result * 59 + ($lineType == null ? 43 : ((Object)$lineType).hashCode());
        Integer $port = this.getPort();
        result = result * 59 + ($port == null ? 43 : ((Object)$port).hashCode());
        Integer $isDisplay = this.getIsDisplay();
        result = result * 59 + ($isDisplay == null ? 43 : ((Object)$isDisplay).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Integer $sortNo = this.getSortNo();
        result = result * 59 + ($sortNo == null ? 43 : ((Object)$sortNo).hashCode());
        String $lineName = this.getLineName();
        result = result * 59 + ($lineName == null ? 43 : $lineName.hashCode());
        String $lineTypeName = this.getLineTypeName();
        result = result * 59 + ($lineTypeName == null ? 43 : $lineTypeName.hashCode());
        String $protocol = this.getProtocol();
        result = result * 59 + ($protocol == null ? 43 : $protocol.hashCode());
        String $domain = this.getDomain();
        result = result * 59 + ($domain == null ? 43 : $domain.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "HostLineResponse(id=" + this.getId() + ", embyInfoId=" + this.getEmbyInfoId() + ", lineName=" + this.getLineName() + ", lineType=" + this.getLineType() + ", lineTypeName=" + this.getLineTypeName() + ", protocol=" + this.getProtocol() + ", domain=" + this.getDomain() + ", port=" + this.getPort() + ", isDisplay=" + this.getIsDisplay() + ", enabled=" + this.getEnabled() + ", sortNo=" + this.getSortNo() + ", remark=" + this.getRemark() + ")";
    }
}
