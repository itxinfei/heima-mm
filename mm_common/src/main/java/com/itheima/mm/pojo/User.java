package com.itheima.mm.pojo;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @description : 用户POJO类
 * 扩展字段为非数据库表对应字段
 */
@Data
public class User {
  private Integer id;
  private String username;
  private String password;
  private Integer state;
  private String email;
  private String source;
  private String createDate;
  private String remark;
  // 扩展字段
  private List<String> authorityList;
}
