/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.IdType
 *  com.baomidou.mybatisplus.annotation.TableField
 *  com.baomidou.mybatisplus.annotation.TableId
 *  com.baomidou.mybatisplus.annotation.TableName
 *  lombok.Generated
 */
package com.una.embyhub.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.una.embyhub.model.entity.BaseEntity;
import java.io.Serializable;
import lombok.Generated;

@TableName(value="emby_ip_locations")
public class EmbyIpLocations
extends BaseEntity
implements Serializable {
    public static final String COL_COUNT = "count";
    public static final String COL_ABNORMAL = "abnormal";
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="ip_address")
    private String ipAddress;
    @TableField(value="country")
    private String country;
    @TableField(value="region")
    private String region;
    @TableField(value="city")
    private String city;
    @TableField(value="isp")
    private String isp;
    @TableField(value="emby_user_name")
    private String embyUserName;
    @TableField(value="client")
    private String client;
    @TableField(value="emby_info_id")
    private Long embyInfoId;
    public static final String COL_ID = "id";
    public static final String COL_IP_ADDRESS = "ip_address";
    public static final String COL_COUNTRY = "country";
    public static final String COL_REGION = "region";
    public static final String COL_CITY = "city";
    public static final String COL_ISP = "isp";
    public static final String COL_EMBY_USER_NAME = "emby_user_name";
    public static final String COL_CLIENT = "client";
    public static final String COL_EMBY_INFO_ID = "emby_info_id";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public EmbyIpLocations() {
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
    public Long getEmbyInfoId() {
        return this.embyInfoId;
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
    public void setEmbyInfoId(Long embyInfoId) {
        this.embyInfoId = embyInfoId;
    }

    @Override
    @Generated
    public String toString() {
        return "EmbyIpLocations(id=" + this.getId() + ", ipAddress=" + this.getIpAddress() + ", country=" + this.getCountry() + ", region=" + this.getRegion() + ", city=" + this.getCity() + ", isp=" + this.getIsp() + ", embyUserName=" + this.getEmbyUserName() + ", client=" + this.getClient() + ", embyInfoId=" + this.getEmbyInfoId() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyIpLocations)) {
            return false;
        }
        EmbyIpLocations other = (EmbyIpLocations)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        return !(this$client == null ? other$client != null : !this$client.equals(other$client));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyIpLocations;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $embyInfoId = this.getEmbyInfoId();
        result = result * 59 + ($embyInfoId == null ? 43 : ((Object)$embyInfoId).hashCode());
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
        return result;
    }
}
