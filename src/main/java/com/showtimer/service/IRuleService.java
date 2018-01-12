package com.showtimer.service;

import java.util.List;

import com.showtimer.domain.MenuRules;
import com.showtimer.mapper.model.AdminRule;

public interface IRuleService {

	MenuRules selectRuleList(Integer userId);
}
