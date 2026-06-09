/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.foammigration;

import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationResultResponse;
import java.io.Serializable;
import lombok.Generated;

public class FoamDataMigrationProgressResponse
implements Serializable {
    private String jobId;
    private String status;
    private String stage;
    private Integer percent;
    private Integer totalTables;
    private Integer processedTables;
    private Integer currentTableIndex;
    private Integer syncedTableCount;
    private Integer skippedTableCount;
    private Integer failedTableCount;
    private String currentTable;
    private Long currentTableSourceRows;
    private Long currentTableSyncedRows;
    private Long totalSyncedRows;
    private Long durationMs;
    private String message;
    private FoamDataMigrationResultResponse result;

    @Generated
    public FoamDataMigrationProgressResponse() {
    }

    @Generated
    public String getJobId() {
        return this.jobId;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getStage() {
        return this.stage;
    }

    @Generated
    public Integer getPercent() {
        return this.percent;
    }

    @Generated
    public Integer getTotalTables() {
        return this.totalTables;
    }

    @Generated
    public Integer getProcessedTables() {
        return this.processedTables;
    }

    @Generated
    public Integer getCurrentTableIndex() {
        return this.currentTableIndex;
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
    public String getCurrentTable() {
        return this.currentTable;
    }

    @Generated
    public Long getCurrentTableSourceRows() {
        return this.currentTableSourceRows;
    }

    @Generated
    public Long getCurrentTableSyncedRows() {
        return this.currentTableSyncedRows;
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
    public String getMessage() {
        return this.message;
    }

    @Generated
    public FoamDataMigrationResultResponse getResult() {
        return this.result;
    }

    @Generated
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setStage(String stage) {
        this.stage = stage;
    }

    @Generated
    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    @Generated
    public void setTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
    }

    @Generated
    public void setProcessedTables(Integer processedTables) {
        this.processedTables = processedTables;
    }

    @Generated
    public void setCurrentTableIndex(Integer currentTableIndex) {
        this.currentTableIndex = currentTableIndex;
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
    public void setCurrentTable(String currentTable) {
        this.currentTable = currentTable;
    }

    @Generated
    public void setCurrentTableSourceRows(Long currentTableSourceRows) {
        this.currentTableSourceRows = currentTableSourceRows;
    }

    @Generated
    public void setCurrentTableSyncedRows(Long currentTableSyncedRows) {
        this.currentTableSyncedRows = currentTableSyncedRows;
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
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public void setResult(FoamDataMigrationResultResponse result) {
        this.result = result;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationProgressResponse)) {
            return false;
        }
        FoamDataMigrationProgressResponse other = (FoamDataMigrationProgressResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$percent = this.getPercent();
        Integer other$percent = other.getPercent();
        if (this$percent == null ? other$percent != null : !((Object)this$percent).equals(other$percent)) {
            return false;
        }
        Integer this$totalTables = this.getTotalTables();
        Integer other$totalTables = other.getTotalTables();
        if (this$totalTables == null ? other$totalTables != null : !((Object)this$totalTables).equals(other$totalTables)) {
            return false;
        }
        Integer this$processedTables = this.getProcessedTables();
        Integer other$processedTables = other.getProcessedTables();
        if (this$processedTables == null ? other$processedTables != null : !((Object)this$processedTables).equals(other$processedTables)) {
            return false;
        }
        Integer this$currentTableIndex = this.getCurrentTableIndex();
        Integer other$currentTableIndex = other.getCurrentTableIndex();
        if (this$currentTableIndex == null ? other$currentTableIndex != null : !((Object)this$currentTableIndex).equals(other$currentTableIndex)) {
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
        Long this$currentTableSourceRows = this.getCurrentTableSourceRows();
        Long other$currentTableSourceRows = other.getCurrentTableSourceRows();
        if (this$currentTableSourceRows == null ? other$currentTableSourceRows != null : !((Object)this$currentTableSourceRows).equals(other$currentTableSourceRows)) {
            return false;
        }
        Long this$currentTableSyncedRows = this.getCurrentTableSyncedRows();
        Long other$currentTableSyncedRows = other.getCurrentTableSyncedRows();
        if (this$currentTableSyncedRows == null ? other$currentTableSyncedRows != null : !((Object)this$currentTableSyncedRows).equals(other$currentTableSyncedRows)) {
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
        String this$jobId = this.getJobId();
        String other$jobId = other.getJobId();
        if (this$jobId == null ? other$jobId != null : !this$jobId.equals(other$jobId)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$stage = this.getStage();
        String other$stage = other.getStage();
        if (this$stage == null ? other$stage != null : !this$stage.equals(other$stage)) {
            return false;
        }
        String this$currentTable = this.getCurrentTable();
        String other$currentTable = other.getCurrentTable();
        if (this$currentTable == null ? other$currentTable != null : !this$currentTable.equals(other$currentTable)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        FoamDataMigrationResultResponse this$result = this.getResult();
        FoamDataMigrationResultResponse other$result = other.getResult();
        return !(this$result == null ? other$result != null : !((Object)this$result).equals(other$result));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationProgressResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $percent = this.getPercent();
        result = result * 59 + ($percent == null ? 43 : ((Object)$percent).hashCode());
        Integer $totalTables = this.getTotalTables();
        result = result * 59 + ($totalTables == null ? 43 : ((Object)$totalTables).hashCode());
        Integer $processedTables = this.getProcessedTables();
        result = result * 59 + ($processedTables == null ? 43 : ((Object)$processedTables).hashCode());
        Integer $currentTableIndex = this.getCurrentTableIndex();
        result = result * 59 + ($currentTableIndex == null ? 43 : ((Object)$currentTableIndex).hashCode());
        Integer $syncedTableCount = this.getSyncedTableCount();
        result = result * 59 + ($syncedTableCount == null ? 43 : ((Object)$syncedTableCount).hashCode());
        Integer $skippedTableCount = this.getSkippedTableCount();
        result = result * 59 + ($skippedTableCount == null ? 43 : ((Object)$skippedTableCount).hashCode());
        Integer $failedTableCount = this.getFailedTableCount();
        result = result * 59 + ($failedTableCount == null ? 43 : ((Object)$failedTableCount).hashCode());
        Long $currentTableSourceRows = this.getCurrentTableSourceRows();
        result = result * 59 + ($currentTableSourceRows == null ? 43 : ((Object)$currentTableSourceRows).hashCode());
        Long $currentTableSyncedRows = this.getCurrentTableSyncedRows();
        result = result * 59 + ($currentTableSyncedRows == null ? 43 : ((Object)$currentTableSyncedRows).hashCode());
        Long $totalSyncedRows = this.getTotalSyncedRows();
        result = result * 59 + ($totalSyncedRows == null ? 43 : ((Object)$totalSyncedRows).hashCode());
        Long $durationMs = this.getDurationMs();
        result = result * 59 + ($durationMs == null ? 43 : ((Object)$durationMs).hashCode());
        String $jobId = this.getJobId();
        result = result * 59 + ($jobId == null ? 43 : $jobId.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $stage = this.getStage();
        result = result * 59 + ($stage == null ? 43 : $stage.hashCode());
        String $currentTable = this.getCurrentTable();
        result = result * 59 + ($currentTable == null ? 43 : $currentTable.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        FoamDataMigrationResultResponse $result = this.getResult();
        result = result * 59 + ($result == null ? 43 : ((Object)$result).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationProgressResponse(jobId=" + this.getJobId() + ", status=" + this.getStatus() + ", stage=" + this.getStage() + ", percent=" + this.getPercent() + ", totalTables=" + this.getTotalTables() + ", processedTables=" + this.getProcessedTables() + ", currentTableIndex=" + this.getCurrentTableIndex() + ", syncedTableCount=" + this.getSyncedTableCount() + ", skippedTableCount=" + this.getSkippedTableCount() + ", failedTableCount=" + this.getFailedTableCount() + ", currentTable=" + this.getCurrentTable() + ", currentTableSourceRows=" + this.getCurrentTableSourceRows() + ", currentTableSyncedRows=" + this.getCurrentTableSyncedRows() + ", totalSyncedRows=" + this.getTotalSyncedRows() + ", durationMs=" + this.getDurationMs() + ", message=" + this.getMessage() + ", result=" + String.valueOf(this.getResult()) + ")";
    }
}
