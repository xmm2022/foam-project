/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.tmdb;

import lombok.Generated;

public class MediaItemResponse {
    private String id;
    private double voteAverage;
    private double popularity;
    private String releaseDate;
    private double score;

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public double getVoteAverage() {
        return this.voteAverage;
    }

    @Generated
    public double getPopularity() {
        return this.popularity;
    }

    @Generated
    public String getReleaseDate() {
        return this.releaseDate;
    }

    @Generated
    public double getScore() {
        return this.score;
    }

    @Generated
    public void setId(String id) {
        this.id = id;
    }

    @Generated
    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Generated
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    @Generated
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Generated
    public void setScore(double score) {
        this.score = score;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MediaItemResponse)) {
            return false;
        }
        MediaItemResponse other = (MediaItemResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (Double.compare(this.getVoteAverage(), other.getVoteAverage()) != 0) {
            return false;
        }
        if (Double.compare(this.getPopularity(), other.getPopularity()) != 0) {
            return false;
        }
        if (Double.compare(this.getScore(), other.getScore()) != 0) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$releaseDate = this.getReleaseDate();
        String other$releaseDate = other.getReleaseDate();
        return !(this$releaseDate == null ? other$releaseDate != null : !this$releaseDate.equals(other$releaseDate));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MediaItemResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $voteAverage = Double.doubleToLongBits(this.getVoteAverage());
        result = result * 59 + (int)($voteAverage >>> 32 ^ $voteAverage);
        long $popularity = Double.doubleToLongBits(this.getPopularity());
        result = result * 59 + (int)($popularity >>> 32 ^ $popularity);
        long $score = Double.doubleToLongBits(this.getScore());
        result = result * 59 + (int)($score >>> 32 ^ $score);
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $releaseDate = this.getReleaseDate();
        result = result * 59 + ($releaseDate == null ? 43 : $releaseDate.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MediaItemResponse(id=" + this.getId() + ", voteAverage=" + this.getVoteAverage() + ", popularity=" + this.getPopularity() + ", releaseDate=" + this.getReleaseDate() + ", score=" + this.getScore() + ")";
    }

    @Generated
    public MediaItemResponse(String id, double voteAverage, double popularity, String releaseDate, double score) {
        this.id = id;
        this.voteAverage = voteAverage;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.score = score;
    }
}
