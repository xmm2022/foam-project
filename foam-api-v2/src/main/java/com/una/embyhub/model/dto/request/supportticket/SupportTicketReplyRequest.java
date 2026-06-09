/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.supportticket;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Generated;

public class SupportTicketReplyRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message="\u5de5\u5355ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u5de5\u5355ID\u4e0d\u80fd\u4e3a\u7a7a") Long ticketId;
    @NotBlank(message="\u56de\u590d\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u56de\u590d\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a") String replyContent;

    @Generated
    public SupportTicketReplyRequest() {
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
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
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
        if (!(o instanceof SupportTicketReplyRequest)) {
            return false;
        }
        SupportTicketReplyRequest other = (SupportTicketReplyRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$ticketId = this.getTicketId();
        Long other$ticketId = other.getTicketId();
        if (this$ticketId == null ? other$ticketId != null : !((Object)this$ticketId).equals(other$ticketId)) {
            return false;
        }
        String this$replyContent = this.getReplyContent();
        String other$replyContent = other.getReplyContent();
        return !(this$replyContent == null ? other$replyContent != null : !this$replyContent.equals(other$replyContent));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicketReplyRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $ticketId = this.getTicketId();
        result = result * 59 + ($ticketId == null ? 43 : ((Object)$ticketId).hashCode());
        String $replyContent = this.getReplyContent();
        result = result * 59 + ($replyContent == null ? 43 : $replyContent.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SupportTicketReplyRequest(ticketId=" + this.getTicketId() + ", replyContent=" + this.getReplyContent() + ")";
    }
}
