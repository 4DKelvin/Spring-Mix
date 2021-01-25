package com.fourdkelvin.framework.utils;

/**
 * 封装API的错误码
 *
 * @author JameWen
 * @date 2020/6/05
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
