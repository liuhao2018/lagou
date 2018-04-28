package com.liuhao.lagou.service.impl;

import com.liuhao.lagou.mapper.UserMapper;
import com.liuhao.lagou.model.User;
import com.liuhao.lagou.service.IUserService;
import com.liuhao.lagou.util.MD5Util;
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
    public int register(String mobile,String password) {
        return userMapper.register(mobile, MD5Util.MD5Encode(password,"UTF-8"));
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
    public int resetPassword(long id,String password) {
        return userMapper.resetPassword(id,MD5Util.MD5Encode(password,"UTF-8"));
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
