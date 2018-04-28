package com.liuhao.lagou.service;

import com.liuhao.lagou.model.News;

import java.util.List;

public interface INewsService {

    int addOne(News news);
    List<News> findAll();

}
