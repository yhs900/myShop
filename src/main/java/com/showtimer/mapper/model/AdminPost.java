package com.showtimer.mapper.model;

import java.io.Serializable;

/**
 * 岗位表
 * @author Administrator
 *
 */
public class AdminPost implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1521175086131661706L;
	private Integer id;//主键ID
	private String name;//岗位名称
	private String remark;//岗位备注
	private String create_time;//数据创建时间
	private Integer status;//状态1启用,0禁用
	
	
	@Override
	public String toString() {
		return "AdminPost [id=" + id + ", name=" + name + ", remark=" + remark + ", create_time=" + create_time
				+ ", status=" + status + "]";
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
