/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.annotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum OperationLogDesc {
    USER_LOGIN("\u7528\u6237\u767b\u5f55"),
    USER_LOGOUT("\u7528\u6237\u9000\u51fa"),
    ADD_USER_ADMIN("\u65b0\u589e\u7528\u6237\uff08\u7ba1\u7406\u5458\uff09"),
    ADD_USER_CARD("\u65b0\u589e\u7528\u6237\uff08\u5361\u5bc6\u6fc0\u6d3b\uff09"),
    UPDATE_PASSWORD("\u4fee\u6539\u5bc6\u7801"),
    DISABLE_USER("\u7981\u7528\u7528\u6237"),
    ENABLE_USER("\u542f\u7528\u7528\u6237"),
    RENEW_API_ADMIN("\u7eed\u8d39\u63a5\u53e3\uff08\u7ba1\u7406\u5458\uff09"),
    RENEW_API_USER("\u7eed\u8d39\u63a5\u53e3\uff08\u7528\u6237\uff09"),
    EXTEND_EXPIRED_USER("\u6279\u91cf\u5ef6\u671f\u8fc7\u671f\u7528\u6237"),
    DELETE_USER("\u5220\u9664\u7528\u6237"),
    USER_STATISTICS("\u7528\u6237\u7edf\u8ba1"),
    UPDATE_USER_INFO("\u4fee\u6539\u7528\u6237\u4fe1\u606f"),
    SYNC_USER("\u540c\u6b65\u7528\u6237"),
    SYNC_USER_BETWEEN_SERVER("\u8de8\u670d\u52a1\u5668\u540c\u6b65\u7528\u6237"),
    REGISTERED_USER("\u6ce8\u518c\u7528\u6237"),
    SYNC_USER_STATUS_CONSISTENCY("\u540c\u6b65\u7528\u6237\u72b6\u6001\u4e00\u81f4\u6027"),
    QUERY_PLAY_RECORD("\u67e5\u8be2\u64ad\u653e\u8bb0\u5f55"),
    PLAY_STATISTICS("\u64ad\u653e\u7edf\u8ba1"),
    QUERY_SIMULTANEOUS_PLAYBACK("\u67e5\u8be2\u540c\u65f6\u64ad\u653e\u8bb0\u5f55"),
    ADD_REQUEST("\u65b0\u589e\u6c42\u7247"),
    UPDATE_REQUEST("\u4fee\u6539\u6c42\u7247"),
    DELETE_REQUEST("\u5220\u9664\u6c42\u7247"),
    UPDATE_REQUEST_STATUS("\u4fee\u6539\u6c42\u7247\u72b6\u6001"),
    REJECT_REQUEST("\u62d2\u7edd\u6c42\u7247"),
    QUERY_SYSTEM_CONFIG("\u67e5\u8be2\u7cfb\u7edf\u914d\u7f6e"),
    UPDATE_SYSTEM_CONFIG("\u4fee\u6539\u7cfb\u7edf\u914d\u7f6e"),
    QUERY_CARD_MANAGEMENT("\u67e5\u8be2\u5361\u5bc6\u7ba1\u7406"),
    VERIFY_CARD("\u5361\u5bc6\u9a8c\u8bc1"),
    BATCH_ADD_CARD("\u6279\u91cf\u6dfb\u52a0\u5361\u5bc6"),
    BATCH_DELETE_CARD("\u6279\u91cf\u5220\u9664\u5361\u5bc6"),
    QUERY_NULLBR("\u67e5\u8be2nullbr\u63a5\u53e3"),
    NOTIFY_CHANNEL_QUERY("\u67e5\u8be2\u901a\u77e5\u6e20\u9053"),
    NOTIFY_CHANNEL_ADD("\u65b0\u589e\u901a\u77e5\u6e20\u9053"),
    NOTFIY_CHANNEL_UPDATE("\u4fee\u6539\u901a\u77e5\u6e20\u9053"),
    NOTIFY_CHANNEL_DELETE("\u5220\u9664\u901a\u77e5\u6e20\u9053"),
    NOTIFY_TEMPLATE_QUERY("\u67e5\u8be2\u901a\u77e5\u6a21\u677f"),
    NOTIFY_TEMPLATE_ADD("\u65b0\u589e\u901a\u77e5\u6a21\u677f"),
    NOTIFY_TEMPLATE_UPDATE("\u4fee\u6539\u901a\u77e5\u6a21\u677f"),
    NOTIFY_TEMPLATE_DELETE("\u5220\u9664\u901a\u77e5\u6a21\u677f"),
    ADD_REQUEST_PACKAGES("\u65b0\u589e\u6c42\u7247\u5957\u9910\u4fe1\u606f"),
    UPDATE_REQUEST_PACKAGES("\u4fee\u6539\u6c42\u7247\u5957\u9910\u4fe1\u606f"),
    DELETE_REQUEST_PACKAGES("\u5220\u9664\u6c42\u7247\u5957\u9910\u4fe1\u606f"),
    QUERY_REQUEST_PACKAGES_CARD_MANAGEMENT("\u67e5\u8be2\u6c42\u7247\u5957\u9910\u5361\u5bc6\u7ba1\u7406"),
    VERIFY_REQUEST_PACKAGES_CARD("\u6c42\u7247\u5957\u9910\u5361\u5bc6\u9a8c\u8bc1"),
    BATCH_ADD_REQUEST_PACKAGES_CARD("\u6279\u91cf\u6dfb\u52a0\u6c42\u7247\u5957\u9910\u5361\u5bc6"),
    BATCH_DELETE_REQUEST_PACKAGES_CARD("\u6279\u91cf\u5220\u9664\u6c42\u7247\u5957\u9910\u5361\u5bc6"),
    GENERATE_INVITATION_CODE("\u751f\u6210\u9080\u8bf7\u7801"),
    QUERY_INVITATION_CODE("\u67e5\u8be2\u9080\u8bf7\u7801"),
    DELETE_INVITATION_CODE("\u5220\u9664\u9080\u8bf7\u7801"),
    REGISTERED_USER_BY_INVITATION("\u9080\u8bf7\u7801\u6ce8\u518c\u7528\u6237"),
    TELEGRAM_BIND("\u7ed1\u5b9aTelegram\u8d26\u6237"),
    TELEGRAM_LOGIN("Telegram\u767b\u5f55"),
    TELEGRAM_UNBIND("\u89e3\u7ed1Telegram\u8d26\u6237"),
    SAVE_DISTRIBUTION_PRODUCT("\u4fdd\u5b58\u79ef\u5206\u5546\u54c1"),
    DELETE_DISTRIBUTION_PRODUCT("\u5220\u9664\u79ef\u5206\u5546\u54c1"),
    EXCHANGE_POINTS("\u79ef\u5206\u5151\u6362"),
    SUBMIT_DISTRIBUTION_APPLICATION("\u63d0\u4ea4\u5206\u9500\u7533\u8bf7"),
    REVIEW_DISTRIBUTION_APPLICATION("\u5ba1\u6279\u5206\u9500\u7533\u8bf7"),
    DELETE_DISTRIBUTION_APPLICATION("\u5220\u9664\u5206\u9500\u7533\u8bf7"),
    REVIEW_DISTRIBUTION_CUSTOM_EXCHANGE("\u5ba1\u6279\u81ea\u5b9a\u4e49\u5151\u6362"),
    AGENT_RUN("\u6267\u884c Agent \u4efb\u52a1"),
    AGENT_TASK_ACTIVE("\u67e5\u8be2\u5f53\u524d\u6d3b\u52a8 Agent \u4efb\u52a1"),
    AGENT_TASK_CANCEL("\u53d6\u6d88 Agent \u4efb\u52a1"),
    AGENT_TASK_DETAIL("\u67e5\u8be2 Agent \u4efb\u52a1\u8be6\u60c5"),
    AGENT_TASK_HISTORY("\u67e5\u8be2 Agent \u4efb\u52a1\u5386\u53f2"),
    AGENT_TASK_ITEM_PAGE("\u67e5\u8be2 Agent \u4efb\u52a1\u660e\u7ec6"),
    AGENT_TASK_ITEM_MANUAL_ORGANIZE("\u624b\u52a8\u6307\u5b9a TMDB ID \u91cd\u6574 Agent \u6761\u76ee"),
    AGENT_TASK_STREAM("\u8ba2\u9605 Agent \u4efb\u52a1\u5b9e\u65f6\u8fdb\u5ea6"),
    OPENAI_CHAT_COMPLETIONS("\u8c03\u7528 OpenAI Chat Completions"),
    OPENAI_IMAGE_GENERATIONS("\u8c03\u7528 OpenAI \u56fe\u7247\u751f\u6210");

    private final String desc;

    private OperationLogDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public static List<String> getAllDescriptions() {
        return Arrays.stream(OperationLogDesc.values()).map(OperationLogDesc::getDesc).collect(Collectors.toList());
    }
}
