package com.liuhao.lagou.service.impl;

import com.liuhao.lagou.mapper.UserMapper;
import com.liuhao.lagou.model.User;
import com.liuhao.lagou.service.IUserService;
import com.liuhao.lagou.util.TokenGenerateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        userMapper.register(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User refreshToken(User user) {
        user.setToken(TokenGenerateUtil.generate(user.getMobile()));
        userMapper.refreshToken(user);
        return user;
    }

    @Override
    public void resetPassword(User user) {
        userMapper.resetPassword(user);
    }

    @Override
    public void updateUserName(User user) {
        userMapper.updateUserName(user);
    }

    @Override
    public User view(User user) {
        return userMapper.view(user);
    }

    @Override
    public void applyForSuper(User user) {
        userMapper.applyForSuper(user);
    }
}