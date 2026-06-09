/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.dev33.satoken.stp.StpInterface
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.handler;

import cn.dev33.satoken.stp.StpInterface;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.service.EmbyUserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StpInterfaceImpl
implements StpInterface {
    @Autowired
    private EmbyUserService embyUserService;

    public List<String> getPermissionList(Object loginId, String loginType) {
        ArrayList<String> list = new ArrayList<String>();
        EmbyUser embyUser = (EmbyUser)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)new LambdaQueryChainWrapper(this.embyUserService.getBaseMapper()).eq(EmbyUser::getId, loginId)).eq(EmbyUser::getUserStatus, (Object)0)).eq(EmbyUser::getIsAdmin, (Object)1)).one();
        if (embyUser != null) {
            list.add("admin");
            return list;
        }
        return list;
    }

    public List<String> getRoleList(Object loginId, String loginType) {
        return new ArrayList<String>();
    }
}
