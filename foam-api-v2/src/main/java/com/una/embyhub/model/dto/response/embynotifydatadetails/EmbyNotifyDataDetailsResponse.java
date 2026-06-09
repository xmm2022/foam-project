/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.io.unit.DataSizeUtil
 *  cn.hutool.core.io.unit.DataUnit
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embynotifydatadetails;

import cn.hutool.core.io.unit.DataSizeUtil;
import cn.hutool.core.io.unit.DataUnit;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyNotifyDataDetailsResponse
implements Serializable {
    private Long id;
    private Long embyNotifyDataId;
    private String episodeDetails;
    private String episodeInfo;
    private String size;
    private Integer status;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;

    public void setSize(String size) {
        this.size = DataSizeUtil.format((Long)Long.valueOf(size), (DataUnit)DataUnit.GIGABYTES);
    }

    @Generated
    public EmbyNotifyDataDetailsResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getEmbyNotifyDataId() {
        return this.embyNotifyDataId;
    }

    @Generated
    public String getEpisodeDetails() {
        return this.episodeDetails;
    }

    @Generated
    public String getEpisodeInfo() {
        return this.episodeInfo;
    }

    @Generated
    public String getSize() {
        return this.size;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public String getCreateUserName() {
        return this.createUserName;
    }

    @Generated
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    @Generated
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    @Generated
    public Long getCreateUserId() {
        return this.createUserId;
    }

    @Generated
    public Integer getDelFlag() {
        return this.delFlag;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setEmbyNotifyDataId(Long embyNotifyDataId) {
        this.embyNotifyDataId = embyNotifyDataId;
    }

    @Generated
    public void setEpisodeDetails(String episodeDetails) {
        this.episodeDetails = episodeDetails;
    }

    @Generated
    public void setEpisodeInfo(String episodeInfo) {
        this.episodeInfo = episodeInfo;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Generated
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Generated
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Generated
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Generated
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyNotifyDataDetailsResponse)) {
            return false;
        }
        EmbyNotifyDataDetailsResponse other = (EmbyNotifyDataDetailsResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$embyNotifyDataId = this.getEmbyNotifyDataId();
        Long other$embyNotifyDataId = other.getEmbyNotifyDataId();
        if (this$embyNotifyDataId == null ? other$embyNotifyDataId != null : !((Object)this$embyNotifyDataId).equals(other$embyNotifyDataId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$updateUserId = this.getUpdateUserId();
        Long other$updateUserId = other.getUpdateUserId();
        if (this$updateUserId == null ? other$updateUserId != null : !((Object)this$updateUserId).equals(other$updateUserId)) {
            return false;
        }
        Long this$createUserId = this.getCreateUserId();
        Long other$createUserId = other.getCreateUserId();
        if (this$createUserId == null ? other$createUserId != null : !((Object)this$createUserId).equals(other$createUserId)) {
            return false;
        }
        Integer this$delFlag = this.getDelFlag();
        Integer other$delFlag = other.getDelFlag();
        if (this$delFlag == null ? other$delFlag != null : !((Object)this$delFlag).equals(other$delFlag)) {
            return false;
        }
        String this$episodeDetails = this.getEpisodeDetails();
        String other$episodeDetails = other.getEpisodeDetails();
        if (this$episodeDetails == null ? other$episodeDetails != null : !this$episodeDetails.equals(other$episodeDetails)) {
            return false;
        }
        String this$episodeInfo = this.getEpisodeInfo();
        String other$episodeInfo = other.getEpisodeInfo();
        if (this$episodeInfo == null ? other$episodeInfo != null : !this$episodeInfo.equals(other$episodeInfo)) {
            return false;
        }
        String this$size = this.getSize();
        String other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        if (this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime)) {
            return false;
        }
        String this$createUserName = this.getCreateUserName();
        String other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) {
            return false;
        }
        String this$updateUserName = this.getUpdateUserName();
        String other$updateUserName = other.getUpdateUserName();
        return !(this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyNotifyDataDetailsResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyNotifyDataId = this.getEmbyNotifyDataId();
        result = result * 59 + ($embyNotifyDataId == null ? 43 : ((Object)$embyNotifyDataId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        String $episodeDetails = this.getEpisodeDetails();
        result = result * 59 + ($episodeDetails == null ? 43 : $episodeDetails.hashCode());
        String $episodeInfo = this.getEpisodeInfo();
        result = result * 59 + ($episodeInfo == null ? 43 : $episodeInfo.hashCode());
        String $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : $size.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyNotifyDataDetailsResponse(id=" + this.getId() + ", embyNotifyDataId=" + this.getEmbyNotifyDataId() + ", episodeDetails=" + this.getEpisodeDetails() + ", episodeInfo=" + this.getEpisodeInfo() + ", size=" + this.getSize() + ", status=" + this.getStatus() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ")";
    }
}
