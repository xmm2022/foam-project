/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.enums;

import lombok.Generated;

public enum ResponseStatusEnum {
    FORBIDDEN(403, "Forbidden"),
    UNAUTHORIZED(401, "\u7cfb\u7edf\u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55"),
    SUCCESS(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    SYSTEM_ERROR(500, "\u7cfb\u7edf\u5f02\u5e38\u9519\u8bef"),
    NOT_EXIST(404, "\u8bf7\u6c42\u8def\u5f84\u4e0d\u5b58\u5728"),
    PERMISSION_DENIED(50030, "\u6743\u9650\u4e0d\u8db3"),
    USER_NOT_EXIST(410, "\u7528\u6237\u4e0d\u5b58\u5728"),
    USER_EXIST(411, "\u7528\u6237\u5df2\u5b58\u5728 ,\u8bf7\u91cd\u65b0\u751f\u6210"),
    CARD_NOT_EXIST(412, "\u5361\u5bc6\u4e0d\u5b58\u5728"),
    CARD_USED(413, "\u5361\u5bc6\u5df2\u4f7f\u7528"),
    USER_DISABLED(414, "\u7528\u6237\u5df2\u7981\u7528"),
    PASSWORD_CONTAIN_CONTINUOUS_CHAR(415, "\u7528\u6237\u5bc6\u7801\u4e0d\u80fd\u5305\u542b\u8fde\u7eed\u7684\u6570\u5b57"),
    BIZ_CARD_PASSWORD_ERROR(416, "\u5361\u5bc6\u5bc6\u7801\u9519\u8bef"),
    REQUEST_LIST_ALREADY_EXISTS(417, "\u8be5\u5f71\u7247\u5df2\u5b58\u5728\u6c42\u7247\u5217\u8868\u4e2d\uff0c\u8bf7\u52ff\u91cd\u590d\u6dfb\u52a0\uff01"),
    REQUEST_LIST_NOT_EXISTS(418, "\u6c42\u7247\u4fe1\u606f\u4e0d\u5b58\u5728"),
    USER_DISABLE_FAILED(419, "\u7981\u7528\u7528\u6237\u5931\u8d25\uff0c\u53ef\u80fdemby\u4e0d\u5b58\u5728\u6b64\u7528\u6237\uff0c\u8bf7\u76f4\u63a5\u5220\u9664\u7528\u6237\u4fe1\u606f"),
    USER_ENABLE_ERROR(420, "\u7528\u6237\u542f\u7528\u5931\u8d25\uff0c\u53ef\u80fdemby\u7528\u6237\u5df2\u5220\u9664"),
    REQUEST_LIST_ALREADY_STORE(421, "\u5b58\u5728\u5df2\u5165\u5e93\u7684\u6570\u636e\uff0c\u65e0\u6cd5\u6279\u91cf\u63d0\u4ea4"),
    LICENSE_ERROR(422, "\u60a8\u7684\u8bc1\u4e66\u65e0\u6548\uff0c\u8bf7\u6838\u67e5\u670d\u52a1\u5668\u662f\u5426\u53d6\u5f97\u6388\u6743\u6216\u91cd\u65b0\u7533\u8bf7\u8bc1\u4e66\uff01"),
    USER_ID_NOT_NULl(423, "\u7528\u6237id\u4e0d\u80fd\u4e3a\u7a7a"),
    PASSWORD_LENGTH_ERROR(424, "\u5bc6\u7801\u957f\u5ea6\u5fc5\u987b\u57286-30\u4e4b\u95f4"),
    REQUEST_LIST_ALREADY_STOCK(425, "\u8be5\u5f71\u7247\u5df2\u5165\u5e93"),
    CONFIG_KEY_NOT_EXIST(426, "\u5f53\u524d\u914d\u7f6e\u4e0d\u5b58\u5728\uff0c\u8bf7\u52ff\u91cd\u590d\u6dfb\u52a0\uff01"),
    PASSWORD_ERROR(427, "\u5bc6\u7801\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165"),
    USER_SYNC_ERROR(428, "\u540c\u6b65\u7528\u6237\u5931\u8d25"),
    NULLBR_TYPE_ERROR(429, "nullbr\u7c7b\u578b\u9519\u8bef"),
    NULLBR_ENABLED_ERROR(430, "nullbr\u672a\u542f\u7528"),
    NULLBR_CONFIG_ERROR(430, "nullbr\u914d\u7f6e\u9519\u8bef"),
    NOTIFY_CHANNEL_ICON_TYPE_EXIST(431, "\u901a\u77e5\u6e20\u9053\u5df2\u5b58\u5728"),
    BIZ_REQUEST_PACKAGES_CARD_PASSWORD_ERROR(432, "\u6c42\u7247\u5361\u5bc6\u5bc6\u7801\u9519\u8bef"),
    REQUEST_LIST_PACKAGE_NOT_ENOUGH(433, "\u6c42\u7247\u6b21\u6570\u4e0d\u8db3\uff0c\u8bf7\u5148\u8d2d\u4e70\u5957\u9910"),
    USER_REGISTER_FAILED(434, "\u9875\u9762\u6ce8\u518c\u672a\u5f00\u542f"),
    USER_NAME_NOT_ALLOWED(435, "\u7528\u6237\u540d\u65e0\u6cd5\u4f7f\u7528"),
    USER_NAME_EXIST(436, "\u7528\u6237\u540d\u5df2\u5b58\u5728"),
    NOTIFY_TEMPLATE_CODE_EXIST(437, "\u901a\u77e5\u6a21\u677f\u7f16\u7801\u5df2\u5b58\u5728"),
    NOTIFY_TEMPLATE_CODE_EMPTY(438, "\u901a\u77e5\u6a21\u677f\u7f16\u7801\u4e0d\u80fd\u4e3a\u7a7a"),
    EMBY_SERVER_NOT_FOUND(439, "Emby\u670d\u52a1\u5668\u4fe1\u606f\u4e0d\u5b58\u5728"),
    EMBY_SERVER_NOT_CONFIGURED(440, "\u672a\u914d\u7f6e\u542f\u7528\u7684Emby\u670d\u52a1\u5668"),
    AVATAR_UPLOAD_FAILED(441, "\u5934\u50cf\u4e0a\u4f20\u5931\u8d25"),
    AVATAR_FILE_EMPTY(442, "\u8bf7\u4e0a\u4f20\u5934\u50cf\u6587\u4ef6"),
    EMBY_INFO_DISABLED(443, "\u670d\u52a1\u5668\u5df2\u5173\u95ed"),
    EMBY_SERVER_EXISTS(444, "\u670d\u52a1\u5668\u5df2\u5b58\u5728"),
    PLEASE_USE_CORRECT_CARD_KEY(445, "\u8bf7\u4f7f\u7528\u6b63\u786e\u5361\u5bc6"),
    EMBY_USER_NOT_EXIST(446, "Emby\u7528\u6237\u4e0d\u5b58\u5728"),
    EMBY_EXCEPTIION(447, "Emby\u670d\u52a1\u5668\u5f02\u5e38"),
    MOVIEPILOT_FORBIDDEN(448, "moviepilot \u767b\u5f55\u5df2\u8fc7\u671f"),
    MOVIEPILOT_NOT_CONFIGURED(449, "\u672a\u914d\u7f6emoviepilot"),
    SERVER_CONFIG_ERROR(450, "\u514d\u8d39\u7248\u6682\u65f6\u5173\u95ed"),
    REQUEST_LIST_REJECTED_EXISTS(451, "\u8be5\u5f71\u7247\u5df2\u88ab\u62d2\u7edd\uff0c\u65e0\u6cd5\u91cd\u590d\u63d0\u4ea4"),
    SYNC_SERVER_ID_CONFLICT(452, "\u6e90\u670d\u52a1\u5668\u4e0e\u76ee\u6807\u670d\u52a1\u5668\u4e0d\u80fd\u76f8\u540c"),
    LICENSE_FILE_NOT_FOUND(453, "\u6388\u6743\u6587\u4ef6\u4e0d\u5b58\u5728"),
    LICENSE_CODE_NOT_ACTIVATED(453, "\u6388\u6743\u7801\u672a\u6fc0\u6d3b"),
    INVITATION_CODE_NOT_FOUND(454, "\u9080\u8bf7\u7801\u4e0d\u5b58\u5728"),
    INVITATION_CODE_USED(455, "\u9080\u8bf7\u7801\u5df2\u4f7f\u7528"),
    INVITATION_CODE_SERVER_REQUIRED(456, "\u8bf7\u9009\u62e9\u8981\u751f\u6210\u9080\u8bf7\u7801\u7684\u670d\u52a1\u5668"),
    INVITATION_CODE_EXPIRED(457, "\u9080\u8bf7\u7801\u5df2\u8fc7\u671f"),
    INVITATION_CODE_USAGE_EXCEEDED(458, "\u9080\u8bf7\u7801\u5df2\u8fbe\u6700\u5927\u4f7f\u7528\u6b21\u6570"),
    HOST_LINE_NOT_FOUND(459, "\u4e3b\u673a\u7ebf\u8def\u4e0d\u5b58\u5728"),
    HOST_LINE_DUPLICATE(460, "\u540c\u4e00 Emby \u670d\u52a1\u5668\u4e0b\u7ebf\u8def\u540d\u79f0\u6216\u534f\u8bae+\u57df\u540d+\u7aef\u53e3\u5df2\u5b58\u5728"),
    HOST_LINE_EMBY_INFO_ID_EMPTY(461, "Emby\u670d\u52a1\u5668ID\u4e0d\u80fd\u4e3a\u7a7a"),
    HOST_LINE_LINE_NAME_EMPTY(462, "\u7ebf\u8def\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a"),
    HOST_LINE_PROTOCOL_EMPTY(463, "\u7ebf\u8def\u534f\u8bae\u4e0d\u80fd\u4e3a\u7a7a"),
    HOST_LINE_DOMAIN_EMPTY(464, "\u7ebf\u8def\u57df\u540d\u4e0d\u80fd\u4e3a\u7a7a"),
    HOST_LINE_PORT_EMPTY(465, "\u7ebf\u8def\u7aef\u53e3\u4e0d\u80fd\u4e3a\u7a7a"),
    HOST_LINE_PORT_INVALID(466, "\u7aef\u53e3\u53f7\u9700\u8981\u57281-65535\u4e4b\u95f4"),
    INVITATION_REGISTER_DISABLED(467, "\u9080\u8bf7\u7801\u6ce8\u518c\u672a\u5f00\u542f"),
    CARD_REGISTER_DISABLED(468, "\u5361\u5bc6\u6ce8\u518c\u672a\u5f00\u542f"),
    TELEGRAM_REGISTER_DISABLED(470, "Telegram\u79c1\u804a\u6ce8\u518c\u672a\u5f00\u542f"),
    PLAYBACK_REPORTING_NOT_INSTALLED(469, "Playback Reporting Emby\u63d2\u4ef6\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u5df2\u5b89\u88c5\u8be5\u63d2\u4ef6\uff0c\u5df2\u5b89\u88c5\u8bf7\u5ffd\u7565"),
    MULTIPLE_SERVER_MATCH(471, "\u7528\u6237\u5b58\u5728\u4e8e\u591a\u4e2a\u670d\u52a1\u5668\uff0c\u8bf7\u9009\u62e9\u670d\u52a1\u5668\u767b\u5f55"),
    LICENSE_PRODUCT_ERROR(472, "\u4ea7\u54c1\u6388\u6743\u4e0d\u8db3"),
    POINTS_NOT_ENOUGH(473, "\u79ef\u5206\u4e0d\u8db3"),
    PRODUCT_NOT_EXIST(474, "\u5546\u54c1\u4e0d\u5b58\u5728\u6216\u4e0b\u67b6"),
    REQUEST_LIST_NOT_RELEASED(475, "\u8be5\u5f71\u7247\u5c1a\u672a\u4e0a\u6620\uff0c\u6682\u4e0d\u652f\u6301\u6c42\u7247"),
    CURRENT_ADMIN_CANNOT_CANCEL(476, "\u4e0d\u80fd\u53d6\u6d88\u5f53\u524d\u767b\u5f55\u7528\u6237\u7684\u7ba1\u7406\u5458\u8eab\u4efd");

    private Integer code;
    private String msg;

    private ResponseStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Generated
    public String toString() {
        return "ResponseStatusEnum." + this.name() + "(code=" + this.getCode() + ", msg=" + this.getMsg() + ")";
    }

    @Generated
    public Integer getCode() {
        return this.code;
    }

    @Generated
    public String getMsg() {
        return this.msg;
    }
}
