/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.embyiplocations;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class EmbyIpLocationsUpdate
implements Serializable {
    private Long id;
    private String ipAddress;
    private String country;
    private String region;
    private String city;
    private String isp;
    private String embyUserName;
    private String client;
    private Date createDatetime;
    private Date updateDatetime;
    private String createUserName;
    private String updateUserName;
    private Long updateUserId;
    private Long createUserId;
    private Integer delFlag;

    @Generated
    public EmbyIpLocationsUpdate() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getIpAddress() {
        return this.ipAddress;
    }

    @Generated
    public String getCountry() {
        return this.country;
    }

    @Generated
    public String getRegion() {
        return this.region;
    }

    @Generated
    public String getCity() {
        return this.city;
    }

    @Generated
    public String getIsp() {
        return this.isp;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public String getClient() {
        return this.client;
    }

    @Generated
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    @Generated
    public Date getUpdateDatetime() {
        return this.updateDatetime;
    }

    @Generated
    public String getCreateUserName() {
        return this.createUserName;
    }

    @Generated
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    @Generated
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    @Generated
    public Long getCreateUserId() {
        return this.createUserId;
    }

    @Generated
    public Integer getDelFlag() {
        return this.delFlag;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Generated
    public void setCountry(String country) {
        this.country = country;
    }

    @Generated
    public void setRegion(String region) {
        this.region = region;
    }

    @Generated
    public void setCity(String city) {
        this.city = city;
    }

    @Generated
    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setClient(String client) {
        this.client = client;
    }

    @Generated
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Generated
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Generated
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Generated
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Generated
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Generated
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Generated
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyIpLocationsUpdate)) {
            return false;
        }
        EmbyIpLocationsUpdate other = (EmbyIpLocationsUpdate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$updateUserId = this.getUpdateUserId();
        Long other$updateUserId = other.getUpdateUserId();
        if (this$updateUserId == null ? other$updateUserId != null : !((Object)this$updateUserId).equals(other$updateUserId)) {
            return false;
        }
        Long this$createUserId = this.getCreateUserId();
        Long other$createUserId = other.getCreateUserId();
        if (this$createUserId == null ? other$createUserId != null : !((Object)this$createUserId).equals(other$createUserId)) {
            return false;
        }
        Integer this$delFlag = this.getDelFlag();
        Integer other$delFlag = other.getDelFlag();
        if (this$delFlag == null ? other$delFlag != null : !((Object)this$delFlag).equals(other$delFlag)) {
            return false;
        }
        String this$ipAddress = this.getIpAddress();
        String other$ipAddress = other.getIpAddress();
        if (this$ipAddress == null ? other$ipAddress != null : !this$ipAddress.equals(other$ipAddress)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$city = this.getCity();
        String other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) {
            return false;
        }
        String this$isp = this.getIsp();
        String other$isp = other.getIsp();
        if (this$isp == null ? other$isp != null : !this$isp.equals(other$isp)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$client = this.getClient();
        String other$client = other.getClient();
        if (this$client == null ? other$client != null : !this$client.equals(other$client)) {
            return false;
        }
        Date this$createDatetime = this.getCreateDatetime();
        Date other$createDatetime = other.getCreateDatetime();
        if (this$createDatetime == null ? other$createDatetime != null : !((Object)this$createDatetime).equals(other$createDatetime)) {
            return false;
        }
        Date this$updateDatetime = this.getUpdateDatetime();
        Date other$updateDatetime = other.getUpdateDatetime();
        if (this$updateDatetime == null ? other$updateDatetime != null : !((Object)this$updateDatetime).equals(other$updateDatetime)) {
            return false;
        }
        String this$createUserName = this.getCreateUserName();
        String other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) {
            return false;
        }
        String this$updateUserName = this.getUpdateUserName();
        String other$updateUserName = other.getUpdateUserName();
        return !(this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyIpLocationsUpdate;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $updateUserId = this.getUpdateUserId();
        result = result * 59 + ($updateUserId == null ? 43 : ((Object)$updateUserId).hashCode());
        Long $createUserId = this.getCreateUserId();
        result = result * 59 + ($createUserId == null ? 43 : ((Object)$createUserId).hashCode());
        Integer $delFlag = this.getDelFlag();
        result = result * 59 + ($delFlag == null ? 43 : ((Object)$delFlag).hashCode());
        String $ipAddress = this.getIpAddress();
        result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $isp = this.getIsp();
        result = result * 59 + ($isp == null ? 43 : $isp.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $client = this.getClient();
        result = result * 59 + ($client == null ? 43 : $client.hashCode());
        Date $createDatetime = this.getCreateDatetime();
        result = result * 59 + ($createDatetime == null ? 43 : ((Object)$createDatetime).hashCode());
        Date $updateDatetime = this.getUpdateDatetime();
        result = result * 59 + ($updateDatetime == null ? 43 : ((Object)$updateDatetime).hashCode());
        String $createUserName = this.getCreateUserName();
        result = result * 59 + ($createUserName == null ? 43 : $createUserName.hashCode());
        String $updateUserName = this.getUpdateUserName();
        result = result * 59 + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyIpLocationsUpdate(id=" + this.getId() + ", ipAddress=" + this.getIpAddress() + ", country=" + this.getCountry() + ", region=" + this.getRegion() + ", city=" + this.getCity() + ", isp=" + this.getIsp() + ", embyUserName=" + this.getEmbyUserName() + ", client=" + this.getClient() + ", createDatetime=" + String.valueOf(this.getCreateDatetime()) + ", updateDatetime=" + String.valueOf(this.getUpdateDatetime()) + ", createUserName=" + this.getCreateUserName() + ", updateUserName=" + this.getUpdateUserName() + ", updateUserId=" + this.getUpdateUserId() + ", createUserId=" + this.getCreateUserId() + ", delFlag=" + this.getDelFlag() + ")";
    }
}
