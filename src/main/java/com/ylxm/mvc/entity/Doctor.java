package com.ylxm.mvc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lhlog351X
 * com.ylxm.mvc.entity
 * 2023/10/24 18:41
 */


@Data
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String name;

    private String subject;

}
