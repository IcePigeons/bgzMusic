package com.cxb.bgz.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Song)实体类
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
@Data
public class Song implements Serializable {
    private static final long serialVersionUID = -17501185747931729L;
    /**
    * 歌曲id
    */
    private Integer id;
    /**
    * 歌曲名称
    */
    private String songName;
    /**
    * 歌曲路径
    */
    private String path;
    /**
    * 歌曲图片路径
    */
    private String image;
    /**
    * 歌词
    */
    private String lyric;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 播放次数
    */
    private Integer playCount;
    /**
    * 歌手id外键(初始化是0[无歌手]，由后台配置)
    */
    private Integer singerId;
    /**
    * 歌曲类型外键(初始化是0[无类型]，由后台配置)
    */
    private Integer typeId;

}
