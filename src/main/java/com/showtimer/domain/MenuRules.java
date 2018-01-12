package com.showtimer.domain;

import java.util.List;

import com.showtimer.mapper.model.AdminMenu;
import com.showtimer.mapper.model.AdminRule;

public class MenuRules {

	private List<AdminRule> adminRules;
	
	private List<AdminMenu> adminMenus;

	public List<AdminRule> getAdminRules() {
		return adminRules;
	}

	public void setAdminRules(List<AdminRule> adminRules) {
		this.adminRules = adminRules;
	}

	public List<AdminMenu> getAdminMenus() {
		return adminMenus;
	}

	public void setAdminMenus(List<AdminMenu> adminMenus) {
		this.adminMenus = adminMenus;
	}
	
	
}
