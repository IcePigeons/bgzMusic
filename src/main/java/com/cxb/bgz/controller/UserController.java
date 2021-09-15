package com.cxb.bgz.controller;

import com.cxb.bgz.common.Result;
import com.cxb.bgz.common.dto.LoginDto;
import com.cxb.bgz.common.dto.UserInfoDto;
import com.cxb.bgz.entity.User;
import com.cxb.bgz.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author 冰鸽子
 * @Date 2021/9/15 20:51
 */
@RestController
@RequestMapping("/user")
@Api(value = "/user",tags = "用户模块")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation("用户登录")
    @ApiResponse(responseCode = "200",description = "登录成功")
    @GetMapping("/login")
    public Result login(LoginDto loginDto){
        System.out.println(loginDto);
        //验证登录
        return Result.success(200,"登录成功",null);
    }

    @ApiOperation("用户注销")
    @ApiResponse(responseCode = "200",description = "登出成功")
    @GetMapping("/logout")
    public Result logout(){
        //security登出操作
        return Result.success(200,"登出成功",null);
    }

    @ApiOperation("用户注册")
    @ApiResponse(responseCode = "200",description = "注册成功")
    @PostMapping("/register")
    public Result register(LoginDto loginDto){
        User user = new User();
        user.setEmail(loginDto.getEmail());
        //密码加密再保存
        //user.setPassword(loginDto.getPassword());
        user.setUserName(loginDto.getUsername());
        userService.insert(user);
        //注册操作
        return Result.success(200,"注册成功",null);
    }

    @ApiOperation("用户信息更新")
    @ApiResponse(responseCode = "200",description = "更新成功")
    @PutMapping("/update")
    public Result update(UserInfoDto dto){
        User user = new User();
        user.setId(dto.getId());
        user.setEmail(dto.getEmail());
        user.setSign(dto.getSign());
        //获取头像并生成路径head_pic
        //user.setHeadPic();
        //生成加密密码保存
        //dto.getPassword();
        //user.setPassword();
        userService.update(user);
        return Result.success(200,"更新成功",null);
    }
}
