/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.una.embyhub.config.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpisodeParserUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(EpisodeParserUtils.class);

    public static void main(String[] args) {
        String input1 = "\u65b0 \u67ef\u5357\u975e\u8d70\u4e0d\u53ef - S1, Ep1 - \u7b2c1\u8bdd \u5728 c32cb9537bfe";
        String input2 = "\u52a8\u6f2b\u540d\u79f0 - S2, Ep3 - \u7cbe\u5f69\u7247\u6bb5 \u5728 abc123";
        String input3 = "\u67d0\u7535\u89c6\u5267 - S5, Ep10 - \u5927\u7ed3\u5c40";
        EpisodeParserUtils.parseEpisodeInfo(input1);
        EpisodeParserUtils.parseEpisodeInfo(input2);
        EpisodeParserUtils.parseEpisodeInfo(input3);
    }

    public static String parseEpisodeInfo(String input) {
        String patternStr = "S(\\d+),\\s*Ep(\\d+)";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int season = Integer.parseInt(matcher.group(1));
            int episode = Integer.parseInt(matcher.group(2));
            String seasonDesc = "\u7b2c" + season + "\u5b63";
            String episodeDesc = "\u7b2c" + episode + "\u96c6";
            log.info("\u539f\u59cb\u5b57\u7b26\u4e32: " + input);
            log.info("\u89e3\u6790\u7ed3\u679c: " + seasonDesc + " " + episodeDesc);
            log.info("------------------------");
            return seasonDesc + " " + episodeDesc;
        }
        log.info("\u672a\u627e\u5230\u5339\u914d\u7684\u96c6\u6570\u4fe1\u606f: " + input);
        return "";
    }

    public static EpisodeInfo parseEpisodeInfoWithReturn(String input) {
        String patternStr = "S(\\d+),\\s*Ep(\\d+)";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int season = Integer.parseInt(matcher.group(1));
            int episode = Integer.parseInt(matcher.group(2));
            return new EpisodeInfo(season, episode);
        }
        return null;
    }

    public static class EpisodeInfo {
        private int season;
        private int episode;

        public EpisodeInfo(int season, int episode) {
            this.season = season;
            this.episode = episode;
        }

        public int getSeason() {
            return this.season;
        }

        public int getEpisode() {
            return this.episode;
        }

        public String toString() {
            return this.season + "\u5b63 \u7b2c" + this.episode + "\u96c6";
        }
    }
}
