/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.simultaneous;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SimultaneousPlaybackRecordDetailResponse
implements Serializable {
    private Long id;
    private String itemId;
    private String itemName;
    private String itemType;
    private String posterUrl;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date playbackTime;
    private String client;
    private String deviceName;
    private String remoteEndpoint;
    private String remoteAddress;

    @Generated
    public static SimultaneousPlaybackRecordDetailResponseBuilder builder() {
        return new SimultaneousPlaybackRecordDetailResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getItemId() {
        return this.itemId;
    }

    @Generated
    public String getItemName() {
        return this.itemName;
    }

    @Generated
    public String getItemType() {
        return this.itemType;
    }

    @Generated
    public String getPosterUrl() {
        return this.posterUrl;
    }

    @Generated
    public Date getPlaybackTime() {
        return this.playbackTime;
    }

    @Generated
    public String getClient() {
        return this.client;
    }

    @Generated
    public String getDeviceName() {
        return this.deviceName;
    }

    @Generated
    public String getRemoteEndpoint() {
        return this.remoteEndpoint;
    }

    @Generated
    public String getRemoteAddress() {
        return this.remoteAddress;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Generated
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Generated
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Generated
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Generated
    public void setPlaybackTime(Date playbackTime) {
        this.playbackTime = playbackTime;
    }

    @Generated
    public void setClient(String client) {
        this.client = client;
    }

    @Generated
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Generated
    public void setRemoteEndpoint(String remoteEndpoint) {
        this.remoteEndpoint = remoteEndpoint;
    }

    @Generated
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SimultaneousPlaybackRecordDetailResponse)) {
            return false;
        }
        SimultaneousPlaybackRecordDetailResponse other = (SimultaneousPlaybackRecordDetailResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$itemId = this.getItemId();
        String other$itemId = other.getItemId();
        if (this$itemId == null ? other$itemId != null : !this$itemId.equals(other$itemId)) {
            return false;
        }
        String this$itemName = this.getItemName();
        String other$itemName = other.getItemName();
        if (this$itemName == null ? other$itemName != null : !this$itemName.equals(other$itemName)) {
            return false;
        }
        String this$itemType = this.getItemType();
        String other$itemType = other.getItemType();
        if (this$itemType == null ? other$itemType != null : !this$itemType.equals(other$itemType)) {
            return false;
        }
        String this$posterUrl = this.getPosterUrl();
        String other$posterUrl = other.getPosterUrl();
        if (this$posterUrl == null ? other$posterUrl != null : !this$posterUrl.equals(other$posterUrl)) {
            return false;
        }
        Date this$playbackTime = this.getPlaybackTime();
        Date other$playbackTime = other.getPlaybackTime();
        if (this$playbackTime == null ? other$playbackTime != null : !((Object)this$playbackTime).equals(other$playbackTime)) {
            return false;
        }
        String this$client = this.getClient();
        String other$client = other.getClient();
        if (this$client == null ? other$client != null : !this$client.equals(other$client)) {
            return false;
        }
        String this$deviceName = this.getDeviceName();
        String other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName)) {
            return false;
        }
        String this$remoteEndpoint = this.getRemoteEndpoint();
        String other$remoteEndpoint = other.getRemoteEndpoint();
        if (this$remoteEndpoint == null ? other$remoteEndpoint != null : !this$remoteEndpoint.equals(other$remoteEndpoint)) {
            return false;
        }
        String this$remoteAddress = this.getRemoteAddress();
        String other$remoteAddress = other.getRemoteAddress();
        return !(this$remoteAddress == null ? other$remoteAddress != null : !this$remoteAddress.equals(other$remoteAddress));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SimultaneousPlaybackRecordDetailResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $itemId = this.getItemId();
        result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
        String $itemName = this.getItemName();
        result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
        String $itemType = this.getItemType();
        result = result * 59 + ($itemType == null ? 43 : $itemType.hashCode());
        String $posterUrl = this.getPosterUrl();
        result = result * 59 + ($posterUrl == null ? 43 : $posterUrl.hashCode());
        Date $playbackTime = this.getPlaybackTime();
        result = result * 59 + ($playbackTime == null ? 43 : ((Object)$playbackTime).hashCode());
        String $client = this.getClient();
        result = result * 59 + ($client == null ? 43 : $client.hashCode());
        String $deviceName = this.getDeviceName();
        result = result * 59 + ($deviceName == null ? 43 : $deviceName.hashCode());
        String $remoteEndpoint = this.getRemoteEndpoint();
        result = result * 59 + ($remoteEndpoint == null ? 43 : $remoteEndpoint.hashCode());
        String $remoteAddress = this.getRemoteAddress();
        result = result * 59 + ($remoteAddress == null ? 43 : $remoteAddress.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SimultaneousPlaybackRecordDetailResponse(id=" + this.getId() + ", itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", itemType=" + this.getItemType() + ", posterUrl=" + this.getPosterUrl() + ", playbackTime=" + String.valueOf(this.getPlaybackTime()) + ", client=" + this.getClient() + ", deviceName=" + this.getDeviceName() + ", remoteEndpoint=" + this.getRemoteEndpoint() + ", remoteAddress=" + this.getRemoteAddress() + ")";
    }

    @Generated
    public SimultaneousPlaybackRecordDetailResponse() {
    }

    @Generated
    public SimultaneousPlaybackRecordDetailResponse(Long id, String itemId, String itemName, String itemType, String posterUrl, Date playbackTime, String client, String deviceName, String remoteEndpoint, String remoteAddress) {
        this.id = id;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.posterUrl = posterUrl;
        this.playbackTime = playbackTime;
        this.client = client;
        this.deviceName = deviceName;
        this.remoteEndpoint = remoteEndpoint;
        this.remoteAddress = remoteAddress;
    }

    @Generated
    public static class SimultaneousPlaybackRecordDetailResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private String itemId;
        @Generated
        private String itemName;
        @Generated
        private String itemType;
        @Generated
        private String posterUrl;
        @Generated
        private Date playbackTime;
        @Generated
        private String client;
        @Generated
        private String deviceName;
        @Generated
        private String remoteEndpoint;
        @Generated
        private String remoteAddress;

        @Generated
        SimultaneousPlaybackRecordDetailResponseBuilder() {
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder posterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
            return this;
        }

        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder playbackTime(Date playbackTime) {
            this.playbackTime = playbackTime;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder client(String client) {
            this.client = client;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder remoteEndpoint(String remoteEndpoint) {
            this.remoteEndpoint = remoteEndpoint;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponseBuilder remoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }

        @Generated
        public SimultaneousPlaybackRecordDetailResponse build() {
            return new SimultaneousPlaybackRecordDetailResponse(this.id, this.itemId, this.itemName, this.itemType, this.posterUrl, this.playbackTime, this.client, this.deviceName, this.remoteEndpoint, this.remoteAddress);
        }

        @Generated
        public String toString() {
            return "SimultaneousPlaybackRecordDetailResponse.SimultaneousPlaybackRecordDetailResponseBuilder(id=" + this.id + ", itemId=" + this.itemId + ", itemName=" + this.itemName + ", itemType=" + this.itemType + ", posterUrl=" + this.posterUrl + ", playbackTime=" + String.valueOf(this.playbackTime) + ", client=" + this.client + ", deviceName=" + this.deviceName + ", remoteEndpoint=" + this.remoteEndpoint + ", remoteAddress=" + this.remoteAddress + ")";
        }
    }
}
