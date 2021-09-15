package com.cxb.bgz.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Collect)实体类
 *
 * @author makejava
 * @since 2021-09-15 17:29:42
 */
@Data
public class Collect implements Serializable {
    private static final long serialVersionUID = -97789321246095383L;

    private Integer id;

    private Integer userId;

    private Integer songId;


}
