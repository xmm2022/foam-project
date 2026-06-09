/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.springframework.util.StringUtils;

public final class PlaybackReportingLocationUtils {
    private static final Set<String> EMPTY_TOKENS = Set.of("0", "null", "unknown");

    private PlaybackReportingLocationUtils() {
    }

    public static LocationParts parse(String location) {
        if (!StringUtils.hasText((String)location)) {
            return new LocationParts(null, null, "\u672a\u77e5", null);
        }
        String normalized = location.trim();
        if (normalized.contains("\u5185\u7f51")) {
            return new LocationParts("\u5185\u7f51", "\u5185\u7f51", "\u5185\u7f51", null);
        }
        List<String> parts = PlaybackReportingLocationUtils.splitLocation(normalized);
        if (parts.isEmpty()) {
            return new LocationParts(null, null, "\u672a\u77e5", null);
        }
        if (parts.size() == 1) {
            return new LocationParts(null, null, parts.get(0), null);
        }
        String country = parts.get(0);
        String isp = null;
        int addressEnd = parts.size();
        String last = parts.get(parts.size() - 1);
        if (parts.size() >= 5 || parts.size() >= 3 && PlaybackReportingLocationUtils.looksLikeIsp(last)) {
            isp = last;
            addressEnd = parts.size() - 1;
        }
        List<String> addressParts = parts.subList(1, addressEnd);
        String region = null;
        String city = null;
        if (addressParts.size() == 1) {
            region = addressParts.get(0);
        } else if (addressParts.size() >= 2) {
            region = addressParts.get(addressParts.size() - 2);
            city = addressParts.get(addressParts.size() - 1);
        }
        return new LocationParts(country, region, city, isp);
    }

    private static List<String> splitLocation(String location) {
        String[] rawParts = location.replace('|', ' ').replace('/', ' ').split("\\s+");
        LinkedHashSet<String> deduplicated = new LinkedHashSet<String>();
        for (String rawPart : rawParts) {
            String part;
            String string = part = rawPart == null ? "" : rawPart.trim();
            if (!StringUtils.hasText((String)part) || EMPTY_TOKENS.contains(part.toLowerCase(Locale.ROOT))) continue;
            deduplicated.add(part);
        }
        return new ArrayList<String>(deduplicated);
    }

    private static boolean looksLikeIsp(String value) {
        String text = value == null ? "" : value.toLowerCase(Locale.ROOT);
        return text.contains("\u7535\u4fe1") || text.contains("\u8054\u901a") || text.contains("\u79fb\u52a8") || text.contains("\u94c1\u901a") || text.contains("\u5e7f\u7535") || text.contains("\u6559\u80b2\u7f51") || text.contains("\u957f\u57ce") || text.contains("\u9e4f\u535a\u58eb") || text.contains("alibaba") || text.contains("aliyun") || text.contains("tencent") || text.contains("cloudflare") || text.contains("amazon") || text.contains("aws") || text.contains("google") || text.contains("microsoft") || text.contains("azure");
    }

    public record LocationParts(String country, String region, String city, String isp) {
        public String displayName() {
            if (StringUtils.hasText((String)this.city)) {
                return this.city;
            }
            if (StringUtils.hasText((String)this.region)) {
                return this.region;
            }
            if (StringUtils.hasText((String)this.country)) {
                return this.country;
            }
            return "\u672a\u77e5";
        }
    }
}
