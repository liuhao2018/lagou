package com.liuhao.lagou.mapper;

import com.liuhao.lagou.model.Item;
import com.liuhao.lagou.model.Job;
import com.liuhao.lagou.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemMapper {

    @Insert("insert into item (job,company,education,describe_info,require_info,salary,create_by) values (#{job},#{company},#{education},#{describe_info},#{require_info},#{salary},#{create_by})")
    void addItem(Item item);

    @Delete("delete from item where id = #{id}")
    void delete(long id);


    @Update("update item set education = #{education},describe_info = #{describe_info},require_info = #{require_info},salary = #{salary}")
    void update(Item item);


    @Select("select id,job,company,education,describe_info,require_info,salary,create_by from item")
    List<Item> findAll();

    @Select("select id,job,company,education,describe_info,require_info,salary,create_by from item where create = #{id}")
    List<Item> findByCreator(long id);


    @Select("select id,job,company,education,describe_info,require_info,salary,create_by from item where id = #{id} ")
    Item findById(long id);

}
