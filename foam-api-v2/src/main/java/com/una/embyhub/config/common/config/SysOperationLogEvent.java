/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.context.ApplicationEvent
 */
package com.una.embyhub.config.common.config;

import com.una.embyhub.model.entity.SysOperationLog;
import org.springframework.context.ApplicationEvent;

public class SysOperationLogEvent
extends ApplicationEvent {
    private final SysOperationLog operationLog;

    public SysOperationLogEvent(Object source, SysOperationLog operationLog) {
        super(source);
        this.operationLog = operationLog;
    }

    public SysOperationLog getOperationLog() {
        return this.operationLog;
    }
}
