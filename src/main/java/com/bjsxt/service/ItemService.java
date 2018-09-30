package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Item;



public interface ItemService {
	void addItem(Item item);
	List<Item> allItem();
	Item selectItem(String name);
	Item findItemByName(String name);
	void updateItem(Item item);
	 void deleteItemByName(String name);
}
