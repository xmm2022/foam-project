/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.foammigration;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class FoamDataMigrationPlanResponse
implements Serializable {
    private String scope;
    private Integer tableCount;
    private List<String> tables;

    @Generated
    public FoamDataMigrationPlanResponse() {
    }

    @Generated
    public String getScope() {
        return this.scope;
    }

    @Generated
    public Integer getTableCount() {
        return this.tableCount;
    }

    @Generated
    public List<String> getTables() {
        return this.tables;
    }

    @Generated
    public void setScope(String scope) {
        this.scope = scope;
    }

    @Generated
    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    @Generated
    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FoamDataMigrationPlanResponse)) {
            return false;
        }
        FoamDataMigrationPlanResponse other = (FoamDataMigrationPlanResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$tableCount = this.getTableCount();
        Integer other$tableCount = other.getTableCount();
        if (this$tableCount == null ? other$tableCount != null : !((Object)this$tableCount).equals(other$tableCount)) {
            return false;
        }
        String this$scope = this.getScope();
        String other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) {
            return false;
        }
        List<String> this$tables = this.getTables();
        List<String> other$tables = other.getTables();
        return !(this$tables == null ? other$tables != null : !((Object)this$tables).equals(other$tables));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof FoamDataMigrationPlanResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $tableCount = this.getTableCount();
        result = result * 59 + ($tableCount == null ? 43 : ((Object)$tableCount).hashCode());
        String $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        List<String> $tables = this.getTables();
        result = result * 59 + ($tables == null ? 43 : ((Object)$tables).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "FoamDataMigrationPlanResponse(scope=" + this.getScope() + ", tableCount=" + this.getTableCount() + ", tables=" + String.valueOf(this.getTables()) + ")";
    }
}
