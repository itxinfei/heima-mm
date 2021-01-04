package com.itheima.mm.wx.dao;

import java.util.List;
import java.util.Map;

/**
 * @description ：题目Dao接口
 */
public interface QuestionDao {
	/**
	 * 根据查询条件，获取题目列表
	 * 根据分类类型 1-按学科目录 2-按企业 3-按行业方向
	 * @param queryParams
	 * @return
	 */
	List<Map> selectQuestionListByQueryParam(Map<String, Object> queryParams);

	/**
	 * 提交用户做题结果
	 * @param paramsMap
	 */
	Integer addMemberQuestion(Map<String,Object> paramsMap);

	/**
	 * 提交用户做题结果
	 * @param paramsMap
	 */
	Integer upateMemberQuestion(Map<String,Object> paramsMap);
}
