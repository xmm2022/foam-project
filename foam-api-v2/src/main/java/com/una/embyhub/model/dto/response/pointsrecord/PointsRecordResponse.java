/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.pointsrecord;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class PointsRecordResponse
implements Serializable {
    private Long id;
    private Long userId;
    private String username;
    private String embyName;
    private String recordType;
    private String recordTypeCn;
    private Integer amount;
    private Integer balanceAfter;
    private String description;
    private Date createDatetime;

    @Generated
    public PointsRecordResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getEmbyName() {
        return this.embyName;
    }

    @Generated
    public String getRecordType() {
        return this.recordType;
    }

    @Generated
    public String getRecordTypeCn() {
        return this.recordTypeCn;
    }

    @Generated
    public Integer getAmount() {
        return this.amount;
    }

    @Generated
    public Integer getBalanceAfter() {
        return this.balanceAfter;
    }

    @Generated
    public String getDescription() {
        return this.description;
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
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setEmbyName(String embyName) {
        this.embyName = embyName;
    }

    @Generated
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Generated
    public void setRecordTypeCn(String recordTypeCn) {
        this.recordTypeCn = recordTypeCn;
    }

    @Generated
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Generated
    public void setBalanceAfter(Integer balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
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
        if (!(o instanceof PointsRecordResponse)) {
            return false;
        }
        PointsRecordResponse other = (PointsRecordResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$amount = this.getAmount();
        Integer other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !((Object)this$amount).equals(other$amount)) {
            return false;
        }
        Integer this$balanceAfter = this.getBalanceAfter();
        Integer other$balanceAfter = other.getBalanceAfter();
        if (this$balanceAfter == null ? other$balanceAfter != null : !((Object)this$balanceAfter).equals(other$balanceAfter)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$embyName = this.getEmbyName();
        String other$embyName = other.getEmbyName();
        if (this$embyName == null ? other$embyName != null : !this$embyName.equals(other$embyName)) {
            return false;
        }
        String this$recordType = this.getRecordType();
        String other$recordType = other.getRecordType();
        if (this$recordType == null ? other$recordType != null : !this$recordType.equals(other$recordType)) {
            return false;
        }
        String this$recordTypeCn = this.getRecordTypeCn();
        String other$recordTypeCn = other.getRecordTypeCn();
        if (this$recordTypeCn == null ? other$recordTypeCn != null : !this$recordTypeCn.equals(other$recordTypeCn)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsRecordResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $amount = this.getAmount();
        result = result * 59 + ($amount == null ? 43 : ((Object)$amount).hashCode());
        Integer $balanceAfter = this.getBalanceAfter();
        result = result * 59 + ($balanceAfter == null ? 43 : ((Object)$balanceAfter).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $embyName = this.getEmbyName();
        result = result * 59 + ($embyName == null ? 43 : $embyName.hashCode());
        String $recordType = this.getRecordType();
        result = result * 59 + ($recordType == null ? 43 : $recordType.hashCode());
        String $recordTypeCn = this.getRecordTypeCn();
        result = result * 59 + ($recordTypeCn == null ? 43 : $recordTypeCn.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsRecordResponse(id=" + this.getId() + ", userId=" + this.getUserId() + ", username=" + this.getUsername() + ", embyName=" + this.getEmbyName() + ", recordType=" + this.getRecordType() + ", recordTypeCn=" + this.getRecordTypeCn() + ", amount=" + this.getAmount() + ", balanceAfter=" + this.getBalanceAfter() + ", description=" + this.getDescription() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
