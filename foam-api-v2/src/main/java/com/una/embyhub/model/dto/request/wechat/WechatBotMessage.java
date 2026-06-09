/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.wechat;

import lombok.Generated;

public class WechatBotMessage {
    private String toUser;
    private String fromUser;
    private String content;
    private String msgType;
    private String event;
    private String eventKey;

    @Generated
    public WechatBotMessage() {
    }

    @Generated
    public String getToUser() {
        return this.toUser;
    }

    @Generated
    public String getFromUser() {
        return this.fromUser;
    }

    @Generated
    public String getContent() {
        return this.content;
    }

    @Generated
    public String getMsgType() {
        return this.msgType;
    }

    @Generated
    public String getEvent() {
        return this.event;
    }

    @Generated
    public String getEventKey() {
        return this.eventKey;
    }

    @Generated
    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Generated
    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    @Generated
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @Generated
    public void setEvent(String event) {
        this.event = event;
    }

    @Generated
    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WechatBotMessage)) {
            return false;
        }
        WechatBotMessage other = (WechatBotMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$toUser = this.getToUser();
        String other$toUser = other.getToUser();
        if (this$toUser == null ? other$toUser != null : !this$toUser.equals(other$toUser)) {
            return false;
        }
        String this$fromUser = this.getFromUser();
        String other$fromUser = other.getFromUser();
        if (this$fromUser == null ? other$fromUser != null : !this$fromUser.equals(other$fromUser)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) {
            return false;
        }
        String this$msgType = this.getMsgType();
        String other$msgType = other.getMsgType();
        if (this$msgType == null ? other$msgType != null : !this$msgType.equals(other$msgType)) {
            return false;
        }
        String this$event = this.getEvent();
        String other$event = other.getEvent();
        if (this$event == null ? other$event != null : !this$event.equals(other$event)) {
            return false;
        }
        String this$eventKey = this.getEventKey();
        String other$eventKey = other.getEventKey();
        return !(this$eventKey == null ? other$eventKey != null : !this$eventKey.equals(other$eventKey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WechatBotMessage;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $toUser = this.getToUser();
        result = result * 59 + ($toUser == null ? 43 : $toUser.hashCode());
        String $fromUser = this.getFromUser();
        result = result * 59 + ($fromUser == null ? 43 : $fromUser.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        String $msgType = this.getMsgType();
        result = result * 59 + ($msgType == null ? 43 : $msgType.hashCode());
        String $event = this.getEvent();
        result = result * 59 + ($event == null ? 43 : $event.hashCode());
        String $eventKey = this.getEventKey();
        result = result * 59 + ($eventKey == null ? 43 : $eventKey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WechatBotMessage(toUser=" + this.getToUser() + ", fromUser=" + this.getFromUser() + ", content=" + this.getContent() + ", msgType=" + this.getMsgType() + ", event=" + this.getEvent() + ", eventKey=" + this.getEventKey() + ")";
    }
}
