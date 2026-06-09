/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.request.telegram;

import java.io.Serializable;
import java.util.List;
import lombok.Generated;

public class TelegramMessageRequest
implements Serializable {
    private String query;
    private List<String> channels;

    @Generated
    public TelegramMessageRequest() {
    }

    @Generated
    public String getQuery() {
        return this.query;
    }

    @Generated
    public List<String> getChannels() {
        return this.channels;
    }

    @Generated
    public void setQuery(String query) {
        this.query = query;
    }

    @Generated
    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TelegramMessageRequest)) {
            return false;
        }
        TelegramMessageRequest other = (TelegramMessageRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$query = this.getQuery();
        String other$query = other.getQuery();
        if (this$query == null ? other$query != null : !this$query.equals(other$query)) {
            return false;
        }
        List<String> this$channels = this.getChannels();
        List<String> other$channels = other.getChannels();
        return !(this$channels == null ? other$channels != null : !((Object)this$channels).equals(other$channels));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof TelegramMessageRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $query = this.getQuery();
        result = result * 59 + ($query == null ? 43 : $query.hashCode());
        List<String> $channels = this.getChannels();
        result = result * 59 + ($channels == null ? 43 : ((Object)$channels).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "TelegramMessageRequest(query=" + this.getQuery() + ", channels=" + String.valueOf(this.getChannels()) + ")";
    }
}
