package com.liuhao.lagou.mapper;

import com.liuhao.lagou.model.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsMapper {

    @Insert("insert into news (title,author,type,img_url,news_url) values (#{title},#{author},#{type},#{img_url},#{news_url})")
    int addOne(News news);

    @Select("select news.id,news.title,news.author,news.news_url,news.type,news_type.type_name from news,news_type where news.type = news_type.id")
    public List<News> findAll();

}