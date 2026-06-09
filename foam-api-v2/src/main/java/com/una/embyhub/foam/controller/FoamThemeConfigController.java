/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.fasterxml.jackson.databind.JsonNode
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.PutMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.foam.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.fasterxml.jackson.databind.JsonNode;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.foam.service.FoamThemeConfigService;
import jakarta.validation.constraints.NotBlank;
import java.util.List;
import lombok.Generated;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"foam/theme-config"})
@Validated
@SkipLicense
@SaCheckPermission(value={"admin"})
public class FoamThemeConfigController {
    private final FoamThemeConfigService foamThemeConfigService;

    @PostMapping(value={"{key}"})
    public JsonNode create(@PathVariable(value="key") @NotBlank String key, @RequestBody JsonNode data) {
        return this.foamThemeConfigService.create(key, data);
    }

    @GetMapping(value={"{key}"})
    public JsonNode get(@PathVariable(value="key") @NotBlank String key) {
        return this.foamThemeConfigService.get(key);
    }

    @PutMapping(value={"{key}"})
    public JsonNode update(@PathVariable(value="key") @NotBlank String key, @RequestBody JsonNode data) {
        return this.foamThemeConfigService.update(key, data);
    }

    @DeleteMapping(value={"{key}"})
    public void delete(@PathVariable(value="key") @NotBlank String key) {
        this.foamThemeConfigService.delete(key);
    }

    @GetMapping(value={"keys"})
    public List<String> keys() {
        return this.foamThemeConfigService.keys();
    }

    @Generated
    public FoamThemeConfigController(FoamThemeConfigService foamThemeConfigService) {
        this.foamThemeConfigService = foamThemeConfigService;
    }
}