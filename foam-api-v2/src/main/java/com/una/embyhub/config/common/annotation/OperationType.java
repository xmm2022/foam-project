/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.annotation;

public enum OperationType {
    ADD("\u65b0\u589e"),
    MODIFY("\u4fee\u6539"),
    DELETE("\u5220\u9664"),
    QUERY("\u67e5\u8be2"),
    UPLOAD("\u4e0a\u4f20"),
    DOWNLOAD("\u4e0b\u8f7d"),
    LOGIN("\u767b\u5f55"),
    LOGOUT("\u767b\u51fa"),
    AI("AI");

    private final String description;

    private OperationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
