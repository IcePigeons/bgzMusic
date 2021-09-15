package com.cxb.bgz.controller.admin;


import com.cxb.bgz.entity.User;
import com.cxb.bgz.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author cxb
 * @Date 2020/11/16 10:21
 */
@RestController
@RequestMapping("/admin/user")
@Api(value = "/admin/user",tags = "用户信息管理")
public class UserAdminController {
    @Resource
    private UserService userService;

    /**
     * 修改用户密码
     */
    @PostMapping("/modifyPassword")
    public String modifyPassword(@RequestParam("id")String id,
                                 @RequestParam("newPassword")String newPassword,
                                 HttpServletResponse response) throws Exception {
        return null;
    }

    /**
     * 用户退出
     */
    @GetMapping("/logout")
    public String logout(){
        return null;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询一个用户信息")
    @ApiResponses({@ApiResponse(responseCode = "200",description = "成功返回")})
    @GetMapping("selectOne")
    public User selectOne(@ApiParam("用户id") Integer id) {
        return this.userService.queryById(id);
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("/add")
    public String insert(User user){

        this.userService.insert(user);
        return null;
    }


    @PutMapping("/update")
    public String update(@RequestParam("registerTime")String regTime,
                         @RequestParam("headPicFile")MultipartFile headPic,
                         User user, HttpServletResponse response) throws Exception {

        return null;
    }

    @DeleteMapping ("/delete")
    public String delete(@RequestParam("strIds")String strIds, HttpServletResponse response) throws Exception {

        return null;
    }

}
