package com.itheima.mm.database;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * @description ：Druid数据源工厂
 */
public class DruidDataSourceFactory extends PooledDataSourceFactory {
	public DruidDataSourceFactory(){
		this.dataSource = new DruidDataSource();
	}
}
