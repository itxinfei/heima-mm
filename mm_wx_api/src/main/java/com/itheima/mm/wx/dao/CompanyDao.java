package com.itheima.mm.wx.dao;

import java.util.List;
import java.util.Map;

/**
 * @description ：公司Dao
 */
public interface CompanyDao {
	/**
	 * 根据条件获取列表
	 * @param queryParams
	 * @return
	 */
	List<Map> selectCompanyListByQueryParam(Map<String, Object> queryParams);
}
