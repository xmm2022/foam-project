/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.date.DateUtil
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONObject
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.scheduling.annotation.EnableScheduling
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.job;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.service.EmbyUserService;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

@Configuration
@EnableScheduling
public class MonthlyRequestQuotaJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MonthlyRequestQuotaJob.class);
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;

    @Scheduled(cron="0 30 0 * * ?", zone="Asia/Shanghai")
    @ScheduledTaskMeta(name="\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u81ea\u52a8\u589e\u52a0", remark="\u6bcf\u6708\u81ea\u52a8\u4e3a\u672a\u7981\u7528\u4e14\u672a\u8fc7\u671f\u7684\u7528\u6237\u589e\u52a0\u6c42\u7247\u6b21\u6570")
    public void executeMonthlyRequestQuota() {
        int todayDay;
        JSONObject config;
        log.info("\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u68c0\u67e5\u4efb\u52a1\u5f00\u59cb\uff1a{}", (Object)DateUtil.formatDateTime((Date)new Date()));
        String configJson = this.configCacheLoaderUtils.getConfigValue("monthly_request_config");
        if (!StringUtils.hasText((String)configJson)) {
            log.debug("\u672a\u914d\u7f6e\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u81ea\u52a8\u589e\u52a0\uff0c\u8df3\u8fc7\u6267\u884c");
            return;
        }
        try {
            config = JSON.parseObject((String)configJson);
        }
        catch (Exception e) {
            log.error("\u89e3\u6790\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u914d\u7f6e\u5931\u8d25\uff1a{}", (Object)configJson, (Object)e);
            return;
        }
        Integer count = config.getInteger("count");
        Integer day = config.getInteger("day");
        String mode = config.getString("mode");
        if (count == null || count <= 0) {
            log.debug("\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u914d\u7f6e\u7684count\u65e0\u6548\uff0c\u8df3\u8fc7\u6267\u884c");
            return;
        }
        if (day == null || day < 1 || day > 28) {
            day = 1;
        }
        if (!StringUtils.hasText((String)mode)) {
            mode = "ADD";
        }
        if ((todayDay = LocalDate.now().getDayOfMonth()) != day) {
            log.debug("\u4eca\u5929({})\u4e0d\u662f\u914d\u7f6e\u7684\u6267\u884c\u65e5\u671f({})\uff0c\u8df3\u8fc7\u6267\u884c", (Object)todayDay, (Object)day);
            return;
        }
        log.info("\u5f00\u59cb\u6267\u884c\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u81ea\u52a8\u589e\u52a0\uff0c\u6a21\u5f0f\uff1a{}\uff0c\u6b21\u6570\uff1a{}", (Object)mode, (Object)count);
        List eligibleUsers = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getUserStatus, (Object)0)).ne(EmbyUser::getIsAdmin, (Object)1)).eq(BaseEntity::getDelFlag, (Object)0)).and(w -> ((LambdaQueryWrapper)((LambdaQueryWrapper)w.gt(EmbyUser::getExpirationDate, (Object)new Date())).or()).isNull(EmbyUser::getExpirationDate))).list();
        if (eligibleUsers.isEmpty()) {
            log.info("\u6ca1\u6709\u7b26\u5408\u6761\u4ef6\u7684\u7528\u6237\u9700\u8981\u589e\u52a0\u6c42\u7247\u6b21\u6570");
            return;
        }
        int successCount = 0;
        for (EmbyUser user : eligibleUsers) {
            try {
                int newCount;
                if ("RESET".equalsIgnoreCase(mode)) {
                    newCount = count;
                } else {
                    int currentCount = user.getRequestPackagesCount() != null ? user.getRequestPackagesCount() : 0;
                    newCount = currentCount + count;
                }
                ((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)new LambdaUpdateChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getId, (Object)user.getId())).set(EmbyUser::getRequestPackagesCount, (Object)newCount)).update();
                ++successCount;
                log.debug("\u7528\u6237 {} \u6c42\u7247\u6b21\u6570\u66f4\u65b0\uff1a{} -> {}", new Object[]{user.getEmbyUserName(), user.getRequestPackagesCount(), newCount});
            }
            catch (Exception e) {
                log.error("\u66f4\u65b0\u7528\u6237 {} \u6c42\u7247\u6b21\u6570\u5931\u8d25", (Object)user.getEmbyUserName(), (Object)e);
            }
        }
        log.info("\u6bcf\u6708\u6c42\u7247\u6b21\u6570\u81ea\u52a8\u589e\u52a0\u5b8c\u6210\uff0c\u5171\u5904\u7406 {} \u4e2a\u7528\u6237\uff0c\u6210\u529f {} \u4e2a", (Object)eligibleUsers.size(), (Object)successCount);
    }
}
