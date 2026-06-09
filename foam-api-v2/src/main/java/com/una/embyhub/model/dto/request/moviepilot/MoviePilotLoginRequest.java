/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.moviepilot;

import lombok.Generated;

public class MoviePilotLoginRequest {
    private String url;
    private String username;
    private String password;
    private String otpPassword;

    @Generated
    public MoviePilotLoginRequest() {
    }

    @Generated
    public String getUrl() {
        return this.url;
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
    public String getOtpPassword() {
        return this.otpPassword;
    }

    @Generated
    public void setUrl(String url) {
        this.url = url;
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
    public void setOtpPassword(String otpPassword) {
        this.otpPassword = otpPassword;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MoviePilotLoginRequest)) {
            return false;
        }
        MoviePilotLoginRequest other = (MoviePilotLoginRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
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
        String this$otpPassword = this.getOtpPassword();
        String other$otpPassword = other.getOtpPassword();
        return !(this$otpPassword == null ? other$otpPassword != null : !this$otpPassword.equals(other$otpPassword));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MoviePilotLoginRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        String $otpPassword = this.getOtpPassword();
        result = result * 59 + ($otpPassword == null ? 43 : $otpPassword.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MoviePilotLoginRequest(url=" + this.getUrl() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", otpPassword=" + this.getOtpPassword() + ")";
    }
}
