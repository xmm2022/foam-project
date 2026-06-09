/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.data.redis.core.StringRedisTemplate
 *  org.springframework.http.CacheControl
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.HttpStatus
 *  org.springframework.http.HttpStatusCode
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.util.MultiValueMap
 *  org.springframework.util.StringUtils
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.foam.controller;

import com.una.embyhub.foam.response.douban.FoamDoubanDiscoverResponse;
import com.una.embyhub.foam.service.FoamDoubanService;
import java.net.URI;
import java.net.URLDecoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"foam/douban"})
public class FoamDoubanController {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(FoamDoubanController.class);
    @Autowired
    private FoamDoubanService doubanService;
    @Autowired
    private RedisTemplate<String, byte[]> binaryRedisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private static final String REDIS_IMAGE_PREFIX = "foam:douban:image:v2:";
    private static final String REDIS_IMAGE_CONTENT_TYPE_SUFFIX = ":ct";
    private static final HttpClient HTTP = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL).connectTimeout(Duration.ofSeconds(10L)).build();
    private static final long CACHE_TTL_HOURS = 6L;

    @GetMapping(value={"movies"})
    public FoamDoubanDiscoverResponse discoverMovies(@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="30") int count, @RequestParam(defaultValue="U") String sort, @RequestParam(defaultValue="") String tags) {
        log.info("\u63a2\u7d22\u8c46\u74e3\u7535\u5f71: page={}, count={}, sort={}, tags={}", new Object[]{page, count, sort, tags});
        return this.doubanService.discoverMovies(page, count, sort, tags);
    }

    @GetMapping(value={"tvs"})
    public FoamDoubanDiscoverResponse discoverTvs(@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="30") int count, @RequestParam(defaultValue="U") String sort, @RequestParam(defaultValue="") String tags) {
        log.info("\u63a2\u7d22\u8c46\u74e3\u5267\u96c6: page={}, count={}, sort={}, tags={}", new Object[]{page, count, sort, tags});
        return this.doubanService.discoverTvs(page, count, sort, tags);