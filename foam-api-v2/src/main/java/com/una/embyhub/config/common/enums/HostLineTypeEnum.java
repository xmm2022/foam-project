/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.enums;

import java.util.Arrays;

public enum HostLineTypeEnum {
    COMMON(0, "\u901a\u7528\u7ebf\u8def"),
    WHITELIST(1, "\u767d\u540d\u5355\u7ebf\u8def");

    private final int code;
    private final String label;

    private HostLineTypeEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    public static int normalize(Integer code) {
        return HostLineTypeEnum.WHITELIST.code == (code == null ? HostLineTypeEnum.COMMON.code : code) ? HostLineTypeEnum.WHITELIST.code : HostLineTypeEnum.COMMON.code;
    }

    public static String resolveLabel(Integer code) {
        int normalizedCode = HostLineTypeEnum.normalize(code);
        return Arrays.stream(HostLineTypeEnum.values()).filter(item -> item.code == normalizedCode).map(HostLineTypeEnum::getLabel).findFirst().orElse(HostLineTypeEnum.COMMON.label);
    }

    public static String resolveUserRoleLabel(Integer code) {
        return HostLineTypeEnum.normalize(code) == HostLineTypeEnum.WHITELIST.code ? "\u6240\u6709\u7ebf\u8def" : "\u666e\u901a\u7ebf\u8def";
    }
}
