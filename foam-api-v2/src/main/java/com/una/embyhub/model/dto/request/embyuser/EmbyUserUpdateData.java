/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyuser;

import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyUserUpdateData
extends BaseEntity
implements Serializable {
    private Long id;
    private Date expirationDate;
    private String remarks;
    private Integer requestPackagesCount;
    private Integer hostLineType;
    private String avatar;
    private Integer isAdmin;

    @Generated
    public EmbyUserUpdateData() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Generated
    public String getRemarks() {
        return this.remarks;
    }

    @Generated
    public Integer getRequestPackagesCount() {
        return this.requestPackagesCount;
    }

    @Generated
    public Integer getHostLineType() {
        return this.hostLineType;
    }

    @Generated
    public String getAvatar() {
        return this.avatar;
    }

    @Generated
    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Generated
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Generated
    public void setRequestPackagesCount(Integer requestPackagesCount) {
        this.requestPackagesCount = requestPackagesCount;
    }

    @Generated
    public void setHostLineType(Integer hostLineType) {
        this.hostLineType = hostLineType;
    }

    @Generated
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Generated
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyUserUpdateData)) {
            return false;
        }
        EmbyUserUpdateData other = (EmbyUserUpdateData)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$requestPackagesCount = this.getRequestPackagesCount();
        Integer other$requestPackagesCount = other.getRequestPackagesCount();
        if (this$requestPackagesCount == null ? other$requestPackagesCount != null : !((Object)this$requestPackagesCount).equals(other$requestPackagesCount)) {
            return false;
        }
        Integer this$hostLineType = this.getHostLineType();
        Integer other$hostLineType = other.getHostLineType();
        if (this$hostLineType == null ? other$hostLineType != null : !((Object)this$hostLineType).equals(other$hostLineType)) {
            return false;
        }
        Integer this$isAdmin = this.getIsAdmin();
        Integer other$isAdmin = other.getIsAdmin();
        if (this$isAdmin == null ? other$isAdmin != null : !((Object)this$isAdmin).equals(other$isAdmin)) {
            return false;
        }
        Date this$expirationDate = this.getExpirationDate();
        Date other$expirationDate = other.getExpirationDate();
        if (this$expirationDate == null ? other$expirationDate != null : !((Object)this$expirationDate).equals(other$expirationDate)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$avatar = this.getAvatar();
        String other$avatar = other.getAvatar();
        return !(this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyUserUpdateData;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $requestPackagesCount = this.getRequestPackagesCount();
        result = result * 59 + ($requestPackagesCount == null ? 43 : ((Object)$requestPackagesCount).hashCode());
        Integer $hostLineType = this.getHostLineType();
        result = result * 59 + ($hostLineType == null ? 43 : ((Object)$hostLineType).hashCode());
        Integer $isAdmin = this.getIsAdmin();
        result = result * 59 + ($isAdmin == null ? 43 : ((Object)$isAdmin).hashCode());
        Date $expirationDate = this.getExpirationDate();
        result = result * 59 + ($expirationDate == null ? 43 : ((Object)$expirationDate).hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $avatar = this.getAvatar();
        result = result * 59 + ($avatar == null ? 43 : $avatar.hashCode());
        return result;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyUserUpdateData(id=" + this.getId() + ", expirationDate=" + String.valueOf(this.getExpirationDate()) + ", remarks=" + this.getRemarks() + ", requestPackagesCount=" + this.getRequestPackagesCount() + ", hostLineType=" + this.getHostLineType() + ", avatar=" + this.getAvatar() + ", isAdmin=" + this.getIsAdmin() + ")";
    }
}
