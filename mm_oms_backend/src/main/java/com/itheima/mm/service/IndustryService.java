package com.itheima.mm.service;

import com.itheima.mm.pojo.Industry;

import java.util.List;

/**
 * @description ：企业行业方向业务接口
 */
public interface IndustryService {
	/**
	 * 获取所有的行业方向数据
	 * @return
	 */
	List<Industry> findListAll();
}
