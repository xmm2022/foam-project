/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.playbackreporting;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Generated;

public class HourlyReportResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, Integer> hourlyData;

    public HourlyReportResponse() {
        this.hourlyData = new LinkedHashMap<String, Integer>();
    }

    public HourlyReportResponse(Map<String, Integer> hourlyData) {
        this.hourlyData = hourlyData;
    }

    public static HourlyReportResponse fromMap(Map<String, Object> data) {
        HourlyReportResponse response = new HourlyReportResponse();
        if (data != null) {
            data.forEach((key, value) -> {
                if (value instanceof Number) {
                    response.getHourlyData().put((String)key, ((Number)value).intValue());
                }
            });
        }
        return response;
    }

    public int getPlayCount(int day, int hour) {
        String key = String.format("%d-%02d", day, hour);
        return this.hourlyData.getOrDefault(key, 0);
    }

    public int getDayTotal(int day) {
        int total = 0;
        for (int hour = 0; hour < 24; ++hour) {
            total += this.getPlayCount(day, hour);
        }
        return total;
    }

    public int getTotalPlayCount() {
        return this.hourlyData.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Generated
    public Map<String, Integer> getHourlyData() {
        return this.hourlyData;
    }

    @Generated
    public void setHourlyData(Map<String, Integer> hourlyData) {
        this.hourlyData = hourlyData;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HourlyReportResponse)) {
            return false;
        }
        HourlyReportResponse other = (HourlyReportResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Map<String, Integer> this$hourlyData = this.getHourlyData();
        Map<String, Integer> other$hourlyData = other.getHourlyData();
        return !(this$hourlyData == null ? other$hourlyData != null : !((Object)this$hourlyData).equals(other$hourlyData));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof HourlyReportResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Map<String, Integer> $hourlyData = this.getHourlyData();
        result = result * 59 + ($hourlyData == null ? 43 : ((Object)$hourlyData).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "HourlyReportResponse(hourlyData=" + String.valueOf(this.getHourlyData()) + ")";
    }
}
