package com.cxb.bgz.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -91816027214892382L;

    private Integer id;
    /**
    * 用户名称
    */
    private String userName;
    /**
    * 密码
    */
    private String password;
    /**
    * 用户全限(0管理员/1普通用户)
    */
    private Integer isAdmin;
    /**
    *  邮箱
    */
    private String email;
    /**
    * 个人签名
    */
    private String sign;
    /**
    * 头像地址
    */
    private String headPic;
    /**
    * 注册时间
    */
    private Date regTime;
    /**
    * 用户状态 默认0
        0未激活状态（需要邮箱激活）
        1激活状态
        2注销状态（账号废弃）
    */
    private Object userState;

}
