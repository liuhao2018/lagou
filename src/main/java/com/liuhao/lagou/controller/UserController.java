package com.liuhao.lagou.controller;

import com.liuhao.lagou.model.CommonAPIResponse;
import com.liuhao.lagou.model.User;
import com.liuhao.lagou.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public CommonAPIResponse register(@RequestBody User user) {
        CommonAPIResponse response = new CommonAPIResponse();
        int result = userService.register(user);
        if (result > 0 ) {
            return response;
        }
        response.setCode(400);
        response.setMessage("注册失败");
        return response;
    }

    @PostMapping("/login")
    public CommonAPIResponse login(@RequestBody User user) {
        CommonAPIResponse response = new CommonAPIResponse();
        User loginUser = userService.login(user);
        if (loginUser == null ) {
            response.setCode(400);
            response.setMessage("登录失败，手机号或密码错误");
        }
        int result = userService.refreshToken(loginUser.getMobile());
        if (result > 0 ) {
            return response;
        }
        response.setData(400);
        response.setMessage("登录失败");
        return response;
    }

    @PostMapping("/reset-password")
    public CommonAPIResponse resetPassword(@RequestBody User user) {
        CommonAPIResponse response = new CommonAPIResponse();
        int result = userService.resetPassword(user);
        if (result > 0 ) {
            return response;
        }
        response.setCode(400);
        response.setMessage("修改密码失败");
        return response;
    }

    @PostMapping("/update")
    public CommonAPIResponse updateUserInfo(@RequestBody User user) {
        CommonAPIResponse response = new CommonAPIResponse();
        int result = userService.updateUserInfo(user);
        if (result > 0 ) {
            return response;
        }
        response.setCode(400);
        response.setMessage("更新用户信息失败");
        return response;
    }

    @GetMapping("/{id}")
    public CommonAPIResponse view(@PathVariable long id) {
        CommonAPIResponse response = new CommonAPIResponse<>();
        User user = userService.view(id);
        if (user != null) {
            response.setData(user);
            return response;
        }
        response.setCode(400);
        response.setMessage("查看用户信息失败");
        return response;
    }

    @PostMapping("/apply-for-super/{id}")
    public CommonAPIResponse applyForSuper(@PathVariable long id) {
        CommonAPIResponse response = new CommonAPIResponse();
        int result = userService.applyForSuper(id);
        if (result > 0 ) {
            return response;
        }
        response.setCode(400);
        response.setMessage("审核为公司招聘管理员失败");
        return response;
    }

}
