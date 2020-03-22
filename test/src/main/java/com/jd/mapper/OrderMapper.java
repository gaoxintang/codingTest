package com.jd.mapper;

import java.util.List;

import com.jd.pojo.Order;

public interface OrderMapper {
	void addOrder(Order order);

	List<Order> selectAllOrders(Order order);

}
