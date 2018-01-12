package com.showtimer.mapper.model;

import java.io.Serializable;

/**
 * 权限分组
 * @author Administrator
 *
 */
public class AdminGroup implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5463020922450887145L;
	private Integer id;
	private String title;//分组名称，如普通会员
	private String rules;//存储的是 菜单的ID
	private Integer pid;//父级ID
	private String remark;//备注
	private Integer status;//状态
	
	
	@Override
	public String toString() {
		return "AdminGroup [id=" + id + ", title=" + title + ", rules=" + rules + ", pid=" + pid + ", remark=" + remark
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
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}

