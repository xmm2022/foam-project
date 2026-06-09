/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.stp.StpUtil
 *  org.springframework.http.server.ServerHttpRequest
 *  org.springframework.http.server.ServerHttpResponse
 *  org.springframework.web.socket.WebSocketHandler
 *  org.springframework.web.socket.server.HandshakeInterceptor
 */
package com.una.embyhub.config.handler;

import cn.dev33.satoken.stp.StpUtil;
import java.util.Map;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

public class SaWebSocketInterceptor
implements HandshakeInterceptor {
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) {
        StpUtil.checkLogin();
        try {
            if (!StpUtil.hasPermission((String)"admin")) {
                throw new RuntimeException("\u6ca1\u6709WebSocket\u8fde\u63a5\u6743\u9650");
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
    }
}
