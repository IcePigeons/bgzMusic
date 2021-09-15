package com.cxb.bgz.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Singer)实体类
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
@Data
public class Singer implements Serializable {
    private static final long serialVersionUID = -20420163619541136L;

    private Integer id;
    /**
    * 歌手名称
    */
    private String singerName;
    /**
    * 歌手信息
    */
    private String singerInfo;
    /**
    * 出生日期
    */
    private Date birthday;
    /**
    * 性别(0男1女)
    */
    private Integer singerSex;
    /**
    * 歌手百度百科
    */
    private String singerUrl;
}
