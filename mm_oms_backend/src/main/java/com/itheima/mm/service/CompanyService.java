package com.itheima.mm.service;

import com.itheima.mm.pojo.Company;

import java.util.List;

/**
 * @description ：公司业务接口
 */
public interface CompanyService {
	/**
	 * 获取全部公司列表
	 * 包含城市、方向列表
	 * @return
	 */
	List<Company> findListAll();
}
