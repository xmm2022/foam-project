/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;
import lombok.Generated;

public class SearchRequest {
    @NotBlank
    private String kw;
    private List<String> channels;
    private List<String> plugins;
    @JsonProperty(value="cloud_types")
    private List<String> cloudTypes;
    private Integer conc;
    private Boolean refresh;
    private String res;
    private String src;
    private Map<String, Object> ext;

    @Generated
    public static SearchRequestBuilder builder() {
        return new SearchRequestBuilder();
    }

    @Generated
    public String getKw() {
        return this.kw;
    }

    @Generated
    public List<String> getChannels() {
        return this.channels;
    }

    @Generated
    public List<String> getPlugins() {
        return this.plugins;
    }

    @Generated
    public List<String> getCloudTypes() {
        return this.cloudTypes;
    }

    @Generated
    public Integer getConc() {
        return this.conc;
    }

    @Generated
    public Boolean getRefresh() {
        return this.refresh;
    }

    @Generated
    public String getRes() {
        return this.res;
    }

    @Generated
    public String getSrc() {
        return this.src;
    }

    @Generated
    public Map<String, Object> getExt() {
        return this.ext;
    }

    @Generated
    public void setKw(String kw) {
        this.kw = kw;
    }

    @Generated
    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    @Generated
    public void setPlugins(List<String> plugins) {
        this.plugins = plugins;
    }

    @JsonProperty(value="cloud_types")
    @Generated
    public void setCloudTypes(List<String> cloudTypes) {
        this.cloudTypes = cloudTypes;
    }

    @Generated
    public void setConc(Integer conc) {
        this.conc = conc;
    }

    @Generated
    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    @Generated
    public void setRes(String res) {
        this.res = res;
    }

    @Generated
    public void setSrc(String src) {
        this.src = src;
    }

    @Generated
    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SearchRequest)) {
            return false;
        }
        SearchRequest other = (SearchRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$conc = this.getConc();
        Integer other$conc = other.getConc();
        if (this$conc == null ? other$conc != null : !((Object)this$conc).equals(other$conc)) {
            return false;
        }
        Boolean this$refresh = this.getRefresh();
        Boolean other$refresh = other.getRefresh();
        if (this$refresh == null ? other$refresh != null : !((Object)this$refresh).equals(other$refresh)) {
            return false;
        }
        String this$kw = this.getKw();
        String other$kw = other.getKw();
        if (this$kw == null ? other$kw != null : !this$kw.equals(other$kw)) {
            return false;
        }
        List<String> this$channels = this.getChannels();
        List<String> other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !((Object)this$channels).equals(other$channels)) {
            return false;
        }
        List<String> this$plugins = this.getPlugins();
        List<String> other$plugins = other.getPlugins();
        if (this$plugins == null ? other$plugins != null : !((Object)this$plugins).equals(other$plugins)) {
            return false;
        }
        List<String> this$cloudTypes = this.getCloudTypes();
        List<String> other$cloudTypes = other.getCloudTypes();
        if (this$cloudTypes == null ? other$cloudTypes != null : !((Object)this$cloudTypes).equals(other$cloudTypes)) {
            return false;
        }
        String this$res = this.getRes();
        String other$res = other.getRes();
        if (this$res == null ? other$res != null : !this$res.equals(other$res)) {
            return false;
        }
        String this$src = this.getSrc();
        String other$src = other.getSrc();
        if (this$src == null ? other$src != null : !this$src.equals(other$src)) {
            return false;
        }
        Map<String, Object> this$ext = this.getExt();
        Map<String, Object> other$ext = other.getExt();
        return !(this$ext == null ? other$ext != null : !((Object)this$ext).equals(other$ext));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SearchRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $conc = this.getConc();
        result = result * 59 + ($conc == null ? 43 : ((Object)$conc).hashCode());
        Boolean $refresh = this.getRefresh();
        result = result * 59 + ($refresh == null ? 43 : ((Object)$refresh).hashCode());
        String $kw = this.getKw();
        result = result * 59 + ($kw == null ? 43 : $kw.hashCode());
        List<String> $channels = this.getChannels();
        result = result * 59 + ($channels == null ? 43 : ((Object)$channels).hashCode());
        List<String> $plugins = this.getPlugins();
        result = result * 59 + ($plugins == null ? 43 : ((Object)$plugins).hashCode());
        List<String> $cloudTypes = this.getCloudTypes();
        result = result * 59 + ($cloudTypes == null ? 43 : ((Object)$cloudTypes).hashCode());
        String $res = this.getRes();
        result = result * 59 + ($res == null ? 43 : $res.hashCode());
        String $src = this.getSrc();
        result = result * 59 + ($src == null ? 43 : $src.hashCode());
        Map<String, Object> $ext = this.getExt();
        result = result * 59 + ($ext == null ? 43 : ((Object)$ext).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SearchRequest(kw=" + this.getKw() + ", channels=" + String.valueOf(this.getChannels()) + ", plugins=" + String.valueOf(this.getPlugins()) + ", cloudTypes=" + String.valueOf(this.getCloudTypes()) + ", conc=" + this.getConc() + ", refresh=" + this.getRefresh() + ", res=" + this.getRes() + ", src=" + this.getSrc() + ", ext=" + String.valueOf(this.getExt()) + ")";
    }

    @Generated
    public SearchRequest() {
    }

    @Generated
    public SearchRequest(String kw, List<String> channels, List<String> plugins, List<String> cloudTypes, Integer conc, Boolean refresh, String res, String src, Map<String, Object> ext) {
        this.kw = kw;
        this.channels = channels;
        this.plugins = plugins;
        this.cloudTypes = cloudTypes;
        this.conc = conc;
        this.refresh = refresh;
        this.res = res;
        this.src = src;
        this.ext = ext;
    }

    @Generated
    public static class SearchRequestBuilder {
        @Generated
        private String kw;
        @Generated
        private List<String> channels;
        @Generated
        private List<String> plugins;
        @Generated
        private List<String> cloudTypes;
        @Generated
        private Integer conc;
        @Generated
        private Boolean refresh;
        @Generated
        private String res;
        @Generated
        private String src;
        @Generated
        private Map<String, Object> ext;

        @Generated
        SearchRequestBuilder() {
        }

        @Generated
        public SearchRequestBuilder kw(String kw) {
            this.kw = kw;
            return this;
        }

        @Generated
        public SearchRequestBuilder channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        @Generated
        public SearchRequestBuilder plugins(List<String> plugins) {
            this.plugins = plugins;
            return this;
        }

        @JsonProperty(value="cloud_types")
        @Generated
        public SearchRequestBuilder cloudTypes(List<String> cloudTypes) {
            this.cloudTypes = cloudTypes;
            return this;
        }

        @Generated
        public SearchRequestBuilder conc(Integer conc) {
            this.conc = conc;
            return this;
        }

        @Generated
        public SearchRequestBuilder refresh(Boolean refresh) {
            this.refresh = refresh;
            return this;
        }

        @Generated
        public SearchRequestBuilder res(String res) {
            this.res = res;
            return this;
        }

        @Generated
        public SearchRequestBuilder src(String src) {
            this.src = src;
            return this;
        }

        @Generated
        public SearchRequestBuilder ext(Map<String, Object> ext) {
            this.ext = ext;
            return this;
        }

        @Generated
        public SearchRequest build() {
            return new SearchRequest(this.kw, this.channels, this.plugins, this.cloudTypes, this.conc, this.refresh, this.res, this.src, this.ext);
        }

        @Generated
        public String toString() {
            return "SearchRequest.SearchRequestBuilder(kw=" + this.kw + ", channels=" + String.valueOf(this.channels) + ", plugins=" + String.valueOf(this.plugins) + ", cloudTypes=" + String.valueOf(this.cloudTypes) + ", conc=" + this.conc + ", refresh=" + this.refresh + ", res=" + this.res + ", src=" + this.src + ", ext=" + String.valueOf(this.ext) + ")";
        }
    }
}
