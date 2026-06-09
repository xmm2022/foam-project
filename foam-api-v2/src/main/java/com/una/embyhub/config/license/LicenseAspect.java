/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.ProceedingJoinPoint
 *  org.aspectj.lang.annotation.Around
 *  org.aspectj.lang.annotation.Aspect
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.license;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LicenseAspect {
    @Around(value="@within(com.una.embyhub.config.license.RequireProduct) || @annotation(com.una.embyhub.config.license.RequireProduct)")
    public Object checkLicense(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }
}
