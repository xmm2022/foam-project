/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.util.StrUtil
 *  cn.hutool.http.HttpRequest
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.core.io.ClassPathResource
 *  org.springframework.stereotype.Service
 */
package com.una.embyhub.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.FoamApiApplication;
import com.una.embyhub.model.dto.response.docker.DockerImageVersionResponse;
import com.una.embyhub.model.dto.response.docker.DockerImagesVersionResponse;
import com.una.embyhub.service.DockerImageService;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class DockerImageServiceImpl
implements DockerImageService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(DockerImageServiceImpl.class);
    private static final String BACKEND_IMAGE = "ciwei123321/foam-api-v2";
    private static final String FRONTEND_IMAGE = "ciwei123321/foam-web";
    private static final String UNKNOWN_VERSION = "\u672a\u77e5";
    @Value(value="${foam.current-backend-version:}")
    private String configuredBackendVersion;
    @Value(value="${foam.current-frontend-version:}")
    private String configuredFrontendVersion;

    @Override
    public DockerImagesVersionResponse getDockerImagesVersion() {
        String backendCurrentVersion = this.resolveBackendVersion();
        String frontendCurrentVersion = this.resolveFrontendVersion();
        DockerImageVersionResponse backend = this.buildResponse(BACKEND_IMAGE, backendCurrentVersion);
        DockerImageVersionResponse frontend = this.buildResponse(FRONTEND_IMAGE, frontendCurrentVersion);
        return new DockerImagesVersionResponse(backend, frontend);
    }

    private DockerImageVersionResponse buildResponse(String image, String currentVersion) {
        DockerImageVersionResponse response = new DockerImageVersionResponse();
        response.setImage(image);
        response.setCurrentVersion(StrUtil.blankToDefault((CharSequence)currentVersion, (String)UNKNOWN_VERSION));
        response.setLatestVersion(this.fetchLatestTag(image));
        return response;
    }

    private String resolveBackendVersion() {
        if (StrUtil.isNotBlank((CharSequence)this.configuredBackendVersion)) {
            return this.configuredBackendVersion;
        }
        String implementationVersion = FoamApiApplication.class.getPackage().getImplementationVersion();
        if (StrUtil.isNotBlank((CharSequence)implementationVersion)) {
            return implementationVersion;
        }
        String pomVersion = this.readPomPropertiesVersion();
        if (StrUtil.isNotBlank((CharSequence)pomVersion)) {
            return pomVersion;
        }
        return UNKNOWN_VERSION;
    }

    private String resolveFrontendVersion() {
        if (StrUtil.isNotBlank((CharSequence)this.configuredFrontendVersion)) {
            return this.configuredFrontendVersion;
        }
        return UNKNOWN_VERSION;
    }

    private String readPomPropertiesVersion() {
        String string;
        block9: {
            ClassPathResource resource = new ClassPathResource("META-INF/maven/com.una/foam-api-v2/pom.properties");
            if (!resource.exists()) {
                return "";
            }
            InputStream inputStream = resource.getInputStream();
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                string = properties.getProperty("version", "");
                if (inputStream == null) break block9;