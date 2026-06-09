/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.moviepilot;

import lombok.Generated;

public class MoviePilotSubscribeResponse {
    private Boolean success;
    private String message;
    private SubscribeData data;

    @Generated
    public MoviePilotSubscribeResponse() {
    }

    @Generated
    public Boolean getSuccess() {
        return this.success;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public SubscribeData getData() {
        return this.data;
    }

    @Generated
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Generated
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public void setData(SubscribeData data) {
        this.data = data;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MoviePilotSubscribeResponse)) {
            return false;
        }
        MoviePilotSubscribeResponse other = (MoviePilotSubscribeResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$success = this.getSuccess();
        Boolean other$success = other.getSuccess();
        if (this$success == null ? other$success != null : !((Object)this$success).equals(other$success)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        SubscribeData this$data = this.getData();
        SubscribeData other$data = other.getData();
        return !(this$data == null ? other$data != null : !((Object)this$data).equals(other$data));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MoviePilotSubscribeResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $success = this.getSuccess();
        result = result * 59 + ($success == null ? 43 : ((Object)$success).hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        SubscribeData $data = this.getData();
        result = result * 59 + ($data == null ? 43 : ((Object)$data).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MoviePilotSubscribeResponse(success=" + this.getSuccess() + ", message=" + this.getMessage() + ", data=" + String.valueOf(this.getData()) + ")";
    }

    public static class SubscribeData {
        private Long id;

        @Generated
        public SubscribeData() {
        }

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public void setId(Long id) {
            this.id = id;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof SubscribeData)) {
                return false;
            }
            SubscribeData other = (SubscribeData)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Long this$id = this.getId();
            Long other$id = other.getId();
            return !(this$id == null ? other$id != null : !((Object)this$id).equals(other$id));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof SubscribeData;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Long $id = this.getId();
            result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "MoviePilotSubscribeResponse.SubscribeData(id=" + this.getId() + ")";
        }
    }
}
