/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.query.BindQuery
 *  com.diboot.core.binding.query.Comparison
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.requestlist;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import java.io.Serializable;
import lombok.Generated;

public class RequestListRequest
implements Serializable {
    @BindQuery(comparison=Comparison.CONTAINS)
    private String name;
    @BindQuery(comparison=Comparison.EQ)
    private String type;
    @BindQuery(comparison=Comparison.EQ)
    private Integer tmdbId;
    @BindQuery(comparison=Comparison.EQ)
    private String doubanId;
    @BindQuery(comparison=Comparison.EQ)
    private Integer status;
    @BindQuery(comparison=Comparison.EQ)
    private Integer auditStatus;
    @BindQuery(comparison=Comparison.EQ)
    private String embyUserName;
    @BindQuery(comparison=Comparison.EQ)
    private Long embyInfoId;
    @BindQuery(comparison=Comparison.EQ)
    private String embyServerId;
    @BindQuery(comparison=Comparison.EQ)
    private Integer season;
    @BindQuery(comparison=Comparison.EQ)
    private Integer episode;

    @Generated
    public RequestListRequest() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public String getDoubanId() {
        return this.doubanId;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getEmbyServerId() {
        return this.embyServerId;
    }

    @Generated
    public Integer getSeason() {
        return this.season;
    }

    @Generated
    public Integer getEpisode() {
        return this.episode;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setEmbyServerId(String embyServerId) {
        this.embyServerId = embyServerId;
    }

    @Generated
    public void setSeason(Integer season) {
        this.season = season;
    }

    @Generated
    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestListRequest)) {
            return false;
        }
        RequestListRequest other = (RequestListRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$auditStatus = this.getAuditStatus();
        Integer other$auditStatus = other.getAuditStatus();
        if (this$auditStatus == null ? other$auditStatus != null : !((Object)this$auditStatus).equals(other$auditStatus)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$season = this.getSeason();
        Integer other$season = other.getSeason();
        if (this$season == null ? other$season != null : !((Object)this$season).equals(other$season)) {
            return false;
        }
        Integer this$episode = this.getEpisode();
        Integer other$episode = other.getEpisode();
        if (this$episode == null ? other$episode != null : !((Object)this$episode).equals(other$episode)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$doubanId = this.getDoubanId();
        String other$doubanId = other.getDoubanId();
        if (this$doubanId == null ? other$doubanId != null : !this$doubanId.equals(other$doubanId)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        return !(this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestListRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $auditStatus = this.getAuditStatus();
        result = result * 59 + ($auditStatus == null ? 43 : ((Object)$auditStatus).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $season = this.getSeason();
        result = result * 59 + ($season == null ? 43 : ((Object)$season).hashCode());
        Integer $episode = this.getEpisode();
        result = result * 59 + ($episode == null ? 43 : ((Object)$episode).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $doubanId = this.getDoubanId();
        result = result * 59 + ($doubanId == null ? 43 : $doubanId.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestListRequest(name=" + this.getName() + ", type=" + this.getType() + ", tmdbId=" + this.getTmdbId() + ", doubanId=" + this.getDoubanId() + ", status=" + this.getStatus() + ", auditStatus=" + this.getAuditStatus() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", embyServerId=" + this.getEmbyServerId() + ", season=" + this.getSeason() + ", episode=" + this.getEpisode() + ")";
    }
}
