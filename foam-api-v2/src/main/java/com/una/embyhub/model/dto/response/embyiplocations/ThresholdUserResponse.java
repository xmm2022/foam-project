/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.diboot.core.binding.annotation.BindField
 *  com.diboot.core.binding.annotation.BindFieldList
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyiplocations;

import com.diboot.core.binding.annotation.BindField;
import com.diboot.core.binding.annotation.BindFieldList;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyIpLocations;
import java.io.Serializable;
import lombok.Generated;

public class ThresholdUserResponse
implements Serializable {
    private String ipAddress;
    private String city;
    @BindFieldList(entity=EmbyIpLocations.class, field="city", condition="this.emby_user_name=emby_user_name", splitBy=",")
    private String cityList;
    private String embyUserName;
    private Long count;
    @BindFieldList(entity=EmbyIpLocations.class, field="ipAddress", condition="this.emby_user_name=emby_user_name", splitBy=",")
    private String ipAddressList;
    private Long embyInfoId;
    @BindField(entity=EmbyInfo.class, field="serverName", condition="this.embyInfoId=id")
    private String serverName;

    @Generated
    public ThresholdUserResponse() {
    }

    @Generated
    public String getIpAddress() {
        return this.ipAddress;
    }

    @Generated
    public String getCity() {
        return this.city;
    }

    @Generated
    public String getCityList() {
        return this.cityList;
    }

    @Generated
    public String getEmbyUserName() {
        return this.embyUserName;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public String getIpAddressList() {
        return this.ipAddressList;
    }

    @Generated
    public Long getEmbyInfoId() {
        return this.embyInfoId;
    }

    @Generated
    public String getServerName() {
        return this.serverName;
    }

    @Generated
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Generated
    public void setCity(String city) {
        this.city = city;
    }

    @Generated
    public void setCityList(String cityList) {
        this.cityList = cityList;
    }

    @Generated
    public void setEmbyUserName(String embyUserName) {
        this.embyUserName = embyUserName;
    }

    @Generated
    public void setCount(Long count) {
        this.count = count;
    }

    @Generated
    public void setIpAddressList(String ipAddressList) {
        this.ipAddressList = ipAddressList;
    }

    @Generated
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Generated
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ThresholdUserResponse)) {
            return false;
        }
        ThresholdUserResponse other = (ThresholdUserResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$count = this.getCount();
        Long other$count = other.getCount();
        if (this$count == null ? other$count != null : !((Object)this$count).equals(other$count)) {
            return false;
        }
        Long this$embyInfoId = this.getEmbyInfoId();
        Long other$embyInfoId = other.getEmbyInfoId();
        if (this$embyInfoId == null ? other$embyInfoId != null : !((Object)this$embyInfoId).equals(other$embyInfoId)) {
            return false;
        }
        String this$ipAddress = this.getIpAddress();
        String other$ipAddress = other.getIpAddress();
        if (this$ipAddress == null ? other$ipAddress != null : !this$ipAddress.equals(other$ipAddress)) {
            return false;
        }
        String this$city = this.getCity();
        String other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) {
            return false;
        }
        String this$cityList = this.getCityList();
        String other$cityList = other.getCityList();
        if (this$cityList == null ? other$cityList != null : !this$cityList.equals(other$cityList)) {
            return false;
        }
        String this$embyUserName = this.getEmbyUserName();
        String other$embyUserName = other.getEmbyUserName();
        if (this$embyUserName == null ? other$embyUserName != null : !this$embyUserName.equals(other$embyUserName)) {
            return false;
        }
        String this$ipAddressList = this.getIpAddressList();
        String other$ipAddressList = other.getIpAddressList();
        if (this$ipAddressList == null ? other$ipAddressList != null : !this$ipAddressList.equals(other$ipAddressList)) {
            return false;
        }
        String this$serverName = this.getServerName();
        String other$serverName = other.getServerName();
        return !(this$serverName == null ? other$serverName != null : !this$serverName.equals(other$serverName));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ThresholdUserResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : ((Object)$count).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
        String $ipAddress = this.getIpAddress();
        result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $cityList = this.getCityList();
        result = result * 59 + ($cityList == null ? 43 : $cityList.hashCode());
        String $embyUserName = this.getEmbyUserName();
        result = result * 59 + ($embyUserName == null ? 43 : $embyUserName.hashCode());
        String $ipAddressList = this.getIpAddressList();
        result = result * 59 + ($ipAddressList == null ? 43 : $ipAddressList.hashCode());
        String $serverName = this.getServerName();
        result = result * 59 + ($serverName == null ? 43 : $serverName.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ThresholdUserResponse(ipAddress=" + this.getIpAddress() + ", city=" + this.getCity() + ", cityList=" + this.getCityList() + ", embyUserName=" + this.getEmbyUserName() + ", count=" + this.getCount() + ", ipAddressList=" + this.getIpAddressList() + ", embyInfoId=" + this.getEmbyInfoId() + ", serverName=" + this.getServerName() + ")";
    }
}
