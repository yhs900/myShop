package com.showtimer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showtimer.mapper.MenuMapper;
import com.showtimer.mapper.model.AdminMenu;
import com.showtimer.service.IMenuService;

@Service
@Transactional
public class MenuServiceImpl implements IMenuService{

	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 查询所有的菜单信息
	 */
	@Override
	public List<AdminMenu> selectMenuList(Integer status) {
		return menuMapper.selectMenuList(status);
	}

	/**
	 * 通过规则ID去查询菜单信息
	 */
	@Override
	public List<AdminMenu> selectMenuListByRuleIds(List<Integer> ids, int status) {
		return menuMapper.selectMenuListByRuleIds(ids,status);
	}

}
