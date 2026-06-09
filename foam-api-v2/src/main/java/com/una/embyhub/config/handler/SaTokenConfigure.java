/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.interceptor.SaInterceptor
 *  cn.dev33.satoken.stp.StpUtil
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.web.servlet.HandlerInterceptor
 *  org.springframework.web.servlet.config.annotation.InterceptorRegistry
 *  org.springframework.web.servlet.config.annotation.WebMvcConfigurer
 */
package com.una.embyhub.config.handler;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SaTokenConfigure
implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor((HandlerInterceptor)new SaInterceptor(handle -> StpUtil.checkLogin())).addPathPatterns(new String[]{"/**"}).excludePathPatterns(new String[]{"/embyUser/login", "/embyUser/insertUserCard", "/tmdb/trendingAllImages", "/emby/notifier", "/license/info", "/license/status", "/license/activate", "/license/activate-file", "/embyUser/registeredUser", "/embyUser/userExist", "/embyUser/enableRegistration", "/embyUser/embyUserNameExist", "/tmdb/trendingAllImagesPopular", "/avatars/**", "/wechat/bot/**", "/embyUser/registeredByInvitation", "/sysNotice/publicExternal", "/systemConfig/isEnabled", "/systemConfig/getConfigValue", "/telegramAuth/loginSession", "/telegramAuth/checkLogin", "/telegramAuth/getBotInfo", "/telegramAuth/login"});
    }
}
