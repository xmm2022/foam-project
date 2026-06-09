/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyclientfilter;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyClientFilterRecordRequest
implements Serializable {
    private String keyword;
    private String embyUserName;
    private String clientName;
    private String event;
    private Integer blockUserSuccess;
    private Integer stopSuccess;
    private Long embyInfoId;
    private Date triggerTimeStart;
    private Date triggerTimeEnd;

    @Generated
    public EmbyClientFilterRecordRequest() {
    }

    @Generated
    public String getKeyword() {
        return this.keyword;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public String getClientName() {
        return this.clientName;
    }

    @Generated
    public String getEvent() {
        return this.event;
    }

    @Generated
    public Integer getBlockUserSuccess() {
        return this.blockUserSuccess;
    }

    @Generated
    public Integer getStopSuccess() {
        return this.stopSuccess;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Date getTriggerTimeStart() {
        return this.triggerTimeStart;
    }

    @Generated
    public Date getTriggerTimeEnd() {
        return this.triggerTimeEnd;
    }

    @Generated
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Generated
    public void setEvent(String event) {
        this.event = event;
    }

    @Generated
    public void setBlockUserSuccess(Integer blockUserSuccess) {
        this.blockUserSuccess = blockUserSuccess;
    }

    @Generated
    public void setStopSuccess(Integer stopSuccess) {
        this.stopSuccess = stopSuccess;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setTriggerTimeStart(Date triggerTimeStart) {
        this.triggerTimeStart = triggerTimeStart;
    }

    @Generated
    public void setTriggerTimeEnd(Date triggerTimeEnd) {
        this.triggerTimeEnd = triggerTimeEnd;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyClientFilterRecordRequest)) {
            return false;
        }
        EmbyClientFilterRecordRequest other = (EmbyClientFilterRecordRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$blockUserSuccess = this.getBlockUserSuccess();
        Integer other$blockUserSuccess = other.getBlockUserSuccess();
        if (this$blockUserSuccess == null ? other$blockUserSuccess != null : !((Object)this$blockUserSuccess).equals(other$blockUserSuccess)) {
            return false;
        }
        Integer this$stopSuccess = this.getStopSuccess();
        Integer other$stopSuccess = other.getStopSuccess();
        if (this$stopSuccess == null ? other$stopSuccess != null : !((Object)this$stopSuccess).equals(other$stopSuccess)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        String this$keyword = this.getKeyword();
        String other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$clientName = this.getClientName();
        String other$clientName = other.getClientName();
        if (this$clientName == null ? other$clientName != null : !this$clientName.equals(other$clientName)) {
            return false;
        }
        String this$event = this.getEvent();
        String other$event = other.getEvent();
        if (this$event == null ? other$event != null : !this$event.equals(other$event)) {
            return false;
        }
        Date this$triggerTimeStart = this.getTriggerTimeStart();
        Date other$triggerTimeStart = other.getTriggerTimeStart();
        if (this$triggerTimeStart == null ? other$triggerTimeStart != null : !((Object)this$triggerTimeStart).equals(other$triggerTimeStart)) {
            return false;
        }
        Date this$triggerTimeEnd = this.getTriggerTimeEnd();
        Date other$triggerTimeEnd = other.getTriggerTimeEnd();
        return !(this$triggerTimeEnd == null ? other$triggerTimeEnd != null : !((Object)this$triggerTimeEnd).equals(other$triggerTimeEnd));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyClientFilterRecordRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $blockUserSuccess = this.getBlockUserSuccess();
        result = result * 59 + ($blockUserSuccess == null ? 43 : ((Object)$blockUserSuccess).hashCode());
        Integer $stopSuccess = this.getStopSuccess();
        result = result * 59 + ($stopSuccess == null ? 43 : ((Object)$stopSuccess).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $keyword = this.getKeyword();
        result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $clientName = this.getClientName();
        result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
        String $event = this.getEvent();
        result = result * 59 + ($event == null ? 43 : $event.hashCode());
        Date $triggerTimeStart = this.getTriggerTimeStart();
        result = result * 59 + ($triggerTimeStart == null ? 43 : ((Object)$triggerTimeStart).hashCode());
        Date $triggerTimeEnd = this.getTriggerTimeEnd();
        result = result * 59 + ($triggerTimeEnd == null ? 43 : ((Object)$triggerTimeEnd).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyClientFilterRecordRequest(keyword=" + this.getKeyword() + ", embyUserName=" + this.getEmbyUserName() + ", clientName=" + this.getClientName() + ", event=" + this.getEvent() + ", blockUserSuccess=" + this.getBlockUserSuccess() + ", stopSuccess=" + this.getStopSuccess() + ", embyInfoId=" + this.getEmbyInfoId() + ", triggerTimeStart=" + String.valueOf(this.getTriggerTimeStart()) + ", triggerTimeEnd=" + String.valueOf(this.getTriggerTimeEnd()) + ")";
    }
}
