/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydatadetails;

import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.model.entity.EmbyInfo;
import java.io.Serializable;
import lombok.Generated;

public class EmbyNotifyDataDetailsResponseData
implements Serializable {
    private Long embyNotifyDataId;
    private Long embyInfoId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;
    private String idList;
    private String episodeList;
    private Long totalSize;
    private Long count;

    @Generated
    public EmbyNotifyDataDetailsResponseData() {
    }

    @Generated
    public Long getEmbyNotifyDataId() {
        return this.embyNotifyDataId;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public String getIdList() {
        return this.idList;
    }

    @Generated
    public String getEpisodeList() {
        return this.episodeList;
    }

    @Generated
    public Long getTotalSize() {
        return this.totalSize;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public void setEmbyNotifyDataId(Long embyNotifyDataId) {
        this.embyNotifyDataId = embyNotifyDataId;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public void setIdList(String idList) {
        this.idList = idList;
    }

    @Generated
    public void setEpisodeList(String episodeList) {
        this.episodeList = episodeList;
    }

    @Generated
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    @Generated
    public void setCount(Long count) {
        this.count = count;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyNotifyDataDetailsResponseData)) {
            return false;
        }
        EmbyNotifyDataDetailsResponseData other = (EmbyNotifyDataDetailsResponseData)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$embyNotifyDataId = this.getEmbyNotifyDataId();
        Long other$embyNotifyDataId = other.getEmbyNotifyDataId();
        if (this$embyNotifyDataId == null ? other$embyNotifyDataId != null : !((Object)this$embyNotifyDataId).equals(other$embyNotifyDataId)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Long this$totalSize = this.getTotalSize();
        Long other$totalSize = other.getTotalSize();
        if (this$totalSize == null ? other$totalSize != null : !((Object)this$totalSize).equals(other$totalSize)) {
            return false;
        }
        Long this$count = this.getCount();
        Long other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        if (this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName)) {
            return false;
        }
        String this$idList = this.getIdList();
        String other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !this$idList.equals(other$idList)) {
            return false;
        }
        String this$episodeList = this.getEpisodeList();
        String other$episodeList = other.getEpisodeList();
        return !(this$episodeList == null ? other$episodeList != null : !this$episodeList.equals(other$episodeList));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyNotifyDataDetailsResponseData;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyNotifyDataId = this.getEmbyNotifyDataId();
        result = result * 59 + ($embyNotifyDataId == null ? 43 : ((Object)$embyNotifyDataId).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Long $totalSize = this.getTotalSize();
        result = result * 59 + ($totalSize == null ? 43 : ((Object)$totalSize).hashCode());
        Long $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        String $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : $idList.hashCode());
        String $episodeList = this.getEpisodeList();
        result = result * 59 + ($episodeList == null ? 43 : $episodeList.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyNotifyDataDetailsResponseData(embyNotifyDataId=" + this.getEmbyNotifyDataId() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ", idList=" + this.getIdList() + ", episodeList=" + this.getEpisodeList() + ", totalSize=" + this.getTotalSize() + ", count=" + this.getCount() + ")";
    }
}
