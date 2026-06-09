/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.foammigration;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Generated;

public class FoamDataMigrationRequest
implements Serializable {
    private String hostPort;
    private String databaseName;
    private String jdbcUrl;
    @NotBlank(message="\u65e7\u5e93\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u65e7\u5e93\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a") String username;
    private String password;
    private Integer batchSize;
    private Boolean fullData;

    @Generated
    public FoamDataMigrationRequest() {
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
    public Integer getBatchSize() {
        return this.batchSize;
    }

    @Generated
    public Boolean getFullData() {
        return this.fullData;
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
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    @Generated
    public void setFullData(Boolean fullData) {
        this.fullData = fullData;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationRequest)) {
            return false;
        }
        FoamDataMigrationRequest other = (FoamDataMigrationRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$batchSize = this.getBatchSize();
        Integer other$batchSize = other.getBatchSize();
        if (this$batchSize == null ? other$batchSize != null : !((Object)this$batchSize).equals(other$batchSize)) {
            return false;
        }
        Boolean this$fullData = this.getFullData();
        Boolean other$fullData = other.getFullData();
        if (this$fullData == null ? other$fullData != null : !((Object)this$fullData).equals(other$fullData)) {
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
        return !(this$password == null ? other$password != null : !this$password.equals(other$password));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $batchSize = this.getBatchSize();
        result = result * 59 + ($batchSize == null ? 43 : ((Object)$batchSize).hashCode());
        Boolean $fullData = this.getFullData();
        result = result * 59 + ($fullData == null ? 43 : ((Object)$fullData).hashCode());
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
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationRequest(hostPort=" + this.getHostPort() + ", databaseName=" + this.getDatabaseName() + ", jdbcUrl=" + this.getJdbcUrl() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", batchSize=" + this.getBatchSize() + ", fullData=" + this.getFullData() + ")";
    }
}
