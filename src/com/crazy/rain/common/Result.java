package com.crazy.rain.common;

import java.io.Serializable;

import static com.crazy.rain.common.ResultCode.FAIL;
import static com.crazy.rain.common.ResultCode.SUCCESS;

/**
 * @ClassName: Result
 * @Description: result
 * @author: CrazyRain
 * @date: 2024/1/21 15:30
 */

public class Result<T> implements Serializable {
    private Integer code;
    private String message;

    private T data;

    public Result() {
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> fail(T data) {
        return new Result<>(FAIL.getCode(), FAIL.getMessage(), data);
    }

    public static <T> Result<T> fail() {
        return fail(null);
    }


    public static <T> Result<T> success(Integer code, String message, T data) {
        return new Result<>(code, message, data);
    }

    public static <T> Result<T> fail(Integer code, String message, T data) {
        return new Result<>(code, message, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
