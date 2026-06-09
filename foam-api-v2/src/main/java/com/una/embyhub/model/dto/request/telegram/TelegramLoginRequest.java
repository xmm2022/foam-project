/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import java.io.Serializable;
import lombok.Generated;

public class TelegramLoginRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String first_name;
    private String last_name;
    private String username;
    private String photo_url;
    private Long auth_date;
    private String hash;

    @Generated
    public TelegramLoginRequest() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getFirst_name() {
        return this.first_name;
    }

    @Generated
    public String getLast_name() {
        return this.last_name;
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getPhoto_url() {
        return this.photo_url;
    }

    @Generated
    public Long getAuth_date() {
        return this.auth_date;
    }

    @Generated
    public String getHash() {
        return this.hash;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Generated
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    @Generated
    public void setAuth_date(Long auth_date) {
        this.auth_date = auth_date;
    }

    @Generated
    public void setHash(String hash) {
        this.hash = hash;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TelegramLoginRequest)) {
            return false;
        }
        TelegramLoginRequest other = (TelegramLoginRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$auth_date = this.getAuth_date();
        Long other$auth_date = other.getAuth_date();
        if (this$auth_date == null ? other$auth_date != null : !((Object)this$auth_date).equals(other$auth_date)) {
            return false;
        }
        String this$first_name = this.getFirst_name();
        String other$first_name = other.getFirst_name();
        if (this$first_name == null ? other$first_name != null : !this$first_name.equals(other$first_name)) {
            return false;
        }
        String this$last_name = this.getLast_name();
        String other$last_name = other.getLast_name();
        if (this$last_name == null ? other$last_name != null : !this$last_name.equals(other$last_name)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$photo_url = this.getPhoto_url();
        String other$photo_url = other.getPhoto_url();
        if (this$photo_url == null ? other$photo_url != null : !this$photo_url.equals(other$photo_url)) {
            return false;
        }
        String this$hash = this.getHash();
        String other$hash = other.getHash();
        return !(this$hash == null ? other$hash != null : !this$hash.equals(other$hash));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TelegramLoginRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $auth_date = this.getAuth_date();
        result = result * 59 + ($auth_date == null ? 43 : ((Object)$auth_date).hashCode());
        String $first_name = this.getFirst_name();
        result = result * 59 + ($first_name == null ? 43 : $first_name.hashCode());
        String $last_name = this.getLast_name();
        result = result * 59 + ($last_name == null ? 43 : $last_name.hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $photo_url = this.getPhoto_url();
        result = result * 59 + ($photo_url == null ? 43 : $photo_url.hashCode());
        String $hash = this.getHash();
        result = result * 59 + ($hash == null ? 43 : $hash.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TelegramLoginRequest(id=" + this.getId() + ", first_name=" + this.getFirst_name() + ", last_name=" + this.getLast_name() + ", username=" + this.getUsername() + ", photo_url=" + this.getPhoto_url() + ", auth_date=" + this.getAuth_date() + ", hash=" + this.getHash() + ")";
    }
}
