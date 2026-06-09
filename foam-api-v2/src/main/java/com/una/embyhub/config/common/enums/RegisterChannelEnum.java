/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.enums;

import java.util.Arrays;

public enum RegisterChannelEnum {
    ADMIN_REGISTER(1, "\u7ba1\u7406\u5458\u6ce8\u518c"),
    CARD_REGISTER(2, "\u5361\u5bc6\u6ce8\u518c"),
    INVITATION(3, "\u9080\u8bf7\u7801\u6ce8\u518c"),
    POINTS_REDEEM(4, "\u79ef\u5206\u5151\u6362"),
    USER_REGISTER(5, "\u7528\u6237\u6ce8\u518c");

    private final int code;
    private final String label;

    private RegisterChannelEnum(int code, String label) {
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
        return Arrays.stream(RegisterChannelEnum.values()).filter(item -> item.code == code).map(RegisterChannelEnum::getLabel).findFirst().orElse("\u672a\u77e5");
    }
}
