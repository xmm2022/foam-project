/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.config.common.exception;

import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import lombok.Generated;

public class BizException
extends RuntimeException {
    private Integer code;

    public BizException() {
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(ResponseStatusEnum responseStatusEnum) {
        super(responseStatusEnum.getMsg());
        this.code = responseStatusEnum.getCode();
    }

    @Generated
    public Integer getCode() {
        return this.code;
    }

    @Generated
    public void setCode(Integer code) {
        this.code = code;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BizException)) {
            return false;
        }
        BizException other = (BizException)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$code = this.getCode();
        Integer other$code = other.getCode();
        return !(this$code == null ? other$code != null : !((Object)this$code).equals(other$code));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof BizException;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : ((Object)$code).hashCode());
        return result;
    }

    @Override
    @Generated
    public String toString() {
        return "BizException(code=" + this.getCode() + ")";
    }
}
