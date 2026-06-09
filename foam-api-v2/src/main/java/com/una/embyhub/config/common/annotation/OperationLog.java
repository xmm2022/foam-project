/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.annotation;

import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface OperationLog {
    public OperationLogDesc value();

    public OperationType type() default OperationType.QUERY;
}
