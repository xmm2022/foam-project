/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  info.movito.themoviedbapi.tools.TmdbException
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.model.dto.response.nullbr.MovieListResponse;
import com.una.embyhub.service.NullbrService;
import info.movito.themoviedbapi.tools.TmdbException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"nullbr"})
public class NullbrController {
    @Autowired
    private NullbrService nullbrService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.QUERY_NULLBR, type=OperationType.QUERY)
    public MovieListResponse select(@RequestParam String tmdbId, @RequestParam String type) throws TmdbException {
        return this.nullbrService.select(tmdbId, type);
    }
}