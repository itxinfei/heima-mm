package com.itheima.mm.service;

import com.itheima.mm.pojo.Dict;

import java.util.List;

/**
 * @description ：数据字典业务接口
 */
public interface DictService {
	List<Dict> selectListByType(Integer typeId);
}
