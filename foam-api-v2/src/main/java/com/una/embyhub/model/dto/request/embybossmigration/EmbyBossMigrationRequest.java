/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotNull
 *  jakarta.validation.constraints.Size
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embybossmigration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Generated;

public class EmbyBossMigrationRequest
implements Serializable {
    private String hostPort;
    private String databaseName;
    private String jdbcUrl;
    @NotBlank(message="\u6e90\u5e93\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u6e90\u5e93\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a") String username;
    private String password;
    @Size(max=65535, message="config.json \u5185\u5bb9\u8fc7\u957f")
    private @Size(max=65535, message="config.json \u5185\u5bb9\u8fc7\u957f") String configJson;
    @NotNull(message="Emby\u670d\u52a1\u5668ID\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="Emby\u670d\u52a1\u5668ID\u4e0d\u80fd\u4e3a\u7a7a") Long embyInfoId;
    private Long chatId;
    private Boolean dryRun = true;
    private Boolean overwriteExisting = true;
    private Boolean syncEmbyUsers = true;
    private Boolean syncPointsBotUsers = true;
    private Boolean syncUserPoints = true;
    private Boolean syncOauthBindings = true;
    private Boolean syncLevelConfigs = true;
    private Boolean syncEmbyServerConfig = true;
    private Boolean syncHostLines = true;
    private Boolean syncTelegramConfig = true;
    private Boolean syncPointLedger = true;
    private String levelNameA;
    private String levelNameB;
    private String levelNameC;
    private String levelNameD;
    private String confirmation;

    @Generated
    public EmbyBossMigrationRequest() {
    }

    @Generated
    public String getHostPort() {
        return this.hostPort;
    }

    @Generated
    public String getDatabaseName() {
        return this.databaseName;
    }

    @Generated
    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public String getConfigJson() {
        return this.configJson;
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
    public Boolean getDryRun() {
        return this.dryRun;
    }

    @Generated
    public Boolean getOverwriteExisting() {
        return this.overwriteExisting;
    }

    @Generated
    public Boolean getSyncEmbyUsers() {
        return this.syncEmbyUsers;
    }

    @Generated
    public Boolean getSyncPointsBotUsers() {
        return this.syncPointsBotUsers;
    }

    @Generated
    public Boolean getSyncUserPoints() {
        return this.syncUserPoints;
    }

    @Generated
    public Boolean getSyncOauthBindings() {
        return this.syncOauthBindings;
    }

    @Generated
    public Boolean getSyncLevelConfigs() {
        return this.syncLevelConfigs;
    }

    @Generated
    public Boolean getSyncEmbyServerConfig() {
        return this.syncEmbyServerConfig;
    }

    @Generated
    public Boolean getSyncHostLines() {
        return this.syncHostLines;
    }

    @Generated
    public Boolean getSyncTelegramConfig() {
        return this.syncTelegramConfig;
    }

    @Generated
    public Boolean getSyncPointLedger() {
        return this.syncPointLedger;
    }

    @Generated
    public String getLevelNameA() {
        return this.levelNameA;
    }

    @Generated
    public String getLevelNameB() {
        return this.levelNameB;
    }

    @Generated
    public String getLevelNameC() {
        return this.levelNameC;
    }

    @Generated
    public String getLevelNameD() {
        return this.levelNameD;
    }

    @Generated
    public String getConfirmation() {
        return this.confirmation;
    }

    @Generated
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    @Generated
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Generated
    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated
    public void setConfigJson(String configJson) {
        this.configJson = configJson;
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
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Generated
    public void setOverwriteExisting(Boolean overwriteExisting) {
        this.overwriteExisting = overwriteExisting;
    }

    @Generated
    public void setSyncEmbyUsers(Boolean syncEmbyUsers) {
        this.syncEmbyUsers = syncEmbyUsers;
    }

    @Generated
    public void setSyncPointsBotUsers(Boolean syncPointsBotUsers) {
        this.syncPointsBotUsers = syncPointsBotUsers;
    }

    @Generated
    public void setSyncUserPoints(Boolean syncUserPoints) {
        this.syncUserPoints = syncUserPoints;
    }

    @Generated
    public void setSyncOauthBindings(Boolean syncOauthBindings) {
        this.syncOauthBindings = syncOauthBindings;
    }

    @Generated
    public void setSyncLevelConfigs(Boolean syncLevelConfigs) {
        this.syncLevelConfigs = syncLevelConfigs;
    }

    @Generated
    public void setSyncEmbyServerConfig(Boolean syncEmbyServerConfig) {
        this.syncEmbyServerConfig = syncEmbyServerConfig;
    }

    @Generated
    public void setSyncHostLines(Boolean syncHostLines) {
        this.syncHostLines = syncHostLines;
    }

    @Generated
    public void setSyncTelegramConfig(Boolean syncTelegramConfig) {
        this.syncTelegramConfig = syncTelegramConfig;
    }

    @Generated
    public void setSyncPointLedger(Boolean syncPointLedger) {
        this.syncPointLedger = syncPointLedger;
    }

    @Generated
    public void setLevelNameA(String levelNameA) {
        this.levelNameA = levelNameA;
    }

    @Generated
    public void setLevelNameB(String levelNameB) {
        this.levelNameB = levelNameB;
    }

    @Generated
    public void setLevelNameC(String levelNameC) {
        this.levelNameC = levelNameC;
    }

    @Generated
    public void setLevelNameD(String levelNameD) {
        this.levelNameD = levelNameD;
    }

    @Generated
    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyBossMigrationRequest)) {
            return false;
        }
        EmbyBossMigrationRequest other = (EmbyBossMigrationRequest)o;
        if (!other.canEqual(this)) {
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
        Boolean this$dryRun = this.getDryRun();
        Boolean other$dryRun = other.getDryRun();
        if (this$dryRun == null ? other$dryRun != null : !((Object)this$dryRun).equals(other$dryRun)) {
            return false;
        }
        Boolean this$overwriteExisting = this.getOverwriteExisting();
        Boolean other$overwriteExisting = other.getOverwriteExisting();
        if (this$overwriteExisting == null ? other$overwriteExisting != null : !((Object)this$overwriteExisting).equals(other$overwriteExisting)) {
            return false;
        }
        Boolean this$syncEmbyUsers = this.getSyncEmbyUsers();
        Boolean other$syncEmbyUsers = other.getSyncEmbyUsers();
        if (this$syncEmbyUsers == null ? other$syncEmbyUsers != null : !((Object)this$syncEmbyUsers).equals(other$syncEmbyUsers)) {
            return false;
        }
        Boolean this$syncPointsBotUsers = this.getSyncPointsBotUsers();
        Boolean other$syncPointsBotUsers = other.getSyncPointsBotUsers();
        if (this$syncPointsBotUsers == null ? other$syncPointsBotUsers != null : !((Object)this$syncPointsBotUsers).equals(other$syncPointsBotUsers)) {
            return false;
        }
        Boolean this$syncUserPoints = this.getSyncUserPoints();
        Boolean other$syncUserPoints = other.getSyncUserPoints();
        if (this$syncUserPoints == null ? other$syncUserPoints != null : !((Object)this$syncUserPoints).equals(other$syncUserPoints)) {
            return false;
        }
        Boolean this$syncOauthBindings = this.getSyncOauthBindings();
        Boolean other$syncOauthBindings = other.getSyncOauthBindings();
        if (this$syncOauthBindings == null ? other$syncOauthBindings != null : !((Object)this$syncOauthBindings).equals(other$syncOauthBindings)) {
            return false;
        }
        Boolean this$syncLevelConfigs = this.getSyncLevelConfigs();
        Boolean other$syncLevelConfigs = other.getSyncLevelConfigs();
        if (this$syncLevelConfigs == null ? other$syncLevelConfigs != null : !((Object)this$syncLevelConfigs).equals(other$syncLevelConfigs)) {
            return false;
        }
        Boolean this$syncEmbyServerConfig = this.getSyncEmbyServerConfig();
        Boolean other$syncEmbyServerConfig = other.getSyncEmbyServerConfig();
        if (this$syncEmbyServerConfig == null ? other$syncEmbyServerConfig != null : !((Object)this$syncEmbyServerConfig).equals(other$syncEmbyServerConfig)) {
            return false;
        }
        Boolean this$syncHostLines = this.getSyncHostLines();
        Boolean other$syncHostLines = other.getSyncHostLines();
        if (this$syncHostLines == null ? other$syncHostLines != null : !((Object)this$syncHostLines).equals(other$syncHostLines)) {
            return false;
        }
        Boolean this$syncTelegramConfig = this.getSyncTelegramConfig();
        Boolean other$syncTelegramConfig = other.getSyncTelegramConfig();
        if (this$syncTelegramConfig == null ? other$syncTelegramConfig != null : !((Object)this$syncTelegramConfig).equals(other$syncTelegramConfig)) {
            return false;
        }
        Boolean this$syncPointLedger = this.getSyncPointLedger();
        Boolean other$syncPointLedger = other.getSyncPointLedger();
        if (this$syncPointLedger == null ? other$syncPointLedger != null : !((Object)this$syncPointLedger).equals(other$syncPointLedger)) {
            return false;
        }
        String this$hostPort = this.getHostPort();
        String other$hostPort = other.getHostPort();
        if (this$hostPort == null ? other$hostPort != null : !this$hostPort.equals(other$hostPort)) {
            return false;
        }
        String this$databaseName = this.getDatabaseName();
        String other$databaseName = other.getDatabaseName();
        if (this$databaseName == null ? other$databaseName != null : !this$databaseName.equals(other$databaseName)) {
            return false;
        }
        String this$jdbcUrl = this.getJdbcUrl();
        String other$jdbcUrl = other.getJdbcUrl();
        if (this$jdbcUrl == null ? other$jdbcUrl != null : !this$jdbcUrl.equals(other$jdbcUrl)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$password = this.getPassword();
        String other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) {
            return false;
        }
        String this$configJson = this.getConfigJson();
        String other$configJson = other.getConfigJson();
        if (this$configJson == null ? other$configJson != null : !this$configJson.equals(other$configJson)) {
            return false;
        }
        String this$levelNameA = this.getLevelNameA();
        String other$levelNameA = other.getLevelNameA();
        if (this$levelNameA == null ? other$levelNameA != null : !this$levelNameA.equals(other$levelNameA)) {
            return false;
        }
        String this$levelNameB = this.getLevelNameB();
        String other$levelNameB = other.getLevelNameB();
        if (this$levelNameB == null ? other$levelNameB != null : !this$levelNameB.equals(other$levelNameB)) {
            return false;
        }
        String this$levelNameC = this.getLevelNameC();
        String other$levelNameC = other.getLevelNameC();
        if (this$levelNameC == null ? other$levelNameC != null : !this$levelNameC.equals(other$levelNameC)) {
            return false;
        }
        String this$levelNameD = this.getLevelNameD();
        String other$levelNameD = other.getLevelNameD();
        if (this$levelNameD == null ? other$levelNameD != null : !this$levelNameD.equals(other$levelNameD)) {
            return false;
        }
        String this$confirmation = this.getConfirmation();
        String other$confirmation = other.getConfirmation();
        return !(this$confirmation == null ? other$confirmation != null : !this$confirmation.equals(other$confirmation));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyBossMigrationRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        Long $chatId = this.getChatId();
        result = result * 59 + ($chatId == null ? 43 : ((Object)$chatId).hashCode());
        Boolean $dryRun = this.getDryRun();
        result = result * 59 + ($dryRun == null ? 43 : ((Object)$dryRun).hashCode());
        Boolean $overwriteExisting = this.getOverwriteExisting();
        result = result * 59 + ($overwriteExisting == null ? 43 : ((Object)$overwriteExisting).hashCode());
        Boolean $syncEmbyUsers = this.getSyncEmbyUsers();
        result = result * 59 + ($syncEmbyUsers == null ? 43 : ((Object)$syncEmbyUsers).hashCode());
        Boolean $syncPointsBotUsers = this.getSyncPointsBotUsers();
        result = result * 59 + ($syncPointsBotUsers == null ? 43 : ((Object)$syncPointsBotUsers).hashCode());
        Boolean $syncUserPoints = this.getSyncUserPoints();
        result = result * 59 + ($syncUserPoints == null ? 43 : ((Object)$syncUserPoints).hashCode());
        Boolean $syncOauthBindings = this.getSyncOauthBindings();
        result = result * 59 + ($syncOauthBindings == null ? 43 : ((Object)$syncOauthBindings).hashCode());
        Boolean $syncLevelConfigs = this.getSyncLevelConfigs();
        result = result * 59 + ($syncLevelConfigs == null ? 43 : ((Object)$syncLevelConfigs).hashCode());
        Boolean $syncEmbyServerConfig = this.getSyncEmbyServerConfig();
        result = result * 59 + ($syncEmbyServerConfig == null ? 43 : ((Object)$syncEmbyServerConfig).hashCode());
        Boolean $syncHostLines = this.getSyncHostLines();
        result = result * 59 + ($syncHostLines == null ? 43 : ((Object)$syncHostLines).hashCode());
        Boolean $syncTelegramConfig = this.getSyncTelegramConfig();
        result = result * 59 + ($syncTelegramConfig == null ? 43 : ((Object)$syncTelegramConfig).hashCode());
        Boolean $syncPointLedger = this.getSyncPointLedger();
        result = result * 59 + ($syncPointLedger == null ? 43 : ((Object)$syncPointLedger).hashCode());
        String $hostPort = this.getHostPort();
        result = result * 59 + ($hostPort == null ? 43 : $hostPort.hashCode());
        String $databaseName = this.getDatabaseName();
        result = result * 59 + ($databaseName == null ? 43 : $databaseName.hashCode());
        String $jdbcUrl = this.getJdbcUrl();
        result = result * 59 + ($jdbcUrl == null ? 43 : $jdbcUrl.hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        String $configJson = this.getConfigJson();
        result = result * 59 + ($configJson == null ? 43 : $configJson.hashCode());
        String $levelNameA = this.getLevelNameA();
        result = result * 59 + ($levelNameA == null ? 43 : $levelNameA.hashCode());
        String $levelNameB = this.getLevelNameB();
        result = result * 59 + ($levelNameB == null ? 43 : $levelNameB.hashCode());
        String $levelNameC = this.getLevelNameC();
        result = result * 59 + ($levelNameC == null ? 43 : $levelNameC.hashCode());
        String $levelNameD = this.getLevelNameD();
        result = result * 59 + ($levelNameD == null ? 43 : $levelNameD.hashCode());
        String $confirmation = this.getConfirmation();
        result = result * 59 + ($confirmation == null ? 43 : $confirmation.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyBossMigrationRequest(hostPort=" + this.getHostPort() + ", databaseName=" + this.getDatabaseName() + ", jdbcUrl=" + this.getJdbcUrl() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", configJson=" + this.getConfigJson() + ", embyInfoId=" + this.getEmbyInfoId() + ", chatId=" + this.getChatId() + ", dryRun=" + this.getDryRun() + ", overwriteExisting=" + this.getOverwriteExisting() + ", syncEmbyUsers=" + this.getSyncEmbyUsers() + ", syncPointsBotUsers=" + this.getSyncPointsBotUsers() + ", syncUserPoints=" + this.getSyncUserPoints() + ", syncOauthBindings=" + this.getSyncOauthBindings() + ", syncLevelConfigs=" + this.getSyncLevelConfigs() + ", syncEmbyServerConfig=" + this.getSyncEmbyServerConfig() + ", syncHostLines=" + this.getSyncHostLines() + ", syncTelegramConfig=" + this.getSyncTelegramConfig() + ", syncPointLedger=" + this.getSyncPointLedger() + ", levelNameA=" + this.getLevelNameA() + ", levelNameB=" + this.getLevelNameB() + ", levelNameC=" + this.getLevelNameC() + ", levelNameD=" + this.getLevelNameD() + ", confirmation=" + this.getConfirmation() + ")";
    }
}
