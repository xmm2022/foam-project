/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.scheduledtask;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Generated;

public class ScheduledTaskCronResetRequest
implements Serializable {
    @NotBlank(message="\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a") String key;

    @Generated
    public ScheduledTaskCronResetRequest() {
    }

    @Generated
    public String getKey() {
        return this.key;
    }

    @Generated
    public void setKey(String key) {
        this.key = key;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ScheduledTaskCronResetRequest)) {
            return false;
        }
        ScheduledTaskCronResetRequest other = (ScheduledTaskCronResetRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$key = this.getKey();
        String other$key = other.getKey();
        return !(this$key == null ? other$key != null : !this$key.equals(other$key));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ScheduledTaskCronResetRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $key = this.getKey();
        result = result * 59 + ($key == null ? 43 : $key.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ScheduledTaskCronResetRequest(key=" + this.getKey() + ")";
    }
}
