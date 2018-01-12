package com.showtimer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.showtimer.mapper.model.SystemConfig;
import com.showtimer.result.JsonResult;
import com.showtimer.result.ResultCode;
import com.showtimer.service.IBaseService;
import com.showtimer.util.StringUtil;

import io.swagger.annotations.ApiOperation;

@RequestMapping("base")
@RestController
public class BaseController {

	@Autowired
	private IBaseService iBaseService;
	
	/**
	 * 获取系统配置的信息
	 * @return
	 */
	@RequestMapping(value="getConfigs")
	@ApiOperation(value="获取系统的配置信息")
	public JsonResult getConfigs()
	{
		List<SystemConfig> systemConfig = iBaseService.selectSystemConfig();
		if (StringUtil.isEmpty(systemConfig)) {
			return JsonResult.createFronResponse(ResultCode.FAILED, "查询失败");
		}
		Map<String, Object> map = new HashMap<>();
		for (SystemConfig systemConfig2 : systemConfig) {
			map.put(systemConfig2.getName(), systemConfig2.getValue());
		}
		
		return JsonResult.createFronResponse(ResultCode.SUCCESS, "获取成功", map);
	}
}
