package com.showtimer.service;

import java.util.List;

import com.showtimer.domain.Groups;
import com.showtimer.mapper.model.SystemConfig;

public interface IBaseService {

	List<SystemConfig> selectSystemConfig();
	
	Groups selectGroups(Integer userId);

}
