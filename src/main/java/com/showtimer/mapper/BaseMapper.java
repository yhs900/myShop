package com.showtimer.mapper;

import java.util.List;

import com.showtimer.domain.Groups;
import com.showtimer.mapper.model.SystemConfig;

public interface BaseMapper {

	List<SystemConfig>  selectSystemConfig();
	
	Groups selectGroups(Integer userId);
	
}
