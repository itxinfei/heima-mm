package com.itheima.mm.dao;

import com.itheima.mm.pojo.QuestionItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description ：选项Dao接口
 */
public interface QuestionItemDao {

	/**
	 * 添加选项
	 * @param questionItem
	 */
	Integer addQuestionItem(QuestionItem questionItem);

	/**
	 * 更新选项
	 * @param questionItem
	 */
	Integer updateQuestionItem(QuestionItem questionItem);

	/**
	 * 基于题目ID，获取题干列表
	 * @param id
	 * @return
	 */
	List<QuestionItem> selectListByQuestionId(Integer id);

}
