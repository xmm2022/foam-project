/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.baomidou.mybatisplus.annotation.DbType
 *  com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
 *  com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor
 *  com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor
 *  com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor
 *  org.mybatis.spring.annotation.MapperScan
 *  org.springframework.context.annotation.Bean
 *  org.springframework.context.annotation.Configuration
 */
package com.una.embyhub.config.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value={"com.una.embyhub.mapper", "com.una.embyhub.movie.mapper"})
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor((InnerInterceptor)new OptimisticLockerInnerInterceptor());
        interceptor.addInnerInterceptor((InnerInterceptor)new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
