package com.cxb.bgz.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (SongType)实体类
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
@Data
public class SongType implements Serializable {
    private static final long serialVersionUID = 717889536759233246L;
    /**
    * 歌曲类别id
    */
    private Integer id;
    /**
    * 歌曲类别
    */
    private String typeName;
    /**
    * 类型描述
    */
    private String des;

}
