/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.core.net.Ipv4Util
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 *  net.dreamlu.mica.ip2region.core.Ip2regionSearcher
 *  net.dreamlu.mica.ip2region.core.IpInfo
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.net.Ipv4Util;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.utils.TimeStringPercentageCalculatorUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import lombok.Generated;
import net.dreamlu.mica.ip2region.core.Ip2regionSearcher;
import net.dreamlu.mica.ip2region.core.IpInfo;
import org.springframework.util.StringUtils;

public class PlaybackUtils {
    public static void main(String[] args) {
        String jsonStr = "{\"Title\":\"root \u5728 Google Chrome macOS \u4e0a\u505c\u6b62\u64ad\u653e \u5821\u5792\uff1a\u6234\u5b89\u5a1c - S1, Ep3 - \u9f50\u5fc3\u534f\u529b\",\"Description\":\"2025\u5e748\u670820\u65e5\u661f\u671f\u4e09 \u4e0b\u53485:35\",\"Date\":\"2025-08-20T09:35:38.7501240Z\",\"Event\":\"playback.stop\",\"User\":{\"Name\":\"root\",\"Id\":\"f7c3aeac133d42939840afe36b47c249\"},\"Item\":{\"Name\":\"\u9f50\u5fc3\u534f\u529b\",\"ServerId\":\"ccaa9fe18b2b4c23843e17a296f6c4ab\",\"Id\":\"5070\",\"DateCreated\":\"2025-06-13T05:45:32.0000000Z\",\"Container\":\"mp4\",\"SortName\":\"\u9f50\u5fc3\u534f\u529b\",\"PremiereDate\":\"2024-10-10T00:00:00.0000000Z\",\"ExternalUrls\":[{\"Name\":\"IMDb\",\"Url\":\"https://www.imdb.com/title/tt27766701\"},{\"Name\":\"TheTVDB\",\"Url\":\"https://thetvdb.com/?tab=episode&id=10594121\"},{\"Name\":\"Trakt\",\"Url\":\"https://trakt.tv/search/imdb/tt27766701\"}],\"Path\":\"/Emby\u5a92\u4f53\u5e93/\u7535\u89c6\u5267/\u5821\u5792\uff1a\u6234\u5b89\u5a1c (2024)/\u5821\u5792\uff1a\u6234\u5b89\u5a1c (2024).S01E03.mp4\",\"Overview\":\"\u7231\u6258\u96f7\u6d3e\u7231\u5fb7\u548c\u6234\u5b89\u5a1c\u524d\u5f80\u897f\u897f\u91cc\u6267\u884c\u4e00\u9879\u654f\u611f\u4efb\u52a1\uff0c\u800c\u8fd9\u9879\u4efb\u52a1\u5a01\u80c1\u5230\u4e86\u4e24\u4eba\u95f4\u7684\u8054\u76df\u3002\u7136\u800c\uff0c\u5728\u5730\u4e2d\u6d77\u7684\u9633\u5149\u4e0b\uff0c\u4e24\u4eba\u53d1\u73b0\u5f7c\u6b64\u95f4\u7684\u6e0a\u6e90\u8fdc\u4e0d\u6b62\u5404\u81ea\u7684\u76ee\u6807\u90a3\u4e48\u7b80\u5355\u3002\u516b\u5e74\u524d\uff0c\u6234\u5b89\u5a1c\u6f5c\u5165\u66fc\u63d0\u67ef\u5c14\u5e76\u6267\u884c\u4e86\u5979\u7684\u9996\u4e2a\u4efb\u52a1\u3002\",\"Taglines\":[],\"Genres\":[],\"CommunityRating\":5.8,\"RunTimeTicks\":58150720000,\"Size\":3985637894,\"FileName\":\"\u5821\u5792\uff1a\u6234\u5b89\u5a1c (2024).S01E03.mp4\",\"Bitrate\":5483182,\"ProductionYear\":2024,\"IndexNumber\":3,\"ParentIndexNumber\":1,\"RemoteTrailers\":[],\"ProviderIds\":{\"Tvdb\":\"10594121\",\"Imdb\":\"tt27766701\"},\"IsFolder\":false,\"ParentId\":\"5069\",\"Type\":\"Episode\",\"Studios\":[],\"GenreItems\":[],\"TagItems\":[],\"ParentLogoItemId\":\"5069\",\"ParentBackdropItemId\":\"5069\",\"ParentBackdropImageTags\":[\"2543b7b543bf2323f966eabeaa621942\"],\"SeriesName\":\"\u5821\u5792\uff1a\u6234\u5b89\u5a1c\",\"SeriesId\":\"5069\",\"SeasonId\":\"5082\",\"PrimaryImageAspectRatio\":1.7777777777777777,\"SeriesPrimaryImageTag\":\"d4b85cba2495fa80199598bf00cc8c5a\",\"SeasonName\":\"\u7b2c 1 \u5b63\",\"ImageTags\":{\"Primary\":\"7360654138d5f8034493953564f7ac17\"},\"BackdropImageTags\":[],\"ParentLogoImageTag\":\"7eeb4b11752a15465f86d9be58f45fc6\",\"MediaType\":\"Video\",\"Width\":1920,\"Height\":800},\"Server\":{\"Name\":\"\u6ce1\u6cab\u5a92\u4f53\u5e93\",\"Id\":\"ccaa9fe18b2b4c23843e17a296f6c4ab\",\"Version\":\"4.8.11.0\"},\"Session\":{\"RemoteEndPoint\":\"172.19.0.1\",\"Client\":\"Emby Web\",\"DeviceName\":\"Google Chrome macOS\",\"DeviceId\":\"5fc4faed-7ff4-46c4-8d7c-a790e3e0d33f\",\"ApplicationVersion\":\"4.8.11.0\",\"Id\":\"efde3240174bd96ddaf4d44b9cbc6fd2\"},\"PlaybackInfo\":{\"PlayedToCompletion\":false,\"PositionTicks\":11017133590,\"PlaylistIndex\":-1,\"PlaylistLength\":0,\"PlaySessionId\":\"ed32c041dddf4dcfa1329ed51c1ab780\"}}\n";
        PlaybackInfo playbackInfo = PlaybackUtils.parsePlaybackInfo(jsonStr, null);
        System.out.println(playbackInfo.toEmojiDescription());
    }

    public static PlaybackInfo parsePlaybackInfo(String data, Ip2regionSearcher searchSearcher) {
        IpInfo ipInfo;
        JSONObject json = JSON.parseObject((String)data);
        PlaybackInfo info = new PlaybackInfo();
        info.setOriginalTitle(json.getString("Title"));
        info.setDescription(json.getString("Description"));
        info.setDate(json.getString("Date"));
        info.setEvent(json.getString("Event"));
        JSONObject user = json.getJSONObject("User");
        info.setUserName(user.getString("Name"));
        info.setUserId(user.getString("Id"));
        JSONObject item = json.getJSONObject("Item");
        info.setItemName(item.getString("Name"));
        info.setItemId(item.getString("Id"));
        info.setOverview(item.getString("Overview"));
        info.setCommunityRating(item.getDouble("CommunityRating"));
        info.setRunTimeTicks(item.getLong("RunTimeTicks"));
        info.setSeriesName(item.getString("SeriesName"));
        info.setSeasonName(item.getString("SeasonName"));
        info.setFileName(item.getString("FileName"));
        info.setProductionYear(item.getInteger("ProductionYear"));
        info.setType(item.getString("Type"));
        info.setSeasonNumber(item.getInteger("ParentIndexNumber"));
        info.setEpisodeNumber(item.getInteger("IndexNumber"));
        JSONObject server = json.getJSONObject("Server");
        info.setServerName(server.getString("Name"));
        info.setServerId(server.getString("Id"));
        info.setServerVersion(server.getString("Version"));
        JSONObject session = json.getJSONObject("Session");
        info.setClient(session.getString("Client"));
        info.setDeviceName(session.getString("DeviceName"));
        info.setRemoteEndPoint(session.getString("RemoteEndPoint"));
        JSONObject playbackInfo = json.getJSONObject("PlaybackInfo");
        info.setPlayedToCompletion(playbackInfo.getBoolean("PlayedToCompletion"));
        info.setPositionTicks(playbackInfo.getLong("PositionTicks"));
        info.setPlaySessionId(playbackInfo.getString("PlaySessionId"));
        info.setFormattedTitle(PlaybackUtils.generateFormattedTitle(info));
        String remoteIp = PlaybackUtils.normalizeRemoteIp(info.getRemoteEndPoint());
        boolean isInnerIP = PlaybackUtils.isPrivateOrLocalIp(remoteIp);
        if (!isInnerIP && searchSearcher != null && StringUtils.hasText((String)remoteIp) && PlaybackUtils.isIpv4(remoteIp) && (ipInfo = searchSearcher.memorySearch(remoteIp)) != null) {
            info.setIpAddress(ipInfo.getAddressAndIsp());
        }
        return info;
    }

    private static String generateFormattedTitle(PlaybackInfo info) {
        StringBuilder title = new StringBuilder();
        String baseName = "Episode".equals(info.getType()) ? info.getSeriesName() : info.getItemName();
        title.append(baseName).append(" (").append(info.getProductionYear()).append(")");
        if ("Episode".equals(info.getType()) && info.getSeasonNumber() != null && info.getEpisodeNumber() != null) {
            title.append(" S").append(String.format("%02d", info.getSeasonNumber())).append("E").append(String.format("%02d", info.getEpisodeNumber())).append(" ").append(info.getItemName());
        }
        return title.toString();
    }

    private static String normalizeRemoteIp(String remoteEndPoint) {
        int endBracket;
        if (!StringUtils.hasText((String)remoteEndPoint)) {
            return remoteEndPoint;
        }
        String value = remoteEndPoint.trim();
        if (value.startsWith("[") && value.contains("]") && (endBracket = value.indexOf(93)) > 1) {
            return value.substring(1, endBracket);
        }
        int colonCount = 0;
        for (int i = 0; i < value.length(); ++i) {
            if (value.charAt(i) != ':') continue;
            ++colonCount;
        }
        if (colonCount == 1 && value.contains(".")) {
            return value.substring(0, value.indexOf(58));
        }
        return value;
    }

    private static boolean isPrivateOrLocalIp(String ip) {
        if (!StringUtils.hasText((String)ip)) {
            return true;
        }
        if (PlaybackUtils.isIpv4(ip)) {
            return Ipv4Util.isInnerIP((String)ip);
        }
        try {
            InetAddress address = InetAddress.getByName(ip);
            if (address.isAnyLocalAddress() || address.isLoopbackAddress() || address.isLinkLocalAddress() || address.isSiteLocalAddress()) {
                return true;
            }
            byte[] bytes = address.getAddress();
            return bytes != null && bytes.length == 16 && (bytes[0] & 0xFFFFFFFE) == -4;
        }
        catch (UnknownHostException ex) {
            return true;
        }
    }

    private static boolean isIpv4(String ip) {
        if (!StringUtils.hasText((String)ip)) {
            return false;
        }
        String[] segments = ip.split("\\.");
        if (segments.length != 4) {
            return false;
        }
        for (String segment : segments) {
            if (!StringUtils.hasText((String)segment) || segment.length() > 3) {
                return false;
            }
            for (int i = 0; i < segment.length(); ++i) {
                if (Character.isDigit(segment.charAt(i))) continue;
                return false;
            }
            int value = Integer.parseInt(segment);
            if (value >= 0 && value <= 255) continue;
            return false;
        }
        return true;
    }

    public static String formatTicksToTime(long ticks) {
        long seconds = ticks / 10000000L;
        long hours = seconds / 3600L;
        long minutes = seconds % 3600L / 60L;
        long secs = seconds % 60L;
        if (hours > 0L) {
            return String.format("%d:%d:%d", hours, minutes, secs);
        }
        return String.format("%d:%02d", minutes, secs);
    }

    public static class PlaybackInfo {
        private String originalTitle;
        private String formattedTitle;
        private String description;
        private String date;
        private String event;
        private String ipAddress;
        private String eventName;
        private String userName;
        private String userId;
        private String itemName;
        private String itemId;
        private String overview;
        private Double communityRating;
        private Long runTimeTicks = 0L;
        private String seriesName;
        private String seasonName;
        private String fileName;
        private Integer productionYear;
        private String type;
        private Integer seasonNumber;
        private Integer episodeNumber;
        private String serverName;
        private String serverId;
        private String serverVersion;
        private String client;
        private String deviceName;
        private String remoteEndPoint;
        private Boolean playedToCompletion;
        private Long positionTicks;
        private String playSessionId;

        public void setEvent(String event) {
            this.event = event;
            if ("playback.start".equals(event)) {
                this.eventName = "\u25b6\ufe0f \u5f00\u59cb\u64ad\u653e";
            }
            if ("playback.pause".equals(event)) {
                this.eventName = "\u23f8\ufe0f \u6682\u505c\u64ad\u653e";
            }
            if ("playback.unpause".equals(event)) {
                this.eventName = "\u25b6\ufe0f \u53d6\u6d88\u6682\u505c\u64ad\u653e";
            }
            if ("playback.stop".equals(event)) {
                this.eventName = "\u23f8\ufe0f \u505c\u6b62\u64ad\u653e";
            }
        }

        public String toEmojiDescription() {
            StringBuilder sb = new StringBuilder();
            sb.append("*");
            sb.append("\ud83c\udfa5 \u5a92\u4f53").append("\u64ad\u653e\u4e8b\u4ef6\u8be6\u60c5 \ud83c\udf1f\n");
            sb.append("\ud83d\udc64 \u7528\u6237\uff1a").append(this.userName).append(" ").append(this.eventName).append("\n");
            sb.append("\ud83d\udcfa \u6807\u9898: ").append(this.formattedTitle).append("\n");
            sb.append("\ud83c\udf0f \u7528\u6237\u5f52\u5c5e\u5730\uff1a").append(this.remoteEndPoint).append(" ").append(StringUtils.hasText((String)this.ipAddress) ? this.ipAddress : "\u672a\u77e5").append("\n");
            if (!StringUtils.hasText((String)this.description)) {
                this.description = DateUtil.formatDateTime((Date)new Date());
            }
            sb.append("\u23f0 \u64ad\u653e\u65f6\u95f4: ").append(this.description).append("\n");
            sb.append("\ud83d\udd75\ufe0f\u2640\ufe0f \u5267\u60c5\u6982\u8ff0:\n").append(this.overview).append("\n");
            String positionStr = PlaybackUtils.formatTicksToTime(this.positionTicks);
            String runtimeStr = PlaybackUtils.formatTicksToTime(this.runTimeTicks);
            sb.append("\u23ef\ufe0f \u64ad\u653e\u4f4d\u7f6e: ").append(positionStr).append(" / \u603b\u65f6\u957f").append(runtimeStr).append(" \u8fdb\u5ea6\u4e3a:" + TimeStringPercentageCalculatorUtils.calculatePercentage(positionStr, runtimeStr)).append("\n");
            sb.append("\u793e\u533a\u8bc4\u5206: \ud83c\udf1f").append(this.communityRating == null ? 0.0 : this.communityRating).append(" / 10\n");
            sb.append("\ud83d\udcbb \u5ba2\u6237\u7aef: ").append(this.client).append(" (").append(this.deviceName).append(")");
            sb.append("*");
            return sb.toString();
        }

        @Generated
        public PlaybackInfo() {
        }

        @Generated
        public String getOriginalTitle() {
            return this.originalTitle;
        }

        @Generated
        public String getFormattedTitle() {
            return this.formattedTitle;
        }

        @Generated
        public String getDescription() {
            return this.description;
        }

        @Generated
        public String getDate() {
            return this.date;
        }

        @Generated
        public String getEvent() {
            return this.event;
        }

        @Generated
        public String getIpAddress() {
            return this.ipAddress;
        }

        @Generated
        public String getEventName() {
            return this.eventName;
        }

        @Generated
        public String getUserName() {
            return this.userName;
        }

        @Generated
        public String getUserId() {
            return this.userId;
        }

        @Generated
        public String getItemName() {
            return this.itemName;
        }

        @Generated
        public String getItemId() {
            return this.itemId;
        }

        @Generated
        public String getOverview() {
            return this.overview;
        }

        @Generated
        public Double getCommunityRating() {
            return this.communityRating;
        }

        @Generated
        public Long getRunTimeTicks() {
            return this.runTimeTicks;
        }

        @Generated
        public String getSeriesName() {
            return this.seriesName;
        }

        @Generated
        public String getSeasonName() {
            return this.seasonName;
        }

        @Generated
        public String getFileName() {
            return this.fileName;
        }

        @Generated
        public Integer getProductionYear() {
            return this.productionYear;
        }

        @Generated
        public String getType() {
            return this.type;
        }

        @Generated
        public Integer getSeasonNumber() {
            return this.seasonNumber;
        }

        @Generated
        public Integer getEpisodeNumber() {
            return this.episodeNumber;
        }

        @Generated
        public String getServerName() {
            return this.serverName;
        }

        @Generated
        public String getServerId() {
            return this.serverId;
        }

        @Generated
        public String getServerVersion() {
            return this.serverVersion;
        }

        @Generated
        public String getClient() {
            return this.client;
        }

        @Generated
        public String getDeviceName() {
            return this.deviceName;
        }

        @Generated
        public String getRemoteEndPoint() {
            return this.remoteEndPoint;
        }

        @Generated
        public Boolean getPlayedToCompletion() {
            return this.playedToCompletion;
        }

        @Generated
        public Long getPositionTicks() {
            return this.positionTicks;
        }

        @Generated
        public String getPlaySessionId() {
            return this.playSessionId;
        }

        @Generated
        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        @Generated
        public void setFormattedTitle(String formattedTitle) {
            this.formattedTitle = formattedTitle;
        }

        @Generated
        public void setDescription(String description) {
            this.description = description;
        }

        @Generated
        public void setDate(String date) {
            this.date = date;
        }

        @Generated
        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        @Generated
        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        @Generated
        public void setUserName(String userName) {
            this.userName = userName;
        }

        @Generated
        public void setUserId(String userId) {
            this.userId = userId;
        }

        @Generated
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        @Generated
        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        @Generated
        public void setOverview(String overview) {
            this.overview = overview;
        }

        @Generated
        public void setCommunityRating(Double communityRating) {
            this.communityRating = communityRating;
        }

        @Generated
        public void setRunTimeTicks(Long runTimeTicks) {
            this.runTimeTicks = runTimeTicks;
        }

        @Generated
        public void setSeriesName(String seriesName) {
            this.seriesName = seriesName;
        }

        @Generated
        public void setSeasonName(String seasonName) {
            this.seasonName = seasonName;
        }

        @Generated
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        @Generated
        public void setProductionYear(Integer productionYear) {
            this.productionYear = productionYear;
        }

        @Generated
        public void setType(String type) {
            this.type = type;
        }

        @Generated
        public void setSeasonNumber(Integer seasonNumber) {
            this.seasonNumber = seasonNumber;
        }

        @Generated
        public void setEpisodeNumber(Integer episodeNumber) {
            this.episodeNumber = episodeNumber;
        }

        @Generated
        public void setServerName(String serverName) {
            this.serverName = serverName;
        }

        @Generated
        public void setServerId(String serverId) {
            this.serverId = serverId;
        }

        @Generated
        public void setServerVersion(String serverVersion) {
            this.serverVersion = serverVersion;
        }

        @Generated
        public void setClient(String client) {
            this.client = client;
        }

        @Generated
        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        @Generated
        public void setRemoteEndPoint(String remoteEndPoint) {
            this.remoteEndPoint = remoteEndPoint;
        }

        @Generated
        public void setPlayedToCompletion(Boolean playedToCompletion) {
            this.playedToCompletion = playedToCompletion;
        }

        @Generated
        public void setPositionTicks(Long positionTicks) {
            this.positionTicks = positionTicks;
        }

        @Generated
        public void setPlaySessionId(String playSessionId) {
            this.playSessionId = playSessionId;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof PlaybackInfo)) {
                return false;
            }
            PlaybackInfo other = (PlaybackInfo)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Double this$communityRating = this.getCommunityRating();
            Double other$communityRating = other.getCommunityRating();
            if (this$communityRating == null ? other$communityRating != null : !((Object)this$communityRating).equals(other$communityRating)) {
                return false;
            }
            Long this$runTimeTicks = this.getRunTimeTicks();
            Long other$runTimeTicks = other.getRunTimeTicks();
            if (this$runTimeTicks == null ? other$runTimeTicks != null : !((Object)this$runTimeTicks).equals(other$runTimeTicks)) {
                return false;
            }
            Integer this$productionYear = this.getProductionYear();
            Integer other$productionYear = other.getProductionYear();
            if (this$productionYear == null ? other$productionYear != null : !((Object)this$productionYear).equals(other$productionYear)) {
                return false;
            }
            Integer this$seasonNumber = this.getSeasonNumber();
            Integer other$seasonNumber = other.getSeasonNumber();
            if (this$seasonNumber == null ? other$seasonNumber != null : !((Object)this$seasonNumber).equals(other$seasonNumber)) {
                return false;
            }
            Integer this$episodeNumber = this.getEpisodeNumber();
            Integer other$episodeNumber = other.getEpisodeNumber();
            if (this$episodeNumber == null ? other$episodeNumber != null : !((Object)this$episodeNumber).equals(other$episodeNumber)) {
                return false;
            }
            Boolean this$playedToCompletion = this.getPlayedToCompletion();
            Boolean other$playedToCompletion = other.getPlayedToCompletion();
            if (this$playedToCompletion == null ? other$playedToCompletion != null : !((Object)this$playedToCompletion).equals(other$playedToCompletion)) {
                return false;
            }
            Long this$positionTicks = this.getPositionTicks();
            Long other$positionTicks = other.getPositionTicks();
            if (this$positionTicks == null ? other$positionTicks != null : !((Object)this$positionTicks).equals(other$positionTicks)) {
                return false;
            }
            String this$originalTitle = this.getOriginalTitle();
            String other$originalTitle = other.getOriginalTitle();
            if (this$originalTitle == null ? other$originalTitle != null : !this$originalTitle.equals(other$originalTitle)) {
                return false;
            }
            String this$formattedTitle = this.getFormattedTitle();
            String other$formattedTitle = other.getFormattedTitle();
            if (this$formattedTitle == null ? other$formattedTitle != null : !this$formattedTitle.equals(other$formattedTitle)) {
                return false;
            }
            String this$description = this.getDescription();
            String other$description = other.getDescription();
            if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
                return false;
            }
            String this$date = this.getDate();
            String other$date = other.getDate();
            if (this$date == null ? other$date != null : !this$date.equals(other$date)) {
                return false;
            }
            String this$event = this.getEvent();
            String other$event = other.getEvent();
            if (this$event == null ? other$event != null : !this$event.equals(other$event)) {
                return false;
            }
            String this$ipAddress = this.getIpAddress();
            String other$ipAddress = other.getIpAddress();
            if (this$ipAddress == null ? other$ipAddress != null : !this$ipAddress.equals(other$ipAddress)) {
                return false;
            }
            String this$eventName = this.getEventName();
            String other$eventName = other.getEventName();
            if (this$eventName == null ? other$eventName != null : !this$eventName.equals(other$eventName)) {
                return false;
            }
            String this$userName = this.getUserName();
            String other$userName = other.getUserName();
            if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
                return false;
            }
            String this$userId = this.getUserId();
            String other$userId = other.getUserId();
            if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) {
                return false;
            }
            String this$itemName = this.getItemName();
            String other$itemName = other.getItemName();
            if (this$itemName == null ? other$itemName != null : !this$itemName.equals(other$itemName)) {
                return false;
            }
            String this$itemId = this.getItemId();
            String other$itemId = other.getItemId();
            if (this$itemId == null ? other$itemId != null : !this$itemId.equals(other$itemId)) {
                return false;
            }
            String this$overview = this.getOverview();
            String other$overview = other.getOverview();
            if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
                return false;
            }
            String this$seriesName = this.getSeriesName();
            String other$seriesName = other.getSeriesName();
            if (this$seriesName == null ? other$seriesName != null : !this$seriesName.equals(other$seriesName)) {
                return false;
            }
            String this$seasonName = this.getSeasonName();
            String other$seasonName = other.getSeasonName();
            if (this$seasonName == null ? other$seasonName != null : !this$seasonName.equals(other$seasonName)) {
                return false;
            }
            String this$fileName = this.getFileName();
            String other$fileName = other.getFileName();
            if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) {
                return false;
            }
            String this$type = this.getType();
            String other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
                return false;
            }
            String this$serverName = this.getServerName();
            String other$serverName = other.getServerName();
            if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
                return false;
            }
            String this$serverId = this.getServerId();
            String other$serverId = other.getServerId();
            if (this$serverId == null ? other$serverId != null : !this$serverId.equals(other$serverId)) {
                return false;
            }
            String this$serverVersion = this.getServerVersion();
            String other$serverVersion = other.getServerVersion();
            if (this$serverVersion == null ? other$serverVersion != null : !this$serverVersion.equals(other$serverVersion)) {
                return false;
            }
            String this$client = this.getClient();
            String other$client = other.getClient();
            if (this$client == null ? other$client != null : !this$client.equals(other$client)) {
                return false;
            }
            String this$deviceName = this.getDeviceName();
            String other$deviceName = other.getDeviceName();
            if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
                return false;
            }
            String this$remoteEndPoint = this.getRemoteEndPoint();
            String other$remoteEndPoint = other.getRemoteEndPoint();
            if (this$remoteEndPoint == null ? other$remoteEndPoint != null : !this$remoteEndPoint.equals(other$remoteEndPoint)) {
                return false;
            }
            String this$playSessionId = this.getPlaySessionId();
            String other$playSessionId = other.getPlaySessionId();
            return !(this$playSessionId == null ? other$playSessionId != null : !this$playSessionId.equals(other$playSessionId));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof PlaybackInfo;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Double $communityRating = this.getCommunityRating();
            result = result * 59 + ($communityRating == null ? 43 : ((Object)$communityRating).hashCode());
            Long $runTimeTicks = this.getRunTimeTicks();
            result = result * 59 + ($runTimeTicks == null ? 43 : ((Object)$runTimeTicks).hashCode());
            Integer $productionYear = this.getProductionYear();
            result = result * 59 + ($productionYear == null ? 43 : ((Object)$productionYear).hashCode());
            Integer $seasonNumber = this.getSeasonNumber();
            result = result * 59 + ($seasonNumber == null ? 43 : ((Object)$seasonNumber).hashCode());
            Integer $episodeNumber = this.getEpisodeNumber();
            result = result * 59 + ($episodeNumber == null ? 43 : ((Object)$episodeNumber).hashCode());
            Boolean $playedToCompletion = this.getPlayedToCompletion();
            result = result * 59 + ($playedToCompletion == null ? 43 : ((Object)$playedToCompletion).hashCode());
            Long $positionTicks = this.getPositionTicks();
            result = result * 59 + ($positionTicks == null ? 43 : ((Object)$positionTicks).hashCode());
            String $originalTitle = this.getOriginalTitle();
            result = result * 59 + ($originalTitle == null ? 43 : $originalTitle.hashCode());
            String $formattedTitle = this.getFormattedTitle();
            result = result * 59 + ($formattedTitle == null ? 43 : $formattedTitle.hashCode());
            String $description = this.getDescription();
            result = result * 59 + ($description == null ? 43 : $description.hashCode());
            String $date = this.getDate();
            result = result * 59 + ($date == null ? 43 : $date.hashCode());
            String $event = this.getEvent();
            result = result * 59 + ($event == null ? 43 : $event.hashCode());
            String $ipAddress = this.getIpAddress();
            result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
            String $eventName = this.getEventName();
            result = result * 59 + ($eventName == null ? 43 : $eventName.hashCode());
            String $userName = this.getUserName();
            result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
            String $userId = this.getUserId();
            result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
            String $itemName = this.getItemName();
            result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
            String $itemId = this.getItemId();
            result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
            String $overview = this.getOverview();
            result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
            String $seriesName = this.getSeriesName();
            result = result * 59 + ($seriesName == null ? 43 : $seriesName.hashCode());
            String $seasonName = this.getSeasonName();
            result = result * 59 + ($seasonName == null ? 43 : $seasonName.hashCode());
            String $fileName = this.getFileName();
            result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
            String $type = this.getType();
            result = result * 59 + ($type == null ? 43 : $type.hashCode());
            String $serverName = this.getServerName();
            result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
            String $serverId = this.getServerId();
            result = result * 59 + ($serverId == null ? 43 : $serverId.hashCode());
            String $serverVersion = this.getServerVersion();
            result = result * 59 + ($serverVersion == null ? 43 : $serverVersion.hashCode());
            String $client = this.getClient();
            result = result * 59 + ($client == null ? 43 : $client.hashCode());
            String $deviceName = this.getDeviceName();
            result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
            String $remoteEndPoint = this.getRemoteEndPoint();
            result = result * 59 + ($remoteEndPoint == null ? 43 : $remoteEndPoint.hashCode());
            String $playSessionId = this.getPlaySessionId();
            result = result * 59 + ($playSessionId == null ? 43 : $playSessionId.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "PlaybackUtils.PlaybackInfo(originalTitle=" + this.getOriginalTitle() + ", formattedTitle=" + this.getFormattedTitle() + ", description=" + this.getDescription() + ", date=" + this.getDate() + ", event=" + this.getEvent() + ", ipAddress=" + this.getIpAddress() + ", eventName=" + this.getEventName() + ", userName=" + this.getUserName() + ", userId=" + this.getUserId() + ", itemName=" + this.getItemName() + ", itemId=" + this.getItemId() + ", overview=" + this.getOverview() + ", communityRating=" + this.getCommunityRating() + ", runTimeTicks=" + this.getRunTimeTicks() + ", seriesName=" + this.getSeriesName() + ", seasonName=" + this.getSeasonName() + ", fileName=" + this.getFileName() + ", productionYear=" + this.getProductionYear() + ", type=" + this.getType() + ", seasonNumber=" + this.getSeasonNumber() + ", episodeNumber=" + this.getEpisodeNumber() + ", serverName=" + this.getServerName() + ", serverId=" + this.getServerId() + ", serverVersion=" + this.getServerVersion() + ", client=" + this.getClient() + ", deviceName=" + this.getDeviceName() + ", remoteEndPoint=" + this.getRemoteEndPoint() + ", playedToCompletion=" + this.getPlayedToCompletion() + ", positionTicks=" + this.getPositionTicks() + ", playSessionId=" + this.getPlaySessionId() + ")";
        }
    }
}
