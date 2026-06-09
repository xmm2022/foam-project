/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONArray
 *  com.baomidou.mybatisplus.core.metadata.OrderItem
 *  com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.mybatis;

import com.alibaba.fastjson2.JSONArray;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.springframework.util.StringUtils;

public class MybatisPlusPage<T>
implements Serializable {
    @NotNull(message="\u5206\u9875\u8bf7\u6c42\u683c\u5f0f\u6709\u8bef\uff0c\u6570\u636e\u5bf9\u8c61object\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotNull(message="\u5206\u9875\u8bf7\u6c42\u683c\u5f0f\u6709\u8bef\uff0c\u6570\u636e\u5bf9\u8c61object\u4e0d\u80fd\u4e3a\u7a7a") T object;
    private long size = 10L;
    private long current = 1L;
    private List<OrderItem> orders = new ArrayList<OrderItem>();
    private String ordersList;

    public <R> PageDTO<R> getPageDto(Class<R> entityClass) {
        PageDTO pageDTO = new PageDTO(this.current, this.size);
        if (StringUtils.hasText((String)this.ordersList)) {
            this.orders = JSONArray.parseArray((String)this.ordersList, OrderItem.class);
        }
        pageDTO.setOrders(this.orders);
        return pageDTO;
    }

    @Generated
    public MybatisPlusPage() {
    }

    @Generated
    public T getObject() {
        return this.object;
    }

    @Generated
    public long getSize() {
        return this.size;
    }

    @Generated
    public long getCurrent() {
        return this.current;
    }

    @Generated
    public List<OrderItem> getOrders() {
        return this.orders;
    }

    @Generated
    public String getOrdersList() {
        return this.ordersList;
    }

    @Generated
    public void setObject(T object) {
        this.object = object;
    }

    @Generated
    public void setSize(long size) {
        this.size = size;
    }

    @Generated
    public void setCurrent(long current) {
        this.current = current;
    }

    @Generated
    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    @Generated
    public void setOrdersList(String ordersList) {
        this.ordersList = ordersList;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MybatisPlusPage)) {
            return false;
        }
        MybatisPlusPage other = (MybatisPlusPage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getSize() != other.getSize()) {
            return false;
        }
        if (this.getCurrent() != other.getCurrent()) {
            return false;
        }
        T this$object = this.getObject();
        T other$object = other.getObject();
        if (this$object == null ? other$object != null : !this$object.equals(other$object)) {
            return false;
        }
        List<OrderItem> this$orders = this.getOrders();
        List<OrderItem> other$orders = other.getOrders();
        if (this$orders == null ? other$orders != null : !((Object)this$orders).equals(other$orders)) {
            return false;
        }
        String this$ordersList = this.getOrdersList();
        String other$ordersList = other.getOrdersList();
        return !(this$ordersList == null ? other$ordersList != null : !this$ordersList.equals(other$ordersList));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MybatisPlusPage;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $size = this.getSize();
        result = result * 59 + (int)($size >>> 32 ^ $size);
        long $current = this.getCurrent();
        result = result * 59 + (int)($current >>> 32 ^ $current);
        T $object = this.getObject();
        result = result * 59 + ($object == null ? 43 : $object.hashCode());
        List<OrderItem> $orders = this.getOrders();
        result = result * 59 + ($orders == null ? 43 : ((Object)$orders).hashCode());
        String $ordersList = this.getOrdersList();
        result = result * 59 + ($ordersList == null ? 43 : $ordersList.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MybatisPlusPage(object=" + String.valueOf(this.getObject()) + ", size=" + this.getSize() + ", current=" + this.getCurrent() + ", orders=" + String.valueOf(this.getOrders()) + ", ordersList=" + this.getOrdersList() + ")";
    }
}
