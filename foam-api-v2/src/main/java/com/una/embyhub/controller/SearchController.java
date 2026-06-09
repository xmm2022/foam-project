/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.validation.Valid
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.model.dto.request.telegram.SearchRequest;
import com.una.embyhub.model.dto.response.telegram.SearchResponse;
import com.una.embyhub.service.SearchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"telegram"})
public class SearchController {
    @Autowired
    private SearchService searchService;

    @PostMapping(value={"/search"})
    public SearchResponse search(@Valid @RequestBody SearchRequest request) {
        return this.searchService.search(request);
    }
}