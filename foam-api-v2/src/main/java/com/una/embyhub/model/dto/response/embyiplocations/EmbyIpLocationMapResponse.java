/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.embyiplocations;

import java.io.Serializable;
import lombok.Generated;

public class EmbyIpLocationMapResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String country;
    private String region;
    private String city;
    private Long value;
    private String geocoding;

    @Generated
    public EmbyIpLocationMapResponse() {
    }

    @Generated
    public String getName() {
        return this.name;
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
    public Long getValue() {
        return this.value;
    }

    @Generated
    public String getGeocoding() {
        return this.geocoding;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
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
    public void setValue(Long value) {
        this.value = value;
    }

    @Generated
    public void setGeocoding(String geocoding) {
        this.geocoding = geocoding;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyIpLocationMapResponse)) {
            return false;
        }
        EmbyIpLocationMapResponse other = (EmbyIpLocationMapResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$value = this.getValue();
        Long other$value = other.getValue();
        if (this$value == null ? other$value != null : !((Object)this$value).equals(other$value)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
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
        String this$geocoding = this.getGeocoding();
        String other$geocoding = other.getGeocoding();
        return !(this$geocoding == null ? other$geocoding != null : !this$geocoding.equals(other$geocoding));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyIpLocationMapResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : ((Object)$value).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $geocoding = this.getGeocoding();
        result = result * 59 + ($geocoding == null ? 43 : $geocoding.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyIpLocationMapResponse(name=" + this.getName() + ", country=" + this.getCountry() + ", region=" + this.getRegion() + ", city=" + this.getCity() + ", value=" + this.getValue() + ", geocoding=" + this.getGeocoding() + ")";
    }
}
