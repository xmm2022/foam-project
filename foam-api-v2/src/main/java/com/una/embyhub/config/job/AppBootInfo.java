/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.boot.context.event.ApplicationStartedEvent
 *  org.springframework.context.event.EventListener
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.job;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppBootInfo {
    private static volatile long appStartedAtMs = System.currentTimeMillis();

    @EventListener(value={ApplicationStartedEvent.class})
    public void onStarted(ApplicationStartedEvent e) {
        appStartedAtMs = System.currentTimeMillis();
    }

    public static long getAppStartedAtMs() {
        return appStartedAtMs;
    }
}
