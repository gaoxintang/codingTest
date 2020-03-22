package com.jd.service;

import java.util.List;

import com.jd.pojo.Order;

public interface OrdersService {
	List<Order> selectAllOrders(Order order);
	
	void insertOrder(Order order);
	
}
