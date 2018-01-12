package com.showtimer.mapper.model;

import java.io.Serializable;

/**
 * 部门表
 * @author Administrator
 *
 */
public class AdminStructure implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5585907955280012289L;
	private Integer id;
	private String name;//部门名称
	private Integer pid;//父id
	private Integer status;//状态
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
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
