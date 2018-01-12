package com.showtimer.mapper.model;

import java.io.Serializable;

/**
 * 规则表
 * @author Administrator
 *
 */
public class AdminRule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7227363665889018954L;
	private Integer id;//主键ID
	private String title;//名称
	private String name;//定义名称
	private Integer level;//级别。1模块,2控制器,3操作
	private Integer pid;//父id，默认0
	private Integer status;//状态，1启用，0禁用
	
	
	@Override
	public String toString() {
		return "AdminRule [id=" + id + ", title=" + title + ", name=" + name + ", level=" + level + ", pid=" + pid
				+ ", status=" + status + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
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
