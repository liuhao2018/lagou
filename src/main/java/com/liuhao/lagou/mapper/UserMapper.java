package com.liuhao.lagou.mapper;

import com.liuhao.lagou.mapper.provider.UserUpdateProvider;
import com.liuhao.lagou.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Insert("insert into user (mobile,password) values (#{mobile},#{password})")
    int register(String mobile,String password);

    @Select("select * from user where mobile = #{mobile} and password = #{password}")
    User login(User user);

    @Update("update user set token = #{token} where mobile = #{mobile}")
    int refreshToken(String mobile,String token);

    @Update("update user set password = #{password} where id = #{id}")
    int resetPassword(long id,String password);

    @Select("select * from user where id = #{id}")
    User view(long id);

    @Update("update user set super = 1 where id = #{id}")
    int applyForSuper(long id);

    @UpdateProvider(type = UserUpdateProvider.class,method = "update")
    int updateUserInfo(User user);
}
