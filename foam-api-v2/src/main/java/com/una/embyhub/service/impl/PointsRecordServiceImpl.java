/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.stp.StpUtil
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
 *  org.springframework.stereotype.Service
 */
package com.una.embyhub.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.mapper.PointsRecordMapper;
import com.una.embyhub.model.dto.request.pointsrecord.PointsRecordRequest;
import com.una.embyhub.model.dto.response.pointsrecord.PointsRecordResponse;
import com.una.embyhub.model.entity.PointsRecord;
import com.una.embyhub.service.PointsRecordService;
import org.springframework.stereotype.Service;

@Service
public class PointsRecordServiceImpl
extends ServiceImpl<PointsRecordMapper, PointsRecord>
implements PointsRecordService {
    @Override
    public Page<PointsRecordResponse> queryPageWithUserInfo(MybatisPlusPage<PointsRecordRequest> pageParam) {
        Page<PointsRecordResponse> responsePage;
        Page page = new Page(pageParam.getCurrent(), pageParam.getSize());
        PointsRecordRequest request = pageParam.getObject();
        boolean isAdmin = StpUtil.hasPermission((String)"admin");
        Long userId = null;
        String username = null;
        String recordType = null;
        if (request != null) {
            recordType = request.getRecordType();
            if (isAdmin) {
                username = request.getUsername();
            }
        }
        if (!isAdmin) {
            userId = StpUtil.getLoginIdAsLong();
        }
        if ((responsePage = ((PointsRecordMapper)this.baseMapper).selectPageWithUserInfo((Page<PointsRecordResponse>)page, userId, username, recordType)).getRecords() != null) {
            block12: for (PointsRecordResponse record : responsePage.getRecords()) {
                if (record.getRecordType() == null) continue;
                switch (record.getRecordType()) {
                    case "INVITE_REWARD": {
                        record.setRecordTypeCn("\u9080\u8bf7\u5956\u52b1");
                        continue block12;
                    }
                    case "EXCHANGE_SPEND": {
                        record.setRecordTypeCn("\u5151\u6362\u6d88\u8017");
                        continue block12;
                    }
                    case "ADMIN_ADJUST": {
                        record.setRecordTypeCn("\u7ba1\u7406\u5458\u8c03\u6574");
                        continue block12;
                    }
                    case "EXCHANGE_REFUND": {
                        record.setRecordTypeCn("\u9000\u8fd8\u79ef\u5206");
                        continue block12;
                    }
                }
                record.setRecordTypeCn("\u672a\u77e5\u7c7b\u578b");
            }
        }
        return responsePage;
    }
}