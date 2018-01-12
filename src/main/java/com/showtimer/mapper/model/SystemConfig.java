package com.showtimer.mapper.model;

import java.io.Serializable;

public class SystemConfig implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5444551857919840740L;
	private Integer id;//主键ID
	private String name;
	private String value;//配置值
	private String group;// 配置分组
	private String need_auth;// 1需要登录后才能获取，0不需要登录即可获取
	
	
	@Override
	public String toString() {
		return "RSystemConfig [id=" + id + ", name=" + name + ", value=" + value + ", group=" + group + ", need_auth="
				+ need_auth + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getNeed_auth() {
		return need_auth;
	}
	public void setNeed_auth(String need_auth) {
		this.need_auth = need_auth;
	}
	
	

}
