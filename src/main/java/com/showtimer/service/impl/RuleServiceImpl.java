package com.showtimer.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showtimer.domain.Groups;
import com.showtimer.domain.MenuRules;
import com.showtimer.mapper.RuleMapper;
import com.showtimer.mapper.model.AdminMenu;
import com.showtimer.mapper.model.AdminRule;
import com.showtimer.service.IBaseService;
import com.showtimer.service.IMenuService;
import com.showtimer.service.IRuleService;
import com.showtimer.util.StringUtil;

@Service
@Transactional
public class RuleServiceImpl implements IRuleService{
	
	@Autowired
	private RuleMapper ruleMapper;
	
	@Autowired
	private IBaseService iBaseService;
	
	@Autowired
	private IMenuService iMenuService;

	/**
	 * 查询到用户的规则数据
	 */
	@Override
	public MenuRules selectRuleList(Integer userId) {
		
		MenuRules menuRules = new MenuRules();
		//先查询到组别ID
		Groups groups = iBaseService.selectGroups(userId);
		if (groups != null) {
			List<Integer> ids = Arrays.asList(StringUtil.stringToInteger(groups.getRules().split(",")));
			List<AdminRule> adminRules = ruleMapper.selectRuleList(ids, 1);
			if (StringUtil.isNotEmpty(adminRules)) {
				menuRules.setAdminRules(adminRules);
			}
			//获取菜单的信息
			List<AdminMenu> adminMenus = iMenuService.selectMenuListByRuleIds(ids, 1);
			if (StringUtil.isNotEmpty(adminMenus)) {
				menuRules.setAdminMenus(adminMenus);
			}
		}
		return menuRules;
	}

}
