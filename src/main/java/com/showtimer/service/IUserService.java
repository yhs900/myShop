package com.showtimer.service;

import java.util.List;

import com.showtimer.mapper.model.AdminUser;


public interface IUserService {

	AdminUser selectUserById(Integer id);

	List<AdminUser> selectByUser();

	AdminUser selectUserByUserName(String userName);
}
