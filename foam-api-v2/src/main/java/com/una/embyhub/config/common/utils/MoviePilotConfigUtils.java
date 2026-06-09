/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSON
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import com.alibaba.fastjson2.JSON;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.model.dto.request.moviepilot.MoviePilotLoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class MoviePilotConfigUtils {
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;

    public MoviePilotLoginRequest getMoviePilotLoginRequest() {
        String configValue = this.configCacheLoaderUtils.getConfigValue("movie_pilot_config");
        if (StringUtils.hasText((String)configValue)) {
            return (MoviePilotLoginRequest)JSON.parseObject((String)configValue, MoviePilotLoginRequest.class);
        }
        return null;
    }
}
