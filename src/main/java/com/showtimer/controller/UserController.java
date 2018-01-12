package com.showtimer.controller;

import static org.mockito.Mockito.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showtimer.domain.MenuRules;
import com.showtimer.mapper.model.AdminMenu;
import com.showtimer.mapper.model.AdminRule;
import com.showtimer.mapper.model.AdminUser;
import com.showtimer.result.JsonResult;
import com.showtimer.result.ResultCode;
import com.showtimer.service.IMenuService;
import com.showtimer.service.IRuleService;
import com.showtimer.service.IUserService;
import com.showtimer.util.MD5Util;
/**
 * 用户控制器
 * @author Administrator
 *
 */
import com.showtimer.util.StringUtil;


@RestController
@RequestMapping("user")
@EnableScheduling
public class UserController {

	@Autowired
	private IUserService iUserService;
	
	@Autowired
	private IMenuService iMenuService;
	
	@Autowired
	private IRuleService iRuleService;
	
	@RequestMapping("selectByUser")
	public JsonResult selectByUser()
	{
		List<AdminUser> users = iUserService.selectByUser();
		if (users == null) {
			return new JsonResult(ResultCode.FAILED,"查询失败");
		}
		return new JsonResult(ResultCode.SUCCESS,"查询成功",users);
	}
	
	@RequestMapping("login")
	public JsonResult login(String userName,String password,HttpServletRequest request,HttpServletResponse response)
	{
		if (StringUtil.isEmpty(userName)) {
			return JsonResult.createFronResponse(ResultCode.FAILED, "用户名不能为空");
		}
		
		if (StringUtil.isEmpty(password)) {
			return JsonResult.createFronResponse(ResultCode.FAILED, "密码不能为空");
		}
		//查询账号在不在
		AdminUser userinfo = iUserService.selectUserByUserName(userName);
		if (userinfo == null) {
			return JsonResult.createFronResponse(ResultCode.FAILED, "账号不存在");
		}
		String pass = "d93a5def7511da3d0f2d171d9c344e91";
		
		//判断密码
		if (!StringUtil.equals(pass, userinfo.getPassword())) {
			//密码错误
			return JsonResult.createFronResponse(ResultCode.FAILED, "密码错误");
		}
		//判断账号是否被禁用
		if (StringUtil.equals(userinfo.getStatus().toString(), "0")) {
			return JsonResult.createFronResponse(ResultCode.FAILED, "帐号已被禁用");
		}
		//获取权限 菜单
		//判断是那个账号进来，如果是admin，就获取到所有的菜单数据
		List<AdminMenu> menus = new ArrayList<>();
		MenuRules menuRules = new MenuRules();
		
		if (userinfo.getId() == 1) {
			menus = iMenuService.selectMenuList(1);
			menuRules.setAdminMenus(menus);
		}else{
			//如果不是admin，则要查询规则信息
			menuRules = iRuleService.selectRuleList(userinfo.getId());
			//根据规则查询菜单信息
			menus = menuRules.getAdminMenus();
			if (StringUtil.isNotEmpty(menuRules.getAdminRules())) {
				List<String> ruleList = StringUtil.roundByFindRules(menuRules.getAdminRules());
			}
			
		}
		//存储在session中
		request.getSession().setAttribute("userinfo", userinfo);
		
		//获取到sessionID
		String sessionId = request.getSession().getId();
		//制作验证token
		String usertoken = userinfo.getUsername() + userinfo.getPassword() + sessionId;
		//getByte转换成byte数组
		String token = MD5Util.bytesToHex(usertoken.getBytes());
		//封装成一个map返回去
		Map<String, Object> map = new HashMap<>();
		map.put("authKey", token);
		map.put("userInfo", userinfo);
		map.put("sessionId", sessionId);
		map.put("authList", menuRules.getAdminRules());
		map.put("menusList", menuRules.getAdminMenus());
		
		return JsonResult.createFronResponse(ResultCode.SUCCESS, "查询成功", map);
	}

	
	
	
	
}
