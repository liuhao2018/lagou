package com.liuhao.lagou.mapper;

import com.liuhao.lagou.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Insert("insert into user (mobile,password) values (#{mobile},#{password})")
    void register(User user);
    @Select("select * from user where mobile = #{mobile} and password = #{password}")
    User login(User user);
    @Update("update user set token = #{token} where mobile = #{mobile}")
    void refreshToken(User user);

    @Update("update user set password = #{password} where token = #{token}")
    void resetPassword(User user);

    @Update("update user set name = #{name},sex = #{sex},city = #{city}, job = #{job} where token = #{token}")
    void updateUserName(User user);

    @Select("select * from user where id = #{id}")
    User view(User user);

    @Update("update user set super = 1 where token = #{token}")
    void applyForSuper(User user);
}
