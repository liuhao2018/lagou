package com.liuhao.lagou.mapper;

import com.liuhao.lagou.model.Company;
import org.apache.ibatis.annotations.Insert;

public interface CompanyMapper {

    @Insert("insert into company (fullname,simple_name,phone，email,www,city,address,service) " +
            "values (#{full_name},#{simple_name},#{phone},#{email},#{www},#{city},#{address},#{service})")
    void add(Company company);

}
