package com.itheima.mm.dao;

import com.itheima.mm.pojo.User;

/**
 * @description ：用户Dao
 */
public interface UserDao {
	/**
	 * 根据用户获取用户信息
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
}