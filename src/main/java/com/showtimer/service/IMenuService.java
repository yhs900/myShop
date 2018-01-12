package com.showtimer.service;

import java.util.List;

import com.showtimer.mapper.model.AdminMenu;

public interface IMenuService {

	List<AdminMenu> selectMenuList(Integer status);

	List<AdminMenu> selectMenuListByRuleIds(List<Integer> ids, int status);
}
