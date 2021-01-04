package com.itheima.mm.dao;

import com.itheima.mm.pojo.Permission;

import java.util.Set;

/**
 * @description ：权限Dao
 */
public interface PermissionDao {
	/**
	 * 根据角色ID，获取权限列表
	 * @param roleId
	 * @return
	 */
	Set<Permission> selectPermissionByRoleId(Integer roleId);
}
