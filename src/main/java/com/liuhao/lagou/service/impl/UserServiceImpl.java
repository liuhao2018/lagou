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
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public int refreshToken(String mobile) {
        return userMapper.refreshToken(mobile,TokenGenerateUtil.generate(mobile));
    }

    @Override
    public int resetPassword(User user) {
        return userMapper.resetPassword(user);
    }

    @Override
    public int updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }

    @Override
    public User view(long id) {
        return userMapper.view(id);
    }

    @Override
    public int applyForSuper(long id) {
        return userMapper.applyForSuper(id);
    }
}
