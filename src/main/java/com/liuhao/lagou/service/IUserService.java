package com.liuhao.lagou.service;

import com.liuhao.lagou.model.User;

public interface IUserService {
    int register(User user);
    User login(User user);
    int refreshToken(String mobile);

    int resetPassword(User user);
    int updateUserInfo(User user);
    User view(long id);
    int applyForSuper(long id);
}
