package com.liuhao.lagou.controller;

import com.liuhao.lagou.model.CommonAPIResponse;
import com.liuhao.lagou.model.Item;
import com.liuhao.lagou.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/item")
@RestController
public class ItemController {

    @Autowired
    private IItemService itemService;

    @PostMapping("/")
    public CommonAPIResponse addItem(@RequestBody Item item) {
        itemService.addItem(item);
        return new CommonAPIResponse();
    }

    @GetMapping("/{id}")
    public CommonAPIResponse<Item> findById(@PathVariable long id) {
        Item item = itemService.findById(id);
        CommonAPIResponse<Item> response = new CommonAPIResponse<>();
        response.setData(item);
        return response;
    }

    @GetMapping("/")
    public CommonAPIResponse<List<Item>> findAll() {
        List<Item> items = itemService.findAll();
        CommonAPIResponse<List<Item>> response = new CommonAPIResponse<>();
        response.setData(items);
        return response;
    }

    @DeleteMapping("/")
    public CommonAPIResponse deleteById(@RequestParam("user_id") long user_id,@RequestParam("item_id") long item_id) {
        boolean result = itemService.deleteItem(user_id,item_id);
        CommonAPIResponse response = new CommonAPIResponse();
        if (result) {
            return response;
        }
        response.setCode(400);
        response.setMessage("您没有权限删除，因为不是您本人创建的");
        return response;
    }

}
