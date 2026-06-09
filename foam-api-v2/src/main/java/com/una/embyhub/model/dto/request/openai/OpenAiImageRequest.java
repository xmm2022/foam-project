/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.openai;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class OpenAiImageRequest {
    @NotBlank(message="prompt \u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="prompt \u4e0d\u80fd\u4e3a\u7a7a") String prompt;
    private Integer n = 1;
    private String size = "1024x1024";
    @JsonProperty(value="response_format")
    private String responseFormat = "b64_json";

    @Generated
    public OpenAiImageRequest() {
    }

    @Generated
    public String getPrompt() {
        return this.prompt;
    }

    @Generated
    public Integer getN() {
        return this.n;
    }

    @Generated
    public String getSize() {
        return this.size;
    }

    @Generated
    public String getResponseFormat() {
        return this.responseFormat;
    }

    @Generated
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Generated
    public void setN(Integer n) {
        this.n = n;
    }

    @Generated
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty(value="response_format")
    @Generated
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenAiImageRequest)) {
            return false;
        }
        OpenAiImageRequest other = (OpenAiImageRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$n = this.getN();
        Integer other$n = other.getN();
        if (this$n == null ? other$n != null : !((Object)this$n).equals(other$n)) {
            return false;
        }
        String this$prompt = this.getPrompt();
        String other$prompt = other.getPrompt();
        if (this$prompt == null ? other$prompt != null : !this$prompt.equals(other$prompt)) {
            return false;
        }
        String this$size = this.getSize();
        String other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) {
            return false;
        }
        String this$responseFormat = this.getResponseFormat();
        String other$responseFormat = other.getResponseFormat();
        return !(this$responseFormat == null ? other$responseFormat != null : !this$responseFormat.equals(other$responseFormat));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof OpenAiImageRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $n = this.getN();
        result = result * 59 + ($n == null ? 43 : ((Object)$n).hashCode());
        String $prompt = this.getPrompt();
        result = result * 59 + ($prompt == null ? 43 : $prompt.hashCode());
        String $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : $size.hashCode());
        String $responseFormat = this.getResponseFormat();
        result = result * 59 + ($responseFormat == null ? 43 : $responseFormat.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "OpenAiImageRequest(prompt=" + this.getPrompt() + ", n=" + this.getN() + ", size=" + this.getSize() + ", responseFormat=" + this.getResponseFormat() + ")";
    }
}
