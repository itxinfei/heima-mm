package com.itheima.mm.dao;

import com.itheima.mm.pojo.Role;

import java.util.Set;

/**
 * @description ：角色Dao
 */
public interface RoleDao {
	/**
	 * 根据用户ID，获取角色列表
	 * @param userId
	 * @return
	 */
	Set<Role> selectRoleByUserId(Integer userId);
}
