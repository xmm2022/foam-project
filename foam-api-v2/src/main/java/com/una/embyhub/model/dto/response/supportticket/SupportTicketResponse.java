/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.supportticket;

import com.una.embyhub.model.dto.response.supportticket.SupportTicketReplyResponse;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Generated;

public class SupportTicketResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String title;
    private String content;
    private Integer status;
    private String statusName;
    private Long userId;
    private String embyUserName;
    private Integer replyCount;
    private String lastReplyContent;
    private String lastReplyUserName;
    private Date lastReplyDatetime;
    private Date createDatetime;
    private Date updateDatetime;
    private List<SupportTicketReplyResponse> replies;

    public void setStatus(Integer status) {
        this.status = status;
        this.statusName = status == null ? "\u672a\u77e5" : (status == 1 ? "\u5df2\u6279\u51c6" : (status == 2 ? "\u5df2\u62d2\u7edd" : "\u5f85\u5904\u7406"));
    }

    @Generated
    public SupportTicketResponse() {
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
    public String getContent() {
        return this.content;
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
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Integer getReplyCount() {
        return this.replyCount;
    }

    @Generated
    public String getLastReplyContent() {
        return this.lastReplyContent;
    }

    @Generated
    public String getLastReplyUserName() {
        return this.lastReplyUserName;
    }

    @Generated
    public Date getLastReplyDatetime() {
        return this.lastReplyDatetime;
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
    public List<SupportTicketReplyResponse> getReplies() {
        return this.replies;
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
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    @Generated
    public void setLastReplyContent(String lastReplyContent) {
        this.lastReplyContent = lastReplyContent;
    }

    @Generated
    public void setLastReplyUserName(String lastReplyUserName) {
        this.lastReplyUserName = lastReplyUserName;
    }

    @Generated
    public void setLastReplyDatetime(Date lastReplyDatetime) {
        this.lastReplyDatetime = lastReplyDatetime;
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
    public void setReplies(List<SupportTicketReplyResponse> replies) {
        this.replies = replies;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportTicketResponse)) {
            return false;
        }
        SupportTicketResponse other = (SupportTicketResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$replyCount = this.getReplyCount();
        Integer other$replyCount = other.getReplyCount();
        if (this$replyCount == null ? other$replyCount != null : !((Object)this$replyCount).equals(other$replyCount)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) {
            return false;
        }
        String this$statusName = this.getStatusName();
        String other$statusName = other.getStatusName();
        if (this$statusName == null ? other$statusName != null : !this$statusName.equals(other$statusName)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$lastReplyContent = this.getLastReplyContent();
        String other$lastReplyContent = other.getLastReplyContent();
        if (this$lastReplyContent == null ? other$lastReplyContent != null : !this$lastReplyContent.equals(other$lastReplyContent)) {
            return false;
        }
        String this$lastReplyUserName = this.getLastReplyUserName();
        String other$lastReplyUserName = other.getLastReplyUserName();
        if (this$lastReplyUserName == null ? other$lastReplyUserName != null : !this$lastReplyUserName.equals(other$lastReplyUserName)) {
            return false;
        }
        Date this$lastReplyDatetime = this.getLastReplyDatetime();
        Date other$lastReplyDatetime = other.getLastReplyDatetime();
        if (this$lastReplyDatetime == null ? other$lastReplyDatetime != null : !((Object)this$lastReplyDatetime).equals(other$lastReplyDatetime)) {
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
        List<SupportTicketReplyResponse> this$replies = this.getReplies();
        List<SupportTicketReplyResponse> other$replies = other.getReplies();
        return !(this$replies == null ? other$replies != null : !((Object)this$replies).equals(other$replies));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicketResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $replyCount = this.getReplyCount();
        result = result * 59 + ($replyCount == null ? 43 : ((Object)$replyCount).hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        String $statusName = this.getStatusName();
        result = result * 59 + ($statusName == null ? 43 : $statusName.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $lastReplyContent = this.getLastReplyContent();
        result = result * 59 + ($lastReplyContent == null ? 43 : $lastReplyContent.hashCode());
        String $lastReplyUserName = this.getLastReplyUserName();
        result = result * 59 + ($lastReplyUserName == null ? 43 : $lastReplyUserName.hashCode());
        Date $lastReplyDatetime = this.getLastReplyDatetime();
        result = result * 59 + ($lastReplyDatetime == null ? 43 : ((Object)$lastReplyDatetime).hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        List<SupportTicketReplyResponse> $replies = this.getReplies();
        result = result * 59 + ($replies == null ? 43 : ((Object)$replies).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SupportTicketResponse(id=" + this.getId() + ", title=" + this.getTitle() + ", content=" + this.getContent() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", replyCount=" + this.getReplyCount() + ", lastReplyContent=" + this.getLastReplyContent() + ", lastReplyUserName=" + this.getLastReplyUserName() + ", lastReplyDatetime=" + String.valueOf(this.getLastReplyDatetime()) + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", replies=" + String.valueOf(this.getReplies()) + ")";
    }
}
