package com.liuhao.lagou.service.impl;

import com.liuhao.lagou.mapper.NewsMapper;
import com.liuhao.lagou.model.News;
import com.liuhao.lagou.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public int addOne(News news) {
        return newsMapper.addOne(news);
    }

    @Override
    public List<News> findAll() {
        return newsMapper.findAll();
    }
}
