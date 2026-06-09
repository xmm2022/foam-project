/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.foammigration;

import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationTableResultResponse;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class FoamDataMigrationResultResponse
implements Serializable {
    private Integer tableCount;
    private Integer syncedTableCount;
    private Integer skippedTableCount;
    private Integer failedTableCount;
    private Long totalSourceRows;
    private Long totalSyncedRows;
    private Long durationMs;
    private List<FoamDataMigrationTableResultResponse> tables;

    @Generated
    public FoamDataMigrationResultResponse() {
    }

    @Generated
    public Integer getTableCount() {
        return this.tableCount;
    }

    @Generated
    public Integer getSyncedTableCount() {
        return this.syncedTableCount;
    }

    @Generated
    public Integer getSkippedTableCount() {
        return this.skippedTableCount;
    }

    @Generated
    public Integer getFailedTableCount() {
        return this.failedTableCount;
    }

    @Generated
    public Long getTotalSourceRows() {
        return this.totalSourceRows;
    }

    @Generated
    public Long getTotalSyncedRows() {
        return this.totalSyncedRows;
    }

    @Generated
    public Long getDurationMs() {
        return this.durationMs;
    }

    @Generated
    public List<FoamDataMigrationTableResultResponse> getTables() {
        return this.tables;
    }

    @Generated
    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    @Generated
    public void setSyncedTableCount(Integer syncedTableCount) {
        this.syncedTableCount = syncedTableCount;
    }

    @Generated
    public void setSkippedTableCount(Integer skippedTableCount) {
        this.skippedTableCount = skippedTableCount;
    }

    @Generated
    public void setFailedTableCount(Integer failedTableCount) {
        this.failedTableCount = failedTableCount;
    }

    @Generated
    public void setTotalSourceRows(Long totalSourceRows) {
        this.totalSourceRows = totalSourceRows;
    }

    @Generated
    public void setTotalSyncedRows(Long totalSyncedRows) {
        this.totalSyncedRows = totalSyncedRows;
    }

    @Generated
    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    @Generated
    public void setTables(List<FoamDataMigrationTableResultResponse> tables) {
        this.tables = tables;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationResultResponse)) {
            return false;
        }
        FoamDataMigrationResultResponse other = (FoamDataMigrationResultResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tableCount = this.getTableCount();
        Integer other$tableCount = other.getTableCount();
        if (this$tableCount == null ? other$tableCount != null : !((Object)this$tableCount).equals(other$tableCount)) {
            return false;
        }
        Integer this$syncedTableCount = this.getSyncedTableCount();
        Integer other$syncedTableCount = other.getSyncedTableCount();
        if (this$syncedTableCount == null ? other$syncedTableCount != null : !((Object)this$syncedTableCount).equals(other$syncedTableCount)) {
            return false;
        }
        Integer this$skippedTableCount = this.getSkippedTableCount();
        Integer other$skippedTableCount = other.getSkippedTableCount();
        if (this$skippedTableCount == null ? other$skippedTableCount != null : !((Object)this$skippedTableCount).equals(other$skippedTableCount)) {
            return false;
        }
        Integer this$failedTableCount = this.getFailedTableCount();
        Integer other$failedTableCount = other.getFailedTableCount();
        if (this$failedTableCount == null ? other$failedTableCount != null : !((Object)this$failedTableCount).equals(other$failedTableCount)) {
            return false;
        }
        Long this$totalSourceRows = this.getTotalSourceRows();
        Long other$totalSourceRows = other.getTotalSourceRows();
        if (this$totalSourceRows == null ? other$totalSourceRows != null : !((Object)this$totalSourceRows).equals(other$totalSourceRows)) {
            return false;
        }
        Long this$totalSyncedRows = this.getTotalSyncedRows();
        Long other$totalSyncedRows = other.getTotalSyncedRows();
        if (this$totalSyncedRows == null ? other$totalSyncedRows != null : !((Object)this$totalSyncedRows).equals(other$totalSyncedRows)) {
            return false;
        }
        Long this$durationMs = this.getDurationMs();
        Long other$durationMs = other.getDurationMs();
        if (this$durationMs == null ? other$durationMs != null : !((Object)this$durationMs).equals(other$durationMs)) {
            return false;
        }
        List<FoamDataMigrationTableResultResponse> this$tables = this.getTables();
        List<FoamDataMigrationTableResultResponse> other$tables = other.getTables();
        return !(this$tables == null ? other$tables != null : !((Object)this$tables).equals(other$tables));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationResultResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tableCount = this.getTableCount();
        result = result * 59 + ($tableCount == null ? 43 : ((Object)$tableCount).hashCode());
        Integer $syncedTableCount = this.getSyncedTableCount();
        result = result * 59 + ($syncedTableCount == null ? 43 : ((Object)$syncedTableCount).hashCode());
        Integer $skippedTableCount = this.getSkippedTableCount();
        result = result * 59 + ($skippedTableCount == null ? 43 : ((Object)$skippedTableCount).hashCode());
        Integer $failedTableCount = this.getFailedTableCount();
        result = result * 59 + ($failedTableCount == null ? 43 : ((Object)$failedTableCount).hashCode());
        Long $totalSourceRows = this.getTotalSourceRows();
        result = result * 59 + ($totalSourceRows == null ? 43 : ((Object)$totalSourceRows).hashCode());
        Long $totalSyncedRows = this.getTotalSyncedRows();
        result = result * 59 + ($totalSyncedRows == null ? 43 : ((Object)$totalSyncedRows).hashCode());
        Long $durationMs = this.getDurationMs();
        result = result * 59 + ($durationMs == null ? 43 : ((Object)$durationMs).hashCode());
        List<FoamDataMigrationTableResultResponse> $tables = this.getTables();
        result = result * 59 + ($tables == null ? 43 : ((Object)$tables).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationResultResponse(tableCount=" + this.getTableCount() + ", syncedTableCount=" + this.getSyncedTableCount() + ", skippedTableCount=" + this.getSkippedTableCount() + ", failedTableCount=" + this.getFailedTableCount() + ", totalSourceRows=" + this.getTotalSourceRows() + ", totalSyncedRows=" + this.getTotalSyncedRows() + ", durationMs=" + this.getDurationMs() + ", tables=" + String.valueOf(this.getTables()) + ")";
    }
}
