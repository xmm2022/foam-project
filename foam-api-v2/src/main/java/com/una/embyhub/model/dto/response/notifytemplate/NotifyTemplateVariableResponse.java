/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.notifytemplate;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class NotifyTemplateVariableResponse
implements Serializable {
    private String key;
    private String description;
    private List<String> templateCodes;
    private List<String> messageTypes;

    @Generated
    public NotifyTemplateVariableResponse() {
    }

    @Generated
    public String getKey() {
        return this.key;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public List<String> getTemplateCodes() {
        return this.templateCodes;
    }

    @Generated
    public List<String> getMessageTypes() {
        return this.messageTypes;
    }

    @Generated
    public void setKey(String key) {
        this.key = key;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setTemplateCodes(List<String> templateCodes) {
        this.templateCodes = templateCodes;
    }

    @Generated
    public void setMessageTypes(List<String> messageTypes) {
        this.messageTypes = messageTypes;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NotifyTemplateVariableResponse)) {
            return false;
        }
        NotifyTemplateVariableResponse other = (NotifyTemplateVariableResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$key = this.getKey();
        String other$key = other.getKey();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        List<String> this$templateCodes = this.getTemplateCodes();
        List<String> other$templateCodes = other.getTemplateCodes();
        if (this$templateCodes == null ? other$templateCodes != null : !((Object)this$templateCodes).equals(other$templateCodes)) {
            return false;
        }
        List<String> this$messageTypes = this.getMessageTypes();
        List<String> other$messageTypes = other.getMessageTypes();
        return !(this$messageTypes == null ? other$messageTypes != null : !((Object)this$messageTypes).equals(other$messageTypes));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof NotifyTemplateVariableResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $key = this.getKey();
        result = result * 59 + ($key == null ? 43 : $key.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        List<String> $templateCodes = this.getTemplateCodes();
        result = result * 59 + ($templateCodes == null ? 43 : ((Object)$templateCodes).hashCode());
        List<String> $messageTypes = this.getMessageTypes();
        result = result * 59 + ($messageTypes == null ? 43 : ((Object)$messageTypes).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "NotifyTemplateVariableResponse(key=" + this.getKey() + ", description=" + this.getDescription() + ", templateCodes=" + String.valueOf(this.getTemplateCodes()) + ", messageTypes=" + String.valueOf(this.getMessageTypes()) + ")";
    }
}
