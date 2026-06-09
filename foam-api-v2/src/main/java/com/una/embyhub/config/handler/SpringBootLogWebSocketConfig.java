/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.web.socket.WebSocketHandler
 *  org.springframework.web.socket.config.annotation.EnableWebSocket
 *  org.springframework.web.socket.config.annotation.WebSocketConfigurer
 *  org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
 *  org.springframework.web.socket.server.HandshakeInterceptor
 */
package com.una.embyhub.config.handler;

import com.una.embyhub.config.handler.SaWebSocketInterceptor;
import com.una.embyhub.config.handler.SpringBootLogWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Configuration
@EnableWebSocket
public class SpringBootLogWebSocketConfig
implements WebSocketConfigurer {
    private final SpringBootLogWebSocketHandler springBootLogWebSocketHandler;

    public SpringBootLogWebSocketConfig(SpringBootLogWebSocketHandler springBootLogWebSocketHandler) {
        this.springBootLogWebSocketHandler = springBootLogWebSocketHandler;
    }

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler((WebSocketHandler)this.springBootLogWebSocketHandler, new String[]{"/ws/docker/logs"}).addInterceptors(new HandshakeInterceptor[]{new SaWebSocketInterceptor()}).setAllowedOrigins(new String[]{"*"});
    }
}
