/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.net.Ipv4Util
 *  com.alibaba.fastjson2.JSONObject
 *  net.dreamlu.mica.ip2region.core.Ip2regionSearcher
 *  net.dreamlu.mica.ip2region.core.IpInfo
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import cn.hutool.core.net.Ipv4Util;
import com.alibaba.fastjson2.JSONObject;
import net.dreamlu.mica.ip2region.core.Ip2regionSearcher;
import net.dreamlu.mica.ip2region.core.IpInfo;
import org.springframework.util.StringUtils;

public class EmbyEventLogParserUtils {
    public static String success(String json, Ip2regionSearcher searchSearcher) {
        IpInfo ipInfo;
        JSONObject root = JSONObject.parseObject((String)json);
        String title = root.getString("Title");
        String description = root.getString("Description").split("\n")[0];
        String serverName = root.getJSONObject("Server").getString("Name");
        String userName = root.getJSONObject("User").getString("Name");
        String deviceName = root.getJSONObject("Session").getString("DeviceName");
        String clientApp = root.getJSONObject("Session").getString("Client");
        String remoteIp = root.getJSONObject("Session").getString("RemoteEndPoint");
        String ipAddress = "";
        boolean isInnerIP = Ipv4Util.isInnerIP((String)remoteIp);
        if (!isInnerIP && (ipInfo = searchSearcher.memorySearch(remoteIp)) != null) {
            ipAddress = ipInfo.getAddressAndIsp();
        }
        String result = String.format("* \u2705 %s%n%n\ud83d\udc64 \u7528\u6237\u540d: %s%n%n\ud83d\udda5\ufe0f \u670d\u52a1\u5668: %s%n%n\ud83d\udcf1 \u8bbe\u5907: %s%n%n\ud83d\udcf2 \u5ba2\u6237\u7aef: %s%n%n\ud83c\udf10 \u8fdc\u7a0bIP: %s %s%n%n\ud83d\udcdd \u8be6\u60c5: %s *", title, userName, serverName, deviceName, clientApp, remoteIp, ipAddress, description);
        return result;
    }

    public static String failed(String json, Ip2regionSearcher searchSearcher) {
        IpInfo ipInfo;
        boolean isInnerIP;
        JSONObject root = JSONObject.parseObject((String)json);
        String serverName = root.getJSONObject("Server").getString("Name");
        String deviceName = root.getJSONObject("DeviceInfo").getString("Name");
        String appName = root.getJSONObject("DeviceInfo").getString("AppName");
        String title = root.getString("Title");
        String description = root.getString("Description");
        String data = description.split("\n\n")[0];
        String ip = description.split("\n\n")[1];
        String ipAddress = "";
        if (StringUtils.hasText((String)ip) && !(isInnerIP = Ipv4Util.isInnerIP((String)ip)) && (ipInfo = searchSearcher.memorySearch(ip)) != null) {
            ipAddress = ipInfo.getAddressAndIsp();
        }
        String result = String.format("* \ud83d\udd12 %s%n%n\ud83d\udda5\ufe0f \u670d\u52a1\u5668: %s%n%n\ud83d\udcf1 \u8bbe\u5907: %s%n%n\ud83d\udcf2 \u5e94\u7528: %s%n%n\ud83d\udcdd \u8be6\u60c5: %s%n%n\ud83c\udf10 \u8fdc\u7a0bIP: %s %s *", title, serverName, deviceName, appName, data, ip, ipAddress);
        return result;
    }
}
