/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.utils;

import java.text.DecimalFormat;

public class TimeStringPercentageCalculatorUtils {
    public static String calculatePercentage(String currentTime, String totalTime) {
        int currentSeconds = TimeStringPercentageCalculatorUtils.parseTimeToSeconds(currentTime);
        int totalSeconds = TimeStringPercentageCalculatorUtils.parseTimeToSeconds(totalTime);
        if (totalSeconds <= 0) {
            throw new IllegalArgumentException("\u603b\u65f6\u957f\u4e0d\u80fd\u4e3a0\u6216\u8d1f\u6570");
        }
        if (currentSeconds > totalSeconds) {
            throw new IllegalArgumentException("\u5f53\u524d\u65f6\u95f4\u4e0d\u80fd\u8d85\u8fc7\u603b\u65f6\u957f");
        }
        double doublePercentage = (double)currentSeconds / (double)totalSeconds * 100.0;
        String formatPercentage = TimeStringPercentageCalculatorUtils.formatPercentage(doublePercentage);
        return formatPercentage;
    }

    private static int parseTimeToSeconds(String timeString) {
        if (timeString == null || timeString.trim().isEmpty()) {
            throw new IllegalArgumentException("\u65f6\u95f4\u5b57\u7b26\u4e32\u4e0d\u80fd\u4e3a\u7a7a");
        }
        String[] parts = timeString.split(":");
        try {
            int seconds = 0;
            int minutes = 0;
            int hours = 0;
            if (parts.length == 2) {
                minutes = Integer.parseInt(parts[0]);
                seconds = Integer.parseInt(parts[1]);
            } else {
                hours = Integer.parseInt(parts[0]);
                minutes = Integer.parseInt(parts[1]);
                seconds = Integer.parseInt(parts[2]);
            }
            if (hours < 0 || hours > 23) {
                throw new IllegalArgumentException("\u5c0f\u65f6\u5fc5\u987b\u57280-23\u4e4b\u95f4");
            }
            if (minutes < 0 || minutes > 59) {
                throw new IllegalArgumentException("\u5206\u949f\u5fc5\u987b\u57280-59\u4e4b\u95f4");
            }
            if (seconds < 0 || seconds > 59) {
                throw new IllegalArgumentException("\u79d2\u5fc5\u987b\u57280-59\u4e4b\u95f4");
            }
            return hours * 3600 + minutes * 60 + seconds;
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("\u65f6\u95f4\u683c\u5f0f\u65e0\u6548\uff0c\u5fc5\u987b\u5305\u542b\u6570\u5b57");
        }
    }

    public static String formatPercentage(double percentage) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(percentage) + "%";
    }
}
