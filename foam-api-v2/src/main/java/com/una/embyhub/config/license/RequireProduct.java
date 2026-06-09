/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.license;

import com.una.embyhub.config.license.LicenseProductEnum;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD, ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
@Documented
public @interface RequireProduct {
    public LicenseProductEnum value();
}
