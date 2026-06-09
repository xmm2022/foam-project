/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  org.apache.ibatis.annotations.Mapper
 *  org.apache.ibatis.annotations.Param
 */
package com.una.embyhub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.embyhub.model.dto.response.pointsrecord.PointsRecordResponse;
import com.una.embyhub.model.entity.PointsRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointsRecordMapper
extends BaseMapper<PointsRecord> {
    public Page<PointsRecordResponse> selectPageWithUserInfo(Page<PointsRecordResponse> var1, @Param(value="userId") Long var2, @Param(value="username") String var3, @Param(value="recordType") String var4);
}
