package com.ylxm.mvc.common;


import lombok.Data;

@Data
public class RException extends RuntimeException {

    private String msg;

    private Integer code;

    public RException(String msg){
        super(msg);
        code = 0;
        this.msg = msg;
    }

}
