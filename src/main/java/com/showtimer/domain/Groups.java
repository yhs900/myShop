package com.showtimer.domain;

import java.io.Serializable;

public class Groups implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2646011987942794676L;
	private Integer id;
	private String title;
	private String rules;//规格的所有ID
	private Integer pid;//父ID
	private String remark;//备注
	private Integer status;//状态
	private Integer pivot__user_id;//用户ID
	private Integer pivot__group_id;//组别ID
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
	public Integer getPivot__user_id() {
		return pivot__user_id;
	}
	public void setPivot__user_id(Integer pivot__user_id) {
		this.pivot__user_id = pivot__user_id;
	}
	public Integer getPivot__group_id() {
		return pivot__group_id;
	}
	public void setPivot__group_id(Integer pivot__group_id) {
		this.pivot__group_id = pivot__group_id;
	}
	
	
	
}
