/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.notifytemplate;

import java.io.Serializable;
import lombok.Generated;

public class NotifyTemplateUpdate
implements Serializable {
    private Long id;
    private String templateCode;
    private String templateName;
    private String channelType;
    private String templateContent;
    private String variableComment;
    private Integer enabled;
    private String remark;

    @Generated
    public NotifyTemplateUpdate() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getTemplateCode() {
        return this.templateCode;
    }

    @Generated
    public String getTemplateName() {
        return this.templateName;
    }

    @Generated
    public String getChannelType() {
        return this.channelType;
    }

    @Generated
    public String getTemplateContent() {
        return this.templateContent;
    }

    @Generated
    public String getVariableComment() {
        return this.variableComment;
    }

    @Generated
    public Integer getEnabled() {
        return this.enabled;
    }

    @Generated
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    @Generated
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Generated
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @Generated
    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    @Generated
    public void setVariableComment(String variableComment) {
        this.variableComment = variableComment;
    }

    @Generated
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NotifyTemplateUpdate)) {
            return false;
        }
        NotifyTemplateUpdate other = (NotifyTemplateUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$enabled = this.getEnabled();
        Integer other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        String this$templateCode = this.getTemplateCode();
        String other$templateCode = other.getTemplateCode();
        if (this$templateCode == null ? other$templateCode != null : !this$templateCode.equals(other$templateCode)) {
            return false;
        }
        String this$templateName = this.getTemplateName();
        String other$templateName = other.getTemplateName();
        if (this$templateName == null ? other$templateName != null : !this$templateName.equals(other$templateName)) {
            return false;
        }
        String this$channelType = this.getChannelType();
        String other$channelType = other.getChannelType();
        if (this$channelType == null ? other$channelType != null : !this$channelType.equals(other$channelType)) {
            return false;
        }
        String this$templateContent = this.getTemplateContent();
        String other$templateContent = other.getTemplateContent();
        if (this$templateContent == null ? other$templateContent != null : !this$templateContent.equals(other$templateContent)) {
            return false;
        }
        String this$variableComment = this.getVariableComment();
        String other$variableComment = other.getVariableComment();
        if (this$variableComment == null ? other$variableComment != null : !this$variableComment.equals(other$variableComment)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof NotifyTemplateUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        String $templateCode = this.getTemplateCode();
        result = result * 59 + ($templateCode == null ? 43 : $templateCode.hashCode());
        String $templateName = this.getTemplateName();
        result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
        String $channelType = this.getChannelType();
        result = result * 59 + ($channelType == null ? 43 : $channelType.hashCode());
        String $templateContent = this.getTemplateContent();
        result = result * 59 + ($templateContent == null ? 43 : $templateContent.hashCode());
        String $variableComment = this.getVariableComment();
        result = result * 59 + ($variableComment == null ? 43 : $variableComment.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "NotifyTemplateUpdate(id=" + this.getId() + ", templateCode=" + this.getTemplateCode() + ", templateName=" + this.getTemplateName() + ", channelType=" + this.getChannelType() + ", templateContent=" + this.getTemplateContent() + ", variableComment=" + this.getVariableComment() + ", enabled=" + this.getEnabled() + ", remark=" + this.getRemark() + ")";
    }
}
