/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.pointsbot;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import lombok.Generated;

public class PointsBotUserResponse
implements Serializable {
    private Long id;
    private Long chatId;
    private Long userId;
    private String username;
    private String displayName;
    private String embyUserName;
    private Long levelId;
    private String levelName;
    private Long points;
    private Integer checkinStreak;
    private LocalDate lastCheckinDate;
    private LocalDate lastMessageDate;
    private Integer dailyMessagePoints;
    private Integer dailyMessageCount;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;

    @Generated
    public PointsBotUserResponse() {
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
    public String getEmbyUserName() {
        return this.embyUserName;
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
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
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
        if (!(o instanceof PointsBotUserResponse)) {
            return false;
        }
        PointsBotUserResponse other = (PointsBotUserResponse)o;
        if (!other.canEqual(this)) {
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
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
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
        if (this$lastMessageDate == null ? other$lastMessageDate != null : !((Object)this$lastMessageDate).equals(other$lastMessageDate)) {
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
        return other instanceof PointsBotUserResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $displayName = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $levelName = this.getLevelName();
        result = result * 59 + ($levelName == null ? 43 : $levelName.hashCode());
        LocalDate $lastCheckinDate = this.getLastCheckinDate();
        result = result * 59 + ($lastCheckinDate == null ? 43 : ((Object)$lastCheckinDate).hashCode());
        LocalDate $lastMessageDate = this.getLastMessageDate();
        result = result * 59 + ($lastMessageDate == null ? 43 : ((Object)$lastMessageDate).hashCode());
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
        return "PointsBotUserResponse(id=" + this.getId() + ", chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", username=" + this.getUsername() + ", displayName=" + this.getDisplayName() + ", embyUserName=" + this.getEmbyUserName() + ", levelId=" + this.getLevelId() + ", levelName=" + this.getLevelName() + ", points=" + this.getPoints() + ", checkinStreak=" + this.getCheckinStreak() + ", lastCheckinDate=" + String.valueOf(this.getLastCheckinDate()) + ", lastMessageDate=" + String.valueOf(this.getLastMessageDate()) + ", dailyMessagePoints=" + this.getDailyMessagePoints() + ", dailyMessageCount=" + this.getDailyMessageCount() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ")";
    }
}
