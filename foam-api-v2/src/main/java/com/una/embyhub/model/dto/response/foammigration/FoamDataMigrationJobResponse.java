/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.foammigration;

import com.una.embyhub.model.dto.response.foammigration.FoamDataMigrationProgressResponse;
import java.io.Serializable;
import lombok.Generated;

public class FoamDataMigrationJobResponse
implements Serializable {
    private String jobId;
    private FoamDataMigrationProgressResponse progress;

    @Generated
    public FoamDataMigrationJobResponse() {
    }

    @Generated
    public String getJobId() {
        return this.jobId;
    }

    @Generated
    public FoamDataMigrationProgressResponse getProgress() {
        return this.progress;
    }

    @Generated
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Generated
    public void setProgress(FoamDataMigrationProgressResponse progress) {
        this.progress = progress;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationJobResponse)) {
            return false;
        }
        FoamDataMigrationJobResponse other = (FoamDataMigrationJobResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$jobId = this.getJobId();
        String other$jobId = other.getJobId();
        if (this$jobId == null ? other$jobId != null : !this$jobId.equals(other$jobId)) {
            return false;
        }
        FoamDataMigrationProgressResponse this$progress = this.getProgress();
        FoamDataMigrationProgressResponse other$progress = other.getProgress();
        return !(this$progress == null ? other$progress != null : !((Object)this$progress).equals(other$progress));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationJobResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $jobId = this.getJobId();
        result = result * 59 + ($jobId == null ? 43 : $jobId.hashCode());
        FoamDataMigrationProgressResponse $progress = this.getProgress();
        result = result * 59 + ($progress == null ? 43 : ((Object)$progress).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationJobResponse(jobId=" + this.getJobId() + ", progress=" + String.valueOf(this.getProgress()) + ")";
    }
}
