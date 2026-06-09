/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.license;

import lombok.Generated;

public enum LicenseProductEnum {
    PLUS("plus");

    private final String value;

    @Generated
    public String getValue() {
        return this.value;
    }

    @Generated
    private LicenseProductEnum(String value) {
        this.value = value;
    }
}
