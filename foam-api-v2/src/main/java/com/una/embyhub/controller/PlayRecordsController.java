/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.annotation.SaCheckPermission
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.format.annotation.DateTimeFormat
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.una.embyhub.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.config.common.annotation.OperationLog;
import com.una.embyhub.config.common.annotation.OperationLogDesc;
import com.una.embyhub.config.common.annotation.OperationType;
import com.una.embyhub.config.license.SkipLicense;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.model.dto.request.playrecords.PlayRecordsRequest;
import com.una.embyhub.model.dto.request.playrecords.UserPlayStats;
import com.una.embyhub.model.dto.response.playrecords.PlayRecordsResponse;
import com.una.embyhub.service.PlayRecordsService;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"playRecords"})
@SkipLicense
public class PlayRecordsController {
    @Autowired
    private PlayRecordsService playRecordsService;

    @PostMapping(value={"select"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.QUERY_PLAY_RECORD, type=OperationType.QUERY)
    public Page<PlayRecordsResponse> select(@RequestBody MybatisPlusPage<PlayRecordsRequest> page) {
        return this.playRecordsService.select(page);
    }

    @PostMapping(value={"getPlayStats"})
    @SaCheckPermission(value={"admin"})
    @OperationLog(value=OperationLogDesc.PLAY_STATISTICS, type=OperationType.QUERY)
    public List<UserPlayStats> getPlayStats(@RequestParam(required=false) String userName, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate, @RequestParam(required=false) Long embyInfoId) {
        if (startDate != null && endDate == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            calendar.add(5, 1);
            endDate = calendar.getTime();
        }
        return this.playRecordsService.getPlayStats(userName, startDate, endDate, embyInfoId);
    }
}