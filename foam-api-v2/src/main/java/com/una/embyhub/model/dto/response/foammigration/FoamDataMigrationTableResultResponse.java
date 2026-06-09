/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.foammigration;

import java.io.Serializable;
import lombok.Generated;

public class FoamDataMigrationTableResultResponse
implements Serializable {
    private String tableName;
    private String status;
    private Long sourceRows;
    private Long syncedRows;
    private String message;

    @Generated
    public FoamDataMigrationTableResultResponse() {
    }

    @Generated
    public String getTableName() {
        return this.tableName;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public Long getSourceRows() {
        return this.sourceRows;
    }

    @Generated
    public Long getSyncedRows() {
        return this.syncedRows;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setSourceRows(Long sourceRows) {
        this.sourceRows = sourceRows;
    }

    @Generated
    public void setSyncedRows(Long syncedRows) {
        this.syncedRows = syncedRows;
    }

    @Generated
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationTableResultResponse)) {
            return false;
        }
        FoamDataMigrationTableResultResponse other = (FoamDataMigrationTableResultResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$sourceRows = this.getSourceRows();
        Long other$sourceRows = other.getSourceRows();
        if (this$sourceRows == null ? other$sourceRows != null : !((Object)this$sourceRows).equals(other$sourceRows)) {
            return false;
        }
        Long this$syncedRows = this.getSyncedRows();
        Long other$syncedRows = other.getSyncedRows();
        if (this$syncedRows == null ? other$syncedRows != null : !((Object)this$syncedRows).equals(other$syncedRows)) {
            return false;
        }
        String this$tableName = this.getTableName();
        String other$tableName = other.getTableName();
        if (this$tableName == null ? other$tableName != null : !this$tableName.equals(other$tableName)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        return !(this$message == null ? other$message != null : !this$message.equals(other$message));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationTableResultResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $sourceRows = this.getSourceRows();
        result = result * 59 + ($sourceRows == null ? 43 : ((Object)$sourceRows).hashCode());
        Long $syncedRows = this.getSyncedRows();
        result = result * 59 + ($syncedRows == null ? 43 : ((Object)$syncedRows).hashCode());
        String $tableName = this.getTableName();
        result = result * 59 + ($tableName == null ? 43 : $tableName.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationTableResultResponse(tableName=" + this.getTableName() + ", status=" + this.getStatus() + ", sourceRows=" + this.getSourceRows() + ", syncedRows=" + this.getSyncedRows() + ", message=" + this.getMessage() + ")";
    }
}
