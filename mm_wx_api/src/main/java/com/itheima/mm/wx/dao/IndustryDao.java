package com.itheima.mm.wx.dao;

import java.util.List;
import java.util.Map;

/**
 * @description ：企业方向Dao
 */
public interface IndustryDao {
	/**
	 * 根据条件获取列表
	 * @param queryParams
	 * @return
	 */
	List<Map> selectIndustryListByQueryParam(Map<String, Object> queryParams);
}
