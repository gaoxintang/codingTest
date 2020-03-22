package com.jd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.mapper.BoxMapper;
import com.jd.mapper.OrderMapper;
import com.jd.mapper.StationMapper;
import com.jd.pojo.Box;
import com.jd.pojo.Order;
import com.jd.pojo.Station;
import com.jd.service.OrdersService;
@Service
@Transactional
public  class OrdersServiceImpl implements OrdersService{
	@Autowired 
	private OrderMapper orderMapper;
	@Autowired 
	private BoxMapper boxMapper;
	@Autowired 
	private StationMapper stationMapper;

	@Override
	public List<Order> selectAllOrders(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.selectAllOrders(order);
	}

	@Override
	public void insertOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.addOrder(order);
		
		boxMapper.addBox(new Box("", order.getBoxNo()));
		
		stationMapper.addStation(new Station("", order.getStationNo()));
	}
	
}





