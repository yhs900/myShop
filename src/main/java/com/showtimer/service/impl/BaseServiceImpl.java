package com.showtimer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showtimer.domain.FSystemConfig;
import com.showtimer.domain.Groups;
import com.showtimer.mapper.BaseMapper;
import com.showtimer.mapper.model.SystemConfig;
import com.showtimer.service.IBaseService;

@Transactional
@Service
public class BaseServiceImpl implements IBaseService {

	@Autowired
	private BaseMapper baseMapper;

	/**
	 * 获取到系统的配置
	 */
	@Override
	public List<SystemConfig> selectSystemConfig() {
		return baseMapper.selectSystemConfig();
	}

	/**
	 * 查询规则信息
	 */
	@Override
	public Groups selectGroups(Integer userId) {
		return baseMapper.selectGroups(userId);
	}
}
