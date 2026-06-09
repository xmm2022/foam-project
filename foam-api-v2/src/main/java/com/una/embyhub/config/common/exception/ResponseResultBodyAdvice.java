/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  jakarta.annotation.Resource
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.core.MethodParameter
 *  org.springframework.http.MediaType
 *  org.springframework.http.converter.HttpMessageConverter
 *  org.springframework.http.server.ServerHttpRequest
 *  org.springframework.http.server.ServerHttpResponse
 *  org.springframework.web.bind.annotation.RestControllerAdvice
 *  org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 */
package com.una.embyhub.config.common.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.una.embyhub.model.dto.response.ResponseData;
import jakarta.annotation.Resource;
import java.util.Arrays;
import java.util.Objects;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestControllerAdvice
public class ResponseResultBodyAdvice
implements ResponseBodyAdvice<Object> {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(ResponseResultBodyAdvice.class);
    @Resource
    private ObjectMapper objectMapper;
    private static final String[] EXCLUDED_PATHS = new String[]{"/wechat/bot", "/wechat-ip/qrcode", "/douban/image", "/playRecords/ranking/image", "/embyUser/uploadAvatar", "/embyUser/userDiff", "/embyUser/exportUserDiffExcel"};

    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        Class returnClass = returnType.getParameterType();
        if (body instanceof SseEmitter || SseEmitter.class.isAssignableFrom(returnClass) || selectedContentType != null && MediaType.TEXT_EVENT_STREAM.includes(selectedContentType)) {
            return body;
        }
        String path = request.getURI().getPath();
        if (path != null && path.contains("/rose/qr/") && path.endsWith("/image")) {
            return body;
        }
        if (path != null) {
            if (Arrays.stream(EXCLUDED_PATHS).anyMatch(path::contains)) {
                return body;
            }
        }
        if (body instanceof String || Objects.equals(returnClass, String.class)) {
            String value = this.objectMapper.writeValueAsString(ResponseData.success(body));
            return value;
        }
        if (body instanceof ResponseData) {
            return body;
        }
        return ResponseData.success(body);
    }
}
