/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import com.una.embyhub.service.EmbyNotifyDataDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"embyNotifyDataDetails"})
public class EmbyNotifyDataDetailsController {
    @Autowired
    private EmbyNotifyDataDetailsService embyNotifyDataDetailsService;
}