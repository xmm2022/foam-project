/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  cn.hutool.core.io.resource.ResourceUtil
 *  cn.hutool.core.io.unit.DataSizeUtil
 *  cn.hutool.core.io.unit.DataUnit
 *  cn.hutool.core.util.StrUtil
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.io.unit.DataSizeUtil;
import cn.hutool.core.io.unit.DataUnit;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.una.embyhub.config.common.constants.NotifyMessageType;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.NotifyUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.mapper.EmbyNotifyDataDetailsMapper;
import com.una.embyhub.model.dto.request.telegram.SendPhotoRequest;
import com.una.embyhub.model.dto.response.embynotifydatadetails.EmbyNotifyDataDetailsResponseData;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyNotifyData;
import com.una.embyhub.model.entity.EmbyNotifyDataDetails;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.EmbyNotifyDataDetailsService;
import com.una.embyhub.service.EmbyNotifyDataService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Configuration
@EnableScheduling
public class EmbyNotifyDataJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EmbyNotifyDataJob.class);
    @Autowired
    private EmbyNotifyDataService embyNotifyDataService;
    @Autowired
    private EmbyNotifyDataDetailsService embyNotifyDataDetailsService;
    @Autowired
    private NotifyUtils notifyUtils;
    @Autowired
    private EmbyNotifyDataDetailsMapper embyNotifyDataDetailsMapper;
    @Autowired
    private EmbyInfoService embyInfoService;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;

    @Scheduled(cron="0 * * * * *", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u5165\u5e93\u4efb\u52a1", remark="Emby\u5165\u5e93\u4f1a\u53d1\u9001\u5165\u5e93\u901a\u77e5")
    public void configureTasks() {
        log.info("\u5165\u5e93\u901a\u77e5\u5b9a\u65f6\u4efb\u52a1\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        List embyNotifyDataListMovie = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyNotifyDataService.getBaseMapper()).eq(EmbyNotifyData::getStatus, (Object)2)).and(x -> ((LambdaQueryWrapper)((LambdaQueryWrapper)x.eq(EmbyNotifyData::getType, (Object)"Movie")).or()).eq(EmbyNotifyData::getType, (Object)"movie"))).last("limit 5")).list();
        embyNotifyDataListMovie.forEach(embyNotifyData -> {
            try {
                SendPhotoRequest sendPhotoRequest = new SendPhotoRequest();
                if (!StringUtils.hasText((String)embyNotifyData.getImgUrl())) {
                    sendPhotoRequest.setImgUrlInputStream(ResourceUtil.getStream((String)"img/default.jpg"));
                }
                sendPhotoRequest.setName(this.addServerLabel(embyNotifyData.getEmbyInfoId(), embyNotifyData.getName()));
                sendPhotoRequest.setServerUrl(this.getServerUrl(embyNotifyData.getEmbyInfoId()));
                sendPhotoRequest.setServerName(this.getServerName(embyNotifyData.getEmbyInfoId()));
                sendPhotoRequest.setOverview(embyNotifyData.getOverview());
                sendPhotoRequest.setTmdbUrl(embyNotifyData.getTmdbUrl());
                sendPhotoRequest.setImgUrl(embyNotifyData.getImgUrl());
                sendPhotoRequest.setParseMode("Markdown");
                sendPhotoRequest.setProductionYear(StringUtils.hasText((String)embyNotifyData.getProductionYear()) ? Integer.valueOf(embyNotifyData.getProductionYear()) : null);
                sendPhotoRequest.setGenres(embyNotifyData.getGenres());
                sendPhotoRequest.setType(embyNotifyData.getType());
                sendPhotoRequest.setDisplayTitle(embyNotifyData.getDisplayTitle());
                sendPhotoRequest.setSize(DataSizeUtil.format((Long)Long.valueOf(embyNotifyData.getSize()), (DataUnit)DataUnit.GIGABYTES));
                sendPhotoRequest.setBackdropPath(embyNotifyData.getBackdropPath());
                sendPhotoRequest.setVoteAverage(embyNotifyData.getVoteAverage());
                sendPhotoRequest.setVoteCount(embyNotifyData.getVoteCount());
                sendPhotoRequest.setProductionCountries(embyNotifyData.getProductionCountries());
                this.notifyUtils.sendMultiChannel(sendPhotoRequest, "media_photo_detail", NotifyMessageType.PHOTO_DETAIL, true, "telegram", "wechat", "wechatBot", "dingding", "messagepush");
                embyNotifyData.setStatus(1);
                this.embyNotifyDataService.updateById(embyNotifyData);
            }
            catch (Exception e) {
                e.printStackTrace();
                log.error("\u7535\u5f71\u53d1\u9001\u901a\u77e5\u5931\u8d25\uff1a{}", (Object)e.getMessage());
                embyNotifyData.setStatus(0);
                this.embyNotifyDataService.updateById(embyNotifyData);
            }
        });
        List<EmbyNotifyDataDetailsResponseData> embyNotifyDataDetailsResponseDataList = this.embyNotifyDataDetailsMapper.getEmbyNotifyDataDetails();
        embyNotifyDataDetailsResponseDataList.forEach(embyNotifyDataDetailsResponseData -> {
            block10: {
                List idList = StrUtil.split((CharSequence)embyNotifyDataDetailsResponseData.getIdList(), (CharSequence)",");
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    EmbyNotifyData embyNotifyData = (EmbyNotifyData)this.embyNotifyDataService.getById(embyNotifyDataDetailsResponseData.getEmbyNotifyDataId());
                    if (embyNotifyData == null) {
                        return;
                    }
                    SendPhotoRequest sendPhotoRequest = new SendPhotoRequest();
                    if (!StringUtils.hasText((String)embyNotifyData.getImgUrl())) {
                        sendPhotoRequest.setImgUrlInputStream(ResourceUtil.getStream((String)"img/default.jpg"));
                    }
                    if ("Episode".equals(embyNotifyData.getType())) {
                        stringBuilder.append("\ud83d\udc26\u200d\ud83d\udd25 \u65b0\u589e");
                        stringBuilder.append(embyNotifyDataDetailsResponseData.getCount());
                        stringBuilder.append("\u96c6 \ud83d\udc26\u200d\ud83d\udd25\n\n");
                        stringBuilder.append(embyNotifyDataDetailsResponseData.getEpisodeList());
                    }
                    if ("Series".equals(embyNotifyData.getType())) {
                        stringBuilder.append("\ud83d\udc26\u200d\ud83d\udd25 \u65b0\u589e\u5185\u5bb9\u6c47\u603b \ud83d\udc26\u200d\ud83d\udd25\n\n");
                        stringBuilder.append("\ud83e\udddd\ud83c\udffb\u200d\u2640\ufe0f " + embyNotifyDataDetailsResponseData.getEpisodeList());
                    }
                    sendPhotoRequest.setTvInfo(stringBuilder.toString());
                    sendPhotoRequest.setName(this.addServerLabel(embyNotifyDataDetailsResponseData.getEmbyInfoId(), embyNotifyData.getName()));
                    sendPhotoRequest.setServerUrl(this.getServerUrl(embyNotifyDataDetailsResponseData.getEmbyInfoId()));
                    sendPhotoRequest.setServerName(this.getServerName(embyNotifyDataDetailsResponseData.getEmbyInfoId()));
                    sendPhotoRequest.setOverview(embyNotifyData.getOverview());
                    sendPhotoRequest.setTmdbUrl(embyNotifyData.getTmdbUrl());
                    sendPhotoRequest.setImgUrl(embyNotifyData.getImgUrl());
                    sendPhotoRequest.setParseMode("Markdown");
                    sendPhotoRequest.setProductionYear(StringUtils.hasText((String)embyNotifyData.getProductionYear()) ? Integer.valueOf(embyNotifyData.getProductionYear()) : null);
                    sendPhotoRequest.setGenres(embyNotifyData.getGenres());
                    sendPhotoRequest.setType(embyNotifyData.getType());
                    sendPhotoRequest.setDisplayTitle(embyNotifyData.getDisplayTitle());
                    sendPhotoRequest.setSize(DataSizeUtil.format((Long)embyNotifyDataDetailsResponseData.getTotalSize(), (DataUnit)DataUnit.GIGABYTES));
                    sendPhotoRequest.setBackdropPath(embyNotifyData.getBackdropPath());
                    sendPhotoRequest.setVoteAverage(embyNotifyData.getVoteAverage());
                    sendPhotoRequest.setVoteCount(embyNotifyData.getVoteCount());
                    sendPhotoRequest.setProductionCountries(embyNotifyData.getProductionCountries());
                    this.notifyUtils.sendMultiChannel(sendPhotoRequest, "media_photo_detail", NotifyMessageType.PHOTO_DETAIL, true, "telegram", "dingding", "messagepush");
                    StringBuilder wechatSb = new StringBuilder();
                    String compactTvInfo = this.formatTvSeasonEpisodes(embyNotifyData.getName(), embyNotifyDataDetailsResponseData.getEpisodeList());
                    if ("Episode".equals(embyNotifyData.getType())) {
                        wechatSb.append("\ud83d\udc26\u200d\ud83d\udd25 \u65b0\u589e");
                        wechatSb.append(embyNotifyDataDetailsResponseData.getCount());
                        wechatSb.append("\u96c6 \ud83d\udc26\u200d\ud83d\udd25\n\n");
                        wechatSb.append(StringUtils.hasText((String)compactTvInfo) ? compactTvInfo : embyNotifyDataDetailsResponseData.getEpisodeList());
                    } else if ("Series".equals(embyNotifyData.getType())) {
                        wechatSb.append("\ud83d\udc26\u200d\ud83d\udd25 \u65b0\u589e\u5185\u5bb9\u6c47\u603b \ud83d\udc26\u200d\ud83d\udd25\n\n");
                        wechatSb.append("\ud83e\udddd\ud83c\udffb\u200d\u2640\ufe0f ").append(StringUtils.hasText((String)compactTvInfo) ? compactTvInfo : embyNotifyDataDetailsResponseData.getEpisodeList());
                    }
                    sendPhotoRequest.setTvInfo(wechatSb.toString());
                    String customPosterEnabled = this.configCacheLoaderUtils.getConfigValue("custom_poster_enabled");
                    if ("true".equalsIgnoreCase(customPosterEnabled)) {
                        sendPhotoRequest.setName(sendPhotoRequest.getName() + " " + compactTvInfo);
                    }
                    sendPhotoRequest.setProductionCountries(embyNotifyData.getProductionCountries());
                    this.notifyUtils.sendMultiChannel(sendPhotoRequest, "media_photo_detail", NotifyMessageType.PHOTO_DETAIL, true, "wechat", "wechatBot");
                    ((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)new LambdaUpdateChainWrapper(this.embyNotifyDataDetailsService.getBaseMapper()).in(EmbyNotifyDataDetails::getId, (Collection)idList)).set(EmbyNotifyDataDetails::getStatus, (Object)1)).set(BaseEntity::getUpdateDatetime, (Object)new Date())).update();
                }
                catch (Exception e) {
                    e.printStackTrace();
                    log.error("\u7535\u89c6\u5267\u53d1\u9001\u901a\u77e5\u5931\u8d25\uff1a{}", (Object)e.getMessage());
                    if (CollectionUtils.isEmpty((Collection)idList)) break block10;
                    ((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)new LambdaUpdateChainWrapper(this.embyNotifyDataDetailsService.getBaseMapper()).in(EmbyNotifyDataDetails::getId, (Collection)idList)).set(EmbyNotifyDataDetails::getStatus, (Object)0)).set(BaseEntity::getUpdateDatetime, (Object)new Date())).update();
                }
            }
        });
    }

    private String formatTvSeasonEpisodes(String name, String episodeList) {
        try {
            Pattern seasonPattern;
            Matcher matcher;
            String seasonStr = "S01";
            if (StrUtil.isNotBlank((CharSequence)name) && (matcher = (seasonPattern = Pattern.compile("\u7b2c(\\d+)\u5b63")).matcher(name)).find()) {
                int s = Integer.parseInt(matcher.group(1));
                seasonStr = String.format("S%02d", s);
            }
            if (StrUtil.isBlank((CharSequence)episodeList)) {
                return "";
            }
            ArrayList<Integer> episodes = new ArrayList<Integer>();
            Pattern episodePattern = Pattern.compile("\u7b2c(\\d+)\u96c6");
            Matcher epMatcher = episodePattern.matcher(episodeList);
            while (epMatcher.find()) {
                episodes.add(Integer.parseInt(epMatcher.group(1)));
            }
            if (episodes.isEmpty()) {
                return "";
            }
            Collections.sort(episodes);
            StringBuilder sb = new StringBuilder(seasonStr);
            ArrayList<String> groups = new ArrayList<String>();
            if (!episodes.isEmpty()) {
                int start;
                int end = start = ((Integer)episodes.get(0)).intValue();
                for (int i = 1; i < episodes.size(); ++i) {
                    int current = (Integer)episodes.get(i);
                    if (current == end + 1) {
                        end = current;
                        continue;
                    }
                    groups.add(this.formatRange(start, end));
                    start = current;
                    end = current;
                }
                groups.add(this.formatRange(start, end));
            }
            sb.append(String.join((CharSequence)" ,", groups));
            return sb.toString();
        }
        catch (Exception e) {
            log.error("\u89e3\u6790\u5267\u96c6\u4fe1\u606f\u5931\u8d25", (Throwable)e);
            return "";
        }
    }

    private String formatRange(int start, int end) {
        if (start == end) {
            return String.format("E%02d", start);
        }
        return String.format("E%02d-E%02d", start, end);
    }

    private String addServerLabel(Long embyInfoId, String name) {
        return StringUtils.hasText((String)name) ? name : "\u672a\u83b7\u53d6\u5230\u5f71\u7247\u540d\u79f0";
    }

    private String getServerLabel(Long embyInfoId) {
        EmbyInfo embyInfo;
        EmbyInfo embyInfo2 = embyInfo = embyInfoId != null ? (EmbyInfo)this.embyInfoService.getById(embyInfoId) : null;
        if (embyInfo != null && StringUtils.hasText((String)embyInfo.getEmbyUrl())) {
            return embyInfo.getEmbyUrl();
        }
        return "\u9ed8\u8ba4\u670d\u52a1\u5668";
    }

    private String getServerName(Long embyInfoId) {
        EmbyInfo embyInfo;
        EmbyInfo embyInfo2 = embyInfo = embyInfoId != null ? (EmbyInfo)this.embyInfoService.getById(embyInfoId) : null;
        if (embyInfo != null && StringUtils.hasText((String)embyInfo.getServerName())) {
            return embyInfo.getServerName();
        }
        return null;
    }

    private String getServerUrl(Long embyInfoId) {
        EmbyInfo embyInfo;
        EmbyInfo embyInfo2 = embyInfo = embyInfoId != null ? (EmbyInfo)this.embyInfoService.getById(embyInfoId) : null;
        if (embyInfo == null) {
            return null;
        }
        String url = embyInfo.getEmbyUrl();
        if (StringUtils.hasText((String)url) && (url.startsWith("http://") || url.startsWith("https://"))) {
            return url;
        }
        StringBuilder builder = new StringBuilder();
        if (StringUtils.hasText((String)embyInfo.getEmbyAgreement())) {
            builder.append(embyInfo.getEmbyAgreement()).append("://");
        }
        if (StringUtils.hasText((String)embyInfo.getEmbyUrl())) {
            builder.append(embyInfo.getEmbyUrl());
        }
        if (StringUtils.hasText((String)embyInfo.getEmbyPort())) {
            if (embyInfo.getEmbyUrl() != null && !embyInfo.getEmbyUrl().contains(":")) {
                builder.append(":");
            }
            builder.append(embyInfo.getEmbyPort());
        }
        return builder.length() > 0 ? builder.toString() : null;
    }
}
