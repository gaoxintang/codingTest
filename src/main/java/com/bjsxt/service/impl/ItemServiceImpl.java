package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.mapper.ItemMapper;
import com.bjsxt.pojo.Item;
import com.bjsxt.service.ItemService;
@Service
@Transactional
public  class ItemServiceImpl implements ItemService{
	@Autowired 
	private ItemMapper itemMapper;
	
	@Override
	public void addItem(Item item){
		
		this.itemMapper.insertItem(item);
	}

	@Override
	public List<Item> allItem() {
		// TODO Auto-generated method stub
		return this.itemMapper.selectAllItem();
	}
	@Override
	public Item selectItem(String name) {;
	// TODO Auto-generated method stub
			return null;}
	@Override
	public Item  findItemByName(String name){
		return this.itemMapper.selectItemByName(name);
	}
	@Override
	public void updateItem(Item item){
		this.itemMapper.updateItem(item);
	}
	@Override
	public void deleteItemByName(String name){
		this.itemMapper.deleteItemByName(name);
	}
}





