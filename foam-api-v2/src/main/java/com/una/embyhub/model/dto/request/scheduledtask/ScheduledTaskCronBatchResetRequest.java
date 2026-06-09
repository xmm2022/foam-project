/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotEmpty
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.scheduledtask;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class ScheduledTaskCronBatchResetRequest
implements Serializable {
    @NotEmpty(message="\u4efb\u52a1\u6807\u8bc6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotEmpty(message="\u4efb\u52a1\u6807\u8bc6\u5217\u8868\u4e0d\u80fd\u4e3a\u7a7a") List<@NotBlank(message="\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a") String> keys;

    @Generated
    public ScheduledTaskCronBatchResetRequest() {
    }

    @Generated
    public List<@NotBlank(message="\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a") String> getKeys() {
        return this.keys;
    }

    @Generated
    public void setKeys(List<@NotBlank(message="\u4efb\u52a1\u6807\u8bc6\u4e0d\u80fd\u4e3a\u7a7a") String> keys) {
        this.keys = keys;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ScheduledTaskCronBatchResetRequest)) {
            return false;
        }
        ScheduledTaskCronBatchResetRequest other = (ScheduledTaskCronBatchResetRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<String> this$keys = this.getKeys();
        List<String> other$keys = other.getKeys();
        return !(this$keys == null ? other$keys != null : !((Object)this$keys).equals(other$keys));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ScheduledTaskCronBatchResetRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<String> $keys = this.getKeys();
        result = result * 59 + ($keys == null ? 43 : ((Object)$keys).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ScheduledTaskCronBatchResetRequest(keys=" + String.valueOf(this.getKeys()) + ")";
    }
}
