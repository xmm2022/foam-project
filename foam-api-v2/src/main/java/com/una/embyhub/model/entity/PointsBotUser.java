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
import java.time.LocalDate;
import lombok.Generated;

@TableName(value="points_bot_user")
public class PointsBotUser
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="chat_id")
    private Long chatId;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="username")
    private String username;
    @TableField(value="display_name")
    private String displayName;
    @TableField(value="level_id")
    private Long levelId;
    @TableField(value="level_name")
    private String levelName;
    @TableField(value="points")
    private Long points;
    @TableField(value="checkin_streak")
    private Integer checkinStreak;
    @TableField(value="last_checkin_date")
    private LocalDate lastCheckinDate;
    @TableField(value="last_message_date")
    private LocalDate lastMessageDate;
    @TableField(value="daily_message_points")
    private Integer dailyMessagePoints;
    @TableField(value="daily_message_count")
    private Integer dailyMessageCount;

    @Generated
    public PointsBotUser() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getChatId() {
        return this.chatId;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    @Generated
    public Long getLevelId() {
        return this.levelId;
    }

    @Generated
    public String getLevelName() {
        return this.levelName;
    }

    @Generated
    public Long getPoints() {
        return this.points;
    }

    @Generated
    public Integer getCheckinStreak() {
        return this.checkinStreak;
    }

    @Generated
    public LocalDate getLastCheckinDate() {
        return this.lastCheckinDate;
    }

    @Generated
    public LocalDate getLastMessageDate() {
        return this.lastMessageDate;
    }

    @Generated
    public Integer getDailyMessagePoints() {
        return this.dailyMessagePoints;
    }

    @Generated
    public Integer getDailyMessageCount() {
        return this.dailyMessageCount;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Generated
    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    @Generated
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Generated
    public void setPoints(Long points) {
        this.points = points;
    }

    @Generated
    public void setCheckinStreak(Integer checkinStreak) {
        this.checkinStreak = checkinStreak;
    }

    @Generated
    public void setLastCheckinDate(LocalDate lastCheckinDate) {
        this.lastCheckinDate = lastCheckinDate;
    }

    @Generated
    public void setLastMessageDate(LocalDate lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    @Generated
    public void setDailyMessagePoints(Integer dailyMessagePoints) {
        this.dailyMessagePoints = dailyMessagePoints;
    }

    @Generated
    public void setDailyMessageCount(Integer dailyMessageCount) {
        this.dailyMessageCount = dailyMessageCount;
    }

    @Override
    @Generated
    public String toString() {
        return "PointsBotUser(id=" + this.getId() + ", chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", username=" + this.getUsername() + ", displayName=" + this.getDisplayName() + ", levelId=" + this.getLevelId() + ", levelName=" + this.getLevelName() + ", points=" + this.getPoints() + ", checkinStreak=" + this.getCheckinStreak() + ", lastCheckinDate=" + String.valueOf(this.getLastCheckinDate()) + ", lastMessageDate=" + String.valueOf(this.getLastMessageDate()) + ", dailyMessagePoints=" + this.getDailyMessagePoints() + ", dailyMessageCount=" + this.getDailyMessageCount() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotUser)) {
            return false;
        }
        PointsBotUser other = (PointsBotUser)o;
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
        Long this$chatId = this.getChatId();
        Long other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !((Object)this$chatId).equals(other$chatId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Long this$levelId = this.getLevelId();
        Long other$levelId = other.getLevelId();
        if (this$levelId == null ? other$levelId != null : !((Object)this$levelId).equals(other$levelId)) {
            return false;
        }
        Long this$points = this.getPoints();
        Long other$points = other.getPoints();
        if (this$points == null ? other$points != null : !((Object)this$points).equals(other$points)) {
            return false;
        }
        Integer this$checkinStreak = this.getCheckinStreak();
        Integer other$checkinStreak = other.getCheckinStreak();
        if (this$checkinStreak == null ? other$checkinStreak != null : !((Object)this$checkinStreak).equals(other$checkinStreak)) {
            return false;
        }
        Integer this$dailyMessagePoints = this.getDailyMessagePoints();
        Integer other$dailyMessagePoints = other.getDailyMessagePoints();
        if (this$dailyMessagePoints == null ? other$dailyMessagePoints != null : !((Object)this$dailyMessagePoints).equals(other$dailyMessagePoints)) {
            return false;
        }
        Integer this$dailyMessageCount = this.getDailyMessageCount();
        Integer other$dailyMessageCount = other.getDailyMessageCount();
        if (this$dailyMessageCount == null ? other$dailyMessageCount != null : !((Object)this$dailyMessageCount).equals(other$dailyMessageCount)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$displayName = this.getDisplayName();
        String other$displayName = other.getDisplayName();
        if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) {
            return false;
        }
        String this$levelName = this.getLevelName();
        String other$levelName = other.getLevelName();
        if (this$levelName == null ? other$levelName != null : !this$levelName.equals(other$levelName)) {
            return false;
        }
        LocalDate this$lastCheckinDate = this.getLastCheckinDate();
        LocalDate other$lastCheckinDate = other.getLastCheckinDate();
        if (this$lastCheckinDate == null ? other$lastCheckinDate != null : !((Object)this$lastCheckinDate).equals(other$lastCheckinDate)) {
            return false;
        }
        LocalDate this$lastMessageDate = this.getLastMessageDate();
        LocalDate other$lastMessageDate = other.getLastMessageDate();
        return !(this$lastMessageDate == null ? other$lastMessageDate != null : !((Object)this$lastMessageDate).equals(other$lastMessageDate));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotUser;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $levelId = this.getLevelId();
        result = result * 59 + ($levelId == null ? 43 : ((Object)$levelId).hashCode());
        Long $points = this.getPoints();
        result = result * 59 + ($points == null ? 43 : ((Object)$points).hashCode());
        Integer $checkinStreak = this.getCheckinStreak();
        result = result * 59 + ($checkinStreak == null ? 43 : ((Object)$checkinStreak).hashCode());
        Integer $dailyMessagePoints = this.getDailyMessagePoints();
        result = result * 59 + ($dailyMessagePoints == null ? 43 : ((Object)$dailyMessagePoints).hashCode());
        Integer $dailyMessageCount = this.getDailyMessageCount();
        result = result * 59 + ($dailyMessageCount == null ? 43 : ((Object)$dailyMessageCount).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $displayName = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
        String $levelName = this.getLevelName();
        result = result * 59 + ($levelName == null ? 43 : $levelName.hashCode());
        LocalDate $lastCheckinDate = this.getLastCheckinDate();
        result = result * 59 + ($lastCheckinDate == null ? 43 : ((Object)$lastCheckinDate).hashCode());
        LocalDate $lastMessageDate = this.getLastMessageDate();
        result = result * 59 + ($lastMessageDate == null ? 43 : ((Object)$lastMessageDate).hashCode());
        return result;
    }
}
