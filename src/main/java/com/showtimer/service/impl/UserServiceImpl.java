package com.showtimer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showtimer.mapper.UserMapper;
import com.showtimer.mapper.model.AdminUser;
import com.showtimer.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService{

	/**
	 * 自动注入
	 */
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public AdminUser selectUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public List<AdminUser> selectByUser() {
		return userMapper.selectByUser();
	}

	/**
	 * 通过用户名查询用户
	 */
	@Override
	public AdminUser selectUserByUserName(String userName) {
		return userMapper.selectUserByUserName(userName);
	}

}
