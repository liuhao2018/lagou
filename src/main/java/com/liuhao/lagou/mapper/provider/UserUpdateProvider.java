package com.liuhao.lagou.mapper.provider;

import com.liuhao.lagou.model.User;
import com.liuhao.lagou.util.TextUtil;
import org.apache.ibatis.jdbc.SQL;

public class UserUpdateProvider {

    public String update(final User user) {
        return new SQL(){
            {
                UPDATE("user");
                if (!TextUtil.isEmpty(user.getName())) {
                    SET("name = #{name}");
                }

                if (TextUtil.isEmpty(user.getResume())) {
                    SET("resume = #{resume}");
                }

                if (user.getCity() != 0 ) {
                    SET("city = #{city}");
                }

                if (user.getJob() != 0 ) {
                    SET("job = #{job}");
                }

                if (user.getSex() != 0 ) {
                    SET("sex = #{sex}");
                }

                if (user.getEducation() != 0 ) {
                    SET("education = #{education}");
                }
            }
        }.toString();
    }


}
