/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.douban;

import com.una.embyhub.model.dto.response.douban.DoubanSimpleSubjectResponse;
import java.util.List;
import lombok.Generated;

public class DoubanSubjectResponse
extends DoubanSimpleSubjectResponse {
    private String intro;
    private List<String> directors;
    private List<String> actors;
    private List<String> regions;
    private List<String> languages;
    private List<String> durations;
    private String score;
    private Integer currentSeason;
    private Integer seasonsCount;
    private Integer episodesCount;
    private String episodesInfo;

    @Generated
    public DoubanSubjectResponse() {
    }

    @Generated
    public String getIntro() {
        return this.intro;
    }

    @Generated
    public List<String> getDirectors() {
        return this.directors;
    }

    @Generated
    public List<String> getActors() {
        return this.actors;
    }

    @Generated
    public List<String> getRegions() {
        return this.regions;
    }

    @Generated
    public List<String> getLanguages() {
        return this.languages;
    }

    @Generated
    public List<String> getDurations() {
        return this.durations;
    }

    @Generated
    public String getScore() {
        return this.score;
    }

    @Generated
    public Integer getCurrentSeason() {
        return this.currentSeason;
    }

    @Generated
    public Integer getSeasonsCount() {
        return this.seasonsCount;
    }

    @Generated
    public Integer getEpisodesCount() {
        return this.episodesCount;
    }

    @Generated
    public String getEpisodesInfo() {
        return this.episodesInfo;
    }

    @Generated
    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Generated
    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    @Generated
    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Generated
    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    @Generated
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Generated
    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    @Generated
    public void setScore(String score) {
        this.score = score;
    }

    @Generated
    public void setCurrentSeason(Integer currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Generated
    public void setSeasonsCount(Integer seasonsCount) {
        this.seasonsCount = seasonsCount;
    }

    @Generated
    public void setEpisodesCount(Integer episodesCount) {
        this.episodesCount = episodesCount;
    }

    @Generated
    public void setEpisodesInfo(String episodesInfo) {
        this.episodesInfo = episodesInfo;
    }

    @Override
    @Generated
    public String toString() {
        return "DoubanSubjectResponse(intro=" + this.getIntro() + ", directors=" + String.valueOf(this.getDirectors()) + ", actors=" + String.valueOf(this.getActors()) + ", regions=" + String.valueOf(this.getRegions()) + ", languages=" + String.valueOf(this.getLanguages()) + ", durations=" + String.valueOf(this.getDurations()) + ", score=" + this.getScore() + ", currentSeason=" + this.getCurrentSeason() + ", seasonsCount=" + this.getSeasonsCount() + ", episodesCount=" + this.getEpisodesCount() + ", episodesInfo=" + this.getEpisodesInfo() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DoubanSubjectResponse)) {
            return false;
        }
        DoubanSubjectResponse other = (DoubanSubjectResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Integer this$currentSeason = this.getCurrentSeason();
        Integer other$currentSeason = other.getCurrentSeason();
        if (this$currentSeason == null ? other$currentSeason != null : !((Object)this$currentSeason).equals(other$currentSeason)) {
            return false;
        }
        Integer this$seasonsCount = this.getSeasonsCount();
        Integer other$seasonsCount = other.getSeasonsCount();
        if (this$seasonsCount == null ? other$seasonsCount != null : !((Object)this$seasonsCount).equals(other$seasonsCount)) {
            return false;
        }
        Integer this$episodesCount = this.getEpisodesCount();
        Integer other$episodesCount = other.getEpisodesCount();
        if (this$episodesCount == null ? other$episodesCount != null : !((Object)this$episodesCount).equals(other$episodesCount)) {
            return false;
        }
        String this$intro = this.getIntro();
        String other$intro = other.getIntro();
        if (this$intro == null ? other$intro != null : !this$intro.equals(other$intro)) {
            return false;
        }
        List<String> this$directors = this.getDirectors();
        List<String> other$directors = other.getDirectors();
        if (this$directors == null ? other$directors != null : !((Object)this$directors).equals(other$directors)) {
            return false;
        }
        List<String> this$actors = this.getActors();
        List<String> other$actors = other.getActors();
        if (this$actors == null ? other$actors != null : !((Object)this$actors).equals(other$actors)) {
            return false;
        }
        List<String> this$regions = this.getRegions();
        List<String> other$regions = other.getRegions();
        if (this$regions == null ? other$regions != null : !((Object)this$regions).equals(other$regions)) {
            return false;
        }
        List<String> this$languages = this.getLanguages();
        List<String> other$languages = other.getLanguages();
        if (this$languages == null ? other$languages != null : !((Object)this$languages).equals(other$languages)) {
            return false;
        }
        List<String> this$durations = this.getDurations();
        List<String> other$durations = other.getDurations();
        if (this$durations == null ? other$durations != null : !((Object)this$durations).equals(other$durations)) {
            return false;
        }
        String this$score = this.getScore();
        String other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) {
            return false;
        }
        String this$episodesInfo = this.getEpisodesInfo();
        String other$episodesInfo = other.getEpisodesInfo();
        return !(this$episodesInfo == null ? other$episodesInfo != null : !this$episodesInfo.equals(other$episodesInfo));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DoubanSubjectResponse;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Integer $currentSeason = this.getCurrentSeason();
        result = result * 59 + ($currentSeason == null ? 43 : ((Object)$currentSeason).hashCode());
        Integer $seasonsCount = this.getSeasonsCount();
        result = result * 59 + ($seasonsCount == null ? 43 : ((Object)$seasonsCount).hashCode());
        Integer $episodesCount = this.getEpisodesCount();
        result = result * 59 + ($episodesCount == null ? 43 : ((Object)$episodesCount).hashCode());
        String $intro = this.getIntro();
        result = result * 59 + ($intro == null ? 43 : $intro.hashCode());
        List<String> $directors = this.getDirectors();
        result = result * 59 + ($directors == null ? 43 : ((Object)$directors).hashCode());
        List<String> $actors = this.getActors();
        result = result * 59 + ($actors == null ? 43 : ((Object)$actors).hashCode());
        List<String> $regions = this.getRegions();
        result = result * 59 + ($regions == null ? 43 : ((Object)$regions).hashCode());
        List<String> $languages = this.getLanguages();
        result = result * 59 + ($languages == null ? 43 : ((Object)$languages).hashCode());
        List<String> $durations = this.getDurations();
        result = result * 59 + ($durations == null ? 43 : ((Object)$durations).hashCode());
        String $score = this.getScore();
        result = result * 59 + ($score == null ? 43 : $score.hashCode());
        String $episodesInfo = this.getEpisodesInfo();
        result = result * 59 + ($episodesInfo == null ? 43 : $episodesInfo.hashCode());
        return result;
    }
}
