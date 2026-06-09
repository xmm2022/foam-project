/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.mapper.BaseMapper
 *  org.apache.ibatis.annotations.Select
 */
package com.una.embyhub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.una.embyhub.model.dto.response.embynotifydatadetails.EmbyNotifyDataDetailsResponseData;
import com.una.embyhub.model.entity.EmbyNotifyDataDetails;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface EmbyNotifyDataDetailsMapper
extends BaseMapper<EmbyNotifyDataDetails> {
    @Select(value={"SELECT     endd.emby_notify_data_id as embyNotifyDataId,     endd.emby_info_id as embyInfoId,     SUBSTRING_INDEX(GROUP_CONCAT(endd.id ORDER BY endd.id ASC SEPARATOR ','), ',', 30) AS idList,     SUBSTRING_INDEX(GROUP_CONCAT(endd.episode_details ORDER BY endd.id ASC SEPARATOR '\\n'), '\\n', 30) AS episodeList,     SUM(endd.size) AS totalSize,     count(endd.id) count FROM     `emby_notify_data_details` endd WHERE     endd.del_flag = 0     AND endd.status = 2 GROUP BY     endd.emby_notify_data_id, endd.emby_info_id LIMIT 5"})
    public List<EmbyNotifyDataDetailsResponseData> getEmbyNotifyDataDetails();
}
