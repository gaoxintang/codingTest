package com.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.pojo.Order;
import com.jd.service.OrdersService;

@Controller
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrdersService orderService;
	
	/**
	 * 页面跳转
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page, Order order){
		order = new Order();
		return page;
	}
	
	/**
	 * 添加用户
	 */
	@RequestMapping("/addOrder")
	public String addOrder(@Validated Order order,Model model,BindingResult result){
		if(result.hasErrors()) {
			return "regist";
		}
		this.orderService.insertOrder(order);
		
		return selectAllOrders(model);
	}
	/**
	 * 检索所有用户
	 */
	@RequestMapping("/selectOrders")
	public String selectAllOrders(Model model){
		
		List<Order> result = this.orderService.selectAllOrders(new Order());
		model.addAttribute("allOrders", result);
		return "detail";
	}
	
	/**
	 * 检索所有用户
	 */
	@RequestMapping("/selectOrderByCondition")
	@ResponseBody
	public List<Order> selectOrders(@RequestBody Order order){
		return this.orderService.selectAllOrders(order);
	}
	
	/**
	 * 更新用户
	 */
	@RequestMapping("/updateUserById")
	public String selectUser(Model model,String id){
		return "allUsers";
	}
	
}
