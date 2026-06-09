/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.exception;

import com.una.embyhub.model.dto.response.embyuser.LoginMultipleServerResponse;
import lombok.Generated;

public class MultipleServerMatchException
extends RuntimeException {
    private final LoginMultipleServerResponse response;

    public MultipleServerMatchException(LoginMultipleServerResponse response) {
        super("\u7528\u6237\u5b58\u5728\u4e8e\u591a\u4e2a\u670d\u52a1\u5668\uff0c\u8bf7\u9009\u62e9\u670d\u52a1\u5668\u767b\u5f55");
        this.response = response;
    }

    @Generated
    public LoginMultipleServerResponse getResponse() {
        return this.response;
    }
}
