/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.http.HttpResponse
 *  cn.hutool.http.HttpUtil
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.common.utils;

import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.model.dto.response.emby.EmbyTmdbResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class ExpiringGuavaCacheUtils<K, V> {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(ExpiringGuavaCacheUtils.class);
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;
    private static final String EMBY_DATA_KEY = "EMBY_DATA_KEY";
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public List<EmbyTmdbResponse> getEmbyTmdbResponse() {
        Object cachedObj = this.redisTemplate.opsForValue().get((Object)EMBY_DATA_KEY);
        if (cachedObj != null && cachedObj instanceof List) {
            return (List)cachedObj;
        }
        log.info("\u7f13\u5b58\u672a\u547d\u4e2d\uff0c\u8c03\u7528 Emby /Items \u5168\u91cf\u63a5\u53e3\u62c9\u53d6\u6570\u636e");
        EmbyInfoCacheManagerUtils.EmbyServerConfig config = this.embyInfoCacheManager.getRequiredConfig();
        String url = config.url() + "Items?IncludeItemTypes=Movie,Series&Recursive=true&Fields=ProviderIds&api_key=" + config.apiKey();
        HttpResponse response = HttpUtil.createGet((String)url).execute();
        if (response.getStatus() != 200) {
            log.error("\u8bf7\u6c42 Emby API \u5931\u8d25: status={}, body={}", (Object)response.getStatus(), (Object)response.body());
            return Collections.emptyList();
        }
        Map result = (Map)JSONObject.parseObject((String)response.body(), Map.class);
        List embyTmdbResponseList = JSONArray.parseArray((String)JSONObject.toJSONString(result.get("Items"), (JSONWriter.Feature[])new JSONWriter.Feature[0]), EmbyTmdbResponse.class);
        this.redisTemplate.opsForValue().set((Object)EMBY_DATA_KEY, (Object)embyTmdbResponseList, 30L, TimeUnit.MINUTES);
        return embyTmdbResponseList;
    }

    public List<EmbyTmdbResponse> getEmbyTmdbResponseByTmdbId(String tmdbId) {
        if (tmdbId == null || tmdbId.isBlank()) {
            log.warn("getEmbyTmdbResponseByTmdbId \u8c03\u7528\u65f6 tmdbId \u4e3a\u7a7a");
            return Collections.emptyList();
        }
        EmbyInfoCacheManagerUtils.EmbyServerConfig config = this.embyInfoCacheManager.getRequiredConfig();
        String providerPair = "tmdb." + tmdbId.trim();
        String encoded = URLEncoder.encode(providerPair, StandardCharsets.UTF_8);
        String url = config.url() + "Items?AnyProviderIdEquals=" + encoded + "&IncludeItemTypes=Movie,Series&Recursive=true&Fields=ProviderIds&api_key=" + config.apiKey();
        log.info("\u6839\u636e tmdbId \u67e5\u8be2 Emby\uff0curl={}", (Object)url);
        HttpResponse response = HttpUtil.createGet((String)url).execute();
        if (response.getStatus() != 200) {
            log.error("\u6839\u636e tmdbId \u67e5\u8be2 Emby API \u5931\u8d25: status={}, body={}", (Object)response.getStatus(), (Object)response.body());
            return Collections.emptyList();
        }
        Map result = (Map)JSONObject.parseObject((String)response.body(), Map.class);
        Object items = result.get("Items");
        if (items == null) {
            log.info("\u6839\u636e tmdbId={} \u672a\u5728 Emby \u4e2d\u67e5\u8be2\u5230\u6761\u76ee", (Object)tmdbId);
            return Collections.emptyList();
        }
        return JSONArray.parseArray((String)JSONObject.toJSONString(items, (JSONWriter.Feature[])new JSONWriter.Feature[0]), EmbyTmdbResponse.class);
    }
}
