package com.showtimer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.showtimer.mapper.model.AdminMenu;

public interface MenuMapper {

	List<AdminMenu> selectMenuList(Integer status);

	List<AdminMenu> selectMenuListByRuleIds(@Param("ids")List<Integer> ids, @Param("status")int status);

}
