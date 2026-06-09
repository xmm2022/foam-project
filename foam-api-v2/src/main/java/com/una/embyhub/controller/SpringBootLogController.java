/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ch.qos.logback.classic.Level
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  lombok.Generated
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 */
package com.una.embyhub.controller;

import ch.qos.logback.classic.Level;
import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.handler.SpringBootLogWebSocketHandler;
import java.util.Locale;
import lombok.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping(value={"springboot/logs"})
@SaCheckPermission(value={"admin"})
public class SpringBootLogController {
    private final SpringBootLogWebSocketHandler springBootLogWebSocketHandler;

    @GetMapping(value={"/stream"}, produces={"text/event-stream"})
    public SseEmitter stream(@RequestParam(value="level", defaultValue="INFO") String level, @RequestParam(value="historyLimit", defaultValue="500") Integer historyLimit) {
        Level logLevel = Level.toLevel((String)level.toUpperCase(Locale.ROOT), (Level)Level.INFO);
        return this.springBootLogWebSocketHandler.createSseEmitter(logLevel, historyLimit);
    }

    @Generated
    public SpringBootLogController(SpringBootLogWebSocketHandler springBootLogWebSocketHandler) {
        this.springBootLogWebSocketHandler = springBootLogWebSocketHandler;
    }
}