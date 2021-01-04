package com.itheima.mm.wx.dao;

import com.itheima.mm.pojo.Course;

import java.util.List;

/**
 * @description ：学科Dao
 */
public interface CourseDao {
	/**
	 * 获取学科列表
	 * @return
	 */
	List<Course> getCourseList();
}
