package com.fourdkelvin.framework.utils;

/**
 * 枚举了一些常用API操作码
 *
 * @author JameWen
 * @date 2020/6/05
 */
public enum ResultCode implements IErrorCode {
    //-------------------------------- 2000*** 默认结果编码 ------------------------------
    SUCCESS(200, "操作成功"),
    FAILED(200500, "操作失败"),
    UNAUTHORIZED(200710, "暂未登录或token已经过期"),
    FORBIDDEN(200711, "没有相关权限"),
    VALIDATE_FAILED(200712, "参数检验失败");


    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
