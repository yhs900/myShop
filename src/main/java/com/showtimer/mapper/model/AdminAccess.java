package com.showtimer.mapper.model;

import java.io.Serializable;

/**
 * 权限关联 组别
 * @author Administrator
 *
 */
public class AdminAccess implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = -8448944956859915101L;
	private Integer user_id;//用户的ID
	private Integer group_id;//权限的组别ID
	
	
	@Override
	public String toString() {
		return "AdminAccess [user_id=" + user_id + ", group_id=" + group_id + "]";
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	
	
	

}
