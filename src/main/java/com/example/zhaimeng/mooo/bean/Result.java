package com.example.zhaimeng.mooo.bean;

/**
 * Created by zhaimeng on 2016/1/27.
 * 从服务器返回的结果信息
 */
public class Result {
    private int code;
    private String text;

    public String getText() {
        return text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setText(String text) {
        this.text = text;
    }
}
