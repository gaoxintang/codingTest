package com.bjsxt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.Item;
import com.bjsxt.service.ItemService;


@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	/**
	 * 页面跳转
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	

	@RequestMapping("/addItem")
	public String addItem(Item item){
		this.itemService.addItem(item);
		System.out.println(1234);
		System.out.println(5252);
		return "ok";
		
	}
	/**
	 * 检索所有用户
	 */
	@RequestMapping("/selectAllItem")
	public String selectAllItem(Model model){
		
		List<Item> result = this.itemService.allItem();
		model.addAttribute("allItem", result);
		return "allItem";
	}
	
	/**
	 * 更新用户
	 */
	@RequestMapping("/updateItemById")
	public String selectUser(Model model,String id){
		
		
		return "allItem";
	}
	@RequestMapping("/findItemByName")
	public String findItemByName(String name,Model model) {
		Item item =this.itemService.findItemByName(name);
		model.addAttribute("item",item);
		return "updateItem";
	}
	/*
	 * 
	 */
	@RequestMapping("/updateItem")
	public String updateItem(Item item,Model model){
		this.itemService.updateItem(item);
		List<Item> result = this.itemService.allItem();
		model.addAttribute("allItem", result);
		return "allItem";
		
	}
	@RequestMapping("/deleteItem")
	public String deleteItem(String name) {
		this.itemService.deleteItemByName(name);
		return "redirect:/item/selectAllItem";
	}
	
}
