package com.liuhao.lagou.service;

import com.liuhao.lagou.mapper.ItemMapper;
import com.liuhao.lagou.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ItemServiceImpl implements IItemService{

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public void addItem(Item item) {
        itemMapper.addItem(item);
    }

    @Override
    public boolean deleteItem(long user_id,long item_id) {
        Item item = itemMapper.findById(item_id);
        if (item.getCreate_by() == user_id) {
            itemMapper.delete(item_id);
            return true;
        }
        return false;
    }

    @Override
    public void updateItem() {

    }

    @Override
    public Item findById(long id) {
        return itemMapper.findById(id);
    }

    @Override
    public List<Item> findAll() {
        return itemMapper.findAll();
    }

    @Override
    public List<Item> findByCreator(long creatorId) {
        return itemMapper.findByCreator(creatorId);
    }
}
