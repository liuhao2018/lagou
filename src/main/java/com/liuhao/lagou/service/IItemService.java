package com.liuhao.lagou.service;

import com.liuhao.lagou.model.Item;
import com.liuhao.lagou.model.ItemResponse;

import java.util.List;

public interface IItemService {
    int addItem(Item item);
    boolean deleteItem(long user_id,long item_id);
    void updateItem();

    Item findById(long id);
    List<ItemResponse> findAll();
    List<Item> findByCreator(long creatorId);
}
