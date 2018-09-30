package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.Users;

public interface UsersMapper {
	
	void insertUser(Users emp);
	
	List<Users> selectAllUsers();

	Users selectUsers(String id);
}
