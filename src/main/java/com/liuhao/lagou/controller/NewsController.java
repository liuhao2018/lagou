package com.liuhao.lagou.controller;

import com.liuhao.lagou.model.CommonAPIResponse;
import com.liuhao.lagou.model.News;
import com.liuhao.lagou.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/news")
@RestController
public class NewsController {

    @Autowired
    private INewsService newsService;

    @PostMapping("/")
    public CommonAPIResponse addOne(@RequestBody News news) {
        CommonAPIResponse response = new CommonAPIResponse();
        int result = newsService.addOne(news);
        if (result > 0 ) {
            return response;
        }
        response.setCode(400);
        response.setMessage("新增头条失败");
        return response;
    }

    @GetMapping("/")
    public CommonAPIResponse<List<News>> findAll() {
        CommonAPIResponse<List<News>> response = new CommonAPIResponse<>();
        response.setData(newsService.findAll());
        return response;
    }

}
