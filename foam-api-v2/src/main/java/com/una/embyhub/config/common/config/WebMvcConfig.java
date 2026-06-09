/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.web.servlet.config.annotation.CorsRegistry
 *  org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
 *  org.springframework.web.servlet.config.annotation.WebMvcConfigurer
 */
package com.una.embyhub.config.common.config;

import com.una.embyhub.config.license.LicenseManager;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig
implements WebMvcConfigurer {
    @Autowired
    private LicenseManager licenseManager;
    @Value(value="${foam.avatar.base-path:data/avatars}")
    private String avatarBasePath;
    @Value(value="${foam.avatar.public-path:/avatars}")
    private String avatarPublicPath;

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOriginPatterns(new String[]{"*"}).allowedMethods(new String[]{"GET", "POST", "PUT", "DELETE", "OPTIONS"}).allowCredentials(true).allowedHeaders(new String[]{"*"}).maxAge(3600L);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Object resourceLocation;
        Object handlerPath;
        Object object = handlerPath = this.avatarPublicPath.startsWith("/") ? this.avatarPublicPath : "/" + this.avatarPublicPath;
        if (!((String)handlerPath).endsWith("/")) {
            handlerPath = (String)handlerPath + "/";
        }
        if (!((String)(resourceLocation = Paths.get(this.avatarBasePath, new String[0]).toAbsolutePath().toUri().toString())).endsWith("/")) {
            resourceLocation = (String)resourceLocation + "/";
        }
        registry.addResourceHandler(new String[]{(String)handlerPath + "**"}).addResourceLocations(new String[]{resourceLocation});
    }
}
