/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import java.util.Locale;
import org.springframework.util.StringUtils;

public final class EmbyUrlUtils {
    private static final String EMBY_PREFIX = "/emby";

    private EmbyUrlUtils() {
    }

    public static String buildApiUrl(String baseUrl, String path) {
        if (!StringUtils.hasText((String)baseUrl)) {
            return EmbyUrlUtils.normalizePath(path);
        }
        String base = EmbyUrlUtils.trimTrailingSlashes(baseUrl);
        String normalizedPath = EmbyUrlUtils.normalizePath(path);
        String lowerBase = base.toLowerCase(Locale.ROOT);
        String lowerPath = normalizedPath.toLowerCase(Locale.ROOT);
        if (lowerBase.endsWith(EMBY_PREFIX) && lowerPath.startsWith("/emby/")) {
            normalizedPath = normalizedPath.substring(EMBY_PREFIX.length());
        }
        return base + normalizedPath;
    }

    private static String normalizePath(String path) {
        if (!StringUtils.hasText((String)path)) {
            return "/";
        }
        return path.startsWith("/") ? path : "/" + path;
    }

    private static String trimTrailingSlashes(String value) {
        int end;
        for (end = value.length(); end > 0 && value.charAt(end - 1) == '/'; --end) {
        }
        return value.substring(0, end);
    }
}
