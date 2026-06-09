/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  jakarta.validation.Valid
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.moviepilot.MoviePilotLoginRequest;
import com.una.embyhub.model.dto.request.moviepilot.MoviePilotSubscribeRequest;
import com.una.embyhub.model.dto.response.moviepilot.MoviePilotLoginResponse;
import com.una.embyhub.model.dto.response.moviepilot.MoviePilotSubscribeResponse;
import com.una.embyhub.model.dto.response.moviepilot.MoviePilotSubscriptionItemResponse;
import com.una.embyhub.service.MoviePilotService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"moviepilot"})
@SkipLicense
public class MoviePilotController {
    @Autowired
    private MoviePilotService moviePilotService;

    @PostMapping(value={"/login"})
    @SaCheckPermission(value={"admin"})
    public MoviePilotLoginResponse login(@Valid @RequestBody MoviePilotLoginRequest request) {
        return this.moviePilotService.login(request);
    }

    @PostMapping(value={"/subscribe"})
    @SaCheckPermission(value={"admin"})
    public MoviePilotSubscribeResponse subscribe(@Valid @RequestBody MoviePilotSubscribeRequest request) {
        return this.moviePilotService.subscribe(request);
    }

    @PostMapping(value={"/subscribe/{id}"})
    @SaCheckPermission(value={"admin"})
    public MoviePilotSubscribeResponse cancelSubscribe(@PathVariable(value="id") Long id) {
        return this.moviePilotService.cancelSubscribe(id);
    }

    @PostMapping(value={"/subscribe/list"})
    @SaCheckPermission(value={"admin"})
    public List<MoviePilotSubscriptionItemResponse> subscribeList() {
        return this.moviePilotService.subscribeList();
    }
}