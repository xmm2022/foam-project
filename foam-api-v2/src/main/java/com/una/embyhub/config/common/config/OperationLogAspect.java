/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.stp.StpUtil
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  jakarta.servlet.http.HttpServletRequest
 *  org.aspectj.lang.JoinPoint
 *  org.aspectj.lang.annotation.AfterReturning
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.annotation.Pointcut
 *  org.aspectj.lang.reflect.MethodSignature
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.ApplicationEvent
 *  org.springframework.context.ApplicationEventPublisher
 *  org.springframework.stereotype.Component
 *  org.springframework.web.context.request.RequestContextHolder
 *  org.springframework.web.context.request.ServletRequestAttributes
 */
package com.una.embyhub.config.common.config;

import cn.dev33.satoken.stp.StpUtil;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.config.SysOperationLogEvent;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.SysOperationLog;
import com.una.embyhub.service.SysOperationLogService;
import jakarta.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class OperationLogAspect {
    @Autowired
    private SysOperationLogService sysOperationLogService;
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    private static final List<String> PROXY_HEADERS = Arrays.asList("X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP", "HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP", "HTTP_CLIENT_IP", "HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR", "X-Real-IP");
    private static final List<String> LOCAL_IPS = Arrays.asList("0:0:0:0:0:0:0:1", "127.0.0.1");

    @Pointcut(value="@annotation(com.una.embyhub.config.common.annotation.OperationLog)")
    public void operationLogPointcut() {
    }

    @AfterReturning(pointcut="operationLogPointcut()", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        this.handleLog(joinPoint, null, result);
    }

    private void handleLog(JoinPoint joinPoint, Exception e, Object result) {
        try {
            MethodSignature signature = (MethodSignature)joinPoint.getSignature();
            Method method = signature.getMethod();
            OperationLog operationLogAnnotation = method.getAnnotation(OperationLog.class);
            EmbyUser embyUser = new EmbyUser();
            embyUser.setEmbyUserName(OperationLogDesc.REGISTERED_USER.name());
            if (!operationLogAnnotation.value().equals((Object)OperationLogDesc.REGISTERED_USER)) {
                if (!StpUtil.isLogin()) {
                    embyUser.setEmbyUserName("\u7528\u6237\u662f\u6e38\u5ba2\u7c7b\u578b");
                } else {
                    embyUser = (EmbyUser)StpUtil.getSession().get("user");
                }
            }
            ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            SysOperationLog operationLog = new SysOperationLog();
            operationLog.setOperationContent(operationLogAnnotation.value().getDesc());
            operationLog.setOperationType(operationLogAnnotation.type().getDescription());
            operationLog.setOperationTime(new Date());
            operationLog.setOperator(embyUser.getEmbyUserName());
            operationLog.setRequestUrl(request.getRequestURI());
            operationLog.setRequestMethod(request.getMethod());
            operationLog.setRequestParams(this.getParams(joinPoint));
            operationLog.setIpAddress(OperationLogAspect.getClientIp(request));
            this.sysOperationLogService.save(operationLog);
            this.applicationEventPublisher.publishEvent((ApplicationEvent)new SysOperationLogEvent(this, operationLog));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String getParams(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            try {
                return JSONObject.toJSONString((Object)args, (JSONWriter.Feature[])new JSONWriter.Feature[0]);
            }
            catch (Exception e) {
                return Arrays.toString(args);
            }
        }
        return "";
    }

    private String getResult(Object result) {
        return JSONObject.toJSONString((Object)result, (JSONWriter.Feature[])new JSONWriter.Feature[0]);
    }

    public static String getClientIp(HttpServletRequest request) {
        for (String header : PROXY_HEADERS) {
            String[] ips;
            String ipList = request.getHeader(header);
            if (ipList == null || ipList.length() == 0 || "unknown".equalsIgnoreCase(ipList)) continue;
            for (String ip : ips = ipList.split(",")) {
                String resolvedIp;
                if ("unknown".equalsIgnoreCase(ip.trim()) || (resolvedIp = OperationLogAspect.resolveLocalIp(ip.trim())) == null) continue;
                return resolvedIp;
            }
        }
        String remoteAddr = request.getRemoteAddr();
        return OperationLogAspect.resolveLocalIp(remoteAddr);
    }

    private static String resolveLocalIp(String ip) {
        if (LOCAL_IPS.contains(ip)) {
            try {
                return InetAddress.getLocalHost().getHostAddress();
            }
            catch (UnknownHostException e) {
                return ip;
            }
        }
        return ip;
    }
}
