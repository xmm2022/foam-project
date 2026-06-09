/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.docker;

import com.una.embyhub.model.dto.response.docker.DockerImageVersionResponse;
import java.io.Serializable;
import lombok.Generated;

public class DockerImagesVersionResponse
implements Serializable {
    private DockerImageVersionResponse backend;
    private DockerImageVersionResponse frontend;

    @Generated
    public DockerImageVersionResponse getBackend() {
        return this.backend;
    }

    @Generated
    public DockerImageVersionResponse getFrontend() {
        return this.frontend;
    }

    @Generated
    public void setBackend(DockerImageVersionResponse backend) {
        this.backend = backend;
    }

    @Generated
    public void setFrontend(DockerImageVersionResponse frontend) {
        this.frontend = frontend;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DockerImagesVersionResponse)) {
            return false;
        }
        DockerImagesVersionResponse other = (DockerImagesVersionResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        DockerImageVersionResponse this$backend = this.getBackend();
        DockerImageVersionResponse other$backend = other.getBackend();
        if (this$backend == null ? other$backend != null : !((Object)this$backend).equals(other$backend)) {
            return false;
        }
        DockerImageVersionResponse this$frontend = this.getFrontend();
        DockerImageVersionResponse other$frontend = other.getFrontend();
        return !(this$frontend == null ? other$frontend != null : !((Object)this$frontend).equals(other$frontend));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof DockerImagesVersionResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        DockerImageVersionResponse $backend = this.getBackend();
        result = result * 59 + ($backend == null ? 43 : ((Object)$backend).hashCode());
        DockerImageVersionResponse $frontend = this.getFrontend();
        result = result * 59 + ($frontend == null ? 43 : ((Object)$frontend).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "DockerImagesVersionResponse(backend=" + String.valueOf(this.getBackend()) + ", frontend=" + String.valueOf(this.getFrontend()) + ")";
    }

    @Generated
    public DockerImagesVersionResponse() {
    }

    @Generated
    public DockerImagesVersionResponse(DockerImageVersionResponse backend, DockerImageVersionResponse frontend) {
        this.backend = backend;
        this.frontend = frontend;
    }
}
