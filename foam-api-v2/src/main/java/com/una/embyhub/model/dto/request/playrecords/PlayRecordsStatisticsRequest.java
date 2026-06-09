/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.playrecords;

import java.io.Serializable;
import lombok.Generated;

public class PlayRecordsStatisticsRequest
implements Serializable {
    @Generated
    public PlayRecordsStatisticsRequest() {
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayRecordsStatisticsRequest)) {
            return false;
        }
        PlayRecordsStatisticsRequest other = (PlayRecordsStatisticsRequest)o;
        return other.canEqual(this);
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PlayRecordsStatisticsRequest;
    }

    @Generated
    public int hashCode() {
        boolean result = true;
        return 1;
    }

    @Generated
    public String toString() {
        return "PlayRecordsStatisticsRequest()";
    }
}
