/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.exception;

import com.una.embyhub.model.dto.response.agent.AgentRunResponse;
import lombok.Generated;

public class AgentTaskBusyException
extends RuntimeException {
    private final AgentRunResponse response;

    public AgentTaskBusyException(AgentRunResponse response) {
        super("\u5f53\u524d\u5df2\u6709 Agent \u4efb\u52a1\u5728\u6267\u884c\uff0c\u8bf7\u7b49\u5f85\u5f53\u524d\u4efb\u52a1\u7ed3\u675f\u540e\u518d\u53d1\u8d77\u65b0\u4efb\u52a1");
        this.response = response;
    }

    @Generated
    public AgentRunResponse getResponse() {
        return this.response;
    }
}
