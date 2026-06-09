/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.emby;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class EmbyStudioPresetResponse
implements Serializable {
    private String label;
    private List<String> aliases = new ArrayList<String>();
    private String studioIds;
    private List<Studio> studios = new ArrayList<Studio>();

    @Generated
    public EmbyStudioPresetResponse() {
    }

    @Generated
    public String getLabel() {
        return this.label;
    }

    @Generated
    public List<String> getAliases() {
        return this.aliases;
    }

    @Generated
    public String getStudioIds() {
        return this.studioIds;
    }

    @Generated
    public List<Studio> getStudios() {
        return this.studios;
    }

    @Generated
    public void setLabel(String label) {
        this.label = label;
    }

    @Generated
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    @Generated
    public void setStudioIds(String studioIds) {
        this.studioIds = studioIds;
    }

    @Generated
    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EmbyStudioPresetResponse)) {
            return false;
        }
        EmbyStudioPresetResponse other = (EmbyStudioPresetResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$label = this.getLabel();
        String other$label = other.getLabel();
        if (this$label == null ? other$label != null : !this$label.equals(other$label)) {
            return false;
        }
        List<String> this$aliases = this.getAliases();
        List<String> other$aliases = other.getAliases();
        if (this$aliases == null ? other$aliases != null : !((Object)this$aliases).equals(other$aliases)) {
            return false;
        }
        String this$studioIds = this.getStudioIds();
        String other$studioIds = other.getStudioIds();
        if (this$studioIds == null ? other$studioIds != null : !this$studioIds.equals(other$studioIds)) {
            return false;
        }
        List<Studio> this$studios = this.getStudios();
        List<Studio> other$studios = other.getStudios();
        return !(this$studios == null ? other$studios != null : !((Object)this$studios).equals(other$studios));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof EmbyStudioPresetResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $label = this.getLabel();
        result = result * 59 + ($label == null ? 43 : $label.hashCode());
        List<String> $aliases = this.getAliases();
        result = result * 59 + ($aliases == null ? 43 : ((Object)$aliases).hashCode());
        String $studioIds = this.getStudioIds();
        result = result * 59 + ($studioIds == null ? 43 : $studioIds.hashCode());
        List<Studio> $studios = this.getStudios();
        result = result * 59 + ($studios == null ? 43 : ((Object)$studios).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "EmbyStudioPresetResponse(label=" + this.getLabel() + ", aliases=" + String.valueOf(this.getAliases()) + ", studioIds=" + this.getStudioIds() + ", studios=" + String.valueOf(this.getStudios()) + ")";
    }

    public static class Studio
    implements Serializable {
        private String id;
        private String name;

        @Generated
        public Studio() {
        }

        @Generated
        public String getId() {
            return this.id;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public void setId(String id) {
            this.id = id;
        }

        @Generated
        public void setName(String name) {
            this.name = name;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Studio)) {
                return false;
            }
            Studio other = (Studio)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$id = this.getId();
            String other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            return !(this$name == null ? other$name != null : !this$name.equals(other$name));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof Studio;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $id = this.getId();
            result = result * 59 + ($id == null ? 43 : $id.hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "EmbyStudioPresetResponse.Studio(id=" + this.getId() + ", name=" + this.getName() + ")";
        }
    }
}
