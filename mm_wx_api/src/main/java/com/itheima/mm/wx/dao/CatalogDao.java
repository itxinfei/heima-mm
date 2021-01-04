package com.itheima.mm.wx.dao;

import java.util.List;
import java.util.Map;

/**
 * @description ：学科目录Dao
 */
public interface CatalogDao {
	/**
	 * 根据条件获取列表
	 * @param queryParams
	 * @return
	 */
	List<Map> selectCatalogListByQueryParam(Map<String, Object> queryParams);
}
