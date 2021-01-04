package com.itheima.mm.service;

import com.itheima.mm.pojo.ReviewLog;

/**
 * @description ：审核业务类接口
 */
public interface ReviewLogService {
	/**
	 * 添加审核记录
	 * @param reviewLog
	 */
	void addReviewLog(ReviewLog reviewLog);
}
