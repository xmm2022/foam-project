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
import lombok.Generated;

@TableName(value="points_bot_lottery_entry")
public class PointsBotLotteryEntry
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="lottery_id")
    private Long lotteryId;
    @TableField(value="chat_id")
    private Long chatId;
    @TableField(value="user_id")
    private Long userId;
    @TableField(value="username")
    private String username;
    @TableField(value="display_name")
    private String displayName;
    @TableField(value="entry_note")
    private String entryNote;
    @TableField(value="is_winner")
    private Boolean isWinner;

    @Generated
    public PointsBotLotteryEntry() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getLotteryId() {
        return this.lotteryId;
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
    public String getEntryNote() {
        return this.entryNote;
    }

    @Generated
    public Boolean getIsWinner() {
        return this.isWinner;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setLotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
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
    public void setEntryNote(String entryNote) {
        this.entryNote = entryNote;
    }

    @Generated
    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
    }

    @Override
    @Generated
    public String toString() {
        return "PointsBotLotteryEntry(id=" + this.getId() + ", lotteryId=" + this.getLotteryId() + ", chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", username=" + this.getUsername() + ", displayName=" + this.getDisplayName() + ", entryNote=" + this.getEntryNote() + ", isWinner=" + this.getIsWinner() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PointsBotLotteryEntry)) {
            return false;
        }
        PointsBotLotteryEntry other = (PointsBotLotteryEntry)o;
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
        Long this$lotteryId = this.getLotteryId();
        Long other$lotteryId = other.getLotteryId();
        if (this$lotteryId == null ? other$lotteryId != null : !((Object)this$lotteryId).equals(other$lotteryId)) {
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
        Boolean this$isWinner = this.getIsWinner();
        Boolean other$isWinner = other.getIsWinner();
        if (this$isWinner == null ? other$isWinner != null : !((Object)this$isWinner).equals(other$isWinner)) {
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
        String this$entryNote = this.getEntryNote();
        String other$entryNote = other.getEntryNote();
        return !(this$entryNote == null ? other$entryNote != null : !this$entryNote.equals(other$entryNote));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PointsBotLotteryEntry;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $lotteryId = this.getLotteryId();
        result = result * 59 + ($lotteryId == null ? 43 : ((Object)$lotteryId).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Boolean $isWinner = this.getIsWinner();
        result = result * 59 + ($isWinner == null ? 43 : ((Object)$isWinner).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $displayName = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
        String $entryNote = this.getEntryNote();
        result = result * 59 + ($entryNote == null ? 43 : $entryNote.hashCode());
        return result;
    }
}
