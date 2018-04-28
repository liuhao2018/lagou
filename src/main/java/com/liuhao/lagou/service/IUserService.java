package com.liuhao.lagou.service;

import com.liuhao.lagou.model.User;

public interface IUserService {
    int register(String mobile,String password);
    User login(User user);
    int refreshToken(String mobile);

    int resetPassword(long id,String password);
    int updateUserInfo(User user);
    User view(long id);
    int applyForSuper(long id);
}
