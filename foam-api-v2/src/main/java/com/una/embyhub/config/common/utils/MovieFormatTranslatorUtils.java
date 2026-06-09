/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieFormatTranslatorUtils {
    private static final Map<String, String> TRANSLATION_MAP = new HashMap<String, String>();
    private static final Pattern TRANSLATION_PATTERN;

    public static String translate(String format) {
        if (format == null || format.trim().isEmpty()) {
            return "";
        }
        String input = format.trim();
        StringBuilder result = new StringBuilder();
        Matcher matcher = TRANSLATION_PATTERN.matcher(input);
        int lastEnd = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (start > lastEnd) {
                result.append(input, lastEnd, start);
            }
            String matchedKey = input.substring(start, end);
            String translatedValue = TRANSLATION_MAP.get(matchedKey);
            result.append(translatedValue);
            lastEnd = end;
        }
        if (lastEnd < input.length()) {
            result.append(input.substring(lastEnd));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(MovieFormatTranslatorUtils.translate("1080p H264"));
        System.out.println(MovieFormatTranslatorUtils.translate("2160p HDR10+ Dolby Vision"));
        System.out.println(MovieFormatTranslatorUtils.translate("Bluray Remux HDR10 Adaptive"));
        System.out.println(MovieFormatTranslatorUtils.translate("H265 DTS-HD MA"));
        System.out.println(MovieFormatTranslatorUtils.translate("WEB-DL AAC"));
        System.out.println(MovieFormatTranslatorUtils.translate("AV1 Dolby Vision HDR10+"));
        System.out.println(MovieFormatTranslatorUtils.translate("4K UHD Blu-ray HDR10+ Atmos"));
        System.out.println(MovieFormatTranslatorUtils.translate("10-bit HLG BT.2020"));
        System.out.println(MovieFormatTranslatorUtils.translate("12-bit HDR10+ 4:4:4"));
        System.out.println(MovieFormatTranslatorUtils.translate("Directors Cut Dual Audio"));
        System.out.println(MovieFormatTranslatorUtils.translate("IMAX Enhanced 1080p"));
    }

    static {
        TRANSLATION_MAP.put("1080p", "1080p\u5168\u9ad8\u6e05");
        TRANSLATION_MAP.put("720p", "720p\u9ad8\u6e05");
        TRANSLATION_MAP.put("2160p", "2160p\u8d85\u9ad8\u6e05(4K)");
        TRANSLATION_MAP.put("4K", "4K\u8d85\u9ad8\u6e05");
        TRANSLATION_MAP.put("8K", "8K\u8d85\u9ad8\u6e05");
        TRANSLATION_MAP.put("1440p", "1440p\u51c64K");
        TRANSLATION_MAP.put("576p", "576p\u6807\u6e05");
        TRANSLATION_MAP.put("480p", "480p\u6807\u6e05");
        TRANSLATION_MAP.put("H264", "H.264");
        TRANSLATION_MAP.put("H265", "H.265/HEVC");
        TRANSLATION_MAP.put("HEVC", "H.265/HEVC");
        TRANSLATION_MAP.put("x264", "x264");
        TRANSLATION_MAP.put("x265", "x265");
        TRANSLATION_MAP.put("VP9", "VP9");
        TRANSLATION_MAP.put("AV1", "AV1");
        TRANSLATION_MAP.put("MPEG-2", "MPEG-2");
        TRANSLATION_MAP.put("MPEG-4", "MPEG-4");
        TRANSLATION_MAP.put("VC-1", "VC-1");
        TRANSLATION_MAP.put("ProRes", "ProRes");
        TRANSLATION_MAP.put("DNxHR", "DNxHR");
        TRANSLATION_MAP.put("AAC", "AAC");
        TRANSLATION_MAP.put("AC3", "\u675c\u6bd4\u6570\u5b57(AC-3)");
        TRANSLATION_MAP.put("EAC3", "\u675c\u6bd4\u6570\u5b57+(E-AC-3)");
        TRANSLATION_MAP.put("DTS", "DTS");
        TRANSLATION_MAP.put("DTS-HD MA", "DTS-HD \u4e3b\u97f3\u8f68");
        TRANSLATION_MAP.put("DTS:X", "DTS:X");
        TRANSLATION_MAP.put("TrueHD", "\u675c\u6bd4TrueHD");
        TRANSLATION_MAP.put("FLAC", "FLAC\u65e0\u635f\u97f3\u9891");
        TRANSLATION_MAP.put("PCM", "PCM");
        TRANSLATION_MAP.put("Opus", "Opus");
        TRANSLATION_MAP.put("MP3", "MP3");
        TRANSLATION_MAP.put("HDR", "\u9ad8\u52a8\u6001\u8303\u56f4");
        TRANSLATION_MAP.put("SDR", "\u6807\u51c6\u52a8\u6001\u8303\u56f4");
        TRANSLATION_MAP.put("HDR10", "HDR10");
        TRANSLATION_MAP.put("HDR10+", "HDR10+");
        TRANSLATION_MAP.put("Dolby Vision", "\u675c\u6bd4\u89c6\u754c");
        TRANSLATION_MAP.put("HDR10 Adaptive", "HDR10\u81ea\u9002\u5e94");
        TRANSLATION_MAP.put("HLG", "\u6df7\u5408\u5bf9\u6570\u4f3d\u9a6c(HLG)");
        TRANSLATION_MAP.put("Technicolor HDR", "\u7279\u827a\u5f69\u8272HDR");
        TRANSLATION_MAP.put("BT.2020", "BT.2020");
        TRANSLATION_MAP.put("Rec.2020", "Rec.2020");
        TRANSLATION_MAP.put("P3", "DCI-P3");
        TRANSLATION_MAP.put("Wide Color Gamut", "\u5e7f\u8272\u57df");
        TRANSLATION_MAP.put("Remux", "\u91cd\u5c01\u88c5");
        TRANSLATION_MAP.put("Bluray", "\u84dd\u5149");
        TRANSLATION_MAP.put("WEB-DL", "\u7f51\u7edc\u4e0b\u8f7d");
        TRANSLATION_MAP.put("WEBRip", "\u7f51\u7edcrips");
        TRANSLATION_MAP.put("HDTV", "\u9ad8\u6e05\u7535\u89c6");
        TRANSLATION_MAP.put("DVDRip", "DVDrips");
        TRANSLATION_MAP.put("Ultra HD", "\u8d85\u9ad8\u6e05");
        TRANSLATION_MAP.put("HD", "\u9ad8\u6e05");
        TRANSLATION_MAP.put("SD", "\u6807\u6e05");
        TRANSLATION_MAP.put("UHD", "\u8d85\u9ad8\u6e05");
        TRANSLATION_MAP.put("HFR", "\u9ad8\u5e27\u7387");
        TRANSLATION_MAP.put("SDR", "\u6807\u51c6\u52a8\u6001\u8303\u56f4");
        TRANSLATION_MAP.put("Atmos", "\u675c\u6bd4\u5168\u666f\u58f0");
        TRANSLATION_MAP.put("DTS:X", "DTS:X");
        TRANSLATION_MAP.put("Multi-Audio", "\u591a\u97f3\u9891");
        TRANSLATION_MAP.put("Dual Audio", "\u53cc\u97f3\u9891");
        TRANSLATION_MAP.put("Subbed", "\u5e26\u5b57\u5e55");
        TRANSLATION_MAP.put("Unrated", "\u672a\u5206\u7ea7");
        TRANSLATION_MAP.put("Extended", "\u52a0\u957f\u7248");
        TRANSLATION_MAP.put("Directors Cut", "\u5bfc\u6f14\u526a\u8f91\u7248");
        TRANSLATION_MAP.put("Limited", "\u9650\u91cf\u7248");
        TRANSLATION_MAP.put("Theatrical", "\u9662\u7ebf\u7248");
        TRANSLATION_MAP.put("IMAX", "IMAX");
        TRANSLATION_MAP.put("IMAX Enhanced", "IMAX\u589e\u5f3a\u7248");
        TRANSLATION_MAP.put("4K UHD Blu-ray", "4K\u8d85\u9ad8\u6e05\u84dd\u5149");
        TRANSLATION_MAP.put("HDR10+ Adaptive", "HDR10+\u81ea\u9002\u5e94");
        TRANSLATION_MAP.put("Dolby Atmos", "\u675c\u6bd4\u5168\u666f\u58f0");
        TRANSLATION_MAP.put("Hi-Res Audio", "\u9ad8\u89e3\u6790\u5ea6\u97f3\u9891");
        TRANSLATION_MAP.put("Lossless", "\u65e0\u635f");
        TRANSLATION_MAP.put("Lossy", "\u6709\u635f");
        TRANSLATION_MAP.put("Dual Layer", "\u53cc\u5c42");
        TRANSLATION_MAP.put("Triple Layer", "\u4e09\u5c42");
        TRANSLATION_MAP.put("Hybrid SDR/HDR", "\u6df7\u5408SDR/HDR");
        TRANSLATION_MAP.put("10-bit", "10\u4f4d");
        TRANSLATION_MAP.put("12-bit", "12\u4f4d");
        TRANSLATION_MAP.put("8-bit", "8\u4f4d");
        TRANSLATION_MAP.put("4:2:0", "4:2:0");
        TRANSLATION_MAP.put("4:2:2", "4:2:2");
        TRANSLATION_MAP.put("4:4:4", "4:4:4");
        TRANSLATION_MAP.put("High Bitrate", "\u9ad8\u7801\u7387");
        TRANSLATION_MAP.put("Low Bitrate", "\u4f4e\u7801\u7387");
        TRANSLATION_MAP.put("Variable Bitrate", "\u53ef\u53d8\u7801\u7387");
        TRANSLATION_MAP.put("Constant Bitrate", "\u56fa\u5b9a\u7801\u7387");
        ArrayList<String> keys = new ArrayList<String>(TRANSLATION_MAP.keySet());
        keys.sort((a, b) -> b.length() - a.length());
        StringBuilder patternBuilder = new StringBuilder();
        patternBuilder.append("(");
        for (int i = 0; i < keys.size(); ++i) {
            String key = (String)keys.get(i);
            String escapedKey = Pattern.quote(key);
            patternBuilder.append(escapedKey);
            if (i >= keys.size() - 1) continue;
            patternBuilder.append("|");
        }
        patternBuilder.append(")");
        TRANSLATION_PATTERN = Pattern.compile(patternBuilder.toString());
    }
}
