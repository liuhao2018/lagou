package com.liuhao.lagou.model;

public class CommonAPIResponse<T> {
    private int code = 200;
    private String message = "操作成功";
    private T data;

    public CommonAPIResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
