/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.http.HttpRequest
 *  cn.hutool.http.HttpResponse
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  org.apache.commons.text.StringSubstitutor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.model.dto.response.embynotifydata.NullbrResponse;
import com.una.embyhub.model.dto.response.nullbr.MovieListResponse;
import java.util.HashMap;
import lombok.Generated;
import org.apache.commons.text.StringSubstitutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class NullbrHelperUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(NullbrHelperUtils.class);
    private static final String Movie_BASE_URL = "https://api.nullbr.eu.org/movie/{tmdbId}/115";
    private static final String Episode_BASE_URL = "https://api.nullbr.eu.org/tv/{tmdbId}/115";
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;
    @Autowired
    private NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public MovieListResponse sendMovieApiRequest(String tmdbId, String type) {
        String notifyChannelValue = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("nullbr");
        if (!StringUtils.hasText((String)notifyChannelValue)) {
            log.info("nullbr\u914d\u7f6e\u672a\u5f00\u542f ,\u4e0d\u652f\u6301\u627e\u7247");
            throw new BizException(ResponseStatusEnum.NULLBR_ENABLED_ERROR);
        }
        NullbrResponse nullbrResponse = (NullbrResponse)JSONObject.parseObject((String)notifyChannelValue, NullbrResponse.class);
        String base_url = "";
        if ("movie".equals(type)) {
            base_url = Movie_BASE_URL;
        }
        if ("tv".equals(type)) {
            base_url = Episode_BASE_URL;
        }
        if (!StringUtils.hasText((String)base_url)) {
            throw new BizException(ResponseStatusEnum.NULLBR_TYPE_ERROR);
        }
        HashMap<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("tmdbId", tmdbId);
        StringSubstitutor substitutor = new StringSubstitutor(valuesMap, "{", "}");
        String replacedUrl = substitutor.replace(base_url);
        try (HttpResponse response = ((HttpRequest)((HttpRequest)HttpRequest.get((String)replacedUrl).header("X-APP-ID", nullbrResponse.getAppid())).header("X-API-KEY", nullbrResponse.getApikey())).execute();){
            if (response.isOk()) {
                MovieListResponse movieListResponse = (MovieListResponse)JSONObject.parseObject((String)response.body(), MovieListResponse.class);
                return movieListResponse;
            }
            MovieListResponse movieListResponse = new MovieListResponse();
            return movieListResponse;
        }
    }
}
