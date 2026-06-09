/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.pointsbot;

import com.diboot.core.binding.annotation.BindField;
import com.una.embyhub.model.entity.PointsBotPrizeConfig;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class PointsBotLotteryResponse
implements Serializable {
    private Long id;
    private Long chatId;
    private String title;
    private String status;
    private Long prizeConfigId;
    @BindField(entity=PointsBotPrizeConfig.class, field="prizeName", condition="this.prize_config_id=id")
    private String prizeName;
    @BindField(entity=PointsBotPrizeConfig.class, field="requiredPoints", condition="this.prize_config_id=id")
    private Integer prizeRequiredPoints;
    private LocalDateTime drawAt;
    private LocalDateTime drawnAt;
    private Long createdByUserId;
    private String createdByUsername;
    private String createdByDisplayName;
    private Long winnerUserId;
    private String winnerUsername;
    private String winnerDisplayName;
    private Long winnerEntryId;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;
    private Integer winnerCount;
    private String winnersJson;
    private List<WinnerInfo> winners;

    @Generated
    public PointsBotLotteryResponse() {
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
    public String getTitle() {
        return this.title;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public Long getPrizeConfigId() {
        return this.prizeConfigId;
    }

    @Generated
    public String getPrizeName() {
        return this.prizeName;
    }

    @Generated
    public Integer getPrizeRequiredPoints() {
        return this.prizeRequiredPoints;
    }

    @Generated
    public LocalDateTime getDrawAt() {
        return this.drawAt;
    }

    @Generated
    public LocalDateTime getDrawnAt() {
        return this.drawnAt;
    }

    @Generated
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    @Generated
    public String getCreatedByUsername() {
        return this.createdByUsername;
    }

    @Generated
    public String getCreatedByDisplayName() {
        return this.createdByDisplayName;
    }

    @Generated
    public Long getWinnerUserId() {
        return this.winnerUserId;
    }

    @Generated
    public String getWinnerUsername() {
        return this.winnerUsername;
    }

    @Generated
    public String getWinnerDisplayName() {
        return this.winnerDisplayName;
    }

    @Generated
    public Long getWinnerEntryId() {
        return this.winnerEntryId;
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
    public Integer getWinnerCount() {
        return this.winnerCount;
    }

    @Generated
    public String getWinnersJson() {
        return this.winnersJson;
    }

    @Generated
    public List<WinnerInfo> getWinners() {
        return this.winners;
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
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setPrizeConfigId(Long prizeConfigId) {
        this.prizeConfigId = prizeConfigId;
    }

    @Generated
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    @Generated
    public void setPrizeRequiredPoints(Integer prizeRequiredPoints) {
        this.prizeRequiredPoints = prizeRequiredPoints;
    }

    @Generated
    public void setDrawAt(LocalDateTime drawAt) {
        this.drawAt = drawAt;
    }

    @Generated
    public void setDrawnAt(LocalDateTime drawnAt) {
        this.drawnAt = drawnAt;
    }

    @Generated
    public void setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    @Generated
    public void setCreatedByUsername(String createdByUsername) {
        this.createdByUsername = createdByUsername;
    }

    @Generated
    public void setCreatedByDisplayName(String createdByDisplayName) {
        this.createdByDisplayName = createdByDisplayName;
    }

    @Generated
    public void setWinnerUserId(Long winnerUserId) {
        this.winnerUserId = winnerUserId;
    }

    @Generated
    public void setWinnerUsername(String winnerUsername) {
        this.winnerUsername = winnerUsername;
    }

    @Generated
    public void setWinnerDisplayName(String winnerDisplayName) {
        this.winnerDisplayName = winnerDisplayName;
    }

    @Generated
    public void setWinnerEntryId(Long winnerEntryId) {
        this.winnerEntryId = winnerEntryId;
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
    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

    @Generated
    public void setWinnersJson(String winnersJson) {
        this.winnersJson = winnersJson;
    }

    @Generated
    public void setWinners(List<WinnerInfo> winners) {
        this.winners = winners;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLotteryResponse)) {
            return false;
        }
        PointsBotLotteryResponse other = (PointsBotLotteryResponse)o;
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
        Long this$prizeConfigId = this.getPrizeConfigId();
        Long other$prizeConfigId = other.getPrizeConfigId();
        if (this$prizeConfigId == null ? other$prizeConfigId != null : !((Object)this$prizeConfigId).equals(other$prizeConfigId)) {
            return false;
        }
        Integer this$prizeRequiredPoints = this.getPrizeRequiredPoints();
        Integer other$prizeRequiredPoints = other.getPrizeRequiredPoints();
        if (this$prizeRequiredPoints == null ? other$prizeRequiredPoints != null : !((Object)this$prizeRequiredPoints).equals(other$prizeRequiredPoints)) {
            return false;
        }
        Long this$createdByUserId = this.getCreatedByUserId();
        Long other$createdByUserId = other.getCreatedByUserId();
        if (this$createdByUserId == null ? other$createdByUserId != null : !((Object)this$createdByUserId).equals(other$createdByUserId)) {
            return false;
        }
        Long this$winnerUserId = this.getWinnerUserId();
        Long other$winnerUserId = other.getWinnerUserId();
        if (this$winnerUserId == null ? other$winnerUserId != null : !((Object)this$winnerUserId).equals(other$winnerUserId)) {
            return false;
        }
        Long this$winnerEntryId = this.getWinnerEntryId();
        Long other$winnerEntryId = other.getWinnerEntryId();
        if (this$winnerEntryId == null ? other$winnerEntryId != null : !((Object)this$winnerEntryId).equals(other$winnerEntryId)) {
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
        Integer this$winnerCount = this.getWinnerCount();
        Integer other$winnerCount = other.getWinnerCount();
        if (this$winnerCount == null ? other$winnerCount != null : !((Object)this$winnerCount).equals(other$winnerCount)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$prizeName = this.getPrizeName();
        String other$prizeName = other.getPrizeName();
        if (this$prizeName == null ? other$prizeName != null : !this$prizeName.equals(other$prizeName)) {
            return false;
        }
        LocalDateTime this$drawAt = this.getDrawAt();
        LocalDateTime other$drawAt = other.getDrawAt();
        if (this$drawAt == null ? other$drawAt != null : !((Object)this$drawAt).equals(other$drawAt)) {
            return false;
        }
        LocalDateTime this$drawnAt = this.getDrawnAt();
        LocalDateTime other$drawnAt = other.getDrawnAt();
        if (this$drawnAt == null ? other$drawnAt != null : !((Object)this$drawnAt).equals(other$drawnAt)) {
            return false;
        }
        String this$createdByUsername = this.getCreatedByUsername();
        String other$createdByUsername = other.getCreatedByUsername();
        if (this$createdByUsername == null ? other$createdByUsername != null : !this$createdByUsername.equals(other$createdByUsername)) {
            return false;
        }
        String this$createdByDisplayName = this.getCreatedByDisplayName();
        String other$createdByDisplayName = other.getCreatedByDisplayName();
        if (this$createdByDisplayName == null ? other$createdByDisplayName != null : !this$createdByDisplayName.equals(other$createdByDisplayName)) {
            return false;
        }
        String this$winnerUsername = this.getWinnerUsername();
        String other$winnerUsername = other.getWinnerUsername();
        if (this$winnerUsername == null ? other$winnerUsername != null : !this$winnerUsername.equals(other$winnerUsername)) {
            return false;
        }
        String this$winnerDisplayName = this.getWinnerDisplayName();
        String other$winnerDisplayName = other.getWinnerDisplayName();
        if (this$winnerDisplayName == null ? other$winnerDisplayName != null : !this$winnerDisplayName.equals(other$winnerDisplayName)) {
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
        String this$winnersJson = this.getWinnersJson();
        String other$winnersJson = other.getWinnersJson();
        if (this$winnersJson == null ? other$winnersJson != null : !this$winnersJson.equals(other$winnersJson)) {
            return false;
        }
        List<WinnerInfo> this$winners = this.getWinners();
        List<WinnerInfo> other$winners = other.getWinners();
        return !(this$winners == null ? other$winners != null : !((Object)this$winners).equals(other$winners));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLotteryResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $prizeConfigId = this.getPrizeConfigId();
        result = result * 59 + ($prizeConfigId == null ? 43 : ((Object)$prizeConfigId).hashCode());
        Integer $prizeRequiredPoints = this.getPrizeRequiredPoints();
        result = result * 59 + ($prizeRequiredPoints == null ? 43 : ((Object)$prizeRequiredPoints).hashCode());
        Long $createdByUserId = this.getCreatedByUserId();
        result = result * 59 + ($createdByUserId == null ? 43 : ((Object)$createdByUserId).hashCode());
        Long $winnerUserId = this.getWinnerUserId();
        result = result * 59 + ($winnerUserId == null ? 43 : ((Object)$winnerUserId).hashCode());
        Long $winnerEntryId = this.getWinnerEntryId();
        result = result * 59 + ($winnerEntryId == null ? 43 : ((Object)$winnerEntryId).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        Integer $winnerCount = this.getWinnerCount();
        result = result * 59 + ($winnerCount == null ? 43 : ((Object)$winnerCount).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $prizeName = this.getPrizeName();
        result = result * 59 + ($prizeName == null ? 43 : $prizeName.hashCode());
        LocalDateTime $drawAt = this.getDrawAt();
        result = result * 59 + ($drawAt == null ? 43 : ((Object)$drawAt).hashCode());
        LocalDateTime $drawnAt = this.getDrawnAt();
        result = result * 59 + ($drawnAt == null ? 43 : ((Object)$drawnAt).hashCode());
        String $createdByUsername = this.getCreatedByUsername();
        result = result * 59 + ($createdByUsername == null ? 43 : $createdByUsername.hashCode());
        String $createdByDisplayName = this.getCreatedByDisplayName();
        result = result * 59 + ($createdByDisplayName == null ? 43 : $createdByDisplayName.hashCode());
        String $winnerUsername = this.getWinnerUsername();
        result = result * 59 + ($winnerUsername == null ? 43 : $winnerUsername.hashCode());
        String $winnerDisplayName = this.getWinnerDisplayName();
        result = result * 59 + ($winnerDisplayName == null ? 43 : $winnerDisplayName.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        String $winnersJson = this.getWinnersJson();
        result = result * 59 + ($winnersJson == null ? 43 : $winnersJson.hashCode());
        List<WinnerInfo> $winners = this.getWinners();
        result = result * 59 + ($winners == null ? 43 : ((Object)$winners).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PointsBotLotteryResponse(id=" + this.getId() + ", chatId=" + this.getChatId() + ", title=" + this.getTitle() + ", status=" + this.getStatus() + ", prizeConfigId=" + this.getPrizeConfigId() + ", prizeName=" + this.getPrizeName() + ", prizeRequiredPoints=" + this.getPrizeRequiredPoints() + ", drawAt=" + String.valueOf(this.getDrawAt()) + ", drawnAt=" + String.valueOf(this.getDrawnAt()) + ", createdByUserId=" + this.getCreatedByUserId() + ", createdByUsername=" + this.getCreatedByUsername() + ", createdByDisplayName=" + this.getCreatedByDisplayName() + ", winnerUserId=" + this.getWinnerUserId() + ", winnerUsername=" + this.getWinnerUsername() + ", winnerDisplayName=" + this.getWinnerDisplayName() + ", winnerEntryId=" + this.getWinnerEntryId() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ", winnerCount=" + this.getWinnerCount() + ", winnersJson=" + this.getWinnersJson() + ", winners=" + String.valueOf(this.getWinners()) + ")";
    }

    public static class WinnerInfo
    implements Serializable {
        private Long userId;
        private String username;
        private String displayName;
        private Long entryId;

        @Generated
        public WinnerInfo() {
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
        public Long getEntryId() {
            return this.entryId;
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
        public void setEntryId(Long entryId) {
            this.entryId = entryId;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof WinnerInfo)) {
                return false;
            }
            WinnerInfo other = (WinnerInfo)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Long this$userId = this.getUserId();
            Long other$userId = other.getUserId();
            if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
                return false;
            }
            Long this$entryId = this.getEntryId();
            Long other$entryId = other.getEntryId();
            if (this$entryId == null ? other$entryId != null : !((Object)this$entryId).equals(other$entryId)) {
                return false;
            }
            String this$username = this.getUsername();
            String other$username = other.getUsername();
            if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
                return false;
            }
            String this$displayName = this.getDisplayName();
            String other$displayName = other.getDisplayName();
            return !(this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof WinnerInfo;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $userId = this.getUserId();
            result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
            Long $entryId = this.getEntryId();
            result = result * 59 + ($entryId == null ? 43 : ((Object)$entryId).hashCode());
            String $username = this.getUsername();
            result = result * 59 + ($username == null ? 43 : $username.hashCode());
            String $displayName = this.getDisplayName();
            result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "PointsBotLotteryResponse.WinnerInfo(userId=" + this.getUserId() + ", username=" + this.getUsername() + ", displayName=" + this.getDisplayName() + ", entryId=" + this.getEntryId() + ")";
        }
    }
}
