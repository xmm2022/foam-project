/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.una.embyhub.config.common.MpConvert;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.mapper.EmbyClientFilterRecordMapper;
import com.una.embyhub.model.dto.request.embyclientfilter.EmbyClientFilterRecordRequest;
import com.una.embyhub.model.dto.response.embyclientfilter.EmbyClientFilterRecordResponse;
import com.una.embyhub.model.entity.EmbyClientFilterRecord;
import com.una.embyhub.service.EmbyClientFilterRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional(rollbackFor={Exception.class})
public class EmbyClientFilterRecordServiceImpl
extends ServiceImpl<EmbyClientFilterRecordMapper, EmbyClientFilterRecord>
implements EmbyClientFilterRecordService {
    @Override
    public Page<EmbyClientFilterRecordResponse> select(MybatisPlusPage<EmbyClientFilterRecordRequest> page) {
        EmbyClientFilterRecordRequest request = page.getObject();
        LambdaQueryWrapper wrapper = new LambdaQueryWrapper();
        if (request != null) {
            String keyword = request.getKeyword();
            wrapper.and(StringUtils.hasText((String)keyword), q -> ((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)q.like(EmbyClientFilterRecord::getEmbyUserName, (Object)keyword)).or()).like(EmbyClientFilterRecord::getClientName, (Object)keyword)).or()).like(EmbyClientFilterRecord::getDeviceName, (Object)keyword)).or()).like(EmbyClientFilterRecord::getMatchedPattern, (Object)keyword)).or()).like(EmbyClientFilterRecord::getItemName, (Object)keyword)).or()).like(EmbyClientFilterRecord::getRemoteEndpoint, (Object)keyword));
            wrapper.like(StringUtils.hasText((String)request.getEmbyUserName()), EmbyClientFilterRecord::getEmbyUserName, (Object)request.getEmbyUserName());
            wrapper.like(StringUtils.hasText((String)request.getClientName()), EmbyClientFilterRecord::getClientName, (Object)request.getClientName());
            wrapper.eq(StringUtils.hasText((String)request.getEvent()), EmbyClientFilterRecord::getEvent, (Object)request.getEvent());
            wrapper.eq(request.getBlockUserSuccess() != null, EmbyClientFilterRecord::getBlockUserSuccess, (Object)request.getBlockUserSuccess());
            wrapper.eq(request.getStopSuccess() != null, EmbyClientFilterRecord::getStopSuccess, (Object)request.getStopSuccess());
            wrapper.eq(request.getEmbyInfoId() != null, EmbyClientFilterRecord::getEmbyInfoId, (Object)request.getEmbyInfoId());
            wrapper.ge(request.getTriggerTimeStart() != null, EmbyClientFilterRecord::getTriggerTime, (Object)request.getTriggerTimeStart());
            wrapper.le(request.getTriggerTimeEnd() != null, EmbyClientFilterRecord::getTriggerTime, (Object)request.getTriggerTimeEnd());
        }
        ((LambdaQueryWrapper)wrapper.orderByDesc(EmbyClientFilterRecord::getTriggerTime)).orderByDesc(EmbyClientFilterRecord::getId);
        return MpConvert.page(wrapper, this.getBaseMapper(), EmbyClientFilterRecordResponse.class, page.getCurrent(), page.getSize(), page.getOrders());
    }
}