/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.response.docker.DockerImagesVersionResponse;
import com.una.embyhub.service.DockerImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/docker"})
@SkipLicense
public class DockerImageController {
    @Autowired
    private DockerImageService dockerImageService;

    @GetMapping(value={"/version"})
    public DockerImagesVersionResponse getDockerImagesVersion() {
        return this.dockerImageService.getDockerImagesVersion();
    }
}