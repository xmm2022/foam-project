/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindEntityList
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.mediamain;

import com.diboot.core.binding.annotation.BindEntityList;
import com.una.embyhub.model.dto.response.mediaviewdetail.MediaViewDetailResponse;
import com.una.embyhub.model.entity.MediaViewDetail;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class MediaMainResponse
implements Serializable {
    private Long id;
    private String title;
    private Long embyInfoId;
    private String type;
    private String typeName;
    private String posterPath;
    private Date releaseDate;
    private Integer playCount;
    private BigDecimal rating;
    private Integer duration;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;
    @BindEntityList(entity=MediaViewDetail.class, condition="this.id=media_id")
    private List<MediaViewDetailResponse> mediaViewDetailResponseList;

    public void setType(String type) {
        this.type = type;
        if ("movie".equals(type)) {
            this.typeName = "\u7535\u5f71";
        }
        if ("tv".equals(type)) {
            this.typeName = "\u7535\u89c6\u5267";
        }
    }

    @Generated
    public MediaMainResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public String getTypeName() {
        return this.typeName;
    }

    @Generated
    public String getPosterPath() {
        return this.posterPath;
    }

    @Generated
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public Integer getPlayCount() {
        return this.playCount;
    }

    @Generated
    public BigDecimal getRating() {
        return this.rating;
    }

    @Generated
    public Integer getDuration() {
        return this.duration;
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
    public List<MediaViewDetailResponse> getMediaViewDetailResponseList() {
        return this.mediaViewDetailResponseList;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Generated
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @Generated
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    @Generated
    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    @Generated
    public void setDuration(Integer duration) {
        this.duration = duration;
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
    public void setMediaViewDetailResponseList(List<MediaViewDetailResponse> mediaViewDetailResponseList) {
        this.mediaViewDetailResponseList = mediaViewDetailResponseList;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MediaMainResponse)) {
            return false;
        }
        MediaMainResponse other = (MediaMainResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Integer this$playCount = this.getPlayCount();
        Integer other$playCount = other.getPlayCount();
        if (this$playCount == null ? other$playCount != null : !((Object)this$playCount).equals(other$playCount)) {
            return false;
        }
        Integer this$duration = this.getDuration();
        Integer other$duration = other.getDuration();
        if (this$duration == null ? other$duration != null : !((Object)this$duration).equals(other$duration)) {
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
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$typeName = this.getTypeName();
        String other$typeName = other.getTypeName();
        if (this$typeName == null ? other$typeName != null : !this$typeName.equals(other$typeName)) {
            return false;
        }
        String this$posterPath = this.getPosterPath();
        String other$posterPath = other.getPosterPath();
        if (this$posterPath == null ? other$posterPath != null : !this$posterPath.equals(other$posterPath)) {
            return false;
        }
        Date this$releaseDate = this.getReleaseDate();
        Date other$releaseDate = other.getReleaseDate();
        if (this$releaseDate == null ? other$releaseDate != null : !((Object)this$releaseDate).equals(other$releaseDate)) {
            return false;
        }
        BigDecimal this$rating = this.getRating();
        BigDecimal other$rating = other.getRating();
        if (this$rating == null ? other$rating != null : !((Object)this$rating).equals(other$rating)) {
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
        List<MediaViewDetailResponse> this$mediaViewDetailResponseList = this.getMediaViewDetailResponseList();
        List<MediaViewDetailResponse> other$mediaViewDetailResponseList = other.getMediaViewDetailResponseList();
        return !(this$mediaViewDetailResponseList == null ? other$mediaViewDetailResponseList != null : !((Object)this$mediaViewDetailResponseList).equals(other$mediaViewDetailResponseList));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MediaMainResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $playCount = this.getPlayCount();
        result = result * 59 + ($playCount == null ? 43 : ((Object)$playCount).hashCode());
        Integer $duration = this.getDuration();
        result = result * 59 + ($duration == null ? 43 : ((Object)$duration).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $typeName = this.getTypeName();
        result = result * 59 + ($typeName == null ? 43 : $typeName.hashCode());
        String $posterPath = this.getPosterPath();
        result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
        Date $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : ((Object)$releaseDate).hashCode());
        BigDecimal $rating = this.getRating();
        result = result * 59 + ($rating == null ? 43 : ((Object)$rating).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        List<MediaViewDetailResponse> $mediaViewDetailResponseList = this.getMediaViewDetailResponseList();
        result = result * 59 + ($mediaViewDetailResponseList == null ? 43 : ((Object)$mediaViewDetailResponseList).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MediaMainResponse(id=" + this.getId() + ", title=" + this.getTitle() + ", embyInfoId=" + this.getEmbyInfoId() + ", type=" + this.getType() + ", typeName=" + this.getTypeName() + ", posterPath=" + this.getPosterPath() + ", releaseDate=" + String.valueOf(this.getReleaseDate()) + ", playCount=" + this.getPlayCount() + ", rating=" + String.valueOf(this.getRating()) + ", duration=" + this.getDuration() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ", mediaViewDetailResponseList=" + String.valueOf(this.getMediaViewDetailResponseList()) + ")";
    }
}
