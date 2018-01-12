package com.showtimer.mapper;

import java.util.List;

import com.showtimer.mapper.model.AdminUser;


public interface UserMapper {

	AdminUser selectUserById(Integer id);
	
	List<AdminUser> selectByUser();

	AdminUser selectUserByUserName(String userName);
}
