/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.una.embyhub.util;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoubanUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(DoubanUtils.class);
    private static final String API_SECRET_KEY = "bf7dddc7c9cfe6f7";

    public static String sign(String url, String ts, String method) {
        try {
            String path = URI.create(url).getPath();
            String encodedPath = URLEncoder.encode(path, StandardCharsets.UTF_8).replace("+", "%20");
            String raw = method.toUpperCase() + "&" + encodedPath + "&" + ts;
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(API_SECRET_KEY.getBytes(StandardCharsets.UTF_8), "HmacSHA1"));
            byte[] digest = mac.doFinal(raw.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(digest);
        }
        catch (Exception e) {
            log.error("Failed to sign Douban request", (Throwable)e);
            throw new RuntimeException("Failed to sign Douban request", e);
        }
    }
}
