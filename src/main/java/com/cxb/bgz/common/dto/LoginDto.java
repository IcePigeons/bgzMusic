package com.cxb.bgz.common.dto;

import lombok.Data;

/**
 * @Author 冰鸽子
 * @Date 2021/9/15 20:56
 * 用户登录数据对象
 */
@Data
public class LoginDto {
    /**
     *用户名
     * */
    private String username;
    /**
     * 密码
     */
    private String password;

    private String email;
}
