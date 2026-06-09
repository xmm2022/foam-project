/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.http.CacheControl
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.HttpStatus
 *  org.springframework.http.HttpStatusCode
 *  org.springframework.http.ResponseEntity
 *  org.springframework.util.MultiValueMap
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.service.PlayRecordRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/playRecords/ranking"})
public class PlayRecordRankingController {
    @Autowired
    private PlayRecordRankingService playRecordRankingService;

    @GetMapping(value={"/image"}, produces={"image/png"})
    public ResponseEntity<byte[]> rankingImage(@RequestParam(defaultValue="day") String period) {
        byte[] data = this.playRecordRankingService.generateRankingImage(period);
        HttpHeaders headers = new HttpHeaders();
        headers.setCacheControl(CacheControl.noCache());
        return new ResponseEntity((Object)data, (MultiValueMap)headers, (HttpStatusCode)HttpStatus.OK);
    }
}