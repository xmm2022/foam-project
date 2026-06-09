/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.pointsrecord;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import lombok.Generated;

public class PointsRecordRequest
implements Serializable {
    private String username;
    @BindQuery(comparison=Comparison.EQ)
    private String recordType;

    @Generated
    public PointsRecordRequest() {
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getRecordType() {
        return this.recordType;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsRecordRequest)) {
            return false;
        }
        PointsRecordRequest other = (PointsRecordRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$recordType = this.getRecordType();
        String other$recordType = other.getRecordType();
        return !(this$recordType == null ? other$recordType != null : !this$recordType.equals(other$recordType));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsRecordRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $recordType = this.getRecordType();
        result = result * 59 + ($recordType == null ? 43 : $recordType.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsRecordRequest(username=" + this.getUsername() + ", recordType=" + this.getRecordType() + ")";
    }
}
