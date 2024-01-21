package com.crazy.rain.common;

public enum ResultCode {
    SUCCESS(200, "成功"),
    FAIL(5001, "失败")
    ;

    private Integer code;

    private String message;

    private ResultCode() {

    }

    private ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
