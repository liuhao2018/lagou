package com.liuhao.lagou.mapper;

import com.liuhao.lagou.model.Company;
import com.liuhao.lagou.model.CompanyResponse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CompanyMapper {

    @Insert("insert into company (full_name,simple_name,phone,email,www,city,address,boss,employee_count,describe_info,finance_status,service) values (#{full_name},#{simple_name},#{phone},#{email},#{www},#{city},#{address},#{boss},#{employee_count},#{describe_info},#{finance_status},#{service})")
    int add(Company company);


    @Select("select id,full_name,simple_name,phone,email,www,address,employee_count,describe_info,finance_status,service from company")
    List<CompanyResponse> findAll();

}
