/*
 * Decompiled with CFR 0.152.
 */
package com.una.embyhub.config.common.constants;

import com.una.embyhub.config.common.constants.NotifyMessageType;
import com.una.embyhub.model.dto.response.notifytemplate.NotifyTemplateVariableResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum NotifyTemplateVariableEnum {
    NAME("name", "\u8d44\u6e90\u540d\u79f0\u6216\u901a\u77e5\u6807\u9898", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    OVERVIEW("overview", "\u901a\u77e5\u6b63\u6587\u6216\u8d44\u6e90\u7b80\u4ecb", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    TV_INFO("tvInfo", "\u5267\u96c6\u5b63/\u96c6\u539f\u59cb\u4fe1\u606f", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    TV_INFO_BLOCK("tvInfoBlock", "\u5267\u96c6\u5b63/\u96c6\u4fe1\u606f\uff08\u5df2\u5e26\u6362\u884c\uff0c\u7a7a\u5185\u5bb9\u81ea\u52a8\u5ffd\u7565\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    DISPLAY_TITLE("displayTitle", "\u539f\u59cb\u5206\u8fa8\u7387\u6216\u7248\u672c\u4fe1\u606f", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    DISPLAY_TITLE_BLOCK("displayTitleBlock", "\u5206\u8fa8\u7387\u4fe1\u606f\u5757\uff08\u5df2\u5e26\u6362\u884c\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    GENRES("genres", "\u7c7b\u578b/\u6807\u7b7e\u539f\u59cb\u6587\u672c\uff08\u4ee5 # \u5206\u9694\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    GENRES_BLOCK("genresBlock", "\u7c7b\u578b/\u6807\u7b7e\u4fe1\u606f\u5757\uff08\u5df2\u5e26\u6362\u884c\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    TYPE("type", "\u5a92\u4f53\u539f\u59cb\u7c7b\u578b\uff08Movie/Episode \u7b49\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    TYPE_TAG("typeTag", "\u5a92\u4f53\u7c7b\u578b\u6807\u7b7e\uff08#\u7535\u5f71/#\u5267\u96c6\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    SIZE("size", "\u539f\u59cb\u6587\u4ef6\u5927\u5c0f\uff08\u5b57\u7b26\u4e32\u5f62\u5f0f\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    SIZE_BLOCK("sizeBlock", "\u6587\u4ef6\u5927\u5c0f\u4fe1\u606f\u5757\uff08\u81ea\u52a8\u5904\u7406\u7a7a\u503c\u548c\u6362\u884c\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    BACKDROP_PATH("backdropPath", "\u80cc\u666f\u56fe/\u6a2a\u5e45\u56fe\u5730\u5740", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    BACKDROP_IMAGE_BLOCK("backdropImageBlock", "\u9489\u9489\u53ef\u8bc6\u522b\u7684 Markdown \u56fe\u7247\u7247\u6bb5", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    SERVER_URL("serverUrl", "\u670d\u52a1\u5668\u57fa\u7840\u5730\u5740", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "wechat_playback_start", "wechat_playback_stop", "wechat_playback_pause", "auth_failed", "auth_success", "user_expiration", "user_disabled", "user_deleted", "simultaneous_playback", "request_submitted", "request_completed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    SERVER_URL_BLOCK("serverUrlBlock", "\u670d\u52a1\u5668\u5730\u5740\u4fe1\u606f\u5757\uff08\u5df2\u5e26\u6362\u884c\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "wechat_playback_start", "wechat_playback_stop", "wechat_playback_pause", "auth_failed", "auth_success", "user_expiration", "user_disabled", "user_deleted", "simultaneous_playback", "request_submitted", "request_completed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    IMG_URL("imgUrl", "\u6d77\u62a5\u56fe\u5730\u5740", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    TMDB_URL("tmdbUrl", "TMDB \u8be6\u60c5\u94fe\u63a5", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    PARSE_MODE("parseMode", "\u6d88\u606f\u89e3\u6790\u6a21\u5f0f\uff08Markdown\u3001HTML \u7b49\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    PRODUCTION_YEAR("productionYear", "\u51fa\u54c1\u5e74\u4efd", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    SERIES_NAME("seriesName", "\u5267\u96c6\u540d\u79f0", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    SEASON_NUMBER("seasonNumber", "\u5b63\u7f16\u53f7\uff08\u6570\u5b57\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    EPISODE_NUMBER("episodeNumber", "\u96c6\u7f16\u53f7\uff08\u6570\u5b57\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    EPISODE_NAME("episodeName", "\u5355\u96c6\u6807\u9898", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE)),
    DOUBLE_LINE_BREAK("doubleLineBreak", "\u4e24\u4e2a\u6362\u884c\u7b26\uff08\\n\\n\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    LINE_BREAK("lineBreak", "\u5355\u4e2a\u6362\u884c\u7b26\uff08\\n\uff09", NotifyTemplateVariableEnum.templates("media_photo_detail", "media_photo_message", "media_text_message"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL, NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    PLAY_USER("playUser", "\u64ad\u653e\u7528\u6237", NotifyTemplateVariableEnum.templates("wechat_playback_start", "wechat_playback_stop"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_MESSAGE)),
    PLAY_TITLE("playTitle", "\u64ad\u653e\u6807\u9898", NotifyTemplateVariableEnum.templates("wechat_playback_start", "wechat_playback_stop"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_MESSAGE)),
    USER_LOCATION("userLocation", "\u7528\u6237\u5f52\u5c5e\u5730", NotifyTemplateVariableEnum.templates("wechat_playback_start", "wechat_playback_stop"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_MESSAGE)),
    PLAY_TIME("playTime", "\u64ad\u653e\u65f6\u95f4", NotifyTemplateVariableEnum.templates("wechat_playback_start", "wechat_playback_stop"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_MESSAGE)),
    PLAY_POSITION("playPosition", "\u64ad\u653e\u4f4d\u7f6e", NotifyTemplateVariableEnum.templates("wechat_playback_start", "wechat_playback_stop"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_MESSAGE)),
    CLIENT_INFO("clientInfo", "\u5ba2\u6237\u7aef\u4fe1\u606f", NotifyTemplateVariableEnum.templates("wechat_playback_start", "wechat_playback_stop", "wechat_playback_pause", "auth_failed", "auth_success"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_MESSAGE, NotifyMessageType.TEXT)),
    USER_NAME("userName", "\u7528\u6237\u540d\u79f0", NotifyTemplateVariableEnum.templates("auth_failed", "auth_success", "user_expiration", "user_disabled", "user_deleted", "simultaneous_playback", "request_submitted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT, NotifyMessageType.PHOTO_DETAIL)),
    LOGIN_TIME("loginTime", "\u767b\u5f55\u65f6\u95f4", NotifyTemplateVariableEnum.templates("auth_failed", "auth_success"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    IP_ADDRESS("ipAddress", "IP\u5730\u5740", NotifyTemplateVariableEnum.templates("auth_failed", "auth_success"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    DEVICE("device", "\u8bbe\u5907\u540d\u79f0", NotifyTemplateVariableEnum.templates("auth_failed", "auth_success"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    EXPIRATION_DATE("expirationDate", "\u8fc7\u671f\u65f6\u95f4", NotifyTemplateVariableEnum.templates("user_expiration"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    TIME_LEFT("timeLeft", "\u5269\u4f59\u65f6\u95f4", NotifyTemplateVariableEnum.templates("user_expiration"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    REASON("reason", "\u539f\u56e0", NotifyTemplateVariableEnum.templates("user_disabled", "user_deleted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    PLAYBACK_DETAILS("playbackDetails", "\u64ad\u653e\u8be6\u60c5\u5217\u8868", NotifyTemplateVariableEnum.templates("simultaneous_playback"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    REQUEST_NAME("requestName", "\u6c42\u7247\u540d\u79f0", NotifyTemplateVariableEnum.templates("request_submitted", "request_completed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL)),
    YEAR("year", "\u5e74\u4efd", NotifyTemplateVariableEnum.templates("request_submitted", "request_completed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL)),
    SEASON("season", "\u5b63", NotifyTemplateVariableEnum.templates("request_submitted", "request_completed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.PHOTO_DETAIL)),
    TICKET_ID("ticketId", "\u5de5\u5355ID", NotifyTemplateVariableEnum.templates("support_ticket_submitted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    TICKET_TITLE("ticketTitle", "\u5de5\u5355\u6807\u9898", NotifyTemplateVariableEnum.templates("support_ticket_submitted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    TICKET_SUBMITTER("ticketSubmitter", "\u5de5\u5355\u63d0\u4ea4\u4eba", NotifyTemplateVariableEnum.templates("support_ticket_submitted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    TICKET_SUBMIT_TIME("ticketSubmitTime", "\u5de5\u5355\u63d0\u4ea4\u65f6\u95f4", NotifyTemplateVariableEnum.templates("support_ticket_submitted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    TICKET_CONTENT("ticketContent", "\u5de5\u5355\u5185\u5bb9", NotifyTemplateVariableEnum.templates("support_ticket_submitted"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    SUBSCRIBE_NAME("subscribeName", "\u8ba2\u9605\u540d\u79f0", NotifyTemplateVariableEnum.templates("subscribe_download", "subscribe_organize_success", "subscribe_organize_failed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    MOVIE_NAME("movieName", "\u5f71\u7247\u540d\u79f0", NotifyTemplateVariableEnum.templates("subscribe_download", "subscribe_organize_success", "subscribe_organize_failed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    MEDIA_TYPE_LABEL("mediaTypeLabel", "\u5a92\u4f53\u7c7b\u578b\uff08\u7535\u5f71/\u5267\u96c6\uff09", NotifyTemplateVariableEnum.templates("subscribe_download", "subscribe_organize_success", "subscribe_organize_failed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    DOWNLOAD_TITLE("downloadTitle", "\u8d44\u6e90\u6807\u9898", NotifyTemplateVariableEnum.templates("subscribe_download", "subscribe_organize_success", "subscribe_organize_failed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    DOWNLOAD_SIZE("downloadSize", "\u8d44\u6e90\u5927\u5c0f", NotifyTemplateVariableEnum.templates("subscribe_download"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    DOWNLOAD_SIZE_LINE("downloadSizeLine", "\u8d44\u6e90\u5927\u5c0f\u4fe1\u606f\u884c\uff08\u4e3a\u7a7a\u65f6\u81ea\u52a8\u5ffd\u7565\uff09", NotifyTemplateVariableEnum.templates("subscribe_download"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    DOWNLOAD_STATUS("downloadStatus", "\u4e0b\u8f7d/\u6574\u7406\u72b6\u6001", NotifyTemplateVariableEnum.templates("subscribe_organize_success", "subscribe_organize_failed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    ERROR_MESSAGE("errorMessage", "\u5931\u8d25\u539f\u56e0", NotifyTemplateVariableEnum.templates("subscribe_organize_failed"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    SITE_NAME("siteName", "\u7ad9\u70b9\u540d\u79f0", NotifyTemplateVariableEnum.templates("subscribe_download", "subscribe_organize_success", "subscribe_organize_failed", "subscribe_added"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT)),
    CLIENT_FILTER_DETAILS("clientFilterDetails", "UA\u62e6\u622a\u8be6\u60c5", NotifyTemplateVariableEnum.templates("emby_client_filter"), NotifyTemplateVariableEnum.messageTypes(NotifyMessageType.TEXT));

    private final String key;
    private final String description;
    private final List<String> templateCodes;
    private final List<NotifyMessageType> messageTypes;

    private NotifyTemplateVariableEnum(String key, String description, List<String> templateCodes, List<NotifyMessageType> messageTypes) {
        this.key = key;
        this.description = description;
        this.templateCodes = templateCodes;
        this.messageTypes = messageTypes;
    }

    public String getKey() {
        return this.key;
    }

    public NotifyTemplateVariableResponse toResponse() {
        NotifyTemplateVariableResponse response = new NotifyTemplateVariableResponse();
        response.setKey(this.key);
        response.setDescription(this.description);
        response.setTemplateCodes(this.templateCodes);
        response.setMessageTypes(this.messageTypes.stream().map(Enum::name).collect(Collectors.toList()));
        return response;
    }

    public static List<NotifyTemplateVariableResponse> toResponseList() {
        return Arrays.stream(NotifyTemplateVariableEnum.values()).map(NotifyTemplateVariableEnum::toResponse).collect(Collectors.toList());
    }

    private static List<String> templates(String ... templateCodes) {
        return Collections.unmodifiableList(Arrays.asList(templateCodes));
    }

    private static List<NotifyMessageType> messageTypes(NotifyMessageType ... types) {
        return Collections.unmodifiableList(Arrays.asList(types));
    }
}
