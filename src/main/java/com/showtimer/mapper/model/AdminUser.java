package com.showtimer.mapper.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
 * @author Administrator
 *
 */
public class AdminUser implements Serializable{

	/**
	 * 
	 */
	
	  
	private static final long serialVersionUID = -6986267495916308361L;
	private Integer id;//用户自增ID
	private String username;//管理后台账号
	private String password;//管理后台密码
	private String remark;//用户备注
	private String create_time;//创建时间
	private String realname;//真实姓名
	private Integer structure_id;//部门id
	private Integer post_id;//岗位ID
	private Integer status;//状态,1启用0禁用
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", remark=" + remark
				+ ", create_time=" + create_time + ", realname=" + realname + ", structure_id=" + structure_id
				+ ", post_id=" + post_id + ", status=" + status + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Integer getStructure_id() {
		return structure_id;
	}
	public void setStructure_id(Integer structure_id) {
		this.structure_id = structure_id;
	}
	public Integer getPost_id() {
		return post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
	
	
	
}
