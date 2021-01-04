package com.itheima.mm.dao;

import com.itheima.mm.pojo.ReviewLog;

/**
 * @description ：审核日志Dao
 */
public interface ReviewLogDao {
	/**
	 * 获取题目最后一条审核记录
	 * @param questionId
	 * @return
	 */
	ReviewLog selectLastByQuestionId(Integer questionId);

	/**
	 * 添加审核记录
	 * @param reviewLog
	 */
	void add(ReviewLog reviewLog);
}
