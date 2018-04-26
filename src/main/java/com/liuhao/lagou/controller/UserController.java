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

    @PostMapping("/reset-password")
    public CommonAPIResponse resetPassword(@RequestBody User user) {
        userService.resetPassword(user);
        return new CommonAPIResponse();
    }

    @PostMapping("/update")
    public CommonAPIResponse updateUserName(@RequestBody User user) {
        userService.updateUserName(user);
        return new CommonAPIResponse();
    }

    @GetMapping("/{id}")
    public CommonAPIResponse<User> view(@PathVariable long id) {
        User user = userService.view(new User(id));
        CommonAPIResponse<User> response = new CommonAPIResponse<>();
        response.setData(user);
        return response;
    }

    @PostMapping("/apply-for-super")
    public CommonAPIResponse applyForSuper(@RequestBody User user) {
        userService.applyForSuper(user);
        return new CommonAPIResponse();
    }

}
