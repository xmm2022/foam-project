/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import lombok.Generated;

@TableName(value="rocketmq_failed_message")
public class RocketMQFailedMessage
extends BaseEntity {
    private String topic;
    private String tag;
    private String msgKey;
    private String messageBody;
    private String failureType;
    private String exceptionMessage;
    private String businessType;
    private Integer status;

    @Generated
    public RocketMQFailedMessage() {
    }

    @Generated
    public String getTopic() {
        return this.topic;
    }

    @Generated
    public String getTag() {
        return this.tag;
    }

    @Generated
    public String getMsgKey() {
        return this.msgKey;
    }

    @Generated
    public String getMessageBody() {
        return this.messageBody;
    }

    @Generated
    public String getFailureType() {
        return this.failureType;
    }

    @Generated
    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    @Generated
    public String getBusinessType() {
        return this.businessType;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public RocketMQFailedMessage setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setTag(String tag) {
        this.tag = tag;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    @Generated
    public RocketMQFailedMessage setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    @Generated
    public String toString() {
        return "RocketMQFailedMessage(topic=" + this.getTopic() + ", tag=" + this.getTag() + ", msgKey=" + this.getMsgKey() + ", messageBody=" + this.getMessageBody() + ", failureType=" + this.getFailureType() + ", exceptionMessage=" + this.getExceptionMessage() + ", businessType=" + this.getBusinessType() + ", status=" + this.getStatus() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RocketMQFailedMessage)) {
            return false;
        }
        RocketMQFailedMessage other = (RocketMQFailedMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        String this$topic = this.getTopic();
        String other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) {
            return false;
        }
        String this$tag = this.getTag();
        String other$tag = other.getTag();
        if (this$tag == null ? other$tag != null : !this$tag.equals(other$tag)) {
            return false;
        }
        String this$msgKey = this.getMsgKey();
        String other$msgKey = other.getMsgKey();
        if (this$msgKey == null ? other$msgKey != null : !this$msgKey.equals(other$msgKey)) {
            return false;
        }
        String this$messageBody = this.getMessageBody();
        String other$messageBody = other.getMessageBody();
        if (this$messageBody == null ? other$messageBody != null : !this$messageBody.equals(other$messageBody)) {
            return false;
        }
        String this$failureType = this.getFailureType();
        String other$failureType = other.getFailureType();
        if (this$failureType == null ? other$failureType != null : !this$failureType.equals(other$failureType)) {
            return false;
        }
        String this$exceptionMessage = this.getExceptionMessage();
        String other$exceptionMessage = other.getExceptionMessage();
        if (this$exceptionMessage == null ? other$exceptionMessage != null : !this$exceptionMessage.equals(other$exceptionMessage)) {
            return false;
        }
        String this$businessType = this.getBusinessType();
        String other$businessType = other.getBusinessType();
        return !(this$businessType == null ? other$businessType != null : !this$businessType.equals(other$businessType));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RocketMQFailedMessage;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $topic = this.getTopic();
        result = result * 59 + ($topic == null ? 43 : $topic.hashCode());
        String $tag = this.getTag();
        result = result * 59 + ($tag == null ? 43 : $tag.hashCode());
        String $msgKey = this.getMsgKey();
        result = result * 59 + ($msgKey == null ? 43 : $msgKey.hashCode());
        String $messageBody = this.getMessageBody();
        result = result * 59 + ($messageBody == null ? 43 : $messageBody.hashCode());
        String $failureType = this.getFailureType();
        result = result * 59 + ($failureType == null ? 43 : $failureType.hashCode());
        String $exceptionMessage = this.getExceptionMessage();
        result = result * 59 + ($exceptionMessage == null ? 43 : $exceptionMessage.hashCode());
        String $businessType = this.getBusinessType();
        result = result * 59 + ($businessType == null ? 43 : $businessType.hashCode());
        return result;
    }
}
