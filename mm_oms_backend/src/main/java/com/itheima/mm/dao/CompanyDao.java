package com.itheima.mm.dao;

import com.itheima.mm.pojo.Company;

import java.util.List;
import java.util.Map;

/**
 * @description ：公司Dao
 */
public interface CompanyDao {

	/**
	 * 获取全部公司及行业方向列表
	 * 为试题输入提供源数据
	 * @return
	 */
	List<Company> selectListAll();

	/**
	 * 更新公司信息
	 * @param company
	 * @return
	 */
	Integer updateCompanyCity(Company company);

	/**
	 * 新增公司行业方向关系
	 * @param one
	 * @return
	 */
	Integer addCompanyIndustry(Map one);
	/**
	 * 基于公司ID，删除公司所属行业方向
	 * @param companyId
	 * @return
	 */
	Integer deleteCompanyIndustryByCompanyId(Integer companyId);

	/**
	 * 根据公司ID，获取公司相关信息
	 * @param id
	 * @return
	 */
	Company selectByIdForQuestion(Integer id);
}
