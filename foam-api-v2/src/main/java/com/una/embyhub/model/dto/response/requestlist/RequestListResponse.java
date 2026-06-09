/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.requestlist;

import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.model.entity.EmbyInfo;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class RequestListResponse
implements Serializable {
    private Long id;
    private String name;
    private String type;
    private String typeNmae;
    private String imageUrl;
    private String score;
    private String tmdbUrl;
    private String doubanId;
    private String doubanUrl;
    private String doubanScore;
    private String doubanImage;
    private Date releaseDate;
    private Integer tmdbId;
    private String overview;
    private Long userId;
    private Integer status;
    private String statusName;
    private Integer auditStatus;
    private String auditStatusName;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private String embyUserName;
    private Long embyInfoId;
    private String embyServerId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String embyServerName;
    private String backdropPath;
    private Integer parentTmdbId;
    private String remark;

    public void setType(String type) {
        this.type = type;
        if (type.equals("movie")) {
            this.typeNmae = "\u7535\u5f71";
        } else if (type.equals("tv")) {
            this.typeNmae = "\u7535\u89c6\u5267";
        }
    }

    public void setStatus(Integer status) {
        this.status = status;
        if (status == 0) {
            this.statusName = "\u5df2\u63d0\u4ea4";
        } else if (status == 1) {
            this.statusName = "\u5df2\u5165\u5e93";
        } else if (status == 2) {
            this.statusName = "\u5df2\u62d2\u7edd";
        }
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        if (auditStatus != null) {
            if (auditStatus == 0) {
                this.auditStatusName = "\u5f85\u5ba1\u6838";
            } else if (auditStatus == 1) {
                this.auditStatusName = "\u5df2\u901a\u8fc7";
            } else if (auditStatus == 2) {
                this.auditStatusName = "\u5df2\u62d2\u7edd";
            }
        }
    }

    @Generated
    public RequestListResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
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
    public String getTypeNmae() {
        return this.typeNmae;
    }

    @Generated
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Generated
    public String getScore() {
        return this.score;
    }

    @Generated
    public String getTmdbUrl() {
        return this.tmdbUrl;
    }

    @Generated
    public String getDoubanId() {
        return this.doubanId;
    }

    @Generated
    public String getDoubanUrl() {
        return this.doubanUrl;
    }

    @Generated
    public String getDoubanScore() {
        return this.doubanScore;
    }

    @Generated
    public String getDoubanImage() {
        return this.doubanImage;
    }

    @Generated
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public String getOverview() {
        return this.overview;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getStatusName() {
        return this.statusName;
    }

    @Generated
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    @Generated
    public String getAuditStatusName() {
        return this.auditStatusName;
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
    public String getEmbyServerName() {
        return this.embyServerName;
    }

    @Generated
    public String getBackdropPath() {
        return this.backdropPath;
    }

    @Generated
    public Integer getParentTmdbId() {
        return this.parentTmdbId;
    }

    @Generated
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setTypeNmae(String typeNmae) {
        this.typeNmae = typeNmae;
    }

    @Generated
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Generated
    public void setScore(String score) {
        this.score = score;
    }

    @Generated
    public void setTmdbUrl(String tmdbUrl) {
        this.tmdbUrl = tmdbUrl;
    }

    @Generated
    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    @Generated
    public void setDoubanUrl(String doubanUrl) {
        this.doubanUrl = doubanUrl;
    }

    @Generated
    public void setDoubanScore(String doubanScore) {
        this.doubanScore = doubanScore;
    }

    @Generated
    public void setDoubanImage(String doubanImage) {
        this.doubanImage = doubanImage;
    }

    @Generated
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Generated
    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
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
    public void setEmbyServerName(String embyServerName) {
        this.embyServerName = embyServerName;
    }

    @Generated
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Generated
    public void setParentTmdbId(Integer parentTmdbId) {
        this.parentTmdbId = parentTmdbId;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestListResponse)) {
            return false;
        }
        RequestListResponse other = (RequestListResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
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
        Integer this$parentTmdbId = this.getParentTmdbId();
        Integer other$parentTmdbId = other.getParentTmdbId();
        if (this$parentTmdbId == null ? other$parentTmdbId != null : !((Object)this$parentTmdbId).equals(other$parentTmdbId)) {
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
        String this$typeNmae = this.getTypeNmae();
        String other$typeNmae = other.getTypeNmae();
        if (this$typeNmae == null ? other$typeNmae != null : !this$typeNmae.equals(other$typeNmae)) {
            return false;
        }
        String this$imageUrl = this.getImageUrl();
        String other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) {
            return false;
        }
        String this$score = this.getScore();
        String other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) {
            return false;
        }
        String this$tmdbUrl = this.getTmdbUrl();
        String other$tmdbUrl = other.getTmdbUrl();
        if (this$tmdbUrl == null ? other$tmdbUrl != null : !this$tmdbUrl.equals(other$tmdbUrl)) {
            return false;
        }
        String this$doubanId = this.getDoubanId();
        String other$doubanId = other.getDoubanId();
        if (this$doubanId == null ? other$doubanId != null : !this$doubanId.equals(other$doubanId)) {
            return false;
        }
        String this$doubanUrl = this.getDoubanUrl();
        String other$doubanUrl = other.getDoubanUrl();
        if (this$doubanUrl == null ? other$doubanUrl != null : !this$doubanUrl.equals(other$doubanUrl)) {
            return false;
        }
        String this$doubanScore = this.getDoubanScore();
        String other$doubanScore = other.getDoubanScore();
        if (this$doubanScore == null ? other$doubanScore != null : !this$doubanScore.equals(other$doubanScore)) {
            return false;
        }
        String this$doubanImage = this.getDoubanImage();
        String other$doubanImage = other.getDoubanImage();
        if (this$doubanImage == null ? other$doubanImage != null : !this$doubanImage.equals(other$doubanImage)) {
            return false;
        }
        Date this$releaseDate = this.getReleaseDate();
        Date other$releaseDate = other.getReleaseDate();
        if (this$releaseDate == null ? other$releaseDate != null : !((Object)this$releaseDate).equals(other$releaseDate)) {
            return false;
        }
        String this$overview = this.getOverview();
        String other$overview = other.getOverview();
        if (this$overview == null ? other$overview != null : !this$overview.equals(other$overview)) {
            return false;
        }
        String this$statusName = this.getStatusName();
        String other$statusName = other.getStatusName();
        if (this$statusName == null ? other$statusName != null : !this$statusName.equals(other$statusName)) {
            return false;
        }
        String this$auditStatusName = this.getAuditStatusName();
        String other$auditStatusName = other.getAuditStatusName();
        if (this$auditStatusName == null ? other$auditStatusName != null : !this$auditStatusName.equals(other$auditStatusName)) {
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
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$embyServerId = this.getEmbyServerId();
        String other$embyServerId = other.getEmbyServerId();
        if (this$embyServerId == null ? other$embyServerId != null : !this$embyServerId.equals(other$embyServerId)) {
            return false;
        }
        String this$embyServerName = this.getEmbyServerName();
        String other$embyServerName = other.getEmbyServerName();
        if (this$embyServerName == null ? other$embyServerName != null : !this$embyServerName.equals(other$embyServerName)) {
            return false;
        }
        String this$backdropPath = this.getBackdropPath();
        String other$backdropPath = other.getBackdropPath();
        if (this$backdropPath == null ? other$backdropPath != null : !this$backdropPath.equals(other$backdropPath)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RequestListResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $auditStatus = this.getAuditStatus();
        result = result * 59 + ($auditStatus == null ? 43 : ((Object)$auditStatus).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $parentTmdbId = this.getParentTmdbId();
        result = result * 59 + ($parentTmdbId == null ? 43 : ((Object)$parentTmdbId).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $typeNmae = this.getTypeNmae();
        result = result * 59 + ($typeNmae == null ? 43 : $typeNmae.hashCode());
        String $imageUrl = this.getImageUrl();
        result = result * 59 + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        String $score = this.getScore();
        result = result * 59 + ($score == null ? 43 : $score.hashCode());
        String $tmdbUrl = this.getTmdbUrl();
        result = result * 59 + ($tmdbUrl == null ? 43 : $tmdbUrl.hashCode());
        String $doubanId = this.getDoubanId();
        result = result * 59 + ($doubanId == null ? 43 : $doubanId.hashCode());
        String $doubanUrl = this.getDoubanUrl();
        result = result * 59 + ($doubanUrl == null ? 43 : $doubanUrl.hashCode());
        String $doubanScore = this.getDoubanScore();
        result = result * 59 + ($doubanScore == null ? 43 : $doubanScore.hashCode());
        String $doubanImage = this.getDoubanImage();
        result = result * 59 + ($doubanImage == null ? 43 : $doubanImage.hashCode());
        Date $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : ((Object)$releaseDate).hashCode());
        String $overview = this.getOverview();
        result = result * 59 + ($overview == null ? 43 : $overview.hashCode());
        String $statusName = this.getStatusName();
        result = result * 59 + ($statusName == null ? 43 : $statusName.hashCode());
        String $auditStatusName = this.getAuditStatusName();
        result = result * 59 + ($auditStatusName == null ? 43 : $auditStatusName.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $embyServerId = this.getEmbyServerId();
        result = result * 59 + ($embyServerId == null ? 43 : $embyServerId.hashCode());
        String $embyServerName = this.getEmbyServerName();
        result = result * 59 + ($embyServerName == null ? 43 : $embyServerName.hashCode());
        String $backdropPath = this.getBackdropPath();
        result = result * 59 + ($backdropPath == null ? 43 : $backdropPath.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RequestListResponse(id=" + this.getId() + ", name=" + this.getName() + ", type=" + this.getType() + ", typeNmae=" + this.getTypeNmae() + ", imageUrl=" + this.getImageUrl() + ", score=" + this.getScore() + ", tmdbUrl=" + this.getTmdbUrl() + ", doubanId=" + this.getDoubanId() + ", doubanUrl=" + this.getDoubanUrl() + ", doubanScore=" + this.getDoubanScore() + ", doubanImage=" + this.getDoubanImage() + ", releaseDate=" + String.valueOf(this.getReleaseDate()) + ", tmdbId=" + this.getTmdbId() + ", overview=" + this.getOverview() + ", userId=" + this.getUserId() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", auditStatus=" + this.getAuditStatus() + ", auditStatusName=" + this.getAuditStatusName() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", embyUserName=" + this.getEmbyUserName() + ", embyInfoId=" + this.getEmbyInfoId() + ", embyServerId=" + this.getEmbyServerId() + ", embyServerName=" + this.getEmbyServerName() + ", backdropPath=" + this.getBackdropPath() + ", parentTmdbId=" + this.getParentTmdbId() + ", remark=" + this.getRemark() + ")";
    }
}
