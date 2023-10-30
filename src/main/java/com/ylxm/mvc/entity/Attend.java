package com.ylxm.mvc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lhlog351X
 * com.ylxm.mvc.entity
 * 2023/10/31 0:11
 */
@Data
public class Attend implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private long docId;

    private long subId;

    private String name;

    private Integer slice;

    private Integer week;
}
