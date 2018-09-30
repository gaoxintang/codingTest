package com.bjsxt.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	/**
	 * 页面跳转
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(Users users){
		this.usersService.addUser(users);
		return "ok";
	}
	/**
	 * 检索所有用户
	 */
	@RequestMapping("/selectAllUsers")
	public String selectUser(Model model){
		
				
		
		List<Users> result = this.usersService.allUsers();
		model.addAttribute("allUser", result);
		return "allUsers";
	}
	
	/**
	 * 更新用户
	 */
	@RequestMapping("/updateUserById")
	public String selectUser(Model model,String id){
		
		
		return "allUsers";
	}
	
}
