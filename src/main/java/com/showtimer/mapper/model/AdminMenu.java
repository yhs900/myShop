package com.showtimer.mapper.model;

import java.io.Serializable;


/**
 * 菜单对象
 * @author Administrator
 *
 */
public class AdminMenu implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1419685904663620499L;
	private Integer id;//菜单ID
	private Integer pid;//上级菜单ID
	private String title;//菜单名称
	private String url;//链接地址
	private String icon;//图标
	private Integer menu_type;//菜单类型
	private Integer sort;//排序（同级有效）
	private Integer status;//状态
	private Integer rule_id;//权限id
	private String module;//模块
	private String menu;//三级菜单吗
	
	
	@Override
	public String toString() {
		return "AdminMenu [id=" + id + ", pid=" + pid + ", title=" + title + ", url=" + url + ", icon=" + icon
				+ ", menu_type=" + menu_type + ", sort=" + sort + ", status=" + status + ", rule_id=" + rule_id
				+ ", module=" + module + ", menu=" + menu + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getMenu_type() {
		return menu_type;
	}
	public void setMenu_type(Integer menu_type) {
		this.menu_type = menu_type;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getRule_id() {
		return rule_id;
	}
	public void setRule_id(Integer rule_id) {
		this.rule_id = rule_id;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
	
	  
}
