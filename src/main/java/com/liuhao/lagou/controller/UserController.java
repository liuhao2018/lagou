package com.liuhao.lagou.controller;

import com.liuhao.lagou.model.CommonAPIResponse;
import com.liuhao.lagou.model.User;
import com.liuhao.lagou.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public CommonAPIResponse register(@RequestBody User user) {
        userService.register(user);
        return new CommonAPIResponse();
    }

    @PostMapping("/login")
    public CommonAPIResponse<User> login(@RequestBody User user) {
        User loginUser = userService.login(user);
        CommonAPIResponse<User> response = new CommonAPIResponse<>();
        response.setData(userService.refreshToken(loginUser));
        return response;
    }
}
