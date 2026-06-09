/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.core.io.resource.ResourceUtil
 *  com.fasterxml.jackson.annotation.JsonIgnoreProperties
 *  com.fasterxml.jackson.databind.DeserializationFeature
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  lombok.Generated
 *  okhttp3.HttpUrl
 *  okhttp3.MediaType
 *  okhttp3.MultipartBody
 *  okhttp3.MultipartBody$Builder
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.EmbyInfoCacheManagerUtils;
import com.una.embyhub.config.common.utils.EmbyUrlUtils;
import com.una.embyhub.config.common.utils.TelegramClientUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import com.una.embyhub.model.dto.response.playbackreporting.UserPlaylistResponse;
import com.una.embyhub.service.playbackreporting.PlaybackReportingService;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import lombok.Generated;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class EmbyPlaybackReportingRankingJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyPlaybackReportingRankingJob.class);
    @Autowired
    private EmbyInfoCacheManagerUtils embyInfoCacheManager;
    @Autowired
    private TelegramClientUtils telegramClientUtils;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;
    @Autowired
    private PlaybackReportingService playbackReportingService;
    private final ThreadLocal<EmbyInfoCacheManagerUtils.EmbyServerConfig> currentConfig = new ThreadLocal();
    public final TimeZone ZONE = TimeZone.getTimeZone("Asia/Shanghai");
    public final boolean PREFER_MOVIE_BG = true;
    public final int IMG_WIDTH = 1200;
    public final int IMG_HEIGHT = 1600;
    public final int PADDING = 48;
    public final int COLUMN_GAP = 32;
    public final int SECTION_GAP = 28;
    public final int LINE_GAP = 16;
    public final int FOOTER_H = 380;
    public final int MAX_MOVIE_IN_IMAGE = 12;
    public final int MAX_SERIES_IN_IMAGE = 12;
    public final int MAX_VIEWERS_IN_IMAGE = 10;
    public final String CUSTOM_FONT_PATH;
    public final int VIEWER_COLS = 4;
    public final int VIEWER_ROWS = 2;
    public final Set<String> EXCLUDE_USER_NAMES = new HashSet<String>(Arrays.asList(new String[0]));
    public final OkHttpClient HTTP = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).build();
    public final ObjectMapper MAPPER = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    private static final Pattern YEAR_ANY = Pattern.compile("(?<!\\d)(?:19|20)\\d{2}(?!\\d)");
    private static final Pattern QUALITY_TAGS = Pattern.compile("(?i)\\b(4k|8k|1080p|2160p|hdr|dv|dolby\\s*vision|atmos|hevc|h26[45]|x265|web[- ]?dl|bluray|bdrip|remux|\u5185\u5c01|\u5916\u6302|\u4e2d\u5b57|\u7b80\u4e2d|\u7e41\u4e2d|\u56fd\u914d|\u56fd\u8bed|\u7ca4\u8bed|\u56fd\u7ca4|\u53cc\u8bed|\u591a\u97f3\u8f68|\u91cd\u5236|\u91cd\u5236\u7248|\u4fee\u590d|\u4fee\u590d\u7248|\u52a0\u957f|\u52a0\u957f\u7248|\u5bfc\u6f14\u526a\u8f91\u7248|\u672a\u5206\u7ea7|\u65e0\u5220\u51cf|\u5b8c\u6574\u7248|extended\\s*cut|director'?s\\s*cut|uncut|remastered|ultimate\\s*edition|tv\u7248|\u5267\u573a\u7248|\u7535\u5f71\u7248|\u7f51\u7edc\u7248|\u6d77\u5916\u7248|\u5408\u96c6|\u5408\u96c6\u7248|\u5168\u96c6|\u603b\u96c6\u7bc7)\\b");
    private static final Pattern SEASON_TAGS = Pattern.compile("(?i)(\u7b2c\\s*[\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u4e03\u516b\u4e5d\u5341\u767e\u96f6\u4e240-9]+\\s*\u5b63|season\\s*\\d+|\\bs\\s*\\d+)");

    public EmbyPlaybackReportingRankingJob() {
        this.CUSTOM_FONT_PATH = null;
    }

    private EmbyInfoCacheManagerUtils.EmbyServerConfig getConfig() {
        return Optional.ofNullable(this.currentConfig.get()).orElseGet(this.embyInfoCacheManager::getRequiredConfig);
    }

    private String getServerUrl() {
        return this.getConfig().url();
    }

    private String getApiKey() {
        return this.getConfig().apiKey();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Scheduled(cron="0 0 1 * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u6392\u884c\u699c\u4efb\u52a1", remark="Emby\u6bcf\u65e5\u64ad\u653e\u6392\u884c\u699c")
    public void configureTasks() throws IOException {
        log.info("\u6bcf\u65e5\u64ad\u653e\u6392\u884c\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        TelegramResponse telegramResponse = this.telegramClientUtils.getTelegramResponse();
        if (telegramResponse == null) {
            log.info("\u6bcf\u65e5\u64ad\u653e\u6392\u884c\u5b9a\u65f6\u4efb\u52a1\u672a\u914d\u7f6eTelegram\uff0c\u8df3\u8fc7\u6267\u884c");
            return;
        }
        List<EmbyInfoCacheManagerUtils.EmbyServerConfig> serverConfigs = this.embyInfoCacheManager.getEnabledConfigs();
        if (serverConfigs == null || serverConfigs.isEmpty()) {
            serverConfigs = List.of(this.embyInfoCacheManager.getRequiredConfig());
        }
        for (EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig : serverConfigs) {
            this.currentConfig.set(serverConfig);
            try {
                String targetChatId;
                Calendar cal = Calendar.getInstance(this.ZONE);
                cal.add(5, -1);
                Date targetDate = cal.getTime();
                String endDateStr = DateUtil.format((Date)targetDate, (String)"yyyy-MM-dd");
                List<UserPlaylistResponse> playlist = null;
                try {
                    playlist = this.playbackReportingService.getUserPlaylist(serverConfig.id(), null, false, null, 1, endDateStr, "Movie,Episode");
                }
                catch (Exception e) {
                    log.error("\u83b7\u53d6\u670d\u52a1\u5668[{}]\u64ad\u653e\u8bb0\u5f55\u5931\u8d25", (Object)serverConfig.serverName(), (Object)e);
                    this.currentConfig.remove();
                    continue;
                }
                if (playlist == null || playlist.isEmpty()) {
                    log.info("\u670d\u52a1\u5668[{}]\u6628\u65e5\u65e0\u64ad\u653e\u8bb0\u5f55", (Object)serverConfig.serverName());
                    continue;
                }
                HashMap<String, MovieAgg> movieAggMap = new HashMap<String, MovieAgg>();
                HashMap<String, SeriesAgg> seriesAggMap = new HashMap<String, SeriesAgg>();
                HashMap<String, ViewerRow> viewers = new HashMap<String, ViewerRow>();
                for (UserPlaylistResponse userPlaylistResponse : playlist) {
                    String itemId;
                    String string;
                    if (userPlaylistResponse.getUserName() != null && this.EXCLUDE_USER_NAMES.contains(userPlaylistResponse.getUserName())) continue;
                    long seconds = 0L;
                    try {
                        if (userPlaylistResponse.getDuration() != null) {
                            seconds = Long.parseLong(userPlaylistResponse.getDuration());
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                    if (seconds <= 0L) continue;
                    String uid = userPlaylistResponse.getUserId();
                    String uname = userPlaylistResponse.getUserName();
                    String nickName = userPlaylistResponse.getNickName();
                    String string2 = string = nickName != null && !nickName.isBlank() ? nickName : uname;
                    if (uid == null) {
                        uid = "unknown";
                    }
                    ViewerRow viewerRow = viewers.computeIfAbsent(uid, k -> new ViewerRow((String)k, displayName));
                    viewerRow.totalSeconds += seconds;
                    ++viewerRow.playCount;
                    Date playDate = this.parseDateAndTime(userPlaylistResponse.getDate(), userPlaylistResponse.getTime());
                    if (playDate != null) {
                        if (viewerRow.firstSeen == null || playDate.before(viewerRow.firstSeen)) {
                            viewerRow.firstSeen = playDate;
                        }
                        if (viewerRow.lastSeen == null || playDate.after(viewerRow.lastSeen)) {
                            viewerRow.lastSeen = playDate;
                        }
                    }
                    String type = userPlaylistResponse.getItemType();
                    String itemName = userPlaylistResponse.getItemName();
                    String string3 = itemId = userPlaylistResponse.getItemId() != null ? String.valueOf(userPlaylistResponse.getItemId()) : null;
                    if ("Movie".equalsIgnoreCase(type)) {
                        String norm = this.normalizeMovieTitle(itemName);
                        MovieAgg agg = movieAggMap.computeIfAbsent(norm, k -> new MovieAgg(itemName));
                        agg.totalSeconds += seconds;
                        ++agg.playCount;
                        if (itemId != null) {
                            agg.secondsByMovieId.merge(itemId, seconds, Long::sum);
                        }
                        agg.secondsByDisplayName.merge(itemName, seconds, Long::sum);
                        continue;
                    }
                    if (!"Episode".equalsIgnoreCase(type)) continue;
                    String seriesName = this.extractSeriesName(itemName);
                    String norm = this.normalizeSeriesTitle(seriesName);
                    SeriesAgg agg = seriesAggMap.computeIfAbsent(norm, k -> new SeriesAgg(seriesName));
                    agg.totalSeconds += seconds;
                    String epCode = this.extractEpCode(itemName);
                    if (epCode != null) {
                        if (agg.episodes.add(epCode)) {
                            ++agg.playCount;
                        }
                    } else {
                        ++agg.playCount;
                    }
                    if (itemId != null) {
                        agg.secondsBySeriesId.merge(itemId, seconds, Long::sum);
                    }
                    agg.secondsByDisplayName.merge(seriesName, seconds, Long::sum);
                }
                ArrayList<MovieRow> movieRows = new ArrayList<MovieRow>();
                for (MovieAgg agg : movieAggMap.values()) {
                    String bestId = null;
                    long bestSec = -1L;
                    for (Map.Entry entry : agg.secondsByMovieId.entrySet()) {
                        if ((Long)entry.getValue() <= bestSec) continue;
                        bestSec = (Long)entry.getValue();
                        bestId = (String)entry.getKey();
                    }
                    String bestName = this.chooseBestNamePreferCJK(agg.secondsByDisplayName);
                    MovieRow movieRow = new MovieRow(bestId, bestName);
                    movieRow.watchedSeconds = agg.totalSeconds;
                    movieRow.playCount = agg.playCount;
                    movieRows.add(movieRow);
                }
                ArrayList<SeriesRow> arrayList = new ArrayList<SeriesRow>();
                for (SeriesAgg agg : seriesAggMap.values()) {
                    String bestId = null;
                    long bestSec = -1L;
                    for (Map.Entry<String, Long> entry : agg.secondsBySeriesId.entrySet()) {
                        if (entry.getValue() <= bestSec) continue;
                        bestSec = entry.getValue();
                        bestId = entry.getKey();
                    }
                    String string = this.chooseBestNamePreferCJK(agg.secondsByDisplayName);
                    SeriesRow seriesRow = new SeriesRow(bestId, string);
                    seriesRow.totalSeconds = agg.totalSeconds;
                    seriesRow.playCount = agg.playCount > 0 ? agg.playCount : 1;
                    seriesRow.episodes = agg.episodes;
                    arrayList.add(seriesRow);
                }
                movieRows.sort(Comparator.comparingLong(r -> r.watchedSeconds).reversed());
                arrayList.sort(Comparator.comparingLong(r -> r.totalSeconds).reversed());
                ArrayList<ViewerRow> viewerRows = new ArrayList<ViewerRow>(viewers.values());
                viewerRows.sort(Comparator.comparingLong(v -> v.totalSeconds).reversed().thenComparingInt(v -> -v.playCount));
                byte[] png = this.renderLeaderboardImageWithPosterBG(movieRows, arrayList, viewerRows, targetDate);
                String sendToBotConfig = this.configCacheLoaderUtils.getConfigValue("ranking_send_to_bot");
                boolean sendToBot = sendToBotConfig != null;
                String string = targetChatId = sendToBot ? telegramResponse.getBotChatId() : telegramResponse.getBotChatGroupId();
                if (targetChatId == null || targetChatId.isBlank()) {
                    log.warn("\u76ee\u6807 Chat ID \u672a\u914d\u7f6e\uff0csendToBot={}", (Object)sendToBot);
                    continue;
                }
                this.sendTelegramPhoto(telegramResponse.getBotToken(), targetChatId, png, "leaderboard.png", null);
                log.info("\u5df2\u53d1\u9001\u6392\u884c\u6d77\u62a5\uff0c\u670d\u52a1\u5668\uff1a{}\uff0c\u53d1\u9001\u76ee\u6807\uff1a{}", (Object)serverConfig.url(), (Object)(sendToBot ? "\u673a\u5668\u4eba" : "\u7fa4\u804a"));
            }
            catch (Exception e) {
                log.error("\u6bcf\u65e5\u64ad\u653e\u6392\u884c\u4efb\u52a1\u5f02\u5e38", (Throwable)e);
            }
            finally {
                this.currentConfig.remove();
            }
        }
    }

    public void sendTelegramPhoto(String token, String chatId, byte[] imageBytes, String filename, String caption) throws IOException {
        String url = "https://api.telegram.org/bot" + token + "/sendPhoto";
        MultipartBody.Builder mb = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("chat_id", chatId);
        if (caption != null && !caption.isEmpty()) {
            mb.addFormDataPart("caption", caption);
        }
        mb.addFormDataPart("photo", filename, RequestBody.create((byte[])imageBytes, (MediaType)MediaType.parse((String)"image/png")));
        Request req = new Request.Builder().url(url).post((RequestBody)mb.build()).build();
        try (Response r = this.HTTP.newCall(req).execute();){
            if (!r.isSuccessful()) {
                throw new IOException("Telegram HTTP " + r.code());
            }
        }
    }

    private Date parseDateAndTime(String date, String time) {
        if (date == null || time == null) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.setTimeZone(this.ZONE);
            return sdf.parse(date + " " + time);
        }
        catch (Exception e) {
            return null;
        }
    }

    private String extractSeriesName(String itemName) {
        if (itemName == null) {
            return "\u672a\u77e5\u5267\u540d";
        }
        int idx = itemName.indexOf(" - ");
        if (idx > 0) {
            return itemName.substring(0, idx);
        }
        return itemName;
    }

    private String extractEpCode(String itemName) {
        if (itemName == null) {
            return null;
        }
        Matcher m = Pattern.compile("(?i)(S\\d+E\\d+)").matcher(itemName);
        if (m.find()) {
            return m.group(1).toUpperCase();
        }
        return null;
    }

    public byte[] renderLeaderboardImageWithPosterBG(List<MovieRow> movieRows, List<SeriesRow> seriesRows, List<ViewerRow> viewerRows, Date targetDate) throws IOException {
        InputStream DEFAULT_BG_IMAGE_PATH = ResourceUtil.getStream((String)"img/\u6682\u65e0\u4eca\u65e5\u6392\u884c.png");
        boolean hasRankingData = !movieRows.isEmpty() || !seriesRows.isEmpty() || !viewerRows.isEmpty();
        BufferedImage bg = this.fetchRankingBackground(movieRows, seriesRows);
        if (bg == null && hasRankingData) {
            log.warn("\u6392\u884c\u699c\u6709\u6570\u636e\u4f46\u672a\u52a0\u8f7d\u5230\u5a92\u4f53\u80cc\u666f\uff0c\u4f7f\u7528\u6e10\u53d8\u80cc\u666f\uff1amovies={}, series={}, viewers={}", new Object[]{movieRows.size(), seriesRows.size(), viewerRows.size()});
        }
        if (bg == null && !hasRankingData && DEFAULT_BG_IMAGE_PATH != null) {
            try {
                bg = ImageIO.read(DEFAULT_BG_IMAGE_PATH);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        BufferedImage img = new BufferedImage(1200, 1600, 2);
        Graphics2D g = img.createGraphics();
        this.enableAA(g);
        if (bg != null) {
            this.drawCover(g, bg, 1200, 1600);
        } else {
            GradientPaint gp = new GradientPaint(0.0f, 0.0f, new Color(21, 25, 35), 0.0f, 1600.0f, new Color(33, 41, 58));
            g.setPaint(gp);
            g.fillRect(0, 0, 1200, 1600);
        }
        g.setColor(new Color(0, 0, 0, 150));
        g.fillRect(0, 0, 1200, 1600);
        int panelX = 48;
        int panelY = 48;
        int panelW = 1104;
        Font base = this.loadFontOrDefault(20.0f);
        Font h1 = base.deriveFont(1, 48.0f);
        Font h2 = base.deriveFont(1, 34.0f);
        Font rankFont = base.deriveFont(1, 28.0f);
        Font itemFont = base.deriveFont(26.0f);
        Font metaFont = base.deriveFont(22.0f);
        Font footerTitleFont = base.deriveFont(1, 30.0f);
        Font footerItemFont = base.deriveFont(22.0f);
        int x = panelX + 36;
        int y = panelY + 52;
        g.setColor(Color.WHITE);
        g.setFont(h1);
        g.drawString("Emby \u4eca\u65e5\u6392\u884c\u699c", x, y);
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy\u5e74MM\u6708dd\u65e5\uff08EEE\uff09", Locale.CHINA);
        String dateText = fmt.format(targetDate);
        int pillUsedH = this.drawDatePill(g, dateText, x, y + 16, base.deriveFont(1, 36.0f));
        int contentBottom = 1172;
        int contentTop = y + pillUsedH + 70;
        int columnWidth = (panelW - 72 - 32) / 2;
        int col1X = x;
        int col2X = x + columnWidth + 32;
        int yy = contentTop;
        yy = this.drawSectionHeader(g, "\ud83c\udfac \u7535\u5f71 Top " + Math.min(12, movieRows.size()), h2, col1X, yy);
        yy += 8;
        yy = this.drawMovieList(g, movieRows, Math.min(12, movieRows.size()), col1X, yy, columnWidth, rankFont, itemFont, metaFont);
        int yy2 = contentTop;
        yy2 = this.drawSectionHeader(g, "\ud83d\udcfa \u5267\u96c6 Top " + Math.min(12, seriesRows.size()), h2, col2X, yy2);
        yy2 += 8;
        yy2 = this.drawSeriesList(g, seriesRows, Math.min(12, seriesRows.size()), col2X, yy2, columnWidth, rankFont, itemFont, metaFont);
        String serverLabel = this.buildServerLabel(this.getConfig());
        this.drawViewerFooter(g, panelX, contentBottom, panelW, 372, viewerRows, footerTitleFont, footerItemFont, serverLabel);
        g.dispose();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write((RenderedImage)img, "png", bos);
        return bos.toByteArray();
    }

    public void drawCover(Graphics2D g, BufferedImage src, int W, int H) {
        double scale = Math.max((double)W / (double)src.getWidth(), (double)H / (double)src.getHeight());
        int sw = (int)Math.round((double)src.getWidth() * scale);
        int sh = (int)Math.round((double)src.getHeight() * scale);
        int dx = (W - sw) / 2;
        int dy = (H - sh) / 2;
        g.drawImage(src, dx, dy, sw, sh, null);
    }

    private BufferedImage fetchRankingBackground(List<MovieRow> movieRows, List<SeriesRow> seriesRows) {
        LinkedHashSet<String> itemIds = new LinkedHashSet<String>();
        this.addMovieItemIds(itemIds, movieRows);
        this.addSeriesItemIds(itemIds, seriesRows);
        for (String itemId : itemIds) {
            BufferedImage image = this.fetchEmbyImage(itemId, "Backdrop", 0);
            if (image != null) {
                log.info("\u6392\u884c\u699c\u80cc\u666f\u4f7f\u7528 Emby Backdrop\uff1aitemId={}", (Object)itemId);
                return image;
            }
            image = this.fetchEmbyPrimaryImage(itemId);
            if (image == null) continue;
            log.info("\u6392\u884c\u699c\u80cc\u666f\u4f7f\u7528 Emby Primary\uff1aitemId={}", (Object)itemId);
            return image;
        }
        return null;
    }

    private void addMovieItemIds(Set<String> itemIds, List<MovieRow> movieRows) {
        for (MovieRow row : movieRows) {
            if (row == null || row.movieId == null || row.movieId.isBlank()) continue;
            itemIds.add(row.movieId);
        }
    }

    private void addSeriesItemIds(Set<String> itemIds, List<SeriesRow> seriesRows) {
        for (SeriesRow row : seriesRows) {
            if (row == null || row.seriesId == null || row.seriesId.isBlank()) continue;
            itemIds.add(row.seriesId);
        }
    }

    public BufferedImage fetchEmbyPrimaryImage(String itemId) {
        return this.fetchEmbyImage(itemId, "Primary", null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private BufferedImage fetchEmbyImage(String itemId, String imageType, Integer imageIndex) {
        HttpUrl baseUrl;
        if (itemId == null) return null;
        if (itemId.isBlank()) {
            return null;
        }
        String path = "/Items/" + itemId + "/Images/" + imageType;
        if ("Backdrop".equalsIgnoreCase(imageType) && imageIndex != null) {
            path = path + "/" + imageIndex;
        }
        if ((baseUrl = HttpUrl.parse((String)EmbyUrlUtils.buildApiUrl(this.getServerUrl(), path))) == null) {
            log.warn("\u6392\u884c\u699c\u80cc\u666f\u56fe\u7247 URL \u6784\u5efa\u5931\u8d25\uff1aitemId={}, imageType={}", (Object)itemId, (Object)imageType);
            return null;
        }
        HttpUrl url = baseUrl.newBuilder().addQueryParameter("maxWidth", String.valueOf(Math.max(1200, 1600))).addQueryParameter("quality", "90").addQueryParameter("api_key", this.getApiKey()).build();
        Request req = new Request.Builder().url(url).get().build();
        try (Response r = this.HTTP.newCall(req).execute();){
            if (!r.isSuccessful() || r.body() == null) {
                log.debug("\u6392\u884c\u699c\u80cc\u666f\u56fe\u7247\u52a0\u8f7d\u5931\u8d25\uff1aitemId={}, imageType={}, status={}", new Object[]{itemId, imageType, r.code()});
                BufferedImage bufferedImage2 = null;
                return bufferedImage2;
            }
            BufferedImage bufferedImage = ImageIO.read(r.body().byteStream());
            return bufferedImage;
        }
        catch (Exception e) {
            log.debug("\u6392\u884c\u699c\u80cc\u666f\u56fe\u7247\u8bfb\u53d6\u5931\u8d25\uff1aitemId={}, imageType={}", new Object[]{itemId, imageType, e});
            return null;
        }
    }

    public int drawSectionHeader(Graphics2D g, String text, Font font, int x, int y) {
        g.setFont(font);
        g.setColor(new Color(242, 245, 255));
        g.drawString(text, x, y);
        g.setColor(new Color(120, 140, 180, 160));
        g.fillRect(x, y + 8, 320, 2);
        return y + 48;
    }

    public int drawMovieList(Graphics2D g, List<MovieRow> list, int count, int x, int y, int width, Font rankFont, Font itemFont, Font metaFont) {
        int lineH = 40;
        for (int i = 0; i < count; ++i) {
            MovieRow r = list.get(i);
            int baseline = y + i * (lineH + 16);
            g.setFont(rankFont);
            g.setColor(this.rankColor(i));
            g.drawString(String.format("%2d", i + 1), x, baseline);
            int titleX = x + 46;
            g.setFont(itemFont);
            g.setColor(new Color(240, 244, 255));
            String title = this.wrapEllipsis("\u300a" + r.title + "\u300b", g.getFontMetrics(), width - 46 - 180);
            g.drawString(title, titleX, baseline);
            g.setFont(metaFont);
            g.setColor(new Color(180, 195, 220));
            String meta = "\u23f1 " + this.formatDuration(r.watchedSeconds) + " \uff5c \u00d7" + r.playCount;
            int metaW = g.getFontMetrics().stringWidth(meta);
            g.drawString(meta, x + width - metaW, baseline);
        }
        return y + count * (lineH + 16);
    }

    public int drawSeriesList(Graphics2D g, List<SeriesRow> list, int count, int x, int y, int width, Font rankFont, Font itemFont, Font metaFont) {
        int lineH = 34;
        for (int i = 0; i < count; ++i) {
            SeriesRow r = list.get(i);
            int baseline = y + i * (lineH + 16);
            g.setFont(rankFont);
            g.setColor(this.rankColor(i));
            g.drawString(String.format("%2d", i + 1), x, baseline);
            int titleX = x + 46;
            g.setFont(itemFont);
            g.setColor(new Color(240, 244, 255));
            String title = this.wrapEllipsis("\u300a" + r.seriesName + "\u300b", g.getFontMetrics(), width - 46 - 180);
            g.drawString(title, titleX, baseline);
            g.setFont(metaFont);
            g.setColor(new Color(180, 195, 220));
            String meta = "\u23f1 " + this.formatDuration(r.totalSeconds) + " \uff5c \u00d7" + r.playCount;
            int metaW = g.getFontMetrics().stringWidth(meta);
            g.drawString(meta, x + width - metaW, baseline);
        }
        return y + count * (lineH + 16);
    }

    public void drawViewerFooter(Graphics2D g, int x, int footerTop, int width, int height, List<ViewerRow> viewerRows, Font titleFont, Font itemFont, String serverLabel) {
        int i;
        int cardsTop;
        g.setColor(new Color(0, 0, 0, 160));
        g.fillRoundRect(x, footerTop, width, height, 28, 28);
        g.setColor(new Color(255, 255, 255, 40));
        g.setStroke(new BasicStroke(2.0f));
        g.drawRoundRect(x + 1, footerTop + 1, width - 2, height - 2, 28, 28);
        int padX = 28;
        int padY = 18;
        int innerX = x + padX;
        int innerY = footerTop + padY;
        if (serverLabel != null && !serverLabel.isBlank()) {
            Font serverFont = titleFont.deriveFont(1, 20.0f);
            g.setFont(serverFont);
            FontMetrics fmSrv = g.getFontMetrics(serverFont);
            int maxLabelWidth = Math.max(180, width / 2);
            String prefix = "\ud83d\ude80 \u63a8\u9001\u670d\u52a1\u5668 ";
            Object ellipsedServer = serverLabel;
            int prefixW = fmSrv.stringWidth(prefix);
            if (fmSrv.stringWidth(prefix + (String)ellipsedServer) > maxLabelWidth) {
                ellipsedServer = this.wrapEllipsis((String)ellipsedServer, fmSrv, Math.max(60, maxLabelWidth - prefixW));
            }
            String text = prefix + (String)ellipsedServer;
            int pillPadX = 16;
            int pillPadY = 10;
            int pillW = fmSrv.stringWidth(text) + pillPadX * 2;
            int pillH = fmSrv.getAscent() + fmSrv.getDescent() + pillPadY * 2;
            int pillX = x + width - padX - pillW;
            int pillY = innerY - 6;
            g.setColor(new Color(0, 0, 0, 120));
            g.fillRoundRect(pillX + 2, pillY + 3, pillW, pillH, pillH, pillH);
            GradientPaint gpBadge = new GradientPaint(pillX, pillY, new Color(82, 102, 255, 235), pillX + pillW, pillY + pillH, new Color(120, 234, 255, 230));
            g.setPaint(gpBadge);
            g.fillRoundRect(pillX, pillY, pillW, pillH, pillH, pillH);
            g.setColor(new Color(255, 255, 255, 180));
            g.setStroke(new BasicStroke(1.6f));
            g.drawRoundRect(pillX, pillY, pillW, pillH, pillH, pillH);
            g.setColor(Color.WHITE);
            g.drawString(text, pillX + pillPadX, pillY + pillPadY + fmSrv.getAscent());
        }
        int total = viewerRows.size();
        int gridMax = 8;
        int showCards = Math.min(Math.min(10, total), gridMax);
        ArrayList<ActivityRow> actives = new ArrayList<ActivityRow>();
        for (ViewerRow v : viewerRows) {
            if (v.firstSeen == null || v.lastSeen == null || v.firstSeen.after(v.lastSeen)) continue;
            long dur = Math.max(1L, (v.lastSeen.getTime() - v.firstSeen.getTime()) / 1000L);
            actives.add(new ActivityRow(v.userName, v.firstSeen, v.lastSeen, dur));
        }
        actives.sort(Comparator.comparingLong(a -> a.durationSeconds).reversed());
        int showActive = Math.min(6, actives.size());
        g.setFont(titleFont);
        g.setColor(new Color(230, 245, 255));
        String sectionTitle = "\u23f0 \u6d3b\u8dc3\u65f6\u95f4\u8303\u56f4\u6392\u884c";
        g.drawString(sectionTitle, innerX, innerY + titleFont.getSize() + 2);
        int sepY0 = innerY + titleFont.getSize() + 12;
        g.setColor(new Color(120, 140, 180, 140));
        g.fillRect(innerX, sepY0, width - padX * 2, 2);
        int activeTop = sepY0 + 16;
        Font activeNameFont = itemFont.deriveFont(20.0f);
        Font activeMetaFont = itemFont.deriveFont(18.0f);
        FontMetrics fmAName = g.getFontMetrics(activeNameFont);
        int aCols = 2;
        int aRows = (int)Math.ceil((double)showActive / 2.0);
        int aColW = (width - padX * 2 - 16) / 2;
        int aRowH = 28;
        for (int i2 = 0; i2 < showActive; ++i2) {
            ActivityRow ar = (ActivityRow)actives.get(i2);
            int row = i2 / aCols;
            int col = i2 % aCols;
            int ax = innerX + col * (aColW + 16);
            int ay = activeTop + row * aRowH;
            g.setFont(activeNameFont);
            g.setColor(this.rankColor(i2));
            String rk = String.format("%2d", i2 + 1);
            g.drawString(rk, ax, ay + fmAName.getAscent());
            int nameX = ax + fmAName.stringWidth("00 ");
            g.setColor(new Color(240, 244, 255));
            g.setFont(activeNameFont);
            String name = this.wrapEllipsis(ar.userName, g.getFontMetrics(), aColW - fmAName.stringWidth("00 ") - 200);
            g.drawString(name, nameX, ay + fmAName.getAscent());
            g.setFont(activeMetaFont);
            g.setColor(new Color(180, 195, 220));
            String range = this.formatHM(ar.start) + "\u2013" + this.formatHM(ar.end) + " \u00b7 " + this.formatDuration(ar.durationSeconds);
            int rw = g.getFontMetrics().stringWidth(range);
            g.drawString(range, ax + aColW - rw, ay + fmAName.getAscent());
        }
        int sepY = activeTop + (aRows == 0 ? 0 : aRows * aRowH) + (showActive == 0 ? 0 : 12);
        if (showActive > 0) {
            g.setColor(new Color(120, 140, 180, 140));
            g.fillRect(innerX, sepY, width - padX * 2, 2);
        }
        int n = cardsTop = showActive > 0 ? sepY + 16 : sepY0 + 16;
        if (showCards == 0) {
            return;
        }
        int areaH = footerTop + height - cardsTop - padY;
        int cols = 4;
        int rows = 2;
        int hGap = 18;
        int vGap = 14;
        int cardW = (width - padX * 2 - hGap * (cols - 1)) / cols;
        int cardH = (areaH - vGap * (rows - 1)) / rows;
        Font nameFont = itemFont.deriveFont(22.0f);
        Font durationFont = itemFont.deriveFont(18.0f);
        Font pillFont = itemFont.deriveFont(1, 16.0f);
        FontMetrics fmName = g.getFontMetrics(nameFont);
        FontMetrics fmDur = g.getFontMetrics(durationFont);
        FontMetrics fmPill = g.getFontMetrics(pillFont);
        int avatarR = 26;
        int badgeR = 20;
        int barH = 9;
        int contentPad = 12;
        int gapNameToDur = 6;
        int gapDurToBar = 10;
        long maxSec = 1L;
        for (i = 0; i < showCards; ++i) {
            maxSec = Math.max(maxSec, viewerRows.get((int)i).totalSeconds);
        }
        for (i = 0; i < showCards; ++i) {
            Color border;
            Color c2;
            Color c1;
            ViewerRow v = viewerRows.get(i);
            int row = i / cols;
            int col = i % cols;
            int cx = innerX + col * (cardW + hGap);
            int cy = cardsTop + row * (cardH + vGap);
            g.setColor(new Color(255, 255, 255, 26));
            g.fillRoundRect(cx, cy, cardW, cardH, 18, 18);
            g.setColor(new Color(255, 255, 255, 40));
            g.setStroke(new BasicStroke(1.5f));
            g.drawRoundRect(cx, cy, cardW, cardH, 18, 18);
            Color badgeColor = this.rankColor(i);
            int badgeX = cx + contentPad;
            int badgeY = cy + contentPad;
            g.setColor(new Color(0, 0, 0, 120));
            g.fillOval(badgeX, badgeY, badgeR, badgeR);
            g.setColor(badgeColor);
            g.fillOval(badgeX - 1, badgeY - 1, badgeR, badgeR);
            g.setColor(new Color(20, 32, 48));
            g.setFont(durationFont.deriveFont(1, 14.0f));
            String rnk = String.valueOf(i + 1);
            FontMetrics fmR = g.getFontMetrics();
            g.drawString(rnk, badgeX + (badgeR - fmR.stringWidth(rnk)) / 2, badgeY + (badgeR + fmR.getAscent()) / 2 - 2);
            int avX = badgeX + badgeR + 8;
            int avY = cy + contentPad;
            Color avColor = this.colorFromName(v.userName);
            g.setColor(new Color(0, 0, 0, 120));
            g.fillOval(avX, avY, avatarR, avatarR);
            g.setColor(avColor);
            g.fillOval(avX - 1, avY - 1, avatarR, avatarR);
            g.setColor(Color.WHITE);
            g.setFont(durationFont.deriveFont(1, 16.0f));
            String initial = this.getInitial(v.userName);
            FontMetrics fmInit = g.getFontMetrics();
            g.drawString(initial, avX + (avatarR - fmInit.stringWidth(initial)) / 2, avY + (avatarR + fmInit.getAscent()) / 2 - 3);
            String countText = "\u00d7" + (v.playCount > 999 ? "999+" : String.valueOf(v.playCount));
            g.setFont(pillFont);
            int pillTextW = fmPill.stringWidth(countText);
            int pillPadX = 8;
            int pillPadY = 5;
            int pillW = Math.max(36, pillTextW + pillPadX * 2);
            int pillH = fmPill.getAscent() + fmPill.getDescent() + pillPadY * 2;
            int pillX = cx + cardW - contentPad - pillW;
            int pillY = cy + contentPad;
            if (i == 0) {
                c1 = new Color(255, 213, 110);
                c2 = new Color(255, 158, 0);
                border = new Color(255, 140, 0, 180);
            } else if (i == 1) {
                c1 = new Color(215, 215, 215);
                c2 = new Color(168, 168, 168);
                border = new Color(140, 140, 140, 180);
            } else if (i == 2) {
                c1 = new Color(210, 166, 121);
                c2 = new Color(178, 115, 55);
                border = new Color(150, 92, 40, 180);
            } else {
                c1 = new Color(125, 229, 214);
                c2 = new Color(42, 161, 149);
                border = new Color(20, 120, 110, 180);
            }
            GradientPaint pillGp = new GradientPaint(pillX, pillY, c1, pillX, pillY + pillH, c2);
            g.setPaint(pillGp);
            g.fillRoundRect(pillX, pillY, pillW, pillH, pillH, pillH);
            g.setColor(border);
            g.drawRoundRect(pillX, pillY, pillW, pillH, pillH, pillH);
            g.setColor(Color.WHITE);
            g.drawString(countText, pillX + (pillW - pillTextW) / 2, pillY + pillPadY + fmPill.getAscent());
            int nameX = avX + avatarR + 10;
            int nameRight = pillX - 8;
            int nameMaxW = Math.max(30, nameRight - nameX);
            g.setFont(nameFont);
            g.setColor(new Color(240, 244, 255));
            String name = this.wrapEllipsis(v.userName, g.getFontMetrics(), nameMaxW);
            int nameBase = avY + fmName.getAscent() + 2;
            g.drawString(name, nameX, nameBase);
            g.setFont(durationFont);
            g.setColor(new Color(180, 195, 220));
            String dur = "\u23f1 " + this.formatDuration(v.totalSeconds);
            int durBase = nameBase + gapNameToDur + fmDur.getAscent();
            g.drawString(dur, nameX, durBase);
            int barX = cx + contentPad;
            int barW = cardW - contentPad * 2;
            int barY = Math.max(durBase + gapDurToBar, cy + cardH - contentPad - barH);
            g.setColor(new Color(255, 255, 255, 40));
            g.fillRoundRect(barX, barY, barW, barH, barH, barH);
            double ratio = Math.min(1.0, (double)v.totalSeconds / (double)maxSec);
            int fillW = Math.max(6, (int)Math.round((double)barW * ratio));
            GradientPaint gp = new GradientPaint(barX, barY, new Color(144, 255, 197), barX, barY + barH, new Color(26, 163, 90));
            g.setPaint(gp);
            g.fillRoundRect(barX, barY, fillW, barH, barH, barH);
        }
    }

    private String buildServerLabel(EmbyInfoCacheManagerUtils.EmbyServerConfig serverConfig) {
        if (serverConfig == null) {
            return "";
        }
        if (serverConfig.serverName() != null && !serverConfig.serverName().isBlank()) {
            return serverConfig.serverName().trim();
        }
        return this.buildServerUrlLabel(serverConfig.url());
    }

    private String buildServerUrlLabel(String serverUrl) {
        if (serverUrl == null) {
            return "";
        }
        String trimmed = serverUrl.trim();
        while (trimmed.endsWith("/")) {
            trimmed = trimmed.substring(0, trimmed.length() - 1);
        }
        try {
            URI uri = URI.create(trimmed);
            StringBuilder sb = new StringBuilder();
            if (uri.getScheme() != null) {
                sb.append(uri.getScheme()).append("://");
            }
            if (uri.getHost() != null) {
                sb.append(uri.getHost());
            }
            if (uri.getPort() != -1) {
                sb.append(":").append(uri.getPort());
            }
            return sb.length() == 0 ? trimmed : sb.toString();
        }
        catch (Exception ignored) {
            return trimmed;
        }
    }

    private Color rankColor(int index) {
        if (index == 0) {
            return new Color(255, 215, 0);
        }
        if (index == 1) {
            return new Color(192, 192, 192);
        }
        if (index == 2) {
            return new Color(205, 127, 50);
        }
        return new Color(110, 150, 255);
    }

    public String wrapEllipsis(String text, FontMetrics fm, int maxWidth) {
        if (fm.stringWidth(text) <= maxWidth) {
            return text;
        }
        String ell = "\u2026";
        int ellW = fm.stringWidth(ell);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (fm.stringWidth(sb.toString() + c) + ellW > maxWidth) break;
            sb.append(c);
        }
        return sb.toString() + ell;
    }

    private String chooseBestNamePreferCJK(Map<String, Long> secondsByName) {
        String best = null;
        long bestVal = -1L;
        for (Map.Entry<String, Long> e : secondsByName.entrySet()) {
            if (e.getValue() <= bestVal) continue;
            bestVal = e.getValue();
            best = e.getKey();
        }
        String bestCJK = null;
        long bestCJKVal = -1L;
        for (Map.Entry<String, Long> e : secondsByName.entrySet()) {
            if (!this.isCJK(e.getKey()) || e.getValue() <= bestCJKVal) continue;
            bestCJKVal = e.getValue();
            bestCJK = e.getKey();
        }
        if (bestCJK != null && bestVal > 0L && (double)bestCJKVal >= (double)bestVal * 0.8) {
            return bestCJK;
        }
        return best == null ? "\u672a\u77e5" : best;
    }

    private boolean isCJK(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            Character.UnicodeBlock b = Character.UnicodeBlock.of(s.charAt(i));
            if (b != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS && b != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A && b != Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B && b != Character.UnicodeBlock.HIRAGANA && b != Character.UnicodeBlock.KATAKANA && b != Character.UnicodeBlock.HANGUL_SYLLABLES) continue;
            return true;
        }
        return false;
    }

    private Color colorFromName(String name) {
        if (name == null) {
            name = "user";
        }
        int h = name.hashCode();
        float hue = (float)(h & 0xFFFF) / 65535.0f;
        float sat = 0.55f;
        float bri = 0.95f;
        Color c = Color.getHSBColor(hue, sat, bri);
        int r = Math.min(255, (int)((double)c.getRed() * 0.95));
        int g = Math.min(255, (int)((double)c.getGreen() * 0.95));
        int b = Math.min(255, (int)((double)c.getBlue() * 0.95));
        return new Color(r, g, b);
    }

    private String getInitial(String name) {
        if (name == null || name.isEmpty()) {
            return "?";
        }
        char c = name.charAt(0);
        String s = String.valueOf(c).toUpperCase(Locale.ROOT);
        if (Character.isLetterOrDigit(c)) {
            return s.substring(0, 1);
        }
        return s;
    }

    private String formatHM(Date d) {
        if (d == null) {
            return "--:--";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        sdf.setTimeZone(this.ZONE);
        return sdf.format(d);
    }

    public String normalizeMovieTitle(String s) {
        return this.normalizeTitleBase(s, false);
    }

    public String normalizeSeriesTitle(String s) {
        return this.normalizeTitleBase(s, true);
    }

    public String normalizeTitleBase(String s, boolean isSeries) {
        String nt;
        if (s == null) {
            return "unknown";
        }
        String t = this.toHalfWidth(s).toLowerCase(Locale.ROOT);
        t = QUALITY_TAGS.matcher(t).replaceAll(" ");
        t = YEAR_ANY.matcher(t).replaceAll(" ");
        for (int i = 0; i < 5 && !(nt = t.replaceAll("[\\(\uff08\\[\u3010\\{][^\\)\uff09\\]\u3011\\}]{0,64}[\\)\uff09\\]\u3011\\}]", " ")).equals(t); ++i) {
            t = nt;
        }
        if (isSeries) {
            t = SEASON_TAGS.matcher(t).replaceAll(" ");
        }
        t = t.trim();
        t = t.replaceAll("[\\p{Punct}\\p{IsPunctuation}\\s\u00b7\u3000]", "");
        return t;
    }

    public String toHalfWidth(String input) {
        if (input == null) {
            return null;
        }
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            char c = chars[i];
            if (c == '\u3000') {
                chars[i] = 32;
                continue;
            }
            if (c < '\uff01' || c > '\uff5e') continue;
            chars[i] = (char)(c - 65248);
        }
        return new String(chars);
    }

    public void enableAA(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    public Font loadFontOrDefault(float size) {
        try {
            if (this.CUSTOM_FONT_PATH != null) {
                Font f = Font.createFont(0, new FileInputStream(this.CUSTOM_FONT_PATH));
                return f.deriveFont(size);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return new Font("SansSerif", 0, Math.round(size));
    }

    public String enc(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8);
    }

    public <T> T getJson(String url, Class<T> type) throws IOException {
        Request req = new Request.Builder().url(url).get().build();
        try (Response r = this.HTTP.newCall(req).execute();){
            if (!r.isSuccessful()) {
                throw new IOException("HTTP " + r.code() + " for " + url);
            }
            Object object = this.MAPPER.readValue(Objects.requireNonNull(r.body()).byteStream(), type);
            return (T)object;
        }
    }

    public long ticksToSeconds(long ticks) {
        return ticks / 10000000L;
    }

    public String formatDuration(long totalSeconds) {
        long hours = totalSeconds / 3600L;
        long minutes = totalSeconds % 3600L / 60L;
        long seconds = totalSeconds % 60L;
        if (hours > 0L) {
            return String.format("%d:%02d:%02d", hours, minutes, seconds);
        }
        return String.format("%02d:%02d", minutes, seconds);
    }

    public String buildEpCode(Integer season, Integer ep) {
        if (season == null && ep == null) {
            return null;
        }
        String s = season != null ? String.format("S%02d", season) : "S??";
        String e = ep != null ? String.format("E%02d", ep) : "E??";
        return s + e;
    }

    private String chooseBestName(Map<String, Long> secondsByName) {
        String best = null;
        long max = -1L;
        for (Map.Entry<String, Long> e : secondsByName.entrySet()) {
            if (e.getValue() <= max) continue;
            max = e.getValue();
            best = e.getKey();
        }
        return best == null ? "\u672a\u77e5" : best;
    }

    public int drawDatePill(Graphics2D g, String text, int x, int topY, Font font) {
        Font oldFont = g.getFont();
        Paint oldPaint = g.getPaint();
        Object aa = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        Object taa = g.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        int textW = fm.stringWidth(text);
        int textH = fm.getAscent() + fm.getDescent();
        int padX = 18;
        int padY = 10;
        int pillW = textW + padX * 2;
        int pillH = textH + padY * 2;
        int baseY = topY + padY + fm.getAscent();
        g.setColor(new Color(255, 255, 255, 36));
        g.fill(new RoundRectangle2D.Float(x, topY, pillW, pillH, pillH, pillH));
        g.setStroke(new BasicStroke(2.0f));
        g.setColor(new Color(255, 255, 255, 60));
        g.draw(new RoundRectangle2D.Float((float)x + 0.5f, (float)topY + 0.5f, (float)pillW - 1.0f, (float)pillH - 1.0f, pillH, pillH));
        g.setColor(new Color(0, 0, 0, 180));
        g.drawString(text, x + padX + 1, baseY + 1);
        GradientPaint gp = new GradientPaint(x, topY, new Color(144, 255, 197), x, topY + pillH, new Color(26, 163, 90));
        g.setPaint(gp);
        g.drawString(text, x + padX, baseY);
        g.setFont(oldFont);
        g.setPaint(oldPaint);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, aa);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, taa);
        return pillH;
    }

    public static class ViewerRow {
        String userId;
        String userName;
        long totalSeconds;
        int playCount;
        Date firstSeen;
        Date lastSeen;

        ViewerRow(String userId, String userName) {
            this.userId = userId;
            this.userName = userName;
        }
    }

    public static class MovieAgg {
        long totalSeconds;
        int playCount;
        Map<String, Long> secondsByMovieId = new HashMap<String, Long>();
        Map<String, Long> secondsByDisplayName = new HashMap<String, Long>();

        MovieAgg(String any) {
        }
    }

    public static class SeriesAgg {
        String anyDisplayName;
        long totalSeconds;
        int playCount;
        Set<String> episodes = new HashSet<String>();
        Map<String, Long> secondsBySeriesId = new HashMap<String, Long>();
        Map<String, Long> secondsByDisplayName = new HashMap<String, Long>();

        SeriesAgg(String displayName) {
            this.anyDisplayName = displayName;
        }
    }

    public static class MovieRow {
        String movieId;
        String title;
        long watchedSeconds;
        int playCount;

        MovieRow(String movieId, String title) {
            this.movieId = movieId;
            this.title = title;
        }
    }

    public static class SeriesRow {
        String seriesId;
        String seriesName;
        long totalSeconds;
        int playCount;
        Set<String> episodes = new HashSet<String>();

        SeriesRow(String seriesId, String seriesName) {
            this.seriesId = seriesId;
            this.seriesName = seriesName;
        }
    }

    public static class ActivityRow {
        String userName;
        Date start;
        Date end;
        long durationSeconds;

        ActivityRow(String userName, Date start, Date end, long durationSeconds) {
            this.userName = userName;
            this.start = start;
            this.end = end;
            this.durationSeconds = durationSeconds;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class EmbyUser {
        public String Id;
        public String Name;
        public Boolean IsHidden;
        public Boolean IsDisabled;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class UserData {
        public Date LastPlayedDate;
        public Boolean Played;
        public Long PlaybackPositionTicks;
        public Double PlayedPercentage;
        public Integer PlayCount;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class BaseItem {
        public String Id;
        public String Name;
        public String Type;
        public String SeriesName;
        public String SeriesId;
        public Integer IndexNumber;
        public Integer ParentIndexNumber;
        public Long RunTimeTicks;
        public UserData UserData;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class QueryResult {
        public List<BaseItem> Items;
        public Integer TotalRecordCount;
    }
}
