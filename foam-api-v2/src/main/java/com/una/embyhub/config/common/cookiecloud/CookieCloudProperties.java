/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.cookiecloud;

import lombok.Generated;

public class CookieCloudProperties {
    private String url;
    private String uuid;
    private String password;

    @Generated
    public static CookieCloudPropertiesBuilder builder() {
        return new CookieCloudPropertiesBuilder();
    }

    @Generated
    public String getUrl() {
        return this.url;
    }

    @Generated
    public String getUuid() {
        return this.uuid;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Generated
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CookieCloudProperties)) {
            return false;
        }
        CookieCloudProperties other = (CookieCloudProperties)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String this$uuid = this.getUuid();
        String other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) {
            return false;
        }
        String this$password = this.getPassword();
        String other$password = other.getPassword();
        return !(this$password == null ? other$password != null : !this$password.equals(other$password));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CookieCloudProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $uuid = this.getUuid();
        result = result * 59 + ($uuid == null ? 43 : $uuid.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CookieCloudProperties(url=" + this.getUrl() + ", uuid=" + this.getUuid() + ", password=" + this.getPassword() + ")";
    }

    @Generated
    public CookieCloudProperties() {
    }

    @Generated
    public CookieCloudProperties(String url, String uuid, String password) {
        this.url = url;
        this.uuid = uuid;
        this.password = password;
    }

    @Generated
    public static class CookieCloudPropertiesBuilder {
        @Generated
        private String url;
        @Generated
        private String uuid;
        @Generated
        private String password;

        @Generated
        CookieCloudPropertiesBuilder() {
        }

        @Generated
        public CookieCloudPropertiesBuilder url(String url) {
            this.url = url;
            return this;
        }

        @Generated
        public CookieCloudPropertiesBuilder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        @Generated
        public CookieCloudPropertiesBuilder password(String password) {
            this.password = password;
            return this;
        }

        @Generated
        public CookieCloudProperties build() {
            return new CookieCloudProperties(this.url, this.uuid, this.password);
        }

        @Generated
        public String toString() {
            return "CookieCloudProperties.CookieCloudPropertiesBuilder(url=" + this.url + ", uuid=" + this.uuid + ", password=" + this.password + ")";
        }
    }
}
