package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.Item;

public interface ItemMapper {
	void insertItem(Item item);
  List<Item> selectAllItem();
  Item selectItem(String name);
  
  Item selectItemByName(String name);
  void updateItem(Item item);
  void deleteItemByName(String name);
  

}
