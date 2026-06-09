/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.douban;

import com.alibaba.fastjson2.JSONObject;
import lombok.Generated;

public class DoubanTmdbDetailResponse {
    private String doubanId;
    private String imdbId;
    private Integer tmdbId;
    private String tmdbType;
    private JSONObject movieDetail;
    private JSONObject tvDetail;

    @Generated
    public DoubanTmdbDetailResponse() {
    }

    @Generated
    public String getDoubanId() {
        return this.doubanId;
    }

    @Generated
    public String getImdbId() {
        return this.imdbId;
    }

    @Generated
    public Integer getTmdbId() {
        return this.tmdbId;
    }

    @Generated
    public String getTmdbType() {
        return this.tmdbType;
    }

    @Generated
    public JSONObject getMovieDetail() {
        return this.movieDetail;
    }

    @Generated
    public JSONObject getTvDetail() {
        return this.tvDetail;
    }

    @Generated
    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    @Generated
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    @Generated
    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Generated
    public void setTmdbType(String tmdbType) {
        this.tmdbType = tmdbType;
    }

    @Generated
    public void setMovieDetail(JSONObject movieDetail) {
        this.movieDetail = movieDetail;
    }

    @Generated
    public void setTvDetail(JSONObject tvDetail) {
        this.tvDetail = tvDetail;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DoubanTmdbDetailResponse)) {
            return false;
        }
        DoubanTmdbDetailResponse other = (DoubanTmdbDetailResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tmdbId = this.getTmdbId();
        Integer other$tmdbId = other.getTmdbId();
        if (this$tmdbId == null ? other$tmdbId != null : !((Object)this$tmdbId).equals(other$tmdbId)) {
            return false;
        }
        String this$doubanId = this.getDoubanId();
        String other$doubanId = other.getDoubanId();
        if (this$doubanId == null ? other$doubanId != null : !this$doubanId.equals(other$doubanId)) {
            return false;
        }
        String this$imdbId = this.getImdbId();
        String other$imdbId = other.getImdbId();
        if (this$imdbId == null ? other$imdbId != null : !this$imdbId.equals(other$imdbId)) {
            return false;
        }
        String this$tmdbType = this.getTmdbType();
        String other$tmdbType = other.getTmdbType();
        if (this$tmdbType == null ? other$tmdbType != null : !this$tmdbType.equals(other$tmdbType)) {
            return false;
        }
        JSONObject this$movieDetail = this.getMovieDetail();
        JSONObject other$movieDetail = other.getMovieDetail();
        if (this$movieDetail == null ? other$movieDetail != null : !this$movieDetail.equals(other$movieDetail)) {
            return false;
        }
        JSONObject this$tvDetail = this.getTvDetail();
        JSONObject other$tvDetail = other.getTvDetail();
        return !(this$tvDetail == null ? other$tvDetail != null : !this$tvDetail.equals(other$tvDetail));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DoubanTmdbDetailResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tmdbId = this.getTmdbId();
        result = result * 59 + ($tmdbId == null ? 43 : ((Object)$tmdbId).hashCode());
        String $doubanId = this.getDoubanId();
        result = result * 59 + ($doubanId == null ? 43 : $doubanId.hashCode());
        String $imdbId = this.getImdbId();
        result = result * 59 + ($imdbId == null ? 43 : $imdbId.hashCode());
        String $tmdbType = this.getTmdbType();
        result = result * 59 + ($tmdbType == null ? 43 : $tmdbType.hashCode());
        JSONObject $movieDetail = this.getMovieDetail();
        result = result * 59 + ($movieDetail == null ? 43 : $movieDetail.hashCode());
        JSONObject $tvDetail = this.getTvDetail();
        result = result * 59 + ($tvDetail == null ? 43 : $tvDetail.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DoubanTmdbDetailResponse(doubanId=" + this.getDoubanId() + ", imdbId=" + this.getImdbId() + ", tmdbId=" + this.getTmdbId() + ", tmdbType=" + this.getTmdbType() + ", movieDetail=" + String.valueOf(this.getMovieDetail()) + ", tvDetail=" + String.valueOf(this.getTvDetail()) + ")";
    }
}
