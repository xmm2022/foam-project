/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.http.HttpRequest
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.wechatbot;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.config.common.utils.WechatBotUtils;
import com.una.embyhub.config.common.wechatbot.WechatBotProperties;
import com.una.embyhub.config.common.wechatbot.WechatMessageParser;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserSave;
import com.una.embyhub.model.dto.response.embyuser.InsertUserResponse;
import com.una.embyhub.model.dto.response.embyuser.UserStatsResponse;
import com.una.embyhub.model.dto.response.nullbr.MovieListResponse;
import com.una.embyhub.model.dto.response.tmdb.TmdbResponse;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.service.CardSecurityManagementService;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.NullbrService;
import com.una.embyhub.service.TmdbService;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class WechatBotService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatBotService.class);
    private final TmdbService tmdbService;
    private final EmbyUserService embyUserService;
    private final CardSecurityManagementService cardSecurityManagementService;
    private final EmbyInfoService embyInfoService;
    private final NullbrService nullbrService;
    private final NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private static final int SEARCH_PAGE_SIZE = 5;
    private static final Duration SEARCH_SESSION_TTL = Duration.ofMinutes(10L);
    private static final String REDIS_KEY_PREFIX_SEARCH = "wechat:search:session:";

    public String handleMessage(String content, String fromUser) {
        if (!StringUtils.hasText((String)content)) {
            return "\u8bf7\u8f93\u5165\u6307\u4ee4\u6216\u5173\u952e\u8bcd\uff0c\u4f8b\u5982\uff1a\u641c\u7d22 \u661f\u9645\u7a7f\u8d8a";
        }
        String normalized = this.translateMenuShortcut(content.trim());
        if (normalized.startsWith("/start") || normalized.equalsIgnoreCase("help") || normalized.equals("\u5e2e\u52a9") || "WECHAT_BOT_HELP".equals(normalized)) {
            return this.buildHelpMessage();
        }
        if (normalized.startsWith("\u641c\u7d22") || normalized.toLowerCase().startsWith("search")) {
            String query = normalized.replaceFirst("(?i)\u641c\u7d22|search", "").trim();
            if (!StringUtils.hasText((String)query)) {
                return "\u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u5f71\u89c6\u540d\u79f0\uff0c\u4f8b\u5982\uff1a\u641c\u7d22 \u94f6\u6cb3\u62a4\u536b\u961f";
            }
            return this.startSearchSession(fromUser, query, 1);
        }
        if (normalized.equalsIgnoreCase("stats") || normalized.equals("\u7edf\u8ba1") || "WECHAT_BOT_STATS".equals(normalized)) {
            return this.buildStats();
        }
        if (normalized.toLowerCase().startsWith("/createuser") || normalized.startsWith("\u521b\u5efa\u7528\u6237")) {
            return this.handleCreateUser(normalized);
        }
        if ("WECHAT_BOT_CREATE_USER".equals(normalized)) {
            return this.buildCreateUserGuide();
        }
        if (normalized.toLowerCase().startsWith("/extendusers") || normalized.startsWith("\u6279\u91cf\u5ef6\u671f")) {
            return this.handleExtendUsers(normalized);
        }
        if ("WECHAT_BOT_EXTEND_USERS".equals(normalized)) {
            return this.buildExtendUserGuide();
        }
        if (normalized.toLowerCase().startsWith("/generatecards") || normalized.startsWith("\u751f\u6210\u5361\u5bc6")) {
            return this.handleGenerateCards(normalized);
        }
        if ("WECHAT_BOT_GENERATE_CARDS".equals(normalized)) {
            return this.buildGenerateCardsGuide();
        }
        if ("WECHAT_BOT_SEARCH_GUIDE".equals(normalized)) {
            return this.buildSearchGuideMessage();
        }
        if ("WECHAT_BOT_SEARCH_SAMPLE".equals(normalized)) {
            return this.searchMovie("\u94f6\u6cb3\u62a4\u536b\u961f");
        }
        return "\u672a\u8bc6\u522b\u7684\u6307\u4ee4\uff0c\u53d1\u9001 /start \u67e5\u770b\u53ef\u7528\u547d\u4ee4\u3002";
    }

    private String translateMenuShortcut(String content) {
        switch (content) {
            case "WECHAT_BOT_HELP": {
                return "/start";
            }
            case "WECHAT_BOT_STATS": {
                return "\u7edf\u8ba1";
            }
            case "WECHAT_BOT_CREATE_USER": {
                return "\u521b\u5efa\u7528\u6237";
            }
            case "WECHAT_BOT_EXTEND_USERS": {
                return "\u6279\u91cf\u5ef6\u671f";
            }
            case "WECHAT_BOT_GENERATE_CARDS": {
                return "\u751f\u6210\u5361\u5bc6";
            }
            case "WECHAT_BOT_SEARCH_GUIDE": 
            case "WECHAT_BOT_SEARCH_SAMPLE": {
                return content;
            }
        }
        return content;
    }

    private String buildHelpMessage() {
        return String.join((CharSequence)"\n", "\ud83c\udfac \u4f01\u4e1a\u5fae\u4fe1\u673a\u5668\u4eba", "", "\u53ef\u7528\u6307\u4ee4\uff08[N]\u8868\u793a\u670d\u52a1\u5668\u7f16\u53f7\uff09\uff1a", "\u2022 \u8d44\u6e90[N] <\u5173\u952e\u8bcd> \u2014\u2014 \u641c\u7d22 Emby \u8d44\u6e90\u5e93", "\u2022 \u641c\u7d22 <\u5173\u952e\u8bcd> \u2014\u2014 \u641c\u7d22 TMDB \u5f71\u89c6\u4fe1\u606f", "\u2022 \u521b\u5efa\u7528\u6237[N] <\u7528\u6237\u540d> <\u5929\u6570> <\u5907\u6ce8>", "\u2022 \u751f\u6210\u5361\u5bc6[N] <\u6570\u91cf> <\u5929\u6570>", "\u2022 \u6279\u91cf\u5ef6\u671f[N] <\u5929\u6570> [\u8fc7\u671f\u8303\u56f4]", "\u2022 \u7edf\u8ba1 \u2014\u2014 \u67e5\u770b\u7528\u6237\u72b6\u6001\u7edf\u8ba1", "", "\u70b9\u51fb\u5e94\u7528\u83dc\u5355\u67e5\u770b\u670d\u52a1\u5668\u5217\u8868");
    }

    private String buildSearchGuideMessage() {
        return String.join((CharSequence)"\n", "\u5982\u4f55\u641c\u7d22\uff1f", "1. \u70b9\u51fb\u83dc\u5355\u4e2d\u7684\u3010\u793a\u4f8b\uff1a\u94f6\u6cb3\u62a4\u536b\u961f\u3011\u5feb\u901f\u4f53\u9a8c\uff0c", "2. \u6216\u76f4\u63a5\u53d1\u9001\uff1a\u641c\u7d22 \u4f60\u60f3\u770b\u7684\u7247\u540d (\u5982 \u641c\u7d22 \u4e09\u4f53)");
    }

    public String searchMovie(String query) {
        try {
            TmdbResponse response = this.tmdbService.searchDataTelegram(query, 1);
            List results = Optional.ofNullable(response.getResults()).orElse(Collections.emptyList()).stream().limit(5L).toList();
            if (results.isEmpty()) {
                return "\u6ca1\u6709\u627e\u5230\u76f8\u5173\u7684\u5f71\u89c6\u4fe1\u606f\uff0c\u8bf7\u5c1d\u8bd5\u5176\u5b83\u5173\u952e\u8bcd\u3002";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("\ud83c\udfac \u641c\u7d22\u300c%s\u300d\n\n", query));
            for (int i = 0; i < results.size(); ++i) {
                String rating;
                TmdbResponse.Result result = (TmdbResponse.Result)results.get(i);
                String title = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
                String release = StringUtils.hasText((String)result.getReleaseDate()) ? result.getReleaseDate() : result.getFirstAirDate();
                String year = StringUtils.hasText((String)release) && release.length() >= 4 ? release.substring(0, 4) : "";
                String string = rating = result.getVoteAverage() == null ? "\u6682\u65e0" : String.valueOf(result.getVoteAverage());
                String type = "movie".equalsIgnoreCase(result.getMediaType()) ? "\u7535\u5f71" : ("tv".equalsIgnoreCase(result.getMediaType()) ? "\u5267\u96c6" : "\u5176\u4ed6");
                sb.append(String.format("%d) %s (%s) \u2b50%s | %s\n", i + 1, title, year, rating, type));
            }
            return sb.toString().trim();
        }
        catch (BizException e) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u641c\u7d22\u53d7\u9650: {}", (Object)e.getMessage());
            return e.getMessage();
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u641c\u7d22\u5931\u8d25", (Throwable)e);
            return "\u641c\u7d22\u65f6\u53d1\u751f\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\u3002";
        }
    }

    public String handleSearchInteraction(String content, String fromUser) {
        String normalized = content.trim();
        Optional<SearchSession> sessionOptional = this.getValidSession(fromUser);
        if (!sessionOptional.isPresent()) {
            return "";
        }
        SearchSession session = sessionOptional.get();
        if (this.isNextPageCommand(normalized) || this.isPrevPageCommand(normalized)) {
            int prevPage;
            int nextPage;
            if (this.isNextPageCommand(normalized) && (nextPage = Math.min(session.getTotalPages(), session.getPage() + 1)) == session.getPage()) {
                return "\u5df2\u7ecf\u662f\u6700\u540e\u4e00\u9875\u5566\uff5e";
            }
            if (this.isPrevPageCommand(normalized) && (prevPage = Math.max(1, session.getPage() - 1)) == session.getPage()) {
                return "\u5df2\u7ecf\u662f\u7b2c\u4e00\u9875\u5566\uff5e";
            }
            return "";
        }
        if (this.isCancelCommand(normalized)) {
            this.redisTemplate.delete((Object)this.buildKey(fromUser));
            return "\u5df2\u9000\u51fa\u5f53\u524d\u641c\u7d22\u4f1a\u8bdd\u3002";
        }
        if (normalized.matches("[1-5]") && !CollectionUtils.isEmpty(session.getResults())) {
            return "";
        }
        return "";
    }

    public boolean isPageNavigationCommand(String content, String fromUser) {
        if (!StringUtils.hasText((String)content)) {
            return false;
        }
        String normalized = content.trim();
        if (!this.isNextPageCommand(normalized) && !this.isPrevPageCommand(normalized)) {
            return false;
        }
        Optional<SearchSession> sessionOptional = this.getValidSession(fromUser);
        return sessionOptional.isPresent();
    }

    public List<WechatMessageParser.NewsArticle> handlePageNavigation(String content, String fromUser) {
        String normalized = content.trim();
        Optional<SearchSession> sessionOptional = this.getValidSession(fromUser);
        if (!sessionOptional.isPresent()) {
            return Collections.emptyList();
        }
        SearchSession session = sessionOptional.get();
        int newPage = session.getPage();
        if (this.isNextPageCommand(normalized)) {
            newPage = Math.min(session.getTotalPages(), session.getPage() + 1);
        } else if (this.isPrevPageCommand(normalized)) {
            newPage = Math.max(1, session.getPage() - 1);
        }
        if ("EMBY".equals(session.getSessionType())) {
            return this.searchEmbyWithImagesPage(session.getQuery(), session.getServerNumber(), newPage, fromUser);
        }
        return this.searchMovieWithImagesPage(session.getQuery(), fromUser, newPage);
    }

    public boolean isNumberSelectionCommand(String content, String fromUser) {
        if (!StringUtils.hasText((String)content)) {
            return false;
        }
        String normalized = content.trim();
        if (!normalized.matches("[1-5]")) {
            return false;
        }
        Optional<SearchSession> sessionOptional = this.getValidSession(fromUser);
        return sessionOptional.isPresent() && !CollectionUtils.isEmpty(sessionOptional.get().getResults());
    }

    public List<WechatMessageParser.NewsArticle> handleNumberSelection(String content, String fromUser) {
        String normalized = content.trim();
        Optional<SearchSession> sessionOptional = this.getValidSession(fromUser);
        if (!sessionOptional.isPresent()) {
            return Collections.emptyList();
        }
        SearchSession session = sessionOptional.get();
        int index = Integer.parseInt(normalized) - 1;
        if (index >= session.getResults().size()) {
            return Collections.emptyList();
        }
        return this.fetchNullbrDataWithImages(session.getResults().get(index));
    }

    private String startSearchSession(String fromUser, String query, int page) {
        try {
            TmdbResponse response = this.tmdbService.searchDataTelegram(query, page);
            List<TmdbResponse.Result> results = Optional.ofNullable(response.getResults()).orElse(Collections.emptyList()).stream().limit(5L).toList();
            if (results.isEmpty()) {
                return "\u6ca1\u6709\u627e\u5230\u76f8\u5173\u7684\u5f71\u89c6\u4fe1\u606f\uff0c\u8bf7\u5c1d\u8bd5\u5176\u5b83\u5173\u952e\u8bcd\u3002";
            }
            SearchSession session = new SearchSession();
            session.setQuery(query);
            session.setPage(response.getPage() == null ? page : response.getPage());
            session.setTotalPages(response.getTotalPages() == null ? page : response.getTotalPages());
            session.setResults(results);
            session.touch();
            this.saveSession(fromUser, session);
            return this.formatSearchList(session);
        }
        catch (BizException e) {
            log.warn("\u4f01\u4e1a\u5fae\u4fe1\u641c\u7d22\u53d7\u9650: {}", (Object)e.getMessage());
            return e.getMessage();
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u641c\u7d22\u5931\u8d25", (Throwable)e);
            return "\u641c\u7d22\u65f6\u53d1\u751f\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\u3002";
        }
    }

    private Optional<SearchSession> getValidSession(String fromUser) {
        SearchSession session = (SearchSession)this.redisTemplate.opsForValue().get((Object)this.buildKey(fromUser));
        if (session == null) {
            return Optional.empty();
        }
        return Optional.of(session);
    }

    public List<WechatMessageParser.NewsArticle> searchMovieWithImages(String query, String fromUser) {
        return this.searchMovieWithImagesPage(query, fromUser, 1);
    }

    public List<WechatMessageParser.NewsArticle> searchMovieWithImagesPage(String query, String fromUser, int page) {
        ArrayList<WechatMessageParser.NewsArticle> articles = new ArrayList<WechatMessageParser.NewsArticle>();
        try {
            int currentPage;
            TmdbResponse response = this.tmdbService.searchDataTelegram(query, page);
            List<TmdbResponse.Result> results = response.getResults();
            if (CollectionUtils.isEmpty(results)) {
                return articles;
            }
            int totalResultsCount = response.getTotalResults() == null ? results.size() : response.getTotalResults().intValue();
            int totalPages = response.getTotalPages() == null ? 1 : response.getTotalPages();
            int n = currentPage = response.getPage() == null ? page : response.getPage();
            if (fromUser != null) {
                List<TmdbResponse.Result> sessionResults = results.stream().limit(5L).toList();
                SearchSession session = new SearchSession();
                session.setQuery(query);
                session.setPage(currentPage);
                session.setTotalPages(totalPages);
                session.setTotalResults(totalResultsCount);
                session.setSessionType("TMDB");
                session.setResults(sessionResults);
                session.touch();
                this.saveSession(fromUser, session);
            }
            int displayCount = Math.min(results.size(), 5);
            for (int i = 0; i < displayCount; ++i) {
                String description;
                String title;
                TmdbResponse.Result result = results.get(i);
                String name = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
                String release = StringUtils.hasText((String)result.getReleaseDate()) ? result.getReleaseDate() : result.getFirstAirDate();
                String year = StringUtils.hasText((String)release) && release.length() >= 4 ? release.substring(0, 4) : "";
                String rating = result.getVoteAverage() == null ? "" : String.valueOf(result.getVoteAverage());
                String fullOverview = result.getOverview();
                if (i == 0) {
                    String pageInfo = String.format("\u603b\u6570\uff1a%d | \u7b2c %d/%d \u9875", totalResultsCount, currentPage, totalPages);
                    String navHint = totalPages > 1 ? "p\uff1a\u4e0a\u4e00\u9875 n\uff1a\u4e0b\u4e00\u9875 c\uff1a\u9000\u51fa" : "c\uff1a\u9000\u51fa";
                    String textPrompt = String.format("%s (%s) \u2b50%s\n%s\n%s", name, year, rating, pageInfo, navHint);
                    this.sendTextPrompt(fromUser, textPrompt);
                    if (displayCount == 1) {
                        title = String.format("%s (%s) \u2b50%s", name, year, rating);
                        description = StringUtils.hasText((String)fullOverview) ? fullOverview : "";
                    } else {
                        String shortOverview = "";
                        if (StringUtils.hasText((String)fullOverview)) {
                            shortOverview = fullOverview.length() > 50 ? fullOverview.substring(0, 47) + "..." : fullOverview;
                        }
                        title = String.format("1) %s (%s) \u2b50%s\n%s", name, year, rating, shortOverview);
                        description = "";
                    }
                } else {
                    String shortOverview = "";
                    if (StringUtils.hasText((String)fullOverview)) {
                        shortOverview = fullOverview.length() > 50 ? fullOverview.substring(0, 47) + "..." : fullOverview;
                    }
                    title = String.format("%d) %s (%s) \u2b50%s\n%s", i + 1, name, year, rating, shortOverview);
                    description = "";
                }
                Object picUrl = displayCount == 1 || i == 0 ? (StringUtils.hasText((String)result.getBackdropPath()) ? "https://image.tmdb.org/t/p/w780" + result.getBackdropPath() : (StringUtils.hasText((String)result.getPosterPath()) ? "https://image.tmdb.org/t/p/w500" + result.getPosterPath() : "")) : (StringUtils.hasText((String)result.getPosterPath()) ? "https://image.tmdb.org/t/p/w500" + result.getPosterPath() : (StringUtils.hasText((String)result.getBackdropPath()) ? "https://image.tmdb.org/t/p/w780" + result.getBackdropPath() : ""));
                String tmdbUrl = String.format("https://www.themoviedb.org/%s/%d", "movie".equals(result.getMediaType()) ? "movie" : "tv", result.getId());
                articles.add(new WechatMessageParser.NewsArticle(title, description, (String)picUrl, tmdbUrl));
            }
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u641c\u7d22\u5931\u8d25", (Throwable)e);
        }
        return articles;
    }

    public boolean isSearchCommand(String content) {
        if (!StringUtils.hasText((String)content)) {
            return false;
        }
        String normalized = content.trim();
        return normalized.startsWith("\u641c\u7d22") || normalized.toLowerCase().startsWith("search") || "WECHAT_BOT_SEARCH_SAMPLE".equals(normalized);
    }

    private boolean isNextPageCommand(String content) {
        return "N".equalsIgnoreCase(content) || "NEXT".equalsIgnoreCase(content);
    }

    private boolean isPrevPageCommand(String content) {
        return "P".equalsIgnoreCase(content) || "PREV".equalsIgnoreCase(content) || "PREVIOUS".equalsIgnoreCase(content);
    }

    private boolean isCancelCommand(String content) {
        return "C".equalsIgnoreCase(content) || "CANCEL".equalsIgnoreCase(content);
    }

    public String extractSearchQuery(String content) {
        if ("WECHAT_BOT_SEARCH_SAMPLE".equals(content)) {
            return "\u94f6\u6cb3\u62a4\u536b\u961f";
        }
        return content.replaceFirst("(?i)\u641c\u7d22|search", "").trim();
    }

    public boolean isEmbySearchCommand(String content) {
        if (!StringUtils.hasText((String)content)) {
            return false;
        }
        String normalized = content.trim();
        return normalized.matches("^(\u8d44\u6e90|\u641c\u5e93)\\d*.*") || "WECHAT_BOT_EMBY_SEARCH".equals(normalized);
    }

    public int extractEmbyServerNumber(String content) {
        Matcher matcher = Pattern.compile("^(\u8d44\u6e90|\u641c\u5e93)(\\d+)?").matcher(content.trim());
        if (matcher.find() && matcher.group(2) != null) {
            return Integer.parseInt(matcher.group(2));
        }
        return 1;
    }

    private int extractServerNumberFromCommand(String content, String ... prefixes) {
        for (String prefix : prefixes) {
            Matcher matcher = Pattern.compile("^" + prefix + "(\\d+)?").matcher(content.trim());
            if (!matcher.find() || matcher.group(1) == null) continue;
            return Integer.parseInt(matcher.group(1));
        }
        return 1;
    }

    private List<EmbyInfo> getAvailableServers() {
        return ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyInfoService.lambdaQuery().eq(EmbyInfo::getEnabled, (Object)1)).eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).list();
    }

    private EmbyInfo selectServer(List<EmbyInfo> servers, int serverNumber) {
        if (CollectionUtils.isEmpty(servers)) {
            return null;
        }
        int index = Math.max(0, Math.min(serverNumber - 1, servers.size() - 1));
        return servers.get(index);
    }

    private String buildServerListText() {
        List<EmbyInfo> servers = this.getAvailableServers();
        if (CollectionUtils.isEmpty(servers)) {
            return "\u26a0\ufe0f \u6682\u65e0\u53ef\u7528\u670d\u52a1\u5668";
        }
        StringBuilder sb = new StringBuilder("\ud83d\udce1 \u53ef\u7528\u670d\u52a1\u5668\uff1a\n");
        for (int i = 0; i < servers.size(); ++i) {
            sb.append(String.format("  %d. %s\n", i + 1, servers.get(i).getServerName()));
        }
        return sb.toString();
    }

    public String extractEmbySearchQuery(String content) {
        if ("WECHAT_BOT_EMBY_SEARCH".equals(content)) {
            return "";
        }
        return content.replaceFirst("^(\u8d44\u6e90|\u641c\u5e93)\\d*\\s*", "").trim();
    }

    public List<WechatMessageParser.NewsArticle> searchEmbyWithImages(String query, int serverNumber, String fromUser) {
        return this.searchEmbyWithImagesPage(query, serverNumber, 1, fromUser);
    }

    public List<WechatMessageParser.NewsArticle> searchEmbyWithImagesPage(String query, int serverNumber, int page, String fromUser) {
        try {
            List servers = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyInfoService.lambdaQuery().eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).list();
            if (CollectionUtils.isEmpty((Collection)servers)) {
                return null;
            }
            int index = Math.max(0, Math.min(serverNumber - 1, servers.size() - 1));
            EmbyInfo server = (EmbyInfo)servers.get(index);
            String baseUrl = server.getEmbyUrl();
            int startIndex = (page - 1) * 5;
            String searchUrl = baseUrl + "/emby/Users/" + server.getCopyfromuserid() + "/Items";
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("X-Emby-Token", server.getEmbyApikey());
            params.put("Recursive", "true");
            params.put("IncludeItemTypes", "Movie,Series");
            params.put("SearchTerm", query);
            params.put("Limit", String.valueOf(5));
            params.put("StartIndex", String.valueOf(startIndex));
            params.put("Fields", "Overview,CommunityRating,ProductionYear,ImageTags,BackdropImageTags");
            params.put("EnableTotalRecordCount", "true");
            String response = HttpRequest.get((String)searchUrl).form(params).timeout(4000).execute().body();
            JSONObject result = JSON.parseObject((String)response);
            JSONArray items = result.getJSONArray("Items");
            int totalRecordCount = result.getIntValue("TotalRecordCount");
            if (totalRecordCount == 0 && items != null && !items.isEmpty()) {
                int returnedCount = items.size();
                totalRecordCount = returnedCount >= 5 ? startIndex + returnedCount + 5 : startIndex + returnedCount;
            }
            int totalPages = Math.max(1, (int)Math.ceil((double)totalRecordCount / 5.0));
            ArrayList<WechatMessageParser.NewsArticle> articles = new ArrayList<WechatMessageParser.NewsArticle>();
            if (items == null || items.isEmpty()) {
                return articles;
            }
            if (fromUser != null) {
                SearchSession session = new SearchSession();
                session.setQuery(query);
                session.setPage(page);
                session.setTotalPages(totalPages);
                session.setTotalResults(totalRecordCount);
                session.setSessionType("EMBY");
                session.setServerNumber(serverNumber);
                session.touch();
                this.saveSession(fromUser, session);
            }
            int displayCount = Math.min(items.size(), 5);
            for (int i = 0; i < displayCount; ++i) {
                String description;
                String title;
                JSONObject item = items.getJSONObject(i);
                String name = item.getString("Name");
                Integer year = item.getInteger("ProductionYear");
                Double rating = item.getDouble("CommunityRating");
                String overview = item.getString("Overview");
                String itemId = item.getString("Id");
                if (i == 0) {
                    String pageInfo = String.format("\u603b\u6570\uff1a%d | \u7b2c %d/%d \u9875", totalRecordCount, page, totalPages);
                    String navHint = totalPages > 1 ? "p\uff1a\u4e0a\u4e00\u9875 n\uff1a\u4e0b\u4e00\u9875 c\uff1a\u9000\u51fa" : "c\uff1a\u9000\u51fa";
                    String textPrompt = String.format("%s (%s) \u2b50%s\n%s\n%s", name, year != null ? year : "", rating != null ? rating : "", pageInfo, navHint);
                    this.sendTextPrompt(fromUser, textPrompt);
                    if (displayCount == 1) {
                        title = String.format("%s (%s) \u2b50%s", name, year != null ? year : "", rating != null ? rating : "");
                        description = StringUtils.hasText((String)overview) ? overview : "";
                    } else {
                        String shortOverview = "";
                        if (StringUtils.hasText((String)overview)) {
                            shortOverview = overview.length() > 50 ? overview.substring(0, 47) + "..." : overview;
                        }
                        title = String.format("1) %s (%s) \u2b50%s\n%s", name, year != null ? year : "", rating != null ? rating : "", shortOverview);
                        description = "";
                    }
                } else {
                    String shortOverview = "";
                    if (StringUtils.hasText((String)overview)) {
                        shortOverview = overview.length() > 50 ? overview.substring(0, 47) + "..." : overview;
                    }
                    title = String.format("%d) %s (%s) \u2b50%s\n%s", i + 1, name, year != null ? year : "", rating != null ? rating : "", shortOverview);
                    description = "";
                }
                Object picUrl = "";
                JSONObject imageTags = item.getJSONObject("ImageTags");
                JSONArray backdropTags = item.getJSONArray("BackdropImageTags");
                if (displayCount == 1 || i == 0) {
                    if (backdropTags != null && !backdropTags.isEmpty()) {
                        picUrl = baseUrl + "/emby/Items/" + itemId + "/Images/Backdrop/0?maxWidth=780&quality=90";
                    } else if (imageTags != null && imageTags.containsKey("Primary")) {
                        picUrl = baseUrl + "/emby/Items/" + itemId + "/Images/Primary?maxWidth=500&quality=90";
                    }
                } else if (imageTags != null && imageTags.containsKey("Primary")) {
                    picUrl = baseUrl + "/emby/Items/" + itemId + "/Images/Primary?maxWidth=500&quality=90";
                } else if (backdropTags != null && !backdropTags.isEmpty()) {
                    picUrl = baseUrl + "/emby/Items/" + itemId + "/Images/Backdrop/0?maxWidth=780&quality=90";
                }
                if (StringUtils.hasText((String)picUrl)) {
                    picUrl = (String)picUrl + "&X-Emby-Token=" + server.getEmbyApikey();
                }
                String detailUrl = baseUrl + "/web/index.html#!/item?id=" + itemId + "&serverId=" + server.getEmbyServerId();
                articles.add(new WechatMessageParser.NewsArticle(title, description, (String)picUrl, detailUrl));
            }
            return articles;
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u641c\u7d22Emby\u8d44\u6e90\u5931\u8d25", (Throwable)e);
            return null;
        }
    }

    public String buildEmbySearchGuide() {
        List servers = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyInfoService.lambdaQuery().eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).list();
        StringBuilder sb = new StringBuilder();
        sb.append("\ud83c\udfac \u641c\u7d22Emby\u8d44\u6e90\u5e93\n\n");
        if (CollectionUtils.isEmpty((Collection)servers)) {
            sb.append("\u26a0\ufe0f \u6682\u65e0\u53ef\u7528\u670d\u52a1\u5668\n");
        } else {
            sb.append("\ud83d\udce1 \u53ef\u7528\u670d\u52a1\u5668\uff1a\n");
            for (int i = 0; i < servers.size(); ++i) {
                sb.append(String.format("  %d. %s\n", i + 1, ((EmbyInfo)servers.get(i)).getServerName()));
            }
            sb.append("\n");
            sb.append("\u547d\u4ee4\u683c\u5f0f\uff1a\n");
            sb.append("\u2022 \u8d44\u6e90 <\u5173\u952e\u8bcd> \u2014\u2014 \u641c\u7d22\u9ed8\u8ba4\u670d\u52a1\u5668\n");
            sb.append("\u2022 \u8d44\u6e901 <\u5173\u952e\u8bcd> \u2014\u2014 \u641c\u7d22\u670d\u52a1\u56681\n");
            sb.append("\u2022 \u641c\u5e932 <\u5173\u952e\u8bcd> \u2014\u2014 \u641c\u7d22\u670d\u52a1\u56682\n");
            sb.append("\n\u4f8b\u5982\uff1a\u8d44\u6e901 \u661f\u9645\u7a7f\u8d8a");
        }
        return sb.toString();
    }

    public String buildEmbySearchNotFound(String query) {
        return String.format("\ud83d\udd0d \u672a\u627e\u5230\u5305\u542b\u300c%s\u300d\u7684\u8d44\u6e90\u54e6\uff5e\n\n\ud83d\udca1 \u8bf7\u5c1d\u8bd5\u5176\u4ed6\u5173\u952e\u8bcd\uff0c\u6216\u68c0\u67e5\u62fc\u5199\u662f\u5426\u6b63\u786e", query);
    }

    public String buildEmbyServerError() {
        return "\ud83d\ude3f \u54ce\u5440\uff0c\u670d\u52a1\u5668\u5f00\u5c0f\u5dee\u4e86\uff5e\n\n\ud83d\udce1 \u65e0\u6cd5\u8fde\u63a5\u5230\u8d44\u6e90\u5e93\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5";
    }

    private String formatSearchList(SearchSession session) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\ud83c\udfac \u641c\u7d22\u300c%s\u300d\n\u7b2c %d / %d \u9875\n\n", session.getQuery(), session.getPage(), session.getTotalPages()));
        for (int i = 0; i < session.getResults().size(); ++i) {
            String rating;
            TmdbResponse.Result result = session.getResults().get(i);
            String title = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
            String release = StringUtils.hasText((String)result.getReleaseDate()) ? result.getReleaseDate() : result.getFirstAirDate();
            String year = StringUtils.hasText((String)release) && release.length() >= 4 ? release.substring(0, 4) : "";
            String string = rating = result.getVoteAverage() == null ? "\u6682\u65e0" : String.valueOf(result.getVoteAverage());
            String type = "movie".equalsIgnoreCase(result.getMediaType()) ? "\u7535\u5f71" : ("tv".equalsIgnoreCase(result.getMediaType()) ? "\u5267\u96c6" : "\u5176\u4ed6");
            sb.append(String.format("%d) %s (%s) \u2b50%s | %s | TMDB: %d\n", i + 1, title, year, rating, type, result.getId()));
        }
        sb.append("\n\u53d1\u9001\u6570\u5b57\u83b7\u53d6 \u8d44\u6e90\u3002\n\u53d1\u9001 N \u4e0b\u4e00\u9875\uff0cP \u4e0a\u4e00\u9875\uff0cC \u9000\u51fa\u641c\u7d22\u3002");
        return sb.toString();
    }

    public List<WechatMessageParser.NewsArticle> fetchNullbrDataWithImages(TmdbResponse.Result result) {
        ArrayList<WechatMessageParser.NewsArticle> articles = new ArrayList<WechatMessageParser.NewsArticle>();
        try {
            String picUrl;
            String year;
            String mediaType = StringUtils.hasText((String)result.getMediaType()) ? result.getMediaType() : "movie";
            MovieListResponse response = this.nullbrService.select(String.valueOf(result.getId()), mediaType);
            List items = Optional.ofNullable(response.getMovieList115DTOList()).orElse(Collections.emptyList());
            String title = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
            String release = StringUtils.hasText((String)result.getReleaseDate()) ? result.getReleaseDate() : result.getFirstAirDate();
            String string = year = StringUtils.hasText((String)release) && release.length() >= 4 ? release.substring(0, 4) : "";
            String string2 = StringUtils.hasText((String)result.getBackdropPath()) ? "https://image.tmdb.org/t/p/w780" + result.getBackdropPath() : (picUrl = StringUtils.hasText((String)result.getPosterPath()) ? "https://image.tmdb.org/t/p/w500" + result.getPosterPath() : "");
            if (items.isEmpty()) {
                String notFoundTitle = String.format("\u274c %s (%s)", title, year);
                String notFoundDesc = "\u672a\u627e\u5230\u76f8\u5173\u8d44\u6e90\uff0c\u8bf7\u5c1d\u8bd5\u5176\u4ed6\u5f71\u7247";
                String tmdbUrl = String.format("https://www.themoviedb.org/%s/%d", "movie".equals(mediaType) ? "movie" : "tv", result.getId());
                articles.add(new WechatMessageParser.NewsArticle(notFoundTitle, notFoundDesc, picUrl, tmdbUrl));
                return articles;
            }
            String headerTitle = String.format("\ud83d\udce5 %s (%s)", title, year);
            String headerDesc = String.format("\u7c7b\u578b\uff1a%s | \u5171 %d \u4e2a\u8d44\u6e90\n\u70b9\u51fb\u67e5\u770b TMDB \u8be6\u60c5", "movie".equals(mediaType) ? "\u7535\u5f71" : "\u5267\u96c6", items.size());
            String tmdbUrl = String.format("https://www.themoviedb.org/%s/%d", "movie".equals(mediaType) ? "movie" : "tv", result.getId());
            articles.add(new WechatMessageParser.NewsArticle(headerTitle, headerDesc, picUrl, tmdbUrl));
            int count = 0;
            for (MovieListResponse.MovieList115DTO item : items.stream().limit(7L).toList()) {
                StringBuilder itemTitleBuilder = new StringBuilder();
                itemTitleBuilder.append(String.format("%d. %s", ++count, item.getTitle()));
                StringBuilder specBuilder = new StringBuilder();
                if (StringUtils.hasText((String)item.getQuality())) {
                    specBuilder.append(item.getQuality());
                }
                if (StringUtils.hasText((String)item.getResolution())) {
                    if (specBuilder.length() > 0) {
                        specBuilder.append(" | ");
                    }
                    specBuilder.append(item.getResolution());
                }
                if (StringUtils.hasText((String)item.getSize())) {
                    if (specBuilder.length() > 0) {
                        specBuilder.append(" | ");
                    }
                    specBuilder.append(item.getSize());
                }
                if (specBuilder.length() > 0) {
                    itemTitleBuilder.append("\n").append((CharSequence)specBuilder);
                }
                String itemTitle = itemTitleBuilder.toString();
                String itemDesc = "";
                String itemPicUrl = StringUtils.hasText((String)result.getPosterPath()) ? "https://image.tmdb.org/t/p/w200" + result.getPosterPath() : "";
                articles.add(new WechatMessageParser.NewsArticle(itemTitle, itemDesc, itemPicUrl, item.getShareLink()));
            }
            return articles;
        }
        catch (BizException e) {
            log.warn("\u641c\u7d22\u5931\u8d25\uff1a{}", (Object)e.getMessage());
            articles.add(new WechatMessageParser.NewsArticle("\u274c \u641c\u7d22\u5931\u8d25", e.getMessage(), "", ""));
            return articles;
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2 \u8d44\u6e90\u5f02\u5e38", (Throwable)e);
            articles.add(new WechatMessageParser.NewsArticle("\u274c \u67e5\u8be2\u5931\u8d25", "\u67e5\u8be2\u8d44\u6e90\u65f6\u51fa\u9519\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5", "", ""));
            return articles;
        }
    }

    private String fetchNullbrData(TmdbResponse.Result result) {
        try {
            String mediaType = StringUtils.hasText((String)result.getMediaType()) ? result.getMediaType() : "movie";
            MovieListResponse response = this.nullbrService.select(String.valueOf(result.getId()), mediaType);
            List items = Optional.ofNullable(response.getMovieList115DTOList()).orElse(Collections.emptyList());
            if (items.isEmpty()) {
                String name = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
                return String.format("\u672a\u5728 \u641c\u7d22 \u4e2d\u627e\u5230 %s (TMDB %d) \u7684\u8d44\u6e90\u3002", name, result.getId());
            }
            String title = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("\ud83d\udce5 \u8d44\u6e90\uff1a%s\n\u7c7b\u578b\uff1a%s\nTMDB\uff1a%d\n\u9875\u7801\uff1a%d/%d\n\n", title, mediaType, result.getId(), response.getPage() == null ? 1 : response.getPage(), response.getTotalPage() == null ? 1 : response.getTotalPage()));
            int count = 1;
            for (MovieListResponse.MovieList115DTO item : items.stream().limit(5L).toList()) {
                sb.append(String.format("%d. %s [%s/%s/%s]\n\u94fe\u63a5\uff1a%s\n\n", count++, item.getTitle(), StringUtils.hasText((String)item.getQuality()) ? item.getQuality() : "-", StringUtils.hasText((String)item.getResolution()) ? item.getResolution() : "-", StringUtils.hasText((String)item.getSize()) ? item.getSize() : "-", item.getShareLink()));
            }
            return sb.toString().trim();
        }
        catch (BizException e) {
            log.warn("\u641c\u7d22\u5931\u8d25\uff1a{}", (Object)e.getMessage());
            return e.getMessage();
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2 \u8d44\u6e90\u5f02\u5e38", (Throwable)e);
            return "\u67e5\u8be2 \u8d44\u6e90\u65f6\u51fa\u9519\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\u3002";
        }
    }

    private String formatMovie(TmdbResponse.Result result) {
        String title = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
        String release = StringUtils.hasText((String)result.getReleaseDate()) ? result.getReleaseDate() : result.getFirstAirDate();
        Object overview = result.getOverview();
        if (overview != null && ((String)overview).length() > 120) {
            overview = ((String)overview).substring(0, 117) + "...";
        }
        return String.format("%s (%s)\n\u8bc4\u5206\uff1a%s\n\u7b80\u4ecb\uff1a%s", title, StringUtils.hasText((String)release) ? release : "\u672a\u77e5\u5e74\u4efd", result.getVoteAverage() == null ? "\u6682\u65e0" : result.getVoteAverage(), StringUtils.hasText((String)overview) ? overview : "\u6682\u65e0\u7b80\u4ecb");
    }

    private String handleCreateUser(String content) {
        int days;
        int serverNumber = this.extractServerNumberFromCommand(content, "/createuser", "\u521b\u5efa\u7528\u6237");
        String params = content.replaceFirst("(?i)/createuser\\d*|\u521b\u5efa\u7528\u6237\\d*", "").trim();
        String[] args = params.split("\\s+", 3);
        if (args.length < 3 || !StringUtils.hasText((String)args[0])) {
            return "\u521b\u5efa\u7528\u6237\u547d\u4ee4\u683c\u5f0f\uff1a\n\u521b\u5efa\u7528\u6237[N] <\u7528\u6237\u540d> <\u5929\u6570> <\u5907\u6ce8>\n\u793a\u4f8b\uff1a\u521b\u5efa\u7528\u62371 test 30 \u673a\u5668\u4eba\u521b\u5efa\n\n" + this.buildServerListText();
        }
        String userName = args[0];
        try {
            days = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {
            return "\u5929\u6570\u5fc5\u987b\u662f\u6570\u5b57\uff0c\u4f8b\u5982\uff1a\u521b\u5efa\u7528\u62371 test 30 \u5907\u6ce8";
        }
        if (days <= 0) {
            return "\u5929\u6570\u5fc5\u987b\u5927\u4e8e 0";
        }
        String remarks = args[2].trim();
        List<EmbyInfo> servers = this.getAvailableServers();
        EmbyInfo server = this.selectServer(servers, serverNumber);
        if (server == null) {
            return "\ud83d\ude3f \u672a\u627e\u5230\u53ef\u7528\u670d\u52a1\u5668\uff0c\u8bf7\u5148\u5728\u540e\u53f0\u914d\u7f6e\u3002";
        }
        try {
            EmbyUserSave saveRequest = new EmbyUserSave();
            saveRequest.setEmbyUserName(userName);
            saveRequest.setDay(days);
            saveRequest.setRemarks(remarks);
            saveRequest.setEmbyInfoId(server.getId());
            InsertUserResponse response = CompletableFuture.supplyAsync(() -> {
                try {
                    return this.embyUserService.insertUser(saveRequest);
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }).get(4L, TimeUnit.SECONDS);
            return String.format("\ud83c\udf89 \u7528\u6237\u521b\u5efa\u6210\u529f\uff01\n\ud83d\udc64 \u7528\u6237\u540d\uff1a%s\n\ud83d\udd11 \u5bc6\u7801\uff1a%s\n\ud83d\udcc5 \u6709\u6548\u671f\uff1a%d \u5929\n\ud83d\udce1 \u670d\u52a1\u5668\uff1a%s", userName, response.getEmbyUserPassword(), days, server.getServerName());
        }
        catch (TimeoutException e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u521b\u5efa\u7528\u6237\u8d85\u65f6", (Throwable)e);
            return "\ud83d\ude3f \u670d\u52a1\u5668\u54cd\u5e94\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
        catch (BizException e) {
            return "\u274c \u521b\u5efa\u5931\u8d25\uff1a" + e.getMessage();
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u521b\u5efa\u7528\u6237\u5931\u8d25", (Throwable)e);
            if (e.getCause() instanceof BizException) {
                return "\u274c \u521b\u5efa\u5931\u8d25\uff1a" + e.getCause().getMessage();
            }
            return "\ud83d\ude3f \u521b\u5efa\u7528\u6237\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
    }

    private String handleGenerateCards(String content) {
        int day;
        int count;
        int serverNumber = this.extractServerNumberFromCommand(content, "/generatecards", "\u751f\u6210\u5361\u5bc6");
        String params = content.replaceFirst("(?i)/generatecards\\d*|\u751f\u6210\u5361\u5bc6\\d*", "").trim();
        String[] args = params.split("\\s+");
        if (args.length < 2) {
            return "\u751f\u6210\u5361\u5bc6\u547d\u4ee4\u683c\u5f0f\uff1a\n\u751f\u6210\u5361\u5bc6[N] <\u6570\u91cf> <\u5929\u6570>\n\u793a\u4f8b\uff1a\u751f\u6210\u5361\u5bc61 10 30\n\n" + this.buildServerListText();
        }
        try {
            count = Integer.parseInt(args[0]);
            day = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {
            return "\u6570\u91cf\u548c\u5929\u6570\u90fd\u5fc5\u987b\u662f\u6570\u5b57\uff0c\u4f8b\u5982\uff1a\u751f\u6210\u5361\u5bc61 10 30";
        }
        if (count <= 0 || day <= 0) {
            return "\u6570\u91cf\u548c\u5929\u6570\u5fc5\u987b\u5927\u4e8e 0";
        }
        List<EmbyInfo> servers = this.getAvailableServers();
        EmbyInfo server = this.selectServer(servers, serverNumber);
        if (server == null) {
            return "\ud83d\ude3f \u672a\u627e\u5230\u53ef\u7528\u670d\u52a1\u5668\uff0c\u8bf7\u5148\u5728\u540e\u53f0\u914d\u7f6e\u3002";
        }
        try {
            Long serverId = server.getId();
            List cards = CompletableFuture.supplyAsync(() -> this.cardSecurityManagementService.addCardSecurityManagementList(count, day, serverId, 0)).get(4L, TimeUnit.SECONDS);
            if (CollectionUtils.isEmpty((Collection)cards)) {
                return "\ud83d\ude3f \u5361\u5bc6\u751f\u6210\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u914d\u7f6e\u3002";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("\ud83c\udfab \u6210\u529f\u751f\u6210 %d \u5f20\u5361\u5bc6\uff01\n\ud83d\udcc5 \u6709\u6548\u671f\uff1a%d \u5929\n\ud83d\udce1 \u670d\u52a1\u5668\uff1a%s\n\n", count, day, server.getServerName()));
            for (int i = 0; i < Math.min(cards.size(), 20); ++i) {
                sb.append((String)cards.get(i)).append("\n");
            }
            if (cards.size() > 20) {
                sb.append("... \u7b49\u5171 ").append(cards.size()).append(" \u5f20");
            }
            return sb.toString();
        }
        catch (TimeoutException e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u751f\u6210\u5361\u5bc6\u8d85\u65f6", (Throwable)e);
            return "\ud83d\ude3f \u670d\u52a1\u5668\u54cd\u5e94\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
        catch (BizException e) {
            return "\u274c \u751f\u6210\u5931\u8d25\uff1a" + e.getMessage();
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u751f\u6210\u5361\u5bc6\u5931\u8d25", (Throwable)e);
            if (e.getCause() instanceof BizException) {
                return "\u274c \u751f\u6210\u5931\u8d25\uff1a" + e.getCause().getMessage();
            }
            return "\ud83d\ude3f \u751f\u6210\u5361\u5bc6\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
    }

    private String handleExtendUsers(String content) {
        Integer extensionDay;
        int serverNumber = this.extractServerNumberFromCommand(content, "/extendusers", "\u6279\u91cf\u5ef6\u671f");
        String params = content.replaceFirst("(?i)/extendusers\\d*|\u6279\u91cf\u5ef6\u671f\\d*", "").trim();
        String[] args = params.split("\\s+");
        if (args.length < 1 || !StringUtils.hasText((String)args[0])) {
            return "\u6279\u91cf\u5ef6\u671f\u547d\u4ee4\u683c\u5f0f\uff1a\n\u6279\u91cf\u5ef6\u671f[N] <\u5ef6\u671f\u5929\u6570> [\u8fc7\u671f\u5929\u6570\u8303\u56f4]\n\u793a\u4f8b\uff1a\u6279\u91cf\u5ef6\u671f1 15 30\n\n" + this.buildServerListText();
        }
        Integer expiredRange = null;
        try {
            extensionDay = Integer.parseInt(args[0]);
            if (args.length > 1) {
                expiredRange = Integer.parseInt(args[1]);
            }
        }
        catch (NumberFormatException e) {
            return "\u53c2\u6570\u5fc5\u987b\u4e3a\u6570\u5b57\uff0c\u4f8b\u5982\uff1a\u6279\u91cf\u5ef6\u671f1 15 30";
        }
        if (extensionDay <= 0) {
            return "\u5ef6\u671f\u5929\u6570\u5fc5\u987b\u5927\u4e8e 0";
        }
        List<EmbyInfo> servers = this.getAvailableServers();
        EmbyInfo server = this.selectServer(servers, serverNumber);
        if (server == null) {
            return "\ud83d\ude3f \u672a\u627e\u5230\u53ef\u7528\u670d\u52a1\u5668\uff0c\u8bf7\u5148\u5728\u540e\u53f0\u914d\u7f6e\u3002";
        }
        try {
            Long serverId = server.getId();
            Integer range = expiredRange;
            Integer extension = extensionDay;
            int updated = CompletableFuture.supplyAsync(() -> this.embyUserService.extendExpiredUser(serverId, range, extension)).get(4L, TimeUnit.SECONDS);
            return String.format("\ud83c\udf89 \u5df2\u4e3a %d \u4f4d\u7528\u6237\u5ef6\u671f %d \u5929\n\ud83d\udce1 \u670d\u52a1\u5668\uff1a%s", updated, extensionDay, server.getServerName());
        }
        catch (TimeoutException e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u6279\u91cf\u5ef6\u671f\u8d85\u65f6", (Throwable)e);
            return "\ud83d\ude3f \u670d\u52a1\u5668\u54cd\u5e94\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
        catch (BizException e) {
            return "\u274c \u5ef6\u671f\u5931\u8d25\uff1a" + e.getMessage();
        }
        catch (Exception e) {
            log.error("\u4f01\u4e1a\u5fae\u4fe1\u6279\u91cf\u5ef6\u671f\u5931\u8d25", (Throwable)e);
            if (e.getCause() instanceof BizException) {
                return "\u274c \u5ef6\u671f\u5931\u8d25\uff1a" + e.getCause().getMessage();
            }
            return "\ud83d\ude3f \u6279\u91cf\u5ef6\u671f\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
    }

    private String buildCreateUserGuide() {
        return String.join((CharSequence)"\n", "\ud83d\udc64 \u521b\u5efa\u7528\u6237", "", "\u547d\u4ee4\u683c\u5f0f\uff1a\u521b\u5efa\u7528\u6237[N] <\u7528\u6237\u540d> <\u5929\u6570> <\u5907\u6ce8>", "\u793a\u4f8b\uff1a\u521b\u5efa\u7528\u62371 test 30 \u673a\u5668\u4eba\u521b\u5efa", "", this.buildServerListText());
    }

    private String buildExtendUserGuide() {
        return String.join((CharSequence)"\n", "\u23f0 \u6279\u91cf\u5ef6\u671f", "", "\u547d\u4ee4\u683c\u5f0f\uff1a\u6279\u91cf\u5ef6\u671f[N] <\u5ef6\u671f\u5929\u6570> [\u8fc7\u671f\u5929\u6570\u8303\u56f4]", "\u793a\u4f8b\uff1a\u6279\u91cf\u5ef6\u671f1 15 30", "\uff08\u5c06\u670d\u52a1\u56681\u4e2d\u8fc7\u671f\u5929\u6570\u572830\u5929\u5185\u7684\u7528\u6237\u5ef6\u671f15\u5929\uff09", "", this.buildServerListText());
    }

    private String buildGenerateCardsGuide() {
        return String.join((CharSequence)"\n", "\ud83c\udfab \u751f\u6210\u5361\u5bc6", "", "\u547d\u4ee4\u683c\u5f0f\uff1a\u751f\u6210\u5361\u5bc6[N] <\u6570\u91cf> <\u5929\u6570>", "\u793a\u4f8b\uff1a\u751f\u6210\u5361\u5bc61 10 30", "\uff08\u751f\u621010\u5f2030\u5929\u6709\u6548\u671f\u7684\u5361\u5bc6\uff09", "", this.buildServerListText());
    }

    private String buildStats() {
        try {
            UserStatsResponse stats = CompletableFuture.supplyAsync(() -> this.embyUserService.userStats()).get(4L, TimeUnit.SECONDS);
            return "\ud83d\udcca \u5f53\u524d\u7528\u6237\u7edf\u8ba1\uff1a\n" + String.format("\u2705 \u6d3b\u8dc3\uff1a%d \u4eba\n\u26d4 \u7981\u7528\uff1a%d \u4eba\n\u23f0 \u5373\u5c06\u8fc7\u671f\uff1a%d \u4eba\n\ud83d\udccb \u603b\u8ba1\uff1a%d \u4eba", stats.getActiveUserCount(), stats.getInactiveUserCount(), stats.getExpiringSoonUserCount(), stats.getAllUserCount());
        }
        catch (TimeoutException e) {
            log.error("\u67e5\u8be2\u7528\u6237\u7edf\u8ba1\u8d85\u65f6", (Throwable)e);
            return "\ud83d\ude3f \u670d\u52a1\u5668\u54cd\u5e94\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002";
        }
        catch (Exception e) {
            log.error("\u67e5\u8be2\u7528\u6237\u7edf\u8ba1\u5931\u8d25", (Throwable)e);
            return "\ud83d\ude3f \u65e0\u6cd5\u83b7\u53d6\u7528\u6237\u7edf\u8ba1\uff0c\u8bf7\u68c0\u67e5\u914d\u7f6e\u3002";
        }
    }

    private void sendTextPrompt(String toUser, String content) {
        WechatBotProperties properties;
        if (!StringUtils.hasText((String)toUser)) {
            return;
        }
        String channelValue = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("wechatBot");
        if (StringUtils.hasText((String)channelValue) && (properties = (WechatBotProperties)JSON.parseObject((String)channelValue, WechatBotProperties.class)) != null) {
            WechatBotUtils.sendMarkdownMessage(properties, content, toUser);
        }
    }

    private void saveSession(String fromUser, SearchSession session) {
        if (session != null) {
            this.redisTemplate.opsForValue().set((Object)this.buildKey(fromUser), (Object)session, SEARCH_SESSION_TTL.toSeconds(), TimeUnit.SECONDS);
        }
    }

    private String buildKey(String fromUser) {
        return REDIS_KEY_PREFIX_SEARCH + fromUser;
    }

    @Generated
    public WechatBotService(TmdbService tmdbService, EmbyUserService embyUserService, CardSecurityManagementService cardSecurityManagementService, EmbyInfoService embyInfoService, NullbrService nullbrService, NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils) {
        this.tmdbService = tmdbService;
        this.embyUserService = embyUserService;
        this.cardSecurityManagementService = cardSecurityManagementService;
        this.embyInfoService = embyInfoService;
        this.nullbrService = nullbrService;
        this.notifyChannelCacheLoaderUtils = notifyChannelCacheLoaderUtils;
    }

    public static class SearchSession
    implements Serializable {
        private String query;
        private int page;
        private int totalPages;
        private int totalResults;
        private String sessionType = "TMDB";
        private int serverNumber = 1;
        private List<TmdbResponse.Result> results = new ArrayList<TmdbResponse.Result>();
        private List<JSONObject> embyResults = new ArrayList<JSONObject>();
        private String embyBaseUrl;
        private String embyApiKey;
        private String embyServerId;
        private Instant updatedAt = Instant.now();

        public void touch() {
            this.updatedAt = Instant.now();
        }

        @Generated
        public String getQuery() {
            return this.query;
        }

        @Generated
        public int getPage() {
            return this.page;
        }

        @Generated
        public int getTotalPages() {
            return this.totalPages;
        }

        @Generated
        public int getTotalResults() {
            return this.totalResults;
        }

        @Generated
        public String getSessionType() {
            return this.sessionType;
        }

        @Generated
        public int getServerNumber() {
            return this.serverNumber;
        }

        @Generated
        public List<TmdbResponse.Result> getResults() {
            return this.results;
        }

        @Generated
        public List<JSONObject> getEmbyResults() {
            return this.embyResults;
        }

        @Generated
        public String getEmbyBaseUrl() {
            return this.embyBaseUrl;
        }

        @Generated
        public String getEmbyApiKey() {
            return this.embyApiKey;
        }

        @Generated
        public String getEmbyServerId() {
            return this.embyServerId;
        }

        @Generated
        public Instant getUpdatedAt() {
            return this.updatedAt;
        }

        @Generated
        public void setQuery(String query) {
            this.query = query;
        }

        @Generated
        public void setPage(int page) {
            this.page = page;
        }

        @Generated
        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        @Generated
        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        @Generated
        public void setSessionType(String sessionType) {
            this.sessionType = sessionType;
        }

        @Generated
        public void setServerNumber(int serverNumber) {
            this.serverNumber = serverNumber;
        }

        @Generated
        public void setResults(List<TmdbResponse.Result> results) {
            this.results = results;
        }

        @Generated
        public void setEmbyResults(List<JSONObject> embyResults) {
            this.embyResults = embyResults;
        }

        @Generated
        public void setEmbyBaseUrl(String embyBaseUrl) {
            this.embyBaseUrl = embyBaseUrl;
        }

        @Generated
        public void setEmbyApiKey(String embyApiKey) {
            this.embyApiKey = embyApiKey;
        }

        @Generated
        public void setEmbyServerId(String embyServerId) {
            this.embyServerId = embyServerId;
        }

        @Generated
        public void setUpdatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof SearchSession)) {
                return false;
            }
            SearchSession other = (SearchSession)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getPage() != other.getPage()) {
                return false;
            }
            if (this.getTotalPages() != other.getTotalPages()) {
                return false;
            }
            if (this.getTotalResults() != other.getTotalResults()) {
                return false;
            }
            if (this.getServerNumber() != other.getServerNumber()) {
                return false;
            }
            String this$query = this.getQuery();
            String other$query = other.getQuery();
            if (this$query == null ? other$query != null : !this$query.equals(other$query)) {
                return false;
            }
            String this$sessionType = this.getSessionType();
            String other$sessionType = other.getSessionType();
            if (this$sessionType == null ? other$sessionType != null : !this$sessionType.equals(other$sessionType)) {
                return false;
            }
            List<TmdbResponse.Result> this$results = this.getResults();
            List<TmdbResponse.Result> other$results = other.getResults();
            if (this$results == null ? other$results != null : !((Object)this$results).equals(other$results)) {
                return false;
            }
            List<JSONObject> this$embyResults = this.getEmbyResults();
            List<JSONObject> other$embyResults = other.getEmbyResults();
            if (this$embyResults == null ? other$embyResults != null : !((Object)this$embyResults).equals(other$embyResults)) {
                return false;
            }
            String this$embyBaseUrl = this.getEmbyBaseUrl();
            String other$embyBaseUrl = other.getEmbyBaseUrl();
            if (this$embyBaseUrl == null ? other$embyBaseUrl != null : !this$embyBaseUrl.equals(other$embyBaseUrl)) {
                return false;
            }
            String this$embyApiKey = this.getEmbyApiKey();
            String other$embyApiKey = other.getEmbyApiKey();
            if (this$embyApiKey == null ? other$embyApiKey != null : !this$embyApiKey.equals(other$embyApiKey)) {
                return false;
            }
            String this$embyServerId = this.getEmbyServerId();
            String other$embyServerId = other.getEmbyServerId();
            if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
                return false;
            }
            Instant this$updatedAt = this.getUpdatedAt();
            Instant other$updatedAt = other.getUpdatedAt();
            return !(this$updatedAt == null ? other$updatedAt != null : !((Object)this$updatedAt).equals(other$updatedAt));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof SearchSession;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getPage();
            result = result * 59 + this.getTotalPages();
            result = result * 59 + this.getTotalResults();
            result = result * 59 + this.getServerNumber();
            String $query = this.getQuery();
            result = result * 59 + ($query == null ? 43 : $query.hashCode());
            String $sessionType = this.getSessionType();
            result = result * 59 + ($sessionType == null ? 43 : $sessionType.hashCode());
            List<TmdbResponse.Result> $results = this.getResults();
            result = result * 59 + ($results == null ? 43 : ((Object)$results).hashCode());
            List<JSONObject> $embyResults = this.getEmbyResults();
            result = result * 59 + ($embyResults == null ? 43 : ((Object)$embyResults).hashCode());
            String $embyBaseUrl = this.getEmbyBaseUrl();
            result = result * 59 + ($embyBaseUrl == null ? 43 : $embyBaseUrl.hashCode());
            String $embyApiKey = this.getEmbyApiKey();
            result = result * 59 + ($embyApiKey == null ? 43 : $embyApiKey.hashCode());
            String $embyServerId = this.getEmbyServerId();
            result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
            Instant $updatedAt = this.getUpdatedAt();
            result = result * 59 + ($updatedAt == null ? 43 : ((Object)$updatedAt).hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "WechatBotService.SearchSession(query=" + this.getQuery() + ", page=" + this.getPage() + ", totalPages=" + this.getTotalPages() + ", totalResults=" + this.getTotalResults() + ", sessionType=" + this.getSessionType() + ", serverNumber=" + this.getServerNumber() + ", results=" + String.valueOf(this.getResults()) + ", embyResults=" + String.valueOf(this.getEmbyResults()) + ", embyBaseUrl=" + this.getEmbyBaseUrl() + ", embyApiKey=" + this.getEmbyApiKey() + ", embyServerId=" + this.getEmbyServerId() + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
        }

        @Generated
        public SearchSession() {
        }

        @Generated
        public SearchSession(String query, int page, int totalPages, int totalResults, String sessionType, int serverNumber, List<TmdbResponse.Result> results, List<JSONObject> embyResults, String embyBaseUrl, String embyApiKey, String embyServerId, Instant updatedAt) {
            this.query = query;
            this.page = page;
            this.totalPages = totalPages;
            this.totalResults = totalResults;
            this.sessionType = sessionType;
            this.serverNumber = serverNumber;
            this.results = results;
            this.embyResults = embyResults;
            this.embyBaseUrl = embyBaseUrl;
            this.embyApiKey = embyApiKey;
            this.embyServerId = embyServerId;
            this.updatedAt = updatedAt;
        }
    }
}
