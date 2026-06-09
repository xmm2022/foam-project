/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.stp.StpUtil
 *  com.baomidou.mybatisplus.core.handlers.MetaObjectHandler
 *  lombok.Generated
 *  org.apache.ibatis.reflection.MetaObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.handler;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.una.embyhub.model.entity.EmbyUser;
import java.util.Date;
import lombok.Generated;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyMetaObjectHandler
implements MetaObjectHandler {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    public void insertFill(MetaObject metaObject) {
        try {
            EmbyUser embyUser = (EmbyUser)StpUtil.getSession().get("user");
            this.strictInsertFill(metaObject, "createUserId", Long.class, embyUser.getId());
            this.strictInsertFill(metaObject, "createUserName", String.class, embyUser.getEmbyUserName());
            this.strictInsertFill(metaObject, "createDatetime", Date.class, new Date());
        }
        catch (Exception e) {
            this.strictInsertFill(metaObject, "createUserId", Long.class, null);
            this.strictInsertFill(metaObject, "createUserName", String.class, "\u6e38\u5ba2\u4f7f\u7528\u5361\u5bc6\u6fc0\u6d3b");
            this.strictInsertFill(metaObject, "createDatetime", Date.class, new Date());
        }
    }

    public void updateFill(MetaObject metaObject) {
        try {
            EmbyUser embyUser = (EmbyUser)StpUtil.getSession().get("user");
            this.strictUpdateFill(metaObject, "updateUserName", String.class, embyUser.getEmbyUserName());
            this.strictUpdateFill(metaObject, "updateUserId", Long.class, embyUser.getId());
            this.strictUpdateFill(metaObject, "updateDatetime", Date.class, new Date());
        }
        catch (Exception e) {
            this.strictUpdateFill(metaObject, "updateUserName", String.class, "\u6e38\u5ba2\u4f7f\u7528\u5361\u5bc6\u6fc0\u6d3b");
            this.strictUpdateFill(metaObject, "updateUserId", Long.class, null);
            this.strictUpdateFill(metaObject, "updateDatetime", Date.class, new Date());
        }
    }
}
