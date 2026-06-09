/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.supportticket;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class SupportTicketReviewRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message="\u5de5\u5355ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u5de5\u5355ID\u4e0d\u80fd\u4e3a\u7a7a") Long ticketId;
    @NotNull(message="\u5ba1\u6279\u72b6\u6001\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u5ba1\u6279\u72b6\u6001\u4e0d\u80fd\u4e3a\u7a7a") Integer status;
    private String replyContent;

    @Generated
    public SupportTicketReviewRequest() {
    }

    @Generated
    public Long getTicketId() {
        return this.ticketId;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getReplyContent() {
        return this.replyContent;
    }

    @Generated
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportTicketReviewRequest)) {
            return false;
        }
        SupportTicketReviewRequest other = (SupportTicketReviewRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$ticketId = this.getTicketId();
        Long other$ticketId = other.getTicketId();
        if (this$ticketId == null ? other$ticketId != null : !((Object)this$ticketId).equals(other$ticketId)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        String this$replyContent = this.getReplyContent();
        String other$replyContent = other.getReplyContent();
        return !(this$replyContent == null ? other$replyContent != null : !this$replyContent.equals(other$replyContent));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicketReviewRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $ticketId = this.getTicketId();
        result = result * 59 + ($ticketId == null ? 43 : ((Object)$ticketId).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        String $replyContent = this.getReplyContent();
        result = result * 59 + ($replyContent == null ? 43 : $replyContent.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SupportTicketReviewRequest(ticketId=" + this.getTicketId() + ", status=" + this.getStatus() + ", replyContent=" + this.getReplyContent() + ")";
    }
}
