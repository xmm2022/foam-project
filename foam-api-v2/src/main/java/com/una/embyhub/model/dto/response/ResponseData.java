/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response;

import com.una.embyhub.config.common.enums.ResponseStatusEnum;
import java.io.Serializable;
import lombok.Generated;

public class ResponseData<T>
implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public ResponseData() {
    }

    public ResponseData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseData(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private ResponseData(ResponseStatusEnum resultStatus, T data) {
        this.code = resultStatus.getCode();
        this.msg = resultStatus.getMsg();
        this.data = data;
    }

    public static ResponseData<Void> success() {
        return new ResponseData<Object>(ResponseStatusEnum.SUCCESS, null);
    }

    public static <T> ResponseData<T> success(T data) {
        return new ResponseData<T>(ResponseStatusEnum.SUCCESS, data);
    }

    public static <T> ResponseData<T> success(ResponseStatusEnum resultStatus, T data) {
        if (resultStatus == null) {
            return ResponseData.success(data);
        }
        return new ResponseData<T>(resultStatus, data);
    }

    public static <T> ResponseData<T> failure() {
        return new ResponseData<Object>(ResponseStatusEnum.SYSTEM_ERROR, null);
    }

    public static <T> ResponseData<T> failure(ResponseStatusEnum resultStatus) {
        return ResponseData.failure(resultStatus, null);
    }

    public static <T> ResponseData<T> failure(ResponseStatusEnum resultStatus, T data) {
        if (resultStatus == null) {
            return new ResponseData<Object>(ResponseStatusEnum.SYSTEM_ERROR, null);
        }
        return new ResponseData<T>(resultStatus, data);
    }

    public static <T> ResponseData<T> failure(Integer code, String msg) {
        return new ResponseData<T>(code, msg);
    }

    public static <T> ResponseData<T> failure(Integer code, String msg, T data) {
        return new ResponseData<T>(code, msg, data);
    }

    @Generated
    public Integer getCode() {
        return this.code;
    }

    @Generated
    public String getMsg() {
        return this.msg;
    }

    @Generated
    public T getData() {
        return this.data;
    }

    @Generated
    public void setCode(Integer code) {
        this.code = code;
    }

    @Generated
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Generated
    public void setData(T data) {
        this.data = data;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ResponseData)) {
            return false;
        }
        ResponseData other = (ResponseData)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$code = this.getCode();
        Integer other$code = other.getCode();
        if (this$code == null ? other$code != null : !((Object)this$code).equals(other$code)) {
            return false;
        }
        String this$msg = this.getMsg();
        String other$msg = other.getMsg();
        if (this$msg == null ? other$msg != null : !this$msg.equals(other$msg)) {
            return false;
        }
        T this$data = this.getData();
        T other$data = other.getData();
        return !(this$data == null ? other$data != null : !this$data.equals(other$data));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ResponseData;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : ((Object)$code).hashCode());
        String $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        T $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ResponseData(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + String.valueOf(this.getData()) + ")";
    }
}
