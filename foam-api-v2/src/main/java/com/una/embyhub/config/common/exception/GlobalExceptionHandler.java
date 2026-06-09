/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.exception.NotLoginException
 *  cn.dev33.satoken.exception.NotPermissionException
 *  embyclient.ApiException
 *  jakarta.servlet.http.HttpServletRequest
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.http.HttpStatus
 *  org.springframework.validation.BindingResult
 *  org.springframework.web.HttpRequestMethodNotSupportedException
 *  org.springframework.web.bind.MethodArgumentNotValidException
 *  org.springframework.web.bind.MissingServletRequestParameterException
 *  org.springframework.web.bind.annotation.ControllerAdvice
 *  org.springframework.web.bind.annotation.ExceptionHandler
 *  org.springframework.web.bind.annotation.ResponseBody
 *  org.springframework.web.bind.annotation.ResponseStatus
 *  org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
 *  org.springframework.web.servlet.NoHandlerFoundException
 */
package com.una.embyhub.config.common.exception;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.AgentTaskBusyException;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.common.exception.MultipleServerMatchException;
import com.una.embyhub.model.dto.response.ResponseData;
import embyclient.ApiException;
import jakarta.servlet.http.HttpServletRequest;
import java.util.HashMap;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ResponseStatus(value=HttpStatus.CONFLICT)
    @ExceptionHandler(value={AgentTaskBusyException.class})
    public ResponseData<?> agentTaskBusyHandler(AgentTaskBusyException e, HttpServletRequest request) {
        if (this.isSseRequest(request)) {
            return ResponseData.failure(409, e.getMessage(), e.getResponse());
        }
        return ResponseData.failure(409, e.getMessage(), e.getResponse());
    }

    @ResponseBody
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value={Exception.class})
    public Object exceptionHandler(Exception e, HttpServletRequest request) {
        if (this.isSseRequest(request)) {
            return this.buildSseErrorEvent(e);
        }
        if (e instanceof BizException) {
            BizException bizException = (BizException)e;
            if (bizException.getCode() == null) {
                bizException.setCode(ResponseStatusEnum.BAD_REQUEST.getCode());
            }
            return ResponseData.failure(bizException.getCode(), bizException.getMessage());
        }
        if (e instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException methodArgumentNotValidException = (MethodArgumentNotValidException)e;
            HashMap map = new HashMap();
            BindingResult result = methodArgumentNotValidException.getBindingResult();
            result.getFieldErrors().forEach(item -> {
                String message = item.getDefaultMessage();
                String field = item.getField();
                map.put(field, message);
            });
            log.error("\u6570\u636e\u6821\u9a8c\u51fa\u73b0\u9519\u8bef\uff1a", (Throwable)e);
            return ResponseData.failure(ResponseStatusEnum.BAD_REQUEST, map);
        }
        if (e instanceof HttpRequestMethodNotSupportedException) {
            log.error("\u8bf7\u6c42\u65b9\u6cd5\u9519\u8bef\uff1a", (Throwable)e);
            return ResponseData.failure(ResponseStatusEnum.BAD_REQUEST.getCode(), "\u8bf7\u6c42\u65b9\u6cd5\u4e0d\u6b63\u786e");
        }
        if (e instanceof MissingServletRequestParameterException) {
            log.error("\u8bf7\u6c42\u53c2\u6570\u7f3a\u5931\uff1a", (Throwable)e);
            MissingServletRequestParameterException ex = (MissingServletRequestParameterException)e;
            return ResponseData.failure(ResponseStatusEnum.BAD_REQUEST.getCode(), "\u8bf7\u6c42\u53c2\u6570\u7f3a\u5c11: " + ex.getParameterName());
        }
        if (e instanceof MethodArgumentTypeMismatchException) {
            log.error("\u8bf7\u6c42\u53c2\u6570\u7c7b\u578b\u9519\u8bef\uff1a", (Throwable)e);
            MethodArgumentTypeMismatchException ex = (MethodArgumentTypeMismatchException)e;
            return ResponseData.failure(ResponseStatusEnum.BAD_REQUEST.getCode(), "\u8bf7\u6c42\u53c2\u6570\u7c7b\u578b\u4e0d\u6b63\u786e\uff1a" + ex.getName());
        }
        if (e instanceof NoHandlerFoundException) {
            NoHandlerFoundException ex = (NoHandlerFoundException)e;
            log.error("\u8bf7\u6c42\u5730\u5740\u4e0d\u5b58\u5728\uff1a", (Throwable)e);
            return ResponseData.failure(ResponseStatusEnum.NOT_EXIST, ex.getRequestURL());
        }
        if (e instanceof NotLoginException) {
            log.error("\u7528\u6237\u672a\u767b\u5f55\uff1a{}", (Object)e.getMessage());
            return ResponseData.failure(ResponseStatusEnum.UNAUTHORIZED, e.getMessage());
        }
        if (e instanceof ApiException) {
            e.printStackTrace();
            log.error("emby\u63a5\u53e3\u5f02\u5e38\uff1a{}", (Object)((ApiException)e).getResponseBody());
            return ResponseData.failure(ResponseStatusEnum.SYSTEM_ERROR.getCode(), ((ApiException)e).getResponseBody());
        }
        if (e instanceof IllegalArgumentException) {
            log.error("\u53c2\u6570\u9519\u8bef\uff1a{}", (Throwable)e);
            return ResponseData.failure(ResponseStatusEnum.BAD_REQUEST.getCode(), e.getMessage());
        }
        if (e.getCause() instanceof NotPermissionException) {
            log.error("\u65e0\u6743\u9650\u8bbf\u95ee\uff1a{}", (Object)e.getMessage());
            return ResponseData.failure(ResponseStatusEnum.FORBIDDEN.getCode(), "\u65e0\u6743\u9650\u8bbf\u95ee");
        }
        if (e instanceof MultipleServerMatchException) {
            MultipleServerMatchException ex = (MultipleServerMatchException)e;
            return ResponseData.failure(ResponseStatusEnum.MULTIPLE_SERVER_MATCH.getCode(), ResponseStatusEnum.MULTIPLE_SERVER_MATCH.getMsg(), ex.getResponse());
        }
        log.error("\u3010\u7cfb\u7edf\u5f02\u5e38\u3011", (Throwable)e);
        return ResponseData.failure(ResponseStatusEnum.SYSTEM_ERROR.getCode(), ResponseStatusEnum.SYSTEM_ERROR.getMsg());
    }

    private boolean isSseRequest(HttpServletRequest request) {
        if (request == null) {
            return false;
        }
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("text/event-stream")) {
            return true;
        }
        String contentType = request.getContentType();
        return contentType != null && contentType.contains("text/event-stream");
    }

    private String buildSseErrorEvent(Exception e) {
        String message;
        String string = message = e == null ? "unknown error" : e.getMessage();
        if (message == null || message.isBlank()) {
            message = ResponseStatusEnum.SYSTEM_ERROR.getMsg();
        }
        String sanitized = message.replace("\r", " ").replace("\n", " ");
        return "event: error\ndata: {\"message\":\"" + sanitized.replace("\"", "\\\"") + "\"}\n\n";
    }
}
