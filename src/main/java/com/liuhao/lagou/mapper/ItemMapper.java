package com.liuhao.lagou.mapper;

import com.liuhao.lagou.model.Item;
import com.liuhao.lagou.model.ItemResponse;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemMapper {

    @Insert("insert into item (job,company,education,describe_info,require_info,salary,create_by) values (#{job},#{company},#{education},#{describe_info},#{require_info},#{salary},#{create_by})")
    int addItem(Item item);

    @Delete("delete from item where id = #{id}")
    void delete(long id);


    @Update("update item set education = #{education},describe_info = #{describe_info},require_info = #{require_info},salary = #{salary}")
    void update(Item item);


    @Select("SELECT item.id,company.full_name as company_name,company.address as company_address,job.`name` as job_name,education.`level` as edu_level,item.describe_info,item.require_info,`user`.`name` as create_name,item.salary FROM item,company,job,education,`user` WHERE item.company = company.id and item.job = job.id and item.education = education.id and item.create_by = `user`.id")
    List<ItemResponse> findAll();

    @Select("select id,job,company,education,describe_info,require_info,salary,create_by from item where create = #{id}")
    List<Item> findByCreator(long id);


    @Select("select id,job,company,education,describe_info,require_info,salary,create_by from item where id = #{id} ")
    Item findById(long id);

}
