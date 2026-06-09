/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Generated;

@TableName(value="media_main")
public class MediaMain
extends BaseEntity
implements Serializable {
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_UPDATE_TIME = "update_time";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="title")
    private String title;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    @TableField(value="`type`")
    private String type;
    @TableField(value="poster_path")
    private String posterPath;
    @TableField(value="release_date")
    private Date releaseDate;
    @TableField(value="play_count")
    private Integer playCount;
    @TableField(value="rating")
    private BigDecimal rating;
    @TableField(value="duration")
    private Integer duration;
    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_TYPE = "type";
    public static final String COL_POSTER_PATH = "poster_path";
    public static final String COL_RELEASE_DATE = "release_date";
    public static final String COL_PLAY_COUNT = "play_count";
    public static final String COL_RATING = "rating";
    public static final String COL_DURATION = "duration";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public MediaMain() {
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
    public void setType(String type) {
        this.type = type;
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

    @Override
    @Generated
    public String toString() {
        return "MediaMain(id=" + this.getId() + ", title=" + this.getTitle() + ", embyInfoId=" + this.getEmbyInfoId() + ", type=" + this.getType() + ", posterPath=" + this.getPosterPath() + ", releaseDate=" + String.valueOf(this.getReleaseDate()) + ", playCount=" + this.getPlayCount() + ", rating=" + String.valueOf(this.getRating()) + ", duration=" + this.getDuration() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MediaMain)) {
            return false;
        }
        MediaMain other = (MediaMain)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        return !(this$rating == null ? other$rating != null : !((Object)this$rating).equals(other$rating));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MediaMain;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Integer $playCount = this.getPlayCount();
        result = result * 59 + ($playCount == null ? 43 : ((Object)$playCount).hashCode());
        Integer $duration = this.getDuration();
        result = result * 59 + ($duration == null ? 43 : ((Object)$duration).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $posterPath = this.getPosterPath();
        result = result * 59 + ($posterPath == null ? 43 : $posterPath.hashCode());
        Date $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : ((Object)$releaseDate).hashCode());
        BigDecimal $rating = this.getRating();
        result = result * 59 + ($rating == null ? 43 : ((Object)$rating).hashCode());
        return result;
    }
}
