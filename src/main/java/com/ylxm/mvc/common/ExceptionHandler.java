package com.ylxm.mvc.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(RException.class)
    public R RExceptionHandler(Exception e){
        log.error("系统异常信息：{}",e.getMessage());
        return R.error(e.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalStateException.class)
    public void TokenExceptionHandler(Exception e){
        log.error("token已过期：{}",e.getMessage());
    }

}
