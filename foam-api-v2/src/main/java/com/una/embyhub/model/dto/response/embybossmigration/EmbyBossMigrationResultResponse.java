/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embybossmigration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;

public class EmbyBossMigrationResultResponse
implements Serializable {
    private Boolean dryRun;
    private String productName;
    private String productVersion;
    private String catalog;
    private Long embyInfoId;
    private Long chatId;
    private Long sourceEmbyRows = 0L;
    private Long sourceEmby2Rows = 0L;
    private Long sourceMigratableUsers = 0L;
    private Long skippedNoAccountRows = 0L;
    private Long embyUserInserted = 0L;
    private Long embyUserUpdated = 0L;
    private Long pointsBotUserInserted = 0L;
    private Long pointsBotUserUpdated = 0L;
    private Long userPointsInserted = 0L;
    private Long userPointsUpdated = 0L;
    private Long oauthBindingInserted = 0L;
    private Long oauthBindingUpdated = 0L;
    private Long levelConfigInserted = 0L;
    private Long levelConfigUpdated = 0L;
    private Long pointLedgerInserted = 0L;
    private Long embyInfoConfigUpdated = 0L;
    private Long hostLineInserted = 0L;
    private Long hostLineUpdated = 0L;
    private Long pointsBotConfigUpdated = 0L;
    private Map<String, Long> levelCounts = new LinkedHashMap<String, Long>();
    private List<String> warnings = new ArrayList<String>();
    private String message;

    public void incrementLevel(String code) {
        String key = code == null || code.isBlank() ? "unknown" : code;
        this.levelCounts.put(key, this.levelCounts.getOrDefault(key, 0L) + 1L);
    }

    public void addWarning(String warning) {
        if (warning != null && !warning.isBlank()) {
            this.warnings.add(warning);
        }
    }

    @Generated
    public EmbyBossMigrationResultResponse() {
    }

    @Generated
    public Boolean getDryRun() {
        return this.dryRun;
    }

    @Generated
    public String getProductName() {
        return this.productName;
    }

    @Generated
    public String getProductVersion() {
        return this.productVersion;
    }

    @Generated
    public String getCatalog() {
        return this.catalog;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public Long getChatId() {
        return this.chatId;
    }

    @Generated
    public Long getSourceEmbyRows() {
        return this.sourceEmbyRows;
    }

    @Generated
    public Long getSourceEmby2Rows() {
        return this.sourceEmby2Rows;
    }

    @Generated
    public Long getSourceMigratableUsers() {
        return this.sourceMigratableUsers;
    }

    @Generated
    public Long getSkippedNoAccountRows() {
        return this.skippedNoAccountRows;
    }

    @Generated
    public Long getEmbyUserInserted() {
        return this.embyUserInserted;
    }

    @Generated
    public Long getEmbyUserUpdated() {
        return this.embyUserUpdated;
    }

    @Generated
    public Long getPointsBotUserInserted() {
        return this.pointsBotUserInserted;
    }

    @Generated
    public Long getPointsBotUserUpdated() {
        return this.pointsBotUserUpdated;
    }

    @Generated
    public Long getUserPointsInserted() {
        return this.userPointsInserted;
    }

    @Generated
    public Long getUserPointsUpdated() {
        return this.userPointsUpdated;
    }

    @Generated
    public Long getOauthBindingInserted() {
        return this.oauthBindingInserted;
    }

    @Generated
    public Long getOauthBindingUpdated() {
        return this.oauthBindingUpdated;
    }

    @Generated
    public Long getLevelConfigInserted() {
        return this.levelConfigInserted;
    }

    @Generated
    public Long getLevelConfigUpdated() {
        return this.levelConfigUpdated;
    }

    @Generated
    public Long getPointLedgerInserted() {
        return this.pointLedgerInserted;
    }

    @Generated
    public Long getEmbyInfoConfigUpdated() {
        return this.embyInfoConfigUpdated;
    }

    @Generated
    public Long getHostLineInserted() {
        return this.hostLineInserted;
    }

    @Generated
    public Long getHostLineUpdated() {
        return this.hostLineUpdated;
    }

    @Generated
    public Long getPointsBotConfigUpdated() {
        return this.pointsBotConfigUpdated;
    }

    @Generated
    public Map<String, Long> getLevelCounts() {
        return this.levelCounts;
    }

    @Generated
    public List<String> getWarnings() {
        return this.warnings;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Generated
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    @Generated
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    @Generated
    public void setSourceEmbyRows(Long sourceEmbyRows) {
        this.sourceEmbyRows = sourceEmbyRows;
    }

    @Generated
    public void setSourceEmby2Rows(Long sourceEmby2Rows) {
        this.sourceEmby2Rows = sourceEmby2Rows;
    }

    @Generated
    public void setSourceMigratableUsers(Long sourceMigratableUsers) {
        this.sourceMigratableUsers = sourceMigratableUsers;
    }

    @Generated
    public void setSkippedNoAccountRows(Long skippedNoAccountRows) {
        this.skippedNoAccountRows = skippedNoAccountRows;
    }

    @Generated
    public void setEmbyUserInserted(Long embyUserInserted) {
        this.embyUserInserted = embyUserInserted;
    }

    @Generated
    public void setEmbyUserUpdated(Long embyUserUpdated) {
        this.embyUserUpdated = embyUserUpdated;
    }

    @Generated
    public void setPointsBotUserInserted(Long pointsBotUserInserted) {
        this.pointsBotUserInserted = pointsBotUserInserted;
    }

    @Generated
    public void setPointsBotUserUpdated(Long pointsBotUserUpdated) {
        this.pointsBotUserUpdated = pointsBotUserUpdated;
    }

    @Generated
    public void setUserPointsInserted(Long userPointsInserted) {
        this.userPointsInserted = userPointsInserted;
    }

    @Generated
    public void setUserPointsUpdated(Long userPointsUpdated) {
        this.userPointsUpdated = userPointsUpdated;
    }

    @Generated
    public void setOauthBindingInserted(Long oauthBindingInserted) {
        this.oauthBindingInserted = oauthBindingInserted;
    }

    @Generated
    public void setOauthBindingUpdated(Long oauthBindingUpdated) {
        this.oauthBindingUpdated = oauthBindingUpdated;
    }

    @Generated
    public void setLevelConfigInserted(Long levelConfigInserted) {
        this.levelConfigInserted = levelConfigInserted;
    }

    @Generated
    public void setLevelConfigUpdated(Long levelConfigUpdated) {
        this.levelConfigUpdated = levelConfigUpdated;
    }

    @Generated
    public void setPointLedgerInserted(Long pointLedgerInserted) {
        this.pointLedgerInserted = pointLedgerInserted;
    }

    @Generated
    public void setEmbyInfoConfigUpdated(Long embyInfoConfigUpdated) {
        this.embyInfoConfigUpdated = embyInfoConfigUpdated;
    }

    @Generated
    public void setHostLineInserted(Long hostLineInserted) {
        this.hostLineInserted = hostLineInserted;
    }

    @Generated
    public void setHostLineUpdated(Long hostLineUpdated) {
        this.hostLineUpdated = hostLineUpdated;
    }

    @Generated
    public void setPointsBotConfigUpdated(Long pointsBotConfigUpdated) {
        this.pointsBotConfigUpdated = pointsBotConfigUpdated;
    }

    @Generated
    public void setLevelCounts(Map<String, Long> levelCounts) {
        this.levelCounts = levelCounts;
    }

    @Generated
    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    @Generated
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyBossMigrationResultResponse)) {
            return false;
        }
        EmbyBossMigrationResultResponse other = (EmbyBossMigrationResultResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$dryRun = this.getDryRun();
        Boolean other$dryRun = other.getDryRun();
        if (this$dryRun == null ? other$dryRun != null : !((Object)this$dryRun).equals(other$dryRun)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        Long this$chatId = this.getChatId();
        Long other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !((Object)this$chatId).equals(other$chatId)) {
            return false;
        }
        Long this$sourceEmbyRows = this.getSourceEmbyRows();
        Long other$sourceEmbyRows = other.getSourceEmbyRows();
        if (this$sourceEmbyRows == null ? other$sourceEmbyRows != null : !((Object)this$sourceEmbyRows).equals(other$sourceEmbyRows)) {
            return false;
        }
        Long this$sourceEmby2Rows = this.getSourceEmby2Rows();
        Long other$sourceEmby2Rows = other.getSourceEmby2Rows();
        if (this$sourceEmby2Rows == null ? other$sourceEmby2Rows != null : !((Object)this$sourceEmby2Rows).equals(other$sourceEmby2Rows)) {
            return false;
        }
        Long this$sourceMigratableUsers = this.getSourceMigratableUsers();
        Long other$sourceMigratableUsers = other.getSourceMigratableUsers();
        if (this$sourceMigratableUsers == null ? other$sourceMigratableUsers != null : !((Object)this$sourceMigratableUsers).equals(other$sourceMigratableUsers)) {
            return false;
        }
        Long this$skippedNoAccountRows = this.getSkippedNoAccountRows();
        Long other$skippedNoAccountRows = other.getSkippedNoAccountRows();
        if (this$skippedNoAccountRows == null ? other$skippedNoAccountRows != null : !((Object)this$skippedNoAccountRows).equals(other$skippedNoAccountRows)) {
            return false;
        }
        Long this$embyUserInserted = this.getEmbyUserInserted();
        Long other$embyUserInserted = other.getEmbyUserInserted();
        if (this$embyUserInserted == null ? other$embyUserInserted != null : !((Object)this$embyUserInserted).equals(other$embyUserInserted)) {
            return false;
        }
        Long this$embyUserUpdated = this.getEmbyUserUpdated();
        Long other$embyUserUpdated = other.getEmbyUserUpdated();
        if (this$embyUserUpdated == null ? other$embyUserUpdated != null : !((Object)this$embyUserUpdated).equals(other$embyUserUpdated)) {
            return false;
        }
        Long this$pointsBotUserInserted = this.getPointsBotUserInserted();
        Long other$pointsBotUserInserted = other.getPointsBotUserInserted();
        if (this$pointsBotUserInserted == null ? other$pointsBotUserInserted != null : !((Object)this$pointsBotUserInserted).equals(other$pointsBotUserInserted)) {
            return false;
        }
        Long this$pointsBotUserUpdated = this.getPointsBotUserUpdated();
        Long other$pointsBotUserUpdated = other.getPointsBotUserUpdated();
        if (this$pointsBotUserUpdated == null ? other$pointsBotUserUpdated != null : !((Object)this$pointsBotUserUpdated).equals(other$pointsBotUserUpdated)) {
            return false;
        }
        Long this$userPointsInserted = this.getUserPointsInserted();
        Long other$userPointsInserted = other.getUserPointsInserted();
        if (this$userPointsInserted == null ? other$userPointsInserted != null : !((Object)this$userPointsInserted).equals(other$userPointsInserted)) {
            return false;
        }
        Long this$userPointsUpdated = this.getUserPointsUpdated();
        Long other$userPointsUpdated = other.getUserPointsUpdated();
        if (this$userPointsUpdated == null ? other$userPointsUpdated != null : !((Object)this$userPointsUpdated).equals(other$userPointsUpdated)) {
            return false;
        }
        Long this$oauthBindingInserted = this.getOauthBindingInserted();
        Long other$oauthBindingInserted = other.getOauthBindingInserted();
        if (this$oauthBindingInserted == null ? other$oauthBindingInserted != null : !((Object)this$oauthBindingInserted).equals(other$oauthBindingInserted)) {
            return false;
        }
        Long this$oauthBindingUpdated = this.getOauthBindingUpdated();
        Long other$oauthBindingUpdated = other.getOauthBindingUpdated();
        if (this$oauthBindingUpdated == null ? other$oauthBindingUpdated != null : !((Object)this$oauthBindingUpdated).equals(other$oauthBindingUpdated)) {
            return false;
        }
        Long this$levelConfigInserted = this.getLevelConfigInserted();
        Long other$levelConfigInserted = other.getLevelConfigInserted();
        if (this$levelConfigInserted == null ? other$levelConfigInserted != null : !((Object)this$levelConfigInserted).equals(other$levelConfigInserted)) {
            return false;
        }
        Long this$levelConfigUpdated = this.getLevelConfigUpdated();
        Long other$levelConfigUpdated = other.getLevelConfigUpdated();
        if (this$levelConfigUpdated == null ? other$levelConfigUpdated != null : !((Object)this$levelConfigUpdated).equals(other$levelConfigUpdated)) {
            return false;
        }
        Long this$pointLedgerInserted = this.getPointLedgerInserted();
        Long other$pointLedgerInserted = other.getPointLedgerInserted();
        if (this$pointLedgerInserted == null ? other$pointLedgerInserted != null : !((Object)this$pointLedgerInserted).equals(other$pointLedgerInserted)) {
            return false;
        }
        Long this$embyInfoConfigUpdated = this.getEmbyInfoConfigUpdated();
        Long other$embyInfoConfigUpdated = other.getEmbyInfoConfigUpdated();
        if (this$embyInfoConfigUpdated == null ? other$embyInfoConfigUpdated != null : !((Object)this$embyInfoConfigUpdated).equals(other$embyInfoConfigUpdated)) {
            return false;
        }
        Long this$hostLineInserted = this.getHostLineInserted();
        Long other$hostLineInserted = other.getHostLineInserted();
        if (this$hostLineInserted == null ? other$hostLineInserted != null : !((Object)this$hostLineInserted).equals(other$hostLineInserted)) {
            return false;
        }
        Long this$hostLineUpdated = this.getHostLineUpdated();
        Long other$hostLineUpdated = other.getHostLineUpdated();
        if (this$hostLineUpdated == null ? other$hostLineUpdated != null : !((Object)this$hostLineUpdated).equals(other$hostLineUpdated)) {
            return false;
        }
        Long this$pointsBotConfigUpdated = this.getPointsBotConfigUpdated();
        Long other$pointsBotConfigUpdated = other.getPointsBotConfigUpdated();
        if (this$pointsBotConfigUpdated == null ? other$pointsBotConfigUpdated != null : !((Object)this$pointsBotConfigUpdated).equals(other$pointsBotConfigUpdated)) {
            return false;
        }
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        String this$productVersion = this.getProductVersion();
        String other$productVersion = other.getProductVersion();
        if (this$productVersion == null ? other$productVersion != null : !this$productVersion.equals(other$productVersion)) {
            return false;
        }
        String this$catalog = this.getCatalog();
        String other$catalog = other.getCatalog();
        if (this$catalog == null ? other$catalog != null : !this$catalog.equals(other$catalog)) {
            return false;
        }
        Map<String, Long> this$levelCounts = this.getLevelCounts();
        Map<String, Long> other$levelCounts = other.getLevelCounts();
        if (this$levelCounts == null ? other$levelCounts != null : !((Object)this$levelCounts).equals(other$levelCounts)) {
            return false;
        }
        List<String> this$warnings = this.getWarnings();
        List<String> other$warnings = other.getWarnings();
        if (this$warnings == null ? other$warnings != null : !((Object)this$warnings).equals(other$warnings)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        return !(this$message == null ? other$message != null : !this$message.equals(other$message));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyBossMigrationResultResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $dryRun = this.getDryRun();
        result = result * 59 + ($dryRun == null ? 43 : ((Object)$dryRun).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Long $sourceEmbyRows = this.getSourceEmbyRows();
        result = result * 59 + ($sourceEmbyRows == null ? 43 : ((Object)$sourceEmbyRows).hashCode());
        Long $sourceEmby2Rows = this.getSourceEmby2Rows();
        result = result * 59 + ($sourceEmby2Rows == null ? 43 : ((Object)$sourceEmby2Rows).hashCode());
        Long $sourceMigratableUsers = this.getSourceMigratableUsers();
        result = result * 59 + ($sourceMigratableUsers == null ? 43 : ((Object)$sourceMigratableUsers).hashCode());
        Long $skippedNoAccountRows = this.getSkippedNoAccountRows();
        result = result * 59 + ($skippedNoAccountRows == null ? 43 : ((Object)$skippedNoAccountRows).hashCode());
        Long $embyUserInserted = this.getEmbyUserInserted();
        result = result * 59 + ($embyUserInserted == null ? 43 : ((Object)$embyUserInserted).hashCode());
        Long $embyUserUpdated = this.getEmbyUserUpdated();
        result = result * 59 + ($embyUserUpdated == null ? 43 : ((Object)$embyUserUpdated).hashCode());
        Long $pointsBotUserInserted = this.getPointsBotUserInserted();
        result = result * 59 + ($pointsBotUserInserted == null ? 43 : ((Object)$pointsBotUserInserted).hashCode());
        Long $pointsBotUserUpdated = this.getPointsBotUserUpdated();
        result = result * 59 + ($pointsBotUserUpdated == null ? 43 : ((Object)$pointsBotUserUpdated).hashCode());
        Long $userPointsInserted = this.getUserPointsInserted();
        result = result * 59 + ($userPointsInserted == null ? 43 : ((Object)$userPointsInserted).hashCode());
        Long $userPointsUpdated = this.getUserPointsUpdated();
        result = result * 59 + ($userPointsUpdated == null ? 43 : ((Object)$userPointsUpdated).hashCode());
        Long $oauthBindingInserted = this.getOauthBindingInserted();
        result = result * 59 + ($oauthBindingInserted == null ? 43 : ((Object)$oauthBindingInserted).hashCode());
        Long $oauthBindingUpdated = this.getOauthBindingUpdated();
        result = result * 59 + ($oauthBindingUpdated == null ? 43 : ((Object)$oauthBindingUpdated).hashCode());
        Long $levelConfigInserted = this.getLevelConfigInserted();
        result = result * 59 + ($levelConfigInserted == null ? 43 : ((Object)$levelConfigInserted).hashCode());
        Long $levelConfigUpdated = this.getLevelConfigUpdated();
        result = result * 59 + ($levelConfigUpdated == null ? 43 : ((Object)$levelConfigUpdated).hashCode());
        Long $pointLedgerInserted = this.getPointLedgerInserted();
        result = result * 59 + ($pointLedgerInserted == null ? 43 : ((Object)$pointLedgerInserted).hashCode());
        Long $embyInfoConfigUpdated = this.getEmbyInfoConfigUpdated();
        result = result * 59 + ($embyInfoConfigUpdated == null ? 43 : ((Object)$embyInfoConfigUpdated).hashCode());
        Long $hostLineInserted = this.getHostLineInserted();
        result = result * 59 + ($hostLineInserted == null ? 43 : ((Object)$hostLineInserted).hashCode());
        Long $hostLineUpdated = this.getHostLineUpdated();
        result = result * 59 + ($hostLineUpdated == null ? 43 : ((Object)$hostLineUpdated).hashCode());
        Long $pointsBotConfigUpdated = this.getPointsBotConfigUpdated();
        result = result * 59 + ($pointsBotConfigUpdated == null ? 43 : ((Object)$pointsBotConfigUpdated).hashCode());
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        String $productVersion = this.getProductVersion();
        result = result * 59 + ($productVersion == null ? 43 : $productVersion.hashCode());
        String $catalog = this.getCatalog();
        result = result * 59 + ($catalog == null ? 43 : $catalog.hashCode());
        Map<String, Long> $levelCounts = this.getLevelCounts();
        result = result * 59 + ($levelCounts == null ? 43 : ((Object)$levelCounts).hashCode());
        List<String> $warnings = this.getWarnings();
        result = result * 59 + ($warnings == null ? 43 : ((Object)$warnings).hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyBossMigrationResultResponse(dryRun=" + this.getDryRun() + ", productName=" + this.getProductName() + ", productVersion=" + this.getProductVersion() + ", catalog=" + this.getCatalog() + ", embyInfoId=" + this.getEmbyInfoId() + ", chatId=" + this.getChatId() + ", sourceEmbyRows=" + this.getSourceEmbyRows() + ", sourceEmby2Rows=" + this.getSourceEmby2Rows() + ", sourceMigratableUsers=" + this.getSourceMigratableUsers() + ", skippedNoAccountRows=" + this.getSkippedNoAccountRows() + ", embyUserInserted=" + this.getEmbyUserInserted() + ", embyUserUpdated=" + this.getEmbyUserUpdated() + ", pointsBotUserInserted=" + this.getPointsBotUserInserted() + ", pointsBotUserUpdated=" + this.getPointsBotUserUpdated() + ", userPointsInserted=" + this.getUserPointsInserted() + ", userPointsUpdated=" + this.getUserPointsUpdated() + ", oauthBindingInserted=" + this.getOauthBindingInserted() + ", oauthBindingUpdated=" + this.getOauthBindingUpdated() + ", levelConfigInserted=" + this.getLevelConfigInserted() + ", levelConfigUpdated=" + this.getLevelConfigUpdated() + ", pointLedgerInserted=" + this.getPointLedgerInserted() + ", embyInfoConfigUpdated=" + this.getEmbyInfoConfigUpdated() + ", hostLineInserted=" + this.getHostLineInserted() + ", hostLineUpdated=" + this.getHostLineUpdated() + ", pointsBotConfigUpdated=" + this.getPointsBotConfigUpdated() + ", levelCounts=" + String.valueOf(this.getLevelCounts()) + ", warnings=" + String.valueOf(this.getWarnings()) + ", message=" + this.getMessage() + ")";
    }
}
