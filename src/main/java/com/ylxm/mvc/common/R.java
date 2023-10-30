package com.ylxm.mvc.common;

import lombok.Data;

import java.io.Serializable;


@Data
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private T data;

    private String msg;


    public static <T> R<T> success(T data){
        R<T> r = new R<>();
        r.code = 1;
        r.data = data;
        r.msg = "请求成功";
        return r;
    }

    public static <T> R<T> success(String msg){
        R<T> r = new R<>();
        r.code = 1;
        r.data = null;
        r.msg = msg;
        return r;
    }


    public static <T> R<T> error(String msg){
        R<T> r = new R<>();
        r.data = null;
        r.code = 0;
        r.msg = msg;
        return r;
    }
}
