package com.showtimer.mapper;

import java.util.List;

import com.showtimer.mapper.model.AdminRule;

public interface RuleMapper {

	List<AdminRule> selectRuleList(List<Integer> ids,Integer status);
}
