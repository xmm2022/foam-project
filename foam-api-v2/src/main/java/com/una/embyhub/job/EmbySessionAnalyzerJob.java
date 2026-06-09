/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.core.net.Ipv4Util
 *  cn.hutool.http.HttpUtil
 *  com.baomidou.mybatisplus.core.toolkit.support.SFunction
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 *  lombok.Generated
 *  net.dreamlu.mica.ip2region.core.Ip2regionSearcher
 *  net.dreamlu.mica.ip2region.core.IpInfo
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.net.Ipv4Util;
import cn.hutool.http.HttpUtil;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.una.embyhub.component.MapSummaryCache;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.model.entity.EmbyIpLocations;
import com.una.embyhub.service.EmbyIpLocationsService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.Generated;
import net.dreamlu.mica.ip2region.core.Ip2regionSearcher;
import net.dreamlu.mica.ip2region.core.IpInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.StringUtils;

@Configuration
@EnableScheduling
public class EmbySessionAnalyzerJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbySessionAnalyzerJob.class);
    private static final Pattern IPV4_PATTERN = Pattern.compile("^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$");
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;
    @Autowired
    private EmbyIpLocationsService embyIpLocationsService;
    @Autowired
    private Ip2regionSearcher searchSearcher;
    @Autowired
    private MapSummaryCache mapSummaryCache;

    public void configureTasks() {
        log.info("\u7528\u6237ip\u7ed1\u5b9a\u5173\u7cfb\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs = this.embyInfoCacheManager.getEnabledConfigs();
        if (serverConfigs == null || serverConfigs.isEmpty()) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        int totalInserted = 0;
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig config : serverConfigs) {
            try {
                String sessionsJson = this.getEmbySessions(config);
                List<Session> sessions = this.parseSessions(sessionsJson);
                totalInserted += this.mapUserToNonPrivateIPs(sessions, config.id());
            }
            catch (Exception e) {
                log.error("\u5904\u7406\u670d\u52a1\u5668 [{}] \u4f1a\u8bdd\u4fe1\u606f\u5931\u8d25\uff1a{}", (Object)config.url(), (Object)e.getMessage());
            }
        }
        if (totalInserted > 0) {
            int finalTotalInserted = totalInserted;
            CompletableFuture.runAsync(() -> {
                log.info("\u672c\u8f6e\u65b0\u589eIP\u8bb0\u5f55 {} \u6761\uff0c\u89e6\u53d1\u5730\u56fe\u6c47\u603b\u7f13\u5b58\u5237\u65b0", (Object)finalTotalInserted);
                this.mapSummaryCache.refresh();
            });
        }
    }

    public String getEmbySessions(EmbyInfoCacheManagerUtils.EmbyServerConfig config) {
        HashMap<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("api_key", config.apiKey());
        return HttpUtil.get((String)(config.url() + "/Sessions"), paramMap);
    }

    public List<Session> parseSessions(String json) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Session>>(this){}.getType();
        return (List)gson.fromJson(json, listType);
    }

    public int mapUserToNonPrivateIPs(List<Session> sessions, Long embyInfoId) {
        if (sessions == null || sessions.isEmpty()) {
            return 0;
        }
        LinkedHashMap<String, SessionCandidate> candidates = new LinkedHashMap<String, SessionCandidate>();
        for (Session session : sessions) {
            String ip;
            if (!StringUtils.hasText((String)session.getUserName()) || !StringUtils.hasText((String)session.getRemoteEndPoint()) || !this.isIpv4(ip = this.extractIp(session.getRemoteEndPoint())) || this.isInnerIpv4(ip)) continue;
            String key = this.buildKey(session.getUserName(), session.getRemoteEndPoint());
            candidates.putIfAbsent(key, new SessionCandidate(session.getUserName(), session.getRemoteEndPoint(), session.getClient(), ip));
        }
        if (candidates.isEmpty()) {
            return 0;
        }
        Set usernames = candidates.values().stream().map(SessionCandidate::userName).collect(Collectors.toSet());
        Set remoteEndpoints = candidates.values().stream().map(SessionCandidate::remoteEndPoint).collect(Collectors.toSet());
        Set<Object> existingKeys = new HashSet();
        if (!usernames.isEmpty() && !remoteEndpoints.isEmpty()) {
            List existing = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyIpLocationsService.getBaseMapper()).select(new SFunction[]{EmbyIpLocations::getEmbyUserName, EmbyIpLocations::getIpAddress}).in(EmbyIpLocations::getEmbyUserName, usernames)).in(EmbyIpLocations::getIpAddress, remoteEndpoints)).list();
            existingKeys = existing.stream().map(item -> this.buildKey(item.getEmbyUserName(), item.getIpAddress())).collect(Collectors.toSet());
        }
        ArrayList<EmbyIpLocations> toInsert = new ArrayList<EmbyIpLocations>();
        for (SessionCandidate candidate : candidates.values()) {
            String key = this.buildKey(candidate.userName(), candidate.remoteEndPoint());
            if (existingKeys.contains(key)) continue;
            IpInfo ipInfo = this.safeMemorySearch(candidate.ip());
            EmbyIpLocations embyIpLocations = new EmbyIpLocations();
            embyIpLocations.setEmbyUserName(candidate.userName());
            embyIpLocations.setClient(candidate.client());
            embyIpLocations.setIpAddress(candidate.remoteEndPoint());
            embyIpLocations.setEmbyInfoId(embyInfoId);
            if (ipInfo != null) {
                embyIpLocations.setCity(ipInfo.getCity());
                embyIpLocations.setCountry(ipInfo.getCountry());
                embyIpLocations.setRegion(ipInfo.getProvince());
                embyIpLocations.setIsp(ipInfo.getIsp());
            }
            toInsert.add(embyIpLocations);
        }
        if (toInsert.isEmpty()) {
            return 0;
        }
        this.embyIpLocationsService.saveBatch(toInsert);
        log.info("\u65b0\u589eIP\u8bb0\u5f55\u6570\u91cf\uff1a{}", (Object)toInsert.size());
        return toInsert.size();
    }

    private IpInfo safeMemorySearch(String ip) {
        try {
            return this.searchSearcher.memorySearch(ip);
        }
        catch (Exception e) {
            log.warn("IP\u5f52\u5c5e\u5730\u67e5\u8be2\u5931\u8d25\uff0cip={}", (Object)ip);
            return null;
        }
    }

    private boolean isInnerIpv4(String ip) {
        try {
            return Ipv4Util.isInnerIP((String)ip);
        }
        catch (Exception e) {
            return false;
        }
    }

    private boolean isIpv4(String ip) {
        return StringUtils.hasText((String)ip) && IPV4_PATTERN.matcher(ip).matches();
    }

    private String extractIp(String remoteEndPoint) {
        if (!StringUtils.hasText((String)remoteEndPoint)) {
            return remoteEndPoint;
        }
        String endpoint = remoteEndPoint.trim();
        if (endpoint.startsWith("[") && endpoint.contains("]")) {
            return endpoint.substring(1, endpoint.indexOf(93));
        }
        int firstColon = endpoint.indexOf(58);
        int lastColon = endpoint.lastIndexOf(58);
        if (firstColon > 0 && firstColon == lastColon) {
            return endpoint.substring(0, firstColon);
        }
        return endpoint;
    }

    private String buildKey(String username, String remoteEndPoint) {
        return username + "|" + remoteEndPoint;
    }

    static class Session {
        private String UserName;
        private String RemoteEndPoint;
        private String Client;

        @Generated
        public Session() {
        }

        @Generated
        public String getUserName() {
            return this.UserName;
        }

        @Generated
        public String getRemoteEndPoint() {
            return this.RemoteEndPoint;
        }

        @Generated
        public String getClient() {
            return this.Client;
        }

        @Generated
        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        @Generated
        public void setRemoteEndPoint(String RemoteEndPoint) {
            this.RemoteEndPoint = RemoteEndPoint;
        }

        @Generated
        public void setClient(String Client) {
            this.Client = Client;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Session)) {
                return false;
            }
            Session other = (Session)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$UserName = this.getUserName();
            String other$UserName = other.getUserName();
            if (this$UserName == null ? other$UserName != null : !this$UserName.equals(other$UserName)) {
                return false;
            }
            String this$RemoteEndPoint = this.getRemoteEndPoint();
            String other$RemoteEndPoint = other.getRemoteEndPoint();
            if (this$RemoteEndPoint == null ? other$RemoteEndPoint != null : !this$RemoteEndPoint.equals(other$RemoteEndPoint)) {
                return false;
            }
            String this$Client = this.getClient();
            String other$Client = other.getClient();
            return !(this$Client == null ? other$Client != null : !this$Client.equals(other$Client));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof Session;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $UserName = this.getUserName();
            result = result * 59 + ($UserName == null ? 43 : $UserName.hashCode());
            String $RemoteEndPoint = this.getRemoteEndPoint();
            result = result * 59 + ($RemoteEndPoint == null ? 43 : $RemoteEndPoint.hashCode());
            String $Client = this.getClient();
            result = result * 59 + ($Client == null ? 43 : $Client.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "EmbySessionAnalyzerJob.Session(UserName=" + this.getUserName() + ", RemoteEndPoint=" + this.getRemoteEndPoint() + ", Client=" + this.getClient() + ")";
        }
    }

    private record SessionCandidate(String userName, String remoteEndPoint, String client, String ip) {
    }
}
