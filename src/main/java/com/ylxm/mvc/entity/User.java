package com.ylxm.mvc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lhlog351X
 * com.ylxm.mvc.entity
 * 2023/10/29 23:55
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String account;

    private String password;

}
