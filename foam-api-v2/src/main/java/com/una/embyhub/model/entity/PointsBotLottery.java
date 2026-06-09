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
import java.time.LocalDateTime;
import lombok.Generated;

@TableName(value="points_bot_lottery")
public class PointsBotLottery
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="chat_id")
    private Long chatId;
    @TableField(value="title")
    private String title;
    @TableField(value="winner_count")
    private Integer winnerCount;
    @TableField(value="prize_config_id")
    private Long prizeConfigId;
    @TableField(value="status")
    private String status;
    @TableField(value="draw_at")
    private LocalDateTime drawAt;
    @TableField(value="drawn_at")
    private LocalDateTime drawnAt;
    @TableField(value="created_by_user_id")
    private Long createdByUserId;
    @TableField(value="created_by_username")
    private String createdByUsername;
    @TableField(value="created_by_display_name")
    private String createdByDisplayName;
    @TableField(value="winner_user_id")
    private Long winnerUserId;
    @TableField(value="winner_username")
    private String winnerUsername;
    @TableField(value="winner_display_name")
    private String winnerDisplayName;
    @TableField(value="winner_entry_id")
    private Long winnerEntryId;
    @TableField(value="announcement_message_id")
    private Long announcementMessageId;
    @TableField(value="winners_json")
    private String winnersJson;

    @Generated
    public PointsBotLottery() {
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
    public Integer getWinnerCount() {
        return this.winnerCount;
    }

    @Generated
    public Long getPrizeConfigId() {
        return this.prizeConfigId;
    }

    @Generated
    public String getStatus() {
        return this.status;
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
    public Long getAnnouncementMessageId() {
        return this.announcementMessageId;
    }

    @Generated
    public String getWinnersJson() {
        return this.winnersJson;
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
    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

    @Generated
    public void setPrizeConfigId(Long prizeConfigId) {
        this.prizeConfigId = prizeConfigId;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
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
    public void setAnnouncementMessageId(Long announcementMessageId) {
        this.announcementMessageId = announcementMessageId;
    }

    @Generated
    public void setWinnersJson(String winnersJson) {
        this.winnersJson = winnersJson;
    }

    @Override
    @Generated
    public String toString() {
        return "PointsBotLottery(id=" + this.getId() + ", chatId=" + this.getChatId() + ", title=" + this.getTitle() + ", winnerCount=" + this.getWinnerCount() + ", prizeConfigId=" + this.getPrizeConfigId() + ", status=" + this.getStatus() + ", drawAt=" + String.valueOf(this.getDrawAt()) + ", drawnAt=" + String.valueOf(this.getDrawnAt()) + ", createdByUserId=" + this.getCreatedByUserId() + ", createdByUsername=" + this.getCreatedByUsername() + ", createdByDisplayName=" + this.getCreatedByDisplayName() + ", winnerUserId=" + this.getWinnerUserId() + ", winnerUsername=" + this.getWinnerUsername() + ", winnerDisplayName=" + this.getWinnerDisplayName() + ", winnerEntryId=" + this.getWinnerEntryId() + ", announcementMessageId=" + this.getAnnouncementMessageId() + ", winnersJson=" + this.getWinnersJson() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLottery)) {
            return false;
        }
        PointsBotLottery other = (PointsBotLottery)o;
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
        Integer this$winnerCount = this.getWinnerCount();
        Integer other$winnerCount = other.getWinnerCount();
        if (this$winnerCount == null ? other$winnerCount != null : !((Object)this$winnerCount).equals(other$winnerCount)) {
            return false;
        }
        Long this$prizeConfigId = this.getPrizeConfigId();
        Long other$prizeConfigId = other.getPrizeConfigId();
        if (this$prizeConfigId == null ? other$prizeConfigId != null : !((Object)this$prizeConfigId).equals(other$prizeConfigId)) {
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
        Long this$announcementMessageId = this.getAnnouncementMessageId();
        Long other$announcementMessageId = other.getAnnouncementMessageId();
        if (this$announcementMessageId == null ? other$announcementMessageId != null : !((Object)this$announcementMessageId).equals(other$announcementMessageId)) {
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
        String this$winnersJson = this.getWinnersJson();
        String other$winnersJson = other.getWinnersJson();
        return !(this$winnersJson == null ? other$winnersJson != null : !this$winnersJson.equals(other$winnersJson));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLottery;
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
        Integer $winnerCount = this.getWinnerCount();
        result = result * 59 + ($winnerCount == null ? 43 : ((Object)$winnerCount).hashCode());
        Long $prizeConfigId = this.getPrizeConfigId();
        result = result * 59 + ($prizeConfigId == null ? 43 : ((Object)$prizeConfigId).hashCode());
        Long $createdByUserId = this.getCreatedByUserId();
        result = result * 59 + ($createdByUserId == null ? 43 : ((Object)$createdByUserId).hashCode());
        Long $winnerUserId = this.getWinnerUserId();
        result = result * 59 + ($winnerUserId == null ? 43 : ((Object)$winnerUserId).hashCode());
        Long $winnerEntryId = this.getWinnerEntryId();
        result = result * 59 + ($winnerEntryId == null ? 43 : ((Object)$winnerEntryId).hashCode());
        Long $announcementMessageId = this.getAnnouncementMessageId();
        result = result * 59 + ($announcementMessageId == null ? 43 : ((Object)$announcementMessageId).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
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
        String $winnersJson = this.getWinnersJson();
        result = result * 59 + ($winnersJson == null ? 43 : $winnersJson.hashCode());
        return result;
    }
}
