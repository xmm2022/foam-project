/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.baomidou.mybatisplus.extension.plugins.pagination.Page
 *  com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
 *  com.diboot.core.binding.QueryBuilder
 *  com.diboot.core.util.BeanUtils
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 */
package com.una.embyhub.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diboot.core.binding.QueryBuilder;
import com.diboot.core.util.BeanUtils;
import com.una.embyhub.config.common.MpConvert;
import com.una.embyhub.config.mybatis.MybatisPlusPage;
import com.una.embyhub.mapper.PointsBotRedeemConfigMapper;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotRedeemConfigRequest;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotRedeemConfigSave;
import com.una.embyhub.model.dto.request.pointsbot.PointsBotRedeemConfigUpdate;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotRedeemConfigResponse;
import com.una.embyhub.model.dto.response.pointsbot.PointsBotRedeemConfigStatsResponse;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.PointsBotRedeemConfig;
import com.una.embyhub.service.PointsBotRedeemConfigService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor={Exception.class})
public class PointsBotRedeemConfigServiceImpl
extends ServiceImpl<PointsBotRedeemConfigMapper, PointsBotRedeemConfig>
implements PointsBotRedeemConfigService {
    @Override
    public Page<PointsBotRedeemConfigResponse> select(MybatisPlusPage<PointsBotRedeemConfigRequest> page) {
        QueryWrapper queryWrapper = QueryBuilder.toQueryWrapper((Object)page.getObject());
        return MpConvert.page(queryWrapper, this.getBaseMapper(), PointsBotRedeemConfigResponse.class, page.getCurrent(), page.getSize(), page.getOrders());
    }

    @Override
    public void insertConfig(PointsBotRedeemConfigSave save) {
        PointsBotRedeemConfig config = (PointsBotRedeemConfig)BeanUtils.convert((Object)save, PointsBotRedeemConfig.class);
        this.save(config);
    }

    @Override
    public void updateConfig(PointsBotRedeemConfigUpdate update) {
        PointsBotRedeemConfig config = (PointsBotRedeemConfig)BeanUtils.convert((Object)update, PointsBotRedeemConfig.class);
        this.updateById(config);
    }

    @Override
    public void deleteByConfigId(Long configId) {
        this.removeById(configId);
    }

    @Override
    public PointsBotRedeemConfig findEnabledConfig() {
        return (PointsBotRedeemConfig)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.lambdaQuery().eq(PointsBotRedeemConfig::getEnabled, (Object)1)).eq(BaseEntity::getDelFlag, (Object)0)).orderByDesc(PointsBotRedeemConfig::getSort)).orderByDesc(PointsBotRedeemConfig::getId)).last("limit 1")).one();
    }

    @Override
    public PointsBotRedeemConfigStatsResponse getStats() {
        PointsBotRedeemConfigStatsResponse stats = new PointsBotRedeemConfigStatsResponse();
        List allConfigs = ((LambdaQueryChainWrapper)this.lambdaQuery().eq(BaseEntity::getDelFlag, (Object)0)).list();
        stats.setTotalConfigs(Long.valueOf(allConfigs.size()));
        long enabledConfigs = allConfigs.stream().filter(config -> config.getEnabled() != null && config.getEnabled() == 1).count();
        stats.setEnabledConfigs(enabledConfigs);
        stats.setDisabledConfigs(stats.getTotalConfigs() - enabledConfigs);
        Map<Long, Long> configsByServer = allConfigs.stream().filter(config -> config.getEmbyInfoId() != null).collect(Collectors.groupingBy(PointsBotRedeemConfig::getEmbyInfoId, Collectors.counting()));
        stats.setConfigsByServer(configsByServer);
        return stats;
    }
}