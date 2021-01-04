package com.itheima.mm.database;

/**
 * @description ：数据库异常父类
 */
public class MmDaoException extends RuntimeException {
	public MmDaoException(String message){
		super(message);
	}
}
