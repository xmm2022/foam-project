/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.telegram;

import com.una.embyhub.model.dto.request.telegram.PublisherInfoRequest;
import java.util.List;
import lombok.Generated;

public class PublisherGroupResponse {
    private String name;
    private List<PublisherInfoRequest> publishers;

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public List<PublisherInfoRequest> getPublishers() {
        return this.publishers;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setPublishers(List<PublisherInfoRequest> publishers) {
        this.publishers = publishers;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PublisherGroupResponse)) {
            return false;
        }
        PublisherGroupResponse other = (PublisherGroupResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        List<PublisherInfoRequest> this$publishers = this.getPublishers();
        List<PublisherInfoRequest> other$publishers = other.getPublishers();
        return !(this$publishers == null ? other$publishers != null : !((Object)this$publishers).equals(other$publishers));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PublisherGroupResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        List<PublisherInfoRequest> $publishers = this.getPublishers();
        result = result * 59 + ($publishers == null ? 43 : ((Object)$publishers).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PublisherGroupResponse(name=" + this.getName() + ", publishers=" + String.valueOf(this.getPublishers()) + ")";
    }

    @Generated
    public PublisherGroupResponse() {
    }

    @Generated
    public PublisherGroupResponse(String name, List<PublisherInfoRequest> publishers) {
        this.name = name;
        this.publishers = publishers;
    }
}
