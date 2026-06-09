/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.model.dto.request.notifychannel.NotifyChannelSave;
import com.una.embyhub.model.dto.request.notifychannel.NotifyChannelUpdate;
import com.una.embyhub.model.dto.response.notifychannel.NotifyChannelResponse;
import com.una.embyhub.service.NotifyChannelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"notifyChannel"})
@SkipLicense
public class NotifyChannelController {
    @Autowired
    private NotifyChannelService notifyChannelService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_CHANNEL_QUERY, type=OperationType.QUERY)
    public List<NotifyChannelResponse> select() {
        return this.notifyChannelService.select();
    }

    @PostMapping(value={"add"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_CHANNEL_ADD, type=OperationType.ADD)
    public void add(@RequestBody NotifyChannelSave notifyChannelSave) {
        this.notifyChannelService.add(notifyChannelSave);
    }

    @PostMapping(value={"update"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTFIY_CHANNEL_UPDATE, type=OperationType.MODIFY)
    public void update(@RequestBody NotifyChannelUpdate notifyChannelUpdate) {
        this.notifyChannelService.update(notifyChannelUpdate);
    }

    @PostMapping(value={"delete"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.NOTIFY_CHANNEL_DELETE, type=OperationType.DELETE)
    public void delete(@RequestParam Long id) {
        this.notifyChannelService.delete(id);
    }
}