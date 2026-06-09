/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.dingtalk.api.DefaultDingTalkClient
 *  com.dingtalk.api.request.OapiRobotSendRequest
 *  com.dingtalk.api.request.OapiRobotSendRequest$Markdown
 *  com.dingtalk.api.response.OapiRobotSendResponse
 *  com.taobao.api.TaobaoRequest
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.una.embyhub.config.common.utils;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.TaobaoRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DingDingUtils {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(DingDingUtils.class);
    private static final String WEBHOOK_BASE_URL = "https://oapi.dingtalk.com/robot/send";

    public static void sendMarkdownMessage(String accessToken, String secret, String title, String text) throws Exception {
        long timestamp = System.currentTimeMillis();
        String sign = DingDingUtils.generateSign(timestamp, secret);
        String fullUrl = "https://oapi.dingtalk.com/robot/send?access_token=" + accessToken + "&timestamp=" + timestamp + "&sign=" + sign;
        DefaultDingTalkClient client = new DefaultDingTalkClient(fullUrl);
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype("markdown");
        OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
        markdown.setTitle(title);
        markdown.setText(text);
        request.setMarkdown(markdown);
        OapiRobotSendResponse response = (OapiRobotSendResponse)client.execute((TaobaoRequest)request);
        DingDingUtils.handleResponse(response);
    }

    private static String generateSign(long timestamp, String secret) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8));
        String sign = Base64.getEncoder().encodeToString(signData);
        return URLEncoder.encode(sign, "UTF-8");
    }

    private static void handleResponse(OapiRobotSendResponse response) {
        if (!response.isSuccess()) {
            log.info("\u9489\u9489\u6d88\u606f\u53d1\u9001\u5931\u8d25\uff0c\u9519\u8bef\u7801\uff1a" + response.getErrorCode());
            log.info("\u9489\u9489\u9519\u8bef\u4fe1\u606f\uff1a" + response.getErrmsg());
            throw new RuntimeException("\u9489\u9489\u6d88\u606f\u53d1\u9001\u5931\u8d25");
        }
        log.info("\u9489\u9489\u6d88\u606f\u53d1\u9001\u6210\u529f");
    }
}
