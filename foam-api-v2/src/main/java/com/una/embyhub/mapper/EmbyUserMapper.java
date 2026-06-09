/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  org.apache.ibatis.annotations.Param
 *  org.apache.ibatis.annotations.Select
 */
package com.una.embyhub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.una.embyhub.model.dto.response.embyuser.EmbyServerUserStatsResponse;
import com.una.embyhub.model.entity.EmbyUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmbyUserMapper
extends BaseMapper<EmbyUser> {
    @Select(value={"SELECT * FROM emby_user WHERE emby_user_name = #{userName} LIMIT 1"})
    public EmbyUser selectByUserName(String var1);

    @Select(value={"SELECT\n    ei.id AS embyInfoId,\n    ei.server_name AS serverName,\n    COALESCE(COUNT(eu.id), 0) AS totalUserCount,\n    COALESCE(SUM(CASE WHEN eu.user_status = 0 THEN 1 ELSE 0 END), 0) AS activeUserCount,\n    COALESCE(SUM(CASE WHEN eu.user_status = 1 THEN 1 ELSE 0 END), 0) AS disabledUserCount,\n    COALESCE(SUM(CASE WHEN eu.create_datetime >= CURDATE() THEN 1 ELSE 0 END), 0) AS todayNewUserCount\nFROM emby_info ei\nLEFT JOIN emby_user eu ON ei.id = eu.emby_info_id AND eu.del_flag = 0\nWHERE ei.del_flag = 0\nGROUP BY ei.id, ei.server_name\nORDER BY ei.id\n"})
    public List<EmbyServerUserStatsResponse> selectServerUserStats();

    @Select(value={"<script>SELECT     ei.id AS embyInfoId,     ei.server_name AS serverName,     COALESCE(COUNT(eu.id), 0) AS totalUserCount,     COALESCE(SUM(CASE WHEN eu.user_status = 0 THEN 1 ELSE 0 END), 0) AS activeUserCount,     COALESCE(SUM(CASE WHEN eu.user_status = 1 THEN 1 ELSE 0 END), 0) AS disabledUserCount,     COALESCE(SUM(CASE WHEN eu.create_datetime &gt;= CURDATE() THEN 1 ELSE 0 END), 0) AS todayNewUserCount FROM emby_info ei LEFT JOIN emby_user eu ON ei.id = eu.emby_info_id AND eu.del_flag = 0     AND eu.id IN (SELECT ui.invitee_id FROM user_invitation ui         <if test='distributorId != null'>            WHERE ui.inviter_id = #{distributorId}        </if>    ) WHERE ei.del_flag = 0 GROUP BY ei.id, ei.server_name ORDER BY ei.id</script>"})
    public List<EmbyServerUserStatsResponse> selectServerUserStatsDistributor(@Param(value="distributorId") Long var1);
}
