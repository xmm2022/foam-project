/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.http.HttpUtil
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.context.event.EventListener
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.common.config;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.una.embyhub.config.common.config.SysOperationLogEvent;
import com.una.embyhub.model.entity.SysOperationLog;
import com.una.embyhub.service.LicenseService;
import java.util.Date;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SysOperationLogEventListener {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(SysOperationLogEventListener.class);
    private final LicenseService licenseService;
    private volatile String cachedLicenseUuid = null;

    @EventListener
    public void handleSysOperationLogEvent(SysOperationLogEvent event) {
        try {
            SysOperationLog operationLog = event.getOperationLog();
            String uuid = this.getCachedLicenseUuid();
            JSONObject json = new JSONObject();
            json.put((Object)"operationContent", (Object)operationLog.getOperationContent());
            json.put((Object)"operationType", (Object)operationLog.getOperationType());
            if (operationLog.getOperationTime() != null) {
                json.put((Object)"operationTime", (Object)DateUtil.formatDateTime((Date)operationLog.getOperationTime()));
            }
            json.put((Object)"operator", (Object)operationLog.getOperator());
            json.put((Object)"requestUrl", (Object)operationLog.getRequestUrl());
            json.put((Object)"requestMethod", (Object)operationLog.getRequestMethod());
            json.put((Object)"requestParams", (Object)operationLog.getRequestParams());
            json.put((Object)"responseResult", (Object)operationLog.getResponseResult());
            json.put((Object)"ipAddress", (Object)operationLog.getIpAddress());
            json.put((Object)"uuid", (Object)uuid);
            json.put((Object)"createUserName", (Object)(operationLog.getCreateUserName() != null ? operationLog.getCreateUserName() : operationLog.getOperator()));
            json.put((Object)"createUserId", (Object)(operationLog.getCreateUserId() != null ? operationLog.getCreateUserId() : 1L));
            String url = "http://123.207.59.154:15009/sysOperationLog/add";
            HttpUtil.post((String)url, (String)json.toJSONString(new JSONWriter.Feature[0]));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String getCachedLicenseUuid() {
        if (this.cachedLicenseUuid == null) {
            SysOperationLogEventListener sysOperationLogEventListener = this;
            synchronized (sysOperationLogEventListener) {
                if (this.cachedLicenseUuid == null) {
                    try {
                        this.cachedLicenseUuid = this.licenseService.getLicenseInfo();
                    }
                    catch (Exception e) {
                        this.cachedLicenseUuid = "unknown";
                    }
                }
            }
        }
        return this.cachedLicenseUuid;
    }

    @Generated
    public SysOperationLogEventListener(LicenseService licenseService) {
        this.licenseService = licenseService;
    }
}
