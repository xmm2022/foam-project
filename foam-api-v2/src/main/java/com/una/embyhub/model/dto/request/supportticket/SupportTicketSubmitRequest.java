/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.supportticket;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Generated;

public class SupportTicketSubmitRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotBlank(message="\u5de5\u5355\u6807\u9898\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u5de5\u5355\u6807\u9898\u4e0d\u80fd\u4e3a\u7a7a") String title;
    @NotBlank(message="\u5de5\u5355\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u5de5\u5355\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a") String content;

    @Generated
    public SupportTicketSubmitRequest() {
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
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated
    public void setContent(String content) {
        this.content = content;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportTicketSubmitRequest)) {
            return false;
        }
        SupportTicketSubmitRequest other = (SupportTicketSubmitRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$content = this.getContent();
        String other$content = other.getContent();
        return !(this$content == null ? other$content != null : !this$content.equals(other$content));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SupportTicketSubmitRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $content = this.getContent();
        result = result * 59 + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SupportTicketSubmitRequest(title=" + this.getTitle() + ", content=" + this.getContent() + ")";
    }
}
