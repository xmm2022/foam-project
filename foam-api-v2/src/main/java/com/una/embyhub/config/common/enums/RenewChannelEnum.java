/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.enums;

import java.util.Arrays;

public enum RenewChannelEnum {
    ADMIN_RENEW(1, "\u7ba1\u7406\u5458\u7eed\u8d39"),
    CARD_RENEW(2, "\u5361\u5bc6\u7eed\u8d39");

    private final int code;
    private final String label;

    private RenewChannelEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    public static String resolveLabel(Integer code) {
        if (code == null) {
            return null;
        }
        return Arrays.stream(RenewChannelEnum.values()).filter(item -> item.code == code).map(RenewChannelEnum::getLabel).findFirst().orElse("\u672a\u77e5");
    }
}
