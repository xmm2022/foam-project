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

@TableName(value="ip_info")
public class IpInfo
extends BaseEntity
implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value="id", type=IdType.AUTO)
    private Long id;
    @TableField(value="ip")
    private String ip;
    @TableField(value="pro")
    private String pro;
    @TableField(value="pro_code")
    private String proCode;
    @TableField(value="city")
    private String city;
    @TableField(value="city_code")
    private String cityCode;
    @TableField(value="region")
    private String region;
    @TableField(value="region_code")
    private String regionCode;
    @TableField(value="addr")
    private String addr;
    @TableField(value="region_names")
    private String regionNames;
    @TableField(value="err")
    private String err;
    @TableField(value="isp")
    private String isp;
    public static final String COL_ID = "id";
    public static final String COL_IP = "ip";
    public static final String COL_PRO = "pro";
    public static final String COL_PRO_CODE = "pro_code";
    public static final String COL_CITY = "city";
    public static final String COL_CITY_CODE = "city_code";
    public static final String COL_REGION = "region";
    public static final String COL_REGION_CODE = "region_code";
    public static final String COL_ADDR = "addr";
    public static final String COL_REGION_NAMES = "region_names";
    public static final String COL_ERR = "err";
    public static final String COL_ISP = "isp";
    public static final String COL_CREATE_DATETIME = "create_datetime";
    public static final String COL_UPDATE_DATETIME = "update_datetime";
    public static final String COL_CREATE_USER_NAME = "create_user_name";
    public static final String COL_UPDATE_USER_NAME = "update_user_name";
    public static final String COL_UPDATE_USER_ID = "update_user_id";
    public static final String COL_CREATE_USER_ID = "create_user_id";
    public static final String COL_DEL_FLAG = "del_flag";

    @Generated
    public IpInfo() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getIp() {
        return this.ip;
    }

    @Generated
    public String getPro() {
        return this.pro;
    }

    @Generated
    public String getProCode() {
        return this.proCode;
    }

    @Generated
    public String getCity() {
        return this.city;
    }

    @Generated
    public String getCityCode() {
        return this.cityCode;
    }

    @Generated
    public String getRegion() {
        return this.region;
    }

    @Generated
    public String getRegionCode() {
        return this.regionCode;
    }

    @Generated
    public String getAddr() {
        return this.addr;
    }

    @Generated
    public String getRegionNames() {
        return this.regionNames;
    }

    @Generated
    public String getErr() {
        return this.err;
    }

    @Generated
    public String getIsp() {
        return this.isp;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Generated
    public void setPro(String pro) {
        this.pro = pro;
    }

    @Generated
    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    @Generated
    public void setCity(String city) {
        this.city = city;
    }

    @Generated
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Generated
    public void setRegion(String region) {
        this.region = region;
    }

    @Generated
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Generated
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Generated
    public void setRegionNames(String regionNames) {
        this.regionNames = regionNames;
    }

    @Generated
    public void setErr(String err) {
        this.err = err;
    }

    @Generated
    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Override
    @Generated
    public String toString() {
        return "IpInfo(id=" + this.getId() + ", ip=" + this.getIp() + ", pro=" + this.getPro() + ", proCode=" + this.getProCode() + ", city=" + this.getCity() + ", cityCode=" + this.getCityCode() + ", region=" + this.getRegion() + ", regionCode=" + this.getRegionCode() + ", addr=" + this.getAddr() + ", regionNames=" + this.getRegionNames() + ", err=" + this.getErr() + ", isp=" + this.getIsp() + ")";
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IpInfo)) {
            return false;
        }
        IpInfo other = (IpInfo)o;
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
        String this$ip = this.getIp();
        String other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) {
            return false;
        }
        String this$pro = this.getPro();
        String other$pro = other.getPro();
        if (this$pro == null ? other$pro != null : !this$pro.equals(other$pro)) {
            return false;
        }
        String this$proCode = this.getProCode();
        String other$proCode = other.getProCode();
        if (this$proCode == null ? other$proCode != null : !this$proCode.equals(other$proCode)) {
            return false;
        }
        String this$city = this.getCity();
        String other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) {
            return false;
        }
        String this$cityCode = this.getCityCode();
        String other$cityCode = other.getCityCode();
        if (this$cityCode == null ? other$cityCode != null : !this$cityCode.equals(other$cityCode)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        String this$addr = this.getAddr();
        String other$addr = other.getAddr();
        if (this$addr == null ? other$addr != null : !this$addr.equals(other$addr)) {
            return false;
        }
        String this$regionNames = this.getRegionNames();
        String other$regionNames = other.getRegionNames();
        if (this$regionNames == null ? other$regionNames != null : !this$regionNames.equals(other$regionNames)) {
            return false;
        }
        String this$err = this.getErr();
        String other$err = other.getErr();
        if (this$err == null ? other$err != null : !this$err.equals(other$err)) {
            return false;
        }
        String this$isp = this.getIsp();
        String other$isp = other.getIsp();
        return !(this$isp == null ? other$isp != null : !this$isp.equals(other$isp));
    }

    @Override
    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof IpInfo;
    }

    @Override
    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $ip = this.getIp();
        result = result * 59 + ($ip == null ? 43 : $ip.hashCode());
        String $pro = this.getPro();
        result = result * 59 + ($pro == null ? 43 : $pro.hashCode());
        String $proCode = this.getProCode();
        result = result * 59 + ($proCode == null ? 43 : $proCode.hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $cityCode = this.getCityCode();
        result = result * 59 + ($cityCode == null ? 43 : $cityCode.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $addr = this.getAddr();
        result = result * 59 + ($addr == null ? 43 : $addr.hashCode());
        String $regionNames = this.getRegionNames();
        result = result * 59 + ($regionNames == null ? 43 : $regionNames.hashCode());
        String $err = this.getErr();
        result = result * 59 + ($err == null ? 43 : $err.hashCode());
        String $isp = this.getIsp();
        result = result * 59 + ($isp == null ? 43 : $isp.hashCode());
        return result;
    }
}
