/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.util.URLUtil
 *  cn.hutool.http.HttpRequest
 *  cn.hutool.http.HttpUtil
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.CommandLineRunner
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.component;

import cn.hutool.core.util.URLUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.una.embyhub.config.common.utils.PlaybackReportingLocationUtils;
import com.una.embyhub.mapper.EmbyIpLocationsMapper;
import com.una.embyhub.model.dto.response.embyiplocations.EmbyIpLocationMapResponse;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class MapSummaryCache
implements CommandLineRunner {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MapSummaryCache.class);
    @Autowired
    private EmbyIpLocationsMapper embyIpLocationsMapper;
    private static final String NULL_GEO_VALUE = "__NULL__";
    private static final long GEO_SUCCESS_TTL_MS = TimeUnit.HOURS.toMillis(12L);
    private static final long GEO_FAILURE_TTL_MS = TimeUnit.MINUTES.toMillis(5L);
    private List<EmbyIpLocationMapResponse> cachedGlobalSummary = Collections.emptyList();
    private final ConcurrentHashMap<String, GeocodingCacheEntry> geocodingCache = new ConcurrentHashMap();
    private final ReentrantLock refreshLock = new ReentrantLock();

    public void run(String ... args) throws Exception {
        CompletableFuture.runAsync(this::refresh);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void refresh() {
        if (!this.refreshLock.tryLock()) {
            log.debug("IP\u4f4d\u7f6e\u5730\u56fe\u6c47\u603b\u7f13\u5b58\u5237\u65b0\u5df2\u5728\u6267\u884c\uff0c\u5ffd\u7565\u91cd\u590d\u89e6\u53d1");
            return;
        }
        log.info("\u6b63\u5728\u5237\u65b0 IP\u4f4d\u7f6e\u5730\u56fe\u6c47\u603b\u7f13\u5b58...");
        try {
            List<EmbyIpLocationMapResponse> list = this.embyIpLocationsMapper.selectMapSummary(null);
            if (list != null) {
                for (EmbyIpLocationMapResponse item : list) {
                    this.applyPlaybackReportingLocation(item);
                    this.processGeocoding(item);
                }
                this.cachedGlobalSummary = list;
            } else {
                this.cachedGlobalSummary = Collections.emptyList();
            }
            log.info("IP\u4f4d\u7f6e\u5730\u56fe\u6c47\u603b\u7f13\u5b58\u5237\u65b0\u5b8c\u6210\uff0c\u8bb0\u5f55\u6570: {}", (Object)this.cachedGlobalSummary.size());
        }
        catch (Exception e) {
            log.error("\u5237\u65b0 IP\u4f4d\u7f6e\u5730\u56fe\u6c47\u603b\u7f13\u5b58\u5931\u8d25", (Throwable)e);
        }
        finally {
            this.refreshLock.unlock();
        }
    }

    public List<EmbyIpLocationMapResponse> getGlobalSummary() {
        return this.cachedGlobalSummary;
    }

    private void applyPlaybackReportingLocation(EmbyIpLocationMapResponse item) {
        PlaybackReportingLocationUtils.LocationParts parts = PlaybackReportingLocationUtils.parse(item.getName());
        item.setCountry(parts.country());
        item.setRegion(parts.region());
        item.setCity(parts.city());
        item.setName(parts.displayName());
    }

    public void processGeocoding(EmbyIpLocationMapResponse item) {
        String addressName = this.constructAddressName(item);
        if (!StringUtils.hasText((String)addressName)) {
            return;
        }
        String geocodingJson = this.fetchGeocodingWithCache(addressName);
        if (StringUtils.hasText((String)geocodingJson)) {
            item.setGeocoding(geocodingJson);
        }
    }

    private String constructAddressName(EmbyIpLocationMapResponse item) {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.hasText((String)item.getCity())) {
            sb.append(item.getCity());
        } else if (StringUtils.hasText((String)item.getRegion())) {
            sb.append(item.getRegion());
        } else if (StringUtils.hasText((String)item.getName())) {
            sb.append(item.getName());
        }
        if (StringUtils.hasText((String)item.getCountry())) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(item.getCountry());
        }
        return sb.toString();
    }

    private String fetchGeocodingFromApi(String name) {
        try {
            String baseUrl = "https://geocoding-api.open-meteo.com/v1/search";
            String fullUrl = baseUrl + "?name=" + URLUtil.encode((String)name) + "&count=1&language=zh&format=json";
            return ((HttpRequest)((HttpRequest)((HttpRequest)((HttpRequest)((HttpRequest)HttpUtil.createGet((String)fullUrl).header("Accept", "*/*")).header("Accept-Language", "zh-CN,zh;q=0.9")).header("Connection", "keep-alive")).header("Accept-Encoding", "identity")).header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36")).timeout(5000).execute().body();
        }
        catch (Exception e) {
            log.error("\u8c03\u7528 Geocoding API \u5931\u8d25: name={}", (Object)name, (Object)e);
            return null;
        }
    }

    private String fetchGeocodingWithCache(String addressName) {
        long now = System.currentTimeMillis();
        GeocodingCacheEntry cached = this.geocodingCache.get(addressName);
        if (cached != null && cached.expireAt > now) {
            return NULL_GEO_VALUE.equals(cached.payload) ? null : cached.payload;
        }
        String geocodingJson = this.fetchGeocodingFromApi(addressName);
        long ttl = StringUtils.hasText((String)geocodingJson) ? GEO_SUCCESS_TTL_MS : GEO_FAILURE_TTL_MS;
        this.geocodingCache.put(addressName, new GeocodingCacheEntry(StringUtils.hasText((String)geocodingJson) ? geocodingJson : NULL_GEO_VALUE, now + ttl));
        return geocodingJson;
    }

    private record GeocodingCacheEntry(String payload, long expireAt) {
    }
}
