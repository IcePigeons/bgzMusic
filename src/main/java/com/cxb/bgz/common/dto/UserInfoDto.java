package com.cxb.bgz.common.dto;

import lombok.Data;

/**
 * @Author 冰鸽子
 * @Date 2021/9/15 21:10
 * 用户信息数据对象
 */
@Data
public class UserInfoDto {
    private int id;
    private String password;
    private String email;
    private String sign;
    //
}
