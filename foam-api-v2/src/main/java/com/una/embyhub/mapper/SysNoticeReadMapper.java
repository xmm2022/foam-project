/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  org.apache.ibatis.annotations.Insert
 *  org.apache.ibatis.annotations.Param
 */
package com.una.embyhub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.una.embyhub.model.entity.SysNoticeRead;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface SysNoticeReadMapper
extends BaseMapper<SysNoticeRead> {
    @Insert(value={"INSERT IGNORE INTO sys_notice_read (notice_id, user_id, read_datetime)\nVALUES (#{noticeId}, #{userId}, NOW())\n"})
    public int insertIgnore(@Param(value="noticeId") Long var1, @Param(value="userId") Long var2);
}
