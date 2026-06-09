/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
 *  com.diboot.core.util.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 */
package com.una.embyhub.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diboot.core.util.BeanUtils;
import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.mapper.NotifyChannelMapper;
import com.una.embyhub.model.dto.request.notifychannel.NotifyChannelSave;
import com.una.embyhub.model.dto.request.notifychannel.NotifyChannelUpdate;
import com.una.embyhub.model.dto.response.notifychannel.NotifyChannelResponse;
import com.una.embyhub.model.entity.NotifyChannel;
import com.una.embyhub.service.NotifyChannelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor={Exception.class})
public class NotifyChannelServiceImpl
extends ServiceImpl<NotifyChannelMapper, NotifyChannel>
implements NotifyChannelService {
    @Autowired
    private NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;

    @Override
    public List<NotifyChannelResponse> select() {
        List notifyChannelResponseList = BeanUtils.convertList((List)this.list(), NotifyChannelResponse.class);
        return notifyChannelResponseList;
    }

    @Override
    public void add(NotifyChannelSave notifyChannelSave) {
        Long count = ((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.getBaseMapper()).eq(NotifyChannel::getIconType, (Object)notifyChannelSave.getIconType())).count();
        if (count > 0L) {
            throw new BizException(ResponseStatusEnum.NOTIFY_CHANNEL_ICON_TYPE_EXIST);
        }
        NotifyChannel notifyChannel = (NotifyChannel)BeanUtils.convert((Object)notifyChannelSave, NotifyChannel.class);
        notifyChannel.setParams(JSONObject.toJSONString((Object)JSONObject.parseObject((String)notifyChannel.getParams()), (JSONWriter.Feature[])new JSONWriter.Feature[0]));
        this.save(notifyChannel);
        this.notifyChannelCacheLoaderUtils.loadConfigCache();
    }

    @Override
    public void update(NotifyChannelUpdate notifyChannelUpdate) {
        Long count = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.getBaseMapper()).eq(NotifyChannel::getIconType, (Object)notifyChannelUpdate.getIconType())).ne(NotifyChannel::getId, (Object)notifyChannelUpdate.getId())).count();
        if (count > 0L) {
            throw new BizException(ResponseStatusEnum.NOTIFY_CHANNEL_ICON_TYPE_EXIST);
        }
        NotifyChannel notifyChannel = (NotifyChannel)BeanUtils.convert((Object)notifyChannelUpdate, NotifyChannel.class);
        notifyChannel.setParams(JSONObject.toJSONString((Object)JSONObject.parseObject((String)notifyChannel.getParams()), (JSONWriter.Feature[])new JSONWriter.Feature[0]));
        this.updateById(notifyChannel);
        this.notifyChannelCacheLoaderUtils.loadConfigCache();
    }

    @Override
    public void delete(Long id) {
        this.removeById(id);
        this.notifyChannelCacheLoaderUtils.loadConfigCache();
    }
}