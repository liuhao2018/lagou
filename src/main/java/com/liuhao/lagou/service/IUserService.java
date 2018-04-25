package com.liuhao.lagou.service;

import com.liuhao.lagou.model.User;

public interface IUserService {
    void register(User user);
    User login(User user);
    User refreshToken(User user);
}
