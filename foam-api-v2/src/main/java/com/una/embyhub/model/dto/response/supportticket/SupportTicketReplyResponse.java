/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.supportticket;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class SupportTicketReplyResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long ticketId;
    private String replyContent;
    private Long userId;
    private String embyUserName;
    private Integer replyRole;
    private Date createDatetime;

    public String getReplyRoleName() {
        return this.replyRole != null && this.replyRole == 1 ? "\u7ba1\u7406\u5458" : "\u7528\u6237";
    }

    @Generated
    public SupportTicketReplyResponse() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getTicketId() {
        return this.ticketId;
    }

    @Generated
    public String getReplyContent() {
        return this.replyContent;
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
    public Integer getReplyRole() {
        return this.replyRole;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    @Generated
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
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
    public void setReplyRole(Integer replyRole) {
        this.replyRole = replyRole;
    }

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportTicketReplyResponse)) {
            return false;
        }
        SupportTicketReplyResponse other = (SupportTicketReplyResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$ticketId = this.getTicketId();
        Long other$ticketId = other.getTicketId();
        if (this$ticketId == null ? other$ticketId != null : !((Object)this$ticketId).equals(other$ticketId)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Integer this$replyRole = this.getReplyRole();
        Integer other$replyRole = other.getReplyRole();
        if (this$replyRole == null ? other$replyRole != null : !((Object)this$replyRole).equals(other$replyRole)) {
            return false;
        }
        String this$replyContent = this.getReplyContent();
        String other$replyContent = other.getReplyContent();
        if (this$replyContent == null ? other$replyContent != null : !this$replyContent.equals(other$replyContent)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        return !(this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicketReplyResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $ticketId = this.getTicketId();
        result = result * 59 + ($ticketId == null ? 43 : ((Object)$ticketId).hashCode());
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Integer $replyRole = this.getReplyRole();
        result = result * 59 + ($replyRole == null ? 43 : ((Object)$replyRole).hashCode());
        String $replyContent = this.getReplyContent();
        result = result * 59 + ($replyContent == null ? 43 : $replyContent.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SupportTicketReplyResponse(id=" + this.getId() + ", ticketId=" + this.getTicketId() + ", replyContent=" + this.getReplyContent() + ", userId=" + this.getUserId() + ", embyUserName=" + this.getEmbyUserName() + ", replyRole=" + this.getReplyRole() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ")";
    }
}
