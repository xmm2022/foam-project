/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.alibaba.fastjson2.JSONObject
 *  jakarta.validation.Valid
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.alibaba.fastjson2.JSONObject;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.license.LicenseProductEnum;
import com.una.embyhub.config.license.RequireProduct;
import com.una.embyhub.model.dto.request.openai.OpenAiChatRequest;
import com.una.embyhub.model.dto.request.openai.OpenAiImageRequest;
import com.una.embyhub.service.OpenAiService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"openai"})
public class OpenAiController {
    @Autowired
    private OpenAiService openAiService;

    @PostMapping(value={"/chat/completions"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    @OperationLog(value=OperationLogDesc.OPENAI_CHAT_COMPLETIONS, type=OperationType.QUERY)
    public JSONObject chatCompletions(@RequestBody(required=false) OpenAiChatRequest request) {
        return this.openAiService.chatCompletions(request);
    }

    @PostMapping(value={"/images/generations"})
    @SaCheckPermission(value={"admin"})
    @RequireProduct(value=LicenseProductEnum.PLUS)
    @OperationLog(value=OperationLogDesc.OPENAI_IMAGE_GENERATIONS, type=OperationType.QUERY)
    public JSONObject imageGenerations(@Valid @RequestBody OpenAiImageRequest request) {
        return this.openAiService.imageGenerations(request);
    }
}