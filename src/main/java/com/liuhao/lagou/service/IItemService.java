package com.liuhao.lagou.service;

import com.liuhao.lagou.model.Item;

import java.util.List;

public interface IItemService {
    void addItem(Item item);
    boolean deleteItem(long user_id,long item_id);
    void updateItem();

    Item findById(long id);
    List<Item> findAll();
    List<Item> findByCreator(long creatorId);
}
